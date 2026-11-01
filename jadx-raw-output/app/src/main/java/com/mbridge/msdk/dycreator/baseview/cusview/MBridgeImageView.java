package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Xfermode f34162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f34172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f34173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f34174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f34175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f34176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f34178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f34179r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f34170i, this.f34171j, this.f34175n, this.f34172k);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
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

    public void setBorder(int i10, int i11, int i12) {
        this.f34176o = true;
        this.f34170i = i11;
        this.f34171j = i12;
        this.f34165d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f34176o = true;
        this.f34177p = true;
        this.f34170i = i14;
        this.f34171j = i15;
        this.f34166e = i10;
        this.f34168g = i12;
        this.f34167f = i11;
        this.f34169h = i13;
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f34178q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f34178q, this.f34179r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f34172k == null || this.f34173l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f34172k;
                float f10 = this.f34166e;
                fArr[i13] = f10;
                this.f34173l[i13] = f10 - (this.f34170i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f34172k;
                float f11 = this.f34167f;
                fArr2[i10] = f11;
                this.f34173l[i10] = f11 - (this.f34170i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f34172k;
                float f12 = this.f34168g;
                fArr3[i11] = f12;
                this.f34173l[i11] = f12 - (this.f34170i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f34172k;
                float f13 = this.f34169h;
                fArr4[i12] = f13;
                this.f34173l[i12] = f13 - (this.f34170i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f34175n;
        if (rectF != null) {
            float f10 = this.f34170i / 2.0f;
            rectF.set(f10, f10, this.f34163b - f10, this.f34164c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f34174m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f34163b, this.f34164c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f34174m, null, 31);
            int i10 = this.f34163b;
            int i11 = this.f34170i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            int i12 = this.f34164c;
            float f12 = i12;
            canvas.scale(f10 / f11, ((i12 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f34179r;
            if (paint != null) {
                paint.reset();
                this.f34179r.setAntiAlias(true);
                this.f34179r.setStyle(Paint.Style.FILL);
                this.f34179r.setXfermode(this.f34162a);
            }
            Path path = this.f34178q;
            if (path != null) {
                path.reset();
                this.f34178q.addRoundRect(this.f34174m, this.f34173l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f34178q, this.f34179r);
            Paint paint2 = this.f34179r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f34176o) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    public void setCornerRadius(int i10) {
        this.f34165d = i10;
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34178q = new Path();
        this.f34179r = new Paint();
        this.f34172k = new float[8];
        this.f34173l = new float[8];
        this.f34175n = new RectF();
        this.f34174m = new RectF();
        this.f34162a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f34163b = i10;
        this.f34164c = i11;
        if (this.f34177p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    private void a(int i10, int i11) {
        Path path = this.f34178q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f34179r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f34179r.setColor(i11);
            this.f34179r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f34172k == null || this.f34173l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f34172k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f34165d;
                fArr[i10] = f10;
                this.f34173l[i10] = f10 - (this.f34170i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
