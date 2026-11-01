package com.bytedance.adsdk.ugeno.pno;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class lh extends ViewGroup {
    private final vt bly;
    private int bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f10940cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f10941cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private EdgeEffect f10942cj;
    private final Runnable coz;
    private int ex;
    private float ey;
    private float fak;
    public List<yu> fkw;
    private int fqk;
    private int fvf;
    private int hun;
    private boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private Scroller f10943jg;
    private int jqy;
    private VelocityTracker jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private boolean f10944kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f10945ko;
    private boolean ksc;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.pno.vt f10946lh;
    private int lso;
    private int lvd;
    private List<Object> mt;
    private ClassLoader mwh;
    private int myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private ArrayList<View> f10947ng;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private int f10948od;
    private float osn;
    private int ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private int f10949pd;
    private final ArrayList<vt> pno;
    private EdgeEffect pv;
    private int qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private le f10950rn;
    private int rrs;
    private Parcelable ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private boolean f10951tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private int f10952th;
    private final Rect tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private boolean f10953ub;
    private boolean ucs;
    private float uoy;
    private boolean uq;
    private int ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f10954vh;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private Drawable f10955vm;
    private float vpp;
    private boolean wp;
    private fkw xdk;
    private yu yhj;
    private yu yib;
    public int yu;
    private int zih;
    private float zin;
    private int zvq;
    public static final int[] vt = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static final Comparator<vt> f10938le = new Comparator<vt>() { // from class: com.bytedance.adsdk.ugeno.pno.lh.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(vt vtVar, vt vtVar2) {
            return vtVar.vt - vtVar2.vt;
        }
    };

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static final Interpolator f10939ra = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.pno.lh.2
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final pno fwd = new pno();

    public interface fkw {
        void ouw(View view, float f10);
    }

    public class le extends DataSetObserver {
        public le() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            lh.this.ouw();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            lh.this.ouw();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ouw {
    }

    public static class pno implements Comparator<View> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            C0072lh c0072lh = (C0072lh) view.getLayoutParams();
            C0072lh c0072lh2 = (C0072lh) view2.getLayoutParams();
            boolean z10 = c0072lh.ouw;
            if (z10 != c0072lh2.ouw) {
                return z10 ? 1 : -1;
            }
            return c0072lh.fkw - c0072lh2.fkw;
        }
    }

    public static class ra extends com.bytedance.adsdk.ugeno.pno.ouw {
        public static final Parcelable.Creator<ra> CREATOR = new Parcelable.ClassLoaderCreator<ra>() { // from class: com.bytedance.adsdk.ugeno.pno.lh.ra.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ ra createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ra(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ra(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
                return new ra[i10];
            }
        };
        public ClassLoader fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f10958lh;
        public Parcelable yu;

        public ra(Parcelable parcelable) {
            super(parcelable);
        }

        public ra(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? ra.class.getClassLoader() : classLoader;
            this.f10958lh = parcel.readInt();
            this.yu = parcel.readParcelable(classLoader);
            this.fkw = classLoader;
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f10958lh + h.f44172e;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.ouw, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10958lh);
            parcel.writeParcelable(this.yu, i10);
        }
    }

    public static class vt {
        public float fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public boolean f10959lh;
        public Object ouw;
        public int vt;
        public float yu;
    }

    public interface yu {
        void bly(int i10);

        void ouw(int i10, float f10, int i11);

        void tlj(int i10);
    }

    private void fkw() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private void lh() {
        if (this.myk != 0) {
            ArrayList<View> arrayList = this.f10947ng;
            if (arrayList == null) {
                this.f10947ng = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f10947ng.add(getChildAt(i10));
            }
            Collections.sort(this.f10947ng, fwd);
        }
    }

    private void ra() {
        this.f10940cd = false;
        this.uq = false;
        VelocityTracker velocityTracker = this.jvy;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.jvy = null;
        }
    }

    private void vt(boolean z10, fkw fkwVar) {
        boolean z11 = fkwVar != null;
        boolean z12 = z11 != (this.xdk != null);
        this.xdk = fkwVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.myk = z10 ? 2 : 1;
            this.zvq = 2;
        } else {
            this.myk = 0;
        }
        if (z12) {
            vt();
        }
    }

    private void yu(int i10) {
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.bly(i10);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                yu yuVar2 = this.fkw.get(i11);
                if (yuVar2 != null) {
                    yuVar2.bly(i10);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.bly(i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        vt vtVarOuw;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f10945ko = true;
        if (this.f10943jg.isFinished() || !this.f10943jg.computeScrollOffset()) {
            ouw(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f10943jg.getCurrX();
        int currY = this.f10943jg.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!lh(currX)) {
                this.f10943jg.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            yu();
            return false;
        }
        if (action != 0) {
            if (this.f10940cd) {
                return true;
            }
            if (this.uq) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.osn = x10;
            this.fak = x10;
            float y10 = motionEvent.getY();
            this.ey = y10;
            this.uoy = y10;
            this.rrs = motionEvent.getPointerId(0);
            this.uq = false;
            this.f10945ko = true;
            this.f10943jg.computeScrollOffset();
            if (this.lvd != 2 || Math.abs(this.f10943jg.getFinalX() - this.f10943jg.getCurrX()) <= this.lso) {
                ouw(false);
                this.f10940cd = false;
            } else {
                this.f10943jg.abortAnimation();
                this.jae = false;
                vt();
                this.f10940cd = true;
                fkw();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.rrs;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.fak;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.ey);
                if (f10 != 0.0f) {
                    float f11 = this.fak;
                    if (!((f11 < ((float) this.fvf) && f10 > 0.0f) || (f11 > ((float) (getWidth() - this.fvf)) && f10 < 0.0f)) && ouw(this, false, (int) f10, (int) x11, (int) y11)) {
                        this.fak = x11;
                        this.uoy = y11;
                        this.uq = true;
                        return false;
                    }
                }
                int i11 = this.bs;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f10940cd = true;
                    fkw();
                    setScrollState(1);
                    this.fak = f10 > 0.0f ? this.osn + this.bs : this.osn - this.bs;
                    this.uoy = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.uq = true;
                }
                if (this.f10940cd && vt(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            ouw(motionEvent);
        }
        if (this.jvy == null) {
            this.jvy = VelocityTracker.obtain();
        }
        this.jvy.addMovement(motionEvent);
        return this.f10940cd;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        C0072lh c0072lh;
        C0072lh c0072lh2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.fvf = Math.min(measuredWidth / 10, this.f10949pd);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0072lh2 = (C0072lh) childAt.getLayoutParams()) != null && c0072lh2.ouw) {
                int i15 = c0072lh2.vt;
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
                int i19 = ((ViewGroup.LayoutParams) c0072lh2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0072lh2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.jqy = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.ex = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f10951tc = true;
        vt();
        this.f10951tc = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0072lh = (C0072lh) childAt2.getLayoutParams()) == null || !c0072lh.ouw)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0072lh.f10957lh), 1073741824), this.ex);
            }
        }
    }

    public final void ouw(int i10, boolean z10) {
        this.jae = false;
        ouw(i10, z10, false);
    }

    public void setCurrentItem(int i10) {
        this.jae = false;
        ouw(i10, !this.wp, false);
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f10955vm = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.pno.lh$lh, reason: collision with other inner class name */
    public static class C0072lh extends ViewGroup.LayoutParams {
        public int fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public int f10956le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f10957lh;
        public boolean ouw;
        public int vt;
        public boolean yu;

        public C0072lh() {
            super(-1, -1);
            this.f10957lh = 0.0f;
        }

        public C0072lh(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10957lh = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lh.vt);
            this.vt = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private boolean bly() {
        com.bytedance.adsdk.ugeno.pno.vt vtVar = this.f10946lh;
        if (vtVar == null || this.yu >= vtVar.ouw() - 1) {
            return false;
        }
        ouw(this.yu + 1, true);
        return true;
    }

    private boolean pno() {
        int i10 = this.yu;
        if (i10 <= 0) {
            return false;
        }
        ouw(i10 - 1, true);
        return true;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.ksc != z10) {
            this.ksc = z10;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f10946lh == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.zin));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.vpp));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0072lh) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0072lh();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0072lh(getContext(), attributeSet);
    }

    public com.bytedance.adsdk.ugeno.pno.vt getAdapter() {
        return this.f10946lh;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.myk == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0072lh) this.f10947ng.get(i11).getLayoutParams()).f10956le;
    }

    public int getCurrentItem() {
        return this.yu;
    }

    public int getOffscreenPageLimit() {
        return this.f10948od;
    }

    public int getPageMargin() {
        return this.zih;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.coz);
        Scroller scroller = this.f10943jg;
        if (scroller != null && !scroller.isFinished()) {
            this.f10943jg.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.zih <= 0 || this.f10955vm == null || this.pno.size() <= 0 || this.f10946lh == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.zih / f11;
        int i11 = 0;
        vt vtVar = this.pno.get(0);
        float f13 = vtVar.fkw;
        int size = this.pno.size();
        int i12 = vtVar.vt;
        int i13 = this.pno.get(size - 1).vt;
        while (i12 < i13) {
            while (true) {
                i10 = vtVar.vt;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                vtVar = this.pno.get(i11);
            }
            if (i12 == i10) {
                float f14 = vtVar.fkw;
                float f15 = vtVar.yu;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float fVt = this.f10946lh.vt();
                f10 = (f13 + fVt) * f11;
                f13 += fVt + f12;
            }
            if (this.zih + f10 > scrollX) {
                this.f10955vm.setBounds(Math.round(f10), this.f10952th, Math.round(this.zih + f10), this.qbp);
                this.f10955vm.draw(canvas);
            }
            if (f10 > scrollX + width) {
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
        vt vtVarOuw;
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
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C0072lh c0072lh = (C0072lh) childAt.getLayoutParams();
                if (c0072lh.ouw) {
                    int i18 = c0072lh.vt;
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
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, paddingTop + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
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
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                C0072lh c0072lh2 = (C0072lh) childAt2.getLayoutParams();
                if (!c0072lh2.ouw && (vtVarOuw = ouw(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (vtVarOuw.fkw * f10)) + paddingLeft;
                    if (c0072lh2.yu) {
                        c0072lh2.yu = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * c0072lh2.f10957lh), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f10952th = paddingTop;
        this.qbp = i15 - paddingBottom;
        this.f10954vh = i16;
        if (this.wp) {
            z11 = false;
            ouw(this.yu, false, 0, false);
        } else {
            z11 = false;
        }
        this.wp = z11;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ra)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ra raVar = (ra) parcelable;
        super.onRestoreInstanceState(raVar.vt);
        if (this.f10946lh != null) {
            ouw(raVar.f10958lh, false, true);
            return;
        }
        this.f10941cf = raVar.f10958lh;
        this.ryl = raVar.yu;
        this.mwh = raVar.fkw;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar;
        int iFindPointerIndex;
        if (this.f10953ub) {
            return true;
        }
        boolean zYu = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (vtVar = this.f10946lh) == null || vtVar.ouw() == 0) {
            return false;
        }
        if (this.jvy == null) {
            this.jvy = VelocityTracker.obtain();
        }
        this.jvy.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f10943jg.abortAnimation();
            this.jae = false;
            vt();
            float x10 = motionEvent.getX();
            this.osn = x10;
            this.fak = x10;
            float y10 = motionEvent.getY();
            this.ey = y10;
            this.uoy = y10;
            this.rrs = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.fak = motionEvent.getX(actionIndex);
                            this.rrs = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        ouw(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.rrs);
                        if (iFindPointerIndex2 != -1) {
                            this.fak = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.f10940cd) {
                    ouw(this.yu, true, 0, false);
                    zYu = yu();
                }
            } else if (!this.f10940cd) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.rrs);
                if (iFindPointerIndex3 == -1) {
                    zYu = yu();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.fak);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.uoy);
                    if (fAbs > this.bs && fAbs > fAbs2) {
                        this.f10940cd = true;
                        fkw();
                        float f10 = this.osn;
                        this.fak = x11 - f10 > 0.0f ? f10 + this.bs : f10 - this.bs;
                        this.uoy = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f10940cd) {
                        zYu = false | vt(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.f10940cd && (iFindPointerIndex = motionEvent.findPointerIndex(this.rrs)) != -1) {
                zYu = false | vt(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.f10940cd) {
            VelocityTracker velocityTracker = this.jvy;
            velocityTracker.computeCurrentVelocity(1000, this.hun);
            int xVelocity = (int) velocityTracker.getXVelocity(this.rrs);
            this.jae = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            vt vtVarLe = le();
            float f11 = clientWidth;
            float f12 = this.zih / f11;
            int iMax = vtVarLe.vt;
            float f13 = ((scrollX / f11) - vtVarLe.fkw) / (vtVarLe.yu + f12);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.rrs);
            if (iFindPointerIndex4 != -1) {
                if (Math.abs((int) (motionEvent.getX(iFindPointerIndex4) - this.osn)) <= this.ux || Math.abs(xVelocity) <= this.fqk) {
                    iMax += (int) (f13 + (iMax >= this.yu ? 0.4f : 0.6f));
                } else if (xVelocity <= 0) {
                    iMax++;
                }
                if (this.pno.size() > 0) {
                    vt vtVar2 = this.pno.get(0);
                    ArrayList<vt> arrayList = this.pno;
                    iMax = Math.max(vtVar2.vt, Math.min(iMax, arrayList.get(arrayList.size() - 1).vt));
                }
                ouw(iMax, true, true, xVelocity);
                zYu = yu();
            }
        }
        if (zYu) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f10951tc) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.pno.vt vtVar) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar2 = this.f10946lh;
        if (vtVar2 != null) {
            vtVar2.ouw(null);
            for (int i10 = 0; i10 < this.pno.size(); i10++) {
                this.f10946lh.ouw((ViewGroup) this, this.pno.get(i10).ouw);
            }
            this.pno.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((C0072lh) getChildAt(i11).getLayoutParams()).ouw) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.yu = 0;
            scrollTo(0, 0);
        }
        this.f10946lh = vtVar;
        this.ouw = 0;
        if (vtVar != null) {
            if (this.f10950rn == null) {
                this.f10950rn = new le();
            }
            this.f10946lh.ouw(this.f10950rn);
            this.jae = false;
            boolean z10 = this.wp;
            this.wp = true;
            this.ouw = this.f10946lh.ouw();
            int i12 = this.f10941cf;
            if (i12 >= 0) {
                ouw(i12, false, true);
                this.f10941cf = -1;
                this.ryl = null;
                this.mwh = null;
            } else if (z10) {
                requestLayout();
            } else {
                vt();
            }
        }
        List<Object> list = this.mt;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mt.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.mt.get(i13);
        }
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f10948od) {
            this.f10948od = i10;
            vt();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(yu yuVar) {
        this.yib = yuVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.zih;
        this.zih = i10;
        int width = getWidth();
        ouw(width, width, i10, i11);
        requestLayout();
    }

    public void setScrollState(int i10) {
        if (this.lvd == i10) {
            return;
        }
        this.lvd = i10;
        if (this.xdk != null) {
            boolean z10 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z10 ? this.zvq : 0, null);
            }
        }
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.tlj(i10);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                yu yuVar2 = this.fkw.get(i12);
                if (yuVar2 != null) {
                    yuVar2.tlj(i10);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.tlj(i10);
        }
    }

    public void setScroller(Scroller scroller) {
        this.f10943jg = scroller;
    }

    public lh(Context context) {
        super(context);
        this.pno = new ArrayList<>();
        this.bly = new vt();
        this.tlj = new Rect();
        this.f10941cf = -1;
        this.ryl = null;
        this.mwh = null;
        this.zin = -3.4028235E38f;
        this.vpp = Float.MAX_VALUE;
        this.f10948od = 1;
        this.rrs = -1;
        this.wp = true;
        this.f10944kn = false;
        this.coz = new Runnable() { // from class: com.bytedance.adsdk.ugeno.pno.lh.3
            @Override // java.lang.Runnable
            public final void run() {
                lh.this.setScrollState(0);
                lh.this.vt();
            }
        };
        this.lvd = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f10943jg = new Scroller(context2, f10939ra);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.bs = viewConfiguration.getScaledPagingTouchSlop();
        this.fqk = (int) (400.0f * f10);
        this.hun = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10942cj = new EdgeEffect(context2);
        this.pv = new EdgeEffect(context2);
        this.ux = (int) (25.0f * f10);
        this.lso = (int) (2.0f * f10);
        this.f10949pd = (int) (f10 * 16.0f);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    private boolean fkw(int i10) {
        boolean z10;
        View viewFindFocus = findFocus();
        boolean zPno = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z10 = false;
                    break;
                }
                if (parent == this) {
                    z10 = true;
                    break;
                }
                parent = parent.getParent();
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
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zPno = pno();
            } else if (i10 == 66 || i10 == 2) {
                zPno = bly();
            }
        } else if (i10 == 17) {
            int i11 = ouw(this.tlj, viewFindNextFocus).left;
            int i12 = ouw(this.tlj, viewFindFocus).left;
            if (viewFindFocus != null && i11 >= i12) {
                zPno = pno();
            } else {
                zPno = viewFindNextFocus.requestFocus();
            }
        } else if (i10 == 66) {
            int i13 = ouw(this.tlj, viewFindNextFocus).left;
            int i14 = ouw(this.tlj, viewFindFocus).left;
            if (viewFindFocus == null || i13 > i14) {
                zPno = viewFindNextFocus.requestFocus();
            } else {
                zPno = bly();
            }
        }
        if (zPno) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zPno;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private vt le() {
        float scrollX;
        float f10;
        int i10;
        int clientWidth = getClientWidth();
        float f11 = 0.0f;
        if (clientWidth > 0) {
            scrollX = getScrollX() / clientWidth;
        } else {
            scrollX = 0.0f;
        }
        if (clientWidth > 0) {
            f10 = this.zih / clientWidth;
        } else {
            f10 = 0.0f;
        }
        vt vtVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.pno.size()) {
            vt vtVar2 = this.pno.get(i11);
            if (!z10 && vtVar2.vt != (i10 = i12 + 1)) {
                vtVar2 = this.bly;
                vtVar2.fkw = f11 + f12 + f10;
                vtVar2.vt = i10;
                vtVar2.yu = this.f10946lh.vt();
                i11--;
            }
            f11 = vtVar2.fkw;
            float f13 = vtVar2.yu + f11 + f10;
            if (!z10 && scrollX < f11) {
                return vtVar;
            }
            if (scrollX >= f13 && i11 != this.pno.size() - 1) {
                i12 = vtVar2.vt;
                f12 = vtVar2.yu;
                i11++;
                z10 = false;
                vtVar = vtVar2;
            } else {
                return vtVar2;
            }
        }
        return vtVar;
    }

    private void ouw(int i10, boolean z10, boolean z11) {
        ouw(i10, z10, z11, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        vt vtVarOuw;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu) {
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
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0072lh c0072lh = (C0072lh) layoutParams;
        boolean z11 = c0072lh.ouw;
        if (view.getClass().getAnnotation(ouw.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        c0072lh.ouw = z12;
        if (this.f10951tc) {
            if (!z12) {
                c0072lh.yu = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zFkw;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                zFkw = fkw(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                zFkw = fkw(1);
                            } else {
                                zFkw = false;
                            }
                        } else {
                            zFkw = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zFkw = bly();
                    } else {
                        zFkw = fkw(66);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    zFkw = pno();
                } else {
                    zFkw = fkw(17);
                }
            } else {
                zFkw = false;
            }
            if (!zFkw) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        vt vtVarOuw;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (vtVar = this.f10946lh) == null || vtVar.ouw() <= 1)) {
            this.f10942cj.finish();
            this.pv.finish();
        } else {
            if (!this.f10942cj.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.zin * width);
                this.f10942cj.setSize(height, width);
                zDraw = false | this.f10942cj.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.pv.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.vpp + 1.0f)) * width2);
                this.pv.setSize(height2, width2);
                zDraw |= this.pv.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10955vm;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.wp = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        vt vtVarOuw;
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
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ra raVar = new ra(super.onSaveInstanceState());
        raVar.f10958lh = this.yu;
        if (this.f10946lh != null) {
            raVar.yu = com.bytedance.adsdk.ugeno.pno.vt.yu();
        }
        return raVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.zih;
            ouw(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f10955vm) {
            return false;
        }
        return true;
    }

    private void ouw(int i10, boolean z10, boolean z11, int i11) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar = this.f10946lh;
        if (vtVar != null && vtVar.ouw() > 0) {
            if (!z11 && this.yu == i10 && this.pno.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f10946lh.ouw()) {
                i10 = this.f10946lh.ouw() - 1;
            }
            int i12 = this.f10948od;
            int i13 = this.yu;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.pno.size(); i14++) {
                    this.pno.get(i14).f10959lh = true;
                }
            }
            boolean z12 = this.yu != i10;
            if (this.wp) {
                this.yu = i10;
                if (z12) {
                    yu(i10);
                }
                requestLayout();
                return;
            }
            ouw(i10);
            ouw(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private vt vt(int i10, int i11) {
        vt vtVar = new vt();
        vtVar.vt = i10;
        vtVar.ouw = this.f10946lh.ouw(this, i10);
        vtVar.yu = this.f10946lh.vt();
        if (i11 >= 0 && i11 < this.pno.size()) {
            this.pno.add(i11, vtVar);
        } else {
            this.pno.add(vtVar);
        }
        return vtVar;
    }

    private boolean lh(int i10) {
        if (this.pno.size() == 0) {
            if (this.wp) {
                return false;
            }
            this.ucs = false;
            ouw(0, 0.0f, 0);
            if (this.ucs) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        vt vtVarLe = le();
        int clientWidth = getClientWidth();
        int i11 = this.zih;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = vtVarLe.vt;
        float f11 = ((i10 / f10) - vtVarLe.fkw) / (vtVarLe.yu + (i11 / f10));
        this.ucs = false;
        ouw(i13, f11, (int) (i12 * f11));
        if (this.ucs) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean yu() {
        this.rrs = -1;
        ra();
        this.f10942cj.onRelease();
        this.pv.onRelease();
        return this.f10942cj.isFinished() || this.pv.isFinished();
    }

    public final void vt() {
        ouw(this.yu);
    }

    private vt vt(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return ouw(view);
            }
        }
    }

    private vt vt(int i10) {
        for (int i11 = 0; i11 < this.pno.size(); i11++) {
            vt vtVar = this.pno.get(i11);
            if (vtVar.vt == i10) {
                return vtVar;
            }
        }
        return null;
    }

    private void ouw(int i10, boolean z10, int i11, boolean z11) {
        vt vtVarVt = vt(i10);
        int clientWidth = vtVarVt != null ? (int) (getClientWidth() * Math.max(this.zin, Math.min(vtVarVt.fkw, this.vpp))) : 0;
        if (z10) {
            ouw(clientWidth, i11);
            if (z11) {
                yu(i10);
                return;
            }
            return;
        }
        if (z11) {
            yu(i10);
        }
        ouw(false);
        scrollTo(clientWidth, 0);
        lh(clientWidth);
    }

    private void vt(int i10, float f10, int i11) {
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.ouw(i10, f10, i11);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                yu yuVar2 = this.fkw.get(i12);
                if (yuVar2 != null) {
                    yuVar2.ouw(i10, f10, i11);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.ouw(i10, f10, i11);
        }
    }

    private boolean vt(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.fak - f10;
        this.fak = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.zin * clientWidth;
        float f13 = this.vpp * clientWidth;
        boolean z12 = false;
        vt vtVar = this.pno.get(0);
        ArrayList<vt> arrayList = this.pno;
        vt vtVar2 = arrayList.get(arrayList.size() - 1);
        if (vtVar.vt != 0) {
            f12 = vtVar.fkw * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (vtVar2.vt != this.f10946lh.ouw() - 1) {
            f13 = vtVar2.fkw * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f10942cj.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.pv.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.fak += scrollX - i10;
        scrollTo(i10, getScrollY());
        lh(i10);
        return z12;
    }

    public final void ouw(yu yuVar) {
        if (this.fkw == null) {
            this.fkw = new ArrayList();
        }
        this.fkw.add(yuVar);
    }

    public final void ouw(boolean z10, fkw fkwVar) {
        vt(z10, fkwVar);
    }

    private static float ouw(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void ouw(int i10, int i11) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f10943jg;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f10945ko ? this.f10943jg.getCurrX() : this.f10943jg.getStartX();
            this.f10943jg.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i10 - i12;
        int i14 = 0 - scrollY;
        if (i13 == 0 && i14 == 0) {
            ouw(false);
            vt();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i15;
        float fOuw = f11 + (ouw(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i11);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fOuw / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i13) / ((f10 * this.f10946lh.vt()) + this.zih)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f10945ko = false;
        this.f10943jg.startScroll(i12, scrollY, i13, i14, iMin);
        postInvalidateOnAnimation();
    }

    public final void ouw() {
        int iOuw = this.f10946lh.ouw();
        this.ouw = iOuw;
        boolean z10 = this.pno.size() < (this.f10948od * 2) + 1 && this.pno.size() < iOuw;
        int iMax = this.yu;
        int i10 = 0;
        while (i10 < this.pno.size()) {
            vt vtVar = this.pno.get(i10);
            int iLh = this.f10946lh.lh();
            if (iLh != -1) {
                if (iLh == -2) {
                    this.pno.remove(i10);
                    i10--;
                    this.f10946lh.ouw((ViewGroup) this, vtVar.ouw);
                    int i11 = this.yu;
                    if (i11 == vtVar.vt) {
                        iMax = Math.max(0, Math.min(i11, iOuw - 1));
                    }
                } else {
                    int i12 = vtVar.vt;
                    if (i12 != iLh) {
                        if (i12 == this.yu) {
                            iMax = iLh;
                        }
                        vtVar.vt = iLh;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        Collections.sort(this.pno, f10938le);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0072lh c0072lh = (C0072lh) getChildAt(i13).getLayoutParams();
                if (!c0072lh.ouw) {
                    c0072lh.f10957lh = 0.0f;
                }
            }
            ouw(iMax, false, true);
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f1 A[PHI: r7 r10 r15
  0x00f1: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:61:0x00e6, B:58:0x00d0, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:61:0x00e6, B:58:0x00d0, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:61:0x00e6, B:58:0x00d0, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    private void ouw(int i10) {
        vt vtVarVt;
        String hexString;
        vt vtVarVt2;
        vt vtVarOuw;
        vt vtVar;
        int i11 = this.yu;
        if (i11 != i10) {
            vtVarVt = vt(i11);
            this.yu = i10;
        } else {
            vtVarVt = null;
        }
        if (this.f10946lh == null) {
            lh();
            return;
        }
        if (this.jae) {
            lh();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i12 = this.f10948od;
        int iMax = Math.max(0, this.yu - i12);
        int iOuw = this.f10946lh.ouw();
        int iMin = Math.min(iOuw - 1, this.yu + i12);
        if (iOuw == this.ouw) {
            int i13 = 0;
            while (true) {
                if (i13 < this.pno.size()) {
                    vtVarVt2 = this.pno.get(i13);
                    int i14 = vtVarVt2.vt;
                    int i15 = this.yu;
                    if (i14 >= i15) {
                        if (i14 != i15) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i13++;
                }
                vtVarVt2 = null;
                break;
            }
            if (vtVarVt2 == null && iOuw > 0) {
                vtVarVt2 = vt(this.yu, i13);
            }
            if (vtVarVt2 != null) {
                int i16 = i13 - 1;
                vt vtVar2 = i16 >= 0 ? this.pno.get(i16) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - vtVarVt2.yu) + (getPaddingLeft() / clientWidth);
                float f10 = 0.0f;
                for (int i17 = this.yu - 1; i17 >= 0; i17--) {
                    if (f10 >= paddingLeft && i17 < iMax) {
                        if (vtVar2 == null) {
                            break;
                        }
                        if (i17 == vtVar2.vt && !vtVar2.f10959lh) {
                            this.pno.remove(i16);
                            this.f10946lh.ouw((ViewGroup) this, vtVar2.ouw);
                            i16--;
                            i13--;
                            if (i16 >= 0) {
                                vtVar = this.pno.get(i16);
                            } else {
                                vtVar = null;
                            }
                            vtVar2 = vtVar;
                        }
                    } else {
                        if (vtVar2 != null && i17 == vtVar2.vt) {
                            f10 += vtVar2.yu;
                            i16--;
                            if (i16 >= 0) {
                                vtVar = this.pno.get(i16);
                            } else {
                                vtVar = null;
                            }
                        } else {
                            f10 += vt(i17, i16 + 1).yu;
                            i13++;
                            if (i16 >= 0) {
                                vtVar = this.pno.get(i16);
                            } else {
                                vtVar = null;
                            }
                        }
                        vtVar2 = vtVar;
                    }
                }
                float f11 = vtVarVt2.yu;
                int i18 = i13 + 1;
                if (f11 < 2.0f) {
                    vt vtVar3 = i18 < this.pno.size() ? this.pno.get(i18) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i19 = this.yu;
                    while (true) {
                        i19++;
                        if (i19 >= iOuw) {
                            break;
                        }
                        if (f11 >= paddingRight && i19 > iMin) {
                            if (vtVar3 == null) {
                                break;
                            }
                            if (i19 == vtVar3.vt && !vtVar3.f10959lh) {
                                this.pno.remove(i18);
                                this.f10946lh.ouw((ViewGroup) this, vtVar3.ouw);
                                if (i18 < this.pno.size()) {
                                    vtVar3 = this.pno.get(i18);
                                }
                            }
                        } else if (vtVar3 != null && i19 == vtVar3.vt) {
                            f11 += vtVar3.yu;
                            i18++;
                            if (i18 < this.pno.size()) {
                                vtVar3 = this.pno.get(i18);
                            }
                        } else {
                            vt vtVarVt3 = vt(i19, i18);
                            i18++;
                            f11 += vtVarVt3.yu;
                            vtVar3 = i18 < this.pno.size() ? this.pno.get(i18) : null;
                        }
                    }
                }
                ouw(vtVarVt2, i13, vtVarVt);
            }
            int childCount = getChildCount();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt = getChildAt(i20);
                C0072lh c0072lh = (C0072lh) childAt.getLayoutParams();
                c0072lh.f10956le = i20;
                if (!c0072lh.ouw && c0072lh.f10957lh == 0.0f && (vtVarOuw = ouw(childAt)) != null) {
                    c0072lh.f10957lh = vtVarOuw.yu;
                    c0072lh.fkw = vtVarOuw.vt;
                }
            }
            lh();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                vt vtVarVt4 = viewFindFocus != null ? vt(viewFindFocus) : null;
                if (vtVarVt4 == null || vtVarVt4.vt != this.yu) {
                    for (int i21 = 0; i21 < getChildCount(); i21++) {
                        View childAt2 = getChildAt(i21);
                        vt vtVarOuw2 = ouw(childAt2);
                        if (vtVarOuw2 != null && vtVarOuw2.vt == this.yu && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.ouw + ", found: " + iOuw + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f10946lh.getClass());
    }

    private void ouw(vt vtVar, int i10, vt vtVar2) {
        int i11;
        int i12;
        vt vtVar3;
        vt vtVar4;
        int iOuw = this.f10946lh.ouw();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.zih / clientWidth : 0.0f;
        if (vtVar2 != null) {
            int i13 = vtVar2.vt;
            int i14 = vtVar.vt;
            if (i13 < i14) {
                float fVt = vtVar2.fkw + vtVar2.yu + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= vtVar.vt && i16 < this.pno.size()) {
                    vt vtVar5 = this.pno.get(i16);
                    while (true) {
                        vtVar4 = vtVar5;
                        if (i15 <= vtVar4.vt || i16 >= this.pno.size() - 1) {
                            break;
                        }
                        i16++;
                        vtVar5 = this.pno.get(i16);
                    }
                    while (i15 < vtVar4.vt) {
                        fVt += this.f10946lh.vt() + f10;
                        i15++;
                    }
                    vtVar4.fkw = fVt;
                    fVt += vtVar4.yu + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.pno.size() - 1;
                float fVt2 = vtVar2.fkw;
                while (true) {
                    i13--;
                    if (i13 < vtVar.vt || size < 0) {
                        break;
                    }
                    vt vtVar6 = this.pno.get(size);
                    while (true) {
                        vtVar3 = vtVar6;
                        if (i13 >= vtVar3.vt || size <= 0) {
                            break;
                        }
                        size--;
                        vtVar6 = this.pno.get(size);
                    }
                    while (i13 > vtVar3.vt) {
                        fVt2 -= this.f10946lh.vt() + f10;
                        i13--;
                    }
                    fVt2 -= vtVar3.yu + f10;
                    vtVar3.fkw = fVt2;
                }
            }
        }
        int size2 = this.pno.size();
        float fVt3 = vtVar.fkw;
        int i17 = vtVar.vt;
        int i18 = i17 - 1;
        this.zin = i17 == 0 ? fVt3 : -3.4028235E38f;
        int i19 = iOuw - 1;
        this.vpp = i17 == i19 ? (vtVar.yu + fVt3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            vt vtVar7 = this.pno.get(i20);
            while (true) {
                i12 = vtVar7.vt;
                if (i18 <= i12) {
                    break;
                }
                i18--;
                fVt3 -= this.f10946lh.vt() + f10;
            }
            fVt3 -= vtVar7.yu + f10;
            vtVar7.fkw = fVt3;
            if (i12 == 0) {
                this.zin = fVt3;
            }
            i20--;
            i18--;
        }
        float fVt4 = vtVar.fkw + vtVar.yu + f10;
        int i21 = vtVar.vt + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            vt vtVar8 = this.pno.get(i22);
            while (true) {
                i11 = vtVar8.vt;
                if (i21 >= i11) {
                    break;
                }
                i21++;
                fVt4 += this.f10946lh.vt() + f10;
            }
            if (i11 == i19) {
                this.vpp = (vtVar8.yu + fVt4) - 1.0f;
            }
            vtVar8.fkw = fVt4;
            fVt4 += vtVar8.yu + f10;
            i22++;
            i21++;
        }
        this.f10944kn = false;
    }

    private vt ouw(View view) {
        for (int i10 = 0; i10 < this.pno.size(); i10++) {
            vt vtVar = this.pno.get(i10);
            if (this.f10946lh.ouw(view, vtVar.ouw)) {
                return vtVar;
            }
        }
        return null;
    }

    private void ouw(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.pno.isEmpty()) {
            if (!this.f10943jg.isFinished()) {
                this.f10943jg.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        vt vtVarVt = vt(this.yu);
        int iMin = (int) ((vtVarVt != null ? Math.min(vtVarVt.fkw, this.vpp) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            ouw(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    private void ouw(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.f10954vh > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C0072lh c0072lh = (C0072lh) childAt.getLayoutParams();
                if (c0072lh.ouw) {
                    int i13 = c0072lh.vt & 7;
                    if (i13 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        vt(i10, f10, i11);
        if (this.xdk != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((C0072lh) childAt2.getLayoutParams()).ouw) {
                    this.xdk.ouw(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.ucs = true;
    }

    private void ouw(boolean z10) {
        boolean z11 = this.lvd == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f10943jg.isFinished()) {
                this.f10943jg.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f10943jg.getCurrX();
                int currY = this.f10943jg.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        lh(currX);
                    }
                }
            }
        }
        this.jae = false;
        for (int i10 = 0; i10 < this.pno.size(); i10++) {
            vt vtVar = this.pno.get(i10);
            if (vtVar.f10959lh) {
                vtVar.f10959lh = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.coz);
            } else {
                this.coz.run();
            }
        }
    }

    private void ouw(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.rrs) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.fak = motionEvent.getX(i10);
            this.rrs = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.jvy;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean ouw(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && ouw(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    private Rect ouw(Rect rect, View view) {
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
}
