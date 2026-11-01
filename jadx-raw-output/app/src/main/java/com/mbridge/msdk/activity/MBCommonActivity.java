package com.mbridge.msdk.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public class MBCommonActivity extends DomainMBCommonActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32534e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32535d = false;

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44969o, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void finish() {
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView browserViewRemove = b.f35466a.remove(this.f32523a);
        if (browserViewRemove != null) {
            browserViewRemove.setListener(null);
            browserViewRemove.destroy();
        }
        this.f32535d = true;
        super.finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f32535d) {
            BrowserView browserView = this.browserView;
            if (browserView != null) {
                browserView.setListener(null);
                this.browserView.destroy();
            }
            BrowserView browserViewRemove = b.f35466a.remove(this.f32523a);
            if (browserViewRemove != null) {
                browserViewRemove.setListener(null);
                browserViewRemove.destroy();
            }
        }
    }
}
