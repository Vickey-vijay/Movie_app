package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class bly extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private static ImageView ouw(Context context, float f10, float f11, float f12, float f13) {
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setClickable(true);
        yuVar.setFocusable(true);
        yuVar.setPadding(osn.ouw(context, f12), osn.ouw(context, f13), osn.ouw(context, f12), osn.ouw(context, f13));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(osn.ouw(context, 40.0f), osn.ouw(context, 44.0f));
        if (f10 > 0.0f) {
            layoutParams.leftMargin = osn.ouw(context, f10);
        }
        if (f11 > 0.0f) {
            layoutParams.rightMargin = osn.ouw(context, f11);
        }
        yuVar.setLayoutParams(layoutParams);
        return yuVar;
    }

    public bly(Context context) {
        super(context);
        Context context2 = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.rn.f13433sd);
        setLayoutParams(new ViewGroup.LayoutParams(-1, osn.ouw(context2, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context2);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, osn.ouw(context2, 0.5f)));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context2);
        fkwVar.setOrientation(0);
        addView(fkwVar, new LinearLayout.LayoutParams(-1, osn.ouw(context2, 44.0f)));
        ImageView imageViewOuw = ouw(context2, 16.0f, 0.0f, 14.75f, 12.5f);
        imageViewOuw.setId(com.bytedance.sdk.openadsdk.utils.rn.euf);
        imageViewOuw.setImageResource(vpp.yu(context2, "tt_ad_arrow_backward"));
        fkwVar.addView(imageViewOuw);
        View view2 = new View(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        fkwVar.addView(view2, layoutParams);
        ImageView imageViewOuw2 = ouw(context2, 8.0f, 0.0f, 14.75f, 12.5f);
        imageViewOuw2.setId(com.bytedance.sdk.openadsdk.utils.rn.njr);
        imageViewOuw2.setImageResource(vpp.yu(context2, "tt_ad_arrow_forward"));
        fkwVar.addView(imageViewOuw2);
        View view3 = new View(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        fkwVar.addView(view3, layoutParams2);
        ImageView imageViewOuw3 = ouw(context2, 8.0f, 0.0f, 10.0f, 12.0f);
        imageViewOuw3.setId(com.bytedance.sdk.openadsdk.utils.rn.mq);
        imageViewOuw3.setImageResource(vpp.yu(context2, "tt_ad_refresh"));
        fkwVar.addView(imageViewOuw3);
        View view4 = new View(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        fkwVar.addView(view4, layoutParams3);
        ImageView imageViewOuw4 = ouw(context2, 0.0f, 16.0f, 9.0f, 11.0f);
        imageViewOuw4.setId(com.bytedance.sdk.openadsdk.utils.rn.f13406an);
        imageViewOuw4.setImageResource(vpp.yu(context2, "tt_ad_link"));
        fkwVar.addView(imageViewOuw4);
    }
}
