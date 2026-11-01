package b3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import y2.g;
import y2.i;
import y2.k;

/* JADX INFO: compiled from: MintegralWaterfallInterstitialAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends z2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f4753g;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f4753g.playVideoMute(this.f85906e ? 1 : 2);
        this.f4753g.show();
    }

    public c(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, y2.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = k.g(string, string2);
        if (adErrorG != null) {
            this.f85903b.onFailure(adErrorG);
            return;
        }
        if (this.f85907f.a()) {
            i iVar = new i(string, string2);
            this.f85904c = iVar;
            Map<i, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(iVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f85903b.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f85904c, new WeakReference<>(this));
        }
        g gVarB = y2.e.b();
        this.f4753g = gVarB;
        gVarB.a(mediationInterstitialAdConfiguration.getContext(), string2, string);
        this.f4753g.b(this);
        this.f4753g.load();
    }
}
