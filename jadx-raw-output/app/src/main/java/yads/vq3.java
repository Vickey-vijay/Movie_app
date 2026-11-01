package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class vq3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f83991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f83992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq3(wq3 wq3Var, String str) {
        super(0);
        this.f83991b = wq3Var;
        this.f83992c = str;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f83991b.f84299a.onBidderTokenLoaded(this.f83992c);
        return mj.r.f64562a;
    }
}
