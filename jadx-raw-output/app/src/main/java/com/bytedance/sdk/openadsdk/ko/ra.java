package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class ra extends tlj {
    public ra(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.ko.tlj, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private ra(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final void ouw(Context context) {
        int iOuw = osn.ouw(context, 10.0f);
        int iOuw2 = osn.ouw(context, 5.0f);
        int iOuw3 = osn.ouw(context, 16.0f);
        int iOuw4 = osn.ouw(context, 15.0f);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        raVar.setLayoutParams(layoutParams);
        addView(raVar);
        com.bytedance.sdk.openadsdk.core.le.lh lhVarFkw = tlj.fkw(context);
        this.ouw = lhVarFkw;
        lhVarFkw.setId(rn.lgp);
        this.ouw.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        raVar.addView(this.ouw);
        com.bytedance.sdk.openadsdk.core.le.yu yuVarLe = tlj.le(context);
        this.vt = yuVarLe;
        yuVarLe.setId(rn.zrz);
        this.vt.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        raVar.addView(this.vt);
        com.bytedance.sdk.openadsdk.core.le.ra raVar2 = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        int i10 = rn.zjp;
        raVar2.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, osn.ouw(context, 60.0f));
        layoutParams2.addRule(12);
        raVar2.setBackgroundColor(Color.parseColor("#26000000"));
        raVar2.setLayoutParams(layoutParams2);
        raVar.addView(raVar2);
        zih zihVarRa = tlj.ra(context);
        this.f13219lh = zihVarRa;
        int i11 = rn.kfa;
        zihVarRa.setId(i11);
        int iOuw5 = osn.ouw(context, 50.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOuw5, iOuw5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = iOuw4;
        layoutParams3.setMarginStart(iOuw4);
        this.f13219lh.setLayoutParams(layoutParams3);
        raVar2.addView(this.f13219lh);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarVt = vt(context);
        this.yu = pnoVarVt;
        pnoVarVt.setId(rn.yiz);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = iOuw2;
        layoutParams4.setMarginStart(iOuw2);
        layoutParams4.addRule(1, i11);
        layoutParams4.addRule(17, i11);
        this.yu.setLayoutParams(layoutParams4);
        raVar2.addView(this.yu);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarYu = yu(context);
        this.f13218le = pnoVarYu;
        pnoVarYu.setId(rn.yw);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(osn.ouw(context, 70.0f), osn.ouw(context, 36.0f));
        layoutParams5.addRule(21);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = iOuw4;
        layoutParams5.setMarginEnd(iOuw4);
        this.f13218le.setLayoutParams(layoutParams5);
        raVar2.addView(this.f13218le);
        View viewPno = tlj.pno(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(2, i10);
        layoutParams6.leftMargin = iOuw3;
        layoutParams6.bottomMargin = iOuw;
        viewPno.setLayoutParams(layoutParams6);
        raVar.addView(viewPno);
    }

    private ra(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final com.bytedance.sdk.openadsdk.core.le.pno vt(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarVt = super.vt(context);
        pnoVarVt.setGravity(16);
        pnoVarVt.setMaxWidth(osn.ouw(context, 150.0f));
        pnoVarVt.setTextColor(Color.parseColor("#B7B7B7"));
        pnoVarVt.setTextSize(2, 15.0f);
        pnoVarVt.setText("APP NAME");
        return pnoVarVt;
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final com.bytedance.sdk.openadsdk.core.le.pno yu(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarYu = super.yu(context);
        pnoVarYu.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_download_corner_bg"));
        pnoVarYu.setTextSize(2, 14.0f);
        return pnoVarYu;
    }
}
