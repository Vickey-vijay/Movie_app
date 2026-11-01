package io.bidmachine.iab.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidUtils;

/* JADX INFO: loaded from: classes8.dex */
public class VisibilityTracker {

    @NonNull
    public static final String TAG = "VisibilityTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f59409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f59410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callback f59411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f59412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f59413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f59414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f59415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f59416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnAttachStateChangeListener f59417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f59420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f59421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f59422n;

    public interface Callback {
        void onVisibilityChanged(boolean z10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VisibilityTracker.this.a();
            VisibilityTracker.this.f59420l = false;
        }
    }

    public class b implements ViewTreeObserver.OnPreDrawListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            VisibilityTracker.this.b();
            return true;
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            VisibilityTracker.this.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            VisibilityTracker.this.a();
        }
    }

    public VisibilityTracker(@NonNull Context context, @NonNull View view, @NonNull Callback callback) {
        this(context, view, callback, 0.1f);
    }

    public boolean isVisible() {
        return this.f59418j;
    }

    public void release() {
        this.f59422n = true;
        this.f59421m = false;
        this.f59420l = false;
        this.f59410b.getViewTreeObserver().removeOnPreDrawListener(this.f59416h);
        this.f59410b.removeOnAttachStateChangeListener(this.f59417i);
        Utils.cancelOnUiThread(this.f59415g);
    }

    public void start() {
        if (this.f59422n || this.f59421m) {
            return;
        }
        this.f59421m = true;
        if (this.f59416h == null) {
            this.f59416h = new b();
        }
        if (this.f59417i == null) {
            this.f59417i = new c();
        }
        this.f59410b.getViewTreeObserver().addOnPreDrawListener(this.f59416h);
        this.f59410b.addOnAttachStateChangeListener(this.f59417i);
        a();
    }

    public VisibilityTracker(@NonNull Context context, @NonNull View view, @NonNull Callback callback, float f10) {
        this.f59418j = false;
        this.f59419k = false;
        this.f59420l = false;
        this.f59421m = false;
        this.f59422n = false;
        this.f59409a = context;
        this.f59410b = view;
        this.f59411c = callback;
        this.f59412d = f10;
        this.f59413e = new Rect();
        this.f59414f = new Rect();
        this.f59415g = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f59420l) {
            return;
        }
        this.f59420l = true;
        Utils.onUiThread(this.f59415g, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.f59410b.getVisibility() != 0) {
                a(this.f59410b, "Visibility != View.VISIBLE");
                return;
            }
            if (this.f59410b.getParent() == null) {
                a(this.f59410b, "No parent");
                return;
            }
            if (!this.f59410b.getGlobalVisibleRect(this.f59413e)) {
                a(this.f59410b, "Can't get global visible rect");
                return;
            }
            if (Utils.isViewTransparent(this.f59410b)) {
                a(this.f59410b, "View is transparent (alpha = 0)");
                return;
            }
            float width = this.f59410b.getWidth() * this.f59410b.getHeight();
            if (width <= 0.0f) {
                a(this.f59410b, "Ad View width or height is zero, show wasn't tracked");
                return;
            }
            float fWidth = (this.f59413e.width() * this.f59413e.height()) / width;
            if (fWidth < this.f59412d) {
                a(this.f59410b, "Ad View is not completely visible (" + fWidth + "), show wasn't tracked");
                return;
            }
            View topmostView = MraidUtils.getTopmostView(this.f59409a, this.f59410b);
            if (topmostView == null) {
                a(this.f59410b, "Can't obtain root view");
                return;
            }
            topmostView.getGlobalVisibleRect(this.f59414f);
            if (!Rect.intersects(this.f59413e, this.f59414f)) {
                a(this.f59410b, "Ad View is out of current window, show wasn't tracked");
                return;
            }
            a(this.f59410b);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(View view, String str) {
        if (!this.f59419k) {
            this.f59419k = true;
            MraidLog.d(TAG, str, new Object[0]);
        }
        a(false);
    }

    private void a(View view) {
        this.f59419k = false;
        a(true);
    }

    private void a(boolean z10) {
        if (this.f59418j != z10) {
            this.f59418j = z10;
            this.f59411c.onVisibilityChanged(z10);
        }
    }
}
