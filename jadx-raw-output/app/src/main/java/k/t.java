package k;

import android.app.Activity;
import com.facebook.ads.InterstitialAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f62033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f62034b;

    public t(l0 l0Var, Activity activity) {
        this.f62034b = l0Var;
        this.f62033a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f62034b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f62034b.E = new InterstitialAd(this.f62033a.getApplicationContext(), this.f62034b.F);
        InterstitialAd interstitialAd = this.f62034b.E;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(this.f62034b.G).build());
    }
}
