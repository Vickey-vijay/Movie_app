package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class zih extends ouw {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private FrameLayout f12575jg;
    private qbp mwh;
    private FrameLayout ouw;

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, qbp qbpVar, ViewGroup viewGroup) {
        com.bytedance.sdk.component.utils.ko.vt("FullRewardExpressBackupView", "show backup view");
        if (vppVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.f12534lh = vppVar;
        this.mwh = qbpVar;
        if (vppVar.uoy() == 7) {
            this.f12533le = "rewarded_video";
        } else {
            this.f12533le = "fullscreen_interstitial_ad";
        }
        this.f12535ra = osn.ouw(this.vt, this.mwh.getExpectExpressWidth());
        this.pno = osn.ouw(this.vt, this.mwh.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f12535ra, this.pno);
        }
        layoutParams.width = this.f12535ra;
        layoutParams.height = this.pno;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.f12534lh.zih();
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this.vt);
        this.ouw = lhVar;
        addView(lhVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(this.vt);
        this.f12575jg = lhVar2;
        this.ouw.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
        this.f12575jg.removeAllViews();
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(vppVar)) {
            this.mwh.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            this.mwh.addView(this, layoutParams2);
        }
        int i10 = com.bytedance.sdk.openadsdk.utils.rn.bu;
        View viewFindViewById = viewGroup.findViewById(i10);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i10);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.th.vt.ouw().ouw(str, viewFindViewById);
            }
        }
    }

    public final View getBackupContainerBackgroundView() {
        return this.ouw;
    }

    public final FrameLayout getVideoContainer() {
        return this.f12575jg;
    }

    public zih(@NonNull Context context) {
        super(context);
        this.vt = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i10, com.bytedance.sdk.openadsdk.core.model.ko koVar) {
        qbp qbpVar = this.mwh;
        if (qbpVar != null) {
            qbpVar.ouw(view, i10, koVar);
        }
    }
}
