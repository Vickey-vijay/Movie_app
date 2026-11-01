package yads;

import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class qp0 implements me2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp0 f81918d;

    @Override // yads.me2
    public final void onIsPlayingChanged(boolean z10) {
        if (!z10) {
            if (this.f81916b) {
                return;
            }
            this.f81917c = true;
            sp0 sp0Var = this.f81918d;
            kf3 kf3Var = sp0Var.f82726k;
            cf3 cf3Var = sp0Var.f82725j;
            if (kf3Var == null || cf3Var == null) {
                return;
            }
            kf3Var.i();
            return;
        }
        if (!this.f81915a) {
            sp0 sp0Var2 = this.f81918d;
            kf3 kf3Var2 = sp0Var2.f82726k;
            cf3 cf3Var2 = sp0Var2.f82725j;
            if (kf3Var2 == null || cf3Var2 == null) {
                return;
            }
            this.f81915a = true;
            kf3Var2.c();
            return;
        }
        if (this.f81917c) {
            this.f81917c = false;
            sp0 sp0Var3 = this.f81918d;
            kf3 kf3Var3 = sp0Var3.f82726k;
            cf3 cf3Var3 = sp0Var3.f82725j;
            if (kf3Var3 == null || cf3Var3 == null) {
                return;
            }
            kf3Var3.f();
        }
    }

    @Override // yads.me2
    public final void onPlaybackStateChanged(int i10) {
        if (i10 == 2) {
            this.f81916b = true;
            sp0 sp0Var = this.f81918d;
            kf3 kf3Var = sp0Var.f82726k;
            cf3 cf3Var = sp0Var.f82725j;
            if (kf3Var == null || cf3Var == null) {
                return;
            }
            kf3Var.b();
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            this.f81915a = false;
            sp0 sp0Var2 = this.f81918d;
            kf3 kf3Var2 = sp0Var2.f82726k;
            cf3 cf3Var2 = sp0Var2.f82725j;
            if (kf3Var2 == null || cf3Var2 == null) {
                return;
            }
            kf3Var2.d();
            return;
        }
        ((zb2) this.f81918d.f82722g.f81484b).a();
        sp0 sp0Var3 = this.f81918d;
        kf3 kf3Var3 = sp0Var3.f82726k;
        cf3 cf3Var3 = sp0Var3.f82725j;
        if (kf3Var3 != null && cf3Var3 != null) {
            kf3Var3.h();
        }
        if (this.f81916b) {
            this.f81916b = false;
            sp0 sp0Var4 = this.f81918d;
            kf3 kf3Var4 = sp0Var4.f82726k;
            cf3 cf3Var4 = sp0Var4.f82725j;
            if (kf3Var4 == null || cf3Var4 == null) {
                return;
            }
            kf3Var4.a();
        }
    }

    public qp0(sp0 sp0Var) {
        this.f81918d = sp0Var;
    }

    @Override // yads.me2
    public final void a(pn0 pn0Var) {
        sp0 sp0Var = this.f81918d;
        n62 n62Var = sp0Var.f82723h;
        n62 n62Var2 = sp0Var.f82724i;
        Pair pairA = (n62Var == null || n62Var2 == null) ? null : mj.h.a(n62Var, n62Var2);
        if (pairA != null && !this.f81918d.f82727l.contains(pairA)) {
            this.f81918d.f82727l.add(pairA);
            this.f81918d.a((cf3) pairA.getSecond());
            return;
        }
        this.f81915a = false;
        ((zb2) this.f81918d.f82722g.f81484b).a();
        zn0 zn0Var = (zn0) this.f81918d.f82716a;
        zn0Var.r();
        zn0Var.r();
        yk ykVar = zn0Var.f85539v;
        zn0Var.r();
        ykVar.a(zn0Var.Z.f76260l, 1);
        zn0Var.a((pn0) null);
        int i10 = q20.f81686b;
        String message = pn0Var.getMessage();
        qi3 qi3Var = this.f81918d.f82718c;
        fo2 fo2VarA = qi3Var.f81863b.a();
        fo2VarA.b(message, "error_message");
        qi3Var.f81862a.a(new eo2(co2.f76361l.a(), kotlin.collections.a.B(fo2VarA.f77471a), fo2VarA.f77472b));
        sp0 sp0Var2 = this.f81918d;
        kf3 kf3Var = sp0Var2.f82726k;
        cf3 cf3Var = sp0Var2.f82725j;
        if (kf3Var == null || cf3Var == null) {
            return;
        }
        sp0Var2.f82719d.getClass();
        kf3Var.a(new jf3(o52.a(pn0Var), pn0Var));
    }
}
