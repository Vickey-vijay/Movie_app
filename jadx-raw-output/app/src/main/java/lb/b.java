package lb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.ColorInt;

/* JADX INFO: compiled from: WaterDropView.java */
/* JADX INFO: loaded from: classes8.dex */
public class b extends View {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f63510h = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lb.a f63511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lb.a f63512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f63513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f63514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63516g;

    /* JADX INFO: compiled from: WaterDropView.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
            b.this.postInvalidate();
        }
    }

    public ValueAnimator a() {
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.001f).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new a());
        return duration;
    }

    public void e(int i10, int i11) {
    }

    public void b() {
        this.f63513d.reset();
        Path path = this.f63513d;
        lb.a aVar = this.f63511b;
        path.addCircle(aVar.f63507a, aVar.f63508b, aVar.f63509c, Path.Direction.CCW);
        if (this.f63512c.f63508b > this.f63511b.f63508b + gc.b.c(1.0f)) {
            Path path2 = this.f63513d;
            lb.a aVar2 = this.f63512c;
            path2.addCircle(aVar2.f63507a, aVar2.f63508b, aVar2.f63509c, Path.Direction.CCW);
            double angle = getAngle();
            lb.a aVar3 = this.f63511b;
            float fCos = (float) (((double) aVar3.f63507a) - (((double) aVar3.f63509c) * Math.cos(angle)));
            lb.a aVar4 = this.f63511b;
            float fSin = (float) (((double) aVar4.f63508b) + (((double) aVar4.f63509c) * Math.sin(angle)));
            lb.a aVar5 = this.f63511b;
            float fCos2 = (float) (((double) aVar5.f63507a) + (((double) aVar5.f63509c) * Math.cos(angle)));
            lb.a aVar6 = this.f63512c;
            float fCos3 = (float) (((double) aVar6.f63507a) - (((double) aVar6.f63509c) * Math.cos(angle)));
            lb.a aVar7 = this.f63512c;
            float fSin2 = (float) (((double) aVar7.f63508b) + (((double) aVar7.f63509c) * Math.sin(angle)));
            lb.a aVar8 = this.f63512c;
            float fCos4 = (float) (((double) aVar8.f63507a) + (((double) aVar8.f63509c) * Math.cos(angle)));
            Path path3 = this.f63513d;
            lb.a aVar9 = this.f63511b;
            path3.moveTo(aVar9.f63507a, aVar9.f63508b);
            this.f63513d.lineTo(fCos, fSin);
            Path path4 = this.f63513d;
            lb.a aVar10 = this.f63512c;
            path4.quadTo(aVar10.f63507a - aVar10.f63509c, (aVar10.f63508b + this.f63511b.f63508b) / 2.0f, fCos3, fSin2);
            this.f63513d.lineTo(fCos4, fSin2);
            Path path5 = this.f63513d;
            lb.a aVar11 = this.f63512c;
            path5.quadTo(aVar11.f63507a + aVar11.f63509c, (aVar11.f63508b + fSin) / 2.0f, fCos2, fSin);
        }
        this.f63513d.close();
    }

    public void c(float f10) {
        int i10 = this.f63515f;
        float f11 = (float) (((double) i10) - ((((double) f10) * 0.25d) * ((double) i10)));
        float f12 = ((this.f63516g - i10) * f10) + i10;
        float f13 = f10 * 4.0f * i10;
        lb.a aVar = this.f63511b;
        aVar.f63509c = f11;
        lb.a aVar2 = this.f63512c;
        aVar2.f63509c = f12;
        aVar2.f63508b = aVar.f63508b + f13;
    }

    public double getAngle() {
        lb.a aVar = this.f63512c;
        float f10 = aVar.f63509c;
        lb.a aVar2 = this.f63511b;
        float f11 = aVar2.f63509c;
        if (f10 > f11) {
            return 0.0d;
        }
        return Math.asin((f11 - f10) / (aVar.f63508b - aVar2.f63508b));
    }

    public lb.a getBottomCircle() {
        return this.f63512c;
    }

    public int getIndicatorColor() {
        return this.f63514e.getColor();
    }

    public int getMaxCircleRadius() {
        return this.f63515f;
    }

    public lb.a getTopCircle() {
        return this.f63511b;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f63515f;
        int i13 = f63510h;
        lb.a aVar = this.f63512c;
        super.setMeasuredDimension(((i12 + i13) * 2) + getPaddingLeft() + getPaddingRight(), View.resolveSize(((int) Math.ceil(aVar.f63508b + aVar.f63509c + (i13 * 2))) + getPaddingTop() + getPaddingBottom(), i11));
    }

    public void setIndicatorColor(@ColorInt int i10) {
        this.f63514e.setColor(i10);
    }

    public b(Context context) {
        super(context);
        this.f63511b = new lb.a();
        this.f63512c = new lb.a();
        this.f63513d = new Path();
        Paint paint = new Paint();
        this.f63514e = paint;
        paint.setColor(-7829368);
        this.f63514e.setAntiAlias(true);
        this.f63514e.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = this.f63514e;
        int iC = gc.b.c(1.0f);
        f63510h = iC;
        paint2.setStrokeWidth(iC);
        Paint paint3 = this.f63514e;
        int i10 = f63510h;
        paint3.setShadowLayer(i10, i10 / 2.0f, i10, -1728053248);
        setLayerType(1, null);
        int i11 = f63510h * 4;
        setPadding(i11, i11, i11, i11);
        this.f63514e.setColor(-7829368);
        int iC2 = gc.b.c(20.0f);
        this.f63515f = iC2;
        this.f63516g = iC2 / 5;
        lb.a aVar = this.f63511b;
        aVar.f63509c = iC2;
        lb.a aVar2 = this.f63512c;
        aVar2.f63509c = iC2;
        int i12 = f63510h;
        aVar.f63507a = i12 + iC2;
        aVar.f63508b = i12 + iC2;
        aVar2.f63507a = i12 + iC2;
        aVar2.f63508b = i12 + iC2;
    }

    public void d(int i10) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i11 = this.f63515f;
        float f10 = (i11 * 2) + paddingTop + paddingBottom;
        float f11 = i10;
        if (f11 < f10) {
            lb.a aVar = this.f63511b;
            aVar.f63509c = i11;
            lb.a aVar2 = this.f63512c;
            aVar2.f63509c = i11;
            aVar2.f63508b = aVar.f63508b;
            return;
        }
        float fPow = (float) (((double) (i11 - this.f63516g)) * (1.0d - Math.pow(100.0d, (-Math.max(0.0f, f11 - f10)) / gc.b.c(200.0f))));
        lb.a aVar3 = this.f63511b;
        int i12 = this.f63515f;
        aVar3.f63509c = i12 - (fPow / 4.0f);
        lb.a aVar4 = this.f63512c;
        float f12 = i12 - fPow;
        aVar4.f63509c = f12;
        aVar4.f63508b = ((i10 - paddingTop) - paddingBottom) - f12;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        canvas.save();
        float f10 = height;
        float f11 = this.f63511b.f63509c;
        float f12 = paddingTop;
        float f13 = paddingBottom;
        if (f10 <= (f11 * 2.0f) + f12 + f13) {
            canvas.translate(paddingLeft, (f10 - (f11 * 2.0f)) - f13);
            lb.a aVar = this.f63511b;
            canvas.drawCircle(aVar.f63507a, aVar.f63508b, aVar.f63509c, this.f63514e);
        } else {
            canvas.translate(paddingLeft, f12);
            b();
            canvas.drawPath(this.f63513d, this.f63514e);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d(getHeight());
    }
}
