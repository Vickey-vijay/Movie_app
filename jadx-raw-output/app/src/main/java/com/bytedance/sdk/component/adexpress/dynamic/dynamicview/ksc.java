package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ksc extends ra implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private boolean ouw;
    private boolean qbp;
    private boolean vt;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.mwh.bly.ouw) && !TextUtils.equals("skip-with-time-countdown", this.mwh.bly.ouw)) {
            super.fkw();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f11367ra, this.pno);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            layoutParams.leftMargin = this.bly;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    public final void ouw(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 || this.qbp) {
            ((TextView) this.f11364ko).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z10 && this.f11363jg.getRenderRequest().f11604vm && com.bytedance.sdk.component.adexpress.yu.le.ouw(this.f11363jg.getRenderRequest().ouw)) {
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                ((TextView) this.f11364ko).setText(i10 + "s");
            } else {
                ((TextView) this.f11364ko).setText(String.format(com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_full_skip"), Integer.valueOf(i10)));
            }
            this.ouw = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.yu.vt() && !"open_ad".equals(this.f11363jg.getRenderRequest().ouw) && this.f11363jg.getRenderRequest().f11604vm) {
            this.qbp = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.mwh.bly.ouw)) {
            ((TextView) this.f11364ko).setText(charSequence);
            return;
        }
        ((TextView) this.f11364ko).setText(((Object) charSequence) + "s");
        this.vt = true;
        if (this.ouw) {
            CharSequence text = ((TextView) this.f11364ko).getText();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(text != null ? text.toString() : "", this.ryl.yu.pno, true)[0] + com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh() + this.ryl.yu())), this.pno);
            layoutParams.gravity = 8388629;
            this.f11364ko.setLayoutParams(layoutParams);
            this.ouw = false;
            requestLayout();
        }
    }

    public ksc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(pnoVar.bly.ouw)) {
            dynamicRootView.setTimedown(this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f11364ko).getText())) {
            setMeasuredDimension(0, this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.le.ouw(this.f11363jg.getRenderRequest().ouw)) {
            setVisibility(8);
        }
        if ("timedown".equals(this.mwh.bly.ouw)) {
            ((TextView) this.f11364ko).setText(String.valueOf((int) Double.parseDouble(this.ryl.pno())));
            return true;
        }
        ((TextView) this.f11364ko).setText(((int) Double.parseDouble(this.ryl.pno())) + "s");
        return true;
    }
}
