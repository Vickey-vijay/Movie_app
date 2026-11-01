package wb;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.TextUtilsCompat;
import com.ruffian.library.widget.R$styleable;
import java.util.Locale;

/* JADX INFO: compiled from: RBaseHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class a<T extends View> implements ViewTreeObserver.OnGlobalLayoutListener {
    public int[] C;
    public int[] D;
    public int[] E;
    public int[] F;
    public int[] G;
    public T G0;
    public GradientDrawable H;
    public GradientDrawable I;
    public GradientDrawable J;
    public GradientDrawable K;
    public GradientDrawable L;
    public Drawable M;
    public Drawable N;
    public Drawable O;
    public Drawable P;
    public Drawable Q;
    public float S;
    public float T;
    public float U;
    public yb.a W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f73949a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f73953c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f73955d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Drawable f73957e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f73959f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f73960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f73962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f73964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f73966j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Drawable f73967j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f73968k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Drawable f73969k0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public StateListDrawable f73973m0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f73977o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Context f73979p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73950b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73952c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73954d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73956e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73958f = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f73970l = -1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f73972m = -1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f73974n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f73976o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f73978p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f73980q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f73982r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f73984s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f73986t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f73988u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f73990v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f73992w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f73994x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f73996y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f73998z = 0;
    public int A = 0;
    public int B = 0;
    public int R = 0;
    public GradientDrawable.Orientation V = GradientDrawable.Orientation.TOP_BOTTOM;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f73951b0 = true;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f73961g0 = 1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f73963h0 = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int f73965i0 = 3;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int[][] f73971l0 = new int[6][];

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float[] f73975n0 = new float[8];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f73981q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f73983r0 = false;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f73985s0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f73987t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f73989u0 = false;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f73991v0 = false;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f73993w0 = false;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f73995x0 = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f73997y0 = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f73999z0 = false;
    public boolean A0 = false;
    public boolean B0 = false;
    public boolean C0 = false;
    public boolean D0 = false;
    public boolean E0 = false;
    public boolean F0 = false;
    public vb.a H0 = new vb.a();
    public boolean I0 = false;

    /* JADX INFO: renamed from: wb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RBaseHelper.java */
    public class ViewOnAttachStateChangeListenerC0778a implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0778a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(a.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(a.this);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: compiled from: RBaseHelper.java */
    public class b implements vb.b.a {
        public b() {
        }

        @Override // vb.b.a
        public Path a(int i10, int i11) {
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), a.this.f73975n0, Path.Direction.CCW);
            return path;
        }
    }

    public final void A() {
        z(false);
        x();
        o();
    }

    public final void B() {
        z(false);
        p();
        o();
    }

    @RequiresApi(api = 21)
    public final Object[] g(boolean z10, int i10) {
        Object obj;
        Drawable shapeDrawable = null;
        if (z10) {
            obj = this.M;
            if (obj == null) {
                obj = this.H;
            }
        } else {
            obj = null;
        }
        int i11 = this.f73959f0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    shapeDrawable = this.f73957e0;
                }
            } else if (z10) {
                Drawable drawable = this.M;
                shapeDrawable = drawable != null ? drawable : new ShapeDrawable(new RoundRectShape(this.f73975n0, null, null));
            } else {
                shapeDrawable = new ShapeDrawable(new RectShape());
            }
        }
        return new Object[]{new zb.b(obj, shapeDrawable).a(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[]{R.attr.state_activated}, new int[0]}, new int[]{i10, i10, i10, i10})), Boolean.valueOf(obj == null && shapeDrawable == null)};
    }

    public final void z(boolean z10) {
        if (z10) {
            this.f73981q0 = (this.f73996y == 0 && this.D == null) ? false : true;
            this.f73985s0 = (this.f73998z == 0 && this.E == null) ? false : true;
            this.f73989u0 = (this.A == 0 && this.F == null) ? false : true;
            this.f73991v0 = (this.B == 0 && this.G == null) ? false : true;
            this.f73983r0 = this.N != null;
            this.f73987t0 = this.O != null;
            this.f73993w0 = this.P != null;
            this.f73995x0 = this.Q != null;
            this.f73997y0 = this.f73986t != 0;
            this.f73999z0 = this.f73988u != 0;
            this.A0 = this.f73990v != 0;
            this.B0 = this.f73992w != 0;
            this.C0 = this.f73976o != -1;
            this.D0 = this.f73978p != -1;
            this.E0 = this.f73980q != -1;
            this.F0 = this.f73982r != -1;
        }
        if (!this.f73981q0) {
            this.f73996y = this.f73994x;
            this.D = this.C;
        }
        if (!this.f73983r0) {
            this.N = this.M;
        }
        if (!this.f73985s0) {
            this.f73998z = this.f73994x;
            this.E = this.C;
        }
        if (!this.f73987t0) {
            this.O = this.M;
        }
        if (!this.f73989u0) {
            this.A = this.f73994x;
            this.F = this.C;
        }
        if (!this.f73991v0) {
            this.B = this.f73994x;
            this.G = this.C;
        }
        if (!this.f73993w0) {
            this.P = this.M;
        }
        if (!this.f73995x0) {
            this.Q = this.M;
        }
        int[] iArr = this.C;
        if (iArr == null || iArr.length <= 0) {
            GradientDrawable gradientDrawable = this.H;
            int i10 = this.f73994x;
            this.H = s(gradientDrawable, new int[]{i10, i10});
        } else {
            this.H = s(this.H, iArr);
        }
        int[] iArr2 = this.D;
        if (iArr2 == null || iArr2.length <= 0) {
            GradientDrawable gradientDrawable2 = this.I;
            int i11 = this.f73996y;
            this.I = s(gradientDrawable2, new int[]{i11, i11});
        } else {
            this.I = s(this.I, iArr2);
        }
        int[] iArr3 = this.E;
        if (iArr3 == null || iArr3.length <= 0) {
            GradientDrawable gradientDrawable3 = this.J;
            int i12 = this.f73998z;
            this.J = s(gradientDrawable3, new int[]{i12, i12});
        } else {
            this.J = s(this.J, iArr3);
        }
        int[] iArr4 = this.F;
        if (iArr4 == null || iArr4.length <= 0) {
            GradientDrawable gradientDrawable4 = this.K;
            int i13 = this.A;
            this.K = s(gradientDrawable4, new int[]{i13, i13});
        } else {
            this.K = s(this.K, iArr4);
        }
        int[] iArr5 = this.G;
        if (iArr5 == null || iArr5.length <= 0) {
            GradientDrawable gradientDrawable5 = this.L;
            int i14 = this.B;
            this.L = s(gradientDrawable5, new int[]{i14, i14});
        } else {
            this.L = s(this.L, iArr5);
        }
        if (!this.C0) {
            this.f73976o = this.f73974n;
        }
        if (!this.D0) {
            this.f73978p = this.f73974n;
        }
        if (!this.E0) {
            this.f73980q = this.f73974n;
        }
        if (!this.F0) {
            this.f73982r = this.f73974n;
        }
        if (!this.f73997y0) {
            this.f73986t = this.f73984s;
        }
        if (!this.f73999z0) {
            this.f73988u = this.f73984s;
        }
        if (!this.A0) {
            this.f73990v = this.f73984s;
        }
        if (this.B0) {
            return;
        }
        this.f73992w = this.f73984s;
    }

    public boolean D() {
        return this.f73953c0;
    }

    public boolean E() {
        return this.f73949a0 >= 0;
    }

    public final void b() {
        T t10 = this.G0;
        if (t10 == null) {
            return;
        }
        t10.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0778a());
    }

    public void c(Canvas canvas) {
        this.H0.c(canvas);
    }

    public final Object[] e(TypedArray typedArray, @StyleableRes int i10) {
        Drawable drawable;
        int color;
        int i11 = this.f73954d;
        int resourceId = typedArray.getResourceId(i10, 0);
        int[] iArr = null;
        if (resourceId != 0) {
            String resourceTypeName = this.f73979p0.getResources().getResourceTypeName(resourceId);
            if ("array".equals(resourceTypeName)) {
                i11 = this.f73956e;
                String[] stringArray = this.f73979p0.getResources().getStringArray(resourceId);
                int[] intArray = this.f73979p0.getResources().getIntArray(resourceId);
                int iMin = Math.min(intArray.length, stringArray.length);
                int[] iArr2 = new int[iMin];
                for (int i12 = 0; i12 < iMin; i12++) {
                    String str = stringArray[i12];
                    int color2 = intArray[i12];
                    if (!TextUtils.isEmpty(str)) {
                        color2 = Color.parseColor(str);
                    }
                    iArr2[i12] = color2;
                }
                color = 0;
                drawable = null;
                iArr = iArr2;
            } else if ("color".equals(resourceTypeName)) {
                color = typedArray.getColor(i10, 0);
                i11 = this.f73954d;
            } else if ("mipmap".equals(resourceTypeName) || "drawable".equals(resourceTypeName)) {
                i11 = this.f73958f;
                drawable = typedArray.getDrawable(i10);
                color = 0;
            } else {
                color = 0;
            }
            return new Object[]{Integer.valueOf(i11), Integer.valueOf(color), iArr, drawable};
        }
        color = typedArray.getColor(i10, 0);
        i11 = this.f73954d;
        drawable = null;
        return new Object[]{Integer.valueOf(i11), Integer.valueOf(color), iArr, drawable};
    }

    public final GradientDrawable.Orientation f(TypedArray typedArray) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BL_TR;
        switch (typedArray.getInt(R$styleable.RBaseView_gradient_orientation, 0)) {
            case 0:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 1:
                return GradientDrawable.Orientation.TR_BL;
            case 2:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 3:
                return GradientDrawable.Orientation.BR_TL;
            case 4:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 5:
                return GradientDrawable.Orientation.BL_TR;
            case 6:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 7:
                return GradientDrawable.Orientation.TL_BR;
            default:
                return orientation;
        }
    }

    public final void h(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            y();
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.G0.getContext().obtainStyledAttributes(attributeSet, R$styleable.RBaseView);
        this.f73960g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_corner_radius, -1);
        this.f73962h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_corner_radius_top_left, 0);
        this.f73964i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_corner_radius_top_right, 0);
        this.f73966j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_corner_radius_bottom_left, 0);
        this.f73968k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_corner_radius_bottom_right, 0);
        this.f73970l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_border_dash_width, -1);
        this.f73972m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_border_dash_gap, -1);
        this.f73974n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_border_width_normal, -1);
        this.f73976o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_border_width_pressed, -1);
        this.f73978p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_border_width_unable, -1);
        this.f73980q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_border_width_checked, -1);
        this.f73982r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_border_width_selected, -1);
        this.f73984s = typedArrayObtainStyledAttributes.getColor(R$styleable.RBaseView_border_color_normal, 0);
        this.f73986t = typedArrayObtainStyledAttributes.getColor(R$styleable.RBaseView_border_color_pressed, 0);
        this.f73988u = typedArrayObtainStyledAttributes.getColor(R$styleable.RBaseView_border_color_unable, 0);
        this.f73990v = typedArrayObtainStyledAttributes.getColor(R$styleable.RBaseView_border_color_checked, 0);
        this.f73992w = typedArrayObtainStyledAttributes.getColor(R$styleable.RBaseView_border_color_selected, 0);
        Object[] objArrE = e(typedArrayObtainStyledAttributes, R$styleable.RBaseView_background_normal);
        this.f73994x = ((Integer) objArrE[1]).intValue();
        this.C = (int[]) objArrE[2];
        this.M = (Drawable) objArrE[3];
        Object[] objArrE2 = e(typedArrayObtainStyledAttributes, R$styleable.RBaseView_background_pressed);
        this.f73996y = ((Integer) objArrE2[1]).intValue();
        this.D = (int[]) objArrE2[2];
        this.N = (Drawable) objArrE2[3];
        Object[] objArrE3 = e(typedArrayObtainStyledAttributes, R$styleable.RBaseView_background_unable);
        this.f73998z = ((Integer) objArrE3[1]).intValue();
        this.E = (int[]) objArrE3[2];
        this.O = (Drawable) objArrE3[3];
        Object[] objArrE4 = e(typedArrayObtainStyledAttributes, R$styleable.RBaseView_background_checked);
        this.A = ((Integer) objArrE4[1]).intValue();
        this.F = (int[]) objArrE4[2];
        this.P = (Drawable) objArrE4[3];
        Object[] objArrE5 = e(typedArrayObtainStyledAttributes, R$styleable.RBaseView_background_selected);
        this.B = ((Integer) objArrE5[1]).intValue();
        this.G = (int[]) objArrE5[2];
        this.Q = (Drawable) objArrE5[3];
        this.R = typedArrayObtainStyledAttributes.getInt(R$styleable.RBaseView_gradient_type, 0);
        this.V = f(typedArrayObtainStyledAttributes);
        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_gradient_radius, -1);
        this.T = typedArrayObtainStyledAttributes.getFloat(R$styleable.RBaseView_gradient_centerX, 0.5f);
        this.U = typedArrayObtainStyledAttributes.getFloat(R$styleable.RBaseView_gradient_centerY, 0.5f);
        this.f73951b0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RBaseView_enabled, true);
        this.f73953c0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RBaseView_ripple, false);
        this.f73955d0 = typedArrayObtainStyledAttributes.getColor(R$styleable.RBaseView_ripple_color, SupportMenu.CATEGORY_MASK);
        this.f73957e0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.RBaseView_ripple_mask);
        this.f73959f0 = typedArrayObtainStyledAttributes.getInt(R$styleable.RBaseView_ripple_mask_style, 2);
        this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_shadow_dx, 0);
        this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_shadow_dy, 0);
        this.Z = typedArrayObtainStyledAttributes.getColor(R$styleable.RBaseView_shadow_color, -7829368);
        this.f73949a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RBaseView_shadow_radius, -1);
        this.I0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RBaseView_clip_layout, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
    }

    public final void i() {
        this.H0.e(this.G0, this.I0, new b());
    }

    public boolean j(int i10, int i11) {
        if (i10 >= 0 - this.f73977o0) {
            int width = this.G0.getWidth();
            int i12 = this.f73977o0;
            if (i10 < width + i12 && i11 >= 0 - i12 && i11 < this.G0.getHeight() + this.f73977o0) {
                return false;
            }
        }
        return true;
    }

    public final boolean l() {
        return this.f73953c0;
    }

    public void m(boolean z10, int i10, int i11, int i12, int i13) {
        this.H0.f(z10, i10, i11, i12, i13);
    }

    public a n(@ColorInt int i10) {
        this.f73994x = i10;
        this.C = null;
        this.M = null;
        A();
        return this;
    }

    public final void o() {
        boolean z10 = (!(this.f73994x == 0 && this.f73998z == 0 && this.f73996y == 0 && this.A == 0 && this.B == 0) || !(this.C == null && this.E == null && this.D == null && this.F == null && this.G == null) || !(this.M == null && this.N == null && this.O == null && this.P == null && this.Q == null)) || ((this.f73960g > (-1.0f) ? 1 : (this.f73960g == (-1.0f) ? 0 : -1)) != 0 || (this.f73962h > 0.0f ? 1 : (this.f73962h == 0.0f ? 0 : -1)) != 0 || (this.f73964i > 0.0f ? 1 : (this.f73964i == 0.0f ? 0 : -1)) != 0 || (this.f73966j > 0.0f ? 1 : (this.f73966j == 0.0f ? 0 : -1)) != 0 || (this.f73968k > 0.0f ? 1 : (this.f73968k == 0.0f ? 0 : -1)) != 0) || ((this.f73970l > (-1.0f) ? 1 : (this.f73970l == (-1.0f) ? 0 : -1)) != 0 || (this.f73972m > (-1.0f) ? 1 : (this.f73972m == (-1.0f) ? 0 : -1)) != 0 || this.f73974n != -1 || this.f73976o != -1 || this.f73978p != -1 || this.f73980q != -1 || this.f73982r != -1 || this.f73984s != 0 || this.f73986t != 0 || this.f73988u != 0 || this.f73990v != 0 || this.f73992w != 0);
        if (z10 || E() || D()) {
            this.f73969k0 = d(z10, this.f73955d0);
            if (E()) {
                if (this.W == null) {
                    this.W = new yb.a();
                }
                this.W.c(this.Z, this.f73949a0, this.X, this.Y, this.f73975n0);
                int iAbs = this.f73949a0 + Math.abs(this.X);
                int iAbs2 = this.f73949a0 + Math.abs(this.X);
                int iAbs3 = this.f73949a0 + Math.abs(this.Y);
                int iAbs4 = this.f73949a0 + Math.abs(this.Y);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.W, this.f73969k0});
                layerDrawable.setLayerInset(1, iAbs, iAbs3, iAbs2, iAbs4);
                this.f73969k0 = layerDrawable;
            }
        } else {
            this.f73969k0 = this.f73967j0;
        }
        this.G0.setBackground(this.f73969k0);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.G0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (this.S <= 0.0f) {
            v(Math.min(this.G0.getWidth(), this.G0.getHeight()) / 2.0f);
        }
        i();
    }

    public final void p() {
        this.H.setStroke(this.f73974n, this.f73984s, this.f73970l, this.f73972m);
        this.I.setStroke(this.f73976o, this.f73986t, this.f73970l, this.f73972m);
        this.J.setStroke(this.f73978p, this.f73988u, this.f73970l, this.f73972m);
        this.K.setStroke(this.f73980q, this.f73990v, this.f73970l, this.f73972m);
        this.L.setStroke(this.f73982r, this.f73992w, this.f73970l, this.f73972m);
    }

    public a q(@ColorInt int i10) {
        this.f73984s = i10;
        B();
        return this;
    }

    public a r(int i10) {
        this.f73974n = i10;
        B();
        return this;
    }

    public final GradientDrawable s(GradientDrawable gradientDrawable, int[] iArr) {
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
        }
        gradientDrawable.setOrientation(this.V);
        gradientDrawable.setColors(iArr);
        return gradientDrawable;
    }

    public void t(float f10) {
        this.f73960g = f10;
        C();
    }

    public final void u() {
        this.H.setGradientType(this.R);
        this.H.setGradientRadius(this.S);
        this.H.setGradientCenter(this.T, this.U);
        this.I.setGradientType(this.R);
        this.I.setGradientRadius(this.S);
        this.I.setGradientCenter(this.T, this.U);
        this.J.setGradientType(this.R);
        this.J.setGradientRadius(this.S);
        this.J.setGradientCenter(this.T, this.U);
        this.K.setGradientType(this.R);
        this.K.setGradientRadius(this.S);
        this.K.setGradientCenter(this.T, this.U);
        this.L.setGradientType(this.R);
        this.L.setGradientRadius(this.S);
        this.L.setGradientCenter(this.T, this.U);
    }

    public a v(float f10) {
        this.S = f10;
        u();
        o();
        return this;
    }

    public final void w() {
        float f10 = this.f73960g;
        if (f10 >= 0.0f) {
            float[] fArr = this.f73975n0;
            fArr[0] = f10;
            fArr[1] = f10;
            fArr[2] = f10;
            fArr[3] = f10;
            fArr[4] = f10;
            fArr[5] = f10;
            fArr[6] = f10;
            fArr[7] = f10;
        } else {
            boolean zK = k();
            float[] fArr2 = this.f73975n0;
            fArr2[0] = zK ? this.f73964i : this.f73962h;
            fArr2[1] = zK ? this.f73964i : this.f73962h;
            fArr2[2] = zK ? this.f73962h : this.f73964i;
            fArr2[3] = zK ? this.f73962h : this.f73964i;
            fArr2[4] = zK ? this.f73966j : this.f73968k;
            fArr2[5] = zK ? this.f73966j : this.f73968k;
            fArr2[6] = zK ? this.f73968k : this.f73966j;
            fArr2[7] = zK ? this.f73968k : this.f73966j;
        }
        this.H.setCornerRadii(this.f73975n0);
        this.I.setCornerRadii(this.f73975n0);
        this.J.setCornerRadii(this.f73975n0);
        this.K.setCornerRadii(this.f73975n0);
        this.L.setCornerRadii(this.f73975n0);
    }

    public final void x() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f73973m0 = stateListDrawable;
        Drawable drawable = this.O;
        if (drawable == null) {
            stateListDrawable.addState(this.f73971l0[0], this.J);
        } else {
            stateListDrawable.addState(this.f73971l0[0], drawable);
        }
        Drawable drawable2 = this.N;
        if (drawable2 == null) {
            this.f73973m0.addState(this.f73971l0[1], this.I);
        } else {
            this.f73973m0.addState(this.f73971l0[1], drawable2);
        }
        Drawable drawable3 = this.N;
        if (drawable3 == null) {
            this.f73973m0.addState(this.f73971l0[2], this.I);
        } else {
            this.f73973m0.addState(this.f73971l0[2], drawable3);
        }
        Drawable drawable4 = this.P;
        if (drawable4 == null) {
            this.f73973m0.addState(this.f73971l0[3], this.K);
        } else {
            this.f73973m0.addState(this.f73971l0[3], drawable4);
        }
        Drawable drawable5 = this.Q;
        if (drawable5 == null) {
            this.f73973m0.addState(this.f73971l0[4], this.L);
        } else {
            this.f73973m0.addState(this.f73971l0[4], drawable5);
        }
        Drawable drawable6 = this.M;
        if (drawable6 == null) {
            this.f73973m0.addState(this.f73971l0[5], this.H);
        } else {
            this.f73973m0.addState(this.f73971l0[5], drawable6);
        }
    }

    public final void y() {
        if (this.G0.isEnabled()) {
            this.G0.setEnabled(this.f73951b0);
        }
        this.H = new GradientDrawable();
        this.I = new GradientDrawable();
        this.J = new GradientDrawable();
        this.K = new GradientDrawable();
        this.L = new GradientDrawable();
        this.f73967j0 = this.G0.getBackground();
        this.f73973m0 = new StateListDrawable();
        int[][] iArr = this.f73971l0;
        iArr[0] = new int[]{-16842910};
        iArr[1] = new int[]{R.attr.state_focused};
        iArr[2] = new int[]{R.attr.state_pressed};
        iArr[3] = new int[]{R.attr.state_checked};
        iArr[4] = new int[]{R.attr.state_selected};
        iArr[5] = new int[]{R.attr.state_enabled};
        z(true);
        u();
        x();
        p();
        w();
        o();
    }

    public a(Context context, T t10, AttributeSet attributeSet) {
        this.G0 = t10;
        this.f73979p0 = context;
        this.f73977o0 = ViewConfiguration.get(context).getScaledTouchSlop();
        h(context, attributeSet);
        b();
    }

    public static boolean k() {
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    public final void C() {
        w();
        o();
    }

    public final Drawable d(boolean z10, int i10) {
        if (!l()) {
            return this.f73973m0;
        }
        Object[] objArrG = g(z10, i10);
        RippleDrawable rippleDrawable = (RippleDrawable) objArrG[0];
        if (((Boolean) objArrG[1]).booleanValue()) {
            return rippleDrawable;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        int[][] iArr2 = {iArr, new int[]{R.attr.state_checked}, new int[]{R.attr.state_selected}, new int[]{R.attr.state_enabled}};
        Drawable drawable = this.O;
        if (drawable == null) {
            stateListDrawable.addState(iArr, this.J);
        } else {
            stateListDrawable.addState(iArr, drawable);
        }
        Drawable drawable2 = this.P;
        if (drawable2 == null) {
            stateListDrawable.addState(iArr2[1], this.K);
        } else {
            stateListDrawable.addState(iArr2[1], drawable2);
        }
        Drawable drawable3 = this.Q;
        if (drawable3 == null) {
            stateListDrawable.addState(iArr2[2], this.L);
        } else {
            stateListDrawable.addState(iArr2[2], drawable3);
        }
        stateListDrawable.addState(iArr2[3], rippleDrawable);
        return stateListDrawable;
    }
}
