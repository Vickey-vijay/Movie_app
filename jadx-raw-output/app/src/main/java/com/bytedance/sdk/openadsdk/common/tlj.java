package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class tlj extends RelativeLayout {
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

    public tlj(Context context) {
        super(context);
        setId(com.bytedance.sdk.openadsdk.utils.rn.myk);
        setBackgroundColor(-1);
        Context context2 = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, osn.ouw(context2, 44.0f)));
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context2);
        int i10 = com.bytedance.sdk.openadsdk.utils.rn.f13424ng;
        yuVar.setId(i10);
        yuVar.setClickable(true);
        yuVar.setFocusable(true);
        yuVar.setPadding(osn.ouw(context2, 12.0f), osn.ouw(context2, 14.0f), osn.ouw(context2, 12.0f), osn.ouw(context2, 14.0f));
        yuVar.setImageResource(vpp.yu(context2, "tt_ad_xmark"));
        addView(yuVar, new RelativeLayout.LayoutParams(osn.ouw(context2, 40.0f), osn.ouw(context2, 44.0f)));
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context2);
        int i11 = com.bytedance.sdk.openadsdk.utils.rn.coz;
        yuVar2.setId(i11);
        yuVar2.setPadding(osn.ouw(context2, 8.0f), osn.ouw(context2, 10.0f), osn.ouw(context2, 8.0f), osn.ouw(context2, 10.0f));
        yuVar2.setImageResource(vpp.yu(context2, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(osn.ouw(context2, 40.0f), osn.ouw(context2, 44.0f));
        layoutParams.addRule(11);
        addView(yuVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context2);
        pnoVar.setId(com.bytedance.sdk.openadsdk.utils.rn.fwd);
        pnoVar.setSingleLine(true);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setGravity(17);
        pnoVar.setTextColor(Color.parseColor("#222222"));
        pnoVar.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(osn.ouw(context2, 191.0f), osn.ouw(context2, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i11);
        layoutParams2.addRule(1, i10);
        int iOuw = osn.ouw(context2, 10.0f);
        layoutParams2.leftMargin = iOuw;
        layoutParams2.rightMargin = iOuw;
        addView(pnoVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.le leVar = new com.bytedance.sdk.openadsdk.core.le.le(context2, null);
        leVar.setId(com.bytedance.sdk.openadsdk.utils.rn.lvd);
        leVar.setProgress(1);
        leVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(context2, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, osn.ouw(context2, 2.0f));
        layoutParams3.addRule(12);
        addView(leVar, layoutParams3);
        View view = new View(context2);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, osn.ouw(context2, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
