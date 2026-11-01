package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.dash.offline.a;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import mj.r;
import rj.c;
import tj.f;

/* JADX INFO: compiled from: AdSelectionManager.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AdSelectionManager {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AdSelectionManager.kt */
    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final class Api33Ext4Impl extends AdSelectionManager {
        private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

        public Api33Ext4Impl(android.adservices.adselection.AdSelectionManager adSelectionManager) {
            p.j(adSelectionManager, "mAdSelectionManager");
            this.mAdSelectionManager = adSelectionManager;
        }

        private final android.adservices.adselection.AdSelectionConfig convertAdSelectionConfig(AdSelectionConfig adSelectionConfig) {
            android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = new android.adservices.adselection.AdSelectionConfig.Builder().setAdSelectionSignals(convertAdSelectionSignals(adSelectionConfig.getAdSelectionSignals())).setCustomAudienceBuyers(convertBuyers(adSelectionConfig.getCustomAudienceBuyers())).setDecisionLogicUri(adSelectionConfig.getDecisionLogicUri()).setSeller(AdTechIdentifier.fromString(adSelectionConfig.getSeller().getIdentifier())).setPerBuyerSignals(convertPerBuyerSignals(adSelectionConfig.getPerBuyerSignals())).setSellerSignals(convertAdSelectionSignals(adSelectionConfig.getSellerSignals())).setTrustedScoringSignalsUri(adSelectionConfig.getTrustedScoringSignalsUri()).build();
            p.i(adSelectionConfigBuild, "Builder()\n              …\n                .build()");
            return adSelectionConfigBuild;
        }

        private final List<AdTechIdentifier> convertBuyers(List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> it = list.iterator();
            while (it.hasNext()) {
                AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(it.next().getIdentifier());
                p.i(adTechIdentifierFromString, "fromString(buyer.identifier)");
                arrayList.add(adTechIdentifierFromString);
            }
            return arrayList;
        }

        private final Map<AdTechIdentifier, AdSelectionSignals> convertPerBuyerSignals(Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> map) {
            AdSelectionSignals adSelectionSignalsConvertAdSelectionSignals;
            HashMap map2 = new HashMap();
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : map.keySet()) {
                AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
                p.i(adTechIdentifierFromString, "fromString(key.identifier)");
                if (map.get(adTechIdentifier) != null) {
                    androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = map.get(adTechIdentifier);
                    p.g(adSelectionSignals);
                    adSelectionSignalsConvertAdSelectionSignals = convertAdSelectionSignals(adSelectionSignals);
                } else {
                    adSelectionSignalsConvertAdSelectionSignals = null;
                }
                map2.put(adTechIdentifierFromString, adSelectionSignalsConvertAdSelectionSignals);
            }
            return map2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest reportImpressionRequest) {
            return new android.adservices.adselection.ReportImpressionRequest(reportImpressionRequest.getAdSelectionId(), convertAdSelectionConfig(reportImpressionRequest.getAdSelectionConfig()));
        }

        private final AdSelectionOutcome convertResponse(android.adservices.adselection.AdSelectionOutcome adSelectionOutcome) {
            long adSelectionId = adSelectionOutcome.getAdSelectionId();
            Uri renderUri = adSelectionOutcome.getRenderUri();
            p.i(renderUri, "response.renderUri");
            return new AdSelectionOutcome(adSelectionId, renderUri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, c<? super android.adservices.adselection.AdSelectionOutcome> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mAdSelectionManager.selectAds(adSelectionConfig, new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB;
        }

        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object reportImpression(ReportImpressionRequest reportImpressionRequest, c<? super r> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mAdSelectionManager.reportImpression(convertReportImpressionRequest(reportImpressionRequest), new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB == sj.a.f() ? objB : r.f64562a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object selectAds(AdSelectionConfig adSelectionConfig, c<? super AdSelectionOutcome> cVar) throws Throwable {
            AdSelectionManager$Api33Ext4Impl$selectAds$1 adSelectionManager$Api33Ext4Impl$selectAds$1;
            Api33Ext4Impl api33Ext4Impl;
            if (cVar instanceof AdSelectionManager$Api33Ext4Impl$selectAds$1) {
                adSelectionManager$Api33Ext4Impl$selectAds$1 = (AdSelectionManager$Api33Ext4Impl$selectAds$1) cVar;
                int i10 = adSelectionManager$Api33Ext4Impl$selectAds$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    adSelectionManager$Api33Ext4Impl$selectAds$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    adSelectionManager$Api33Ext4Impl$selectAds$1 = new AdSelectionManager$Api33Ext4Impl$selectAds$1(this, cVar);
                }
            } else {
                adSelectionManager$Api33Ext4Impl$selectAds$1 = new AdSelectionManager$Api33Ext4Impl$selectAds$1(this, cVar);
            }
            Object objSelectAdsInternal = adSelectionManager$Api33Ext4Impl$selectAds$1.result;
            Object objF = sj.a.f();
            int i11 = adSelectionManager$Api33Ext4Impl$selectAds$1.label;
            if (i11 == 0) {
                kotlin.c.b(objSelectAdsInternal);
                android.adservices.adselection.AdSelectionConfig adSelectionConfigConvertAdSelectionConfig = convertAdSelectionConfig(adSelectionConfig);
                adSelectionManager$Api33Ext4Impl$selectAds$1.L$0 = this;
                adSelectionManager$Api33Ext4Impl$selectAds$1.label = 1;
                objSelectAdsInternal = selectAdsInternal(adSelectionConfigConvertAdSelectionConfig, adSelectionManager$Api33Ext4Impl$selectAds$1);
                if (objSelectAdsInternal == objF) {
                    return objF;
                }
                api33Ext4Impl = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                api33Ext4Impl = (Api33Ext4Impl) adSelectionManager$Api33Ext4Impl$selectAds$1.L$0;
                kotlin.c.b(objSelectAdsInternal);
            }
            return api33Ext4Impl.convertResponse((android.adservices.adselection.AdSelectionOutcome) objSelectAdsInternal);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            Object systemService = context.getSystemService((Class<Object>) android.adservices.adselection.AdSelectionManager.class);
            p.i(systemService, "context.getSystemService…:class.java\n            )");
            this((android.adservices.adselection.AdSelectionManager) systemService);
        }

        private final AdSelectionSignals convertAdSelectionSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            AdSelectionSignals adSelectionSignalsFromString = AdSelectionSignals.fromString(adSelectionSignals.getSignals());
            p.i(adSelectionSignalsFromString, "fromString(request.signals)");
            return adSelectionSignalsFromString;
        }
    }

    /* JADX INFO: compiled from: AdSelectionManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AdSelectionManager obtain(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final AdSelectionManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object reportImpression(ReportImpressionRequest reportImpressionRequest, c<? super r> cVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object selectAds(AdSelectionConfig adSelectionConfig, c<? super AdSelectionOutcome> cVar);
}
