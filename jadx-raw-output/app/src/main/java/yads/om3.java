package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class om3 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f81108a = null;

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        be3 be3Var;
        if (im3Var.f78724b == null) {
            String message = im3Var.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            be3Var = new be3(message);
        } else {
            be3Var = new be3("Ping error");
        }
        to2 to2Var = this.f81108a;
        if (to2Var != null) {
            to2Var.a(be3Var);
        }
    }

    @Override // yads.up2
    public final void a(Object obj) {
        e82 e82Var = (e82) obj;
        to2 to2Var = this.f81108a;
        if (to2Var != null) {
            to2Var.onSuccess(e82Var);
        }
    }
}
