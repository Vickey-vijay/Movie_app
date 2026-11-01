package f0;

import android.text.TextUtils;
import com.danikula.videocache.InterruptedProxyCacheException;
import com.danikula.videocache.ProxyCacheException;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: HttpUrlSource.java */
/* JADX INFO: loaded from: classes9.dex */
public class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.b f52801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.b f52802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f52803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f52804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f52805e;

    public h(String str, i0.b bVar, h0.b bVar2) {
        this.f52801a = (i0.b) k.c(bVar);
        this.f52802b = (h0.b) k.c(bVar2);
        o oVar = bVar.get(str);
        this.f52803c = oVar == null ? new o(str, -2147483648L, m.g(str)) : oVar;
    }

    @Override // f0.n
    public void a(long j10) throws ProxyCacheException {
        try {
            HttpURLConnection httpURLConnectionG = g(j10, -1);
            this.f52804d = httpURLConnectionG;
            String contentType = httpURLConnectionG.getContentType();
            this.f52805e = new BufferedInputStream(this.f52804d.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.f52804d;
            o oVar = new o(this.f52803c.f52820a, h(httpURLConnection, j10, httpURLConnection.getResponseCode()), contentType);
            this.f52803c = oVar;
            this.f52801a.a(oVar.f52820a, oVar);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error opening connection for " + this.f52803c.f52820a + " with offset " + j10, e10);
        }
    }

    public synchronized String d() throws ProxyCacheException {
        if (TextUtils.isEmpty(this.f52803c.f52822c)) {
            b();
        }
        return this.f52803c.f52822c;
    }

    @Override // f0.n
    public synchronized long length() throws ProxyCacheException {
        if (this.f52803c.f52821b == -2147483648L) {
            b();
        }
        return this.f52803c.f52821b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.net.HttpURLConnection] */
    public final void b() throws Throwable {
        HttpURLConnection httpURLConnectionG;
        j.a("Read content info from " + this.f52803c.f52820a);
        ?? r10 = 0;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnectionG = g(0L, 10000);
                try {
                    long jC = c(httpURLConnectionG);
                    String contentType = httpURLConnectionG.getContentType();
                    inputStream = httpURLConnectionG.getInputStream();
                    o oVar = new o(this.f52803c.f52820a, jC, contentType);
                    this.f52803c = oVar;
                    this.f52801a.a(oVar.f52820a, oVar);
                    j.a("Source info fetched: " + this.f52803c);
                    m.c(inputStream);
                    r10 = httpURLConnectionG;
                } catch (IOException unused) {
                    j.b("Error fetching info from " + this.f52803c.f52820a);
                    m.c(inputStream);
                    r10 = httpURLConnectionG;
                    if (httpURLConnectionG == null) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                m.c(inputStream);
                if (r10 != 0) {
                    r10.disconnect();
                }
                throw th;
            }
        } catch (IOException unused2) {
            httpURLConnectionG = null;
        } catch (Throwable th3) {
            th = th3;
            r10 = 0;
            m.c(inputStream);
            if (r10 != 0) {
                r10.disconnect();
            }
            throw th;
        }
        r10.disconnect();
    }

    public final long c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // f0.n
    public void close() throws ProxyCacheException {
        HttpURLConnection httpURLConnection = this.f52804d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException unused) {
                j.b("Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue.");
            } catch (IllegalArgumentException e10) {
                e = e10;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e11) {
                e = e11;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    public String e() {
        return this.f52803c.f52820a;
    }

    public final void f(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.f52802b.a(str).entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public final HttpURLConnection g(long j10, int i10) throws IOException, ProxyCacheException {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z10;
        String headerField = this.f52803c.f52820a;
        int i11 = 0;
        do {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Open connection ");
            if (j10 > 0) {
                str = " with offset " + j10;
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(" to ");
            sb2.append(headerField);
            j.a(sb2.toString());
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            f(httpURLConnection, headerField);
            if (j10 > 0) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, "bytes=" + j10 + "-");
            }
            if (i10 > 0) {
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z10 = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z10) {
                headerField = httpURLConnection.getHeaderField("Location");
                i11++;
                httpURLConnection.disconnect();
            }
            if (i11 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i11);
            }
        } while (z10);
        return httpURLConnection;
    }

    @Override // f0.n
    public int read(byte[] bArr) throws ProxyCacheException {
        InputStream inputStream = this.f52805e;
        if (inputStream == null) {
            throw new ProxyCacheException("Error reading data from " + this.f52803c.f52820a + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e10) {
            throw new InterruptedProxyCacheException("Reading source " + this.f52803c.f52820a + " is interrupted", e10);
        } catch (IOException e11) {
            throw new ProxyCacheException("Error reading data from " + this.f52803c.f52820a, e11);
        }
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f52803c + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public final long h(HttpURLConnection httpURLConnection, long j10, int i10) throws IOException {
        long jC = c(httpURLConnection);
        if (i10 != 200) {
            if (i10 == 206) {
                return jC + j10;
            }
            return this.f52803c.f52821b;
        }
        return jC;
    }

    public h(h hVar) {
        this.f52803c = hVar.f52803c;
        this.f52801a = hVar.f52801a;
        this.f52802b = hVar.f52802b;
    }
}
