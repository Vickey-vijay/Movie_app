package b3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import y2.h;
import y2.i;
import y2.k;
import z2.f;

/* JADX INFO: compiled from: MintegralWaterfallRewardedAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f4755g;

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.f4755g.playVideoMute(this.f85922e ? 1 : 2);
        this.f4755g.show();
    }

    public e(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, y2.a aVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = k.g(string, string2);
        if (adErrorG != null) {
            this.f85919b.onFailure(adErrorG);
            return;
        }
        if (this.f85923f.a()) {
            i iVar = new i(string, string2);
            this.f85920c = iVar;
            Map<i, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(iVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f85919b.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f85920c, new WeakReference<>(this));
        }
        h hVarE = y2.e.e();
        this.f4755g = hVarE;
        hVarE.a(mediationRewardedAdConfiguration.getContext(), string2, string);
        this.f4755g.b(this);
        this.f4755g.load();
    }
}
