package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class hu0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu0 f78380a;

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        Context context = view.getContext();
        this.f78380a.a(context, (gu0) m0Var);
        return new o01(false, null);
    }

    public hu0(pu0 pu0Var) {
        this.f78380a = pu0Var;
    }
}
