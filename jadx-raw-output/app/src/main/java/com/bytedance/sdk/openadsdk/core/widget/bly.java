package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class bly extends FrameLayout {
    private TextView bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.pno f13097cf;
    private boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private zih f13098le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13099lh;
    public vpp ouw;
    private rn pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private TextView f13100ra;
    private PAGLogoView tlj;
    public String vt;
    public com.bytedance.sdk.openadsdk.core.lh.ouw yu;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setClickListener(com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        this.yu = ouwVar;
        TextView textView = this.bly;
        if (textView != null) {
            textView.setOnClickListener(ouwVar);
            this.bly.setOnTouchListener(this.yu);
        }
    }

    public bly(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.rn.f13441vi);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        boolean z10;
        FrameLayout.LayoutParams layoutParams;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        super.setVisibility(i10);
        if (i10 == 0 && !this.fkw) {
            this.fkw = true;
            Context context = getContext();
            if (this.ouw.jqy() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
            fkwVar.setGravity(1);
            fkwVar.setOrientation(1);
            if (z10) {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            } else {
                layoutParams = new FrameLayout.LayoutParams(osn.ouw(context, 327.0f), -2);
            }
            layoutParams.gravity = 17;
            int iOuw = osn.ouw(context, 24.0f);
            layoutParams.rightMargin = iOuw;
            layoutParams.leftMargin = iOuw;
            addView(fkwVar, layoutParams);
            zih zihVar2 = new zih(context);
            this.f13098le = zihVar2;
            zihVar2.setBackgroundColor(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(osn.ouw(context, 80.0f), osn.ouw(context, 80.0f));
            layoutParams2.bottomMargin = osn.ouw(context, 12.0f);
            fkwVar.addView(this.f13098le, layoutParams2);
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
            this.f13100ra = pnoVar;
            pnoVar.setEllipsize(TextUtils.TruncateAt.END);
            this.f13100ra.setGravity(17);
            this.f13100ra.setMaxLines(2);
            this.f13100ra.setMaxWidth(osn.ouw(context, 180.0f));
            this.f13100ra.setTextColor(-1);
            this.f13100ra.setTextSize(2, 24.0f);
            fkwVar.addView(this.f13100ra, new LinearLayout.LayoutParams(-1, -2));
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
            this.f13097cf = pnoVar2;
            pnoVar2.setEllipsize(TextUtils.TruncateAt.END);
            this.f13097cf.setGravity(17);
            this.f13097cf.setMaxLines(2);
            this.f13097cf.setTextColor(Color.parseColor("#BFFFFFFF"));
            this.f13097cf.setTextSize(2, 16.0f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = osn.ouw(context, 8.0f);
            fkwVar.addView(this.f13097cf, layoutParams3);
            this.pno = new rn(context, true);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, osn.ouw(context, 16.0f));
            layoutParams4.topMargin = osn.ouw(context, 12.0f);
            this.pno.setVisibility(8);
            fkwVar.addView(this.pno, layoutParams4);
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
            this.bly = pnoVar3;
            pnoVar3.setId(520093707);
            this.bly.setGravity(17);
            this.bly.setText(com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_video_download_apk"));
            this.bly.setTextColor(-1);
            this.bly.setTextSize(2, 16.0f);
            this.bly.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_reward_full_video_backup_btn_bg"));
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, osn.ouw(context, 44.0f));
            layoutParams5.topMargin = osn.ouw(context, 54.0f);
            fkwVar.addView(this.bly, layoutParams5);
            if (!this.f13099lh && this.ouw.an() && od.lh(this.ouw)) {
                this.bly.setVisibility(8);
            }
            this.tlj = PAGLogoView.createPAGLogoViewByMaterial(context, this.ouw);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
            layoutParams6.gravity = BadgeDrawable.BOTTOM_START;
            layoutParams6.leftMargin = osn.ouw(context, 18.0f);
            if (z10) {
                layoutParams6.bottomMargin = osn.ouw(context, 61.0f);
            } else {
                layoutParams6.bottomMargin = osn.ouw(context, 24.0f);
            }
            addView(this.tlj, layoutParams6);
            this.bly.setOnClickListener(this.yu);
            this.bly.setOnTouchListener(this.yu);
            String strVpp = this.ouw.vpp();
            if (!TextUtils.isEmpty(strVpp)) {
                this.bly.setText(strVpp);
            }
            if (this.f13098le != null && (zihVar = this.ouw.fak) != null && !TextUtils.isEmpty(zihVar.ouw)) {
                com.bytedance.sdk.openadsdk.th.vt.ouw();
                vpp vppVar = this.ouw;
                com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, this.f13098le, vppVar);
            }
            rn rnVar = this.pno;
            if (rnVar != null) {
                osn.ouw((TextView) null, rnVar, this.ouw);
                if (this.ouw.wp != null) {
                    this.pno.setVisibility(0);
                }
            }
            if (this.f13100ra != null) {
                com.bytedance.sdk.openadsdk.core.model.le leVar = this.ouw.wp;
                if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
                    this.f13100ra.setText(this.ouw.wp.vt);
                } else if (!TextUtils.isEmpty(this.ouw.f12883vh)) {
                    this.f13100ra.setText(this.ouw.f12883vh);
                } else {
                    this.f13100ra.setVisibility(8);
                }
            }
            if (this.f13097cf != null) {
                String str = this.ouw.fqk;
                if (!TextUtils.isEmpty(str)) {
                    this.f13097cf.setText(str);
                } else {
                    this.f13097cf.setVisibility(8);
                }
            }
            this.tlj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.bly.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/bly$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_bly$1_onClick_9c1b749cd8743a3f2d6e9137972e033f(view);
                }

                public void safedk_bly$1_onClick_9c1b749cd8743a3f2d6e9137972e033f(View p10) {
                    try {
                        View p11 = bly.this;
                        TTWebsiteActivity.ouw(p11.getContext(), bly.this.ouw, bly.this.vt);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
