package wa;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MaterialProgressDrawable.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends Drawable implements Animatable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Interpolator f73906k = new LinearInterpolator();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Interpolator f73907l = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f73908m = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Animation> f73909b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f73910c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f73911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f73912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f73913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f73914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f73915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f73916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f73917j;

    /* JADX INFO: renamed from: wa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MaterialProgressDrawable.java */
    public class C0777a extends Animation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f73918b;

        public C0777a(c cVar) {
            this.f73918b = cVar;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            a aVar = a.this;
            if (aVar.f73917j) {
                aVar.a(f10, this.f73918b);
                return;
            }
            float fC = aVar.c(this.f73918b);
            c cVar = this.f73918b;
            float f11 = cVar.f73933l;
            float f12 = cVar.f73932k;
            float f13 = cVar.f73934m;
            a.this.l(f10, cVar);
            if (f10 <= 0.5f) {
                this.f73918b.f73925d = f12 + ((0.8f - fC) * a.f73907l.getInterpolation(f10 / 0.5f));
            }
            if (f10 > 0.5f) {
                this.f73918b.f73926e = f11 + ((0.8f - fC) * a.f73907l.getInterpolation((f10 - 0.5f) / 0.5f));
            }
            a.this.f(f13 + (0.25f * f10));
            a aVar2 = a.this;
            aVar2.g((f10 * 216.0f) + ((aVar2.f73914g / 5.0f) * 1080.0f));
        }
    }

    /* JADX INFO: compiled from: MaterialProgressDrawable.java */
    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f73920b;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        public b(c cVar) {
            this.f73920b = cVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            this.f73920b.j();
            this.f73920b.f();
            c cVar = this.f73920b;
            cVar.f73925d = cVar.f73926e;
            a aVar = a.this;
            if (!aVar.f73917j) {
                aVar.f73914g = (aVar.f73914g + 1.0f) % 5.0f;
                return;
            }
            aVar.f73917j = false;
            animation.setDuration(1332L);
            a.this.k(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.this.f73914g = 0.0f;
        }
    }

    /* JADX INFO: compiled from: MaterialProgressDrawable.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f73922a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f73923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f73924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f73925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f73926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f73927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f73928g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f73929h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f73930i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f73931j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f73932k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f73933l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f73934m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f73935n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f73936o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f73937p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public double f73938q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f73939r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f73940s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f73941t;

        public void g() {
            this.f73932k = 0.0f;
            this.f73933l = 0.0f;
            this.f73934m = 0.0f;
            this.f73925d = 0.0f;
            this.f73926e = 0.0f;
            this.f73927f = 0.0f;
        }

        public c() {
            Paint paint = new Paint();
            this.f73923b = paint;
            Paint paint2 = new Paint();
            this.f73924c = paint2;
            this.f73925d = 0.0f;
            this.f73926e = 0.0f;
            this.f73927f = 0.0f;
            this.f73928g = 5.0f;
            this.f73929h = 2.5f;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f73922a;
            rectF.set(rect);
            float f10 = this.f73929h;
            rectF.inset(f10, f10);
            float f11 = this.f73925d;
            float f12 = this.f73927f;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f73926e + f12) * 360.0f) - f13;
            if (f14 != 0.0f) {
                this.f73923b.setColor(this.f73941t);
                canvas.drawArc(rectF, f13, f14, false, this.f73923b);
            }
            b(canvas, f13, f14, rect);
        }

        public final void b(Canvas canvas, float f10, float f11, Rect rect) {
            if (this.f73935n) {
                Path path = this.f73936o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f73936o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f12 = (((int) this.f73929h) / 2) * this.f73937p;
                float fCos = (float) ((this.f73938q * Math.cos(0.0d)) + ((double) rect.exactCenterX()));
                float fSin = (float) ((this.f73938q * Math.sin(0.0d)) + ((double) rect.exactCenterY()));
                this.f73936o.moveTo(0.0f, 0.0f);
                this.f73936o.lineTo(this.f73939r * this.f73937p, 0.0f);
                Path path3 = this.f73936o;
                float f13 = this.f73939r;
                float f14 = this.f73937p;
                path3.lineTo((f13 * f14) / 2.0f, this.f73940s * f14);
                this.f73936o.offset(fCos - f12, fSin);
                this.f73936o.close();
                this.f73924c.setColor(this.f73941t);
                canvas.rotate((f10 + f11) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f73936o, this.f73924c);
            }
        }

        public int c() {
            return this.f73930i[d()];
        }

        public final int d() {
            return (this.f73931j + 1) % this.f73930i.length;
        }

        public int e() {
            return this.f73930i[this.f73931j];
        }

        public void h(int i10) {
            this.f73931j = i10;
            this.f73941t = this.f73930i[i10];
        }

        public void j() {
            this.f73932k = this.f73925d;
            this.f73933l = this.f73926e;
            this.f73934m = this.f73927f;
        }

        public void f() {
            h(d());
        }

        public void i(int i10, int i11) {
            double dCeil;
            float fMin = Math.min(i10, i11);
            double d10 = this.f73938q;
            if (d10 > 0.0d && fMin >= 0.0f) {
                dCeil = ((double) (fMin / 2.0f)) - d10;
            } else {
                dCeil = Math.ceil(this.f73928g / 2.0f);
            }
            this.f73929h = (float) dCeil;
        }
    }

    public final int b(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    public float c(c cVar) {
        return (float) Math.toRadians(((double) cVar.f73928g) / (cVar.f73938q * 6.283185307179586d));
    }

    public void d(float f10) {
        c cVar = this.f73910c;
        if (cVar.f73937p != f10) {
            cVar.f73937p = f10;
            invalidateSelf();
        }
    }

    public void e(@ColorInt int... iArr) {
        c cVar = this.f73910c;
        cVar.f73930i = iArr;
        cVar.h(0);
    }

    public void f(float f10) {
        this.f73910c.f73927f = f10;
        invalidateSelf();
    }

    public void g(float f10) {
        this.f73911d = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f73916i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f73915h;
    }

    public void i(float f10, float f11) {
        c cVar = this.f73910c;
        cVar.f73925d = f10;
        cVar.f73926e = f11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        List<Animation> list = this.f73909b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animation animation = list.get(i10);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        c cVar = this.f73910c;
        C0777a c0777a = new C0777a(cVar);
        c0777a.setRepeatCount(-1);
        c0777a.setRepeatMode(1);
        c0777a.setInterpolator(f73906k);
        c0777a.setAnimationListener(new b(cVar));
        this.f73913f = c0777a;
    }

    public void k(boolean z10) {
        c cVar = this.f73910c;
        if (cVar.f73935n != z10) {
            cVar.f73935n = z10;
            invalidateSelf();
        }
    }

    public void l(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.f73941t = b((f10 - 0.75f) / 0.25f, cVar.e(), cVar.c());
        }
    }

    public void m(int i10) {
        if (i10 == 0) {
            h(56, 56, 12.5f, 3.0f, 12.0f, 6.0f);
        } else {
            h(40, 40, 8.75f, 2.5f, 10.0f, 5.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f73910c.f73923b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f73913f.reset();
        this.f73910c.j();
        c cVar = this.f73910c;
        if (cVar.f73926e != cVar.f73925d) {
            this.f73917j = true;
            this.f73913f.setDuration(666L);
            this.f73912e.startAnimation(this.f73913f);
        } else {
            cVar.h(0);
            this.f73910c.g();
            this.f73913f.setDuration(1332L);
            this.f73912e.startAnimation(this.f73913f);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f73912e.clearAnimation();
        this.f73910c.h(0);
        this.f73910c.g();
        k(false);
        g(0.0f);
    }

    public a(View view) {
        this.f73912e = view;
        e(f73908m);
        m(1);
        j();
    }

    public void a(float f10, c cVar) {
        l(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.f73934m / 0.8f) + 1.0d);
        float fC = c(cVar);
        float f11 = cVar.f73932k;
        float f12 = cVar.f73933l;
        i(f11 + (((f12 - fC) - f11) * f10), f12);
        float f13 = cVar.f73934m;
        f(f13 + ((fFloor - f13) * f10));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.rotate(this.f73911d, bounds.exactCenterX(), bounds.exactCenterY());
        this.f73910c.a(canvas, bounds);
        canvas.restoreToCount(iSave);
    }

    public final void h(int i10, int i11, float f10, float f11, float f12, float f13) {
        float f14 = Resources.getSystem().getDisplayMetrics().density;
        this.f73915h = i10 * f14;
        this.f73916i = i11 * f14;
        this.f73910c.h(0);
        float f15 = f11 * f14;
        this.f73910c.f73923b.setStrokeWidth(f15);
        c cVar = this.f73910c;
        cVar.f73928g = f15;
        cVar.f73938q = f10 * f14;
        cVar.f73939r = (int) (f12 * f14);
        cVar.f73940s = (int) (f13 * f14);
        cVar.i((int) this.f73915h, (int) this.f73916i);
        invalidateSelf();
    }
}
