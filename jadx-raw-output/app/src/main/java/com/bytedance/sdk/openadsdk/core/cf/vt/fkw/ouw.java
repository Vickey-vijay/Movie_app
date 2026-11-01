package com.bytedance.sdk.openadsdk.core.cf.vt.fkw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public class ouw extends com.bytedance.adsdk.ugeno.bly.vt.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.bly.vt.ouw f12651lh;
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

    public com.bytedance.adsdk.ugeno.bly.vt.ouw getMarkView() {
        return this.f12651lh;
    }

    public com.bytedance.adsdk.ugeno.bly.vt.ouw getVideoView() {
        return this.vt;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f12651lh.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f12651lh.setOnTouchListener(onTouchListener);
    }

    public ouw(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.vt.ouw(context);
        this.vt = ouwVar;
        addView(ouwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar2 = new com.bytedance.adsdk.ugeno.bly.vt.ouw(context);
        this.f12651lh = ouwVar2;
        ouwVar2.setBackgroundColor(0);
        addView(ouwVar2, new FrameLayout.LayoutParams(-1, -1));
    }
}
