package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import yads.hu3;
import yads.iu3;
import yads.r10;
import yads.zp3;

/* JADX INFO: loaded from: classes5.dex */
@MainThread
public final class RewardedAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r10 f51147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zp3 f51148b = new zp3();

    public final void loadAd(AdRequestConfiguration adRequestConfiguration) {
        this.f51147a.f82069a.a(this.f51148b.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(RewardedAdLoadListener rewardedAdLoadListener) {
        this.f51147a.f82069a.a(rewardedAdLoadListener != null ? new hu3(rewardedAdLoadListener) : null);
    }

    public RewardedAdLoader(Context context) {
        this.f51147a = new r10(context, new iu3(context));
    }
}
