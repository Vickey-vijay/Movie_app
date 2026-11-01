package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.o1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public final class MaxCreativeDebuggerDisplayedAdActivity extends o1 {
    @Override // com.applovin.impl.o1, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }
}
