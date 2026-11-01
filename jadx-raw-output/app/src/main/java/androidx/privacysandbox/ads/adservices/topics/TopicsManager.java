package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import rj.c;

/* JADX INFO: compiled from: TopicsManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class TopicsManager {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: TopicsManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final TopicsManager obtain(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            if (adServicesInfo.version() >= 5) {
                return new TopicsManagerApi33Ext5Impl(context);
            }
            if (adServicesInfo.version() == 4) {
                return new TopicsManagerApi33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final TopicsManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract Object getTopics(GetTopicsRequest getTopicsRequest, c<? super GetTopicsResponse> cVar);
}
