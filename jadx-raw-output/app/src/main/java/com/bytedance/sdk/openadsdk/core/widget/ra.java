package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.ksc;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class ra extends com.bytedance.sdk.openadsdk.core.le.ra {
    private boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f13143le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private pno f13144lh;
    private zih ouw;
    private com.bytedance.sdk.openadsdk.core.le.pno vt;
    private com.bytedance.sdk.openadsdk.core.le.pno yu;

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

    public boolean ouw() {
        return true;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.le.pno getDownloadButton() {
        return this.yu;
    }

    @Nullable
    public pno getLoadingProgressBar() {
        return this.f13144lh;
    }

    public final void ouw(vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        if (!this.fkw || vppVar == null || this.f13143le) {
            return;
        }
        this.f13143le = true;
        boolean zZin = vppVar.zin();
        if (zZin || (zihVar = vppVar.fak) == null || TextUtils.isEmpty(zihVar.ouw)) {
            this.ouw.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = vppVar.fak;
                com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(zihVar2.ouw).ouw(zihVar2.vt).vt(zihVar2.f12895lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar2.f12894le)).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, vppVar.fak.ouw, new ksc(this.ouw)));
            } catch (Throwable unused) {
                this.ouw.setVisibility(8);
            }
        }
        if (zZin) {
            this.vt.setText("Loading");
        } else if (TextUtils.isEmpty(vppVar.fqk)) {
            this.vt.setVisibility(8);
        } else {
            this.vt.setText(vppVar.fqk);
        }
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = this.yu;
        if (pnoVar != null) {
            pnoVar.setText(vppVar.vpp());
        }
    }

    public void setProgress(int i10) {
        pno pnoVar = this.f13144lh;
        if (pnoVar != null) {
            pnoVar.setProgress(i10);
        }
    }

    public final void vt() {
        if (this.fkw) {
            return;
        }
        this.fkw = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        zih zihVar = new zih(context);
        this.ouw = zihVar;
        zihVar.setId(520093745);
        int iOuw = osn.ouw(context, 64.0f);
        this.ouw.setLayoutParams(new RelativeLayout.LayoutParams(iOuw, iOuw));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.vt = pnoVar;
        pnoVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(osn.ouw(context, 219.0f), -2);
        layoutParams2.topMargin = osn.ouw(context, 16.0f);
        this.vt.setLayoutParams(layoutParams2);
        this.vt.setEllipsize(TextUtils.TruncateAt.END);
        this.vt.setGravity(17);
        this.vt.setMaxWidth(osn.ouw(context, 150.0f));
        this.vt.setMaxLines(2);
        this.vt.setTextColor(-1);
        this.vt.setTextSize(1, 16.0f);
        pno pnoVar2 = new pno(context);
        this.f13144lh = pnoVar2;
        pnoVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(osn.ouw(context, 219.0f), osn.ouw(context, 6.0f));
        layoutParams3.topMargin = osn.ouw(context, 24.0f);
        this.f13144lh.setLayoutParams(layoutParams3);
        this.yu = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(osn.ouw(context, 138.0f), osn.ouw(context, 42.0f));
        layoutParams4.topMargin = osn.ouw(context, 48.0f);
        this.yu.setLayoutParams(layoutParams4);
        this.yu.setTextColor(-1);
        this.yu.setTextSize(16.0f);
        this.yu.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.yu.setBackground(gradientDrawable);
        linearLayout.addView(this.ouw);
        linearLayout.addView(this.vt);
        linearLayout.addView(this.f13144lh);
        linearLayout.addView(this.yu);
        addView(linearLayout);
    }

    public ra(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (ouw()) {
            vt();
        }
    }
}
