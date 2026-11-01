package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class jg extends com.bytedance.sdk.openadsdk.core.le.ra {
    public jg(Context context) {
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

    private jg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private jg(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iOuw = osn.ouw(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar.setId(rn.f13412fn);
        lhVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        lhVar.setBackgroundColor(0);
        addView(lhVar);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setId(rn.byv);
        yuVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lhVar.addView(yuVar);
        com.bytedance.sdk.openadsdk.core.le.le leVar = new com.bytedance.sdk.openadsdk.core.le.le(context);
        leVar.setId(rn.ehk);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOuw, iOuw);
        layoutParams.gravity = 17;
        leVar.setLayoutParams(layoutParams);
        leVar.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_video_loading_progress_bar"));
        lhVar.addView(leVar);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar2.setId(rn.f13417ki);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        yuVar2.setLayoutParams(layoutParams2);
        yuVar2.setScaleType(ImageView.ScaleType.CENTER);
        yuVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_play_movebar_textpage"));
        yuVar2.setVisibility(8);
        addView(yuVar2);
        View rylVar = new ryl(context);
        rylVar.setId(rn.f13423ln);
        rylVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(rylVar);
    }
}
