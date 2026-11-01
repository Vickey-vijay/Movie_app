package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class gp3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hp3 f77905a;

    public final void a() {
        hp3 hp3Var = this.f77905a;
        to2 to2Var = hp3Var.f78299c;
        if (hp3Var.f78300d != 0 || to2Var == null) {
            return;
        }
        to2Var.onSuccess(hp3Var.f78298b);
    }

    public gp3(hp3 hp3Var) {
        this.f77905a = hp3Var;
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        hp3 hp3Var = this.f77905a;
        hp3Var.f78300d--;
        hp3Var.f78298b.addAll((List) obj);
        a();
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        this.f77905a.f78300d--;
        a();
    }
}
