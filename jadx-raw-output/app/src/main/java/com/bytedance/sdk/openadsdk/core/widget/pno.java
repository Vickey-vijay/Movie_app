package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class pno extends View {
    private static final int[] ouw = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private int bly;
    private final Paint fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final Paint f13135le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final RectF f13136lh;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f13137ra;
    private final RectF vt;
    private final ArrayList<ouw> yu;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
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

    public static final class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f13138lh;
        public Paint ouw;
        public float vt;
        public float yu;

        public ouw(Paint paint, float f10, float f11, float f12) {
            this.ouw = paint;
            this.vt = f10;
            this.f13138lh = f11;
            this.yu = f12;
        }
    }

    private void ouw() {
        if (this.f13137ra <= 0) {
            return;
        }
        this.f13136lh.right = Math.max(this.bly, (int) (((this.pno * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    public void setProgress(int i10) {
        int i11 = this.pno;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.pno = i10;
        ouw();
    }

    public pno(Context context) {
        super(context);
        this.vt = new RectF();
        this.f13136lh = new RectF();
        this.yu = new ArrayList<>();
        this.f13135le = new Paint();
        Paint paint = new Paint();
        this.fkw = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.vt;
        int i10 = this.f13137ra;
        canvas.drawRoundRect(rectF, i10, i10, this.fkw);
        RectF rectF2 = this.f13136lh;
        int i11 = this.f13137ra;
        canvas.drawRoundRect(rectF2, i11, i11, this.f13135le);
        int iSave = canvas.save();
        canvas.translate(this.f13136lh.right - this.bly, 0.0f);
        for (ouw ouwVar : this.yu) {
            canvas.drawCircle(ouwVar.f13138lh, ouwVar.yu, ouwVar.vt, ouwVar.ouw);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.f13137ra = i14;
        this.bly = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.vt.set(0.0f, 0.0f, f10, f11);
        this.f13136lh.set(0.0f, 0.0f, 0.0f, f11);
        this.f13135le.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.yu.clear();
        float f12 = this.f13137ra / 4.0f;
        for (int i15 : ouw) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.yu.add(new ouw(paint, this.f13137ra / 2.0f, f12, f11 / 2.0f));
            f12 += (this.f13137ra / 2.0f) * 3.0f;
        }
        ouw();
    }
}
