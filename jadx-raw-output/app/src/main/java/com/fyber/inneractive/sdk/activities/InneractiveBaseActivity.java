package com.fyber.inneractive.sdk.activities;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes10.dex */
public class InneractiveBaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f14826a;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44970p, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        if (frameLayout != null && Build.VERSION.SDK_INT >= 35) {
            frameLayout.setOnApplyWindowInsetsListener(new com.fyber.inneractive.sdk.util.m());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            this.f14826a = new b(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f14826a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.f14826a != null) {
                    getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f14826a);
                    this.f14826a = null;
                }
            } catch (Exception e10) {
                IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e10.getMessage());
            }
        }
    }
}
