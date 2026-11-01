package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.mediation.debugger.ui.testmode.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class MaxDebuggerMultiAdActivity extends a {
    @Override // com.applovin.impl.mediation.debugger.ui.testmode.a, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }
}
