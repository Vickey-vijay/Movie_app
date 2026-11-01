package v2;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import t2.e;
import t2.h;
import t2.i;

/* JADX INFO: compiled from: InMobiRtbBannerAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends u2.a {
    public a(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // u2.a
    public void b(@NonNull e eVar, @NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        h hVarA = i.a(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), "c_google");
        eVar.f(hVarA.b());
        eVar.g(hVarA.a());
        eVar.c(mediationBannerAdConfiguration.getBidResponse().getBytes());
    }

    public void c(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeB = t2.d.b(context, mediationBannerAdConfiguration.getAdSize());
        if (adSizeB == null) {
            adSizeB = mediationBannerAdConfiguration.getAdSize();
        }
        a(context, adSizeB, mediationBannerAdConfiguration);
    }
}
