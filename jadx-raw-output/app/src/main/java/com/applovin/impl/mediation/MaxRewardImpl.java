package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: classes3.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8035b;

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f8035b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f8034a;
    }

    @NonNull
    public String toString() {
        return "MaxReward{amount=" + this.f8035b + ", label=" + this.f8034a + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    private MaxRewardImpl(int i10, String str) {
        if (i10 >= 0) {
            this.f8034a = str;
            this.f8035b = i10;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }
}
