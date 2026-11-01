package io.appmetrica.analytics.adrevenue.ironsource.v9.impl;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements LevelPlayImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f54418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f54419b = new b();

    @Override // com.unity3d.mediation.impression.LevelPlayImpressionDataListener
    public final void onImpressionSuccess(LevelPlayImpressionData levelPlayImpressionData) {
        ModuleAdType moduleAdType;
        if (levelPlayImpressionData != null) {
            InternalClientModuleFacade internalClientModuleFacade = this.f54418a.getInternalClientModuleFacade();
            this.f54419b.getClass();
            String adFormat = levelPlayImpressionData.getAdFormat();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefaultNullable(levelPlayImpressionData.getRevenue(), 0.0d));
            Currency currency = Currency.getInstance("USD");
            if (adFormat != null) {
                switch (adFormat) {
                    case "banner":
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    case "rewarded_video":
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case "interstitial":
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, levelPlayImpressionData.getAdNetwork(), levelPlayImpressionData.getMediationAdUnitId(), levelPlayImpressionData.getMediationAdUnitName(), null, levelPlayImpressionData.getPlacement(), levelPlayImpressionData.getPrecision(), new a(adFormat), true));
        }
    }

    public c(ClientContext clientContext) {
        this.f54418a = clientContext;
    }
}
