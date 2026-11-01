package xe;

import android.app.Activity;
import com.facebook.ads.InterstitialAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f74460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f74461b;

    public p(c0 c0Var, Activity activity) {
        this.f74461b = c0Var;
        this.f74460a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f74461b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f74461b.D = new InterstitialAd(this.f74460a.getApplicationContext(), this.f74461b.E);
        InterstitialAd interstitialAd = this.f74461b.D;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(this.f74461b.F).build());
    }
}
