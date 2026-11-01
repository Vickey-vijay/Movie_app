package com.yandex.mobile.ads.rewarded;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@MainThread
public interface RewardedAd {
    List<Object> getAdAttributes();

    AdInfo getInfo();

    void setAdEventListener(RewardedAdEventListener rewardedAdEventListener);

    void show(Activity activity);
}
