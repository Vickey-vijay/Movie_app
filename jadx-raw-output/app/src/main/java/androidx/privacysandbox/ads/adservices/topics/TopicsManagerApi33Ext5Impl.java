package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import ck.p;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: TopicsManagerApi33Ext5Impl.kt */
/* JADX INFO: loaded from: classes7.dex */
@RequiresExtension(extension = 1000000, version = 5)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext5Impl(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Object systemService = context.getSystemService((Class<Object>) android.adservices.topics.TopicsManager.class);
        p.i(systemService, "context.getSystemService…opicsManager::class.java)");
        super((android.adservices.topics.TopicsManager) systemService);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest getTopicsRequest) {
        p.j(getTopicsRequest, AdActivity.REQUEST_KEY_EXTRA);
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = new android.adservices.topics.GetTopicsRequest.Builder().setAdsSdkName(getTopicsRequest.getAdsSdkName()).setShouldRecordObservation(getTopicsRequest.shouldRecordObservation()).build();
        p.i(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
