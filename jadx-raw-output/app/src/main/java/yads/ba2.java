package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class ba2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw2 f75770a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba2() {
        this(cw2.a());
        Object obj = dw2.f76819j;
    }

    public ba2(dw2 dw2Var) {
        this.f75770a = dw2Var;
    }

    public final boolean a(Context context) {
        nt2 nt2VarA;
        if (tb.a(context) && (nt2VarA = this.f75770a.a(context)) != null && !nt2VarA.f80799w) {
            return true;
        }
        return false;
    }
}
