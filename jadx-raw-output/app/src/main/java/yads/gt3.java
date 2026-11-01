package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class gt3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt3 f77934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f77935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt3(jt3 jt3Var, lr3 lr3Var) {
        super(0);
        this.f77934b = jt3Var;
        this.f77935c = lr3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f77934b.f79180a.onImpression(this.f77935c);
        return mj.r.f64562a;
    }
}
