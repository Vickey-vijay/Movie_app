package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.yu.ra;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public final class vt extends ImageView implements IAnimation {
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private ra f11360le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private float f11361lh;
    public lh ouw;
    private float vt;
    private float yu;

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

    public final ra getBrickNativeValue() {
        return this.f11360le;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getMarqueeValue() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getRippleValue() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getShineValue() {
        return this.f11361lh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getStretchValue() {
        return this.fkw;
    }

    public final void setBrickNativeValue(ra raVar) {
        this.f11360le = raVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setMarqueeValue(float f10) {
        this.yu = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setRippleValue(float f10) {
        this.vt = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setShineValue(float f10) {
        this.f11361lh = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setStretchValue(float f10) {
        this.fkw = f10;
        this.ouw.ouw(this, f10);
    }

    public vt(Context context) {
        super(context);
        this.ouw = new lh();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ra raVar;
        super.onDraw(canvas);
        this.ouw.ouw(canvas, this, this);
        if (getRippleValue() != 0.0f && (raVar = this.f11360le) != null && raVar.vt() > 0) {
            ((ViewGroup) getParent()).setClipChildren(false);
            ((ViewGroup) getParent().getParent()).setClipChildren(false);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.ouw.ouw(this, i10, i11);
    }
}
