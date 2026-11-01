package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class yu extends tlj {
    public yu(Context context) {
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

    private yu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final void ouw(Context context) {
        int iOuw = osn.ouw(context, 10.0f);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        fkwVar.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        fkwVar.setOrientation(1);
        fkwVar.setPadding(iOuw, iOuw, iOuw, iOuw);
        addView(fkwVar);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        lhVar.setLayoutParams(layoutParams2);
        fkwVar.addView(lhVar);
        com.bytedance.sdk.openadsdk.core.le.lh lhVarFkw = tlj.fkw(context);
        this.ouw = lhVarFkw;
        lhVarFkw.setId(rn.lgp);
        this.ouw.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lhVar.addView(this.ouw);
        com.bytedance.sdk.openadsdk.core.le.yu yuVarLe = tlj.le(context);
        this.vt = yuVarLe;
        yuVarLe.setId(rn.zrz);
        this.vt.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lhVar.addView(this.vt);
        View viewPno = tlj.pno(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = iOuw;
        layoutParams3.topMargin = iOuw;
        layoutParams3.bottomMargin = iOuw;
        viewPno.setLayoutParams(layoutParams3);
        lhVar.addView(viewPno);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        raVar.setLayoutParams(layoutParams4);
        fkwVar.addView(raVar);
        zih zihVarRa = tlj.ra(context);
        this.f13219lh = zihVarRa;
        int i10 = rn.kfa;
        zihVarRa.setId(i10);
        int iOuw2 = osn.ouw(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iOuw2, iOuw2);
        layoutParams5.addRule(15);
        this.f13219lh.setLayoutParams(layoutParams5);
        raVar.addView(this.f13219lh);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarVt = vt(context);
        this.yu = pnoVarVt;
        pnoVarVt.setId(rn.yiz);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.leftMargin = iOuw;
        layoutParams6.setMarginStart(iOuw);
        layoutParams6.addRule(1, i10);
        layoutParams6.addRule(17, i10);
        this.yu.setLayoutParams(layoutParams6);
        raVar.addView(this.yu);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarYu = yu(context);
        this.f13218le = pnoVarYu;
        pnoVarYu.setId(rn.yw);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(osn.ouw(context, 100.0f), osn.ouw(context, 32.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(21);
        layoutParams7.addRule(15);
        this.f13218le.setLayoutParams(layoutParams7);
        raVar.addView(this.f13218le);
    }

    private yu(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
    }
}
