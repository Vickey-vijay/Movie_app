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
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class cf extends FrameLayout {
    private com.bytedance.sdk.openadsdk.core.le.pno bly;
    private zih fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private TextView f13101le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.lh.ouw f13102lh;
    public vpp ouw;
    private PAGLogoView pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private rn f13103ra;
    public String vt;
    private boolean yu;

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
        this.f13102lh = ouwVar;
    }

    public cf(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.rn.npr);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        boolean z10;
        FrameLayout.LayoutParams layoutParams;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        super.setVisibility(i10);
        if (i10 == 0 && !this.yu) {
            this.yu = true;
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
            this.fkw = zihVar2;
            zihVar2.setBackgroundColor(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(osn.ouw(context, 80.0f), osn.ouw(context, 80.0f));
            layoutParams2.bottomMargin = osn.ouw(context, 12.0f);
            fkwVar.addView(this.fkw, layoutParams2);
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
            this.f13101le = pnoVar;
            pnoVar.setEllipsize(TextUtils.TruncateAt.END);
            this.f13101le.setGravity(17);
            this.f13101le.setMaxLines(2);
            this.f13101le.setMaxWidth(osn.ouw(context, 180.0f));
            this.f13101le.setTextColor(-1);
            this.f13101le.setTextSize(2, 24.0f);
            fkwVar.addView(this.f13101le, new LinearLayout.LayoutParams(-1, -2));
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
            this.bly = pnoVar2;
            pnoVar2.setEllipsize(TextUtils.TruncateAt.END);
            this.bly.setGravity(17);
            this.bly.setMaxLines(2);
            this.bly.setTextColor(Color.parseColor("#BFFFFFFF"));
            this.bly.setTextSize(2, 16.0f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = osn.ouw(context, 8.0f);
            fkwVar.addView(this.bly, layoutParams3);
            this.f13103ra = new rn(context, true);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, osn.ouw(context, 16.0f));
            layoutParams4.topMargin = osn.ouw(context, 12.0f);
            this.f13103ra.setVisibility(8);
            fkwVar.addView(this.f13103ra, layoutParams4);
            this.pno = PAGLogoView.createPAGLogoViewByMaterial(context, this.ouw);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
            layoutParams5.gravity = BadgeDrawable.BOTTOM_START;
            layoutParams5.leftMargin = osn.ouw(context, 18.0f);
            if (z10) {
                layoutParams5.bottomMargin = osn.ouw(context, 61.0f);
            } else {
                layoutParams5.bottomMargin = osn.ouw(context, 24.0f);
            }
            addView(this.pno, layoutParams5);
            if (this.fkw != null && (zihVar = this.ouw.fak) != null && !TextUtils.isEmpty(zihVar.ouw)) {
                com.bytedance.sdk.openadsdk.th.vt.ouw();
                vpp vppVar = this.ouw;
                com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, this.fkw, vppVar);
            }
            rn rnVar = this.f13103ra;
            if (rnVar != null) {
                osn.ouw((TextView) null, rnVar, this.ouw);
                if (this.ouw.wp != null) {
                    this.f13103ra.setVisibility(0);
                }
            }
            if (this.f13101le != null) {
                com.bytedance.sdk.openadsdk.core.model.le leVar = this.ouw.wp;
                if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
                    this.f13101le.setText(this.ouw.wp.vt);
                } else if (!TextUtils.isEmpty(this.ouw.f12883vh)) {
                    this.f13101le.setText(this.ouw.f12883vh);
                } else {
                    this.f13101le.setVisibility(8);
                }
            }
            if (this.bly != null) {
                String str = this.ouw.fqk;
                if (!TextUtils.isEmpty(str)) {
                    this.bly.setText(str);
                } else {
                    this.bly.setVisibility(8);
                }
            }
            this.pno.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.cf.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/cf$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_cf$1_onClick_d06a094826deb380ee8fa681b2be67aa(view);
                }

                public void safedk_cf$1_onClick_d06a094826deb380ee8fa681b2be67aa(View p10) {
                    try {
                        View p11 = cf.this;
                        TTWebsiteActivity.ouw(p11.getContext(), cf.this.ouw, cf.this.vt);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
