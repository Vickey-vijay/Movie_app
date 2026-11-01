package v2;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import t2.h;
import t2.i;
import t2.j;

/* JADX INFO: compiled from: InMobiRtbInterstitialAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends u2.b {
    public b(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // u2.b
    public void b(@NonNull j jVar, @NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        h hVarA = i.a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), "c_google");
        jVar.d(hVarA.b());
        jVar.e(hVarA.a());
        jVar.c(mediationInterstitialAdConfiguration.getBidResponse().getBytes());
    }

    public void c(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration);
    }
}
