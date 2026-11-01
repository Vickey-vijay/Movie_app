package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: TopicsManagerApi33Ext4Impl.kt */
/* JADX INFO: loaded from: classes11.dex */
@RequiresExtension(extension = 1000000, version = 4)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class TopicsManagerApi33Ext4Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext4Impl(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Object systemService = context.getSystemService((Class<Object>) android.adservices.topics.TopicsManager.class);
        p.i(systemService, "context.getSystemService…opicsManager::class.java)");
        super((android.adservices.topics.TopicsManager) systemService);
    }
}
