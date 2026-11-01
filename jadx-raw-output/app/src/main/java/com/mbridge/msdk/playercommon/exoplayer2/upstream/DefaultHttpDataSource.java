package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultHttpDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesSkipped;
    private long bytesToRead;
    private long bytesToSkip;
    private final int connectTimeoutMillis;
    private HttpsURLConnection connection;
    private final Predicate<String> contentTypePredicate;
    private DataSpec dataSpec;
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private InputStream inputStream;
    private final TransferListener<? super DefaultHttpDataSource> listener;
    private boolean opened;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private final String userAgent;
    private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> skipBufferReference = new AtomicReference<>();

    public DefaultHttpDataSource(String str, Predicate<String> predicate) {
        this(str, predicate, null);
    }

    private HttpsURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        URL url = new URL(dataSpec.uri.toString());
        byte[] bArr = dataSpec.postBody;
        long j10 = dataSpec.position;
        long j11 = dataSpec.length;
        boolean zIsFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects) {
            return makeConnection(url, bArr, j10, j11, zIsFlagSet, true);
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new NoRouteToHostException("Too many redirects: " + i11);
            }
            long j12 = j10;
            HttpsURLConnection httpsURLConnectionMakeConnection = makeConnection(url, bArr, j10, j11, zIsFlagSet, false);
            int iHttpUrlConnectionGetResponseCode = MintegralNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnectionMakeConnection);
            if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && (bArr != null || (iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308))) {
                return httpsURLConnectionMakeConnection;
            }
            bArr = null;
            String headerField = httpsURLConnectionMakeConnection.getHeaderField("Location");
            MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnectionMakeConnection);
            url = handleRedirect(url, headerField);
            i10 = i11;
            j10 = j12;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            if (this.inputStream != null) {
                maybeTerminateInputStream(this.connection, bytesRemaining());
                try {
                    this.inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource.HttpDataSourceException(e10, this.dataSpec, 3);
                }
            }
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
                if (transferListener != null) {
                    transferListener.onTransferEnd(this);
                }
            }
        } catch (Throwable th2) {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                TransferListener<? super DefaultHttpDataSource> transferListener2 = this.listener;
                if (transferListener2 != null) {
                    transferListener2.onTransferEnd(this);
                }
            }
            throw th2;
        }
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener) {
        this(str, predicate, transferListener, 8000, 8000);
    }

    private void closeConnectionQuietly() {
        HttpsURLConnection httpsURLConnection = this.connection;
        if (httpsURLConnection != null) {
            try {
                MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection);
            } catch (Exception e10) {
                Log.e(TAG, "Unexpected error while disconnecting", e10);
            }
            this.connection = null;
        }
    }

    private static long getContentLength(HttpsURLConnection httpsURLConnection) {
        long j10;
        String headerField = httpsURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(TAG, "Unexpected Content-Length [" + headerField + C3426d4.j.f28588e);
                j10 = -1;
            }
        }
        String headerField2 = httpsURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j10;
        }
        Matcher matcher = CONTENT_RANGE_HEADER.matcher(headerField2);
        if (!matcher.find()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            Log.w(TAG, "Inconsistent headers [" + headerField + "] [" + headerField2 + C3426d4.j.f28588e);
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            Log.e(TAG, "Unexpected Content-Range [" + headerField2 + C3426d4.j.f28588e);
            return j10;
        }
    }

    private static URL handleRedirect(URL url, String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException("Unsupported protocol redirect: " + protocol);
    }

    private static void maybeTerminateInputStream(HttpsURLConnection httpsURLConnection, long j10) {
        int i10 = Util.SDK_INT;
        if (i10 == 19 || i10 == 20) {
            try {
                InputStream inputStreamUrlConnectionGetInputStream = MintegralNetworkBridge.urlConnectionGetInputStream(httpsURLConnection);
                if (j10 == -1) {
                    if (inputStreamUrlConnectionGetInputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStreamUrlConnectionGetInputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStreamUrlConnectionGetInputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStreamUrlConnectionGetInputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private int readInternal(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.bytesToRead;
        if (j10 != -1) {
            long j11 = j10 - this.bytesRead;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = this.inputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.bytesToRead == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.bytesRead += (long) i12;
        TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
        if (transferListener != null) {
            transferListener.onBytesTransferred(this, i12);
        }
        return i12;
    }

    private void skipInternal() throws IOException {
        if (this.bytesSkipped == this.bytesToSkip) {
            return;
        }
        byte[] andSet = skipBufferReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.bytesSkipped;
            long j11 = this.bytesToSkip;
            if (j10 == j11) {
                skipBufferReference.set(andSet);
                return;
            }
            int i10 = this.inputStream.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            this.bytesSkipped += (long) i10;
            TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
            if (transferListener != null) {
                transferListener.onBytesTransferred(this, i10);
            }
        }
    }

    public final long bytesRead() {
        return this.bytesRead;
    }

    public final long bytesRemaining() {
        long j10 = this.bytesToRead;
        return j10 == -1 ? j10 : j10 - this.bytesRead;
    }

    public final long bytesSkipped() {
        return this.bytesSkipped;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    public final HttpsURLConnection getConnection() {
        return this.connection;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public Map<String, List<String>> getResponseHeaders() {
        HttpsURLConnection httpsURLConnection = this.connection;
        if (httpsURLConnection == null) {
            return null;
        }
        return httpsURLConnection.getHeaderFields();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public Uri getUri() {
        HttpsURLConnection httpsURLConnection = this.connection;
        if (httpsURLConnection == null) {
            return null;
        }
        return Uri.parse(httpsURLConnection.getURL().toString());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        this.dataSpec = dataSpec;
        long j10 = 0;
        this.bytesRead = 0L;
        this.bytesSkipped = 0L;
        try {
            HttpsURLConnection httpsURLConnectionMakeConnection = makeConnection(dataSpec);
            this.connection = httpsURLConnectionMakeConnection;
            try {
                int iHttpUrlConnectionGetResponseCode = MintegralNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnectionMakeConnection);
                if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode > 299) {
                    Map<String, List<String>> headerFields = this.connection.getHeaderFields();
                    closeConnectionQuietly();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(iHttpUrlConnectionGetResponseCode, headerFields, dataSpec);
                    if (iHttpUrlConnectionGetResponseCode != 416) {
                        throw invalidResponseCodeException;
                    }
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                    throw invalidResponseCodeException;
                }
                String contentType = this.connection.getContentType();
                Predicate<String> predicate = this.contentTypePredicate;
                if (predicate != null && !predicate.evaluate(contentType)) {
                    closeConnectionQuietly();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
                }
                if (iHttpUrlConnectionGetResponseCode == 200) {
                    long j11 = dataSpec.position;
                    if (j11 != 0) {
                        j10 = j11;
                    }
                }
                this.bytesToSkip = j10;
                if (dataSpec.isFlagSet(1)) {
                    this.bytesToRead = dataSpec.length;
                } else {
                    long j12 = dataSpec.length;
                    if (j12 != -1) {
                        this.bytesToRead = j12;
                    } else {
                        long contentLength = getContentLength(this.connection);
                        this.bytesToRead = contentLength != -1 ? contentLength - this.bytesToSkip : -1L;
                    }
                }
                try {
                    this.inputStream = MintegralNetworkBridge.urlConnectionGetInputStream(this.connection);
                    this.opened = true;
                    TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
                    if (transferListener != null) {
                        transferListener.onTransferStart(this, dataSpec);
                    }
                    return this.bytesToRead;
                } catch (IOException e10) {
                    closeConnectionQuietly();
                    throw new HttpDataSource.HttpDataSourceException(e10, dataSpec, 1);
                }
            } catch (IOException e11) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + dataSpec.uri.toString(), e11, dataSpec, 1);
            }
        } catch (IOException e12) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + dataSpec.uri.toString(), e12, dataSpec, 1);
        }
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener, int i10, int i11) {
        this(str, predicate, transferListener, i10, i11, false, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource.HttpDataSourceException {
        try {
            skipInternal();
            return readInternal(bArr, i10, i11);
        } catch (IOException e10) {
            throw new HttpDataSource.HttpDataSourceException(e10, this.dataSpec, 2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener, int i10, int i11, boolean z10, HttpDataSource.RequestProperties requestProperties) {
        this.userAgent = Assertions.checkNotEmpty(str);
        this.contentTypePredicate = predicate;
        this.listener = transferListener;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.connectTimeoutMillis = i10;
        this.readTimeoutMillis = i11;
        this.allowCrossProtocolRedirects = z10;
        this.defaultRequestProperties = requestProperties;
    }

    private HttpsURLConnection makeConnection(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(url));
        httpsURLConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpsURLConnection.setReadTimeout(this.readTimeoutMillis);
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            for (Map.Entry<String, String> entry : requestProperties.getSnapshot().entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.requestProperties.getSnapshot().entrySet()) {
            httpsURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = "bytes=" + j10 + "-";
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpsURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, str);
        }
        httpsURLConnection.setRequestProperty("User-Agent", this.userAgent);
        if (!z10) {
            httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpsURLConnection.setInstanceFollowRedirects(z11);
        httpsURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpsURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpsURLConnection.connect();
            } else {
                httpsURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpsURLConnection.connect();
                OutputStream outputStreamUrlConnectionGetOutputStream = MintegralNetworkBridge.urlConnectionGetOutputStream(httpsURLConnection);
                outputStreamUrlConnectionGetOutputStream.write(bArr);
                outputStreamUrlConnectionGetOutputStream.close();
            }
        } else {
            httpsURLConnection.connect();
        }
        return httpsURLConnection;
    }
}
