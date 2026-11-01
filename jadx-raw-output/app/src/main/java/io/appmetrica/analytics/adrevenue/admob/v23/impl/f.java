package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends e {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, InterstitialAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue) objArr[0];
        InterstitialAd interstitialAd = (InterstitialAd) objArr[1];
        this.f54405a.getClass();
        a(b.a(adValue, ModuleAdType.INTERSTITIAL, "interstitialAd", interstitialAd.getResponseInfo(), interstitialAd.getAdUnitId()));
        return true;
    }

    public f(@NonNull b bVar, @NonNull ClientContext clientContext) {
        super(bVar, clientContext);
    }
}
