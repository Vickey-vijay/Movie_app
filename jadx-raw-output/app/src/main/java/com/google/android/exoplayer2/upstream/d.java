package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.download.Command;
import e5.h;
import g5.k0;
import g5.m;
import g5.v;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes11.dex */
public class d extends e5.d implements HttpDataSource {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f20169u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicReference<byte[]> f20170v = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final HttpDataSource.c f20175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HttpDataSource.c f20176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public v<String> f20177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public h f20178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public HttpURLConnection f20179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public InputStream f20180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f20184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f20185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20186t;

    public d(String str, int i10, int i11, boolean z10, @Nullable HttpDataSource.c cVar) {
        super(true);
        this.f20174h = g5.a.d(str);
        this.f20176j = new HttpDataSource.c();
        this.f20172f = i10;
        this.f20173g = i11;
        this.f20171e = z10;
        this.f20175i = cVar;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            if (this.f20180n != null) {
                n(this.f20179m, g());
                try {
                    this.f20180n.close();
                } catch (IOException e10) {
                    throw new HttpDataSource.HttpDataSourceException(e10, this.f20178l, 3);
                }
            }
            this.f20180n = null;
            h();
            if (this.f20181o) {
                this.f20181o = false;
                d();
            }
        } catch (Throwable th2) {
            this.f20180n = null;
            h();
            if (this.f20181o) {
                this.f20181o = false;
                d();
            }
            throw th2;
        }
    }

    public static long i(HttpURLConnection httpURLConnection) {
        long j10;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                m.c("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField + C3426d4.j.f28588e);
                j10 = -1;
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j10;
        }
        Matcher matcher = f20169u.matcher(headerField2);
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
            m.h("DefaultHttpDataSource", "Inconsistent headers [" + headerField + "] [" + headerField2 + C3426d4.j.f28588e);
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            m.c("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField2 + C3426d4.j.f28588e);
            return j10;
        }
    }

    public static URL j(URL url, String str) throws IOException {
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

    public static boolean k(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public static void n(HttpURLConnection httpURLConnection, long j10) {
        int i10 = k0.f53108a;
        if (i10 == 19 || i10 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws HttpDataSource.HttpDataSourceException {
        this.f20178l = hVar;
        long j10 = 0;
        this.f20186t = 0L;
        this.f20185s = 0L;
        e(hVar);
        try {
            HttpURLConnection httpURLConnectionL = l(hVar);
            this.f20179m = httpURLConnectionL;
            try {
                this.f20182p = httpURLConnectionL.getResponseCode();
                String responseMessage = this.f20179m.getResponseMessage();
                int i10 = this.f20182p;
                if (i10 < 200 || i10 > 299) {
                    Map<String, List<String>> headerFields = this.f20179m.getHeaderFields();
                    h();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.f20182p, responseMessage, headerFields, hVar);
                    if (this.f20182p != 416) {
                        throw invalidResponseCodeException;
                    }
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                    throw invalidResponseCodeException;
                }
                String contentType = this.f20179m.getContentType();
                v<String> vVar = this.f20177k;
                if (vVar != null && !vVar.evaluate(contentType)) {
                    h();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, hVar);
                }
                if (this.f20182p == 200) {
                    long j11 = hVar.f52379f;
                    if (j11 != 0) {
                        j10 = j11;
                    }
                }
                this.f20183q = j10;
                boolean zK = k(this.f20179m);
                if (zK) {
                    this.f20184r = hVar.f52380g;
                } else {
                    long j12 = hVar.f52380g;
                    if (j12 != -1) {
                        this.f20184r = j12;
                    } else {
                        long jI = i(this.f20179m);
                        this.f20184r = jI != -1 ? jI - this.f20183q : -1L;
                    }
                }
                try {
                    this.f20180n = this.f20179m.getInputStream();
                    if (zK) {
                        this.f20180n = new GZIPInputStream(this.f20180n);
                    }
                    this.f20181o = true;
                    f(hVar);
                    return this.f20184r;
                } catch (IOException e10) {
                    h();
                    throw new HttpDataSource.HttpDataSourceException(e10, hVar, 1);
                }
            } catch (IOException e11) {
                h();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e11, hVar, 1);
            }
        } catch (IOException e12) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect", e12, hVar, 1);
        }
    }

    public final long g() {
        long j10 = this.f20184r;
        return j10 == -1 ? j10 : j10 - this.f20186t;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f20179m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f20179m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.f20179m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                m.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f20179m = null;
        }
    }

    public final HttpURLConnection l(h hVar) throws IOException {
        h hVar2 = hVar;
        URL url = new URL(hVar2.f52374a.toString());
        int i10 = hVar2.f52375b;
        byte[] bArr = hVar2.f52376c;
        long j10 = hVar2.f52379f;
        long j11 = hVar2.f52380g;
        int i11 = 1;
        boolean zD = hVar2.d(1);
        if (!this.f20171e) {
            return m(url, i10, bArr, j10, j11, zD, true, hVar2.f52377d);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new NoRouteToHostException("Too many redirects: " + i13);
            }
            byte[] bArr2 = bArr;
            int i14 = i11;
            long j12 = j11;
            long j13 = j10;
            HttpURLConnection httpURLConnectionM = m(url, i10, bArr, j10, j11, zD, false, hVar2.f52377d);
            int responseCode = httpURLConnectionM.getResponseCode();
            String headerField = httpURLConnectionM.getHeaderField("Location");
            if ((i10 == i14 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM.disconnect();
                url = j(url, headerField);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM;
                }
                httpURLConnectionM.disconnect();
                url = j(url, headerField);
                bArr2 = null;
                i10 = i14;
            }
            i12 = i13;
            i11 = i14;
            bArr = bArr2;
            j11 = j12;
            j10 = j13;
            hVar2 = hVar;
        }
    }

    public final int p(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f20184r;
        if (j10 != -1) {
            long j11 = j10 - this.f20186t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = this.f20180n.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f20184r == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f20186t += (long) i12;
        c(i12);
        return i12;
    }

    public final void q() throws IOException {
        if (this.f20185s == this.f20183q) {
            return;
        }
        byte[] andSet = f20170v.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.f20185s;
            long j11 = this.f20183q;
            if (j10 == j11) {
                f20170v.set(andSet);
                return;
            }
            int i10 = this.f20180n.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f20185s += (long) i10;
            c(i10);
        }
    }

    public final HttpURLConnection m(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        String str;
        boolean z12;
        HttpURLConnection httpURLConnectionO = o(url);
        httpURLConnectionO.setConnectTimeout(this.f20172f);
        httpURLConnectionO.setReadTimeout(this.f20173g);
        HashMap map2 = new HashMap();
        HttpDataSource.c cVar = this.f20175i;
        if (cVar != null) {
            map2.putAll(cVar.a());
        }
        map2.putAll(this.f20176j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionO.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str2 = "bytes=" + j10 + "-";
            if (j11 != -1) {
                str2 = str2 + ((j10 + j11) - 1);
            }
            httpURLConnectionO.setRequestProperty(Command.HTTP_HEADER_RANGE, str2);
        }
        httpURLConnectionO.setRequestProperty("User-Agent", this.f20174h);
        if (z10) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnectionO.setRequestProperty("Accept-Encoding", str);
        httpURLConnectionO.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnectionO.setDoOutput(z12);
        httpURLConnectionO.setRequestMethod(h.b(i10));
        if (bArr != null) {
            httpURLConnectionO.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionO.connect();
            OutputStream outputStream = httpURLConnectionO.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionO.connect();
        }
        return httpURLConnectionO;
    }

    @VisibleForTesting
    public HttpURLConnection o(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource.HttpDataSourceException {
        try {
            q();
            return p(bArr, i10, i11);
        } catch (IOException e10) {
            throw new HttpDataSource.HttpDataSourceException(e10, this.f20178l, 2);
        }
    }
}
