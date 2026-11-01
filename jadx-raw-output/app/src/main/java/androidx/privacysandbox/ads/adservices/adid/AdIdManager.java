package androidx.privacysandbox.ads.adservices.adid;

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
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import rj.c;
import tj.f;

/* JADX INFO: compiled from: AdIdManager.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AdIdManager {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AdIdManager.kt */
    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public static final class Api33Ext4Impl extends AdIdManager {
        private final android.adservices.adid.AdIdManager mAdIdManager;

        public Api33Ext4Impl(android.adservices.adid.AdIdManager adIdManager) {
            p.j(adIdManager, "mAdIdManager");
            this.mAdIdManager = adIdManager;
        }

        private final AdId convertResponse(android.adservices.adid.AdId adId) {
            String adId2 = adId.getAdId();
            p.i(adId2, "response.adId");
            return new AdId(adId2, adId.isLimitAdTrackingEnabled());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        public final Object getAdIdAsyncInternal(c<? super android.adservices.adid.AdId> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mAdIdManager.getAdId(new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        @DoNotInline
        public Object getAdId(c<? super AdId> cVar) throws Throwable {
            AdIdManager$Api33Ext4Impl$getAdId$1 adIdManager$Api33Ext4Impl$getAdId$1;
            Api33Ext4Impl api33Ext4Impl;
            if (cVar instanceof AdIdManager$Api33Ext4Impl$getAdId$1) {
                adIdManager$Api33Ext4Impl$getAdId$1 = (AdIdManager$Api33Ext4Impl$getAdId$1) cVar;
                int i10 = adIdManager$Api33Ext4Impl$getAdId$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    adIdManager$Api33Ext4Impl$getAdId$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    adIdManager$Api33Ext4Impl$getAdId$1 = new AdIdManager$Api33Ext4Impl$getAdId$1(this, cVar);
                }
            } else {
                adIdManager$Api33Ext4Impl$getAdId$1 = new AdIdManager$Api33Ext4Impl$getAdId$1(this, cVar);
            }
            Object adIdAsyncInternal = adIdManager$Api33Ext4Impl$getAdId$1.result;
            Object objF = sj.a.f();
            int i11 = adIdManager$Api33Ext4Impl$getAdId$1.label;
            if (i11 == 0) {
                kotlin.c.b(adIdAsyncInternal);
                adIdManager$Api33Ext4Impl$getAdId$1.L$0 = this;
                adIdManager$Api33Ext4Impl$getAdId$1.label = 1;
                adIdAsyncInternal = getAdIdAsyncInternal(adIdManager$Api33Ext4Impl$getAdId$1);
                if (adIdAsyncInternal == objF) {
                    return objF;
                }
                api33Ext4Impl = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                api33Ext4Impl = (Api33Ext4Impl) adIdManager$Api33Ext4Impl$getAdId$1.L$0;
                kotlin.c.b(adIdAsyncInternal);
            }
            return api33Ext4Impl.convertResponse((android.adservices.adid.AdId) adIdAsyncInternal);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            Object systemService = context.getSystemService((Class<Object>) android.adservices.adid.AdIdManager.class);
            p.i(systemService, "context.getSystemService…:class.java\n            )");
            this((android.adservices.adid.AdIdManager) systemService);
        }
    }

    /* JADX INFO: compiled from: AdIdManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AdIdManager obtain(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final AdIdManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract Object getAdId(c<? super AdId> cVar);
}
