package androidx.privacysandbox.ads.adservices.java.appsetid;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetId;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import nk.j;
import nk.w0;
import q5.i;

/* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AppSetIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {
        private final AppSetIdManager mAppSetIdManager;

        public Api33Ext4JavaImpl(AppSetIdManager appSetIdManager) {
            p.j(appSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = appSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        @DoNotInline
        public i<AppSetId> getAppSetIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(j.b(d.a(w0.a()), null, null, new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final AppSetIdManagerFutures from(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            AppSetIdManager appSetIdManagerObtain = AppSetIdManager.Companion.obtain(context);
            if (appSetIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(appSetIdManagerObtain);
            }
            return null;
        }
    }

    public static final AppSetIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract i<AppSetId> getAppSetIdAsync();
}
