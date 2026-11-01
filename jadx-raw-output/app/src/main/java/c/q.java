package c;

import android.app.Activity;
import android.os.Handler;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.VungleError;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import gl.r0;
import j.b2;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f5587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainRewardVideoAdCallBack f5588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f5589c;

    public q(d dVar, Activity activity, b2 b2Var) {
        this.f5589c = dVar;
        this.f5587a = activity;
        this.f5588b = b2Var;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f5589c.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        AdConfig adConfig = new AdConfig();
        adConfig.setAdOrientation(r0.h(this.f5587a) ? 1 : 0);
        d dVar = this.f5589c;
        dVar.G = new RewardedAd(this.f5587a, dVar.F, adConfig);
        this.f5589c.G.setAdListener(new q0(this));
        this.f5589c.G.load(null);
        new Handler().postDelayed(new l(this), this.f5589c.f61603x);
    }
}
