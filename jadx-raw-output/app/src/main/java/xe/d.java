package xe;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdPreloader;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f74438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f74439b;

    public d(j jVar, Activity activity) {
        this.f74439b = jVar;
        this.f74438a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f74439b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        if (!InterstitialAdPreloader.isAdAvailable(this.f74439b.H)) {
            AdRequest adRequestBuild = new AdRequest.Builder().build();
            Activity activity = this.f74438a;
            j jVar = this.f74439b;
            InterstitialAd.load(activity, jVar.H, adRequestBuild, jVar.I);
            return;
        }
        AdLog.i("Preloaded interstitial ad " + this.f74439b.H + " AD_UNIT_ID is available.");
        j jVar2 = this.f74439b;
        jVar2.E = InterstitialAdPreloader.pollAd(jVar2.H);
        this.f74439b.E();
    }
}
