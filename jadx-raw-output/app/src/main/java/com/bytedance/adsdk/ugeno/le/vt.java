package com.bytedance.adsdk.ugeno.le;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class vt extends ouw<com.bytedance.adsdk.ugeno.vt.lh> {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.yu f10892cf;

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.yu yuVar = this.f10892cf;
        if (yuVar != null) {
            yuVar.yu();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.f10892cf;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.yu yuVar = this.f10892cf;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.f10892cf;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.le.ouw
    public final View pno(int i10) {
        return ((com.bytedance.adsdk.ugeno.vt.lh) this.ouw.get(i10)).fkw;
    }

    public vt(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.f10892cf;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.f10892cf;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.yu yuVar = this.f10892cf;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }
}
