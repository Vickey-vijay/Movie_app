package androidx.privacysandbox.ads.adservices.java.adid;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adid.AdId;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import nk.j;
import nk.w0;
import q5.i;

/* JADX INFO: compiled from: AdIdManagerFutures.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AdIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AdIdManagerFutures.kt */
    public static final class Api33Ext4JavaImpl extends AdIdManagerFutures {
        private final AdIdManager mAdIdManager;

        public Api33Ext4JavaImpl(AdIdManager adIdManager) {
            p.j(adIdManager, "mAdIdManager");
            this.mAdIdManager = adIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        @DoNotInline
        public i<AdId> getAdIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(j.b(d.a(w0.a()), null, null, new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AdIdManagerFutures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final AdIdManagerFutures from(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            AdIdManager adIdManagerObtain = AdIdManager.Companion.obtain(context);
            if (adIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(adIdManagerObtain);
            }
            return null;
        }
    }

    public static final AdIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract i<AdId> getAdIdAsync();
}
