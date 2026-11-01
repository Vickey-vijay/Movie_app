package io.bidmachine.rendering.internal;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.view.ViewCompat;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends Drawable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f60431o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final c f60432p = c.TOP_BOTTOM;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f60433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f60434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f60435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f60436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f60437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f60438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorFilter f60439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BlendModeColorFilter f60440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f60442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f60444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f60445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f60446n;

    public static final class b extends Drawable.ConstantState {
        private boolean A;
        private boolean B;
        private ColorStateList C;
        private BlendMode D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f60447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f60448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f60449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f60450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f60451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ColorStateList f60452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f60453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList[] f60454h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float[] f60455i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f60456j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f60457k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f60458l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f60459m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float[] f60460n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Rect f60461o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f60462p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f60463q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f60464r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private float f60465s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f60466t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f60467u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f60468v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private float f60469w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f60470x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f60471y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f60472z;

        public static final class a extends Lambda implements bk.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f60473a = new a();

            public a() {
                super(1);
            }

            @Override // bk.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(ColorStateList colorStateList) {
                if (colorStateList != null) {
                    return Integer.valueOf(colorStateList.getDefaultColor());
                }
                return null;
            }
        }

        public b(b bVar) {
            ck.p.j(bVar, "originalGradientState");
            this.f60456j = -1;
            this.f60462p = -1;
            this.f60463q = -1;
            this.f60464r = 3.0f;
            this.f60465s = 9.0f;
            this.f60466t = -1;
            this.f60467u = -1;
            this.f60469w = 0.5f;
            this.f60470x = 0.5f;
            this.f60471y = 0.5f;
            this.D = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f60447a = bVar.f60447a;
            this.f60448b = bVar.f60448b;
            this.f60449c = bVar.f60449c;
            this.f60450d = bVar.f60450d;
            this.f60451e = bVar.f60451e;
            this.f60452f = bVar.f60452f;
            this.f60453g = bVar.f60453g;
            ColorStateList[] colorStateListArr = bVar.f60454h;
            if (colorStateListArr != null) {
                this.f60454h = (ColorStateList[]) colorStateListArr.clone();
            }
            float[] fArr = bVar.f60455i;
            if (fArr != null) {
                this.f60455i = (float[]) fArr.clone();
            }
            this.f60456j = bVar.f60456j;
            this.f60457k = bVar.f60457k;
            this.f60458l = bVar.f60458l;
            this.f60459m = bVar.f60459m;
            float[] fArr2 = bVar.f60460n;
            if (fArr2 != null) {
                this.f60460n = (float[]) fArr2.clone();
            }
            Rect rect = bVar.f60461o;
            if (rect != null) {
                this.f60461o = new Rect(rect);
            }
            this.f60462p = bVar.f60462p;
            this.f60463q = bVar.f60463q;
            this.f60464r = bVar.f60464r;
            this.f60465s = bVar.f60465s;
            this.f60466t = bVar.f60466t;
            this.f60467u = bVar.f60467u;
            this.f60468v = bVar.f60468v;
            this.f60469w = bVar.f60469w;
            this.f60470x = bVar.f60470x;
            this.f60471y = bVar.f60471y;
            this.f60472z = bVar.f60472z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
        }

        public final int A() {
            return this.f60456j;
        }

        public final int B() {
            return this.f60467u;
        }

        public final float C() {
            return this.f60465s;
        }

        public final ColorStateList D() {
            return this.C;
        }

        public final int E() {
            return this.f60462p;
        }

        public final void a() {
            Boolean boolValueOf;
            boolean z10;
            boolean z11 = false;
            this.A = false;
            this.B = false;
            ColorStateList[] colorStateListArr = this.f60454h;
            if (colorStateListArr == null && this.f60452f == null) {
                return;
            }
            if (colorStateListArr != null) {
                int length = colorStateListArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        ColorStateList colorStateList = colorStateListArr[i10];
                        if (colorStateList != null && !k.a(colorStateList.getDefaultColor())) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                boolValueOf = Boolean.valueOf(z10);
            } else {
                boolValueOf = null;
            }
            if (ck.p.e(boolValueOf, Boolean.TRUE)) {
                return;
            }
            this.B = true;
            if (this.f60448b == 0 && this.f60459m <= 0.0f && this.f60460n == null) {
                z11 = true;
            }
            this.A = z11;
        }

        public final BlendMode b() {
            return this.D;
        }

        public final float c() {
            return this.f60469w;
        }

        public final float d() {
            return this.f60470x;
        }

        public final int e() {
            return this.f60447a;
        }

        public final int[] f() {
            ColorStateList[] colorStateListArr = this.f60454h;
            if (colorStateListArr != null) {
                return k.a(colorStateListArr, a.f60473a);
            }
            return null;
        }

        public final boolean g() {
            return this.f60468v;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i10 = this.f60447a;
            ColorStateList colorStateList = this.f60453g;
            int changingConfigurations = i10 | (colorStateList != null ? colorStateList.getChangingConfigurations() : 0);
            ColorStateList colorStateList2 = this.f60452f;
            int changingConfigurations2 = changingConfigurations | (colorStateList2 != null ? colorStateList2.getChangingConfigurations() : 0);
            ColorStateList colorStateList3 = this.C;
            return changingConfigurations2 | (colorStateList3 != null ? colorStateList3.getChangingConfigurations() : 0);
        }

        public final ColorStateList[] h() {
            return this.f60454h;
        }

        public final float i() {
            return this.f60471y;
        }

        public final int j() {
            return this.f60472z;
        }

        public final int k() {
            return this.f60449c;
        }

        public final int l() {
            return this.f60463q;
        }

        public final int m() {
            return this.f60466t;
        }

        public final float n() {
            return this.f60464r;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new j(this, (ck.i) null);
        }

        public final boolean o() {
            return this.A;
        }

        public final boolean p() {
            return this.B;
        }

        public final c q() {
            return this.f60451e;
        }

        public final Rect r() {
            return this.f60461o;
        }

        public final float[] s() {
            return this.f60455i;
        }

        public final float t() {
            return this.f60459m;
        }

        public final float[] u() {
            return this.f60460n;
        }

        public final int v() {
            return this.f60448b;
        }

        public final ColorStateList w() {
            return this.f60452f;
        }

        public final ColorStateList x() {
            return this.f60453g;
        }

        public final float y() {
            return this.f60458l;
        }

        public final float z() {
            return this.f60457k;
        }

        public b(c cVar, int[] iArr) {
            ck.p.j(cVar, "orientation");
            this.f60456j = -1;
            this.f60462p = -1;
            this.f60463q = -1;
            this.f60464r = 3.0f;
            this.f60465s = 9.0f;
            this.f60466t = -1;
            this.f60467u = -1;
            this.f60469w = 0.5f;
            this.f60470x = 0.5f;
            this.f60471y = 0.5f;
            this.D = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f60451e = cVar;
            a(iArr);
        }

        public final void a(BlendMode blendMode) {
            this.D = blendMode;
        }

        public final void b(int i10) {
            this.f60449c = i10;
        }

        public final void a(int i10) {
            this.f60447a = i10;
        }

        public final void b(ColorStateList colorStateList) {
            this.C = colorStateList;
        }

        public final void a(float f10) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            this.f60459m = f10;
            this.f60460n = null;
            a();
        }

        public final void a(boolean z10) {
            this.f60468v = z10;
        }

        public final void a(int[] iArr) {
            ColorStateList[] colorStateListArr;
            if (iArr != null) {
                colorStateListArr = this.f60454h;
                if (colorStateListArr == null || colorStateListArr.length != iArr.length) {
                    colorStateListArr = new ColorStateList[iArr.length];
                }
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(iArr[i10]);
                    ck.p.i(colorStateListValueOf, "valueOf(it)");
                    colorStateListArr[i10] = colorStateListValueOf;
                }
            } else {
                colorStateListArr = null;
            }
            this.f60454h = colorStateListArr;
            this.f60452f = null;
            a();
        }

        public final void a(float f10, int i10) {
            this.f60471y = f10;
            this.f60472z = i10;
        }

        public final void a(ColorStateList colorStateList) {
            this.f60454h = null;
            this.f60452f = colorStateList;
            a();
        }

        public final void a(int i10, ColorStateList colorStateList, float f10, float f11) {
            this.f60456j = i10;
            this.f60453g = colorStateList;
            this.f60457k = f10;
            this.f60458l = f11;
            a();
        }
    }

    public enum c {
        TOP_BOTTOM,
        TR_BL,
        RIGHT_LEFT,
        BR_TL,
        BOTTOM_TOP,
        BL_TR,
        LEFT_RIGHT,
        TL_BR
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60483a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f60483a = iArr;
        }
    }

    public j() {
        this(new b(f60432p, null));
    }

    private final void a() {
        b bVar = this.f60433a;
        if (this.f60445m) {
            b();
            this.f60434b.reset();
            float[] fArrU = bVar.u();
            if (fArrU != null) {
                this.f60434b.addRoundRect(this.f60435c, fArrU, Path.Direction.CW);
            }
            this.f60445m = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x015e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0054. Please report as an issue. */
    private final boolean b() {
        double dWidth;
        float fHeight;
        float f10;
        Paint paint;
        Shader radialGradient;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        if (this.f60443k) {
            this.f60443k = false;
            Paint paint2 = this.f60438f;
            Rect bounds = getBounds();
            ck.p.i(bounds, "getBounds()");
            float strokeWidth = paint2 != null ? paint2.getStrokeWidth() * 0.5f : 0.0f;
            b bVar = this.f60433a;
            this.f60435c.set(bounds.left + strokeWidth, bounds.top + strokeWidth, bounds.right - strokeWidth, bounds.bottom - strokeWidth);
            int[] iArrF = bVar.f();
            if (iArrF != null) {
                RectF rectF = this.f60435c;
                if (bVar.k() == 0) {
                    switch (d.f60483a[bVar.q().ordinal()]) {
                        case 1:
                            f11 = rectF.left;
                            f12 = rectF.top;
                            f13 = rectF.bottom;
                            f21 = f13 * 1.0f;
                            f22 = f11;
                            f23 = f22;
                            f24 = f12;
                            break;
                        case 2:
                            f14 = rectF.right;
                            f15 = rectF.top;
                            f16 = rectF.left;
                            f25 = f16 * 1.0f;
                            f26 = rectF.bottom;
                            f21 = f26 * 1.0f;
                            f22 = f14;
                            f24 = f15;
                            f23 = f25;
                            break;
                        case 3:
                            f17 = rectF.right;
                            f18 = rectF.top;
                            f19 = rectF.left;
                            f23 = f19 * 1.0f;
                            f22 = f17;
                            f24 = f18;
                            f21 = f24;
                            break;
                        case 4:
                            f14 = rectF.right;
                            f15 = rectF.bottom;
                            f20 = rectF.left;
                            f25 = f20 * 1.0f;
                            f26 = rectF.top;
                            f21 = f26 * 1.0f;
                            f22 = f14;
                            f24 = f15;
                            f23 = f25;
                            break;
                        case 5:
                            f11 = rectF.left;
                            f12 = rectF.bottom;
                            f13 = rectF.top;
                            f21 = f13 * 1.0f;
                            f22 = f11;
                            f23 = f22;
                            f24 = f12;
                            break;
                        case 6:
                            f14 = rectF.left;
                            f15 = rectF.bottom;
                            f20 = rectF.right;
                            f25 = f20 * 1.0f;
                            f26 = rectF.top;
                            f21 = f26 * 1.0f;
                            f22 = f14;
                            f24 = f15;
                            f23 = f25;
                            break;
                        case 7:
                            f17 = rectF.left;
                            f18 = rectF.top;
                            f19 = rectF.right;
                            f23 = f19 * 1.0f;
                            f22 = f17;
                            f24 = f18;
                            f21 = f24;
                            break;
                        default:
                            f14 = rectF.left;
                            f15 = rectF.top;
                            f16 = rectF.right;
                            f25 = f16 * 1.0f;
                            f26 = rectF.bottom;
                            f21 = f26 * 1.0f;
                            f22 = f14;
                            f24 = f15;
                            f23 = f25;
                            break;
                    }
                    paint = this.f60436d;
                    radialGradient = new LinearGradient(f22, f24, f23, f21, iArrF, bVar.s(), Shader.TileMode.CLAMP);
                } else {
                    if (bVar.k() == 1) {
                        float f27 = rectF.left;
                        float fC = f27 + ((rectF.right - f27) * bVar.c());
                        float f28 = rectF.top;
                        float fD = f28 + ((rectF.bottom - f28) * bVar.d());
                        float fI = bVar.i();
                        if (bVar.j() == 1) {
                            float fE = bVar.E() >= 0 ? bVar.E() : rectF.width();
                            fHeight = bVar.l() >= 0 ? bVar.l() : rectF.height();
                            dWidth = fE;
                        } else {
                            if (bVar.j() == 2) {
                                dWidth = rectF.width();
                                fHeight = rectF.height();
                            }
                            this.f60446n = fI;
                            if (fI <= 0.0f) {
                                f10 = 0.001f;
                            } else {
                                f10 = fI;
                            }
                            paint = this.f60436d;
                            radialGradient = new RadialGradient(fC, fD, f10, iArrF, (float[]) null, Shader.TileMode.CLAMP);
                        }
                        fI *= (float) Math.min(dWidth, fHeight);
                        this.f60446n = fI;
                        if (fI <= 0.0f) {
                            f10 = 0.001f;
                        } else {
                            f10 = fI;
                        }
                        paint = this.f60436d;
                        radialGradient = new RadialGradient(fC, fD, f10, iArrF, (float[]) null, Shader.TileMode.CLAMP);
                    } else if (bVar.k() == 2) {
                        float f29 = rectF.left;
                        float fC2 = f29 + ((rectF.right - f29) * bVar.c());
                        float f30 = rectF.top;
                        this.f60436d.setShader(new SweepGradient(fC2, f30 + ((rectF.bottom - f30) * bVar.d()), iArrF, (float[]) null));
                    }
                    if (bVar.w() == null) {
                        this.f60436d.setColor(ViewCompat.MEASURED_STATE_MASK);
                    }
                }
                paint.setShader(radialGradient);
                if (bVar.w() == null) {
                    this.f60436d.setColor(ViewCompat.MEASURED_STATE_MASK);
                }
            }
        }
        return !this.f60435c.isEmpty();
    }

    private final boolean c() {
        Paint paint = this.f60438f;
        if (this.f60433a.A() < 0 || paint == null || k.a(paint.getColor())) {
            return this.f60433a.h() != null || k.a(this.f60436d.getColor());
        }
        return false;
    }

    private final void d() {
        b bVar = this.f60433a;
        ColorStateList colorStateListW = bVar.w();
        if (colorStateListW != null) {
            this.f60436d.setColor(colorStateListW.getColorForState(getState(), 0));
        } else if (bVar.h() == null) {
            this.f60436d.setColor(0);
        } else {
            this.f60436d.setColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f60437e = bVar.r();
        int iA = bVar.A();
        if (iA >= 0) {
            Paint paint = this.f60438f;
            if (paint == null) {
                paint = new Paint(1);
                this.f60438f = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(iA);
            }
            ColorStateList colorStateListX = bVar.x();
            if (colorStateListX != null) {
                paint.setColor(colorStateListX.getColorForState(getState(), 0));
            }
            float fZ = bVar.z();
            if (fZ != 0.0f) {
                paint.setPathEffect(new DashPathEffect(new float[]{fZ, bVar.y()}, 0.0f));
            }
        }
        this.f60440h = a(this.f60440h, bVar.D(), bVar.b());
        this.f60443k = true;
        bVar.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        ck.p.j(canvas, "canvas");
        if (b()) {
            int alpha = this.f60436d.getAlpha();
            Paint paint9 = this.f60438f;
            int alpha2 = paint9 != null ? paint9.getAlpha() : 0;
            int iA = a(alpha);
            int iA2 = a(alpha2);
            Paint paint10 = this.f60438f;
            float strokeWidth = paint10 != null ? paint10.getStrokeWidth() : 0.0f;
            boolean z10 = iA2 > 0 && strokeWidth > 0.0f;
            boolean z11 = iA > 0;
            b bVar = this.f60433a;
            ColorFilter colorFilter = this.f60439g;
            if (colorFilter == null) {
                colorFilter = this.f60440h;
            }
            ColorFilter colorFilter2 = colorFilter;
            boolean z12 = z10 && z11 && bVar.v() != 2 && iA2 < 255 && (this.f60441i < 255 || colorFilter2 != null);
            if (z12) {
                Paint paint11 = this.f60442j;
                if (paint11 == null) {
                    paint11 = new Paint();
                    this.f60442j = paint11;
                }
                Paint paint12 = paint11;
                paint12.setDither(bVar.g());
                paint12.setAlpha(this.f60441i);
                paint12.setColorFilter(colorFilter2);
                RectF rectF = this.f60435c;
                canvas.saveLayer(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, rectF.bottom + strokeWidth, paint12);
                this.f60436d.setColorFilter(null);
                Paint paint13 = this.f60438f;
                if (paint13 != null) {
                    paint13.setColorFilter(null);
                }
            } else {
                this.f60436d.setAlpha(iA);
                this.f60436d.setDither(bVar.g());
                this.f60436d.setColorFilter(colorFilter2);
                if (colorFilter2 != null && bVar.w() == null) {
                    this.f60436d.setColor(this.f60441i << 24);
                }
                if (z10 && (paint = this.f60438f) != null) {
                    paint.setAlpha(iA2);
                    paint.setDither(bVar.g());
                    paint.setColorFilter(colorFilter2);
                }
            }
            int iV = bVar.v();
            if (iV != 0) {
                if (iV == 1) {
                    canvas.drawOval(this.f60435c, this.f60436d);
                    if (z10 && (paint6 = this.f60438f) != null) {
                        canvas.drawOval(this.f60435c, paint6);
                    }
                } else if (iV == 2) {
                    RectF rectF2 = this.f60435c;
                    float fCenterY = rectF2.centerY();
                    if (z10 && (paint7 = this.f60438f) != null) {
                        canvas.drawLine(rectF2.left, fCenterY, rectF2.right, fCenterY, paint7);
                    }
                } else if (iV == 3) {
                    Path pathA = a(bVar);
                    canvas.drawPath(pathA, this.f60436d);
                    if (z10 && (paint8 = this.f60438f) != null) {
                        canvas.drawPath(pathA, paint8);
                    }
                }
            } else if (bVar.u() != null) {
                a();
                canvas.drawPath(this.f60434b, this.f60436d);
                if (z10 && (paint4 = this.f60438f) != null) {
                    canvas.drawPath(this.f60434b, paint4);
                }
            } else if (bVar.t() > 0.0f) {
                float fMin = (float) Math.min(bVar.t(), Math.min(this.f60435c.width(), this.f60435c.height()) * ((double) 0.5f));
                canvas.drawRoundRect(this.f60435c, fMin, fMin, this.f60436d);
                if (z10 && (paint3 = this.f60438f) != null) {
                    canvas.drawRoundRect(this.f60435c, fMin, fMin, paint3);
                }
            } else {
                if (this.f60436d.getColor() != 0 || colorFilter2 != null || this.f60436d.getShader() != null) {
                    canvas.drawRect(this.f60435c, this.f60436d);
                }
                if (z10 && (paint2 = this.f60438f) != null) {
                    canvas.drawRect(this.f60435c, paint2);
                }
            }
            if (z12) {
                canvas.restore();
                return;
            }
            this.f60436d.setAlpha(alpha);
            if (!z10 || (paint5 = this.f60438f) == null) {
                return;
            }
            paint5.setAlpha(alpha2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f60441i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f60433a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f60439g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        b bVar = this.f60433a;
        bVar.a(getChangingConfigurations());
        return bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f60433a.l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f60433a.E();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (this.f60441i == 255 && this.f60433a.o() && c()) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ck.p.j(outline, "outline");
        b bVar = this.f60433a;
        Paint paint = this.f60438f;
        Rect bounds = getBounds();
        ck.p.i(bounds, "getBounds()");
        outline.setAlpha((bVar.p() && (this.f60433a.A() <= 0 || paint == null || paint.getAlpha() == this.f60436d.getAlpha())) ? a(this.f60436d.getAlpha()) / 255.0f : 0.0f);
        int iV = bVar.v();
        if (iV != 0) {
            if (iV == 1) {
                outline.setOval(bounds);
                return;
            } else {
                if (iV != 2) {
                    return;
                }
                float strokeWidth = paint != null ? paint.getStrokeWidth() * 0.5f : 1.0E-4f;
                float fCenterY = bounds.centerY();
                outline.setRect(bounds.left, (int) Math.floor(fCenterY - strokeWidth), bounds.right, (int) Math.ceil(fCenterY + strokeWidth));
                return;
            }
        }
        float[] fArrU = bVar.u();
        if (fArrU == null) {
            outline.setRoundRect(bounds, bVar.t() > 0.0f ? (float) Math.min(bVar.t(), Math.min(bounds.width(), bounds.height()) * ((double) 0.5f)) : 0.0f);
            return;
        }
        a();
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f60434b);
        } else {
            outline.setRoundRect(bounds, nj.n.j0(fArrU));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        ck.p.j(rect, VastAttributes.PADDING);
        Rect rect2 = this.f60437e;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        b bVar = this.f60433a;
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateListW = bVar.w();
        if (colorStateListW != null && colorStateListW.isStateful()) {
            return true;
        }
        ColorStateList colorStateListX = bVar.x();
        if (colorStateListX != null && colorStateListX.isStateful()) {
            return true;
        }
        ColorStateList colorStateListD = bVar.D();
        return colorStateListD != null && colorStateListD.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (super.mutate() == this) {
            this.f60433a = new b(this.f60433a);
            d();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        ck.p.j(rect, "rect");
        super.onBoundsChange(rect);
        this.f60444l = null;
        this.f60445m = true;
        this.f60443k = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        super.onLevelChange(i10);
        this.f60443k = true;
        this.f60445m = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        ColorStateList colorStateListX;
        int colorForState;
        int colorForState2;
        ck.p.j(iArr, "stateSet");
        b bVar = this.f60433a;
        ColorStateList colorStateListW = bVar.w();
        if (colorStateListW == null || this.f60436d.getColor() == (colorForState2 = colorStateListW.getColorForState(iArr, 0))) {
            z10 = false;
        } else {
            this.f60436d.setColor(colorForState2);
            z10 = true;
        }
        Paint paint = this.f60438f;
        if (paint != null && (colorStateListX = bVar.x()) != null && paint.getColor() != (colorForState = colorStateListX.getColorForState(iArr, 0))) {
            paint.setColor(colorForState);
            z10 = true;
        }
        if (bVar.D() != null && bVar.b() != null) {
            this.f60440h = a(this.f60440h, bVar.D(), bVar.b());
        } else if (!z10) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f60441i != i10) {
            this.f60441i = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f60439g != colorFilter) {
            this.f60439g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        if (this.f60433a.g() != z10) {
            this.f60433a.a(z10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.f60433a.a(blendMode);
        this.f60440h = a(this.f60440h, this.f60433a.D(), blendMode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f60433a.b(colorStateList);
        this.f60440h = a(this.f60440h, colorStateList, this.f60433a.b());
        invalidateSelf();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    private j(b bVar) {
        this.f60434b = new Path();
        this.f60435c = new RectF();
        this.f60436d = new Paint(1);
        this.f60441i = 255;
        this.f60445m = true;
        this.f60433a = bVar;
        d();
    }

    private final Path a(b bVar) {
        Path path = this.f60444l;
        if (path != null && !this.f60445m) {
            return path;
        }
        this.f60445m = false;
        float level = (getLevel() * 360.0f) / 10000.0f;
        RectF rectF = new RectF(this.f60435c);
        float fWidth = rectF.width() / 2.0f;
        float fHeight = rectF.height() / 2.0f;
        float fB = bVar.B() != -1 ? bVar.B() : rectF.width() / bVar.C();
        float fM = bVar.m() != -1 ? bVar.m() : rectF.width() / bVar.n();
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(fWidth - fM, fHeight - fM);
        RectF rectF3 = new RectF(rectF2);
        float f10 = -fB;
        rectF3.inset(f10, f10);
        Path path2 = this.f60444l;
        if (path2 != null) {
            path2.reset();
        } else {
            path2 = new Path();
            this.f60444l = path2;
        }
        if (level >= 360.0f || level <= -360.0f) {
            path2.addOval(rectF3, Path.Direction.CW);
            path2.addOval(rectF2, Path.Direction.CCW);
        } else {
            path2.setFillType(Path.FillType.EVEN_ODD);
            float f11 = fWidth + fM;
            path2.moveTo(f11, fHeight);
            path2.lineTo(f11 + fB, fHeight);
            path2.arcTo(rectF3, 0.0f, level, false);
            path2.arcTo(rectF2, level, -level, false);
            path2.close();
        }
        path2.addOval(rectF3, Path.Direction.CW);
        path2.addOval(rectF2, Path.Direction.CCW);
        return path2;
    }

    public final void b(int i10) {
        this.f60433a.a(ColorStateList.valueOf(i10));
        this.f60436d.setColor(i10);
        invalidateSelf();
    }

    public final void c(int i10) {
        this.f60433a.b(i10);
        this.f60443k = true;
        invalidateSelf();
    }

    public /* synthetic */ j(b bVar, ck.i iVar) {
        this(bVar);
    }

    private final int a(int i10) {
        int i11 = this.f60441i;
        return (i10 * (i11 + (i11 >> 7))) >> 8;
    }

    private final void b(int i10, int i11, float f10, float f11) {
        Paint paint = this.f60438f;
        if (paint == null) {
            paint = new Paint(1);
            this.f60438f = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
        paint.setPathEffect(f10 > 0.0f ? new DashPathEffect(new float[]{f10, f11}, 0.0f) : null);
        this.f60443k = true;
        invalidateSelf();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(c cVar, int[] iArr) {
        this(new b(cVar, iArr));
        ck.p.j(cVar, "orientation");
    }

    public final void a(float f10) {
        this.f60433a.a(f10);
        this.f60445m = true;
        invalidateSelf();
    }

    public final void a(float f10, int i10) {
        this.f60433a.a(f10, i10);
        this.f60443k = true;
        invalidateSelf();
    }

    public static /* synthetic */ void a(j jVar, float f10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = 0.5f;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        jVar.a(f10, i10);
    }

    public final void a(int i10, int i11, float f10, float f11) {
        this.f60433a.a(i10, ColorStateList.valueOf(i11), f10, f11);
        b(i10, i11, f10, f11);
    }

    public static /* synthetic */ void a(j jVar, int i10, int i11, float f10, float f11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f11 = 0.0f;
        }
        jVar.a(i10, i11, f10, f11);
    }

    private final BlendModeColorFilter a(BlendModeColorFilter blendModeColorFilter, ColorStateList colorStateList, BlendMode blendMode) {
        if (colorStateList == null || blendMode == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return blendModeColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        return (blendModeColorFilter != null && blendModeColorFilter.getColor() == colorForState && blendModeColorFilter.getMode() == blendMode) ? blendModeColorFilter : new BlendModeColorFilter(colorForState, blendMode);
    }
}
