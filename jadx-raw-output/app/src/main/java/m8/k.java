package m8;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PhotoViewAttacher.java */
/* JADX INFO: loaded from: classes.dex */
public class k implements View.OnTouchListener, View.OnLayoutChangeListener {
    public float C;
    public final m8.c F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f64271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GestureDetector f64272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m8.b f64273k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m8.d f64279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m8.f f64280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m8.e f64281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f64282t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnClickListener f64283u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View.OnLongClickListener f64284v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f64285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f64286x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f64287y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f f64288z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Interpolator f64264b = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64265c = 200;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f64266d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f64267e = 1.75f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f64268f = 3.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64269g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f64270h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f64274l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f64275m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f64276n = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RectF f64277o = new RectF();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f64278p = new float[9];
    public int A = 2;
    public int B = 2;
    public boolean D = true;
    public ImageView.ScaleType E = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class a implements m8.c {
        @Override // m8.c
        public void d(float f10, float f11, float f12) {
            b(f10, f11, f12, 0.0f, 0.0f);
        }

        public a() {
        }

        @Override // m8.c
        public void a(float f10, float f11) {
            if (k.this.f64273k.e()) {
                return;
            }
            if (k.this.f64287y != null) {
                k.this.f64287y.a(f10, f11);
            }
            k.this.f64276n.postTranslate(f10, f11);
            k.this.z();
            ViewParent parent = k.this.f64271i.getParent();
            if (!k.this.f64269g || k.this.f64273k.e() || k.this.f64270h) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((k.this.A == 2 || ((k.this.A == 0 && f10 >= 1.0f) || ((k.this.A == 1 && f10 <= -1.0f) || ((k.this.B == 0 && f11 >= 1.0f) || (k.this.B == 1 && f11 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // m8.c
        public void b(float f10, float f11, float f12, float f13, float f14) {
            if (k.this.K() < k.this.f64268f || f10 < 1.0f) {
                if (k.this.f64285w != null) {
                    k.this.f64285w.a(f10, f11, f12);
                }
                k.this.f64276n.postScale(f10, f10, f11, f12);
                k.this.f64276n.postTranslate(f13, f14);
                k.this.z();
            }
        }

        @Override // m8.c
        public void c(float f10, float f11, float f12, float f13) {
            k kVar = k.this;
            kVar.f64288z = kVar.new f(kVar.f64271i.getContext());
            f fVar = k.this.f64288z;
            k kVar2 = k.this;
            int iG = kVar2.G(kVar2.f64271i);
            k kVar3 = k.this;
            fVar.c(iG, kVar3.F(kVar3.f64271i), (int) f12, (int) f13);
            k.this.f64271i.post(k.this.f64288z);
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (k.this.f64286x == null || k.this.K() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                return false;
            }
            return k.this.f64286x.onFling(motionEvent, motionEvent2, f10, f11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (k.this.f64284v != null) {
                k.this.f64284v.onLongClick(k.this.f64271i);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class c implements GestureDetector.OnDoubleTapListener {
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fK = k.this.K();
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (fK < k.this.I()) {
                    k kVar = k.this;
                    kVar.g0(kVar.I(), x10, y10, true);
                } else if (fK < k.this.I() || fK >= k.this.H()) {
                    k kVar2 = k.this;
                    kVar2.g0(kVar2.J(), x10, y10, true);
                } else {
                    k kVar3 = k.this;
                    kVar3.g0(kVar3.H(), x10, y10, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (k.this.f64283u != null) {
                k.this.f64283u.onClick(k.this.f64271i);
            }
            RectF rectFB = k.this.B();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (k.this.f64282t != null) {
                k.this.f64282t.a(k.this.f64271i, x10, y10);
            }
            if (rectFB == null) {
                return false;
            }
            if (!rectFB.contains(x10, y10)) {
                if (k.this.f64281s == null) {
                    return false;
                }
                k.this.f64281s.a(k.this.f64271i);
                return false;
            }
            float fWidth = (x10 - rectFB.left) / rectFB.width();
            float fHeight = (y10 - rectFB.top) / rectFB.height();
            if (k.this.f64280r == null) {
                return true;
            }
            k.this.f64280r.a(k.this.f64271i, fWidth, fHeight);
            return true;
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f64293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f64294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f64295d = System.currentTimeMillis();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f64296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f64297f;

        public e(float f10, float f11, float f12, float f13) {
            this.f64293b = f12;
            this.f64294c = f13;
            this.f64296e = f10;
            this.f64297f = f11;
        }

        public final float a() {
            return k.this.f64264b.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f64295d) * 1.0f) / k.this.f64265c));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = a();
            float f10 = this.f64296e;
            k.this.F.d((f10 + ((this.f64297f - f10) * fA)) / k.this.K(), this.f64293b, this.f64294c);
            if (fA < 1.0f) {
                m8.a.a(k.this.f64271i, this);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OverScroller f64299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f64301d;

        public void c(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFB = k.this.B();
            if (rectFB == null) {
                return;
            }
            int iRound3 = Math.round(-rectFB.left);
            float f10 = i10;
            if (f10 < rectFB.width()) {
                iRound = Math.round(rectFB.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFB.top);
            float f11 = i11;
            if (f11 < rectFB.height()) {
                iRound2 = Math.round(rectFB.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f64300c = iRound3;
            this.f64301d = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f64299b.fling(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        public f(Context context) {
            this.f64299b = new OverScroller(context);
        }

        public void a() {
            this.f64299b.forceFinished(true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f64299b.isFinished() && this.f64299b.computeScrollOffset()) {
                int currX = this.f64299b.getCurrX();
                int currY = this.f64299b.getCurrY();
                k.this.f64276n.postTranslate(this.f64300c - currX, this.f64301d - currY);
                k.this.z();
                this.f64300c = currX;
                this.f64301d = currY;
                m8.a.a(k.this.f64271i, this);
            }
        }
    }

    public void f0(float f10) {
        h0(f10, false);
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64292a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f64292a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64292a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64292a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64292a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final RectF C(Matrix matrix) {
        Drawable drawable = this.f64271i.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f64277o.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f64277o);
        return this.f64277o;
    }

    public final Matrix D() {
        this.f64275m.set(this.f64274l);
        this.f64275m.postConcat(this.f64276n);
        return this.f64275m;
    }

    public Matrix E() {
        return this.f64275m;
    }

    public float H() {
        return this.f64268f;
    }

    public float I() {
        return this.f64267e;
    }

    public float J() {
        return this.f64266d;
    }

    public float K() {
        return (float) Math.sqrt(((float) Math.pow(M(this.f64276n, 0), 2.0d)) + ((float) Math.pow(M(this.f64276n, 3), 2.0d)));
    }

    public ImageView.ScaleType L() {
        return this.E;
    }

    public final float M(Matrix matrix, int i10) {
        matrix.getValues(this.f64278p);
        return this.f64278p[i10];
    }

    public final void N() {
        this.f64276n.reset();
        d0(this.C);
        P(D());
        A();
    }

    public void O(boolean z10) {
        this.f64269g = z10;
    }

    public final void P(Matrix matrix) {
        RectF rectFC;
        this.f64271i.setImageMatrix(matrix);
        if (this.f64279q == null || (rectFC = C(matrix)) == null) {
            return;
        }
        this.f64279q.a(rectFC);
    }

    public void Q(float f10) {
        l.a(this.f64266d, this.f64267e, f10);
        this.f64268f = f10;
    }

    public void R(float f10) {
        l.a(this.f64266d, f10, this.f64268f);
        this.f64267e = f10;
    }

    public void S(float f10) {
        l.a(f10, this.f64267e, this.f64268f);
        this.f64266d = f10;
    }

    public void T(View.OnClickListener onClickListener) {
        this.f64283u = onClickListener;
    }

    public void U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f64272j.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void V(View.OnLongClickListener onLongClickListener) {
        this.f64284v = onLongClickListener;
    }

    public void W(m8.d dVar) {
        this.f64279q = dVar;
    }

    public void X(m8.e eVar) {
        this.f64281s = eVar;
    }

    public void Y(m8.f fVar) {
        this.f64280r = fVar;
    }

    public void Z(g gVar) {
        this.f64285w = gVar;
    }

    public void a0(h hVar) {
        this.f64286x = hVar;
    }

    public void b0(i iVar) {
        this.f64287y = iVar;
    }

    public void c0(j jVar) {
        this.f64282t = jVar;
    }

    public void d0(float f10) {
        this.f64276n.postRotate(f10 % 360.0f);
        z();
    }

    public void e0(float f10) {
        this.f64276n.setRotate(f10 % 360.0f);
        z();
    }

    public void g0(float f10, float f11, float f12, boolean z10) {
        if (f10 < this.f64266d || f10 > this.f64268f) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z10) {
            this.f64271i.post(new e(K(), f10, f11, f12));
        } else {
            this.f64276n.setScale(f10, f10, f11, f12);
            z();
        }
    }

    public void h0(float f10, boolean z10) {
        g0(f10, this.f64271i.getRight() / 2, this.f64271i.getBottom() / 2, z10);
    }

    public void j0(int i10) {
        this.f64265c = i10;
    }

    public void k0(boolean z10) {
        this.D = z10;
        update();
    }

    public final void l0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fG = G(this.f64271i);
        float F = F(this.f64271i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f64274l.reset();
        float f10 = intrinsicWidth;
        float f11 = fG / f10;
        float f12 = intrinsicHeight;
        float f13 = F / f12;
        ImageView.ScaleType scaleType = this.E;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f64274l.postTranslate((fG - f10) / 2.0f, (F - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f64274l.postScale(fMax, fMax);
            this.f64274l.postTranslate((fG - (f10 * fMax)) / 2.0f, (F - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f64274l.postScale(fMin, fMin);
            this.f64274l.postTranslate((fG - (f10 * fMin)) / 2.0f, (F - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fG, F);
            if (((int) this.C) % BaseTransientBottomBar.ANIMATION_FADE_DURATION != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = d.f64292a[this.E.ordinal()];
            if (i10 == 1) {
                this.f64274l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 2) {
                this.f64274l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f64274l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f64274l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        N();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        l0(this.f64271i.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        m8.b bVar;
        boolean z11;
        GestureDetector gestureDetector;
        boolean zE;
        boolean zD;
        boolean z12;
        boolean z13;
        RectF rectFB;
        boolean z14 = false;
        if (!this.D || !l.c((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (K() < this.f64266d) {
                    RectF rectFB2 = B();
                    if (rectFB2 != null) {
                        view.post(new e(K(), this.f64266d, rectFB2.centerX(), rectFB2.centerY()));
                        z10 = true;
                    }
                } else if (K() > this.f64268f && (rectFB = B()) != null) {
                    view.post(new e(K(), this.f64268f, rectFB.centerX(), rectFB.centerY()));
                    z10 = true;
                }
            }
            bVar = this.f64273k;
            if (bVar != null) {
                zE = bVar.e();
                zD = this.f64273k.d();
                boolean zF = this.f64273k.f(motionEvent);
                if (!zE || this.f64273k.e()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!zD || this.f64273k.d()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z12 && z13) {
                    z14 = true;
                }
                this.f64270h = z14;
                z11 = zF;
            } else {
                z11 = z10;
            }
            gestureDetector = this.f64272j;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        y();
        z10 = false;
        bVar = this.f64273k;
        if (bVar != null) {
            zE = bVar.e();
            zD = this.f64273k.d();
            boolean zF2 = this.f64273k.f(motionEvent);
            if (zE) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (zD) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z12) {
                z14 = true;
            }
            this.f64270h = z14;
            z11 = zF2;
        } else {
            z11 = z10;
        }
        gestureDetector = this.f64272j;
        return gestureDetector == null ? z11 : z11;
    }

    public void update() {
        if (this.D) {
            l0(this.f64271i.getDrawable());
        } else {
            N();
        }
    }

    public final void y() {
        f fVar = this.f64288z;
        if (fVar != null) {
            fVar.a();
            this.f64288z = null;
        }
    }

    public k(ImageView imageView) {
        a aVar = new a();
        this.F = aVar;
        this.f64271i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.C = 0.0f;
        this.f64273k = new m8.b(imageView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f64272j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    public final boolean A() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF rectFC = C(D());
        if (rectFC == null) {
            return false;
        }
        float fHeight = rectFC.height();
        float fWidth = rectFC.width();
        float F = F(this.f64271i);
        float f15 = 0.0f;
        if (fHeight <= F) {
            int i10 = d.f64292a[this.E.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (F - fHeight) / 2.0f;
                    f14 = rectFC.top;
                } else {
                    f13 = F - fHeight;
                    f14 = rectFC.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -rectFC.top;
            }
            this.B = 2;
        } else {
            float f16 = rectFC.top;
            if (f16 > 0.0f) {
                this.B = 0;
                f10 = -f16;
            } else {
                float f17 = rectFC.bottom;
                if (f17 < F) {
                    this.B = 1;
                    f10 = F - f17;
                } else {
                    this.B = -1;
                    f10 = 0.0f;
                }
            }
        }
        float fG = G(this.f64271i);
        if (fWidth <= fG) {
            int i11 = d.f64292a[this.E.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (fG - fWidth) / 2.0f;
                    f12 = rectFC.left;
                } else {
                    f11 = fG - fWidth;
                    f12 = rectFC.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -rectFC.left;
            }
            this.A = 2;
        } else {
            float f18 = rectFC.left;
            if (f18 > 0.0f) {
                this.A = 0;
                f15 = -f18;
            } else {
                float f19 = rectFC.right;
                if (f19 < fG) {
                    f15 = fG - f19;
                    this.A = 1;
                } else {
                    this.A = -1;
                }
            }
        }
        this.f64276n.postTranslate(f15, f10);
        return true;
    }

    public RectF B() {
        A();
        return C(D());
    }

    public final int F(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int G(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public void i0(ImageView.ScaleType scaleType) {
        if (l.d(scaleType) && scaleType != this.E) {
            this.E = scaleType;
            update();
        }
    }

    public final void z() {
        if (A()) {
            P(D());
        }
    }
}
