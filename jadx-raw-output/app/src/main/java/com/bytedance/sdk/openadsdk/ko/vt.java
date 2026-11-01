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

/* JADX INFO: loaded from: classes11.dex */
public final class vt extends tlj {
    public vt(Context context) {
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

    private vt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final void ouw(Context context) {
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        fkwVar.setOrientation(1);
        addView(fkwVar);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        lhVar.setLayoutParams(layoutParams);
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
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int iOuw = osn.ouw(context, 10.0f);
        layoutParams2.leftMargin = iOuw;
        layoutParams2.topMargin = iOuw;
        layoutParams2.bottomMargin = iOuw;
        viewPno.setLayoutParams(layoutParams2);
        lhVar.addView(viewPno);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        fkwVar2.setLayoutParams(layoutParams3);
        fkwVar2.setOrientation(1);
        fkwVar2.setGravity(81);
        int iOuw2 = osn.ouw(context, 16.0f);
        fkwVar2.setPadding(iOuw2, iOuw2, iOuw2, iOuw2);
        fkwVar.addView(fkwVar2);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setId(rn.mwe);
        raVar.setLayoutParams(new LinearLayout.LayoutParams(-2, osn.ouw(context, 40.0f)));
        raVar.setGravity(17);
        fkwVar2.addView(raVar);
        zih zihVarRa = tlj.ra(context);
        this.f13219lh = zihVarRa;
        zihVarRa.setId(rn.kfa);
        int iOuw3 = osn.ouw(context, 35.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iOuw3, iOuw3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.f13219lh.setLayoutParams(layoutParams4);
        raVar.addView(this.f13219lh);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarVt = vt(context);
        this.yu = pnoVarVt;
        pnoVarVt.setId(rn.yiz);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, iOuw * 2);
        int iOuw4 = osn.ouw(context, 6.0f);
        layoutParams5.leftMargin = iOuw4;
        layoutParams5.setMarginStart(iOuw4);
        layoutParams5.addRule(1, this.f13219lh.getId());
        layoutParams5.addRule(17, this.f13219lh.getId());
        this.yu.setLayoutParams(layoutParams5);
        raVar.addView(this.yu);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarLh = lh(context);
        this.fkw = pnoVarLh;
        pnoVarLh.setId(rn.ixm);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, osn.ouw(context, 20.0f));
        layoutParams6.addRule(3, this.yu.getId());
        layoutParams6.addRule(8, this.f13219lh.getId());
        layoutParams6.addRule(17, this.f13219lh.getId());
        layoutParams6.addRule(1, this.f13219lh.getId());
        layoutParams6.leftMargin = iOuw4;
        layoutParams6.setMarginStart(iOuw4);
        this.fkw.setLayoutParams(layoutParams6);
        raVar.addView(this.fkw);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarYu = yu(context);
        this.f13218le = pnoVarYu;
        pnoVarYu.setId(rn.yw);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, osn.ouw(context, 22.0f));
        layoutParams7.topMargin = iOuw2;
        this.f13218le.setLayoutParams(layoutParams7);
        fkwVar2.addView(this.f13218le);
    }

    private vt(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final com.bytedance.sdk.openadsdk.core.le.pno lh(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarLh = super.lh(context);
        pnoVarLh.setTextColor(-1);
        return pnoVarLh;
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final com.bytedance.sdk.openadsdk.core.le.pno vt(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVarVt = super.vt(context);
        pnoVarVt.setTextColor(-1);
        pnoVarVt.setTextSize(2, 13.0f);
        pnoVarVt.setText("Pangle");
        return pnoVarVt;
    }
}
