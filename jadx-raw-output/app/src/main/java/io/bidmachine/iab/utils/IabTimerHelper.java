package io.bidmachine.iab.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class IabTimerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f59391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimerHelperCallback f59392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f59393c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f59394d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f59395e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f59396f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f59397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f59398h;

    public interface TimerHelperCallback {
        void onTimerFinish();

        void onTimerTick(float f10, long j10, long j11);
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IabTimerHelper.this.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jMin = IabTimerHelper.this.f59396f;
            if (IabTimerHelper.this.f59391a.isShown()) {
                jMin = Math.min(IabTimerHelper.this.f59395e, jMin + 16);
                IabTimerHelper.this.a(jMin);
                IabTimerHelper.this.f59392b.onTimerTick((IabTimerHelper.this.f59396f * 100.0f) / IabTimerHelper.this.f59395e, IabTimerHelper.this.f59396f, IabTimerHelper.this.f59395e);
            }
            if (jMin >= IabTimerHelper.this.f59395e) {
                IabTimerHelper.this.f59392b.onTimerFinish();
            } else {
                IabTimerHelper.this.f59391a.postDelayed(this, 16L);
            }
        }
    }

    public IabTimerHelper(@NonNull View view, @NonNull TimerHelperCallback timerHelperCallback) {
        a aVar = new a();
        this.f59397g = aVar;
        this.f59398h = new b();
        this.f59391a = view;
        this.f59392b = timerHelperCallback;
        view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        a();
    }

    public void detach() {
        stop();
        this.f59391a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f59397g);
    }

    public boolean isTicking() {
        long j10 = this.f59395e;
        return j10 != 0 && this.f59396f < j10;
    }

    public void setTime(float f10) {
        if (this.f59394d == f10) {
            return;
        }
        this.f59394d = f10;
        this.f59395e = (long) (f10 * 1000.0f);
        start();
    }

    public void start() {
        if (!this.f59391a.isShown() || this.f59395e == 0) {
            return;
        }
        this.f59391a.postDelayed(this.f59398h, 16L);
    }

    public void stop() {
        this.f59391a.removeCallbacks(this.f59398h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        this.f59396f = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        boolean zIsShown = this.f59391a.isShown();
        if (this.f59393c == zIsShown) {
            return;
        }
        this.f59393c = zIsShown;
        if (!zIsShown) {
            stop();
        } else if (isTicking()) {
            start();
        }
    }
}
