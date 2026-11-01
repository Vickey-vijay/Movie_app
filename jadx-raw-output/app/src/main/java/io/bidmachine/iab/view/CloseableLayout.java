package io.bidmachine.iab.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.IabCloseWrapper;
import io.bidmachine.iab.utils.IabCountDownWrapper;
import io.bidmachine.iab.utils.IabElementStyle;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
public class CloseableLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f59731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IabCloseWrapper f59732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IabCountDownWrapper f59733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f59734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnCloseClickListener f59735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IabElementStyle f59736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IabElementStyle f59737g;

    public interface OnCloseClickListener {
        void onCloseClick();

        void onCountDownFinish();
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CloseableLayout.this.f59735e != null) {
                CloseableLayout.this.f59735e.onCloseClick();
            }
        }
    }

    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CloseableLayout.this.f59733c == null) {
                return;
            }
            long j10 = CloseableLayout.this.f59731a.f59743d;
            if (CloseableLayout.this.isShown()) {
                j10 += 50;
                CloseableLayout.this.f59731a.a(j10);
                CloseableLayout.this.f59733c.changePercentage((int) ((100 * j10) / CloseableLayout.this.f59731a.f59742c), (int) Math.ceil((CloseableLayout.this.f59731a.f59742c - j10) / 1000.0d));
            }
            if (j10 < CloseableLayout.this.f59731a.f59742c) {
                CloseableLayout.this.postDelayed(this, 50L);
                return;
            }
            CloseableLayout.this.c();
            if (CloseableLayout.this.f59731a.f59741b <= 0.0f || CloseableLayout.this.f59735e == null) {
                return;
            }
            CloseableLayout.this.f59735e.onCountDownFinish();
        }

        public /* synthetic */ b(CloseableLayout closeableLayout, a aVar) {
            this();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f59740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f59741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f59742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f59743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f59744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f59745f;

        private c() {
            this.f59740a = false;
            this.f59741b = 0.0f;
            this.f59742c = 0L;
            this.f59743d = 0L;
            this.f59744e = 0L;
            this.f59745f = 0L;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        public long b() {
            return this.f59744e > 0 ? System.currentTimeMillis() - this.f59744e : this.f59745f;
        }

        public boolean c() {
            long j10 = this.f59742c;
            return j10 != 0 && this.f59743d < j10;
        }

        public boolean d() {
            return this.f59740a;
        }

        public boolean a() {
            long j10 = this.f59742c;
            return j10 == 0 || this.f59743d >= j10;
        }

        public void a(boolean z10, float f10) {
            this.f59740a = z10;
            this.f59741b = f10;
            this.f59742c = (long) (f10 * 1000.0f);
            this.f59743d = 0L;
        }

        public void a(long j10) {
            this.f59743d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z10) {
            if (this.f59744e > 0) {
                this.f59745f += System.currentTimeMillis() - this.f59744e;
            }
            if (z10) {
                this.f59744e = System.currentTimeMillis();
            } else {
                this.f59744e = 0L;
            }
        }
    }

    public CloseableLayout(@NonNull Context context) {
        super(context);
        this.f59731a = new c(null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        IabCloseWrapper iabCloseWrapper = this.f59732b;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.bringToFront();
        }
        IabCountDownWrapper iabCountDownWrapper = this.f59733c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.bringToFront();
        }
    }

    public boolean canBeClosed() {
        return this.f59731a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public long getOnScreenTimeMs() {
        return this.f59731a.b();
    }

    public boolean isVisible() {
        return this.f59731a.d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            b();
        } else if (this.f59731a.c() && this.f59731a.d()) {
            a();
        }
        this.f59731a.a(i10 == 0);
    }

    public void setCloseClickListener(@Nullable OnCloseClickListener onCloseClickListener) {
        this.f59735e = onCloseClickListener;
    }

    public void setCloseStyle(@Nullable IabElementStyle iabElementStyle) {
        this.f59736f = iabElementStyle;
        IabCloseWrapper iabCloseWrapper = this.f59732b;
        if (iabCloseWrapper == null || !iabCloseWrapper.isAttached()) {
            return;
        }
        this.f59732b.attach(getContext(), this, iabElementStyle);
    }

    public void setCloseVisibility(boolean z10, float f10) {
        if (this.f59731a.f59740a == z10 && this.f59731a.f59741b == f10) {
            return;
        }
        this.f59731a.a(z10, f10);
        if (z10) {
            c();
            return;
        }
        IabCloseWrapper iabCloseWrapper = this.f59732b;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.detach();
        }
        IabCountDownWrapper iabCountDownWrapper = this.f59733c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.detach();
        }
        b();
    }

    public void setCountDownStyle(@Nullable IabElementStyle iabElementStyle) {
        this.f59737g = iabElementStyle;
        IabCountDownWrapper iabCountDownWrapper = this.f59733c;
        if (iabCountDownWrapper == null || !iabCountDownWrapper.isAttached()) {
            return;
        }
        this.f59733c.attach(getContext(), this, iabElementStyle);
    }

    private void a() {
        if (isShown()) {
            b();
            b bVar = new b(this, null);
            this.f59734d = bVar;
            postDelayed(bVar, 50L);
        }
    }

    private void b() {
        b bVar = this.f59734d;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.f59734d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f59731a.c()) {
            IabCloseWrapper iabCloseWrapper = this.f59732b;
            if (iabCloseWrapper != null) {
                iabCloseWrapper.detach();
            }
            if (this.f59733c == null) {
                this.f59733c = new IabCountDownWrapper(null);
            }
            this.f59733c.attach(getContext(), this, this.f59737g);
            a();
            return;
        }
        b();
        if (this.f59732b == null) {
            this.f59732b = new IabCloseWrapper(new a());
        }
        this.f59732b.attach(getContext(), this, this.f59736f);
        IabCountDownWrapper iabCountDownWrapper = this.f59733c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.detach();
        }
    }
}
