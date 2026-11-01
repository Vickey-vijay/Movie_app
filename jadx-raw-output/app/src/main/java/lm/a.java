package lm;

import java.io.IOException;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: AbstractGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zm.c f63719t = zm.b.a(a.class);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f63720u = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Buffers f63721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mm.k f63722b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mm.d f63726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mm.d f63727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f63728h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mm.d f63735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public mm.d f63736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public mm.d f63737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mm.d f63738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f63739s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63723c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63724d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63725e = 11;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f63729i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f63730j = -3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f63731k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f63732l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f63733m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f63734n = null;

    @Override // lm.c
    public abstract void A(org.eclipse.jetty.http.a aVar, boolean z10) throws IOException;

    public abstract boolean j();

    public abstract int m() throws IOException;

    @Override // lm.c
    public void reset() {
        this.f63723c = 0;
        this.f63724d = 0;
        this.f63725e = 11;
        this.f63726f = null;
        this.f63731k = false;
        this.f63732l = false;
        this.f63733m = false;
        this.f63734n = null;
        this.f63729i = 0L;
        this.f63730j = -3L;
        this.f63738r = null;
        this.f63737q = null;
        this.f63727g = null;
    }

    @Override // lm.c
    public abstract int z() throws IOException;

    @Override // lm.c
    public void B(int i10, String str, String str2, boolean z10) throws IOException {
        if (z10) {
            this.f63734n = Boolean.FALSE;
        }
        if (a()) {
            f63719t.i("sendError on committed: {} {}", Integer.valueOf(i10), str);
            return;
        }
        f63719t.i("sendError: {} {}", Integer.valueOf(i10), str);
        u(i10, str);
        if (str2 != null) {
            A(null, false);
            t(new mm.m(new mm.h(str2)), true);
        } else if (i10 >= 400) {
            A(null, false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error: ");
            if (str == null) {
                str = "" + i10;
            }
            sb2.append(str);
            t(new mm.m(new mm.h(sb2.toString())), true);
        } else {
            A(null, true);
        }
        complete();
    }

    @Override // lm.c
    public void C(long j10) {
        if (j10 < 0) {
            this.f63730j = -3L;
        } else {
            this.f63730j = j10;
        }
    }

    @Override // lm.c
    public boolean a() {
        return this.f63723c != 0;
    }

    @Override // lm.c
    public void b() {
        if (this.f63723c >= 3) {
            throw new IllegalStateException("Flushed");
        }
        this.f63731k = false;
        this.f63734n = null;
        this.f63729i = 0L;
        this.f63730j = -3L;
        this.f63737q = null;
        mm.d dVar = this.f63736p;
        if (dVar != null) {
            dVar.clear();
        }
    }

    public void c(long j10) throws IOException {
        if (this.f63722b.f()) {
            try {
                z();
                return;
            } catch (IOException e10) {
                this.f63722b.close();
                throw e10;
            }
        }
        if (this.f63722b.h(j10)) {
            z();
        } else {
            this.f63722b.close();
            throw new EofException("timeout");
        }
    }

    @Override // lm.c
    public void complete() throws IOException {
        if (this.f63723c == 0) {
            throw new IllegalStateException("State==HEADER");
        }
        long j10 = this.f63730j;
        if (j10 < 0 || j10 == this.f63729i || this.f63732l) {
            return;
        }
        zm.c cVar = f63719t;
        if (cVar.f()) {
            cVar.i("ContentLength written==" + this.f63729i + " != contentLength==" + this.f63730j, new Object[0]);
        }
        this.f63734n = Boolean.FALSE;
    }

    public void d() {
        if (this.f63733m) {
            mm.d dVar = this.f63736p;
            if (dVar != null) {
                dVar.clear();
                return;
            }
            return;
        }
        this.f63729i += (long) this.f63736p.length();
        if (this.f63732l) {
            this.f63736p.clear();
        }
    }

    public boolean f() {
        return this.f63739s;
    }

    public mm.d g() {
        return this.f63736p;
    }

    public boolean h() {
        mm.d dVar = this.f63736p;
        if (dVar == null || dVar.L() != 0) {
            mm.d dVar2 = this.f63737q;
            return dVar2 != null && dVar2.length() > 0;
        }
        if (this.f63736p.length() == 0 && !this.f63736p.Y()) {
            this.f63736p.b0();
        }
        return this.f63736p.L() == 0;
    }

    public boolean i() {
        return this.f63722b.isOpen();
    }

    @Override // lm.c
    public boolean isComplete() {
        return this.f63723c == 4;
    }

    public boolean k(int i10) {
        return this.f63723c == i10;
    }

    public boolean l() {
        return this.f63729i > 0;
    }

    public void n(String str, String str2) {
        if (str == null || "GET".equals(str)) {
            this.f63727g = j.f63810b;
        } else {
            this.f63727g = j.f63809a.g(str);
        }
        this.f63728h = str2;
        if (this.f63725e == 9) {
            this.f63733m = true;
        }
    }

    @Override // lm.c
    public boolean p() {
        return this.f63723c == 0 && this.f63727g == null && this.f63724d == 0;
    }

    @Override // lm.c
    public void q() {
        mm.d dVar = this.f63736p;
        if (dVar != null && dVar.length() == 0) {
            this.f63721a.a(this.f63736p);
            this.f63736p = null;
        }
        mm.d dVar2 = this.f63735o;
        if (dVar2 == null || dVar2.length() != 0) {
            return;
        }
        this.f63721a.a(this.f63735o);
        this.f63735o = null;
    }

    @Override // lm.c
    public boolean s() {
        Boolean bool = this.f63734n;
        if (bool != null) {
            return bool.booleanValue();
        }
        return j() || this.f63725e > 10;
    }

    @Override // lm.c
    public void setVersion(int i10) {
        if (this.f63723c != 0) {
            throw new IllegalStateException("STATE!=START " + this.f63723c);
        }
        this.f63725e = i10;
        if (i10 != 9 || this.f63727g == null) {
            return;
        }
        this.f63733m = true;
    }

    @Override // lm.c
    public void u(int i10, String str) {
        if (this.f63723c != 0) {
            throw new IllegalStateException("STATE!=START");
        }
        this.f63727g = null;
        this.f63724d = i10;
        if (str != null) {
            byte[] bArrC = xm.o.c(str);
            int length = bArrC.length;
            if (length > 1024) {
                length = 1024;
            }
            this.f63726f = new mm.h(length);
            for (int i11 = 0; i11 < length; i11++) {
                byte b10 = bArrC[i11];
                if (b10 == 13 || b10 == 10) {
                    this.f63726f.put((byte) 32);
                } else {
                    this.f63726f.put(b10);
                }
            }
        }
    }

    @Override // lm.c
    public void v(boolean z10) {
        this.f63732l = z10;
    }

    @Override // lm.c
    public void w(boolean z10) {
        this.f63739s = z10;
    }

    @Override // lm.c
    public void x(mm.d dVar) {
        this.f63738r = dVar;
    }

    @Override // lm.c
    public boolean y() {
        long j10 = this.f63730j;
        return j10 >= 0 && this.f63729i >= j10;
    }

    public a(Buffers buffers, mm.k kVar) {
        this.f63721a = buffers;
        this.f63722b = kVar;
    }

    public void e(long j10) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = j10 + jCurrentTimeMillis;
        mm.d dVar = this.f63737q;
        mm.d dVar2 = this.f63736p;
        if ((dVar != null && dVar.length() > 0) || ((dVar2 != null && dVar2.length() > 0) || h())) {
            z();
            while (jCurrentTimeMillis < j11) {
                if ((dVar != null && dVar.length() > 0) || (dVar2 != null && dVar2.length() > 0)) {
                    if (this.f63722b.isOpen() && !this.f63722b.s()) {
                        c(j11 - jCurrentTimeMillis);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        throw new EofException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // lm.c
    public void r(boolean z10) {
        this.f63734n = Boolean.valueOf(z10);
    }
}
