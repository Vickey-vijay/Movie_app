package a3;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import y2.i;
import y2.k;

/* JADX INFO: compiled from: MintegralRtbInterstitialAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends z2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y2.b f3436g;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f3436g.playVideoMute(this.f85906e ? 1 : 2);
        this.f3436g.showFromBid();
    }

    public c(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, y2.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdError adErrorH = k.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f85903b.onFailure(adErrorH);
            return;
        }
        if (this.f85907f.a()) {
            i iVar = new i(string, string2);
            this.f85904c = iVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(iVar, new WeakReference<>(this));
        }
        y2.b bVarA = y2.e.a();
        this.f3436g = bVarA;
        bVarA.a(mediationInterstitialAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("watermark", mediationInterstitialAdConfiguration.getWatermark());
            this.f3436g.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding interstitial ad.", e10);
        }
        this.f3436g.b(this);
        this.f3436g.loadFromBid(bidResponse);
    }
}
