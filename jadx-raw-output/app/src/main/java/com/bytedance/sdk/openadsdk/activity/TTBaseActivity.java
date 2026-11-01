package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.window.OnBackInvokedCallback;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.utils.jqy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes9.dex */
public class TTBaseActivity extends Activity {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public String f12008jg;
    public boolean mwh = false;
    private OnBackInvokedCallback ouw;

    public static class ouw implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> ouw;

        @Override // android.window.OnBackInvokedCallback
        public final void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.ouw.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.vt();
            }
        }

        public ouw(TTBaseActivity tTBaseActivity) {
            this.ouw = new WeakReference<>(tTBaseActivity);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void fkw() {
        this.mwh = true;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (ouw() && jqy.ouw()) {
            this.ouw = new ouw(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.ouw);
        }
    }

    public boolean ouw() {
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            super.onPause();
        } catch (IllegalArgumentException e10) {
            ko.lh("TTBaseActivity", "super.onPause(); run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                ko.lh("TTBaseActivity", "onPause() set mCalled fail", e11);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT > 28) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e10) {
            qbp.ouw("TTBaseActivity", "super.onResume() run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                qbp.ouw("TTBaseActivity", "onResume set mCalled fail", e11);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (jqy.ouw() && this.ouw != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.ouw);
            this.ouw = null;
        }
    }

    public void vt() {
        onBackPressed();
    }
}
