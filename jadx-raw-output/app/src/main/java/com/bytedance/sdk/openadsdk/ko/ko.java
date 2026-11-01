package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class ko extends com.bytedance.sdk.openadsdk.core.le.ra {
    public ko(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.ra, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.ra, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private ko(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ko(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
        setId(rn.hsa);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        int i10 = rn.f13405ak;
        pnoVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        pnoVar.setLayoutParams(layoutParams);
        pnoVar.setIncludeFontPadding(false);
        pnoVar.setText(vpp.ouw(context, "tt_video_without_wifi_tips"));
        pnoVar.setTextColor(Color.parseColor("#cacaca"));
        pnoVar.setTextSize(2, 14.0f);
        addView(pnoVar);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setId(rn.f13431rh);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        raVar.setLayoutParams(layoutParams2);
        addView(raVar);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setId(rn.vrp);
        int iOuw = osn.ouw(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOuw, iOuw);
        layoutParams3.addRule(15);
        yuVar.setLayoutParams(layoutParams3);
        yuVar.setImageDrawable(vpp.lh(context, "tt_new_play_video"));
        yuVar.setScaleType(ImageView.ScaleType.FIT_XY);
        raVar.addView(yuVar);
    }
}
