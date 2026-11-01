package a3;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import y2.i;
import y2.k;

/* JADX INFO: compiled from: MintegralRtbAppOpenAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends z2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3435g;

    public final void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("watermark", str);
            this.f85898e.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding app open ad.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        Activity activity = (Activity) context;
        if (this.f85898e != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.f85898e.d(relativeLayout, this.f3435g);
        }
    }

    public a(@NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, y2.a aVar) {
        super(mediationAdLoadCallback, aVar);
    }

    public void a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        this.f3435g = bidResponse;
        AdError adErrorH = k.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f85895b.onFailure(adErrorH);
            return;
        }
        if (this.f85899f.a()) {
            i iVar = new i(string, string2);
            this.f85896c = iVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(iVar, new WeakReference<>(this));
        }
        this.f85898e = y2.e.f();
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            b(watermark);
        }
        this.f85898e.b(string2, string);
        this.f85898e.c(this);
        this.f85898e.f(this);
        this.f85898e.e(this.f3435g);
    }
}
