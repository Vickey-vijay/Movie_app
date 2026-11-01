package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.content.Context;
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
import java.util.List;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import mj.r;
import rj.c;
import tj.f;

/* JADX INFO: compiled from: CustomAudienceManager.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class CustomAudienceManager {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: CustomAudienceManager.kt */
    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public static final class Api33Ext4Impl extends CustomAudienceManager {
        private final android.adservices.customaudience.CustomAudienceManager customAudienceManager;

        public Api33Ext4Impl(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
            p.j(customAudienceManager, "customAudienceManager");
            this.customAudienceManager = customAudienceManager;
        }

        private final List<AdData> convertAdData(List<androidx.privacysandbox.ads.adservices.common.AdData> list) {
            ArrayList arrayList = new ArrayList();
            for (androidx.privacysandbox.ads.adservices.common.AdData adData : list) {
                AdData adDataBuild = new AdData.Builder().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).build();
                p.i(adDataBuild, "Builder()\n              …                 .build()");
                arrayList.add(adDataBuild);
            }
            return arrayList;
        }

        private final AdSelectionSignals convertBiddingSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            if (adSelectionSignals == null) {
                return null;
            }
            return AdSelectionSignals.fromString(adSelectionSignals.getSignals());
        }

        private final android.adservices.customaudience.CustomAudience convertCustomAudience(CustomAudience customAudience) {
            android.adservices.customaudience.CustomAudience customAudienceBuild = new android.adservices.customaudience.CustomAudience.Builder().setActivationTime(customAudience.getActivationTime()).setAds(convertAdData(customAudience.getAds())).setBiddingLogicUri(customAudience.getBiddingLogicUri()).setBuyer(convertAdTechIdentifier(customAudience.getBuyer())).setDailyUpdateUri(customAudience.getDailyUpdateUri()).setExpirationTime(customAudience.getExpirationTime()).setName(customAudience.getName()).setTrustedBiddingData(convertTrustedSignals(customAudience.getTrustedBiddingSignals())).setUserBiddingSignals(convertBiddingSignals(customAudience.getUserBiddingSignals())).build();
            p.i(customAudienceBuild, "Builder()\n              …\n                .build()");
            return customAudienceBuild;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.customaudience.JoinCustomAudienceRequest convertJoinRequest(JoinCustomAudienceRequest joinCustomAudienceRequest) {
            android.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequestBuild = new android.adservices.customaudience.JoinCustomAudienceRequest.Builder().setCustomAudience(convertCustomAudience(joinCustomAudienceRequest.getCustomAudience())).build();
            p.i(joinCustomAudienceRequestBuild, "Builder()\n              …\n                .build()");
            return joinCustomAudienceRequestBuild;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.customaudience.LeaveCustomAudienceRequest convertLeaveRequest(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            android.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = new android.adservices.customaudience.LeaveCustomAudienceRequest.Builder().setBuyer(convertAdTechIdentifier(leaveCustomAudienceRequest.getBuyer())).setName(leaveCustomAudienceRequest.getName()).build();
            p.i(leaveCustomAudienceRequestBuild, "Builder()\n              …\n                .build()");
            return leaveCustomAudienceRequestBuild;
        }

        private final android.adservices.customaudience.TrustedBiddingData convertTrustedSignals(TrustedBiddingData trustedBiddingData) {
            if (trustedBiddingData == null) {
                return null;
            }
            return new android.adservices.customaudience.TrustedBiddingData.Builder().setTrustedBiddingKeys(trustedBiddingData.getTrustedBiddingKeys()).setTrustedBiddingUri(trustedBiddingData.getTrustedBiddingUri()).build();
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, c<? super r> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.customAudienceManager.joinCustomAudience(convertJoinRequest(joinCustomAudienceRequest), new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB == sj.a.f() ? objB : r.f64562a;
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, c<? super r> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.customAudienceManager.leaveCustomAudience(convertLeaveRequest(leaveCustomAudienceRequest), new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB == sj.a.f() ? objB : r.f64562a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            Object systemService = context.getSystemService((Class<Object>) android.adservices.customaudience.CustomAudienceManager.class);
            p.i(systemService, "context.getSystemService…:class.java\n            )");
            this((android.adservices.customaudience.CustomAudienceManager) systemService);
        }

        private final AdTechIdentifier convertAdTechIdentifier(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier) {
            AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
            p.i(adTechIdentifierFromString, "fromString(input.identifier)");
            return adTechIdentifierFromString;
        }
    }

    /* JADX INFO: compiled from: CustomAudienceManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final CustomAudienceManager obtain(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final CustomAudienceManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, c<? super r> cVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, c<? super r> cVar);
}
