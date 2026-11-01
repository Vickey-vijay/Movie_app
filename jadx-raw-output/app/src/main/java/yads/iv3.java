package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class iv3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv3 f78840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv3(jv3 jv3Var) {
        super(0);
        this.f78840b = jv3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f78840b.f79214a.onVideoComplete();
        return mj.r.f64562a;
    }
}
