package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class ra extends View implements com.bytedance.sdk.component.utils.jae.ouw {
    private final Handler bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f12979cf;
    private ouw fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Runnable f12980jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private View f12981le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f12982lh;
    private boolean mwh;
    public List<View> ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f12983ra;
    private boolean ryl;
    private final AtomicBoolean tlj;

    @Nullable
    public List<View> vt;
    private boolean yu;

    public interface ouw {
        void ouw();

        void ouw(View view);

        void ouw(boolean z10);

        void vt();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lh() {
        if (!this.yu || this.f12982lh) {
            return;
        }
        this.f12982lh = true;
        this.bly.sendEmptyMessage(1);
    }

    private void vt() {
        ouw ouwVar;
        if (this.tlj.getAndSet(true) || (ouwVar = this.fkw) == null) {
            return;
        }
        ouwVar.vt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yu() {
        if (this.f12982lh) {
            this.bly.removeCallbacksAndMessages(null);
            this.f12982lh = false;
        }
    }

    public final void setAdType(int i10) {
        this.pno = i10;
    }

    public final void setCallback(ouw ouwVar) {
        this.fkw = ouwVar;
    }

    public final void setNeedCheckingShow(boolean z10) {
        this.yu = z10;
        if (!z10 && this.f12982lh) {
            yu();
        } else {
            if (!z10 || this.f12982lh) {
                return;
            }
            lh();
        }
    }

    public final void setRefClickViews(List<View> list) {
        this.ouw = list;
    }

    public final void setRefCreativeViews(@Nullable List<View> list) {
        this.vt = list;
    }

    public ra(View view, boolean z10) {
        super(zih.ouw());
        this.bly = new com.bytedance.sdk.component.utils.jae(jg.vt().getLooper(), this);
        this.tlj = new AtomicBoolean(true);
        this.mwh = false;
        this.f12980jg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ra.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ra.this.fkw != null) {
                    ra.this.fkw.ouw(ra.this.f12981le);
                }
            }
        };
        this.ryl = z10;
        this.f12981le = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.f12979cf = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.ra.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (ra.this.mwh) {
                    return;
                }
                ra.this.yu();
                ra.this.lh();
            }
        };
    }

    private void ouw() {
        ouw ouwVar;
        if (!this.tlj.getAndSet(false) || (ouwVar = this.fkw) == null) {
            return;
        }
        ouwVar.ouw();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12983ra = false;
        ouw();
        if (this.f12979cf != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f12979cf);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu();
        this.f12983ra = true;
        vt();
        ouw(false);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        ouw();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        vt();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        ouw ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.ouw(z10);
        }
    }

    public static void ouw(List<View> list, com.bytedance.sdk.openadsdk.core.lh.lh lhVar) {
        if (com.bytedance.sdk.component.utils.mwh.ouw(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(lhVar);
                    view.setOnTouchListener(lhVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1 && this.f12982lh) {
            View view = this.f12981le;
            if ((view instanceof com.bytedance.sdk.openadsdk.core.bly.qbp ? ((com.bytedance.sdk.openadsdk.core.bly.qbp) view).uq.get() : true) && fak.ouw(this.f12981le, 20, this.pno, this.ryl)) {
                yu();
                this.mwh = true;
                jg.lh().post(this.f12980jg);
                ouw(true);
                return;
            }
            this.bly.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void ouw(final boolean z10) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ra.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver viewTreeObserver2;
                if (ra.this.f12979cf != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(ra.this.f12979cf);
                    } catch (Exception unused) {
                    }
                }
                if (z10) {
                    ra.this.f12979cf = null;
                }
            }
        });
    }
}
