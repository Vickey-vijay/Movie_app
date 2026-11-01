package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class mr3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr3 f80345b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr3(nr3 nr3Var) {
        super(0);
        this.f80345b = nr3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f80345b.f80738a.onInitializationCompleted();
        return mj.r.f64562a;
    }
}
