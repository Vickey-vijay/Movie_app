package com.bytedance.sdk.openadsdk.core.cf.vt.vt;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw extends com.bytedance.adsdk.ugeno.bly.vt.ouw {
    private final com.bytedance.adsdk.ugeno.bly.vt.ouw vt;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.ugeno.bly.vt.ouw, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final com.bytedance.adsdk.ugeno.bly.vt.ouw getPlayableView() {
        return this.vt;
    }

    public ouw(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.vt.ouw(context);
        this.vt = ouwVar;
        addView(ouwVar, new FrameLayout.LayoutParams(-1, -1));
    }
}
