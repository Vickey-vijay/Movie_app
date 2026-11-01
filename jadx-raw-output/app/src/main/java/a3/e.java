package a3;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import y2.i;
import y2.k;
import z2.f;

/* JADX INFO: compiled from: MintegralRtbRewardedAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y2.c f3438g;

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.f3438g.playVideoMute(this.f85922e ? 1 : 2);
        this.f3438g.showFromBid();
    }

    public e(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, y2.a aVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdError adErrorH = k.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f85919b.onFailure(adErrorH);
            return;
        }
        if (this.f85923f.a()) {
            i iVar = new i(string, string2);
            this.f85920c = iVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(iVar, new WeakReference<>(this));
        }
        y2.c cVarD = y2.e.d();
        this.f3438g = cVarD;
        cVarD.a(mediationRewardedAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("watermark", mediationRewardedAdConfiguration.getWatermark());
            this.f3438g.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding rewarded video ad.", e10);
        }
        this.f3438g.b(this);
        this.f3438g.loadFromBid(bidResponse);
    }
}
