package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class zin extends ra implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private int[] ouw;
    private int qbp;
    private int vt;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f11367ra, this.pno);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public zin(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f11364ko).getText())) {
            setMeasuredDimension(0, this.pno);
        } else {
            setMeasuredDimension(this.f11367ra, this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    @SuppressLint({"SetTextI18n"})
    public final void ouw(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String strOuw = com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.f11364ko.setVisibility(0);
            ((TextView) this.f11364ko).setText("| ".concat(String.valueOf(strOuw)));
            this.f11364ko.measure(-2, -2);
            this.ouw = new int[]{this.f11364ko.getMeasuredWidth() + 1, this.f11364ko.getMeasuredHeight()};
            View view = this.f11364ko;
            int[] iArr = this.ouw;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.f11364ko).setGravity(17);
            ((TextView) this.f11364ko).setIncludeFontPadding(false);
            this.vt = ((this.pno - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.yu.pno))) / 2) - this.ryl.ouw();
            this.qbp = 0;
            this.f11364ko.setPadding(this.ryl.lh(), this.vt, this.ryl.yu(), this.qbp);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        ((TextView) this.f11364ko).setText("");
        return true;
    }
}
