package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import ck.p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.Pair;
import mj.h;
import nj.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ModuleAdRevenueProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f54407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClientContext f54408b;

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        ModuleAdType moduleAdType;
        String label;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        Object objR = n.R(objArr, 0);
        if (objR == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) objR;
        Object objR2 = n.R(objArr, 1);
        if (objR2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) objR2;
        this.f54407a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        if (format == null) {
            moduleAdType = null;
        } else if (p.e(format, MaxAdFormat.NATIVE)) {
            moduleAdType = ModuleAdType.NATIVE;
        } else if (p.e(format, MaxAdFormat.BANNER)) {
            moduleAdType = ModuleAdType.BANNER;
        } else if (p.e(format, MaxAdFormat.REWARDED)) {
            moduleAdType = ModuleAdType.REWARDED;
        } else if (p.e(format, MaxAdFormat.INTERSTITIAL)) {
            moduleAdType = ModuleAdType.INTERSTITIAL;
        } else {
            moduleAdType = p.e(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        }
        ModuleAdType moduleAdType2 = moduleAdType;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = h.a("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        pairArr[1] = h.a(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (label = format2.getLabel()) == null) {
            label = "null";
        }
        pairArr[2] = h.a(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, label);
        pairArr[3] = h.a("source", "applovin");
        this.f54408b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType2, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), kotlin.collections.a.m(pairArr), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }

    public b(a aVar, ClientContext clientContext) {
        this.f54407a = aVar;
        this.f54408b = clientContext;
    }
}
