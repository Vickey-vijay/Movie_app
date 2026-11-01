package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class lh extends com.bytedance.sdk.openadsdk.core.bly.ouw {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f12455jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private int f12456ko;
    private boolean mwh;
    private float ouw;
    private com.bytedance.sdk.openadsdk.core.lh.fkw qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private int f12457rn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private FrameLayout f12458th;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private View f12459vm;
    private View zih;

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final View getInteractionStyleRootView() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i10, ko koVar) {
    }

    private float getHeightDp() {
        return osn.vt(this.vt, osn.mwh(this.vt));
    }

    private float getWidthDp() {
        return osn.vt(this.vt, osn.jg(this.vt));
    }

    private void lh() {
        this.f12458th = (FrameLayout) this.zih.findViewById(rn.lgp);
        ImageView imageView = (ImageView) this.zih.findViewById(rn.zrz);
        zih zihVar = (zih) this.zih.findViewById(rn.kfa);
        TextView textView = (TextView) this.zih.findViewById(rn.yiz);
        TextView textView2 = (TextView) this.zih.findViewById(rn.yw);
        View viewFindViewById = this.zih.findViewById(520093739);
        if (!TextUtils.isEmpty(this.f12534lh.vpp())) {
            textView2.setText(this.f12534lh.vpp());
        }
        ouw(this.f12458th, imageView);
        com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = this.f12534lh.fak;
        if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.f12534lh;
            com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = vppVar.fak;
            com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar3.ouw, zihVar3.vt, zihVar3.f12895lh, zihVar, vppVar);
        }
        textView.setText(getTitle());
        lh(this.f12458th);
        lh(imageView);
        lh(zihVar);
        lh(textView);
        lh(textView2);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.f12534lh);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lh.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/lh$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_lh$1_onClick_ca4b1e5bce5314cffc878286c98f1ec4(view);
            }

            public void safedk_lh$1_onClick_ca4b1e5bce5314cffc878286c98f1ec4(View p10) {
                try {
                    TTWebsiteActivity.ouw(lh.this.vt, lh.this.f12534lh, lh.this.f12533le);
                } catch (Throwable th2) {
                    qbp.lh("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void vt() {
        com.bytedance.sdk.openadsdk.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.ko.ouw(this.vt);
        this.zih = ouwVar;
        vt(ouwVar);
        lh();
        yu();
    }

    private void yu() {
        TextView textView = (TextView) this.zih.findViewById(rn.ixm);
        if (textView != null) {
            textView.setText(getDescription());
            lh(textView);
        }
    }

    public final FrameLayout getVideoContainer() {
        return this.f12458th;
    }

    public final void ouw(vpp vppVar, float f10, int i10, int i11, int i12) {
        this.ouw = f10;
        this.f12457rn = i10;
        this.f12534lh = vppVar;
        this.f12533le = "fullscreen_interstitial_ad";
        this.f12455jg = i11;
        this.f12456ko = i12;
        ouw(this.bly);
        this.f12535ra = osn.ouw(this.vt, this.f12455jg);
        this.pno = osn.ouw(this.vt, this.f12456ko);
        int i13 = (int) (this.ouw * 1000.0f);
        if (this.f12457rn != 1) {
            if (i13 == 562) {
                View leVar = new com.bytedance.sdk.openadsdk.ko.le(this.vt);
                this.zih = leVar;
                vt(leVar);
                lh();
                yu();
                return;
            }
            if (i13 == 666) {
                View vtVar = new com.bytedance.sdk.openadsdk.ko.vt(this.vt);
                this.zih = vtVar;
                vt(vtVar);
                lh();
                yu();
                return;
            }
            if (i13 == 1000) {
                vt();
                return;
            }
            if (i13 == 1500) {
                View yuVar = new com.bytedance.sdk.openadsdk.ko.yu(this.vt);
                this.zih = yuVar;
                vt(yuVar);
                lh();
                return;
            }
            ouw(1.777f);
            View pnoVar = new com.bytedance.sdk.openadsdk.ko.pno(this.vt);
            this.zih = pnoVar;
            vt(pnoVar);
            lh();
            return;
        }
        if (i13 == 666) {
            View lhVar = new com.bytedance.sdk.openadsdk.ko.lh(this.vt);
            this.zih = lhVar;
            vt(lhVar);
            lh();
            yu();
            return;
        }
        if (i13 == 1000) {
            vt();
            return;
        }
        if (i13 != 1500) {
            if (i13 != 1777) {
                ouw(0.562f);
                View raVar = new com.bytedance.sdk.openadsdk.ko.ra(this.vt);
                this.zih = raVar;
                vt(raVar);
                lh();
                return;
            }
            View blyVar = new com.bytedance.sdk.openadsdk.ko.bly(this.vt);
            this.zih = blyVar;
            vt(blyVar);
            lh();
            yu();
            return;
        }
        View fkwVar = new com.bytedance.sdk.openadsdk.ko.fkw(this.vt);
        this.zih = fkwVar;
        vt(fkwVar);
        this.f12458th = (FrameLayout) this.zih.findViewById(rn.lgp);
        ImageView imageView = (ImageView) this.zih.findViewById(rn.eay);
        TextView textView = (TextView) this.zih.findViewById(rn.wbf);
        View viewFindViewById = this.zih.findViewById(520093739);
        ouw(this.f12458th, imageView);
        textView.setText(getDescription());
        lh(this.f12458th);
        lh(imageView);
        lh(textView);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.f12534lh);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lh.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/lh$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_lh$2_onClick_faa41e11f59d1567e8115a46343f485b(view);
            }

            public void safedk_lh$2_onClick_faa41e11f59d1567e8115a46343f485b(View p10) {
                try {
                    TTWebsiteActivity.ouw(lh.this.vt, lh.this.f12534lh, lh.this.f12533le);
                } catch (Throwable th2) {
                    qbp.lh("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    public final void setDownloadListener(com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar) {
        this.qbp = fkwVar;
    }

    public final void setIsMute(boolean z10) {
        this.mwh = z10;
        View view = this.f12459vm;
        if (view != null && (view instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.le)) {
            ((com.bytedance.sdk.openadsdk.core.mwh.vt.le) view).ouw(z10, "interactionStyle");
        }
    }

    public lh(@NonNull Context context, String str) {
        super(context, str);
        this.f12457rn = 1;
        this.vt = context;
    }

    private void vt(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void lh(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.qbp;
        if (ouwVar == null) {
            Context context = this.vt;
            vpp vppVar = this.f12534lh;
            String str = this.f12533le;
            ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(context, vppVar, str, uoy.ouw(str));
            ouwVar.ouw(ouw(this.f12534lh, this.vt));
        }
        view.setOnTouchListener(ouwVar);
        view.setOnClickListener(ouwVar);
    }

    private void ouw(FrameLayout frameLayout, ImageView imageView) {
        vpp vppVar = this.f12534lh;
        if (vppVar == null) {
            return;
        }
        boolean zFkw = vpp.fkw(vppVar);
        if (this.f12534lh.f12874sd != null && zFkw) {
            osn.ouw((View) imageView, 8);
            osn.ouw((View) frameLayout, 0);
        } else {
            ouw(imageView);
            osn.ouw((View) imageView, 0);
            osn.ouw((View) frameLayout, 8);
        }
    }

    private void ouw(ImageView imageView) {
        List<com.bytedance.sdk.openadsdk.core.model.zih> list;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        vpp vppVar = this.f12534lh;
        if (vppVar == null || (list = vppVar.f12877tc) == null || list.size() <= 0 || (zihVar = list.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f12895lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar.f12894le)).lh(1).vt(com.bytedance.sdk.openadsdk.tlj.lh.ouw(this.f12534lh, zihVar.ouw, imageView));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    private void ouw(float f10) {
        float fMin;
        float fMax;
        int iMax;
        int iMax2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.f12457rn == 2) {
            fMin = Math.max(heightDp, widthDp);
            fMax = Math.min(heightDp, widthDp);
        } else {
            fMin = Math.min(heightDp, widthDp);
            fMax = Math.max(heightDp, widthDp);
        }
        if (this.f12457rn != 2 && osn.lh((Activity) this.vt)) {
            fMax -= osn.vt(this.vt, osn.ouw());
        }
        int i10 = 20;
        int i11 = 0;
        if (this.f12457rn != 2) {
            if (f10 == 0.0f || f10 == 100.0f) {
                iMax2 = 0;
                iMax = 0;
                i10 = 0;
            } else {
                iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f10)) / 2.0f, 0.0f);
                iMax = 20;
                i11 = 20;
                i10 = iMax2;
            }
        } else if (f10 == 0.0f || f10 == 100.0f) {
            iMax2 = 0;
            iMax = 0;
            i10 = 0;
        } else {
            iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f10)) / 2.0f, 0.0f);
            i11 = iMax;
            iMax2 = 20;
        }
        ((Activity) this.vt).getWindow().getDecorView().setPadding(osn.ouw(this.vt, i11), osn.ouw(this.vt, i10), osn.ouw(this.vt, iMax), osn.ouw(this.vt, iMax2));
    }

    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh ouw(vpp vppVar, Context context) {
        if (vppVar != null && vppVar.f12868pd == 4) {
            return new com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt(context, this.f12533le);
        }
        return null;
    }
}
