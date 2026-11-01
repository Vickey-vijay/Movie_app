package io.bidmachine.internal.utils.visibility;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.core.VisibilityParams;
import io.bidmachine.internal.utils.LogSafeRunnable;
import io.bidmachine.internal.utils.visibility.VisibilityTrackerImpl;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class VisibilityTrackerImpl implements VisibilityTracker {
    private static final int AFD_MAX_COUNT_OVERLAPPED_VIEWS = 3;
    private static final int CHECK_DELAY = 100;
    private static final int NO_TRACK = -1;

    @NonNull
    private final Runnable checkRunnable;

    @NonNull
    private final Runnable finishRunnable;
    private boolean isFinishedRequested;
    private boolean isFinishedTracked;
    private boolean isShownTracked;
    private long lastShownTimeMs;

    @NonNull
    private final ViewTreeObserver.OnPreDrawListener preDrawListener;

    @NonNull
    private final VisibilityParams visibilityParams;

    @NonNull
    private final VisibilityTrackerListener visibilityTrackerListener;

    @NonNull
    private final WeakReference<View> weakView;

    @NonNull
    private final Object lock = new Object();

    @NonNull
    private final AtomicBoolean isStarted = new AtomicBoolean(false);

    @NonNull
    private final AtomicBoolean isCheckerScheduled = new AtomicBoolean(false);

    public class b implements LogSafeRunnable {
        private b() {
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
        public void onRun() throws Throwable {
            if (VisibilityTrackerImpl.this.check()) {
                return;
            }
            VisibilityTrackerImpl.this.forceScheduleChecker();
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
        public void onThrows(@NonNull Throwable th2) throws Throwable {
            super.onThrows(th2);
            VisibilityTrackerImpl.this.forceScheduleChecker();
        }
    }

    public class c implements LogSafeRunnable {
        private c() {
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
        @CallSuper
        public /* bridge */ /* synthetic */ void onThrows(@NonNull Throwable th2) throws Throwable {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
        public void onRun() throws Throwable {
            VisibilityTrackerImpl.this.stop();
        }
    }

    public class d implements ViewTreeObserver.OnPreDrawListener {
        private d() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            VisibilityTrackerImpl.this.scheduleChecker();
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    private boolean isVisibilityVerified(@NonNull View view, final float f10, boolean z10, boolean z11) {
        try {
            final String string = view.toString();
            if (!view.isShown()) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.e
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$isVisibilityVerified$2(string);
                    }
                });
                return false;
            }
            if (Utils.isViewTransparent(view)) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.f
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$isVisibilityVerified$3(string);
                    }
                });
                return false;
            }
            if (!z10 && !view.hasWindowFocus()) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.g
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$isVisibilityVerified$4(string);
                    }
                });
                return false;
            }
            float width = view.getWidth() * view.getHeight();
            if (width == 0.0f) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.h
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$isVisibilityVerified$5(string);
                    }
                });
                return false;
            }
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.i
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$isVisibilityVerified$6(string);
                    }
                });
                return false;
            }
            final float fWidth = (rect.width() * rect.height()) / width;
            if (fWidth < f10) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.j
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$isVisibilityVerified$7(fWidth, f10, string);
                    }
                });
                return false;
            }
            View viewFindContentOrRootView = findContentOrRootView(view);
            if (viewFindContentOrRootView == null) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.k
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$isVisibilityVerified$8(string);
                    }
                });
                return false;
            }
            Rect rect2 = new Rect();
            viewFindContentOrRootView.getGlobalVisibleRect(rect2);
            if (!Rect.intersects(rect, rect2)) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.l
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$isVisibilityVerified$9(string);
                    }
                });
                return false;
            }
            if (!z11) {
                ViewGroup viewGroup = (ViewGroup) view.getRootView();
                ?? r14 = (ViewGroup) view.getParent();
                final int i10 = 0;
                while (r14 != 0) {
                    for (int iIndexOfChild = r14.indexOfChild(view) + 1; iIndexOfChild < r14.getChildCount(); iIndexOfChild++) {
                        final View childAt = r14.getChildAt(iIndexOfChild);
                        if (childAt.getVisibility() == 0) {
                            Rect viewRectangle = Utils.getViewRectangle(childAt);
                            if (Rect.intersects(rect, viewRectangle)) {
                                final float fViewNotOverlappedAreaPercent = viewNotOverlappedAreaPercent(rect, viewRectangle);
                                if (fViewNotOverlappedAreaPercent < f10) {
                                    Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.b
                                        @Override // io.bidmachine.utils.lazy.LazyValue
                                        public final Object get() {
                                            return VisibilityTrackerImpl.lambda$isVisibilityVerified$10(fViewNotOverlappedAreaPercent, f10, string, childAt);
                                        }
                                    });
                                    return false;
                                }
                                i10++;
                                if (i10 >= 3) {
                                    Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.c
                                        @Override // io.bidmachine.utils.lazy.LazyValue
                                        public final Object get() {
                                            return VisibilityTrackerImpl.lambda$isVisibilityVerified$11(i10, string);
                                        }
                                    });
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (r14 != viewGroup) {
                        ?? r10 = r14;
                        r14 = (ViewGroup) r14.getParent();
                        view = r10;
                    } else {
                        r14 = 0;
                    }
                }
            }
            return true;
        } catch (Exception e10) {
            Logger.w(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$10(float f10, float f11, String str, View view) {
        return String.format("Show wasn't tracked: ad view is covered by another view (visible percent - %s / %s, ad view - %s, overlapping view - %s)", Float.valueOf(f10), Float.valueOf(f11), str, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$11(int i10, String str) {
        return String.format("Show wasn't tracked: ad view is covered by too many views (overlapping views count - %s, ad view - %s)", Integer.valueOf(i10), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$2(String str) {
        return String.format("Show wasn't tracked: view visibility verification failed - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$3(String str) {
        return String.format("Show wasn't tracked: view transparent verification failed - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$4(String str) {
        return String.format("Show wasn't tracked: window focus verification failed - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$5(String str) {
        return String.format("Show wasn't tracked: view size verification failed - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$6(String str) {
        return String.format("Show wasn't tracked: global visibility verification failed - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$7(float f10, float f11, String str) {
        return String.format("Show wasn't tracked: ad view not completely visible (%s / %s) - %s", Float.valueOf(f10), Float.valueOf(f11), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$8(String str) {
        return String.format("Show wasn't tracked: content or root layout not found - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVisibilityVerified$9(String str) {
        return String.format("Show wasn't tracked: ad view is out of current window - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$start$0(View view) {
        return String.format("Start tracking - %s", view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$stop$1(View view) {
        return String.format("Stop tracking - %s", view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void forceScheduleChecker() {
        this.isCheckerScheduled.set(false);
        scheduleChecker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleChecker() {
        if (this.isCheckerScheduled.compareAndSet(false, true)) {
            Utils.cancelUiThreadTask(this.checkRunnable);
            Utils.onUiThread(this.checkRunnable, 100L);
        }
    }

    @Nullable
    @VisibleForTesting
    public View getView() {
        return this.weakView.get();
    }

    @Override // io.bidmachine.internal.utils.visibility.VisibilityTracker
    public void start() {
        synchronized (this.lock) {
            if (this.isStarted.compareAndSet(false, true)) {
                final View view = getView();
                if (view == null) {
                    stop();
                } else {
                    Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.d
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            return VisibilityTrackerImpl.lambda$start$0(view);
                        }
                    });
                    view.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
                }
            }
        }
    }

    @Override // io.bidmachine.internal.utils.visibility.VisibilityTracker
    public void stop() {
        synchronized (this.lock) {
            this.isStarted.set(false);
            final View view = getView();
            if (view != null) {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: wf.a
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return VisibilityTrackerImpl.lambda$stop$1(view);
                    }
                });
                long timeThresholdMs = this.visibilityParams.getTimeThresholdMs();
                if (this.isShownTracked && !this.isFinishedTracked && timeThresholdMs > -1 && this.lastShownTimeMs > 0 && System.currentTimeMillis() - this.lastShownTimeMs >= timeThresholdMs) {
                    this.isFinishedTracked = true;
                    this.visibilityTrackerListener.onViewTrackingFinished();
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
                }
            }
            Utils.cancelUiThreadTask(this.checkRunnable);
            Utils.cancelUiThreadTask(this.finishRunnable);
        }
    }

    public VisibilityTrackerImpl(@NonNull View view, @NonNull VisibilityParams visibilityParams, @NonNull VisibilityTrackerListener visibilityTrackerListener) {
        this.weakView = new WeakReference<>(view);
        this.visibilityParams = visibilityParams;
        this.visibilityTrackerListener = visibilityTrackerListener;
        this.preDrawListener = new d();
        this.checkRunnable = new b();
        this.finishRunnable = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean check() {
        View view = getView();
        if (view == null) {
            stop();
            return true;
        }
        if (this.isShownTracked && this.isFinishedTracked) {
            stop();
            return true;
        }
        long timeThresholdMs = this.visibilityParams.getTimeThresholdMs();
        if (isVisibilityVerified(view, this.visibilityParams.getPixelThreshold(), this.visibilityParams.isIgnoreWindowFocus(), this.visibilityParams.isIgnoreOverlap()) && this.visibilityTrackerListener.onViewShown()) {
            this.isShownTracked = true;
            if (!this.isFinishedRequested && !this.isFinishedTracked) {
                Utils.onUiThread(this.finishRunnable, timeThresholdMs);
                this.lastShownTimeMs = System.currentTimeMillis();
                this.isFinishedRequested = true;
            }
        } else if (!this.isFinishedTracked) {
            Utils.cancelUiThreadTask(this.finishRunnable);
            this.lastShownTimeMs = 0L;
            this.isFinishedRequested = false;
        }
        return false;
    }

    @Nullable
    private View findContentOrRootView(@NonNull View view) {
        View view2 = null;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
        }
        return view2;
    }

    private float viewNotOverlappedAreaPercent(@NonNull Rect rect, @NonNull Rect rect2) {
        int iWidth = rect.width() * rect.height();
        if (iWidth == 0) {
            return 0.0f;
        }
        return (iWidth - (Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)))) / iWidth;
    }
}
