package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class cf extends RelativeLayout {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public cf(Context context) {
        super(context);
        Context context2 = getContext();
        int iOuw = osn.ouw(context2, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, osn.ouw(context2, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context2);
        yuVar.setId(520093720);
        yuVar.setClickable(true);
        yuVar.setFocusable(true);
        yuVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(context2, "tt_leftbackicon_selector"));
        int iOuw2 = osn.ouw(context2, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOuw2, iOuw2);
        layoutParams.leftMargin = iOuw;
        layoutParams.addRule(15);
        addView(yuVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context2);
        yuVar2.setId(520093716);
        yuVar2.setClickable(true);
        yuVar2.setFocusable(true);
        yuVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(context2, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOuw2, iOuw2);
        layoutParams2.leftMargin = iOuw;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(yuVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar3 = new com.bytedance.sdk.openadsdk.core.le.yu(context2);
        int i10 = com.bytedance.sdk.openadsdk.utils.rn.ycd;
        yuVar3.setId(i10);
        yuVar3.setImageDrawable(vpp.lh(context2, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOuw2, iOuw2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iOuw;
        addView(yuVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context2);
        pnoVar.setId(com.bytedance.sdk.openadsdk.utils.rn.odc);
        pnoVar.setSingleLine(true);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setGravity(17);
        pnoVar.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        pnoVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(osn.ouw(context2, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i10);
        int iOuw3 = osn.ouw(context2, 25.0f);
        layoutParams4.rightMargin = iOuw3;
        layoutParams4.leftMargin = iOuw3;
        addView(pnoVar, layoutParams4);
    }
}
