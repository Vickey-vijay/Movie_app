package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.G5;
import com.ironsource.Z7;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f38226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p f38228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f38230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f38233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f38234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f38235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f38236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v.a f38237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f38238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f38239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f38241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f38243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f38244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f38245t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.a f38246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f38247v;

    /* JADX INFO: compiled from: Request.java */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public abstract v<T> a(q qVar);

    public void a(v.a aVar) {
        this.f38237l = aVar;
    }

    public abstract void a(T t10);

    public void a(String str) {
    }

    public boolean a() {
        return false;
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    public void c(String str) {
        u uVar = this.f38239n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public b.a d() {
        return this.f38246u;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return "UTF-8";
    }

    public boolean y() {
        return true;
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public final boolean A() {
        return this.f38244s;
    }

    public final boolean B() {
        return this.f38243r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f38245t = xVar;
        return this;
    }

    public String d(String str) {
        if (this.f38230e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f38230e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f38227b)) {
            return this.f38227b;
        }
        if (this.f38226a == null) {
            this.f38226a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f38226a.a(this);
        this.f38227b = strA;
        return strA;
    }

    public int g() {
        return this.f38231f;
    }

    public p h() {
        return this.f38228c;
    }

    public int k() {
        return this.f38233h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f38247v;
    }

    public x o() {
        return this.f38245t;
    }

    public String p() {
        return this.f38234i;
    }

    public int s() {
        return this.f38235j;
    }

    public String t() {
        return this.f38232g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v() ? "[X] " : "[ ] ");
        sb2.append(t());
        sb2.append(Z7.f27998r);
        sb2.append(str);
        sb2.append(Z7.f27998r);
        sb2.append(l());
        sb2.append(Z7.f27998r);
        sb2.append(this.f38238m);
        return sb2.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f38236k) {
            z10 = this.f38242q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f38236k) {
            z10 = this.f38241p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f38236k) {
            this.f38242q = true;
        }
    }

    public void x() {
        synchronized (this.f38236k) {
        }
    }

    public final boolean z() {
        return this.f38240o;
    }

    public t(int i10, String str, int i11, String str2) {
        this.f38236k = new Object();
        this.f38240o = false;
        this.f38241p = false;
        this.f38242q = false;
        this.f38243r = false;
        this.f38244s = false;
        this.f38246u = null;
        this.f38247v = 0L;
        this.f38231f = i10;
        this.f38232g = str;
        this.f38233h = i11;
        this.f38234i = str2;
        a((x) new e());
        this.f38235j = b(str);
        this.f38229d = SystemClock.elapsedRealtime();
    }

    public void a(int i10) {
        u uVar = this.f38239n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public Map<String, String> f() {
        return Collections.emptyMap();
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f38229d;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000L;
        }
        long jA = xVarO.a();
        if (jA < 0) {
            return 30000L;
        }
        return jA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f38243r = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f38239n = uVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f38238m = Integer.valueOf(i10);
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(G5.T);
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append('&');
                    }
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.f38247v = bArrA.length;
            return bArrA;
        }
        this.f38247v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f38244s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f38236k) {
            aVar = this.f38237l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f38240o = z10;
        return this;
    }

    public void a(v<?> vVar) {
        synchronized (this.f38236k) {
        }
    }

    public void a(p pVar) {
        this.f38228c = pVar;
    }

    public void a(String str, String str2) {
        if (this.f38230e == null) {
            this.f38230e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f38230e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        a aVarL = l();
        a aVarL2 = tVar.l();
        return aVarL == aVarL2 ? this.f38238m.intValue() - tVar.f38238m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }
}
