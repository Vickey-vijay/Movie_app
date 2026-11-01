package q2;

import androidx.annotation.NonNull;
import com.facebook.ads.AdExperienceType;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: compiled from: FacebookRewardedInterstitialAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends b {
    @Override // q2.b
    @NonNull
    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
    }

    public c(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, e eVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, eVar);
    }
}
