package k;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends AppOpenAd.AppOpenAdLoadCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f62013c;

    public j(m mVar) {
        this.f62013c = mVar;
    }

    public final void a(AdValue adValue) {
        String str;
        this.f62013c.f(adValue.getValueMicros() / 1000000);
        this.f62013c.f61605z = "admob_" + this.f62013c.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f62013c.r(adValue);
        this.f62013c.G = new AdInfo();
        this.f62013c.G.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        if (precisionType == 0) {
            str = "UNKNOWN";
        } else if (precisionType != 1) {
            str = precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE";
        } else {
            str = "ESTIMATED";
        }
        this.f62013c.G.setRevenuePrecision(str);
        m mVar = this.f62013c;
        mVar.G.setNetworkName(mVar.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        super.onAdLoaded(appOpenAd);
        m mVar = this.f62013c;
        mVar.E = appOpenAd;
        mVar.F = System.currentTimeMillis();
        this.f62013c.E.setOnPaidEventListener(new OnPaidEventListener() { // from class: k.i
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f62011a.a(adValue);
            }
        });
        this.f62013c.D.onAdLoaded();
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f62013c.x(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }
}
