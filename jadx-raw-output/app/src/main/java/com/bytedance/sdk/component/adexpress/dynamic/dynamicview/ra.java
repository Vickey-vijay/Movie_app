package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public class ra extends le {
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

    public ra(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.ouw ouwVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ouw(context);
        this.f11364ko = ouwVar;
        ouwVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.f11364ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.yu.vt() && "fillButton".equals(this.mwh.bly.ouw)) {
            ((TextView) this.f11364ko).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.f11364ko).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            int i10 = widgetLayoutParams.width;
            int i11 = this.ryl.yu.f11438gh;
            widgetLayoutParams.width = i10 - (i11 * 2);
            widgetLayoutParams.height -= i11 * 2;
            widgetLayoutParams.topMargin += i11;
            int i12 = widgetLayoutParams.leftMargin + i11;
            widgetLayoutParams.leftMargin = i12;
            widgetLayoutParams.setMarginStart(i12);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public boolean ra() {
        super.ra();
        if (TextUtils.equals("download-progress-button", this.mwh.bly.ouw) && TextUtils.isEmpty(this.ryl.pno())) {
            this.f11364ko.setVisibility(4);
            return true;
        }
        this.f11364ko.setTextAlignment(this.ryl.ra());
        ((TextView) this.f11364ko).setText(this.ryl.pno());
        ((TextView) this.f11364ko).setTextColor(this.ryl.le());
        ((TextView) this.f11364ko).setTextSize(this.ryl.yu.pno);
        ((TextView) this.f11364ko).setGravity(17);
        ((TextView) this.f11364ko).setIncludeFontPadding(false);
        if ("fillButton".equals(this.mwh.bly.ouw)) {
            this.f11364ko.setPadding(0, 0, 0, 0);
        } else {
            this.f11364ko.setPadding(this.ryl.lh(), this.ryl.vt(), this.ryl.yu(), this.ryl.ouw());
        }
        return true;
    }
}
