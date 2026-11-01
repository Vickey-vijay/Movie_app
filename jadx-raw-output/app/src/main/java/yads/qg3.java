package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qg3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f81849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rg3 f81851c;

    public final void a() {
        if (!this.f81851c.f82267d.isEmpty()) {
            this.f81849a.onSuccess(this.f81851c.f82267d);
            return;
        }
        zl0 zl0Var = new zl0();
        to2 to2Var = this.f81849a;
        String message = zl0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        to2Var.a(new be3(message));
    }

    public qg3(rg3 rg3Var, to2 to2Var, Object obj) {
        this.f81851c = rg3Var;
        this.f81849a = to2Var;
        this.f81850b = obj;
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        this.f81851c.f82266c.getClass();
        og3 og3VarA = pg3.a((List) obj);
        this.f81851c.f82267d.addAll(og3VarA.f81036a);
        List list = og3VarA.f81037b;
        if (list.isEmpty()) {
            a();
        } else {
            rg3 rg3Var = this.f81851c;
            rg3Var.f82265b.a(rg3Var.f82264a, list, this, this.f81850b);
        }
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        a();
    }
}
