package com.bytedance.adsdk.ugeno.bly.vt;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.yu;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ouw extends FrameLayout {
    public yu ouw;
    private Map<Integer, mwh> vt;

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, mwh> map = this.vt;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.yu();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    public void setEventMap(Map<Integer, mwh> map) {
        this.vt = map;
    }

    public ouw(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }
}
