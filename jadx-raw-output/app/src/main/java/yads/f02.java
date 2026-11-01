package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class f02 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi2 f77256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u41 f77257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f02(mi2 mi2Var, u41 u41Var) {
        super(0);
        this.f77256b = mi2Var;
        this.f77257c = u41Var;
    }

    @Override // bk.a
    public final Object invoke() {
        return this.f77256b.a(this.f77257c);
    }
}
