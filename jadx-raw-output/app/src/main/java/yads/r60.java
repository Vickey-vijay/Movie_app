package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class r60 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f82107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f82108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(Context context, m70 m70Var) {
        super(0);
        this.f82107b = context;
        this.f82108c = m70Var;
    }

    @Override // bk.a
    public final Object invoke() {
        return new b71(this.f82107b, (v61) this.f82108c.f80119y.getValue());
    }
}
