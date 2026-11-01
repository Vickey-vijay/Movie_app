package sg.bigo.ads.common.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.List;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f70270a = -2123303016;

    public static class a {
        public long a() {
            return -1L;
        }

        public boolean a(int i10) {
            return false;
        }

        public void b(int i10) {
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.b$b, reason: collision with other inner class name */
    public static class C0721b extends d<ColorDrawable> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f70290d;

        /* JADX WARN: Multi-variable type inference failed */
        private C0721b(View view, ColorDrawable colorDrawable, int i10) {
            super(view, colorDrawable, i10, 0 == true ? 1 : 0);
            T t10 = this.f70293b;
            this.f70290d = t10 != 0 ? ((ColorDrawable) t10).getColor() : 0;
        }

        public /* synthetic */ C0721b(View view, ColorDrawable colorDrawable, int i10, byte b10) {
            this(view, colorDrawable, i10);
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a() {
            return this.f70290d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i10) {
            T t10;
            if (this.f70292a == null || (t10 = this.f70293b) == 0) {
                return;
            }
            ((ColorDrawable) t10).setColor(i10);
            ((ColorDrawable) this.f70293b).invalidateSelf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z10) {
            T t10;
            if (this.f70292a == null || (t10 = this.f70293b) == 0) {
                return;
            }
            ((ColorDrawable) t10).setColor(z10 ? this.f70290d : this.f70294c);
            ((ColorDrawable) this.f70293b).invalidateSelf();
        }
    }

    public static class c extends d<Paint> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f70291d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, Paint paint, int i10) {
            super(view, paint, i10, 0 == true ? 1 : 0);
            T t10 = this.f70293b;
            this.f70291d = t10 != 0 ? ((Paint) t10).getColor() : 0;
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a() {
            return this.f70291d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i10) {
            T t10;
            if (this.f70292a == null || (t10 = this.f70293b) == 0) {
                return;
            }
            ((Paint) t10).setColor(i10);
            this.f70292a.getBackground().invalidateSelf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z10) {
            T t10;
            if (this.f70292a == null || (t10 = this.f70293b) == 0) {
                return;
            }
            ((Paint) t10).setColor(z10 ? this.f70291d : this.f70294c);
            this.f70292a.getBackground().invalidateSelf();
        }
    }

    public static abstract class d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f70292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f70293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f70294c;

        private d(View view, T t10, int i10) {
            this.f70292a = view;
            this.f70293b = t10;
            this.f70294c = i10;
        }

        public /* synthetic */ d(View view, Object obj, int i10, byte b10) {
            this(view, obj, i10);
        }

        public abstract int a();

        public int a(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
            return b.a(f10, a(), this.f70294c);
        }

        public abstract void a(int i10);

        public abstract void a(boolean z10);
    }

    public static class e extends d<Drawable> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Drawable f70295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ColorDrawable f70296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f70297f;

        public e(View view, int i10) {
            super(view, null, i10, (byte) 0);
            ColorDrawable colorDrawable = new ColorDrawable(i10);
            this.f70296e = colorDrawable;
            if (view != null) {
                Drawable background = view.getBackground();
                this.f70295d = background;
                if (background != null) {
                    view.setBackground(new LayerDrawable(new Drawable[]{this.f70295d, colorDrawable}));
                } else {
                    colorDrawable.setColor(0);
                    view.setBackground(colorDrawable);
                }
            }
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a() {
            return 0;
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a(float f10) {
            this.f70297f = Math.max((int) ((255.0f - (f10 * 255.0f)) + 0.5f), 255);
            return super.a(f10);
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i10) {
            if (this.f70292a != null) {
                ColorDrawable colorDrawable = this.f70296e;
                if (colorDrawable != null) {
                    colorDrawable.setColor(i10);
                    this.f70296e.invalidateSelf();
                }
                Drawable drawable = this.f70295d;
                if (drawable != null) {
                    drawable.setAlpha(this.f70297f);
                    this.f70295d.invalidateSelf();
                }
            }
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z10) {
            View view = this.f70292a;
            if (view != null) {
                view.setBackground(z10 ? this.f70295d : this.f70296e);
            }
        }
    }

    public static double a(int i10) {
        double dA = a((16711680 & i10) >> 16, (65280 & i10) >> 8, i10 & 255);
        double dA2 = a(255, 255, 255);
        return (Math.max(dA, dA2) + 0.05000000074505806d) / (Math.min(dA, dA2) + 0.05000000074505806d);
    }

    private static double a(int i10, int i11, int i12) {
        double[] dArr = new double[3];
        dArr[0] = i10 / 255.0f;
        dArr[1] = i11 / 255.0f;
        dArr[2] = i12 / 255.0f;
        for (int i13 = 0; i13 < 3; i13++) {
            double d10 = dArr[i13];
            dArr[i13] = d10 <= 0.0392800010740757d ? d10 / 12.920000076293945d : Math.pow((d10 + 0.054999999701976776d) / 1.0549999475479126d, 2.4000000953674316d);
        }
        return (dArr[0] * 0.2125999927520752d) + (dArr[1] * 0.7152000069618225d) + (dArr[2] * 0.0722000002861023d);
    }

    private static float a(float f10, float f11) {
        if (f10 < 0.0f) {
            return 0.0f;
        }
        return f10 > f11 ? f11 : f10;
    }

    public static /* synthetic */ float a(ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            return 1.0f;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            return ((Float) animatedValue).floatValue();
        }
        return 1.0f;
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((i11 >> 16) & 255) / 255.0f, 2.2d);
        float f12 = f11 + (((((i11 >> 24) & 255) / 255.0f) - f11) * f10);
        float fPow5 = fPow2 + ((((float) Math.pow(((i11 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f10);
        float fPow6 = fPow3 + (f10 * (((float) Math.pow((i11 & 255) / 255.0f, 2.2d)) - fPow3));
        return (Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f10), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f);
    }

    public static int a(int i10, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return a(i10, (int) (f10 * 255.0f));
    }

    public static int a(int i10, @IntRange(from = 0, to = 255) int i11) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | ((Math.max(0, Math.min(255, i11)) & 255) << 24);
    }

    @ColorInt
    public static int a(Bitmap bitmap, @ColorInt int i10) {
        Integer numA = a(bitmap);
        return numA != null ? numA.intValue() : i10;
    }

    @Nullable
    public static ValueAnimator a(final View view, final int i10, final a aVar) {
        if (view == null) {
            return null;
        }
        final d dVarA = a(view, i10);
        int i11 = f70270a;
        Object tag = view.getTag(i11);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        long jA = aVar.a();
        if (jA != -1) {
            valueAnimatorOfFloat.setDuration(jA);
        }
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iA = dVarA.a(b.a(valueAnimator));
                a aVar2 = aVar;
                if (aVar2 != null ? aVar2.a(iA) : false) {
                    return;
                }
                dVarA.a(iA);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.common.w.b.5

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f70283e = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f70283e = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(i10);
                }
                dVarA.a(this.f70283e);
                view.setTag(b.f70270a, null);
            }
        });
        valueAnimatorOfFloat.start();
        view.setTag(i11, valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    @Nullable
    public static ValueAnimator a(final View view, final Drawable drawable, long j10) {
        if (view == null) {
            return null;
        }
        int i10 = f70270a;
        Object tag = view.getTag(i10);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        final Drawable background = view.getBackground();
        if (background == null) {
            view.setBackground(drawable);
        } else {
            view.setBackground(new LayerDrawable(new Drawable[]{background, drawable}));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j10 != -1) {
            valueAnimatorOfFloat.setDuration(j10);
        }
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iMax = Math.max((int) ((b.a(valueAnimator) * 255.0f) + 0.5f), 255);
                drawable.setAlpha(iMax);
                drawable.invalidateSelf();
                Drawable drawable2 = background;
                if (drawable2 != null) {
                    drawable2.setAlpha(255 - iMax);
                    background.invalidateSelf();
                }
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.common.w.b.7

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f70289d = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.f70289d = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                view.setBackground(this.f70289d ? background : drawable);
                view.setTag(b.f70270a, null);
            }
        });
        valueAnimatorOfFloat.start();
        view.setTag(i10, valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    @Nullable
    public static Integer a(Bitmap bitmap) {
        int iMax;
        int i10;
        sg.bigo.ads.common.w.c.b[] bVarArr;
        if (bitmap == null) {
            return null;
        }
        try {
            sg.bigo.ads.common.w.c.a aVarA = sg.bigo.ads.common.w.c.a(bitmap);
            Bitmap bitmapA = aVarA.f70304a;
            if (bitmapA == null) {
                throw new AssertionError();
            }
            double dSqrt = -1.0d;
            if (aVarA.f70307d > 0) {
                int width = bitmapA.getWidth() * bitmapA.getHeight();
                int i11 = aVarA.f70307d;
                if (width > i11) {
                    dSqrt = Math.sqrt(((double) i11) / ((double) width));
                }
            } else if (aVarA.f70308e > 0 && (iMax = Math.max(bitmapA.getWidth(), bitmapA.getHeight())) > (i10 = aVarA.f70308e)) {
                dSqrt = ((double) i10) / ((double) iMax);
            }
            if (dSqrt > 0.0d) {
                bitmapA = sg.bigo.ads.common.utils.d.a(bitmapA, (int) Math.ceil(((double) bitmapA.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmapA.getHeight()) * dSqrt));
            }
            int width2 = bitmapA.getWidth();
            int height = bitmapA.getHeight();
            int[] iArr = new int[width2 * height];
            bitmapA.getPixels(iArr, 0, width2, 0, 0, width2, height);
            int i12 = aVarA.f70306c;
            if (aVarA.f70309f.isEmpty()) {
                bVarArr = null;
            } else {
                List<sg.bigo.ads.common.w.c.b> list = aVarA.f70309f;
                bVarArr = (sg.bigo.ads.common.w.c.b[]) list.toArray(new sg.bigo.ads.common.w.c.b[list.size()]);
            }
            sg.bigo.ads.common.w.a aVar = new sg.bigo.ads.common.w.a(iArr, i12, bVarArr);
            if (bitmapA != aVarA.f70304a) {
                bitmapA.recycle();
            }
            sg.bigo.ads.common.w.c cVar = new sg.bigo.ads.common.w.c(aVar.f70256c, aVarA.f70305b);
            cVar.a();
            sg.bigo.ads.common.w.c.C0722c c0722c = cVar.f70299a;
            if (c0722c != null) {
                return Integer.valueOf(c0722c.f70310a);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private static d a(@NonNull View view, int i10) {
        Drawable drawableFindDrawableByLayerId;
        Drawable background = view.getBackground();
        if ((background instanceof LayerDrawable) && (drawableFindDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(sg.bigo.ads.common.utils.d.f69992a)) != null) {
            background = drawableFindDrawableByLayerId;
        }
        byte b10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < 10 && background != null) {
                i11++;
                Object objA = sg.bigo.ads.common.r.a.a(background, "getDrawable", Drawable.class);
                if (!(objA instanceof Drawable)) {
                    break;
                }
                background = (Drawable) objA;
            } else {
                background = null;
                break;
            }
        }
        if (background instanceof ColorDrawable) {
            return new C0721b(view, (ColorDrawable) background, i10, b10);
        }
        if (!(background instanceof ShapeDrawable)) {
            return new e(view, i10);
        }
        Paint paint = ((ShapeDrawable) background).getPaint();
        Paint.Style style = paint.getStyle();
        return (style == Paint.Style.FILL || style == Paint.Style.FILL_AND_STROKE) ? new c(view, paint, i10) : new e(view, i10);
    }

    public static void a(@IntRange(from = 0, to = 255) int i10, @IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @NonNull float[] fArr) {
        float f10;
        float fAbs;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float f13 = i12 / 255.0f;
        float fMax = Math.max(f11, Math.max(f12, f13));
        float fMin = Math.min(f11, Math.min(f12, f13));
        float f14 = fMax - fMin;
        float f15 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f10 = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f11) {
                f10 = ((f12 - f13) / f14) % 6.0f;
            } else {
                f10 = fMax == f12 ? ((f13 - f11) / f14) + 2.0f : 4.0f + ((f11 - f12) / f14);
            }
            fAbs = f14 / (1.0f - Math.abs((2.0f * f15) - 1.0f));
        }
        float f16 = (f10 * 60.0f) % 360.0f;
        if (f16 < 0.0f) {
            f16 += 360.0f;
        }
        fArr[0] = a(f16, 360.0f);
        fArr[1] = a(fAbs, 1.0f);
        fArr[2] = a(f15, 1.0f);
    }

    public static void a(@ColorInt final int i10, @ColorInt final int i11, long j10, final TextView... textViewArr) {
        if (k.a(textViewArr)) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j10 >= 0) {
            valueAnimatorOfFloat.setDuration(j10);
        }
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iA = b.a(b.a(valueAnimator), i10, i11);
                for (TextView textView : textViewArr) {
                    textView.setTextColor(iA);
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    public static void a(@ColorInt int i10, @NonNull float[] fArr) {
        a(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void a(View view) {
        a(view, -1, new a() { // from class: sg.bigo.ads.common.w.b.3
            @Override // sg.bigo.ads.common.w.b.a
            public final long a() {
                return 0L;
            }
        });
    }

    public static void a(Interpolator interpolator, final View view) {
        if (view == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f70274a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f70275b = -1291845632;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setBackgroundColor(b.a(b.a(valueAnimator), this.f70274a, this.f70275b));
            }
        });
        valueAnimatorOfFloat.start();
    }

    public static int b(@ColorInt int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[2];
        if (f10 > 0.3f) {
            fArr[2] = ((f10 - 1.0f) * 0.6857143f) + 0.93f;
        } else {
            fArr[2] = f10 * 1.5f;
        }
        return Color.HSVToColor(fArr);
    }
}
