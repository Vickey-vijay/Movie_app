package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class lw0 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mw0 f79950b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw0(mw0 mw0Var) {
        super(0);
        this.f79950b = mw0Var;
    }

    @Override // bk.a
    public final Object invoke() {
        Context context = this.f79950b.f80407a;
        cp2 cp2VarA = dp2.a(context, j82.a(context));
        cp2VarA.a();
        return cp2VarA;
    }
}
