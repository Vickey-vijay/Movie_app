package yads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.download.Command;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes11.dex */
public class td0 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f82968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f82969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f82970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f82971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t11 f82972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t11 f82973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f82974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final og2 f82975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HttpURLConnection f82976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f82977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f82978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f82979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f82980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f82981r;

    public td0(String str, int i10, int i11, boolean z10, t11 t11Var) {
        super(true);
        this.f82971h = str;
        this.f82969f = i10;
        this.f82970g = i11;
        this.f82968e = z10;
        this.f82972i = t11Var;
        this.f82975l = null;
        this.f82973j = new t11();
        this.f82974k = false;
    }

    public final URL a(URL url, String str) throws q11 {
        if (str == null) {
            throw new q11("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new q11("Unsupported protocol redirect: " + protocol, 2001);
            }
            if (this.f82968e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new q11("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e10) {
            throw new q11(e10, 2001, 1);
        }
    }

    @Override // yads.p30
    public final void close() {
        try {
            InputStream inputStream = this.f82977n;
            if (inputStream != null) {
                long j10 = this.f82980q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f82981r;
                }
                a(this.f82976m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = ib3.f78556a;
                    throw new q11(e10, 2000, 3);
                }
            }
            this.f82977n = null;
            f();
            if (this.f82978o) {
                this.f82978o = false;
                d();
            }
        } catch (Throwable th2) {
            this.f82977n = null;
            f();
            if (this.f82978o) {
                this.f82978o = false;
                d();
            }
            throw th2;
        }
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws q11 {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f82980q;
            if (j10 != -1) {
                long j11 = j10 - this.f82981r;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f82977n;
            int i12 = ib3.f78556a;
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 == -1) {
                return -1;
            }
            this.f82981r += (long) i13;
            c(i13);
            return i13;
        } catch (IOException e10) {
            int i14 = ib3.f78556a;
            throw q11.a(e10, 2);
        }
    }

    public final HttpURLConnection c(u30 u30Var) throws IOException {
        u30Var = u30Var;
        URL url = new URL(u30Var.f83341a.toString());
        int i10 = u30Var.f83343c;
        byte[] bArr = u30Var.f83344d;
        long j10 = u30Var.f83346f;
        long j11 = u30Var.f83347g;
        int i11 = 0;
        boolean z10 = (u30Var.f83349i & 1) == 1;
        if (!this.f82968e && !this.f82974k) {
            return a(url, i10, bArr, j10, j11, z10, true, u30Var.f83345e);
        }
        URL urlA = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 > 20) {
                throw new q11(new NoRouteToHostException(mg2.a("Too many redirects: ", i13)), 2001, 1);
            }
            Map map = u30Var.f83345e;
            int i14 = i12;
            i11 = i13;
            URL url2 = urlA;
            j11 = j11;
            HttpURLConnection httpURLConnectionA = a(urlA, i12, bArr2, j10, j11, z10, false, map);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                urlA = a(url2, headerField);
                i12 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionA;
                }
                httpURLConnectionA.disconnect();
                if (this.f82974k && responseCode == 302) {
                    i12 = i14;
                } else {
                    bArr2 = null;
                    i12 = 1;
                }
                urlA = a(url2, headerField);
            }
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.f82976m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                ih1.b("DefaultHttpDataSource", ih1.a("Unexpected error while disconnecting", e10));
            }
            this.f82976m = null;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f82976m;
        return httpURLConnection == null ? xm2.f84636h : new rd0(httpURLConnection.getHeaderFields());
    }

    @Override // yads.p30
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f82976m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        String string;
        String str;
        Map map2;
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f82969f);
        httpURLConnectionA.setReadTimeout(this.f82970g);
        HashMap map3 = new HashMap();
        t11 t11Var = this.f82972i;
        if (t11Var != null) {
            synchronized (t11Var) {
                if (t11Var.f82861b == null) {
                    t11Var.f82861b = Collections.unmodifiableMap(new HashMap(t11Var.f82860a));
                }
                map2 = t11Var.f82861b;
            }
            map3.putAll(map2);
        }
        map3.putAll(this.f82973j.a());
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = b21.f75709a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j10);
            sb2.append("-");
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnectionA.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        String str2 = this.f82971h;
        if (str2 != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str2);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z11);
        httpURLConnectionA.setDoOutput(bArr != null);
        int i11 = u30.f83340k;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnectionA.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA.connect();
        }
        return httpURLConnectionA;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = ib3.f78556a) < 19 || i10 > 20) {
            return;
        }
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
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:78:0x018d  */
    @Override // yads.p30
    public final long a(u30 u30Var) throws q11 {
        HttpURLConnection httpURLConnection;
        boolean z10;
        long j10;
        long j11;
        HttpURLConnection httpURLConnection2;
        long j12;
        long j13;
        long j14;
        long jMax;
        this.f82981r = 0L;
        this.f82980q = 0L;
        e();
        try {
            HttpURLConnection httpURLConnectionC = c(u30Var);
            this.f82976m = httpURLConnectionC;
            this.f82979p = httpURLConnectionC.getResponseCode();
            httpURLConnectionC.getResponseMessage();
            int i10 = this.f82979p;
            if (i10 >= 200 && i10 <= 299) {
                String contentType = httpURLConnectionC.getContentType();
                og2 og2Var = this.f82975l;
                if (og2Var != null && !og2Var.apply(contentType)) {
                    f();
                    throw new r11(contentType);
                }
                if (this.f82979p == 200) {
                    j11 = u30Var.f83346f;
                    if (j11 == 0) {
                        j11 = 0;
                    }
                } else {
                    j11 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionC.getHeaderField("Content-Encoding"));
                if (!zEqualsIgnoreCase) {
                    long j15 = u30Var.f83347g;
                    if (j15 != -1) {
                        this.f82980q = j15;
                        httpURLConnection2 = httpURLConnectionC;
                        j12 = j11;
                    } else {
                        String headerField = httpURLConnectionC.getHeaderField("Content-Length");
                        String headerField2 = httpURLConnectionC.getHeaderField("Content-Range");
                        Pattern pattern = b21.f75709a;
                        if (TextUtils.isEmpty(headerField)) {
                            j13 = -1;
                        } else {
                            try {
                                j13 = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                ih1.b("HttpUtil", "Unexpected Content-Length [" + headerField + C3426d4.j.f28588e);
                                j13 = -1;
                            }
                        }
                        if (TextUtils.isEmpty(headerField2)) {
                            httpURLConnection2 = httpURLConnectionC;
                            j12 = j11;
                            j14 = j13;
                            jMax = j14;
                        } else {
                            Matcher matcher = b21.f75709a.matcher(headerField2);
                            if (matcher.matches()) {
                                try {
                                    String strGroup = matcher.group(2);
                                    strGroup.getClass();
                                    long j16 = Long.parseLong(strGroup);
                                    String strGroup2 = matcher.group(1);
                                    strGroup2.getClass();
                                    httpURLConnection2 = httpURLConnectionC;
                                    long j17 = (j16 - Long.parseLong(strGroup2)) + 1;
                                    j12 = j11;
                                    j14 = j13;
                                    if (j14 < 0) {
                                        jMax = j17;
                                    } else if (j14 != j17) {
                                        try {
                                            ih1.d("HttpUtil", "Inconsistent headers [" + headerField + "] [" + headerField2 + C3426d4.j.f28588e);
                                            jMax = Math.max(j14, j17);
                                        } catch (NumberFormatException unused2) {
                                            ih1.b("HttpUtil", "Unexpected Content-Range [" + headerField2 + C3426d4.j.f28588e);
                                            jMax = j14;
                                        }
                                    }
                                } catch (NumberFormatException unused3) {
                                    httpURLConnection2 = httpURLConnectionC;
                                    j12 = j11;
                                    j14 = j13;
                                }
                            } else {
                                httpURLConnection2 = httpURLConnectionC;
                                j12 = j11;
                                j14 = j13;
                            }
                            jMax = j14;
                        }
                        this.f82980q = jMax != -1 ? jMax - j12 : -1L;
                    }
                } else {
                    httpURLConnection2 = httpURLConnectionC;
                    j12 = j11;
                    this.f82980q = u30Var.f83347g;
                }
                try {
                    this.f82977n = httpURLConnection2.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.f82977n = new GZIPInputStream(this.f82977n);
                    }
                    this.f82978o = true;
                    b(u30Var);
                    try {
                        a(j12);
                        return this.f82980q;
                    } catch (IOException e10) {
                        f();
                        if (e10 instanceof q11) {
                            throw ((q11) e10);
                        }
                        throw new q11(e10, 2000, 1);
                    }
                } catch (IOException e11) {
                    f();
                    throw new q11(e11, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = httpURLConnectionC.getHeaderFields();
            if (this.f82979p == 416) {
                String headerField3 = httpURLConnection.getHeaderField("Content-Range");
                Pattern pattern2 = b21.f75709a;
                if (TextUtils.isEmpty(headerField3)) {
                    httpURLConnection = httpURLConnectionC;
                    httpURLConnection = httpURLConnectionC;
                    z10 = true;
                    j10 = -1;
                } else {
                    Matcher matcher2 = b21.f75710b.matcher(headerField3);
                    if (matcher2.matches()) {
                        httpURLConnection = httpURLConnectionC;
                        z10 = true;
                        String strGroup3 = matcher2.group(1);
                        strGroup3.getClass();
                        j10 = Long.parseLong(strGroup3);
                    } else {
                        httpURLConnection = httpURLConnectionC;
                        httpURLConnection = httpURLConnectionC;
                        z10 = true;
                        j10 = -1;
                    }
                }
                if (u30Var.f83346f == j10) {
                    this.f82978o = z10;
                    b(u30Var);
                    long j18 = u30Var.f83347g;
                    if (j18 != -1) {
                        return j18;
                    }
                    return 0L;
                }
            } else {
                httpURLConnection = httpURLConnectionC;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                if (errorStream != null) {
                    int i11 = ib3.f78556a;
                    byte[] bArr = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i12 = errorStream.read(bArr);
                        if (i12 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i12);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i13 = ib3.f78556a;
                }
            } catch (IOException unused4) {
                int i14 = ib3.f78556a;
            }
            f();
            throw new s11(this.f82979p, this.f82979p == 416 ? new q30(2008) : null, headerFields);
        } catch (IOException e12) {
            f();
            throw q11.a(e12, 1);
        }
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final void a(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f82977n;
            int i10 = ib3.f78556a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new q11(new InterruptedIOException(), 2000, 1);
            }
            if (i11 != -1) {
                j10 -= (long) i11;
                c(i11);
            } else {
                throw new q11();
            }
        }
    }
}
