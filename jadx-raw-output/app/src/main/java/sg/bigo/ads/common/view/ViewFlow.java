package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes10.dex */
public class ViewFlow extends sg.bigo.ads.common.view.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Interpolator f70152s = new Interpolator() { // from class: sg.bigo.ads.common.view.ViewFlow.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private float A;
    private float B;
    private int C;
    private VelocityTracker D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private final Runnable J;
    private int K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f70157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f70158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f70159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f70160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f70161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f70162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f70163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f70164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f70165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f70166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f70167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f70168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p f70169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f70170r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Scroller f70171t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f70172u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f70173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f70174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f70175x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f70176y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f70177z;

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f70181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f70182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewFlow f70183c;

        private a(ViewFlow viewFlow) {
            this.f70182b = 0;
            this.f70183c = viewFlow;
        }

        public /* synthetic */ a(ViewFlow viewFlow, byte b10) {
            this(viewFlow);
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i10) {
            this.f70183c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i11 = aVar.f70182b;
                    int i12 = i10;
                    if (i11 == i12) {
                        return;
                    }
                    aVar.f70182b = i12;
                    c cVar = aVar.f70181a;
                    if (cVar != null) {
                        cVar.a(i12);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i10, final int i11) {
            this.f70183c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f70181a;
                    if (cVar != null) {
                        cVar.a(i10, i11);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(@NonNull final View view, final int i10) {
            this.f70183c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f70181a;
                    if (cVar != null) {
                        cVar.a(view, i10);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(@NonNull final View view, final int i10, final float f10) {
            this.f70183c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f70181a;
                    if (cVar != null) {
                        cVar.a(view, i10, f10);
                    }
                }
            });
        }
    }

    public static class b extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f70197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f70198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f70199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f70200e;

        public b() {
            this((byte) 0);
        }

        private b(byte b10) {
            super(-1, -1);
            this.f70200e = 17;
        }
    }

    public interface c {
        void a(int i10);

        void a(int i10, int i11);

        void a(@NonNull View view, int i10);

        void a(@NonNull View view, int i10, float f10);
    }

    public interface d {
        void a();
    }

    public ViewFlow(Context context) {
        this(context, null);
    }

    public ViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70163k = new a(this, (byte) 0);
        this.f70153a = 0;
        this.f70154b = 0;
        this.f70164l = 0;
        this.f70155c = 3;
        this.f70170r = true;
        this.f70159g = false;
        this.f70160h = false;
        this.C = -1;
        this.I = true;
        this.J = new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewFlow.this.setScrollState(0);
            }
        };
        this.K = 0;
        this.M = false;
        removeAllViews();
        setFocusable(true);
        setOverScrollMode(2);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        Context context2 = getContext();
        this.f70171t = new Scroller(context2, f70152s);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.f70175x = viewConfiguration.getScaledPagingTouchSlop();
        this.E = (int) (400.0f * f10);
        this.F = viewConfiguration.getScaledMaximumFlingVelocity();
        this.G = (int) (25.0f * f10);
        this.H = (int) (2.0f * f10);
        this.f70161i = (int) (f10 * 16.0f);
    }

    private void a(int i10, int i11) {
        int scrollX;
        int iAbs;
        if (this.f70154b == 0) {
            return;
        }
        Scroller scroller = this.f70171t;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f70172u ? this.f70171t.getCurrX() : this.f70171t.getStartX();
            this.f70171t.abortAnimation();
        } else {
            scrollX = getScrollX();
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i10 - i12;
        int i14 = 0 - scrollY;
        if (i13 == 0 && i14 == 0) {
            a(false);
            setScrollState(0);
            return;
        }
        setScrollState(2);
        int measuredWidth = getMeasuredWidth();
        float f10 = measuredWidth / 2;
        float fB = f10 + (b(Math.min(1.0f, (Math.abs(i13) * 1.0f) / measuredWidth)) * f10);
        int iAbs2 = Math.abs(i11);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fB / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i13) / getChildAt(this.f70153a).getWidth()) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f70172u = false;
        this.f70171t.startScroll(i12, scrollY, i13, i14, iMin);
        sg.bigo.ads.common.e.a.a(this);
    }

    private void a(@IntRange(from = 0) int i10, boolean z10, int i11) {
        int iMax;
        int measuredWidth;
        int measuredWidth2;
        if (this.f70154b <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(0, i10), this.f70154b - 1);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.f70157e) {
            iMin++;
        }
        View childAt2 = getChildAt(iMin);
        if (childAt2 != null) {
            iMax = f() ? childAt2.getLeft() - ((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2) : childAt2.getLeft() - Math.max(this.f70156d, this.f70165m);
        } else {
            iMax = 0;
        }
        if (getChildAt(getChildCount() - 1) != null) {
            if (this.f70158f != null) {
                measuredWidth = this.f70166n - getMeasuredWidth();
                measuredWidth2 = this.f70158f.getMeasuredWidth();
            } else {
                measuredWidth = this.f70166n;
                measuredWidth2 = getMeasuredWidth();
            }
            iMax = (int) Math.max(0.0f, Math.min(iMax, measuredWidth - measuredWidth2));
        }
        if (iMax == getScrollX()) {
            return;
        }
        if (z10) {
            a(iMax, i11);
        } else {
            a(false);
            scrollTo(iMax, 0);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f70176y = motionEvent.getX(i10);
            this.C = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static /* synthetic */ void a(ViewFlow viewFlow) {
        int scrollX = viewFlow.getScrollX();
        if (viewFlow.f70157e != null) {
            View childAt = viewFlow.getChildAt(0);
            View view = viewFlow.f70157e;
            if (childAt == view && scrollX < view.getRight()) {
                viewFlow.c(0);
                return;
            }
        }
        if (viewFlow.f70158f != null) {
            View childAt2 = viewFlow.getChildAt(viewFlow.getChildCount() - 1);
            View view2 = viewFlow.f70158f;
            if (childAt2 != view2 || scrollX <= view2.getLeft() - viewFlow.getMeasuredWidth()) {
                return;
            }
            viewFlow.c(viewFlow.getItemCount() - 1);
        }
    }

    private void a(boolean z10) {
        boolean z11 = this.K == 2;
        if (z11 && (true ^ this.f70171t.isFinished())) {
            this.f70171t.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f70171t.getCurrX();
            int currY = this.f70171t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        if (z11) {
            if (z10) {
                sg.bigo.ads.common.e.a.a(this, this.J);
            } else {
                this.J.run();
            }
        }
    }

    private boolean a(float f10) {
        float f11 = this.f70176y - f10;
        this.f70176y = f10;
        float fMax = Math.max(0.0f, Math.min(getScrollX() + f11, getScrollRange()));
        sg.bigo.ads.common.t.a.b("ViewFlow", "performDrag, getScrollRange()=" + getScrollRange() + ", scrollX=" + fMax);
        int i10 = (int) fMax;
        this.f70176y = this.f70176y + (fMax - ((float) i10));
        scrollTo(i10, getScrollY());
        return false;
    }

    private static float b(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void c(@IntRange(from = 0) int i10) {
        a(i10, true, -20);
    }

    private boolean f() {
        int i10 = this.f70155c;
        return i10 == 2 || i10 == 3;
    }

    private boolean g() {
        this.C = -1;
        i();
        return true;
    }

    private int getScrollRange() {
        return Math.max(0, this.f70166n - getMeasuredWidth());
    }

    private void h() {
        this.f70160h = false;
        this.f70173v = true;
    }

    private void i() {
        this.f70173v = false;
        this.f70174w = false;
        this.f70160h = false;
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D = null;
        }
    }

    private void j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final int a(View view) {
        if (view == null) {
            return -1;
        }
        List<View> items = getItems();
        for (int i10 = 0; i10 < items.size(); i10++) {
            if (items.get(i10) == view) {
                return i10;
            }
        }
        return -1;
    }

    @Nullable
    public final View a(int i10) {
        List<View> items = getItems();
        if (i10 < 0 || i10 >= items.size()) {
            return null;
        }
        return items.get(i10);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    @Override // sg.bigo.ads.common.view.a
    public final void a() {
        int i10;
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            return;
        }
        int currentItem = getCurrentItem();
        if (this.L) {
            if (currentItem == 0) {
                i10 = currentItem + 1;
                this.L = false;
            } else {
                i10 = currentItem - 1;
            }
        } else if (currentItem != itemCount - 1) {
            View view = this.f70158f;
            int measuredWidth = this.f70166n;
            if (view != null) {
                measuredWidth -= view.getMeasuredWidth();
            }
            if (getScrollX() + getMeasuredWidth() >= measuredWidth) {
                i10 = currentItem - 1;
                this.L = true;
            } else {
                i10 = currentItem + 1;
            }
        } else {
            i10 = currentItem - 1;
            this.L = true;
        }
        c(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (i10 < 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null && childAt == this.f70158f) {
                i10 = getChildCount() - 1;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2 == this.f70157e) {
                i10++;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b(int i10) {
        this.f70153a = i10;
        if (this.I) {
            requestLayout();
        } else {
            c(i10);
        }
    }

    @Override // sg.bigo.ads.common.view.a
    public final boolean b() {
        return !this.f70173v;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f70172u = true;
        if (this.f70171t.isFinished() || !this.f70171t.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f70171t.getCurrX();
        int currY = this.f70171t.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
        }
        sg.bigo.ads.common.e.a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f70159g = true;
        if (!this.M) {
            onTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final boolean e() {
        int measuredWidth = this.f70166n;
        View view = this.f70157e;
        if (view != null) {
            measuredWidth -= view.getRight();
        }
        View view2 = this.f70158f;
        if (view2 != null) {
            measuredWidth -= view2.getMeasuredWidth();
        }
        return getWidth() >= measuredWidth;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public int getContentMaxWidthSpace() {
        return this.f70156d;
    }

    @IntRange(from = 0)
    public int getCurrentItem() {
        return this.f70153a;
    }

    @IntRange(from = 0)
    public int getItemCount() {
        return this.f70154b;
    }

    @NonNull
    public List<View> getItems() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f70157e && childAt != this.f70158f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public c getOnItemChangeListener() {
        return this.f70163k.f70181a;
    }

    public int getViewStyle() {
        return this.f70155c;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.J);
        Scroller scroller = this.f70171t;
        if (scroller != null && !scroller.isFinished()) {
            this.f70171t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.M = false;
        if (this.f70170r) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.f70173v) {
                return true;
            }
            if (this.f70174w) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.A = x10;
            this.f70176y = x10;
            float y10 = motionEvent.getY();
            this.B = y10;
            this.f70177z = y10;
            this.C = motionEvent.getPointerId(0);
            this.f70174w = false;
            this.f70172u = true;
            this.f70171t.computeScrollOffset();
            if (this.K != 2 || Math.abs(this.f70171t.getFinalX() - this.f70171t.getCurrX()) <= this.H) {
                a(false);
                this.f70173v = false;
            } else {
                this.f70171t.abortAnimation();
                h();
                j();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.C;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f70176y;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.B);
                if (f10 != 0.0f) {
                    float f11 = this.f70176y;
                    if (!((f11 < ((float) this.f70162j) && f10 > 0.0f) || (f11 > ((float) (getWidth() - this.f70162j)) && f10 < 0.0f))) {
                        if (getWidth() < this.f70166n) {
                            this.f70176y = x11;
                            this.f70177z = y11;
                            this.f70174w = true;
                            return false;
                        }
                    }
                }
                int i11 = this.f70175x;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    h();
                    j();
                    setScrollState(1);
                    float f12 = this.A;
                    float f13 = this.f70175x;
                    this.f70176y = f10 > 0.0f ? f12 + f13 : f12 - f13;
                    this.f70177z = y11;
                } else if (fAbs2 > i11) {
                    this.f70174w = true;
                }
                if (this.f70173v) {
                    a(x11);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        return this.f70173v;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        int iMax;
        float f12;
        float fMax;
        int i14;
        int i15;
        int i16;
        float measuredHeight;
        this.f70163k.a(this.f70154b);
        this.f70166n = 0;
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        float fAbs = Math.abs(i13 - i11);
        int iAbs = Math.abs(i12 - i10);
        View view = this.f70157e;
        if (view != null) {
            if (view != null) {
                float measuredHeight2 = (fAbs - view.getMeasuredHeight()) / 2.0f;
                View view2 = this.f70157e;
                view2.layout(0, (int) measuredHeight2, view2.getMeasuredWidth(), (int) (measuredHeight2 + this.f70157e.getMeasuredHeight()));
            }
            this.f70166n += this.f70157e.getRight();
        }
        View view3 = null;
        boolean z11 = true;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt != this.f70157e && childAt != this.f70158f) {
                int i18 = this.f70155c;
                if (i18 != 2) {
                    if (i18 != 3) {
                        i14 = this.f70166n + (z11 ? this.f70156d : this.f70165m);
                    } else {
                        if (view3 != null) {
                            this.f70166n = (int) (this.f70166n + ((iAbs - view3.getMeasuredWidth()) / 2.0f));
                        }
                        f12 = this.f70166n;
                        fMax = (iAbs - childAt.getMeasuredWidth()) / 2.0f;
                    }
                    this.f70166n = i14;
                    i15 = ((b) childAt.getLayoutParams()).f70200e;
                    if (i15 != 48) {
                        if (i15 != 80) {
                            measuredHeight = (fAbs - childAt.getMeasuredHeight()) / 2.0f;
                        } else {
                            measuredHeight = fAbs - childAt.getMeasuredHeight();
                        }
                        i16 = (int) measuredHeight;
                    } else {
                        i16 = 0;
                    }
                    int i19 = this.f70166n;
                    childAt.layout(i19, i16, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + i16);
                    this.f70166n = childAt.getRight();
                    z11 = false;
                    view3 = childAt;
                } else {
                    f12 = this.f70166n;
                    fMax = z11 ? Math.max(this.f70156d, (iAbs - childAt.getMeasuredWidth()) / 2.0f) : this.f70165m;
                }
                i14 = (int) (f12 + fMax);
                this.f70166n = i14;
                i15 = ((b) childAt.getLayoutParams()).f70200e;
                if (i15 != 48) {
                    if (i15 != 80) {
                        measuredHeight = (fAbs - childAt.getMeasuredHeight()) / 2.0f;
                    } else {
                        measuredHeight = fAbs - childAt.getMeasuredHeight();
                    }
                    i16 = (int) measuredHeight;
                } else {
                    i16 = 0;
                }
                int i110 = this.f70166n;
                childAt.layout(i110, i16, childAt.getMeasuredWidth() + i110, childAt.getMeasuredHeight() + i16);
                this.f70166n = childAt.getRight();
                z11 = false;
                view3 = childAt;
            }
        }
        if (view3 != null) {
            int i20 = this.f70155c;
            if (i20 != 2) {
                if (i20 != 3) {
                    iMax = this.f70166n + this.f70156d;
                } else {
                    f10 = this.f70166n;
                    f11 = 0.0f;
                }
                this.f70166n = iMax;
            } else {
                f10 = this.f70166n;
                f11 = this.f70156d;
            }
            iMax = (int) (f10 + Math.max(f11, (iAbs - view3.getMeasuredWidth()) / 2.0f));
            this.f70166n = iMax;
        }
        View view4 = this.f70158f;
        if (view4 != null) {
            int measuredWidth = this.f70166n;
            if (view4 != null) {
                View view5 = this.f70157e;
                int right = view5 != null ? view5.getRight() : 0;
                if (measuredWidth - right < getMeasuredWidth()) {
                    measuredWidth = getMeasuredWidth() + right;
                }
                float measuredHeight3 = (fAbs - this.f70158f.getMeasuredHeight()) / 2.0f;
                View view6 = this.f70158f;
                view6.layout(measuredWidth, (int) measuredHeight3, view6.getMeasuredWidth() + measuredWidth, (int) (measuredHeight3 + this.f70158f.getMeasuredHeight()));
            }
            this.f70166n = this.f70158f.getRight();
        }
        if (this.I) {
            a(this.f70153a, false, 0);
        } else {
            c(this.f70153a);
        }
        this.I = false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        p pVarA;
        p pVarA2;
        p pVar;
        b bVar;
        int i12;
        int i13 = 0;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f70162j = Math.min(measuredWidth / 10, this.f70161i);
        int measuredWidth2 = getMeasuredWidth() - (this.f70156d * 2);
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 < childCount) {
                View childAt = getChildAt(i14);
                if (childAt != this.f70157e && childAt != this.f70158f && (bVar = (b) childAt.getLayoutParams()) != null && bVar.f70198c) {
                    int i15 = bVar.f70196a;
                    if (i15 > 0 && (i12 = bVar.f70197b) > 0) {
                        pVarA = p.a(i15, i12, measuredWidth2, measuredHeight);
                        break;
                    }
                    break;
                }
                i14++;
            }
            pVarA = null;
            break;
        }
        if (pVarA == null && (pVar = this.f70169q) != null) {
            pVarA = p.a(pVar.f69806b, pVar.f69807c, measuredWidth2, measuredHeight);
        }
        this.f70153a = Math.min(Math.max(0, this.f70153a), this.f70154b - 1);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2 == this.f70157e || childAt2 == this.f70158f) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), i13), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), i13));
            } else {
                b bVar2 = (b) childAt2.getLayoutParams();
                if (bVar2 != null) {
                    int i17 = bVar2.f70196a;
                    int i18 = bVar2.f70197b;
                    if (this.f70155c == Integer.MIN_VALUE) {
                        pVarA2 = p.a(i17, i18, measuredHeight);
                    } else {
                        int i19 = bVar2.f70199d;
                        if (i19 != 1 && i19 != 2) {
                            pVarA2 = new p(measuredWidth2, measuredHeight);
                        } else if (i19 == 2 && pVarA != null) {
                            pVarA2 = pVarA;
                        } else if (i17 <= 0 || i18 <= 0) {
                            pVarA2 = new p(measuredWidth2, measuredHeight);
                        } else {
                            pVarA2 = p.a(i17, i18, measuredWidth2, measuredHeight);
                        }
                    }
                    int i20 = pVarA2.f69806b;
                    ((ViewGroup.LayoutParams) bVar2).width = i20;
                    ((ViewGroup.LayoutParams) bVar2).height = pVarA2.f69807c;
                    i13 = 0;
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, i20), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, ((ViewGroup.LayoutParams) bVar2).height), 1073741824));
                }
            }
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        int iMin;
        int i14;
        super.onScrollChanged(i10, i11, i12, i13);
        View childAt = getChildAt(0);
        if (childAt == null || childAt != this.f70157e) {
            iMin = i10;
            i14 = 0;
        } else {
            iMin = Math.max(childAt.getRight(), i10);
            i14 = 1;
        }
        int childCount = getChildCount();
        View childAt2 = getChildAt(childCount - 1);
        if (childAt2 != null && childAt2 == this.f70158f) {
            iMin = Math.min(childAt2.getLeft() - getMeasuredWidth(), iMin);
            childCount--;
        }
        float measuredWidth = f() ? iMin + ((getMeasuredWidth() * 1.0f) / 2.0f) : iMin + this.f70156d;
        View childAt3 = getChildAt(this.f70153a + i14);
        int measuredWidth2 = (childAt3 == null || childAt3.getMeasuredWidth() <= 0) ? getMeasuredWidth() - (this.f70156d * 2) : childAt3.getMeasuredWidth();
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- begin -----");
        for (int i15 = i14; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            if (childAt4 != null) {
                float fMax = Math.max(-1.0f, Math.min(1.0f, (f() ? (int) (((childAt4.getLeft() + ((childAt4.getMeasuredWidth() * 1.0f) / 2.0f)) - measuredWidth) + 0.5f) : childAt4.getLeft() - measuredWidth) / measuredWidth2));
                int i16 = i15 - i14;
                if (((float) childAt4.getLeft()) < measuredWidth && ((float) childAt4.getRight()) > measuredWidth) {
                    this.f70164l = i16;
                }
                this.f70163k.a(childAt4, i16, fMax);
                if (fMax == 0.0f && this.f70153a != i16) {
                    this.f70153a = i16;
                    this.f70164l = i16;
                    this.f70163k.a(childAt4, i16);
                }
            }
        }
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- end -----");
        a aVar = this.f70163k;
        if (aVar != null) {
            aVar.a(i10, getScrollRange());
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0214 A[PHI: r1
  0x0214: PHI (r1v12 sg.bigo.ads.common.view.ViewFlow$d) = (r1v11 sg.bigo.ads.common.view.ViewFlow$d), (r1v13 sg.bigo.ads.common.view.ViewFlow$d) binds: [B:125:0x0239, B:115:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x026e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x0155  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerId;
        d dVar;
        int right;
        int scrollRange;
        boolean zG;
        this.M = true;
        boolean zG2 = false;
        if (!this.f70170r) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || getChildCount() == 0) {
            return false;
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (this.f70173v) {
                            a(this.f70153a, true, 0);
                            zG = g();
                        } else {
                            zG = false;
                        }
                        this.f70160h = false;
                        zG2 = zG;
                    } else if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f70176y = motionEvent.getX(actionIndex);
                        pointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        a(motionEvent);
                        this.f70176y = motionEvent.getX(motionEvent.findPointerIndex(this.C));
                    }
                } else if (!this.f70173v) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.C);
                    if (iFindPointerIndex == -1) {
                        zG2 = g();
                    } else {
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x10 - this.f70176y);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y10 - this.f70177z);
                        if (fAbs > this.f70175x && fAbs > fAbs2) {
                            h();
                            j();
                            float f10 = this.A;
                            this.f70176y = x10 - f10 > 0.0f ? f10 + this.f70175x : f10 - this.f70175x;
                            this.f70177z = y10;
                            setScrollState(1);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f70173v) {
                            a(motionEvent.getX(motionEvent.findPointerIndex(this.C)));
                        } else {
                            this.f70160h = true;
                        }
                    }
                } else if (this.f70173v) {
                    a(motionEvent.getX(motionEvent.findPointerIndex(this.C)));
                } else {
                    this.f70160h = true;
                }
            } else if (this.f70173v) {
                VelocityTracker velocityTracker = this.D;
                velocityTracker.computeCurrentVelocity(1000, this.F);
                int xVelocity = (int) velocityTracker.getXVelocity(this.C);
                int scrollX = getScrollX();
                int x11 = (int) (motionEvent.getX(motionEvent.findPointerIndex(this.C)) - this.A);
                if (Integer.MIN_VALUE != this.f70155c) {
                    int i10 = this.f70164l;
                    int i11 = (Math.abs(x11) <= this.G || Math.abs(xVelocity) <= this.E || xVelocity > 0) ? i10 : i10 + 1;
                    if (i11 == i10) {
                        double measuredWidth = (x11 * 1.0f) / a(i10).getMeasuredWidth();
                        if (measuredWidth > 0.1d) {
                            i10--;
                        } else if (measuredWidth < -0.1d) {
                            i10++;
                        }
                    } else {
                        i10 = i11;
                    }
                    int iMax = Math.max(Math.min(i10, this.f70153a + 1), this.f70153a - 1);
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View view = this.f70157e;
                        if (view != null && view == getChildAt(0)) {
                            childCount--;
                        }
                        View view2 = this.f70158f;
                        if (view2 != null && view2 == getChildAt(getChildCount() - 1)) {
                            childCount--;
                        }
                        iMax = Math.max(0, Math.min(iMax, childCount - 1));
                    }
                    a(iMax, true, xVelocity);
                } else if (Math.abs(xVelocity) > this.E) {
                    int i12 = -xVelocity;
                    if (this.f70157e != null) {
                        View childAt = getChildAt(0);
                        View view3 = this.f70157e;
                        if (childAt == view3) {
                            right = view3.getRight();
                        } else {
                            right = 0;
                        }
                    } else {
                        right = 0;
                    }
                    if (this.f70158f != null) {
                        View childAt2 = getChildAt(getChildCount() - 1);
                        View view4 = this.f70158f;
                        if (childAt2 == view4) {
                            scrollRange = view4.getLeft() - getMeasuredWidth();
                        } else {
                            scrollRange = getScrollRange();
                        }
                    } else {
                        scrollRange = getScrollRange();
                    }
                    int i13 = scrollRange;
                    if (getChildCount() > 0) {
                        this.f70171t.fling(getScrollX(), getScrollY(), i12, 0, right, i13, 0, 0);
                        postInvalidateOnAnimation();
                    }
                } else {
                    post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewFlow.a(ViewFlow.this);
                        }
                    });
                }
                if (scrollX == 0 && x11 > 0 && this.f70157e != null && getChildAt(0) == this.f70157e) {
                    dVar = this.f70167o;
                    if (dVar != null) {
                        dVar.a();
                    }
                } else if (this.f70158f != null) {
                    View childAt3 = getChildAt(getChildCount() - 1);
                    View view5 = this.f70158f;
                    if (childAt3 == view5 && x11 < 0 && scrollX == view5.getRight() - getMeasuredWidth() && (dVar = this.f70168p) != null) {
                        dVar.a();
                    }
                }
                zG = g();
                this.f70160h = false;
                zG2 = zG;
            } else {
                if (Integer.MIN_VALUE != this.f70155c) {
                    c(this.f70164l);
                } else {
                    post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewFlow.a(ViewFlow.this);
                        }
                    });
                }
                zG = false;
                this.f70160h = false;
                zG2 = zG;
            }
            if (zG2) {
                sg.bigo.ads.common.e.a.a(this);
            }
            return true;
        }
        this.f70171t.abortAnimation();
        float x12 = motionEvent.getX();
        this.A = x12;
        this.f70176y = x12;
        float y11 = motionEvent.getY();
        this.B = y11;
        this.f70177z = y11;
        pointerId = motionEvent.getPointerId(0);
        this.C = pointerId;
        if (zG2) {
            sg.bigo.ads.common.e.a.a(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view == this.f70158f || view == this.f70157e || view == null) {
            return;
        }
        this.f70154b++;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.f70158f || view == this.f70157e || view == null) {
            return;
        }
        this.f70154b--;
    }

    public void setContentMaxWidthSpace(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f70156d != iMax) {
            this.f70156d = iMax;
            requestLayout();
        }
    }

    public void setDividerWidth(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f70165m != iMax) {
            this.f70165m = iMax;
            if (this.f70155c != 3) {
                requestLayout();
            }
        }
    }

    public void setEndView(View view) {
        View view2 = this.f70158f;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f70158f = view;
            if (view != null) {
                addView(view);
            }
            requestLayout();
        }
    }

    public void setMainChildSize(p pVar) {
        this.f70169q = pVar;
    }

    public void setOnEndViewShowListener(d dVar) {
        this.f70168p = dVar;
    }

    public void setOnItemChangeListener(c cVar) {
        this.f70163k.f70181a = cVar;
    }

    public void setOnStartViewShowListener(d dVar) {
        this.f70167o = dVar;
    }

    public void setScrollEnabled(boolean z10) {
        this.f70170r = z10;
    }

    public void setScrollState(int i10) {
        if (this.K == i10) {
            return;
        }
        this.K = i10;
    }

    public void setStartView(View view) {
        View view2 = this.f70157e;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f70157e = view;
            if (view != null) {
                addView(view, 0);
            }
            requestLayout();
        }
    }

    public void setViewStyle(int i10) {
        if (this.f70155c != i10) {
            this.f70155c = i10;
            requestLayout();
        }
    }
}
