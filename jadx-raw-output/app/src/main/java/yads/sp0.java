package yads;

import android.view.TextureView;
import java.util.HashSet;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class sp0 implements p52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn0 f82716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln1 f82717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qi3 f82718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o52 f82719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fj3 f82720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qp0 f82721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final po0 f82722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n62 f82723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n62 f82724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cf3 f82725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kf3 f82726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f82727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f82728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f82729n;

    public final void a(cf3 cf3Var) {
        if (this.f82728m) {
            return;
        }
        this.f82725j = cf3Var;
        ln1 ln1Var = this.f82717b;
        ln1Var.getClass();
        oc0 oc0Var = new oc0(ln1Var.f79858b, new nu2(((l53) ne.a().f77342a).a(), cs2.a().a(ln1Var.f79858b)));
        Object obj = dp0.f76765c;
        nr nrVarA = bp0.a().a(ln1Var.f79858b);
        qr qrVar = new qr();
        qrVar.f81942a = nrVarA;
        qrVar.f81945d = oc0Var;
        ge0 ge0Var = new ge0(qrVar, new od0());
        ln1Var.f79857a.getClass();
        mo moVarA = ge0Var.a(fm1.a(cf3Var.getUrl()));
        ((zn0) this.f82716a).a(false);
        ((zn0) this.f82716a).a(moVarA);
        ((zn0) this.f82716a).m();
        po0 po0Var = this.f82722g;
        po0Var.getClass();
        no0 no0Var = new no0(po0Var);
        ((zb2) po0Var.f81484b).a(po0.f81482c, no0Var);
    }

    @Override // yads.kx0
    public final void g() {
        this.f82729n = true;
        pauseAd();
    }

    @Override // yads.p52
    public final long b() {
        return ((zn0) this.f82716a).j();
    }

    @Override // yads.p52
    public final void c() {
        if (!this.f82728m) {
            ((zn0) this.f82716a).a(true);
        }
        if (this.f82729n) {
            pauseAd();
        }
    }

    @Override // yads.p52
    public final void e() {
        if (this.f82728m) {
            return;
        }
        this.f82728m = true;
        this.f82729n = false;
        ((zb2) this.f82722g.f81484b).a();
        ((zn0) this.f82716a).a((TextureView) null);
        fj3 fj3Var = this.f82720e;
        fj3Var.f77417c = null;
        fj3Var.b();
        ((zn0) this.f82716a).d(this.f82721f);
        ((zn0) this.f82716a).d(this.f82720e);
        ((zn0) this.f82716a).n();
    }

    @Override // yads.p52
    public final boolean f() {
        return this.f82728m;
    }

    @Override // yads.p52
    public final long getAdPosition() {
        zn0 zn0Var = (zn0) this.f82716a;
        zn0Var.r();
        return ib3.b(zn0Var.a(zn0Var.Z));
    }

    @Override // yads.p52
    public final float getVolume() {
        zn0 zn0Var = (zn0) this.f82716a;
        zn0Var.r();
        return zn0Var.T;
    }

    @Override // yads.p52
    public final boolean isPlayingAd() {
        qo qoVar = (qo) this.f82716a;
        qoVar.getClass();
        zn0 zn0Var = (zn0) qoVar;
        zn0Var.r();
        if (zn0Var.Z.f76253e == 3) {
            zn0Var.r();
            if (zn0Var.Z.f76260l) {
                zn0Var.r();
                if (zn0Var.Z.f76261m == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yads.p52
    public final void pauseAd() {
        if (this.f82728m) {
            return;
        }
        ((zn0) this.f82716a).a(false);
    }

    @Override // yads.p52
    public final void resumeAd() {
        if (this.f82728m || this.f82729n) {
            return;
        }
        ((zn0) this.f82716a).a(true);
    }

    @Override // yads.p52
    public final void setVolume(float f10) {
        if (this.f82728m) {
            return;
        }
        ((zn0) this.f82716a).a(f10);
        kf3 kf3Var = this.f82726k;
        cf3 cf3Var = this.f82725j;
        if (kf3Var == null || cf3Var == null) {
            return;
        }
        kf3Var.onVolumeChanged(f10);
    }

    public sp0(zn0 zn0Var, ln1 ln1Var, qi3 qi3Var, o52 o52Var, fj3 fj3Var) {
        this.f82716a = zn0Var;
        this.f82717b = ln1Var;
        this.f82718c = qi3Var;
        this.f82719d = o52Var;
        this.f82720e = fj3Var;
        qp0 qp0Var = new qp0(this);
        this.f82721f = qp0Var;
        this.f82722g = new po0(qp0Var);
        this.f82727l = new HashSet();
        zn0Var.a(qp0Var);
        zn0Var.a(fj3Var);
        a7.a(this);
    }

    @Override // yads.p52
    public final void a(n62 n62Var, n62 n62Var2) {
        this.f82723h = n62Var;
        this.f82724i = n62Var2;
        Pair pairA = n62Var2 != null ? mj.h.a(n62Var, n62Var2) : null;
        if (pairA != null && this.f82727l.contains(pairA)) {
            a(n62Var2);
        } else {
            a(n62Var);
        }
    }

    @Override // yads.p52
    public final void a(kf3 kf3Var) {
        this.f82726k = kf3Var;
    }

    @Override // yads.p52
    public final void a(TextureView textureView) {
        if (this.f82728m) {
            return;
        }
        fj3 fj3Var = this.f82720e;
        fj3Var.f77417c = textureView;
        fj3Var.b();
        ((zn0) this.f82716a).a(textureView);
    }

    @Override // yads.p52
    public final void a(kj3 kj3Var) {
        if (this.f82728m) {
            return;
        }
        fj3 fj3Var = this.f82720e;
        fj3Var.f77418d = kj3Var;
        fj3Var.b();
    }

    @Override // yads.p52
    public final void a() {
        if (this.f82728m) {
            return;
        }
        kf3 kf3Var = this.f82726k;
        cf3 cf3Var = this.f82725j;
        if (kf3Var != null && cf3Var != null) {
            kf3Var.e();
        }
        this.f82728m = true;
        this.f82729n = false;
        ((zb2) this.f82722g.f81484b).a();
        ((zn0) this.f82716a).a((TextureView) null);
        fj3 fj3Var = this.f82720e;
        fj3Var.f77417c = null;
        fj3Var.b();
        ((zn0) this.f82716a).d(this.f82721f);
        ((zn0) this.f82716a).d(this.f82720e);
        ((zn0) this.f82716a).n();
    }
}
