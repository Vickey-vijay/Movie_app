package yads;

import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BaseDataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.HttpUtil;
import com.google.common.collect.ImmutableMap;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sd0 extends BaseDataSource implements HttpDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f82602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HttpDataSource.RequestProperties f82603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HttpDataSource.RequestProperties f82604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m5.m f82605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f82606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DataSpec f82607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HttpURLConnection f82608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InputStream f82609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f82610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f82611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f82612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f82613p;

    public sd0(String str, int i10, int i11, boolean z10, boolean z11, HttpDataSource.RequestProperties requestProperties) {
        super(true);
        this.f82602e = str;
        this.f82600c = i10;
        this.f82601d = i11;
        this.f82598a = z10;
        this.f82599b = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f82603f = requestProperties;
        this.f82605h = null;
        this.f82604g = new HttpDataSource.RequestProperties();
        this.f82606i = false;
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f82608k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        try {
            InputStream inputStream = this.f82609l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource.HttpDataSourceException(e10, (DataSpec) Util.castNonNull(this.f82607j), 2000, 3);
                }
            }
            this.f82609l = null;
            a();
            if (this.f82610m) {
                this.f82610m = false;
                transferEnded();
            }
            this.f82608k = null;
            this.f82607j = null;
        } catch (Throwable th2) {
            this.f82609l = null;
            a();
            if (this.f82610m) {
                this.f82610m = false;
                transferEnded();
            }
            this.f82608k = null;
            this.f82607j = null;
            throw th2;
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i10, int i11) throws HttpDataSource.HttpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f82612o;
            if (j10 != -1) {
                long j11 = j10 - this.f82613p;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            int i12 = ((InputStream) Util.castNonNull(this.f82609l)).read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.f82613p += (long) i12;
            bytesTransferred(i12);
            return i12;
        } catch (IOException e10) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e10, (DataSpec) Util.castNonNull(this.f82607j), 2);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public final void clearAllRequestProperties() {
        this.f82604g.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public final int getResponseCode() {
        int i10;
        if (this.f82608k == null || (i10 = this.f82611n) <= 0) {
            return -1;
        }
        return i10;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f82608k;
        return httpURLConnection == null ? ImmutableMap.of() : new qd0(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f82608k;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        DataSpec dataSpec = this.f82607j;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] bArrB;
        this.f82607j = dataSpec;
        long j10 = 0;
        this.f82613p = 0L;
        this.f82612o = 0L;
        transferInitializing(dataSpec);
        try {
            HttpURLConnection httpURLConnectionA = a(dataSpec);
            this.f82608k = httpURLConnectionA;
            this.f82611n = httpURLConnectionA.getResponseCode();
            String responseMessage = httpURLConnectionA.getResponseMessage();
            int i10 = this.f82611n;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                if (this.f82611n == 416) {
                    if (dataSpec.position == HttpUtil.getDocumentSize(httpURLConnectionA.getHeaderField("Content-Range"))) {
                        this.f82610m = true;
                        transferStarted(dataSpec);
                        long j11 = dataSpec.length;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionA.getErrorStream();
                try {
                    bArrB = errorStream != null ? n5.a.b(errorStream) : Util.EMPTY_BYTE_ARRAY;
                } catch (IOException unused) {
                    bArrB = Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr = bArrB;
                a();
                throw new HttpDataSource.InvalidResponseCodeException(this.f82611n, responseMessage, this.f82611n == 416 ? new DataSourceException(2008) : null, headerFields, dataSpec, bArr);
            }
            String contentType = httpURLConnectionA.getContentType();
            m5.m mVar = this.f82605h;
            if (mVar != null && !mVar.apply(contentType)) {
                a();
                throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
            }
            if (this.f82611n == 200) {
                long j12 = dataSpec.position;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionA.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                this.f82612o = dataSpec.length;
            } else {
                long j13 = dataSpec.length;
                if (j13 != -1) {
                    this.f82612o = j13;
                } else {
                    long contentLength = HttpUtil.getContentLength(httpURLConnectionA.getHeaderField("Content-Length"), httpURLConnectionA.getHeaderField("Content-Range"));
                    this.f82612o = contentLength != -1 ? contentLength - j10 : -1L;
                }
            }
            try {
                this.f82609l = httpURLConnectionA.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f82609l = new GZIPInputStream(this.f82609l);
                }
                this.f82610m = true;
                transferStarted(dataSpec);
                try {
                    a(j10, dataSpec);
                    return this.f82612o;
                } catch (IOException e10) {
                    a();
                    if (e10 instanceof HttpDataSource.HttpDataSourceException) {
                        throw ((HttpDataSource.HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource.HttpDataSourceException(e10, dataSpec, 2000, 1);
                }
            } catch (IOException e11) {
                a();
                throw new HttpDataSource.HttpDataSourceException(e11, dataSpec, 2000, 1);
            }
        } catch (IOException e12) {
            a();
            throw HttpDataSource.HttpDataSourceException.createForIOException(e12, dataSpec, 1);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public final void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.f82604g.remove(str);
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public final void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.f82604g.set(str, str2);
    }

    public final URL a(URL url, String str, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new HttpDataSource.HttpDataSourceException("Unsupported protocol redirect: " + protocol, dataSpec, 2001, 1);
                }
                if (this.f82598a || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                if (this.f82599b) {
                    try {
                        return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                    } catch (MalformedURLException e10) {
                        throw new HttpDataSource.HttpDataSourceException(e10, dataSpec, 2001, 1);
                    }
                }
                throw new HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", dataSpec, 2001, 1);
            } catch (MalformedURLException e11) {
                throw new HttpDataSource.HttpDataSourceException(e11, dataSpec, 2001, 1);
            }
        }
        throw new HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, 2001, 1);
    }

    public final HttpURLConnection a(DataSpec dataSpec) throws IOException {
        URL url = new URL(dataSpec.uri.toString());
        int i10 = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j10 = dataSpec.position;
        long j11 = dataSpec.length;
        boolean zIsFlagSet = dataSpec.isFlagSet(1);
        if (!this.f82598a && !this.f82599b && !this.f82606i) {
            return a(url, i10, bArr, j10, j11, zIsFlagSet, true, dataSpec.httpRequestHeaders);
        }
        int i11 = 0;
        URL urlA = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 <= 20) {
                long j12 = j10;
                long j13 = j10;
                int i14 = i12;
                URL url2 = urlA;
                long j14 = j11;
                HttpURLConnection httpURLConnectionA = a(urlA, i12, bArr2, j12, j11, zIsFlagSet, false, dataSpec.httpRequestHeaders);
                int responseCode = httpURLConnectionA.getResponseCode();
                String headerField = httpURLConnectionA.getHeaderField("Location");
                if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionA.disconnect();
                    urlA = a(url2, headerField, dataSpec);
                    i12 = i14;
                } else {
                    if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        return httpURLConnectionA;
                    }
                    httpURLConnectionA.disconnect();
                    if (this.f82606i && responseCode == 302) {
                        i12 = i14;
                    } else {
                        bArr2 = null;
                        i12 = 1;
                    }
                    urlA = a(url2, headerField, dataSpec);
                }
                i11 = i13;
                j10 = j13;
                j11 = j14;
            } else {
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException(mg2.a("Too many redirects: ", i13)), dataSpec, 2001, 1);
            }
        }
    }

    public final HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = ((ju2) this).f79195q;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        httpURLConnection.setConnectTimeout(this.f82600c);
        httpURLConnection.setReadTimeout(this.f82601d);
        HashMap map2 = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.f82603f;
        if (requestProperties != null) {
            map2.putAll(requestProperties.getSnapshot());
        }
        map2.putAll(this.f82604g.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j10, j11);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, strBuildRangeRequestHeader);
        }
        String str = this.f82602e;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(DataSpec.getStringForHttpMethod(i10));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void a(long j10, DataSpec dataSpec) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) Util.castNonNull(this.f82609l)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (i10 != -1) {
                j10 -= (long) i10;
                bytesTransferred(i10);
            } else {
                throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
        }
    }
}
