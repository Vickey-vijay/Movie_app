package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vpp extends le implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private int ouw;
    private int qbp;
    private int vt;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i10 = this.bly;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = this.tlj;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public final FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    public final void ouw(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        this.qbp = i10;
    }

    public vpp(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list = this.mwh.tlj;
        if (list != null && list.size() > 0) {
            for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list) {
                if (pnoVar2.bly.ouw() == 21) {
                    this.ouw = (int) (this.f11367ra - com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, pnoVar2.f11474le));
                }
                if (pnoVar2.bly.ouw() == 20) {
                    this.vt = (int) (this.f11367ra - com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, pnoVar2.f11474le));
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.qbp == 0) {
            setMeasuredDimension(this.vt, this.pno);
        } else {
            setMeasuredDimension(this.ouw, this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.vt()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.ouw()));
        return true;
    }
}
