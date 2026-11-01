package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class SlideSelectTouchListener implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f32470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f32471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f32474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f32475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public OverScroller f32476m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32481r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f32488y;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f32477n = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32482s = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f32483t = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f32484u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f32485v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f32486w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f32487x = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SlideSelectTouchListener.this.f32476m == null || !SlideSelectTouchListener.this.f32476m.computeScrollOffset()) {
                return;
            }
            SlideSelectTouchListener slideSelectTouchListener = SlideSelectTouchListener.this;
            slideSelectTouchListener.l(slideSelectTouchListener.f32469f);
            ViewCompat.postOnAnimation(SlideSelectTouchListener.this.f32475l, SlideSelectTouchListener.this.f32477n);
        }
    }

    public interface b extends c {
        void a(int i10);

        void b(int i10);
    }

    public interface c {
        void c(int i10, int i11, boolean z10);
    }

    public final void k() {
        m(false);
        c cVar = this.f32474k;
        if (cVar != null && (cVar instanceof b)) {
            ((b) cVar).a(this.f32466c);
        }
        this.f32465b = -1;
        this.f32466c = -1;
        this.f32472i = -1;
        this.f32473j = -1;
        this.f32467d = false;
        this.f32468e = false;
        this.f32470g = Float.MIN_VALUE;
        this.f32471h = Float.MIN_VALUE;
        q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }

    public void p(int i10) {
        m(true);
        this.f32465b = i10;
        this.f32466c = i10;
        this.f32472i = i10;
        this.f32473j = i10;
        c cVar = this.f32474k;
        if (cVar == null || !(cVar instanceof b)) {
            return;
        }
        ((b) cVar).b(i10);
    }

    public final void h(Context context) {
        if (this.f32476m == null) {
            this.f32476m = new OverScroller(context, new LinearInterpolator());
        }
    }

    public final void i() {
        int i10;
        int i11;
        if (this.f32474k == null || (i10 = this.f32465b) == -1 || (i11 = this.f32466c) == -1) {
            return;
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(this.f32465b, this.f32466c);
        if (iMin < 0) {
            return;
        }
        int i12 = this.f32472i;
        if (i12 != -1 && this.f32473j != -1) {
            if (iMin > i12) {
                this.f32474k.c(i12, iMin - 1, false);
            } else if (iMin < i12) {
                this.f32474k.c(iMin, i12 - 1, true);
            }
            int i13 = this.f32473j;
            if (iMax > i13) {
                this.f32474k.c(i13 + 1, iMax, true);
            } else if (iMax < i13) {
                this.f32474k.c(iMax + 1, i13, false);
            }
        } else if (iMax - iMin == 1) {
            this.f32474k.c(iMin, iMin, true);
        } else {
            this.f32474k.c(iMin, iMax, true);
        }
        this.f32472i = iMin;
        this.f32473j = iMax;
    }

    public final void l(int i10) {
        this.f32475l.scrollBy(0, i10 > 0 ? Math.min(i10, this.f32482s) : Math.max(i10, -this.f32482s));
        float f10 = this.f32470g;
        if (f10 != Float.MIN_VALUE) {
            float f11 = this.f32471h;
            if (f11 != Float.MIN_VALUE) {
                f(this.f32475l, f10, f11);
            }
        }
    }

    public void m(boolean z10) {
        this.f32464a = z10;
    }

    public SlideSelectTouchListener n(int i10) {
        this.f32488y = i10;
        return this;
    }

    public void o() {
        RecyclerView recyclerView = this.f32475l;
        if (recyclerView == null) {
            return;
        }
        h(recyclerView.getContext());
        if (this.f32476m.isFinished()) {
            this.f32475l.removeCallbacks(this.f32477n);
            OverScroller overScroller = this.f32476m;
            overScroller.startScroll(0, overScroller.getCurrY(), 0, 5000, 100000);
            ViewCompat.postOnAnimation(this.f32475l, this.f32477n);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (!this.f32464a || recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 5) {
            k();
        }
        this.f32475l = recyclerView;
        int height = recyclerView.getHeight();
        int i10 = this.f32484u;
        this.f32478o = i10;
        int i11 = this.f32483t;
        this.f32479p = i10 + i11;
        int i12 = this.f32485v;
        this.f32480q = (height + i12) - i11;
        this.f32481r = height + i12;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (!this.f32464a) {
            k();
            return;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (!this.f32467d && !this.f32468e) {
                    g(recyclerView, motionEvent);
                }
                j(motionEvent);
                return;
            }
            if (action != 3 && action != 6) {
                return;
            }
        }
        k();
    }

    public void q() {
        try {
            OverScroller overScroller = this.f32476m;
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            this.f32475l.removeCallbacks(this.f32477n);
            this.f32476m.abortAnimation();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public SlideSelectTouchListener r(c cVar) {
        this.f32474k = cVar;
        return this;
    }

    public SlideSelectTouchListener() {
        k();
    }

    public final void f(RecyclerView recyclerView, float f10, float f11) {
        int childAdapterPosition;
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(f10, f11);
        if (viewFindChildViewUnder != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder) - this.f32488y) != -1 && this.f32466c != childAdapterPosition) {
            this.f32466c = childAdapterPosition;
            i();
        }
    }

    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        f(recyclerView, motionEvent.getX(), motionEvent.getY());
    }

    public final void j(MotionEvent motionEvent) {
        int y10 = (int) motionEvent.getY();
        int i10 = this.f32478o;
        if (y10 >= i10 && y10 <= this.f32479p) {
            this.f32470g = motionEvent.getX();
            this.f32471h = motionEvent.getY();
            int i11 = this.f32479p;
            int i12 = this.f32478o;
            this.f32469f = (int) (this.f32482s * (((i11 - i12) - (y10 - i12)) / (i11 - i12)) * (-1.0f));
            if (!this.f32467d) {
                this.f32467d = true;
                o();
                return;
            }
            return;
        }
        if (this.f32486w && y10 < i10) {
            this.f32470g = motionEvent.getX();
            this.f32471h = motionEvent.getY();
            this.f32469f = this.f32482s * (-1);
            if (!this.f32467d) {
                this.f32467d = true;
                o();
                return;
            }
            return;
        }
        if (y10 >= this.f32480q && y10 <= this.f32481r) {
            this.f32470g = motionEvent.getX();
            this.f32471h = motionEvent.getY();
            float f10 = y10;
            int i13 = this.f32480q;
            this.f32469f = (int) (this.f32482s * ((f10 - i13) / (this.f32481r - i13)));
            if (!this.f32468e) {
                this.f32468e = true;
                o();
                return;
            }
            return;
        }
        if (this.f32487x && y10 > this.f32481r) {
            this.f32470g = motionEvent.getX();
            this.f32471h = motionEvent.getY();
            this.f32469f = this.f32482s;
            if (!this.f32467d) {
                this.f32467d = true;
                o();
                return;
            }
            return;
        }
        this.f32468e = false;
        this.f32467d = false;
        this.f32470g = Float.MIN_VALUE;
        this.f32471h = Float.MIN_VALUE;
        q();
    }
}
