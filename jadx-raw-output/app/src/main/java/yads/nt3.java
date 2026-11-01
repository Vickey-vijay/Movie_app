package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class nt3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt3 f80807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f80808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt3(pt3 pt3Var, AdRequestError adRequestError) {
        super(0);
        this.f80807b = pt3Var;
        this.f80808c = adRequestError;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f80807b.f81591a.onAdFailedToLoad(this.f80808c);
        return mj.r.f64562a;
    }
}
