package io.bidmachine.iab.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes2.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f59326g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f59327h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f59328i = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f59329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f59330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f59331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f59332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f59333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59334f;

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float[] f59335a = {0.0f, 1.0E-4f, 2.0E-4f, 5.0E-4f, 9.0E-4f, 0.0014f, 0.002f, 0.0027f, 0.0036f, 0.0046f, 0.0058f, 0.0071f, 0.0085f, 0.0101f, 0.0118f, 0.0137f, 0.0158f, 0.018f, 0.0205f, 0.0231f, 0.0259f, 0.0289f, 0.0321f, 0.0355f, 0.0391f, 0.043f, 0.0471f, 0.0514f, 0.056f, 0.0608f, 0.066f, 0.0714f, 0.0771f, 0.083f, 0.0893f, 0.0959f, 0.1029f, 0.1101f, 0.1177f, 0.1257f, 0.1339f, 0.1426f, 0.1516f, 0.161f, 0.1707f, 0.1808f, 0.1913f, 0.2021f, 0.2133f, 0.2248f, 0.2366f, 0.2487f, 0.2611f, 0.2738f, 0.2867f, 0.2998f, 0.3131f, 0.3265f, 0.34f, 0.3536f, 0.3673f, 0.381f, 0.3946f, 0.4082f, 0.4217f, 0.4352f, 0.4485f, 0.4616f, 0.4746f, 0.4874f, 0.5f, 0.5124f, 0.5246f, 0.5365f, 0.5482f, 0.5597f, 0.571f, 0.582f, 0.5928f, 0.6033f, 0.6136f, 0.6237f, 0.6335f, 0.6431f, 0.6525f, 0.6616f, 0.6706f, 0.6793f, 0.6878f, 0.6961f, 0.7043f, 0.7122f, 0.7199f, 0.7275f, 0.7349f, 0.7421f, 0.7491f, 0.7559f, 0.7626f, 0.7692f, 0.7756f, 0.7818f, 0.7879f, 0.7938f, 0.7996f, 0.8053f, 0.8108f, 0.8162f, 0.8215f, 0.8266f, 0.8317f, 0.8366f, 0.8414f, 0.8461f, 0.8507f, 0.8551f, 0.8595f, 0.8638f, 0.8679f, 0.872f, 0.876f, 0.8798f, 0.8836f, 0.8873f, 0.8909f, 0.8945f, 0.8979f, 0.9013f, 0.9046f, 0.9078f, 0.9109f, 0.9139f, 0.9169f, 0.9198f, 0.9227f, 0.9254f, 0.9281f, 0.9307f, 0.9333f, 0.9358f, 0.9382f, 0.9406f, 0.9429f, 0.9452f, 0.9474f, 0.9495f, 0.9516f, 0.9536f, 0.9556f, 0.9575f, 0.9594f, 0.9612f, 0.9629f, 0.9646f, 0.9663f, 0.9679f, 0.9695f, 0.971f, 0.9725f, 0.9739f, 0.9753f, 0.9766f, 0.9779f, 0.9791f, 0.9803f, 0.9815f, 0.9826f, 0.9837f, 0.9848f, 0.9858f, 0.9867f, 0.9877f, 0.9885f, 0.9894f, 0.9902f, 0.991f, 0.9917f, 0.9924f, 0.9931f, 0.9937f, 0.9944f, 0.9949f, 0.9955f, 0.996f, 0.9964f, 0.9969f, 0.9973f, 0.9977f, 0.998f, 0.9984f, 0.9986f, 0.9989f, 0.9991f, 0.9993f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f59336b = 1.0f / 200;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f59335a;
            int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
            float f11 = this.f59336b;
            float f12 = (f10 - (iMin * f11)) / f11;
            float[] fArr2 = this.f59335a;
            float f13 = fArr2[iMin];
            return f13 + (f12 * (fArr2[iMin + 1] - f13));
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f59337a;

        public b(d dVar) {
            this.f59337a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.b(fFloatValue, this.f59337a);
            CircularProgressDrawable.this.a(fFloatValue, this.f59337a, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    public class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f59339a;

        public c(d dVar) {
            this.f59339a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.a(1.0f, this.f59339a, true);
            this.f59339a.m();
            this.f59339a.k();
            if (!CircularProgressDrawable.this.f59334f) {
                CircularProgressDrawable.this.f59333e += 1.0f;
            } else {
                CircularProgressDrawable.this.f59334f = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.f59333e = 0.0f;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f59342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f59343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f59344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Paint f59345e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f59350j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f59351k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f59352l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f59353m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f59354n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f59355o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f59357q;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f59346f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f59347g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f59348h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f59349i = 5.0f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f59356p = 255;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f59341a = new RectF();

        public d() {
            Paint paint = new Paint();
            this.f59342b = paint;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f59343c = paint2;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f59344d = paint3;
            paint3.setColor(0);
            Paint paint4 = new Paint();
            this.f59345e = paint4;
            paint4.setColor(0);
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f59341a;
            float f10 = this.f59355o;
            float fMin = (this.f59349i / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - (this.f59349i / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f59346f;
            float f12 = this.f59348h;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f59347g + f12) * 360.0f) - f13;
            this.f59342b.setColor(this.f59357q);
            this.f59342b.setAlpha(this.f59356p);
            float f15 = this.f59349i / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f59344d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f59342b);
        }

        public int b() {
            return this.f59344d.getColor();
        }

        public float c() {
            return this.f59347g;
        }

        public int d() {
            return this.f59350j[e()];
        }

        public int e() {
            return (this.f59351k + 1) % this.f59350j.length;
        }

        public float f() {
            return this.f59346f;
        }

        public int g() {
            return this.f59350j[this.f59351k];
        }

        public float h() {
            return this.f59353m;
        }

        public float i() {
            return this.f59354n;
        }

        public float j() {
            return this.f59352l;
        }

        public void k() {
            d(e());
        }

        public void l() {
            this.f59352l = 0.0f;
            this.f59353m = 0.0f;
            this.f59354n = 0.0f;
            d(0.0f);
            b(0.0f);
            c(0.0f);
        }

        public void m() {
            this.f59352l = this.f59346f;
            this.f59353m = this.f59347g;
            this.f59354n = this.f59348h;
        }

        public int a() {
            return this.f59356p;
        }

        public void b(int i10) {
            this.f59344d.setColor(i10);
        }

        public void c(int i10) {
            this.f59357q = i10;
        }

        public void d(int i10) {
            this.f59351k = i10;
            this.f59357q = this.f59350j[i10];
        }

        public void e(float f10) {
            this.f59349i = f10;
            this.f59342b.setStrokeWidth(f10);
        }

        public void a(int i10) {
            this.f59356p = i10;
        }

        public void b(float f10) {
            this.f59347g = f10;
        }

        public void c(float f10) {
            this.f59348h = f10;
        }

        public void d(float f10) {
            this.f59346f = f10;
        }

        public void a(float f10) {
            this.f59355o = f10;
        }

        public void a(ColorFilter colorFilter) {
            this.f59342b.setColorFilter(colorFilter);
        }

        public void a(int[] iArr) {
            this.f59350j = iArr;
            d(0);
        }

        public void a(Paint.Cap cap) {
            this.f59342b.setStrokeCap(cap);
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.f59329a = context.getResources();
        d dVar = new d();
        this.f59330b = dVar;
        dVar.a(f59328i);
        setStrokeWidth(2.5f);
        a();
    }

    private int a(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f59331c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f59330b.a(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f59330b.a();
    }

    public int getBackgroundColor() {
        return this.f59330b.b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getStrokeWidth() {
        return this.f59330b.f59349i;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f59332d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f59330b.a(i10);
        invalidateSelf();
    }

    public void setBackgroundColor(int i10) {
        this.f59330b.b(i10);
        invalidateSelf();
    }

    public void setCenterRadius(float f10) {
        this.f59330b.a(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f59330b.a(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(int... iArr) {
        this.f59330b.a(iArr);
        this.f59330b.d(0);
        invalidateSelf();
    }

    public void setStrokeCap(Paint.Cap cap) {
        this.f59330b.a(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f10) {
        this.f59330b.e(f10);
        invalidateSelf();
    }

    public void setStyle(int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (i10 == 0) {
            f10 = 11.0f;
            f11 = 3.0f;
            f12 = 12.0f;
            f13 = 6.0f;
        } else {
            f10 = 7.5f;
            f11 = 2.5f;
            f12 = 10.0f;
            f13 = 5.0f;
        }
        a(f10, f11, f12, f13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f59332d.cancel();
        this.f59330b.m();
        if (this.f59330b.c() != this.f59330b.f()) {
            this.f59334f = true;
            animator = this.f59332d;
            j10 = 666;
        } else {
            this.f59330b.d(0);
            this.f59330b.l();
            animator = this.f59332d;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f59332d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f59332d.cancel();
        a(0.0f);
        this.f59330b.d(0);
        this.f59330b.l();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f10, d dVar) {
        dVar.c(f10 > 0.75f ? a((f10 - 0.75f) / 0.25f, dVar.g(), dVar.d()) : dVar.g());
    }

    private void a(float f10, d dVar) {
        b(f10, dVar);
        float fFloor = (float) (Math.floor(dVar.i() / 0.8f) + 1.0d);
        dVar.d(dVar.j() + (((dVar.h() - 0.01f) - dVar.j()) * f10));
        dVar.b(dVar.h());
        dVar.c(dVar.i() + ((fFloor - dVar.i()) * f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f10, d dVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f59334f) {
            a(f10, dVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fI = dVar.i();
            if (f10 < 0.5f) {
                interpolation = dVar.j();
                interpolation2 = (f59327h.getInterpolation(f10 / 0.5f) * 0.79f) + interpolation + 0.01f;
            } else {
                float fJ = dVar.j() + 0.79f;
                interpolation = fJ - (((1.0f - f59327h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fJ;
            }
            float f11 = fI + (0.20999998f * f10);
            float f12 = (f10 + this.f59333e) * 216.0f;
            dVar.d(interpolation);
            dVar.b(interpolation2);
            dVar.c(f11);
            a(f12);
        }
    }

    private void a(float f10) {
        this.f59331c = f10;
    }

    private void a(float f10, float f11, float f12, float f13) {
        d dVar = this.f59330b;
        float f14 = this.f59329a.getDisplayMetrics().density;
        dVar.e(f11 * f14);
        dVar.a(f10 * f14);
        dVar.d(0);
    }

    private void a() {
        d dVar = this.f59330b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f59326g);
        valueAnimatorOfFloat.addListener(new c(dVar));
        this.f59332d = valueAnimatorOfFloat;
    }
}
