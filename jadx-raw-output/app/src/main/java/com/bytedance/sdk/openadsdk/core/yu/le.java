package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public final class le extends com.bytedance.adsdk.ugeno.le.ouw<View> implements jae.ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Handler f13172cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f13173jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private vt f13174ko;
    private boolean mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private ouw f13175rn;
    private long ryl;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f13176vm;
    private final Runnable zih;

    public interface ouw {
        void ouw(boolean z10);
    }

    public interface vt {
        void ouw(boolean z10);
    }

    @Override // com.bytedance.adsdk.ugeno.le.ouw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.le.ouw
    public final View pno(int i10) {
        return (View) this.ouw.get(i10);
    }

    public final void setSwiperVisibleChangeListener(ouw ouwVar) {
        this.f13175rn = ouwVar;
    }

    public final void setSwiperWindowFocusChangedListener(vt vtVar) {
        this.f13174ko = vtVar;
    }

    public le(Context context) {
        super(context);
        this.f13172cf = new jae(jg.vt().getLooper(), this);
        this.mwh = true;
        this.f13173jg = true;
        this.zih = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yu.le.1
            @Override // java.lang.Runnable
            public final void run() {
                if (le.this.f13175rn != null) {
                    le.this.f13175rn.ouw(le.this.f13173jg);
                }
            }
        };
        this.f13176vm = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.le.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - le.this.ryl > 500) {
                    le.this.ryl = jElapsedRealtime;
                    le.this.f13172cf.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f13176vm);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f13176vm);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        vt vtVar = this.f13174ko;
        if (vtVar != null) {
            vtVar.ouw(z10);
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1) {
            boolean zOuw = fak.ouw(this, 50, -1, false);
            this.f13173jg = zOuw;
            if (zOuw != this.mwh) {
                this.mwh = zOuw;
                bs.ouw(this.zih);
            }
        }
    }
}
