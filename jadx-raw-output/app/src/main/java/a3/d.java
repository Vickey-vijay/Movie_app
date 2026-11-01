package a3;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import y2.k;

/* JADX INFO: compiled from: MintegralRtbNativeAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends z2.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MBBidNativeHandler f3437f;

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        ArrayList arrayList = new ArrayList(map3.values());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View view2 = (View) arrayList.get(i10);
            if (view2 instanceof MediaView) {
                MediaView mediaView = (MediaView) view2;
                for (int i11 = 0; i11 < mediaView.getChildCount(); i11++) {
                    View childAt = mediaView.getChildAt(i11);
                    if (childAt instanceof MBMediaView) {
                        ((MBMediaView) childAt).setOnMediaViewListener(this);
                        break;
                    }
                }
                break;
            }
        }
        MBBidNativeHandler mBBidNativeHandler = this.f3437f;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.registerView(view, arrayList, this.f85908b);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        MBBidNativeHandler mBBidNativeHandler = this.f3437f;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(view, b(view), this.f85908b);
        }
    }

    public d(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    public void c(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String string = mediationNativeAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        AdError adErrorH = k.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f85909c.onFailure(adErrorH);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        this.f3437f = new MBBidNativeHandler(nativeProperties, mediationNativeAdConfiguration.getContext());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("watermark", mediationNativeAdConfiguration.getWatermark());
            this.f3437f.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding native ad.", e10);
        }
        this.f3437f.setAdListener(new z2.e(this, mediationNativeAdConfiguration.getContext(), this.f85909c));
        this.f3437f.bidLoad(bidResponse);
    }
}
