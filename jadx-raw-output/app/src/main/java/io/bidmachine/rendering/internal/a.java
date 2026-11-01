package io.bidmachine.rendering.internal;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.window.OnBackInvokedCallback;
import androidx.core.view.ViewCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.util.UiUtilsKt;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends Activity {
    public void a() {
    }

    public void b() {
        UiUtilsKt.setActivityBackgroundColor(this, ViewCompat.MEASURED_STATE_MASK);
        UiUtilsKt.setNoActivityTransition(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("io.bidmachine", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: vh.a
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    io.bidmachine.rendering.internal.a.a(this.f73167a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar) {
        ck.p.j(aVar, "this$0");
        aVar.a();
    }
}
