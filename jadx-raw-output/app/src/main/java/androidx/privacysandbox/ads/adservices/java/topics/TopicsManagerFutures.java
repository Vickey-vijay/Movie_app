package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import ck.p;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import nk.j;
import nk.w0;
import q5.i;

/* JADX INFO: compiled from: TopicsManagerFutures.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class TopicsManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: TopicsManagerFutures.kt */
    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {
        private final TopicsManager mTopicsManager;

        public Api33Ext4JavaImpl(TopicsManager topicsManager) {
            p.j(topicsManager, "mTopicsManager");
            this.mTopicsManager = topicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
        @DoNotInline
        public i<GetTopicsResponse> getTopicsAsync(GetTopicsRequest getTopicsRequest) {
            p.j(getTopicsRequest, AdActivity.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(j.b(d.a(w0.c()), null, null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, getTopicsRequest, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: TopicsManagerFutures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final TopicsManagerFutures from(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            TopicsManager topicsManagerObtain = TopicsManager.Companion.obtain(context);
            if (topicsManagerObtain != null) {
                return new Api33Ext4JavaImpl(topicsManagerObtain);
            }
            return null;
        }
    }

    public static final TopicsManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract i<GetTopicsResponse> getTopicsAsync(GetTopicsRequest getTopicsRequest);
}
