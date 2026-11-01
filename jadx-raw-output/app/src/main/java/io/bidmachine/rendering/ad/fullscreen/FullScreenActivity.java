package io.bidmachine.rendering.ad.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.rendering.internal.a;
import io.bidmachine.rendering.internal.b;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.util.UiUtils;

/* JADX INFO: loaded from: classes6.dex */
public class FullScreenActivity extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static FullScreenAd f59983b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FullScreenAd f59984a;

    private void c() {
        UiUtils.finishActivityWithoutAnimation(this);
        FullScreenAd fullScreenAd = this.f59984a;
        if (fullScreenAd != null) {
            fullScreenAd.r();
            this.f59984a = null;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "io.bidmachine");
        p10.startActivity(p11);
    }

    public static void show(@NonNull Context context, @NonNull FullScreenAd fullScreenAd) {
        try {
            f59983b = fullScreenAd;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, b.a(context, FullScreenActivity.class));
        } catch (Throwable unused) {
            f59983b = null;
            fullScreenAd.d(new Error("Ad is null"));
        }
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("io.bidmachine", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FullScreenAd fullScreenAd = f59983b;
        this.f59984a = fullScreenAd;
        if (fullScreenAd == null) {
            c();
        } else {
            fullScreenAd.b(this);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        if (f59983b == this.f59984a) {
            f59983b = null;
        }
        c();
    }
}
