package ll;

import kl.l;
import kl.n;
import kl.o;
import kl.p;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: DanmakuFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63684a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63685b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p.c f63686c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f63687d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f63688e = 3800;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f63689f = 4000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kl.f f63690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kl.f f63691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kl.f f63692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f63693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DanmakuContext f63694k;

    public kl.c d(int i10, int i11, int i12, float f10, float f11) {
        return c(i10, i11, i12, f10, f11);
    }

    public void g() {
        this.f63693j = null;
        this.f63685b = 0;
        this.f63684a = 0;
        this.f63690g = null;
        this.f63691h = null;
        this.f63692i = null;
        this.f63689f = 4000L;
    }

    public final synchronized void k(int i10, int i11, float f10, float f11) {
        p.c cVar = this.f63686c;
        if (cVar != null) {
            cVar.update(i10, i11, f10, f11);
        }
    }

    public static d a() {
        return new d();
    }

    public kl.c b(int i10) {
        return e(i10, this.f63694k);
    }

    public kl.c c(int i10, float f10, float f11, float f12, float f13) {
        float f14;
        int i11 = this.f63684a;
        int i12 = this.f63685b;
        boolean zL = l(f10, f11, f12);
        kl.f fVar = this.f63690g;
        if (fVar == null) {
            kl.f fVar2 = new kl.f(this.f63688e);
            this.f63690g = fVar2;
            fVar2.a(f13);
        } else if (zL) {
            fVar.b(this.f63688e);
        }
        if (this.f63691h == null) {
            this.f63691h = new kl.f(3800L);
        }
        float f15 = 1.0f;
        if (!zL || f10 <= 0.0f) {
            f14 = 1.0f;
        } else {
            i();
            if (i11 <= 0 || i12 <= 0) {
                f14 = 1.0f;
            } else {
                f15 = f10 / i11;
                f14 = f11 / i12;
            }
            int i13 = (int) f10;
            int i14 = (int) f11;
            j(i13, i14, f15, f14);
            if (f11 > 0.0f) {
                k(i13, i14, f15, f14);
            }
        }
        if (i10 == 1) {
            return new o(this.f63690g);
        }
        if (i10 == 4) {
            return new kl.g(this.f63691h);
        }
        if (i10 == 5) {
            return new kl.h(this.f63691h);
        }
        if (i10 == 6) {
            return new n(this.f63690g);
        }
        if (i10 != 7) {
            return null;
        }
        p pVar = new p();
        j((int) f10, (int) f11, f15, f14);
        pVar.F(this.f63686c);
        return pVar;
    }

    public kl.c e(int i10, DanmakuContext danmakuContext) {
        if (danmakuContext == null) {
            return null;
        }
        this.f63694k = danmakuContext;
        kl.a aVarB = danmakuContext.b();
        this.f63693j = aVarB;
        return d(i10, aVarB.getWidth(), this.f63693j.getHeight(), this.f63687d, danmakuContext.f64326m);
    }

    public void f(DanmakuContext danmakuContext) {
        this.f63694k = danmakuContext;
        this.f63693j = danmakuContext.b();
        e(1, danmakuContext);
    }

    public void h(float f10) {
        kl.f fVar = this.f63690g;
        if (fVar == null || this.f63691h == null) {
            return;
        }
        fVar.a(f10);
        i();
    }

    public void i() {
        kl.f fVar = this.f63690g;
        long j10 = fVar == null ? 0L : fVar.f62920d;
        kl.f fVar2 = this.f63691h;
        long j11 = fVar2 == null ? 0L : fVar2.f62920d;
        kl.f fVar3 = this.f63692i;
        long j12 = fVar3 != null ? fVar3.f62920d : 0L;
        long jMax = Math.max(j10, j11);
        this.f63689f = jMax;
        long jMax2 = Math.max(jMax, j12);
        this.f63689f = jMax2;
        long jMax3 = Math.max(3800L, jMax2);
        this.f63689f = jMax3;
        this.f63689f = Math.max(this.f63688e, jMax3);
    }

    public final void j(int i10, int i11, float f10, float f11) {
        if (this.f63686c == null) {
            this.f63686c = new p.c(i10, i11, f10, f11);
        }
        this.f63686c.update(i10, i11, f10, f11);
    }

    public boolean l(float f10, float f11, float f12) {
        int i10 = (int) f10;
        if (this.f63684a == i10 && this.f63685b == ((int) f11) && this.f63687d == f12) {
            return false;
        }
        long j10 = (long) (((f10 * f12) / 682.0f) * 3800.0f);
        this.f63688e = j10;
        long jMin = Math.min(9000L, j10);
        this.f63688e = jMin;
        this.f63688e = Math.max(4000L, jMin);
        this.f63684a = i10;
        this.f63685b = (int) f11;
        this.f63687d = f12;
        return true;
    }
}
