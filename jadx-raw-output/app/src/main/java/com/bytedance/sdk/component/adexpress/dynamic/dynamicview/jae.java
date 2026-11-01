package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class jae extends le implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    public int ouw;
    private int qbp;
    private boolean vpp;
    public boolean vt;
    private int zin;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.vt) {
            layoutParams.leftMargin = this.bly;
        } else {
            layoutParams.leftMargin = this.bly + this.zin;
        }
        if (this.vpp && this.ryl != null) {
            layoutParams.leftMargin = ((this.bly + this.zin) - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh()))) - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu()));
        }
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            layoutParams.topMargin = this.tlj - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.vt()));
        } else {
            layoutParams.topMargin = this.tlj;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public final FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    public final void ouw(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 && this.vpp != z11) {
            this.vpp = z11;
            fkw();
            return;
        }
        if (z10 && this.vt != z10) {
            this.vt = z10;
            fkw();
        }
        this.vt = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        if (com.bytedance.sdk.component.adexpress.yu.le.ouw(this.f11363jg.getRenderRequest().ouw)) {
            return true;
        }
        super.ra();
        setPadding((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.vt()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.ouw()));
        return true;
    }

    public jae(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.zin = 0;
        setTag(Integer.valueOf(getClickArea()));
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list = this.mwh.tlj;
        if (list != null && list.size() > 0) {
            for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list) {
                if (TextUtils.equals("skip-with-time-skip-btn", pnoVar2.bly.ouw)) {
                    int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, pnoVar2.f11474le + (com.bytedance.sdk.component.adexpress.yu.vt() ? pnoVar2.ouw() : 0));
                    this.qbp = iOuw;
                    this.ouw = this.f11367ra - iOuw;
                    break;
                }
            }
            this.zin = this.f11367ra - this.ouw;
        }
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null && !dynamicRootView.getRenderRequest().f11602tc) {
            View view = this.f11364ko;
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.vpp && this.ryl != null) {
            setMeasuredDimension(this.qbp + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh())) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu())), this.pno);
        } else if (this.vt) {
            setMeasuredDimension(this.f11367ra, this.pno);
        } else {
            setMeasuredDimension(this.ouw, this.pno);
        }
    }
}
