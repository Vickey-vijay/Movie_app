package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import com.mbridge.msdk.out.strategy.base.NonBidAdHandler;
import com.mbridge.msdk.out.strategy.component.ComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.interstitial.NewInterstitialStrategy;

/* JADX INFO: loaded from: classes9.dex */
public class MBNewInterstitialHandler extends NonBidAdHandler {
    public MBNewInterstitialHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public void setIVRewardEnable(int i10, int i11) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.setIVRewardEnable(i10, i11);
        }
    }

    public MBNewInterstitialHandler(String str, String str2) {
        super(str, str2);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        }
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        IBaseVideoAdStrategy newInterstitialStrategy;
        if (checkComponentizedLogic()) {
            newInterstitialStrategy = new ComponentStrategy(str2, str, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        } else {
            newInterstitialStrategy = new NewInterstitialStrategy(str2, str);
        }
        this.iBaseVideoAdStrategy = newInterstitialStrategy;
    }

    public void setIVRewardEnable(int i10, double d10) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.setIVRewardEnable(i10, d10);
        }
    }
}
