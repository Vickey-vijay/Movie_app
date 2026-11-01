package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes5.dex */
public class i0 extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f7659w = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f7660x = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f7661y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f7662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f7663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f7664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f7665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f7666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f7667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f7673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f7675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f7676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f7677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f7678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f7679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f7680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f7681t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f7682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f7683v;

    public i0(Context context) {
        this(context, null);
    }

    public void a() {
        this.f7672k = f7659w;
        this.f7668g = f7660x;
        this.f7667f = this.f7681t;
        setMax(100);
        setProgress(0);
        this.f7673l = this.f7680s;
        this.f7674m = 0;
        this.f7677p = this.f7682u;
        this.f7669h = f7661y;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f7664c = textPaint;
        textPaint.setColor(this.f7668g);
        this.f7664c.setTextSize(this.f7667f);
        this.f7664c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f7665d = textPaint2;
        textPaint2.setColor(this.f7669h);
        this.f7665d.setTextSize(this.f7677p);
        this.f7665d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f7662a = paint;
        paint.setColor(this.f7672k);
        this.f7662a.setStyle(Paint.Style.STROKE);
        this.f7662a.setAntiAlias(true);
        this.f7662a.setStrokeWidth(this.f7673l);
        Paint paint2 = new Paint();
        this.f7663b = paint2;
        paint2.setColor(this.f7674m);
        this.f7663b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f7672k;
    }

    public float getFinishedStrokeWidth() {
        return this.f7673l;
    }

    public int getInnerBackgroundColor() {
        return this.f7674m;
    }

    public String getInnerBottomText() {
        return this.f7678q;
    }

    public int getInnerBottomTextColor() {
        return this.f7669h;
    }

    public float getInnerBottomTextSize() {
        return this.f7677p;
    }

    public int getMax() {
        return this.f7671j;
    }

    public String getPrefixText() {
        return this.f7675n;
    }

    public int getProgress() {
        return this.f7670i;
    }

    public String getSuffixText() {
        return this.f7676o;
    }

    public int getTextColor() {
        return this.f7668g;
    }

    public float getTextSize() {
        return this.f7667f;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f7668g = bundle.getInt("text_color");
        this.f7667f = bundle.getFloat("text_size");
        this.f7677p = bundle.getFloat("inner_bottom_text_size");
        this.f7678q = bundle.getString("inner_bottom_text");
        this.f7669h = bundle.getInt("inner_bottom_text_color");
        this.f7672k = bundle.getInt("finished_stroke_color");
        this.f7673l = bundle.getFloat("finished_stroke_width");
        this.f7674m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt("progress"));
        this.f7675n = bundle.getString("prefix");
        this.f7676o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f7672k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f7673l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f7674m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f7678q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f7669h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f7677p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f7671j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f7675n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f7670i = i10;
        if (i10 > getMax()) {
            this.f7670i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f7676o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f7668g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f7667f = f10;
        invalidate();
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7666e = new RectF();
        this.f7670i = 0;
        this.f7675n = "";
        this.f7676o = "";
        this.f7678q = "";
        this.f7681t = a.d(getResources(), 14.0f);
        this.f7683v = (int) a.c(getResources(), 100.0f);
        this.f7680s = a.c(getResources(), 4.0f);
        this.f7682u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private float getProgressAngle() {
        return (getProgress() / this.f7671j) * 360.0f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f7673l;
        this.f7666e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f7673l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f7663b);
        canvas.drawArc(this.f7666e, 270.0f, -getProgressAngle(), false, this.f7662a);
        String str = this.f7675n + this.f7670i + this.f7676o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f7664c.measureText(str)) / 2.0f, (getWidth() - (this.f7664c.descent() + this.f7664c.ascent())) / 2.0f, this.f7664c);
        }
        if (!TextUtils.isEmpty(getInnerBottomText())) {
            this.f7665d.setTextSize(this.f7677p);
            canvas.drawText(getInnerBottomText(), (getWidth() - this.f7665d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f7679r) - ((this.f7664c.descent() + this.f7664c.ascent()) / 2.0f), this.f7665d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f7679r = getHeight() - ((getHeight() * 3) / 4);
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f7683v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
