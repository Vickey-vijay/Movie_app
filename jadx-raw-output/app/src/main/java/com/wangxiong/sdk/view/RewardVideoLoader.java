package com.wangxiong.sdk.view;

import android.app.Activity;
import com.wangxiong.sdk.callBack.RewardVideoAdCallBack;
import com.yk.e.view.MainRewardVideoLoader;

/* JADX INFO: loaded from: classes2.dex */
public class RewardVideoLoader extends MainRewardVideoLoader {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    public RewardVideoLoader(Activity activity, String str, RewardVideoAdCallBack rewardVideoAdCallBack) {
        super(activity, str, rewardVideoAdCallBack);
    }

    @Override // com.yk.e.view.MainRewardVideoLoader
    public void loadAd() {
        super.loadAd();
    }

    @Override // com.yk.e.view.MainRewardVideoLoader
    public void setExtraMsg(String str) {
        super.setExtraMsg(str);
    }

    @Override // com.yk.e.view.MainRewardVideoLoader
    public void setOrientation(int i10) {
        super.setOrientation(i10);
    }

    @Override // com.yk.e.view.MainRewardVideoLoader
    public void setUserID(String str) {
        super.setUserID(str);
    }

    @Override // com.yk.e.view.MainRewardVideoLoader
    public void showAd() {
        super.showAd();
    }
}
