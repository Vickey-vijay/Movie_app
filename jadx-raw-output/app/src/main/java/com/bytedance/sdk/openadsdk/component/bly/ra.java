package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class ra extends com.bytedance.sdk.openadsdk.core.le.ra {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.le.pno f12250lh;
    private final com.bytedance.sdk.openadsdk.core.le.yu ouw;
    private final com.bytedance.sdk.openadsdk.core.le.yu vt;

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

    public final com.bytedance.sdk.openadsdk.core.le.pno getTopCountDown() {
        return this.f12250lh;
    }

    public final View getTopDislike() {
        return this.ouw;
    }

    public final com.bytedance.sdk.openadsdk.core.le.yu getTopSkip() {
        return this.vt;
    }

    public ra(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iOuw = osn.ouw(context, 12.0f);
        int iOuw2 = osn.ouw(context, 16.0f);
        int iOuw3 = osn.ouw(context, 20.0f);
        int iOuw4 = osn.ouw(context, 24.0f);
        int iOuw5 = osn.ouw(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.ouw = yuVar;
        yuVar.setId(520093713);
        int iOuw6 = osn.ouw(getContext(), 5.0f);
        yuVar.setPadding(iOuw6, iOuw6, iOuw6, iOuw6);
        yuVar.setScaleType(ImageView.ScaleType.CENTER);
        yuVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
        yuVar.setImageResource(vpp.yu(zih.ouw(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOuw5, iOuw5);
        layoutParams.topMargin = iOuw3;
        layoutParams.leftMargin = iOuw2;
        layoutParams.setMarginStart(iOuw2);
        yuVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.vt = yuVar2;
        yuVar2.setId(520093714);
        yuVar2.setPadding(iOuw6, iOuw6, iOuw6, iOuw6);
        yuVar2.setScaleType(ImageView.ScaleType.CENTER);
        yuVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
        yuVar2.setImageResource(vpp.yu(zih.ouw(), "tt_close_btn"));
        if (yuVar2.getDrawable() != null) {
            yuVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOuw5, iOuw5);
        layoutParams2.topMargin = iOuw3;
        layoutParams2.rightMargin = iOuw2;
        layoutParams2.setMarginEnd(iOuw2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        yuVar2.setLayoutParams(layoutParams2);
        yuVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f12250lh = pnoVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iOuw4);
        layoutParams3.topMargin = iOuw3;
        layoutParams3.rightMargin = iOuw2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iOuw2);
        layoutParams3.addRule(21);
        pnoVar.setLayoutParams(layoutParams3);
        pnoVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.vt());
        pnoVar.setGravity(17);
        pnoVar.setPadding(iOuw, 0, iOuw, 0);
        pnoVar.setTextColor(-1);
        pnoVar.setTextSize(1, 14.0f);
        pnoVar.setVisibility(4);
        addView(yuVar);
        addView(pnoVar);
        addView(yuVar2);
    }
}
