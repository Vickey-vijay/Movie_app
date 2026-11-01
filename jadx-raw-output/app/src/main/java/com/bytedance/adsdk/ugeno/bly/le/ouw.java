package com.bytedance.adsdk.ugeno.bly.le;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ouw.pno;
import com.bytedance.adsdk.ugeno.ouw.ra;
import com.bytedance.adsdk.ugeno.yu;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw extends TextView implements IAnimation, ra {
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f10765le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private pno f10766lh;
    public yu ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f10767ra;
    private float vt;
    private float yu;

    @Override // android.widget.TextView
    public final void setTextSize(float f10) {
        super.setTextSize(f10);
        this.fkw = getTextSize();
    }

    private int ouw(CharSequence charSequence, TextPaint textPaint, int i10, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.f10765le, this.f10767ra, true).getHeight();
    }

    public final float getBorderRadius() {
        return this.f10766lh.ouw;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRipple() {
        return this.vt;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRubIn() {
        return this.f10766lh.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getShine() {
        return this.f10766lh.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getStretch() {
        return this.f10766lh.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.fkw();
        }
        if (z10 && this.yu > 0.0f) {
            int compoundPaddingLeft = ((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            int compoundPaddingBottom = ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            CharSequence text = getText();
            if (text != null && text.length() != 0 && compoundPaddingBottom > 0 && compoundPaddingLeft > 0 && this.fkw != 0.0f) {
                TextPaint paint = getPaint();
                float fMax = this.fkw;
                int iOuw = ouw(text, paint, compoundPaddingLeft, fMax);
                while (iOuw > compoundPaddingBottom && fMax > this.yu) {
                    Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.yu);
                    fMax = Math.max(fMax - 1.0f, this.yu);
                    iOuw = ouw(text, paint, compoundPaddingLeft, fMax);
                }
                Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
                setTextSize(0, fMax);
                setLineSpacing(this.f10767ra, this.f10765le);
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f10766lh.ouw(i10);
    }

    public final void setBorderRadius(float f10) {
        pno pnoVar = this.f10766lh;
        if (pnoVar != null) {
            pnoVar.ouw(f10);
        }
    }

    public final void setMinTextSize(float f10) {
        this.yu = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public final void setRipple(float f10) {
        this.vt = f10;
        pno pnoVar = this.f10766lh;
        if (pnoVar != null) {
            pnoVar.vt(f10);
        }
        postInvalidate();
    }

    public final void setRubIn(float f10) {
        pno pnoVar = this.f10766lh;
        if (pnoVar != null) {
            pnoVar.fkw(f10);
        }
    }

    public final void setShine(float f10) {
        pno pnoVar = this.f10766lh;
        if (pnoVar != null) {
            pnoVar.lh(f10);
        }
    }

    public final void setStretch(float f10) {
        pno pnoVar = this.f10766lh;
        if (pnoVar != null) {
            pnoVar.yu(f10);
        }
    }

    public ouw(Context context) {
        super(context);
        this.yu = -1.0f;
        this.f10765le = 1.0f;
        this.f10767ra = 0.0f;
        this.f10766lh = new pno(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(canvas, this);
            this.ouw.ouw(canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f10765le = f11;
        this.f10767ra = f10;
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.fkw = getTextSize();
    }
}
