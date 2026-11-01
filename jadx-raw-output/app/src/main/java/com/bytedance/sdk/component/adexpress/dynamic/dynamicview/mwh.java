package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class mwh extends le {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        com.bytedance.sdk.component.adexpress.vt.mwh renderRequest = this.f11363jg.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.ksc)) {
            super.fkw();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f11367ra, this.pno);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    public mwh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        TextView textView = new TextView(context);
        this.f11364ko = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.f11364ko, getWidgetLayoutParams());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0081  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        com.bytedance.sdk.component.adexpress.vt.mwh renderRequest;
        super.ra();
        this.f11364ko.setTextAlignment(this.ryl.ra());
        ((TextView) this.f11364ko).setTextColor(this.ryl.le());
        ((TextView) this.f11364ko).setTextSize(this.ryl.yu.pno);
        int i10 = 0;
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            ((TextView) this.f11364ko).setIncludeFontPadding(false);
            ((TextView) this.f11364ko).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), this.pno) - this.ryl.vt()) - this.ryl.ouw()) - 0.5f, this.ryl.yu.pno));
            DynamicRootView dynamicRootView = this.f11363jg;
            if (dynamicRootView != null && (renderRequest = dynamicRootView.getRenderRequest()) != null) {
                String str = renderRequest.jae;
                if (!TextUtils.isEmpty(str)) {
                    ((TextView) this.f11364ko).setText(str);
                } else {
                    i10 = 8;
                }
            } else {
                i10 = 8;
            }
            ((TextView) this.f11364ko).setVisibility(i10);
        } else {
            if (!com.bytedance.sdk.component.adexpress.yu.vt() && ((!TextUtils.isEmpty(this.ryl.vt) && this.ryl.vt.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.vt())) {
                i10 = 1;
            }
            if (i10 != 0) {
                if (com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.vt()) {
                    ((TextView) this.f11364ko).setText(com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw());
                } else {
                    ((TextView) this.f11364ko).setText(com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(this.ryl.vt));
                }
            } else {
                ((TextView) this.f11364ko).setText(com.bytedance.sdk.component.utils.vpp.vt(getContext(), "tt_logo_cn"));
            }
        }
        return true;
    }
}
