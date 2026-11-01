package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class le extends lh {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final rn f12244jg;
    private final com.bytedance.sdk.openadsdk.core.le.fkw mwh;

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh, com.bytedance.sdk.openadsdk.core.le.ra, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.yu getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.pno getAdTitleTextView() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.bly.lh, com.bytedance.sdk.openadsdk.core.le.ra, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public le(Context context, vpp vppVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        this.mwh = fkwVar;
        fkwVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = osn.ouw(context, 24.0f);
        layoutParams.topMargin = osn.ouw(context, 56.0f);
        fkwVar.setLayoutParams(layoutParams);
        fkwVar.setClickable(false);
        fkwVar.setGravity(16);
        fkwVar.setOrientation(0);
        zih zihVar = new zih(context);
        this.f12246le = zihVar;
        zihVar.setId(520093759);
        this.f12246le.setLayoutParams(new LinearLayout.LayoutParams(osn.ouw(context, 24.0f), osn.ouw(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f12248ra = pnoVar;
        pnoVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = osn.ouw(context, 8.0f);
        this.f12248ra.setLayoutParams(layoutParams2);
        this.f12248ra.setEllipsize(TextUtils.TruncateAt.END);
        this.f12248ra.setMaxLines(2);
        this.f12248ra.setTextColor(Color.parseColor("#161823"));
        this.f12248ra.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(osn.ouw(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = osn.ouw(context, 24.0f);
        layoutParams3.rightMargin = osn.ouw(context, 24.0f);
        raVar.setLayoutParams(layoutParams3);
        zih zihVar2 = new zih(context);
        this.bly = zihVar2;
        int i10 = com.bytedance.sdk.openadsdk.utils.rn.jvj;
        zihVar2.setId(i10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(osn.ouw(context, 80.0f), osn.ouw(context, 80.0f));
        layoutParams4.addRule(14);
        this.bly.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.tlj = pnoVar2;
        int i11 = com.bytedance.sdk.openadsdk.utils.rn.ptd;
        pnoVar2.setId(i11);
        this.tlj.setTextSize(24.0f);
        this.tlj.setTextColor(Color.parseColor("#161823"));
        this.tlj.setGravity(17);
        this.tlj.setMaxLines(1);
        this.tlj.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i10);
        layoutParams5.topMargin = osn.ouw(context, 12.0f);
        layoutParams5.addRule(14);
        this.tlj.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f12245cf = pnoVar3;
        int i12 = com.bytedance.sdk.openadsdk.utils.rn.f13410cp;
        pnoVar3.setId(i12);
        this.f12245cf.setTextSize(16.0f);
        this.f12245cf.setTextColor(Color.parseColor("#80161823"));
        this.f12245cf.setGravity(17);
        this.f12245cf.setMaxLines(2);
        this.f12245cf.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i11);
        layoutParams6.topMargin = osn.ouw(context, 4.0f);
        layoutParams6.addRule(14);
        this.f12245cf.setLayoutParams(layoutParams6);
        rn rnVar = new rn(context);
        this.f12244jg = rnVar;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = osn.ouw(context, 12.0f);
        rnVar.setLayoutParams(layoutParams7);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar4 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.fkw = pnoVar4;
        pnoVar4.setId(520093717);
        this.fkw.setBackground(cf.ouw(context, "tt_reward_full_video_backup_btn_bg"));
        this.fkw.setEllipsize(TextUtils.TruncateAt.END);
        this.fkw.setLines(1);
        this.fkw.setGravity(17);
        this.fkw.setTextColor(-1);
        this.fkw.setTextSize(16.0f);
        this.fkw.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, osn.ouw(context, 44.0f));
        layoutParams8.addRule(3, i12);
        layoutParams8.topMargin = osn.ouw(context, 54.0f);
        layoutParams8.addRule(14);
        this.fkw.setLayoutParams(layoutParams8);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, vppVar);
        this.yu = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
        layoutParams9.leftMargin = osn.ouw(context, 16.0f);
        layoutParams9.bottomMargin = osn.ouw(context, 24.0f);
        layoutParams9.addRule(12);
        this.yu.setLayoutParams(layoutParams9);
        addView(this.pno);
        fkwVar.addView(this.f12246le);
        fkwVar.addView(this.f12248ra);
        addView(fkwVar);
        raVar.addView(this.bly);
        raVar.addView(this.tlj);
        raVar.addView(this.f12245cf);
        raVar.addView(rnVar);
        raVar.addView(this.fkw);
        addView(raVar);
        addView(this.yu);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final rn getScoreBar() {
        return this.f12244jg;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final View getUserInfo() {
        return this.mwh;
    }
}
