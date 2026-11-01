package com.ironsource.mediationsdk.adapter;

import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractNativeAdAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements NativeAdAdapterInterface {
    public void destroyNativeAd(JSONObject jSONObject) {
        p.j(jSONObject, "config");
    }

    public Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        p.j(jSONObject, "config");
        return null;
    }

    public void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        p.j(jSONObject, "config");
        p.j(nativeAdSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        p.j(jSONObject, "config");
        p.j(nativeAdSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(JSONObject jSONObject, JSONObject jSONObject2, NativeAdSmashListener nativeAdSmashListener) {
        p.j(jSONObject, "config");
        p.j(nativeAdSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public void loadNativeAdForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, NativeAdSmashListener nativeAdSmashListener) {
        p.j(jSONObject, "config");
        p.j(nativeAdSmashListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        p.j(jSONObject, "config");
        p.j(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(jSONObject, jSONObject2);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public final NativeAdProperties getNativeAdProperties(JSONObject jSONObject) {
        p.j(jSONObject, "config");
        return new NativeAdProperties(jSONObject);
    }

    public AbstractNativeAdAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }
}
