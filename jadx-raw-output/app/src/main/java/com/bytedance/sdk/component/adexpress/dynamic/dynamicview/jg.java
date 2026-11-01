package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class jg extends le {
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

    public jg(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        ImageView imageView = new ImageView(context);
        this.f11364ko = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            this.pno = Math.max(dynamicRootView.getLogoUnionHeight(), this.pno);
        }
        addView(this.f11364ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.f11363jg;
        if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null && !TextUtils.isEmpty(this.f11363jg.getRenderRequest().ksc)) {
            String str = this.f11363jg.getRenderRequest().ksc;
            if (str.equals("logo")) {
                ((ImageView) this.f11364ko).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.fkw.tlj tljVarFkw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu.ouw(str).ouw(this.f11367ra).vt(this.pno).yu(this.f11367ra).fkw(this.pno);
                String str2 = this.f11363jg.getRenderRequest().tlj;
                if (!TextUtils.isEmpty(str2)) {
                    tljVarFkw.vt(str2);
                }
                tljVarFkw.ouw((ImageView) this.f11364ko);
            }
        } else {
            setVisibility(8);
        }
        ((ImageView) this.f11364ko).setColorFilter(this.ryl.le(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
