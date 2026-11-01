package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class hr3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kr3 f78337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f78338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr3(kr3 kr3Var, lr3 lr3Var) {
        super(0);
        this.f78337b = kr3Var;
        this.f78338c = lr3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f78337b.f79529a.onImpression(this.f78338c);
        return mj.r.f64562a;
    }
}
