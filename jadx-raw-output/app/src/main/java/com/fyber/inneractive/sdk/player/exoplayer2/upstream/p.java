package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
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
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f17772o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReference f17773p = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f17778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f17779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f17780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpURLConnection f17781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputStream f17782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17787n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f17781h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection b(k kVar) throws IOException {
        URL url = new URL(kVar.f17747a.toString());
        long j10 = kVar.f17749c;
        long j11 = kVar.f17750d;
        int i10 = 0;
        boolean z10 = (kVar.f17752f & 1) == 1;
        if (!this.f17774a) {
            return a(url, null, j10, j11, z10, true);
        }
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new NoRouteToHostException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Too many redirects: ", i11));
            }
            HttpURLConnection httpURLConnectionA = a(url, null, j10, j11, z10, false);
            int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
            if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                return httpURLConnectionA;
            }
            String headerField = httpURLConnectionA.getHeaderField("Location");
            DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
            if (headerField == null) {
                throw new ProtocolException("Null location redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            i10 = i11;
            url = url2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        try {
            if (this.f17782i != null) {
                HttpURLConnection httpURLConnection = this.f17781h;
                long j10 = this.f17785l;
                if (j10 != -1) {
                    j10 -= this.f17787n;
                }
                a(httpURLConnection, j10);
                try {
                    this.f17782i.close();
                } catch (IOException e10) {
                    throw new u(e10);
                }
            }
            this.f17782i = null;
            b();
            if (this.f17783j) {
                this.f17783j = false;
                m mVar = this.f17780g;
                if (mVar != null) {
                    mVar.a();
                }
            }
        } catch (Throwable th2) {
            this.f17782i = null;
            b();
            if (this.f17783j) {
                this.f17783j = false;
                m mVar2 = this.f17780g;
                if (mVar2 != null) {
                    mVar2.a();
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws u {
        long j10;
        long jMax;
        this.f17787n = 0L;
        this.f17786m = 0L;
        try {
            HttpURLConnection httpURLConnectionB = b(kVar);
            this.f17781h = httpURLConnectionB;
            try {
                int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionB);
                if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode > 299) {
                    this.f17781h.getHeaderFields();
                    b();
                    v vVar = new v(iHttpUrlConnectionGetResponseCode);
                    if (iHttpUrlConnectionGetResponseCode != 416) {
                        throw vVar;
                    }
                    vVar.initCause(new i());
                    throw vVar;
                }
                this.f17781h.getContentType();
                if (iHttpUrlConnectionGetResponseCode == 200) {
                    j10 = kVar.f17749c;
                    if (j10 == 0) {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                this.f17784k = j10;
                if ((kVar.f17752f & 1) == 1) {
                    this.f17785l = kVar.f17750d;
                } else {
                    long j11 = kVar.f17750d;
                    if (j11 != -1) {
                        this.f17785l = j11;
                    } else {
                        HttpURLConnection httpURLConnection = this.f17781h;
                        String headerField = httpURLConnection.getHeaderField("Content-Length");
                        if (TextUtils.isEmpty(headerField)) {
                            jMax = -1;
                        } else {
                            try {
                                jMax = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField + C3426d4.j.f28588e);
                                jMax = -1;
                            }
                        }
                        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
                        if (!TextUtils.isEmpty(headerField2)) {
                            Matcher matcher = f17772o.matcher(headerField2);
                            if (matcher.find()) {
                                try {
                                    long j12 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                    if (jMax < 0) {
                                        jMax = j12;
                                    } else if (jMax != j12) {
                                        Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField + "] [" + headerField2 + C3426d4.j.f28588e);
                                        jMax = Math.max(jMax, j12);
                                    }
                                } catch (NumberFormatException unused2) {
                                    Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField2 + C3426d4.j.f28588e);
                                }
                            }
                        }
                        this.f17785l = jMax != -1 ? jMax - this.f17784k : -1L;
                    }
                }
                try {
                    this.f17782i = DTExchangeNetworkBridge.urlConnectionGetInputStream(this.f17781h);
                    this.f17783j = true;
                    m mVar = this.f17780g;
                    if (mVar != null) {
                        synchronized (mVar) {
                            if (mVar.f17759b == 0) {
                                mVar.f17760c = SystemClock.elapsedRealtime();
                            }
                            mVar.f17759b++;
                        }
                    }
                    return this.f17785l;
                } catch (IOException e10) {
                    b();
                    throw new u(e10);
                }
            } catch (IOException e11) {
                b();
                throw new u("Unable to connect to " + kVar.f17747a.toString(), e11);
            }
        } catch (IOException e12) {
            throw new u("Unable to connect to " + kVar.f17747a.toString(), e12);
        }
    }

    public final void c() throws IOException {
        if (this.f17786m == this.f17784k) {
            return;
        }
        byte[] bArr = (byte[]) f17773p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j10 = this.f17786m;
            long j11 = this.f17784k;
            if (j10 == j11) {
                f17773p.set(bArr);
                return;
            }
            int i10 = this.f17782i.read(bArr, 0, (int) Math.min(j11 - j10, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            long j12 = i10;
            this.f17786m += j12;
            m mVar = this.f17780g;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f17761d += j12;
                }
            }
        }
    }

    public p(String str, m mVar, int i10, int i11, boolean z10, w wVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f17777d = str;
            this.f17780g = mVar;
            this.f17779f = new w();
            this.f17775b = i10;
            this.f17776c = i11;
            this.f17774a = z10;
            this.f17778e = wVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws u {
        try {
            c();
            return a(bArr, i10, i11);
        } catch (IOException e10) {
            throw new u(e10);
        }
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f17781h;
        if (httpURLConnection != null) {
            try {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f17781h = null;
        }
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f17775b);
        httpURLConnection.setReadTimeout(this.f17776c);
        w wVar = this.f17778e;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.f17801b == null) {
                    wVar.f17801b = Collections.unmodifiableMap(new HashMap(wVar.f17800a));
                }
                map = wVar.f17801b;
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f17779f.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = "bytes=" + j10 + "-";
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f17777d);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStreamUrlConnectionGetOutputStream = DTExchangeNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                outputStreamUrlConnectionGetOutputStream.write(bArr);
                outputStreamUrlConnectionGetOutputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f17785l;
        if (j10 != -1) {
            long j11 = j10 - this.f17787n;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = this.f17782i.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f17785l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j12 = i12;
        this.f17787n += j12;
        m mVar = this.f17780g;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.f17761d += j12;
            }
        }
        return i12;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
        if (i10 == 19 || i10 == 20) {
            try {
                InputStream inputStreamUrlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                if (j10 == -1) {
                    if (inputStreamUrlConnectionGetInputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStreamUrlConnectionGetInputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStreamUrlConnectionGetInputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStreamUrlConnectionGetInputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
