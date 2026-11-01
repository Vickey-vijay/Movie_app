package ll;

import android.annotation.SuppressLint;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: AndroidDisplayer.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends kl.a<Canvas, Typeface> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Canvas f63637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f63640h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f63633a = new Camera();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f63634b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0577a f63635c = new C0577a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f63636d = new i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f63641i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63642j = 160;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f63643k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f63644l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f63645m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f63646n = 2048;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f63647o = 2048;

    /* JADX INFO: renamed from: ll.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidDisplayer.java */
    public static class C0577a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f63648a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextPaint f63650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextPaint f63651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f63652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Paint f63653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Paint f63654g;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f63669v;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<Float, Float> f63649b = new HashMap(10);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f63655h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f63656i = 4.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f63657j = 3.5f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f63658k = 1.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f63659l = 1.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f63660m = 204;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f63661n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f63662o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f63663p = true;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f63664q = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f63665r = false;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f63666s = false;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f63667t = true;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f63668u = true;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f63670w = kl.b.f62888a;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f63671x = 1.0f;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f63672y = false;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f63673z = 0;
        public int A = 0;

        public void f(kl.c cVar, Paint paint, boolean z10) {
            if (this.f63669v) {
                if (z10) {
                    paint.setStyle(this.f63666s ? Paint.Style.FILL : Paint.Style.FILL_AND_STROKE);
                    paint.setColor(cVar.f62898i & ViewCompat.MEASURED_SIZE_MASK);
                    paint.setAlpha(this.f63666s ? (int) (this.f63660m * (this.f63670w / kl.b.f62888a)) : this.f63670w);
                } else {
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(cVar.f62895f & ViewCompat.MEASURED_SIZE_MASK);
                    paint.setAlpha(this.f63670w);
                }
            } else if (z10) {
                paint.setStyle(this.f63666s ? Paint.Style.FILL : Paint.Style.FILL_AND_STROKE);
                paint.setColor(cVar.f62898i & ViewCompat.MEASURED_SIZE_MASK);
                paint.setAlpha(this.f63666s ? this.f63660m : kl.b.f62888a);
            } else {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(cVar.f62895f & ViewCompat.MEASURED_SIZE_MASK);
                paint.setAlpha(kl.b.f62888a);
            }
            if (cVar.getType() == 7) {
                paint.setAlpha(cVar.c());
            }
        }

        public final void g(kl.c cVar, Paint paint) {
            if (this.f63672y) {
                Float fValueOf = this.f63649b.get(Float.valueOf(cVar.f62900k));
                if (fValueOf == null || this.f63648a != this.f63671x) {
                    float f10 = this.f63671x;
                    this.f63648a = f10;
                    fValueOf = Float.valueOf(cVar.f62900k * f10);
                    this.f63649b.put(Float.valueOf(cVar.f62900k), fValueOf);
                }
                paint.setTextSize(fValueOf.floatValue());
            }
        }

        public void h() {
            this.f63649b.clear();
        }

        public void i(boolean z10) {
            this.f63664q = this.f63663p;
            this.f63662o = this.f63661n;
            this.f63666s = this.f63665r;
            this.f63668u = this.f63667t;
        }

        public Paint j(kl.c cVar) {
            this.f63654g.setColor(cVar.f62901l);
            return this.f63654g;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0028  */
        public TextPaint k(kl.c cVar, boolean z10) {
            TextPaint textPaint;
            int i10;
            if (z10) {
                textPaint = this.f63650c;
            } else {
                textPaint = this.f63651d;
                textPaint.set(this.f63650c);
            }
            textPaint.setTextSize(cVar.f62900k);
            g(cVar, textPaint);
            if (this.f63662o) {
                float f10 = this.f63656i;
                if (f10 <= 0.0f || (i10 = cVar.f62898i) == 0) {
                    textPaint.clearShadowLayer();
                } else {
                    textPaint.setShadowLayer(f10, 0.0f, 0.0f, i10);
                }
            } else {
                textPaint.clearShadowLayer();
            }
            textPaint.setAntiAlias(this.f63668u);
            return textPaint;
        }

        public float l() {
            boolean z10 = this.f63662o;
            if (z10 && this.f63664q) {
                return Math.max(this.f63656i, this.f63657j);
            }
            if (z10) {
                return this.f63656i;
            }
            if (this.f63664q) {
                return this.f63657j;
            }
            return 0.0f;
        }

        public Paint m(kl.c cVar) {
            this.f63653f.setColor(cVar.f62899j);
            return this.f63653f;
        }

        public boolean n(kl.c cVar) {
            return (this.f63664q || this.f63666s) && this.f63657j > 0.0f && cVar.f62898i != 0;
        }

        public void o(float f10, float f11, int i10) {
            if (this.f63658k == f10 && this.f63659l == f11 && this.f63660m == i10) {
                return;
            }
            if (f10 <= 1.0f) {
                f10 = 1.0f;
            }
            this.f63658k = f10;
            if (f11 <= 1.0f) {
                f11 = 1.0f;
            }
            this.f63659l = f11;
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 > 255) {
                i10 = 255;
            }
            this.f63660m = i10;
        }

        public void p(float f10) {
            this.f63672y = f10 != 1.0f;
            this.f63671x = f10;
        }

        public void q(float f10) {
            this.f63656i = f10;
        }

        public void r(float f10) {
            this.f63650c.setStrokeWidth(f10);
            this.f63657j = f10;
        }

        public C0577a() {
            TextPaint textPaint = new TextPaint();
            this.f63650c = textPaint;
            textPaint.setStrokeWidth(this.f63657j);
            this.f63651d = new TextPaint(textPaint);
            this.f63652e = new Paint();
            Paint paint = new Paint();
            this.f63653f = paint;
            paint.setStrokeWidth(this.f63655h);
            this.f63653f.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f63654g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f63654g.setStrokeWidth(4.0f);
        }
    }

    public final synchronized TextPaint C(kl.c cVar, boolean z10) {
        return this.f63635c.k(cVar, z10);
    }

    @Override // kl.l
    public void b(int i10, float[] fArr) {
        if (i10 != -1) {
            if (i10 == 0) {
                C0577a c0577a = this.f63635c;
                c0577a.f63661n = false;
                c0577a.f63663p = false;
                c0577a.f63665r = false;
                return;
            }
            if (i10 == 1) {
                C0577a c0577a2 = this.f63635c;
                c0577a2.f63661n = true;
                c0577a2.f63663p = false;
                c0577a2.f63665r = false;
                L(fArr[0]);
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                C0577a c0577a3 = this.f63635c;
                c0577a3.f63661n = false;
                c0577a3.f63663p = false;
                c0577a3.f63665r = true;
                K(fArr[0], fArr[1], (int) fArr[2]);
                return;
            }
        }
        C0577a c0577a4 = this.f63635c;
        c0577a4.f63661n = false;
        c0577a4.f63663p = true;
        c0577a4.f63665r = false;
        J(fArr[0]);
    }

    @Override // kl.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public synchronized void s(kl.c cVar, Canvas canvas, float f10, float f11, boolean z10) {
        b bVar = this.f63636d;
        if (bVar != null) {
            bVar.c(cVar, canvas, f10, f11, z10, this.f63635c);
        }
    }

    private void update(Canvas canvas) {
        this.f63637e = canvas;
        if (canvas != null) {
            this.f63638f = canvas.getWidth();
            this.f63639g = canvas.getHeight();
            if (this.f63645m) {
                this.f63646n = B(canvas);
                this.f63647o = A(canvas);
            }
        }
    }

    public float D() {
        return this.f63635c.l();
    }

    public final int G(kl.c cVar, Canvas canvas, float f10, float f11) {
        this.f63633a.save();
        float f12 = this.f63640h;
        if (f12 != 0.0f) {
            this.f63633a.setLocation(0.0f, 0.0f, f12);
        }
        this.f63633a.rotateY(-cVar.f62897h);
        this.f63633a.rotateZ(-cVar.f62896g);
        this.f63633a.getMatrix(this.f63634b);
        this.f63634b.preTranslate(-f10, -f11);
        this.f63634b.postTranslate(f10, f11);
        this.f63633a.restore();
        int iSave = canvas.save();
        canvas.concat(this.f63634b);
        return iSave;
    }

    public final void H(kl.c cVar, float f10, float f11) {
        int i10 = cVar.f62902m;
        float f12 = f10 + (i10 * 2);
        float f13 = f11 + (i10 * 2);
        if (cVar.f62901l != 0) {
            float f14 = 8;
            f12 += f14;
            f13 += f14;
        }
        cVar.f62904o = f12 + D();
        cVar.f62905p = f13;
    }

    public void J(float f10) {
        this.f63635c.r(f10);
    }

    public void K(float f10, float f11, int i10) {
        this.f63635c.o(f10, f11, i10);
    }

    public void L(float f10) {
        this.f63635c.q(f10);
    }

    @Override // kl.l
    public void c(float f10, int i10, float f11) {
        this.f63641i = f10;
        this.f63642j = i10;
        this.f63643k = f11;
    }

    @Override // kl.l
    public int d() {
        return this.f63642j;
    }

    @Override // kl.l
    public float e() {
        return this.f63643k;
    }

    @Override // kl.l
    public float f() {
        return this.f63641i;
    }

    @Override // kl.l
    public void g(int i10) {
        this.f63635c.f63673z = i10;
    }

    @Override // kl.l
    public int getHeight() {
        return this.f63639g;
    }

    @Override // kl.l
    public int getMargin() {
        return this.f63635c.f63673z;
    }

    @Override // kl.l
    public int getWidth() {
        return this.f63638f;
    }

    @Override // kl.l
    public int h() {
        return this.f63647o;
    }

    @Override // kl.l
    public void i(kl.c cVar) {
        b bVar = this.f63636d;
        if (bVar != null) {
            bVar.f(cVar);
        }
    }

    @Override // kl.a, kl.l
    public boolean isHardwareAccelerated() {
        return this.f63645m;
    }

    @Override // kl.l
    public void j(boolean z10) {
        this.f63645m = z10;
    }

    @Override // kl.l
    public int k() {
        return this.f63635c.A;
    }

    @Override // kl.l
    public int m() {
        return this.f63644l;
    }

    @Override // kl.l
    public void n(kl.c cVar, boolean z10) {
        b bVar = this.f63636d;
        if (bVar != null) {
            bVar.e(cVar, z10);
        }
    }

    @Override // kl.l
    public int o() {
        return this.f63646n;
    }

    @Override // kl.l
    public void p(int i10, int i11) {
        this.f63638f = i10;
        this.f63639g = i11;
        this.f63640h = (float) (((double) (i10 / 2.0f)) / Math.tan(0.4799655442984406d));
    }

    @Override // kl.a
    public void r() {
        this.f63636d.a();
        this.f63635c.h();
    }

    @Override // kl.a
    public b t() {
        return this.f63636d;
    }

    @Override // kl.a
    public void w(float f10) {
        this.f63635c.p(f10);
    }

    public final void x(kl.c cVar, TextPaint textPaint, boolean z10) {
        this.f63636d.d(cVar, textPaint, z10);
        H(cVar, cVar.f62904o, cVar.f62905p);
    }

    @Override // kl.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Canvas u() {
        return this.f63637e;
    }

    @SuppressLint({"NewApi"})
    public static final int A(Canvas canvas) {
        return canvas.getMaximumBitmapHeight();
    }

    @SuppressLint({"NewApi"})
    public static final int B(Canvas canvas) {
        return canvas.getMaximumBitmapWidth();
    }

    public final void E(Paint paint) {
        int alpha = paint.getAlpha();
        int i10 = kl.b.f62888a;
        if (alpha != i10) {
            paint.setAlpha(i10);
        }
    }

    public final void F(Canvas canvas) {
        canvas.restore();
    }

    @Override // kl.a
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void v(Canvas canvas) {
        update(canvas);
    }

    @Override // kl.l
    public void a(float f10) {
        float fMax = Math.max(f10, getWidth() / 682.0f) * 25.0f;
        this.f63644l = (int) fMax;
        if (f10 > 1.0f) {
            this.f63644l = (int) (fMax * f10);
        }
    }

    @Override // kl.l
    public void l(kl.c cVar, boolean z10) {
        TextPaint textPaintC = C(cVar, z10);
        if (this.f63635c.f63664q) {
            this.f63635c.f(cVar, textPaintC, true);
        }
        x(cVar, textPaintC, z10);
        if (this.f63635c.f63664q) {
            this.f63635c.f(cVar, textPaintC, false);
        }
    }

    @Override // kl.l
    public int q(kl.c cVar) {
        Paint paint;
        boolean z10;
        boolean z11;
        float fL = cVar.l();
        float fG = cVar.g();
        if (this.f63637e == null) {
            return 0;
        }
        Paint paint2 = null;
        int i10 = 1;
        if (cVar.getType() == 7) {
            if (cVar.c() == kl.b.f62889b) {
                return 0;
            }
            if (cVar.f62896g == 0.0f && cVar.f62897h == 0.0f) {
                z11 = false;
            } else {
                G(cVar, this.f63637e, fG, fL);
                z11 = true;
            }
            if (cVar.c() != kl.b.f62888a) {
                paint2 = this.f63635c.f63652e;
                paint2.setAlpha(cVar.c());
            }
            paint = paint2;
            z10 = z11;
        } else {
            paint = null;
            z10 = false;
        }
        if (paint != null && paint.getAlpha() == kl.b.f62889b) {
            return 0;
        }
        if (!this.f63636d.b(cVar, this.f63637e, fG, fL, paint, this.f63635c.f63650c)) {
            if (paint != null) {
                this.f63635c.f63650c.setAlpha(paint.getAlpha());
                this.f63635c.f63651d.setAlpha(paint.getAlpha());
            } else {
                E(this.f63635c.f63650c);
            }
            s(cVar, this.f63637e, fG, fL, false);
            i10 = 2;
        }
        if (z10) {
            F(this.f63637e);
        }
        return i10;
    }
}
