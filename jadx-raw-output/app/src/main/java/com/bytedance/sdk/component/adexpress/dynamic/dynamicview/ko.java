package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class ko extends le {
    public String ouw;
    public com.bytedance.sdk.component.adexpress.dynamic.yu.pno vt;

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

    private com.bytedance.sdk.component.adexpress.le.tlj getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        if (pnoVar == null || pnoVar.bly == null || this.f11362cf == null || TextUtils.isEmpty(this.ouw)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = this.mwh.bly.f11431lh;
        String str = leVar != null ? leVar.wp : "";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.ouw + "static/lotties/" + str + ".json";
        com.bytedance.sdk.component.adexpress.le.tlj tljVar = new com.bytedance.sdk.component.adexpress.le.tlj(this.f11362cf);
        tljVar.setImageLottieTosPath(str2);
        tljVar.yu();
        return tljVar;
    }

    public ko(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, String str) {
        super(context, dynamicRootView, pnoVar);
        this.ouw = str;
        this.vt = pnoVar;
        com.bytedance.sdk.component.adexpress.le.tlj lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }
}
