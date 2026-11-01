package com.bytedance.sdk.openadsdk.core.cf.vt.ouw;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.yu;
import com.bytedance.adsdk.vt.le;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class vt extends le {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public yu f12666lh;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.vt.le, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.f12666lh;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // com.bytedance.adsdk.vt.le, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.f12666lh;
        if (yuVar != null) {
            yuVar.ra();
        }
    }
}
