package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.ksc;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class mwh extends com.bytedance.sdk.openadsdk.core.le.lh {
    private Runnable fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Runnable f12215le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12216lh;
    public ryl ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f12217ra;
    public boolean vt;
    private long yu;

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(int i10) {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(i10);
        }
        if (i10 == 100 && this.vt) {
            vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void lh(int i10) {
        if (this.pno != i10) {
            this.pno = i10;
        }
    }

    public ryl getLoadingStyle() {
        return this.ouw;
    }

    public void setOnlyLoading(boolean z10) {
        this.f12217ra = z10;
    }

    public mwh(@NonNull Context context) {
        super(context);
        this.yu = 10L;
        this.vt = true;
        this.f12217ra = false;
        this.pno = 1;
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lh(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.fkw;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.fkw = null;
        }
    }

    public void ouw() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.1
            @Override // java.lang.Runnable
            public final void run() {
                mwh mwhVar = mwh.this;
                if (mwhVar.ouw != null) {
                    mwhVar.setVisibility(0);
                }
            }
        });
        if (this.fkw == null) {
            this.fkw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.2
                @Override // java.lang.Runnable
                public final void run() {
                    mwh.this.vt();
                }
            };
        }
        postDelayed(this.fkw, this.yu * 1000);
    }

    public final void vt() {
        this.f12216lh = 0;
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            removeView(rylVar.ouw);
            this.ouw.vt();
        }
        setVisibility(8);
        this.ouw = null;
        Runnable runnable = this.fkw;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f12215le;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f12215le = null;
        this.fkw = null;
    }

    public final void ouw(int i10) {
        if (i10 == 100 || Math.abs(i10 - this.f12216lh) >= 7) {
            this.f12216lh = i10;
            if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
                vt(this.f12216lh);
                return;
            }
            if (this.f12215le == null) {
                this.f12215le = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        mwh mwhVar = mwh.this;
                        mwhVar.vt(mwhVar.f12216lh);
                    }
                };
            }
            post(this.f12215le);
        }
    }

    public final void ouw(vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.qbp qbpVar;
        if (vppVar != null && (qbpVar = vppVar.kq) != null) {
            this.yu = qbpVar.ouw;
        }
        ryl rylVar = new ryl(getContext());
        this.ouw = rylVar;
        View viewOuw = rylVar.ouw();
        if (viewOuw.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewOuw.getParent()).removeView(viewOuw);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewOuw.setLayoutParams(layoutParams);
        if (vppVar != null) {
            boolean zZin = vppVar.zin();
            com.bytedance.sdk.openadsdk.core.widget.zih zihVar = this.ouw.f12224lh;
            if (zihVar != null) {
                if (!this.f12217ra && !zZin) {
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = null;
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = vppVar.fak;
                    if (zihVar3 != null && !TextUtils.isEmpty(zihVar3.ouw)) {
                        zihVar2 = vppVar.fak;
                    }
                    if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
                        try {
                            com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(zihVar2.ouw).ouw(zihVar2.vt).vt(zihVar2.f12895lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar2.f12894le)).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, zihVar2.ouw, new ksc(zihVar)));
                        } catch (Throwable unused) {
                            zihVar.setVisibility(8);
                        }
                    } else {
                        zihVar.setVisibility(8);
                    }
                } else {
                    zihVar.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar = this.ouw.yu;
            if (pnoVar != null) {
                if (!this.f12217ra && !zZin) {
                    if (!TextUtils.isEmpty(vppVar.fqk)) {
                        pnoVar.setText(vppVar.fqk);
                    } else {
                        pnoVar.setVisibility(8);
                    }
                } else {
                    pnoVar.setText("Loading");
                }
            }
        }
        addView(viewOuw);
        lh(getResources().getConfiguration().orientation);
    }
}
