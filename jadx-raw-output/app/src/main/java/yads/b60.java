package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class b60 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m70 f75736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f75737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(Context context, m70 m70Var) {
        super(0);
        this.f75736b = m70Var;
        this.f75737c = context;
    }

    @Override // bk.a
    public final Object invoke() {
        dw2 dw2Var = (dw2) this.f75736b.f80096b.getValue();
        ww wwVar = xw.f84720a;
        Context context = this.f75737c;
        wwVar.getClass();
        return new ez(dw2Var, ww.a(context));
    }
}
