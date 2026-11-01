package h3;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleBannerView;

/* JADX INFO: compiled from: VungleRtbBannerAd.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends g3.b {
    public b(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        super(mediationAdLoadCallback, bVar);
    }

    @Override // g3.b
    public void d(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            vungleBannerView.getAdConfig().setWatermark(watermark);
        }
        vungleBannerView.load(bidResponse);
    }
}
