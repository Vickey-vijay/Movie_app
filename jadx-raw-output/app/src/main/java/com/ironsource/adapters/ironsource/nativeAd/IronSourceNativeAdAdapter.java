package com.ironsource.adapters.ironsource.nativeAd;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.ironsource.C3676r4;
import com.ironsource.E8;
import com.ironsource.Q6;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private E8 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter ironSourceAdapter) {
        super(ironSourceAdapter);
        p.j(ironSourceAdapter, Q6.G1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter ironSourceNativeAdAdapter, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener, String str) {
        p.j(ironSourceNativeAdAdapter, "this$0");
        p.j(jSONObject, "$config");
        p.j(nativeAdSmashListener, "$listener");
        try {
            E8 e8A = E8.f26449j.a();
            e8A.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(e8A, ironSourceNativeAdAdapter.getNativeAdProperties(jSONObject)), nativeAdSmashListener));
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject jSONObjectPrepareLoadParams = ironSourceNativeAdAdapter.prepareLoadParams(jSONObject, str);
            p.i(currentActiveActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            e8A.a(currentActiveActivity, jSONObjectPrepareLoadParams);
            ironSourceNativeAdAdapter.nativeAd = e8A;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            nativeAdSmashListener.onNativeAdLoadFailed(new IronSourceError(510, "IronSourceAdapter loadNativeAd exception " + e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject jSONObject) {
        p.j(jSONObject, "config");
        E8 e10 = this.nativeAd;
        if (e10 != null) {
            e10.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        p.j(jSONObject, "config");
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        p.j(jSONObject, "config");
        p.j(nativeAdSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getAdapter().initSDK(str, jSONObject);
        nativeAdSmashListener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(final JSONObject jSONObject, JSONObject jSONObject2, final String str, final NativeAdSmashListener nativeAdSmashListener) {
        p.j(jSONObject, "config");
        p.j(nativeAdSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        postOnUIThread(new Runnable() { // from class: e7.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0(this.f52453b, jSONObject, nativeAdSmashListener, str);
            }
        });
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(C3426d4.f28401s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        HashMap<String, String> initParams = getAdapter().getInitParams();
        p.i(initParams, "extraParams");
        for (Map.Entry<String, String> entry : initParams.entrySet()) {
            jSONObjectPut.put(entry.getKey(), entry.getValue());
        }
        p.i(jSONObjectPut, "loadParams");
        return jSONObjectPut;
    }
}
