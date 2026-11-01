package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.j8;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public class MaxDebuggerWaterfallSegmentsActivity extends j8 {
    @Override // com.applovin.impl.j8, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }
}
