package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class rf0 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f82249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f82250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(z1 z1Var, long j10) {
        super(1);
        this.f82249b = z1Var;
        this.f82250c = j10;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        this.f82249b.a(this.f82250c);
        return mj.r.f64562a;
    }
}
