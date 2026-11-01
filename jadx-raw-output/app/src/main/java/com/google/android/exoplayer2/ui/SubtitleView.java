package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import d5.c;
import g5.k0;
import java.util.ArrayList;
import java.util.List;
import t4.b;
import t4.j;

/* JADX INFO: loaded from: classes7.dex */
public final class SubtitleView extends View implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f20016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<b> f20017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f20019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t4.a f20022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f20023i;

    public final float c(int i10, float f10, int i11, int i12) {
        float f11;
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setFractionalTextSize(float f10) {
        d(f10, false);
    }

    public final float b(b bVar, int i10, int i11) {
        int i12 = bVar.f72232n;
        if (i12 != Integer.MIN_VALUE) {
            float f10 = bVar.f72233o;
            if (f10 != -3.4028235E38f) {
                return Math.max(c(i12, f10, i10, i11), 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<b> list = this.f20017c;
        int i10 = 0;
        int size = list == null ? 0 : list.size();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i11 = paddingBottom - paddingTop;
        float fC = c(this.f20018d, this.f20019e, height, i11);
        if (fC <= 0.0f) {
            return;
        }
        while (i10 < size) {
            b bVar = this.f20017c.get(i10);
            int i12 = paddingBottom;
            int i13 = width;
            this.f20016b.get(i10).b(bVar, this.f20020f, this.f20021g, this.f20022h, fC, b(bVar, height, i11), this.f20023i, canvas, paddingLeft, paddingTop, i13, i12);
            i10++;
            i11 = i11;
            paddingBottom = i12;
            width = i13;
            paddingLeft = paddingLeft;
        }
    }

    public final void e(int i10, float f10) {
        if (this.f20018d == i10 && this.f20019e == f10) {
            return;
        }
        this.f20018d = i10;
        this.f20019e = f10;
        invalidate();
    }

    public void f() {
        setStyle((k0.f53108a < 19 || !a() || isInEditMode()) ? t4.a.f72212g : getUserCaptionStyleV19());
    }

    public void g() {
        setFractionalTextSize(((k0.f53108a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        if (this.f20021g == z10) {
            return;
        }
        this.f20021g = z10;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        if (this.f20020f == z10 && this.f20021g == z10) {
            return;
        }
        this.f20020f = z10;
        this.f20021g = z10;
        invalidate();
    }

    public void setBottomPaddingFraction(float f10) {
        if (this.f20023i == f10) {
            return;
        }
        this.f20023i = f10;
        invalidate();
    }

    public void setCues(@Nullable List<b> list) {
        if (this.f20017c == list) {
            return;
        }
        this.f20017c = list;
        int size = list == null ? 0 : list.size();
        while (this.f20016b.size() < size) {
            this.f20016b.add(new c(getContext()));
        }
        invalidate();
    }

    public void setStyle(t4.a aVar) {
        if (this.f20022h == aVar) {
            return;
        }
        this.f20022h = aVar;
        invalidate();
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20016b = new ArrayList();
        this.f20018d = 0;
        this.f20019e = 0.0533f;
        this.f20020f = true;
        this.f20021g = true;
        this.f20022h = t4.a.f72212g;
        this.f20023i = 0.08f;
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private t4.a getUserCaptionStyleV19() {
        return t4.a.a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    @TargetApi(19)
    public final boolean a() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).isEnabled();
    }

    public void d(float f10, boolean z10) {
        e(z10 ? 1 : 0, f10);
    }

    @Override // t4.j
    public void onCues(List<b> list) {
        setCues(list);
    }
}
