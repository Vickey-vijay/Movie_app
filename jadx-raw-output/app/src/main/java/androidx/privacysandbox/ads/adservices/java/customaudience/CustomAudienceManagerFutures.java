package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import ck.p;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import mj.r;
import nk.j;
import nk.w0;
import q5.i;

/* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class CustomAudienceManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        private final CustomAudienceManager mCustomAudienceManager;

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public i<r> joinCustomAudienceAsync(JoinCustomAudienceRequest joinCustomAudienceRequest) {
            p.j(joinCustomAudienceRequest, AdActivity.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(j.b(d.a(w0.a()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, joinCustomAudienceRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public i<r> leaveCustomAudienceAsync(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            p.j(leaveCustomAudienceRequest, AdActivity.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(j.b(d.a(w0.a()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, leaveCustomAudienceRequest, null), 3, null), null, 1, null);
        }

        public Api33Ext4JavaImpl(CustomAudienceManager customAudienceManager) {
            this.mCustomAudienceManager = customAudienceManager;
        }
    }

    /* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final CustomAudienceManagerFutures from(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            CustomAudienceManager customAudienceManagerObtain = CustomAudienceManager.Companion.obtain(context);
            if (customAudienceManagerObtain != null) {
                return new Api33Ext4JavaImpl(customAudienceManagerObtain);
            }
            return null;
        }
    }

    public static final CustomAudienceManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract i<r> joinCustomAudienceAsync(JoinCustomAudienceRequest joinCustomAudienceRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract i<r> leaveCustomAudienceAsync(LeaveCustomAudienceRequest leaveCustomAudienceRequest);
}
