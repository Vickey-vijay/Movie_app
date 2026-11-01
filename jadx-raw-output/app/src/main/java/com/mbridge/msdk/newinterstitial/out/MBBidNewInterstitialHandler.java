package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import com.mbridge.msdk.out.strategy.base.BidAdHandler;
import com.mbridge.msdk.out.strategy.component.BidComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.interstitial.BidNewInterstitialStrategy;

/* JADX INFO: loaded from: classes9.dex */
public class MBBidNewInterstitialHandler extends BidAdHandler {
    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public void setIVRewardEnable(int i10, int i11) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.setIVRewardEnable(i10, i11);
        }
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        super(str, str2);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        }
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        IBaseVideoAdStrategy bidNewInterstitialStrategy;
        if (checkComponentizedLogic()) {
            bidNewInterstitialStrategy = new BidComponentStrategy(str2, str, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        } else {
            bidNewInterstitialStrategy = new BidNewInterstitialStrategy(str2, str);
        }
        this.iBaseVideoAdStrategy = bidNewInterstitialStrategy;
    }

    public void setIVRewardEnable(int i10, double d10) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.setIVRewardEnable(i10, d10);
        }
    }
}
