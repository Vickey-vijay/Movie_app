package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.le.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class NiceImageView extends yu {
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f12174cf;
    private Path ex;
    private int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Xfermode f12175jg;
    private final Path jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private int f12176ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12177le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f12178lh;
    private int mwh;
    private final Context ouw;
    private int pno;
    private RectF qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f12179ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private int f12180rn;
    private int ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final float[] f12181th;
    private int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final float[] f12182vm;
    private final Paint vpp;
    private boolean vt;
    private int yu;
    private float zih;
    private final RectF zin;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void ouw(Canvas canvas, int i10, int i11, float f10) {
        ouw(i10, i11);
        this.jqy.addCircle(this.f12176ko / 2.0f, this.f12180rn / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.jqy, this.vpp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void lh() {
        if (this.vt) {
            return;
        }
        int i10 = 0;
        if (this.pno <= 0) {
            float[] fArr = this.f12182vm;
            int i11 = this.bly;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.tlj;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.ryl;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.f12174cf;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.f12181th;
            int i15 = this.yu;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.f12182vm;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.pno;
            fArr3[i10] = i16;
            this.f12181th[i10] = i16 - (this.yu / 2.0f);
            i10++;
        }
    }

    private void vt() {
        if (!this.vt) {
            this.qbp.set(0.0f, 0.0f, this.f12176ko, this.f12180rn);
            if (this.f12178lh) {
                this.qbp = this.zin;
                return;
            }
            return;
        }
        float fMin = Math.min(this.f12176ko, this.f12180rn) / 2.0f;
        this.zih = fMin;
        RectF rectF = this.qbp;
        int i10 = this.f12176ko;
        int i11 = this.f12180rn;
        rectF.set((i10 / 2.0f) - fMin, (i11 / 2.0f) - fMin, (i10 / 2.0f) + fMin, (i11 / 2.0f) + fMin);
    }

    private void yu() {
        if (this.vt) {
            return;
        }
        this.f12177le = 0;
    }

    public void isCircle(boolean z10) {
        this.vt = z10;
        yu();
        vt();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.f12178lh = z10;
        vt();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.qbp, null, 31);
        if (!this.f12178lh) {
            int i10 = this.f12176ko;
            int i11 = this.yu;
            int i12 = this.f12177le;
            int i13 = this.f12180rn;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.vpp.reset();
        this.jqy.reset();
        if (this.vt) {
            this.jqy.addCircle(this.f12176ko / 2.0f, this.f12180rn / 2.0f, this.zih, Path.Direction.CCW);
        } else {
            this.jqy.addRoundRect(this.qbp, this.f12181th, Path.Direction.CCW);
        }
        this.vpp.setAntiAlias(true);
        this.vpp.setStyle(Paint.Style.FILL);
        this.vpp.setXfermode(this.f12175jg);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.jqy, this.vpp);
        } else {
            this.ex.addRect(this.qbp, Path.Direction.CCW);
            this.ex.op(this.jqy, Path.Op.DIFFERENCE);
            canvas.drawPath(this.ex, this.vpp);
        }
        this.vpp.setXfermode(null);
        int i14 = this.mwh;
        if (i14 != 0) {
            this.vpp.setColor(i14);
            canvas.drawPath(this.jqy, this.vpp);
        }
        canvas.restore();
        if (this.vt) {
            int i15 = this.yu;
            if (i15 > 0) {
                ouw(canvas, i15, this.fkw, this.zih - (i15 / 2.0f));
            }
            int i16 = this.f12177le;
            if (i16 > 0) {
                ouw(canvas, i16, this.f12179ra, (this.zih - this.yu) - (i16 / 2.0f));
                return;
            }
            return;
        }
        int i17 = this.yu;
        if (i17 > 0) {
            int i18 = this.fkw;
            RectF rectF = this.zin;
            float[] fArr = this.f12182vm;
            ouw(i17, i18);
            this.jqy.addRoundRect(rectF, fArr, Path.Direction.CCW);
            canvas.drawPath(this.jqy, this.vpp);
        }
    }

    public void setBorderColor(@ColorInt int i10) {
        this.fkw = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.yu = osn.ouw(this.ouw, i10);
        ouw(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.f12174cf = osn.ouw(this.ouw, i10);
        ouw(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.ryl = osn.ouw(this.ouw, i10);
        ouw(true);
    }

    public void setCornerRadius(int i10) {
        this.pno = osn.ouw(this.ouw, i10);
        ouw(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.bly = osn.ouw(this.ouw, i10);
        ouw(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.tlj = osn.ouw(this.ouw, i10);
        ouw(true);
    }

    public void setInnerBorderColor(@ColorInt int i10) {
        this.f12179ra = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.f12177le = osn.ouw(this.ouw, i10);
        yu();
        invalidate();
    }

    public void setMaskColor(@ColorInt int i10) {
        this.mwh = i10;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.fkw = -1;
        this.f12179ra = -1;
        this.ouw = context;
        this.pno = osn.ouw(context, 10.0f);
        this.f12182vm = new float[8];
        this.f12181th = new float[8];
        this.zin = new RectF();
        this.qbp = new RectF();
        this.vpp = new Paint();
        this.jqy = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f12175jg = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f12175jg = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.ex = new Path();
        }
        lh();
        yu();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f12176ko = i10;
        this.f12180rn = i11;
        ouw();
        vt();
    }

    private void ouw(int i10, int i11) {
        this.jqy.reset();
        this.vpp.setStrokeWidth(i10);
        this.vpp.setColor(i11);
        this.vpp.setStyle(Paint.Style.STROKE);
    }

    private void ouw() {
        if (this.vt) {
            return;
        }
        RectF rectF = this.zin;
        int i10 = this.yu;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.f12176ko - (i10 / 2.0f), this.f12180rn - (i10 / 2.0f));
    }

    private void ouw(boolean z10) {
        if (z10) {
            this.pno = 0;
        }
        lh();
        ouw();
        invalidate();
    }
}
