package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import ck.p;
import com.ironsource.InterfaceC3811z3;
import com.ironsource.mediationsdk.adunit.adapter.BaseNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LevelPlayBaseNativeAd<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseNativeAd<NetworkAdapter> implements InterfaceC3811z3 {
    @Override // com.ironsource.InterfaceC3811z3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(biddingDataCallback, "biddingDataCallback");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseNativeAd(NetworkSettings networkSettings) {
        super(networkSettings);
        p.j(networkSettings, "networkSettings");
    }
}
