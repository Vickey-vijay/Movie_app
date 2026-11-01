package h3;

import ck.p;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;

/* JADX INFO: compiled from: VungleRtbAppOpenAd.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends g3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        super(mediationAdLoadCallback, bVar);
        p.j(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.j(bVar, "vungleFactory");
    }

    @Override // g3.a
    public String e(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.j(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        p.i(bidResponse, "getBidResponse(...)");
        return bidResponse;
    }

    @Override // g3.a
    public void f(AdConfig adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.j(adConfig, "adConfig");
        p.j(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        p.i(watermark, "getWatermark(...)");
        if (watermark.length() > 0) {
            adConfig.setWatermark(watermark);
        }
    }
}
