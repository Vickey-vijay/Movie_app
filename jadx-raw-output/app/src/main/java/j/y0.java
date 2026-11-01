package j;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements gl.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f61670a;

    public y0(b2 b2Var) {
        this.f61670a = b2Var;
    }

    @Override // gl.s0
    public final void a(Object... objArr) {
        this.f61670a.f61452c.IL1Iii.runOnUiThread(new g0(this, objArr));
    }

    @Override // gl.s0
    public final void b(int i10, String str) {
        this.f61670a.f61452c.IL1Iii.runOnUiThread(new i1(this));
    }
}
