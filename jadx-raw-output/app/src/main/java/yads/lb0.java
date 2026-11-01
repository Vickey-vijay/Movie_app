package yads;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class lb0 implements pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk3 f79741a;

    @Override // yads.pi
    public final void a() {
        View viewB = this.f79741a.b();
        if (viewB == null) {
            return;
        }
        this.f79741a.a(viewB);
    }

    @Override // yads.pi
    public final boolean b() {
        return this.f79741a.b() != null;
    }

    @Override // yads.pi
    public final zk3 c() {
        View viewB = this.f79741a.b();
        if (viewB != null) {
            return new zk3(viewB.getWidth(), viewB.getHeight());
        }
        return null;
    }

    @Override // yads.pi
    public final void destroy() {
    }

    @Override // yads.pi
    public final boolean d() {
        return kl3.a(this.f79741a.b()) >= 100;
    }

    @Override // yads.pi
    public final boolean e() {
        return this.f79741a.c();
    }

    public lb0(hk3 hk3Var) {
        this.f79741a = hk3Var;
    }

    @Override // yads.pi
    public final void a(oi oiVar, kk3 kk3Var) {
        this.f79741a.a(oiVar, kk3Var, oiVar.f81050c);
    }

    public void b(Object obj) {
        c(obj);
    }

    @Override // yads.pi
    public final void c(Object obj) {
        View viewB = this.f79741a.b();
        if (viewB == null) {
            return;
        }
        this.f79741a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    @Override // yads.pi
    public final boolean a(Object obj) {
        View viewB = this.f79741a.b();
        return viewB != null && this.f79741a.a(viewB, obj);
    }
}
