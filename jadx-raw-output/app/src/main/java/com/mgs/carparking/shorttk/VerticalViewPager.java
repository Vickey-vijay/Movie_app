package com.mgs.carparking.shorttk;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class VerticalViewPager extends ViewGroup {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int[] f41671h0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Comparator<d> f41672i0 = new a();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Interpolator f41673j0 = new b();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h f41674k0 = new h();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public VelocityTracker J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public EdgeEffectCompat P;
    public EdgeEffectCompat Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public ViewPager.OnPageChangeListener V;
    public ViewPager.OnPageChangeListener W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public f f41675a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41676b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ViewPager.PageTransformer f41677b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41678c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Method f41679c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<d> f41680d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f41681d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f41682e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ArrayList<View> f41683e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f41684f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Runnable f41685f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PagerAdapter f41686g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f41687g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Parcelable f41690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ClassLoader f41691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Scroller f41692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f41693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f41695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f41698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f41699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f41700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f41701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f41702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f41703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f41704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f41705y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f41706z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f41714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ClassLoader f41715d;

        public class a implements ParcelableCompatCreatorCallbacks<SavedState> {
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f41713b = parcel.readInt();
            this.f41714c = parcel.readParcelable(classLoader);
            this.f41715d = classLoader;
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f41713b + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f41713b);
            parcel.writeParcelable(this.f41714c, i10);
        }
    }

    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f41718b - dVar2.f41718b;
        }
    }

    public class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.D();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f41717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f41719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f41720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f41721e;
    }

    public class e extends AccessibilityDelegateCompat {
        public e() {
        }

        public final boolean canScroll() {
            return VerticalViewPager.this.f41686g != null && VerticalViewPager.this.f41686g.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat accessibilityRecordCompatObtain = AccessibilityRecordCompat.obtain();
            accessibilityRecordCompatObtain.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f41686g != null) {
                accessibilityRecordCompatObtain.setItemCount(VerticalViewPager.this.f41686g.getCount());
                accessibilityRecordCompatObtain.setFromIndex(VerticalViewPager.this.f41688h);
                accessibilityRecordCompatObtain.setToIndex(VerticalViewPager.this.f41688h);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (VerticalViewPager.this.v(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (VerticalViewPager.this.v(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !VerticalViewPager.this.v(-1)) {
                    return false;
                }
                VerticalViewPager verticalViewPager = VerticalViewPager.this;
                verticalViewPager.setCurrentItem(verticalViewPager.f41688h - 1);
                return true;
            }
            if (!VerticalViewPager.this.v(1)) {
                return false;
            }
            VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
            verticalViewPager2.setCurrentItem(verticalViewPager2.f41688h + 1);
            return true;
        }
    }

    public interface f {
        void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VerticalViewPager.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VerticalViewPager.this.j();
        }
    }

    public final void G() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i10).getLayoutParams()).f41707a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    public void J(int i10, boolean z10) {
        this.f41704x = false;
        K(i10, z10, false);
    }

    public void K(int i10, boolean z10, boolean z11) {
        L(i10, z10, z11, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        d dVarR;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (dVarR = r(childAt)) != null && dVarR.f41718b == this.f41688h) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public boolean h(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i12 + scrollY;
                if (i14 >= childAt.getTop() && i14 < childAt.getBottom() && (i13 = i11 + scrollX) >= childAt.getLeft() && i13 < childAt.getRight() && h(childAt, true, i10, i13 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && ViewCompat.canScrollVertically(view, -i10);
    }

    public final void n() {
        this.f41706z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f41706z = false;
            this.A = false;
            this.I = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.f41706z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.G = x10;
            this.E = x10;
            float y10 = motionEvent.getY();
            this.H = y10;
            this.F = y10;
            this.I = MotionEventCompat.getPointerId(motionEvent, 0);
            this.A = false;
            this.f41692l.computeScrollOffset();
            if (this.f41687g0 != 2 || Math.abs(this.f41692l.getFinalY() - this.f41692l.getCurrY()) <= this.N) {
                i(false);
                this.f41706z = false;
            } else {
                this.f41692l.abortAnimation();
                this.f41704x = false;
                D();
                this.f41706z = true;
                H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.I;
            if (i10 != -1) {
                int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i10);
                float y11 = MotionEventCompat.getY(motionEvent, iFindPointerIndex);
                float f10 = y11 - this.F;
                float fAbs = Math.abs(f10);
                float x11 = MotionEventCompat.getX(motionEvent, iFindPointerIndex);
                float fAbs2 = Math.abs(x11 - this.G);
                if (f10 != 0.0f && !w(this.F, f10) && h(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.E = x11;
                    this.F = y11;
                    this.A = true;
                    return false;
                }
                int i11 = this.D;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f41706z = true;
                    H(true);
                    setScrollState(1);
                    this.F = f10 > 0.0f ? this.H + this.D : this.H - this.D;
                    this.E = x11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.A = true;
                }
                if (this.f41706z && C(y11)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.f41706z;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredHeight = getMeasuredHeight();
        this.C = Math.min(measuredHeight / 10, this.B);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f41707a) {
                int i15 = layoutParams2.f41708b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = measuredWidth;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = measuredWidth;
                }
                int i20 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i20 == -2) {
                    i20 = paddingTop;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = paddingTop;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    paddingTop -= childAt.getMeasuredHeight();
                } else if (z10) {
                    measuredWidth -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f41700t = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.f41701u = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.f41702v = true;
        D();
        this.f41702v = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) != null || !layoutParams.f41707a)) {
                childAt2.measure(this.f41700t, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * layoutParams.f41709c), 1073741824));
            }
        }
    }

    public d r(View view) {
        for (int i10 = 0; i10 < this.f41680d.size(); i10++) {
            d dVar = this.f41680d.get(i10);
            if (this.f41686g.isViewFromObject(view, dVar.f41717a)) {
                return dVar;
            }
        }
        return null;
    }

    public void setCurrentItem(int i10) {
        this.f41704x = false;
        K(i10, !this.R, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f41705y) {
            this.f41705y = i10;
            D();
        }
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f41695o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public d t(int i10) {
        for (int i11 = 0; i11 < this.f41680d.size(); i11++) {
            d dVar = this.f41680d.get(i11);
            if (dVar.f41718b == i10) {
                return dVar;
            }
        }
        return null;
    }

    public void u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f41692l = new Scroller(context, f41673j0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.D = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.K = (int) (400.0f * f10);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffectCompat(context);
        this.Q = new EdgeEffectCompat(context);
        this.M = (int) (25.0f * f10);
        this.N = (int) (2.0f * f10);
        this.B = (int) (f10 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new e());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f41707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f41709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f41710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f41711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f41712f;

        public LayoutParams() {
            super(-1, -1);
            this.f41709c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41709c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f41671h0);
            this.f41708b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z10 = layoutParams.f41707a;
            if (z10 != layoutParams2.f41707a) {
                if (z10) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.f41711e - layoutParams2.f41711e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i10) {
        if (this.f41687g0 == i10) {
            return;
        }
        this.f41687g0 = i10;
        if (this.f41677b0 != null) {
            m(i10 != 0);
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.V;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i10);
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f41703w != z10) {
            this.f41703w = z10;
        }
    }

    public final boolean A(int i10) {
        if (this.f41680d.size() == 0) {
            this.T = false;
            x(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        d dVarS = s();
        int clientHeight = getClientHeight();
        int i11 = this.f41694n;
        int i12 = clientHeight + i11;
        float f10 = clientHeight;
        int i13 = dVarS.f41718b;
        float f11 = ((i10 / f10) - dVarS.f41721e) / (dVarS.f41720d + (i11 / f10));
        this.T = false;
        x(i13, f11, (int) (i12 * f11));
        if (this.T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public boolean B() {
        int i10 = this.f41688h;
        if (i10 <= 0) {
            return false;
        }
        J(i10 - 1, true);
        return true;
    }

    public final boolean C(float f10) {
        boolean z10;
        float f11 = this.F - f10;
        this.F = f10;
        float scrollY = getScrollY() + f11;
        float clientHeight = getClientHeight();
        float f12 = this.f41698r * clientHeight;
        float f13 = this.f41699s * clientHeight;
        boolean zOnPull = false;
        d dVar = this.f41680d.get(0);
        ArrayList<d> arrayList = this.f41680d;
        boolean z11 = true;
        d dVar2 = arrayList.get(arrayList.size() - 1);
        if (dVar.f41718b != 0) {
            f12 = dVar.f41721e * clientHeight;
            z10 = false;
        } else {
            z10 = true;
        }
        if (dVar2.f41718b != this.f41686g.getCount() - 1) {
            f13 = dVar2.f41721e * clientHeight;
            z11 = false;
        }
        if (scrollY < f12) {
            zOnPull = z10 ? this.P.onPull(Math.abs(f12 - scrollY) / clientHeight) : false;
            scrollY = f12;
        } else if (scrollY > f13) {
            zOnPull = z11 ? this.Q.onPull(Math.abs(scrollY - f13) / clientHeight) : false;
            scrollY = f13;
        }
        int i10 = (int) scrollY;
        this.E += scrollY - i10;
        scrollTo(getScrollX(), i10);
        A(i10);
        return zOnPull;
    }

    public void D() {
        E(this.f41688h);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00fe A[PHI: r6 r8 r11
  0x00fe: PHI (r6v43 float) = (r6v41 float), (r6v42 float), (r6v10 float) binds: [B:64:0x00f3, B:61:0x00dd, B:55:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r8v6 int) = (r8v5 int), (r8v4 int), (r8v9 int) binds: [B:64:0x00f3, B:61:0x00dd, B:55:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r11v7 int) = (r11v1 int), (r11v6 int), (r11v10 int) binds: [B:64:0x00f3, B:61:0x00dd, B:55:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    public void E(int i10) {
        int i11;
        d dVarT;
        String hexString;
        d dVarE;
        d dVarR;
        d dVar;
        int i12 = this.f41688h;
        if (i12 != i10) {
            i11 = i12 < i10 ? 130 : 33;
            dVarT = t(i12);
            this.f41688h = i10;
        } else {
            i11 = 2;
            dVarT = null;
        }
        if (this.f41686g == null) {
            N();
            return;
        }
        if (this.f41704x) {
            N();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f41686g.startUpdate((ViewGroup) this);
        int i13 = this.f41705y;
        int iMax = Math.max(0, this.f41688h - i13);
        int count = this.f41686g.getCount();
        int iMin = Math.min(count - 1, this.f41688h + i13);
        if (count != this.f41678c) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f41678c + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f41686g.getClass());
        }
        int i14 = 0;
        while (true) {
            if (i14 < this.f41680d.size()) {
                dVarE = this.f41680d.get(i14);
                int i15 = dVarE.f41718b;
                int i16 = this.f41688h;
                if (i15 >= i16) {
                    if (i15 != i16) {
                        break;
                    } else {
                        break;
                    }
                }
                i14++;
            }
            dVarE = null;
            break;
        }
        if (dVarE == null && count > 0) {
            dVarE = e(this.f41688h, i14);
        }
        if (dVarE != null) {
            int i17 = i14 - 1;
            d dVar2 = i17 >= 0 ? this.f41680d.get(i17) : null;
            int clientHeight = getClientHeight();
            float paddingLeft = clientHeight <= 0 ? 0.0f : (2.0f - dVarE.f41720d) + (getPaddingLeft() / clientHeight);
            float f10 = 0.0f;
            for (int i18 = this.f41688h - 1; i18 >= 0; i18--) {
                if (f10 < paddingLeft || i18 >= iMax) {
                    if (dVar2 == null || i18 != dVar2.f41718b) {
                        f10 += e(i18, i17 + 1).f41720d;
                        i14++;
                        if (i17 >= 0) {
                            dVar = this.f41680d.get(i17);
                        } else {
                            dVar = null;
                        }
                    } else {
                        f10 += dVar2.f41720d;
                        i17--;
                        if (i17 >= 0) {
                            dVar = this.f41680d.get(i17);
                        } else {
                            dVar = null;
                        }
                    }
                    dVar2 = dVar;
                } else {
                    if (dVar2 == null) {
                        break;
                    }
                    if (i18 == dVar2.f41718b && !dVar2.f41719c) {
                        this.f41680d.remove(i17);
                        this.f41686g.destroyItem((ViewGroup) this, i18, dVar2.f41717a);
                        i17--;
                        i14--;
                        if (i17 >= 0) {
                            dVar = this.f41680d.get(i17);
                        } else {
                            dVar = null;
                        }
                        dVar2 = dVar;
                    }
                }
            }
            float f11 = dVarE.f41720d;
            int i19 = i14 + 1;
            if (f11 < 2.0f) {
                d dVar3 = i19 < this.f41680d.size() ? this.f41680d.get(i19) : null;
                float paddingRight = clientHeight <= 0 ? 0.0f : (getPaddingRight() / clientHeight) + 2.0f;
                int i20 = this.f41688h;
                while (true) {
                    i20++;
                    if (i20 >= count) {
                        break;
                    }
                    if (f11 >= paddingRight && i20 > iMin) {
                        if (dVar3 == null) {
                            break;
                        }
                        if (i20 == dVar3.f41718b && !dVar3.f41719c) {
                            this.f41680d.remove(i19);
                            this.f41686g.destroyItem((ViewGroup) this, i20, dVar3.f41717a);
                            if (i19 < this.f41680d.size()) {
                                dVar3 = this.f41680d.get(i19);
                            }
                        }
                    } else if (dVar3 == null || i20 != dVar3.f41718b) {
                        d dVarE2 = e(i20, i19);
                        i19++;
                        f11 += dVarE2.f41720d;
                        dVar3 = i19 < this.f41680d.size() ? this.f41680d.get(i19) : null;
                    } else {
                        f11 += dVar3.f41720d;
                        i19++;
                        if (i19 < this.f41680d.size()) {
                            dVar3 = this.f41680d.get(i19);
                        }
                    }
                }
            }
            g(dVarE, i14, dVarT);
        }
        this.f41686g.setPrimaryItem((ViewGroup) this, this.f41688h, dVarE != null ? dVarE.f41717a : null);
        this.f41686g.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f41712f = i21;
            if (!layoutParams.f41707a && layoutParams.f41709c == 0.0f && (dVarR = r(childAt)) != null) {
                layoutParams.f41709c = dVarR.f41720d;
                layoutParams.f41711e = dVarR.f41718b;
            }
        }
        N();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            d dVarQ = viewFindFocus != null ? q(viewFindFocus) : null;
            if (dVarQ == null || dVarQ.f41718b != this.f41688h) {
                for (int i22 = 0; i22 < getChildCount(); i22++) {
                    View childAt2 = getChildAt(i22);
                    d dVarR2 = r(childAt2);
                    if (dVarR2 != null && dVarR2.f41718b == this.f41688h && childAt2.requestFocus(i11)) {
                        return;
                    }
                }
            }
        }
    }

    public final void F(int i10, int i11, int i12, int i13) {
        if (i11 <= 0 || this.f41680d.isEmpty()) {
            d dVarT = t(this.f41688h);
            int iMin = (int) ((dVarT != null ? Math.min(dVarT.f41721e, this.f41699s) : 0.0f) * ((i10 - getPaddingTop()) - getPaddingBottom()));
            if (iMin != getScrollY()) {
                i(false);
                scrollTo(getScrollX(), iMin);
                return;
            }
            return;
        }
        int scrollY = (int) ((getScrollY() / (((i11 - getPaddingTop()) - getPaddingBottom()) + i13)) * (((i10 - getPaddingTop()) - getPaddingBottom()) + i12));
        scrollTo(getScrollX(), scrollY);
        if (this.f41692l.isFinished()) {
            return;
        }
        this.f41692l.startScroll(0, scrollY, 0, (int) (t(this.f41688h).f41721e * i10), this.f41692l.getDuration() - this.f41692l.timePassed());
    }

    public void L(int i10, boolean z10, boolean z11, int i11) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        PagerAdapter pagerAdapter = this.f41686g;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f41688h == i10 && this.f41680d.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f41686g.getCount()) {
            i10 = this.f41686g.getCount() - 1;
        }
        int i12 = this.f41705y;
        int i13 = this.f41688h;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f41680d.size(); i14++) {
                this.f41680d.get(i14).f41719c = true;
            }
        }
        boolean z12 = this.f41688h != i10;
        if (!this.R) {
            E(i10);
            I(i10, z10, i11, z12);
            return;
        }
        this.f41688h = i10;
        if (z12 && (onPageChangeListener2 = this.V) != null) {
            onPageChangeListener2.onPageSelected(i10);
        }
        if (z12 && (onPageChangeListener = this.W) != null) {
            onPageChangeListener.onPageSelected(i10);
        }
        requestLayout();
    }

    public final void N() {
        if (this.f41681d0 != 0) {
            ArrayList<View> arrayList = this.f41683e0;
            if (arrayList == null) {
                this.f41683e0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f41683e0.add(getChildAt(i10));
            }
            Collections.sort(this.f41683e0, f41674k0);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f41692l.isFinished() || !this.f41692l.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f41692l.getCurrX();
        int currY = this.f41692l.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currY)) {
                this.f41692l.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public d e(int i10, int i11) {
        d dVar = new d();
        dVar.f41718b = i10;
        dVar.f41717a = this.f41686g.instantiateItem((ViewGroup) this, i10);
        dVar.f41720d = this.f41686g.getPageWidth(i10);
        if (i11 < 0 || i11 >= this.f41680d.size()) {
            this.f41680d.add(dVar);
        } else {
            this.f41680d.add(i11, dVar);
        }
        return dVar;
    }

    public final void g(d dVar, int i10, d dVar2) {
        int i11;
        int i12;
        d dVar3;
        d dVar4;
        int count = this.f41686g.getCount();
        int clientHeight = getClientHeight();
        float f10 = clientHeight > 0 ? this.f41694n / clientHeight : 0.0f;
        if (dVar2 != null) {
            int i13 = dVar2.f41718b;
            int i14 = dVar.f41718b;
            if (i13 < i14) {
                float pageWidth = dVar2.f41721e + dVar2.f41720d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= dVar.f41718b && i16 < this.f41680d.size()) {
                    d dVar5 = this.f41680d.get(i16);
                    while (true) {
                        dVar4 = dVar5;
                        if (i15 <= dVar4.f41718b || i16 >= this.f41680d.size() - 1) {
                            break;
                        }
                        i16++;
                        dVar5 = this.f41680d.get(i16);
                    }
                    while (i15 < dVar4.f41718b) {
                        pageWidth += this.f41686g.getPageWidth(i15) + f10;
                        i15++;
                    }
                    dVar4.f41721e = pageWidth;
                    pageWidth += dVar4.f41720d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f41680d.size() - 1;
                float pageWidth2 = dVar2.f41721e;
                while (true) {
                    i13--;
                    if (i13 < dVar.f41718b || size < 0) {
                        break;
                    }
                    d dVar6 = this.f41680d.get(size);
                    while (true) {
                        dVar3 = dVar6;
                        if (i13 >= dVar3.f41718b || size <= 0) {
                            break;
                        }
                        size--;
                        dVar6 = this.f41680d.get(size);
                    }
                    while (i13 > dVar3.f41718b) {
                        pageWidth2 -= this.f41686g.getPageWidth(i13) + f10;
                        i13--;
                    }
                    pageWidth2 -= dVar3.f41720d + f10;
                    dVar3.f41721e = pageWidth2;
                }
            }
        }
        int size2 = this.f41680d.size();
        float pageWidth3 = dVar.f41721e;
        int i17 = dVar.f41718b;
        int i18 = i17 - 1;
        this.f41698r = i17 == 0 ? pageWidth3 : -3.4028235E38f;
        int i19 = count - 1;
        this.f41699s = i17 == i19 ? (dVar.f41720d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            d dVar7 = this.f41680d.get(i20);
            while (true) {
                i12 = dVar7.f41718b;
                if (i18 <= i12) {
                    break;
                }
                pageWidth3 -= this.f41686g.getPageWidth(i18) + f10;
                i18--;
            }
            pageWidth3 -= dVar7.f41720d + f10;
            dVar7.f41721e = pageWidth3;
            if (i12 == 0) {
                this.f41698r = pageWidth3;
            }
            i20--;
            i18--;
        }
        float pageWidth4 = dVar.f41721e + dVar.f41720d + f10;
        int i21 = dVar.f41718b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            d dVar8 = this.f41680d.get(i22);
            while (true) {
                i11 = dVar8.f41718b;
                if (i21 >= i11) {
                    break;
                }
                pageWidth4 += this.f41686g.getPageWidth(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f41699s = (dVar8.f41720d + pageWidth4) - 1.0f;
            }
            dVar8.f41721e = pageWidth4;
            pageWidth4 += dVar8.f41720d + f10;
            i22++;
            i21++;
        }
        this.S = false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public PagerAdapter getAdapter() {
        return this.f41686g;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f41681d0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((LayoutParams) this.f41683e0.get(i11).getLayoutParams()).f41712f;
    }

    public int getCurrentItem() {
        return this.f41688h;
    }

    public int getOffscreenPageLimit() {
        return this.f41705y;
    }

    public int getPageMargin() {
        return this.f41694n;
    }

    public final void i(boolean z10) {
        boolean z11 = this.f41687g0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            this.f41692l.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f41692l.getCurrX();
            int currY = this.f41692l.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f41704x = false;
        for (int i10 = 0; i10 < this.f41680d.size(); i10++) {
            d dVar = this.f41680d.get(i10);
            if (dVar.f41719c) {
                dVar.f41719c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                ViewCompat.postOnAnimation(this, this.f41685f0);
            } else {
                this.f41685f0.run();
            }
        }
    }

    public void j() {
        int count = this.f41686g.getCount();
        this.f41678c = count;
        boolean z10 = this.f41680d.size() < (this.f41705y * 2) + 1 && this.f41680d.size() < count;
        int iMax = this.f41688h;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.f41680d.size()) {
            d dVar = this.f41680d.get(i10);
            int itemPosition = this.f41686g.getItemPosition(dVar.f41717a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f41680d.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f41686g.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f41686g.destroyItem((ViewGroup) this, dVar.f41718b, dVar.f41717a);
                    int i11 = this.f41688h;
                    if (i11 == dVar.f41718b) {
                        iMax = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = dVar.f41718b;
                    if (i12 != itemPosition) {
                        if (i12 == this.f41688h) {
                            iMax = itemPosition;
                        }
                        dVar.f41718b = itemPosition;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f41686g.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f41680d, f41672i0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
                if (!layoutParams.f41707a) {
                    layoutParams.f41709c = 0.0f;
                }
            }
            K(iMax, false, true);
            requestLayout();
        }
    }

    public float l(float f10) {
        return (float) Math.sin((float) (((double) (f10 - 0.5f)) * 0.4712389167638204d));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f41685f0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.f41694n <= 0 || this.f41695o == null || this.f41680d.size() <= 0 || this.f41686g == null) {
            return;
        }
        int scrollY = getScrollY();
        int height = getHeight();
        float f11 = height;
        float f12 = this.f41694n / f11;
        int i11 = 0;
        d dVar = this.f41680d.get(0);
        float f13 = dVar.f41721e;
        int size = this.f41680d.size();
        int i12 = dVar.f41718b;
        int i13 = this.f41680d.get(size - 1).f41718b;
        while (i12 < i13) {
            while (true) {
                i10 = dVar.f41718b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                dVar = this.f41680d.get(i11);
            }
            if (i12 == i10) {
                float f14 = dVar.f41721e;
                float f15 = dVar.f41720d;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.f41686g.getPageWidth(i12);
                f10 = (f13 + pageWidth) * f11;
                f13 += pageWidth + f12;
            }
            int i14 = this.f41694n;
            if (i14 + f10 > scrollY) {
                this.f41695o.setBounds(this.f41696p, (int) f10, this.f41697q, (int) (i14 + f10 + 0.5f));
                this.f41695o.draw(canvas);
            }
            if (f10 > scrollY + height) {
                return;
            }
            i12++;
            f12 = f12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        d dVarR;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollY = getScrollY();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f41707a) {
                    int i18 = layoutParams.f41708b;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingTop + scrollY;
                            childAt.layout(paddingLeft, i21, childAt.getMeasuredWidth() + paddingLeft, i21 + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingTop + scrollY;
                        childAt.layout(paddingLeft, i23, childAt.getMeasuredWidth() + paddingLeft, i23 + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingTop + scrollY;
                        childAt.layout(paddingLeft, i25, childAt.getMeasuredWidth() + paddingLeft, i25 + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingTop + scrollY;
                    childAt.layout(paddingLeft, i27, childAt.getMeasuredWidth() + paddingLeft, i27 + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i15 - paddingTop) - paddingBottom;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f41707a && (dVarR = r(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (dVarR.f41721e * f10)) + paddingTop;
                    if (layoutParams2.f41710d) {
                        layoutParams2.f41710d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i14 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f10 * layoutParams2.f41709c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i30, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i30);
                }
            }
        }
        this.f41696p = paddingLeft;
        this.f41697q = i14 - paddingRight;
        this.U = i16;
        if (this.R) {
            z11 = false;
            I(this.f41688h, false, 0, false);
        } else {
            z11 = false;
        }
        this.R = z11;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f41686g;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f41714c, savedState.f41715d);
            K(savedState.f41713b, false, true);
        } else {
            this.f41689i = savedState.f41713b;
            this.f41690j = savedState.f41714c;
            this.f41691k = savedState.f41715d;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean zOnRelease;
        boolean zOnRelease2;
        if (this.O) {
            return true;
        }
        boolean zC = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f41686g) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f41692l.abortAnimation();
            this.f41704x = false;
            D();
            float x10 = motionEvent.getX();
            this.G = x10;
            this.E = x10;
            float y10 = motionEvent.getY();
            this.H = y10;
            this.F = y10;
            this.I = MotionEventCompat.getPointerId(motionEvent, 0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f41706z) {
                    int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.I);
                    float y11 = MotionEventCompat.getY(motionEvent, iFindPointerIndex);
                    float fAbs = Math.abs(y11 - this.F);
                    float x11 = MotionEventCompat.getX(motionEvent, iFindPointerIndex);
                    float fAbs2 = Math.abs(x11 - this.E);
                    if (fAbs > this.D && fAbs > fAbs2) {
                        this.f41706z = true;
                        H(true);
                        float f10 = this.H;
                        this.F = y11 - f10 > 0.0f ? f10 + this.D : f10 - this.D;
                        this.E = x11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f41706z) {
                    zC = false | C(MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.I)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.F = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.I = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                } else if (action == 6) {
                    y(motionEvent);
                    this.F = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.I));
                }
            } else if (this.f41706z) {
                I(this.f41688h, true, 0, false);
                this.I = -1;
                n();
                zOnRelease = this.P.onRelease();
                zOnRelease2 = this.Q.onRelease();
                zC = zOnRelease | zOnRelease2;
            }
        } else if (this.f41706z) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.I);
            this.f41704x = true;
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            d dVarS = s();
            L(k(dVarS.f41718b, ((scrollY / clientHeight) - dVarS.f41721e) / dVarS.f41720d, yVelocity, (int) (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.I)) - this.H)), true, true, yVelocity);
            this.I = -1;
            n();
            zOnRelease = this.P.onRelease();
            zOnRelease2 = this.Q.onRelease();
            zC = zOnRelease | zOnRelease2;
        }
        if (zC) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public final Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f41702v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f41686g;
        if (pagerAdapter2 != null) {
            pagerAdapter2.unregisterDataSetObserver(this.f41693m);
            this.f41686g.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.f41680d.size(); i10++) {
                d dVar = this.f41680d.get(i10);
                this.f41686g.destroyItem((ViewGroup) this, dVar.f41718b, dVar.f41717a);
            }
            this.f41686g.finishUpdate((ViewGroup) this);
            this.f41680d.clear();
            G();
            this.f41688h = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f41686g;
        this.f41686g = pagerAdapter;
        this.f41678c = 0;
        if (pagerAdapter != null) {
            if (this.f41693m == null) {
                this.f41693m = new g();
            }
            this.f41686g.registerDataSetObserver(this.f41693m);
            this.f41704x = false;
            boolean z10 = this.R;
            this.R = true;
            this.f41678c = this.f41686g.getCount();
            if (this.f41689i >= 0) {
                this.f41686g.restoreState(this.f41690j, this.f41691k);
                K(this.f41689i, false, true);
                this.f41689i = -1;
                this.f41690j = null;
                this.f41691k = null;
            } else if (z10) {
                requestLayout();
            } else {
                D();
            }
        }
        f fVar = this.f41675a0;
        if (fVar == null || pagerAdapter3 == pagerAdapter) {
            return;
        }
        fVar.a(pagerAdapter3, pagerAdapter);
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z10) {
        if (this.f41679c0 == null) {
            try {
                this.f41679c0 = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e10) {
                Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e10);
            }
        }
        try {
            this.f41679c0.invoke(this, Boolean.valueOf(z10));
        } catch (Exception e11) {
            Log.e("ViewPager", "Error changing children drawing order", e11);
        }
    }

    public void setOnAdapterChangeListener(f fVar) {
        this.f41675a0 = fVar;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.V = onPageChangeListener;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f41694n;
        this.f41694n = i10;
        int height = getHeight();
        F(height, height, i10, i11);
        requestLayout();
    }

    public boolean v(int i10) {
        if (this.f41686g == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i10 < 0) {
            return scrollY > ((int) (((float) clientHeight) * this.f41698r));
        }
        return i10 > 0 && scrollY < ((int) (((float) clientHeight) * this.f41699s));
    }

    public final boolean w(float f10, float f11) {
        return (f10 < ((float) this.C) && f11 > 0.0f) || (f10 > ((float) (getHeight() - this.C)) && f11 < 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    public void x(int i10, float f10, int i11) {
        int iMax;
        int height;
        int top2;
        if (this.U > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f41707a) {
                    int i13 = layoutParams.f41708b & 112;
                    if (i13 != 16) {
                        if (i13 == 48) {
                            height = childAt.getHeight() + paddingTop;
                        } else if (i13 != 80) {
                            height = paddingTop;
                        } else {
                            iMax = (height2 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        top2 = (paddingTop + scrollY) - childAt.getTop();
                        if (top2 != 0) {
                            childAt.offsetTopAndBottom(top2);
                        }
                        paddingTop = height;
                    } else {
                        iMax = Math.max((height2 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i14 = iMax;
                    height = paddingTop;
                    paddingTop = i14;
                    top2 = (paddingTop + scrollY) - childAt.getTop();
                    if (top2 != 0) {
                        childAt.offsetTopAndBottom(top2);
                    }
                    paddingTop = height;
                }
            }
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.V;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i10, f10, i11);
        }
        ViewPager.OnPageChangeListener onPageChangeListener2 = this.W;
        if (onPageChangeListener2 != null) {
            onPageChangeListener2.onPageScrolled(i10, f10, i11);
        }
        if (this.f41677b0 != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((LayoutParams) childAt2.getLayoutParams()).f41707a) {
                    this.f41677b0.transformPage(childAt2, (childAt2.getTop() - scrollY2) / getClientHeight());
                }
            }
        }
        this.T = true;
    }

    public boolean z() {
        PagerAdapter pagerAdapter = this.f41686g;
        if (pagerAdapter == null || this.f41688h >= pagerAdapter.getCount() - 1) {
            return false;
        }
        J(this.f41688h + 1, true);
        return true;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41676b = 4096;
        this.f41680d = new ArrayList<>();
        this.f41682e = new d();
        this.f41684f = new Rect();
        this.f41689i = -1;
        this.f41690j = null;
        this.f41691k = null;
        this.f41698r = -3.4028235E38f;
        this.f41699s = Float.MAX_VALUE;
        this.f41705y = 1;
        this.I = -1;
        this.R = true;
        this.S = false;
        this.f41685f0 = new c();
        this.f41687g0 = 0;
        u();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final void H(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void I(int i10, boolean z10, int i11, boolean z11) {
        int clientHeight;
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        ViewPager.OnPageChangeListener onPageChangeListener3;
        ViewPager.OnPageChangeListener onPageChangeListener4;
        d dVarT = t(i10);
        if (dVarT != null) {
            clientHeight = (int) (getClientHeight() * Math.max(this.f41698r, Math.min(dVarT.f41721e, this.f41699s)));
        } else {
            clientHeight = 0;
        }
        if (z10) {
            M(0, clientHeight, i11);
            if (z11 && (onPageChangeListener4 = this.V) != null) {
                onPageChangeListener4.onPageSelected(i10);
            }
            if (z11 && (onPageChangeListener3 = this.W) != null) {
                onPageChangeListener3.onPageSelected(i10);
                return;
            }
            return;
        }
        if (z11 && (onPageChangeListener2 = this.V) != null) {
            onPageChangeListener2.onPageSelected(i10);
        }
        if (z11 && (onPageChangeListener = this.W) != null) {
            onPageChangeListener.onPageSelected(i10);
        }
        i(false);
        scrollTo(0, clientHeight);
        A(clientHeight);
    }

    public void M(int i10, int i11, int i12) {
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i13 = i10 - scrollX;
        int i14 = i11 - scrollY;
        if (i13 == 0 && i14 == 0) {
            i(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i15 = clientHeight / 2;
        float f10 = clientHeight;
        float f11 = i15;
        float fL = f11 + (l(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fL / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i13) / ((f10 * this.f41686g.getPageWidth(this.f41688h)) + this.f41694n)) + 1.0f) * 100.0f);
        }
        this.f41692l.startScroll(scrollX, scrollY, i13, i14, Math.min(iAbs, 600));
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        d dVarR;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (dVarR = r(childAt)) != null && dVarR.f41718b == this.f41688h) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z10 = layoutParams2.f41707a | false;
        layoutParams2.f41707a = z10;
        if (this.f41702v) {
            if (!z10) {
                layoutParams2.f41710d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !o(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d dVarR;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (dVarR = r(childAt)) != null && dVarR.f41718b == this.f41688h && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        boolean zDraw = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.f41686g) == null || pagerAdapter.getCount() <= 1)) {
            this.P.finish();
            this.Q.finish();
        } else {
            if (!this.P.isFinished()) {
                int iSave = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), this.f41698r * height);
                this.P.setSize(width, height);
                zDraw = false | this.P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.Q.isFinished()) {
                int iSave2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((-width2) - getPaddingLeft(), (-(this.f41699s + 1.0f)) * height2);
                this.Q.setSize(width2, height2);
                zDraw |= this.Q.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f41695o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean f(int i10) {
        boolean z10;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zB = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (parent instanceof ViewGroup) {
                    if (parent == this) {
                        z10 = true;
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i10 == 33) {
                int i11 = p(this.f41684f, viewFindNextFocus).top;
                int i12 = p(this.f41684f, viewFindFocus).top;
                if (viewFindFocus != null && i11 >= i12) {
                    zRequestFocus = B();
                } else {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            } else if (i10 == 130) {
                int i13 = p(this.f41684f, viewFindNextFocus).bottom;
                int i14 = p(this.f41684f, viewFindFocus).bottom;
                if (viewFindFocus != null && i13 <= i14) {
                    zRequestFocus = z();
                } else {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
            zB = zRequestFocus;
        } else if (i10 != 33 && i10 != 1) {
            if (i10 == 130 || i10 == 2) {
                zB = z();
            }
        } else {
            zB = B();
        }
        if (zB) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zB;
    }

    public final int k(int i10, float f10, int i11, int i12) {
        float f11;
        if (Math.abs(i12) > this.M && Math.abs(i11) > this.K) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            if (i10 >= this.f41688h) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i10 = (int) (i10 + f10 + f11);
        }
        if (this.f41680d.size() > 0) {
            d dVar = this.f41680d.get(0);
            ArrayList<d> arrayList = this.f41680d;
            return Math.max(dVar.f41718b, Math.min(i10, arrayList.get(arrayList.size() - 1).f41718b));
        }
        return i10;
    }

    public final void m(boolean z10) {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            ViewCompat.setLayerType(getChildAt(i11), i10, null);
        }
    }

    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return f(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return f(1);
                        }
                    }
                } else {
                    return f(66);
                }
            } else {
                return f(17);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        d dVarR;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (dVarR = r(childAt)) != null && dVarR.f41718b == this.f41688h && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f41713b = this.f41688h;
        PagerAdapter pagerAdapter = this.f41686g;
        if (pagerAdapter != null) {
            savedState.f41714c = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i11 != i13) {
            int i14 = this.f41694n;
            F(i11, i13, i14, i14);
        }
    }

    public d q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return r(view);
            }
        }
    }

    public final d s() {
        float scrollY;
        float f10;
        int i10;
        int clientHeight = getClientHeight();
        float f11 = 0.0f;
        if (clientHeight > 0) {
            scrollY = getScrollY() / clientHeight;
        } else {
            scrollY = 0.0f;
        }
        if (clientHeight > 0) {
            f10 = this.f41694n / clientHeight;
        } else {
            f10 = 0.0f;
        }
        d dVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.f41680d.size()) {
            d dVar2 = this.f41680d.get(i11);
            if (!z10 && dVar2.f41718b != (i10 = i12 + 1)) {
                dVar2 = this.f41682e;
                dVar2.f41721e = f11 + f12 + f10;
                dVar2.f41718b = i10;
                dVar2.f41720d = this.f41686g.getPageWidth(i10);
                i11--;
            }
            f11 = dVar2.f41721e;
            float f13 = dVar2.f41720d + f11 + f10;
            if (!z10 && scrollY < f11) {
                return dVar;
            }
            if (scrollY >= f13 && i11 != this.f41680d.size() - 1) {
                i12 = dVar2.f41718b;
                f12 = dVar2.f41720d;
                i11++;
                z10 = false;
                dVar = dVar2;
            } else {
                return dVar2;
            }
        }
        return dVar;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f41695o) {
            return false;
        }
        return true;
    }

    public final void y(MotionEvent motionEvent) {
        int i10;
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.I) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.F = MotionEventCompat.getY(motionEvent, i10);
            this.I = MotionEventCompat.getPointerId(motionEvent, i10);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }
}
