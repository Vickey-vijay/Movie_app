package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class rr implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr f82395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p30 f82396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q53 f82397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p30 f82398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yr f82399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f82400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f82401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f82402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f82403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u30 f82404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u30 f82405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p30 f82406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f82407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f82408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f82409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public yy2 f82410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f82411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f82412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f82413s;

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f82396b.a(r83Var);
        this.f82398d.a(r83Var);
    }

    @Override // yads.p30
    public final void close() {
        this.f82404j = null;
        this.f82403i = null;
        this.f82408n = 0L;
        try {
            d();
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f82411q = true;
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        p30 p30Var = this.f82406l;
        if (p30Var == null) {
            return;
        }
        try {
            p30Var.close();
        } finally {
            this.f82405k = null;
            this.f82406l = null;
            yy2 yy2Var = this.f82410p;
            if (yy2Var != null) {
                ((vy2) this.f82395a).a((zr) yy2Var);
                this.f82410p = null;
            }
        }
    }

    public final nr e() {
        return this.f82395a;
    }

    public final yr f() {
        return this.f82399e;
    }

    public final boolean g() {
        return this.f82406l == this.f82396b;
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f82403i;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        if (this.f82409o == 0) {
            return -1;
        }
        u30 u30Var = this.f82404j;
        u30Var.getClass();
        u30 u30Var2 = this.f82405k;
        u30Var2.getClass();
        try {
            if (this.f82408n >= this.f82413s) {
                a(u30Var, true);
            }
            p30 p30Var = this.f82406l;
            p30Var.getClass();
            int i13 = p30Var.read(bArr, i10, i11);
            if (i13 != -1) {
                long j10 = i13;
                this.f82408n += j10;
                this.f82407m += j10;
                long j11 = this.f82409o;
                if (j11 != -1) {
                    this.f82409o = j11 - j10;
                }
                return i13;
            }
            if (!g()) {
                long j12 = u30Var2.f83347g;
                if (j12 != -1) {
                    i12 = i13;
                    if (this.f82407m < j12) {
                    }
                } else {
                    i12 = i13;
                }
                String str = u30Var.f83348h;
                int i14 = ib3.f78556a;
                this.f82409o = 0L;
                if (this.f82406l != this.f82397c) {
                    return i12;
                }
                rz rzVar = new rz();
                rzVar.f82469a.put("exo_len", Long.valueOf(this.f82408n));
                rzVar.f82470b.remove("exo_len");
                ((vy2) this.f82395a).a(str, rzVar);
                return i12;
            }
            i12 = i13;
            long j13 = this.f82409o;
            if (j13 <= 0 && j13 != -1) {
                return i12;
            }
            d();
            a(u30Var, false);
            return read(bArr, i10, i11);
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f82411q = true;
            }
            throw th2;
        }
    }

    public rr(nr nrVar, p30 p30Var, cv0 cv0Var, pr prVar, yr yrVar, int i10) {
        this.f82395a = nrVar;
        this.f82396b = cv0Var;
        this.f82399e = yrVar == null ? yr.f85093a : yrVar;
        this.f82400f = (i10 & 1) != 0;
        this.f82401g = false;
        this.f82402h = false;
        if (p30Var != null) {
            this.f82398d = p30Var;
            this.f82397c = prVar != null ? new q53(p30Var, prVar) : null;
        } else {
            this.f82398d = ed2.f77035a;
            this.f82397c = null;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        if (!g()) {
            return this.f82398d.getResponseHeaders();
        }
        return Collections.emptyMap();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        try {
            String strA = this.f82399e.a(u30Var);
            u30Var.getClass();
            Uri uri = u30Var.f83341a;
            long j10 = u30Var.f83342b;
            int i10 = u30Var.f83343c;
            byte[] bArr = u30Var.f83344d;
            Map map = u30Var.f83345e;
            long j11 = u30Var.f83346f;
            long j12 = u30Var.f83347g;
            int i11 = u30Var.f83349i;
            Object obj = u30Var.f83350j;
            ni.a(uri, "The uri must be set.");
            u30 u30Var2 = new u30(uri, j10, i10, bArr, map, j11, j12, strA, i11, obj);
            this.f82404j = u30Var2;
            nr nrVar = this.f82395a;
            Uri uri2 = u30Var2.f83341a;
            String strA2 = ((vy2) nrVar).b(strA).a();
            Uri uri3 = strA2 == null ? null : Uri.parse(strA2);
            if (uri3 != null) {
                uri2 = uri3;
            }
            this.f82403i = uri2;
            this.f82408n = u30Var.f83346f;
            boolean z10 = (this.f82401g && this.f82411q) || (this.f82402h && u30Var.f83347g == -1);
            this.f82412r = z10;
            if (z10) {
                this.f82409o = -1L;
            } else {
                long jA = qz.a(((vy2) this.f82395a).b(strA));
                this.f82409o = jA;
                if (jA != -1) {
                    long j13 = jA - u30Var.f83346f;
                    this.f82409o = j13;
                    if (j13 < 0) {
                        throw new q30(2008);
                    }
                }
            }
            long jMin = u30Var.f83347g;
            if (jMin != -1) {
                long j14 = this.f82409o;
                if (j14 != -1) {
                    jMin = Math.min(j14, jMin);
                }
                this.f82409o = jMin;
            }
            long j15 = this.f82409o;
            if (j15 > 0 || j15 == -1) {
                a(u30Var2, false);
            }
            long j16 = u30Var.f83347g;
            return j16 != -1 ? j16 : this.f82409o;
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f82411q = true;
            }
            throw th2;
        }
    }

    public final void a(u30 u30Var, boolean z10) throws InterruptedIOException {
        yy2 yy2VarC;
        String str;
        p30 p30Var;
        u30 u30Var2;
        String str2 = u30Var.f83348h;
        int i10 = ib3.f78556a;
        if (this.f82412r) {
            yy2VarC = null;
        } else if (this.f82400f) {
            try {
                nr nrVar = this.f82395a;
                long j10 = this.f82408n;
                long j11 = this.f82409o;
                vy2 vy2Var = (vy2) nrVar;
                synchronized (vy2Var) {
                    vy2Var.a();
                    while (true) {
                        yy2VarC = vy2Var.c(str2, j10, j11);
                        if (yy2VarC != null) {
                            break;
                        } else {
                            vy2Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            yy2VarC = ((vy2) this.f82395a).c(str2, this.f82408n, this.f82409o);
        }
        if (yy2VarC == null) {
            p30 p30Var2 = this.f82398d;
            Uri uri = u30Var.f83341a;
            long j12 = u30Var.f83342b;
            int i11 = u30Var.f83343c;
            byte[] bArr = u30Var.f83344d;
            Map map = u30Var.f83345e;
            String str3 = u30Var.f83348h;
            int i12 = u30Var.f83349i;
            Object obj = u30Var.f83350j;
            long j13 = this.f82408n;
            str = str2;
            long j14 = this.f82409o;
            ni.a(uri, "The uri must be set.");
            u30Var2 = new u30(uri, j12, i11, bArr, map, j13, j14, str3, i12, obj);
            p30Var = p30Var2;
        } else {
            str = str2;
            if (yy2VarC.f85573e) {
                Uri uriFromFile = Uri.fromFile(yy2VarC.f85574f);
                long j15 = yy2VarC.f85571c;
                long j16 = this.f82408n - j15;
                long jMin = yy2VarC.f85572d - j16;
                long j17 = this.f82409o;
                if (j17 != -1) {
                    jMin = Math.min(jMin, j17);
                }
                long j18 = jMin;
                int i13 = u30Var.f83343c;
                byte[] bArr2 = u30Var.f83344d;
                Map map2 = u30Var.f83345e;
                String str4 = u30Var.f83348h;
                int i14 = u30Var.f83349i;
                Object obj2 = u30Var.f83350j;
                ni.a(uriFromFile, "The uri must be set.");
                u30 u30Var3 = new u30(uriFromFile, j15, i13, bArr2, map2, j16, j18, str4, i14, obj2);
                p30Var = this.f82396b;
                u30Var2 = u30Var3;
            } else {
                long jMin2 = yy2VarC.f85572d;
                if (jMin2 == -1) {
                    jMin2 = this.f82409o;
                } else {
                    long j19 = this.f82409o;
                    if (j19 != -1) {
                        jMin2 = Math.min(jMin2, j19);
                    }
                }
                long j20 = jMin2;
                Uri uri2 = u30Var.f83341a;
                long j21 = u30Var.f83342b;
                int i15 = u30Var.f83343c;
                byte[] bArr3 = u30Var.f83344d;
                Map map3 = u30Var.f83345e;
                String str5 = u30Var.f83348h;
                int i16 = u30Var.f83349i;
                Object obj3 = u30Var.f83350j;
                long j22 = this.f82408n;
                ni.a(uri2, "The uri must be set.");
                u30 u30Var4 = new u30(uri2, j21, i15, bArr3, map3, j22, j20, str5, i16, obj3);
                p30Var = this.f82397c;
                if (p30Var != null) {
                    u30Var2 = u30Var4;
                } else {
                    p30Var = this.f82398d;
                    ((vy2) this.f82395a).a((zr) yy2VarC);
                    u30Var2 = u30Var4;
                    yy2VarC = null;
                }
            }
        }
        this.f82413s = (this.f82412r || p30Var != this.f82398d) ? Long.MAX_VALUE : this.f82408n + 102400;
        if (z10) {
            p30 p30Var3 = this.f82406l;
            p30 p30Var4 = this.f82398d;
            if (p30Var3 != p30Var4) {
                throw new IllegalStateException();
            }
            if (p30Var == p30Var4) {
                return;
            }
            try {
                d();
            } catch (Throwable th2) {
                if (!yy2VarC.f85573e) {
                    ((vy2) this.f82395a).a((zr) yy2VarC);
                    throw th2;
                }
                throw th2;
            }
        }
        if (yy2VarC != null && (!yy2VarC.f85573e)) {
            this.f82410p = yy2VarC;
        }
        this.f82406l = p30Var;
        this.f82405k = u30Var2;
        this.f82407m = 0L;
        long jA = p30Var.a(u30Var2);
        rz rzVar = new rz();
        if (u30Var2.f83347g == -1 && jA != -1) {
            this.f82409o = jA;
            rzVar.f82469a.put("exo_len", Long.valueOf(this.f82408n + jA));
            rzVar.f82470b.remove("exo_len");
        }
        if (!g()) {
            Uri uri3 = p30Var.getUri();
            this.f82403i = uri3;
            Uri uri4 = u30Var.f83341a.equals(uri3) ^ true ? this.f82403i : null;
            if (uri4 == null) {
                rzVar.f82470b.add("exo_redir");
                rzVar.f82469a.remove("exo_redir");
            } else {
                String string = uri4.toString();
                HashMap map4 = rzVar.f82469a;
                string.getClass();
                map4.put("exo_redir", string);
                rzVar.f82470b.remove("exo_redir");
            }
        }
        if (this.f82406l == this.f82397c) {
            ((vy2) this.f82395a).a(str, rzVar);
        }
    }
}
