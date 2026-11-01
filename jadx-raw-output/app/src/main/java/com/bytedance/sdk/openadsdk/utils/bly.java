package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class bly implements jg, Runnable {
    private long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f13374le;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final ouw f13376ra;
    private final Activity vt;
    private long yu;
    private final AtomicBoolean bly = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Handler f13375lh = new Handler(Looper.getMainLooper());
    private View ouw = yu();

    public interface ouw {
        View ouw();

        void vt();
    }

    private void fkw() {
        this.pno = false;
        this.fkw = SystemClock.elapsedRealtime();
        Handler handler = this.f13375lh;
        if (handler != null) {
            handler.postDelayed(this, this.yu);
        }
    }

    public static jg ouw(Activity activity, ouw ouwVar) {
        int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw("perf_con_close_button_delay_check_time", -1);
        return iOuw < 0 ? new jg() { // from class: com.bytedance.sdk.openadsdk.utils.bly.1
            @Override // com.bytedance.sdk.openadsdk.utils.jg
            public final void lh() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jg
            public final void ouw() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jg
            public final void ouw(long j10) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jg
            public final void vt() {
            }
        } : new bly(activity, Math.min(iOuw, 50) * 1000, ouwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.utils.jg
    public final void vt() {
        if (this.fkw <= 0 || this.f13374le) {
            return;
        }
        if (!this.pno) {
            this.yu -= SystemClock.elapsedRealtime() - this.fkw;
        }
        this.pno = true;
        if (this.yu <= 0) {
            le();
            return;
        }
        Handler handler = this.f13375lh;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
            }
        }
    }

    private void le() {
        Activity activity;
        View childAt;
        if (this.f13374le || (activity = this.vt) == null || activity.isFinishing() || this.vt.isDestroyed()) {
            return;
        }
        if (this.ouw == null) {
            this.ouw = yu();
        }
        View view = this.ouw;
        if (view != null) {
            if (vt(view)) {
                ouw(this.ouw);
                View view2 = this.ouw;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.ouw).getChildAt(0)) != null && vt(childAt)) {
                    ouw(childAt);
                }
                ouw ouwVar = this.f13376ra;
                if (ouwVar != null) {
                    ouwVar.vt();
                }
            }
            ra();
        }
        this.f13374le = true;
    }

    private void ra() {
        ViewParent parent = this.ouw.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(this.ouw) != viewGroup.getChildCount() - 1) {
                this.ouw.bringToFront();
            }
        }
    }

    private View yu() {
        ouw ouwVar = this.f13376ra;
        if (ouwVar != null) {
            return ouwVar.ouw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.jg
    public final void lh() {
        if (this.f13374le) {
            return;
        }
        this.f13374le = true;
        Handler handler = this.f13375lh;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
            }
        }
    }

    private bly(Activity activity, int i10, ouw ouwVar) {
        this.f13376ra = ouwVar;
        this.vt = activity;
        this.yu = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        le();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.jg
    public final void ouw(long j10) {
        if (this.bly.compareAndSet(false, true)) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.yu += j10;
            fkw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.jg
    public final void ouw() {
        if (this.fkw == 0 || !this.pno) {
            return;
        }
        fkw();
    }

    private static void ouw(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private static boolean vt(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
