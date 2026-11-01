package com.ironsource.sdk.controller;

import android.os.Bundle;
import android.view.MotionEvent;
import com.ironsource.C3426d4;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes2.dex */
public class InterstitialActivity extends ControllerActivity {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f30765s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44960f, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f30765s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f30765s, C3426d4.i.f28567t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f30765s, C3426d4.i.f28569u0);
    }
}
