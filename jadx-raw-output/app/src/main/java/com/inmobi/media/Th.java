package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Th implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23579b;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44963i);
        p10.startActivity(p11);
    }

    @Override // com.inmobi.media.Ma
    public final void a() {
        this.f23578a.getListener().a();
    }

    public Th(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Context context) {
        this.f23578a = gestureDetectorOnGestureListenerC2785ci;
        this.f23579b = context;
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, String str2, String str3) {
        ck.p.j(str2, "message");
        this.f23578a.a(str, str2, str3);
    }

    @Override // com.inmobi.media.Ma
    public final void b(String str, String str2, String str3) {
        this.f23578a.b(str, str2, str3);
    }

    @Override // com.inmobi.media.Ma
    public final void a(Intent intent) {
        ck.p.j(intent, "intent");
        intent.putExtra("creativeId", this.f23578a.getCreativeId());
        intent.putExtra("impressionId", this.f23578a.getImpressionId());
        intent.putExtra("placementId", this.f23578a.getPlacementId());
        SparseArray sparseArray = InMobiAdActivity.f22317k;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f23578a;
        InMobiAdActivity.f22318l = gestureDetectorOnGestureListenerC2785ci;
        if (gestureDetectorOnGestureListenerC2785ci.getPlacementType() == 0) {
            Context context = Ji.f22951a;
            Activity activity = this.f23578a.getBannerHolderActivity().get();
            if (activity == null) {
                activity = this.f23579b;
            }
            ck.p.j(activity, GAMConfig.KEY_CONTEXT);
            ck.p.j(intent, "intent");
            if (!(activity instanceof Activity)) {
                intent.setFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(activity, intent);
            return;
        }
        Context context2 = Ji.f22951a;
        Context containerContext = this.f23578a.getContainerContext();
        ck.p.j(containerContext, GAMConfig.KEY_CONTEXT);
        ck.p.j(intent, "intent");
        if (!(containerContext instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(containerContext, intent);
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, Map map) {
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f23578a;
        if (gestureDetectorOnGestureListenerC2785ci.f24154e) {
            return;
        }
        gestureDetectorOnGestureListenerC2785ci.b(str, map);
    }
}
