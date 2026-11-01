package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import ck.p;
import com.ironsource.InterfaceC3811z3;
import com.ironsource.mediationsdk.adunit.adapter.BaseRewardedVideo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.r;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LevelPlayBaseRewardedVideo<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseRewardedVideo<NetworkAdapter> implements InterfaceC3811z3 {
    @Override // com.ironsource.InterfaceC3811z3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(biddingDataCallback, "biddingDataCallback");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseRewardedVideo(NetworkSettings networkSettings) {
        super(networkSettings);
        p.j(networkSettings, "networkSettings");
    }

    public final String getDynamicUserId() {
        return r.m().l();
    }
}
