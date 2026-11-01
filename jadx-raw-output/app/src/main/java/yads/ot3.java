package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class ot3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt3 f81145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.yandex.mobile.ads.nativeads.d f81146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot3(pt3 pt3Var, com.yandex.mobile.ads.nativeads.d dVar) {
        super(0);
        this.f81145b = pt3Var;
        this.f81146c = dVar;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f81145b.f81591a.onAdLoaded(this.f81146c);
        return mj.r.f64562a;
    }
}
