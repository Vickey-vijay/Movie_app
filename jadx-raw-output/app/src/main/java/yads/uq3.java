package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class uq3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f83584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f83585c = "Cannot load bidder token. Token generation failed";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq3(wq3 wq3Var) {
        super(0);
        this.f83584b = wq3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f83584b.f84299a.onBidderTokenFailedToLoad(this.f83585c);
        return mj.r.f64562a;
    }
}
