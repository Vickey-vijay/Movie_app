package com.bytedance.sdk.openadsdk.component;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.bly.pno;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class lh {
    public final int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public FrameLayout f12284cf;

    @NonNull
    private final pno ex = new pno();
    public final vpp fkw;
    private rn jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.pno f12285jg;
    private float jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.component.pno.ouw f12286ko;
    private com.bytedance.sdk.openadsdk.core.le.yu ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final boolean f12287le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private PAGLogoView f12288lh;
    public com.bytedance.sdk.openadsdk.core.le.yu mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private View f12289od;
    private RelativeLayout ouw;
    public final com.bytedance.sdk.openadsdk.component.ouw pno;
    private com.bytedance.sdk.openadsdk.core.le.pno qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final FrameLayout f12290ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.pno.lh f12291rn;
    public View ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.pno f12292tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private zih f12293th;
    public int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private ImageView f12294vm;
    private float vpp;
    private ImageView vt;
    public final Activity yu;
    private com.bytedance.sdk.openadsdk.core.le.pno zih;
    private com.bytedance.sdk.openadsdk.core.le.pno zin;

    public static class ouw implements le.lh {
        public WeakReference<Activity> ouw;
        private final WeakReference<lh> vt;

        @Override // com.bytedance.sdk.openadsdk.component.le.lh
        public final void ouw(Object obj) {
            lh lhVar;
            if (this.ouw.get() == null || this.ouw.get().isFinishing() || (lhVar = this.vt.get()) == null) {
                return;
            }
            lh.ouw(lhVar, obj);
        }

        public ouw(Activity activity, lh lhVar) {
            this.ouw = new WeakReference<>(activity);
            this.vt = new WeakReference<>(lhVar);
        }
    }

    public void fkw() {
    }

    public JSONObject ouw(JSONObject jSONObject) {
        return null;
    }

    public void ouw(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        com.bytedance.sdk.openadsdk.component.bly.lh yuVar = new com.bytedance.sdk.openadsdk.component.bly.yu(this.yu, this.fkw);
        int iJg = this.fkw.jg();
        ko.vt("AppOpenAdNativeManager", "attachExpressView: splashLayoutId=".concat(String.valueOf(iJg)));
        if (iJg == 5) {
            yuVar = new com.bytedance.sdk.openadsdk.component.bly.le(this.yu, this.fkw);
        } else if (iJg == 4) {
            yuVar = new com.bytedance.sdk.openadsdk.component.bly.fkw(this.yu, this.fkw);
        }
        this.ouw = yuVar;
        viewGroup.addView(yuVar);
        this.f12294vm = yuVar.getBackImage();
        this.f12284cf = yuVar.getVideoContainer();
        this.vt = yuVar.getImageView();
        this.zih = yuVar.getClickButton();
        this.f12288lh = yuVar.getAdLogo();
        this.f12292tc = yuVar.getAdTitleTextView();
        this.ksc = yuVar.getAdIconView();
        this.jae = yuVar.getScoreBar();
        this.f12289od = yuVar.getOverlayLayout();
        if (this.fkw.ra()) {
            this.f12293th = yuVar.getIconOnlyView();
            this.qbp = yuVar.getTitle();
            this.zin = yuVar.getContent();
        }
        if (yuVar.getDspAdChoice() != null) {
            com.bytedance.sdk.openadsdk.core.widget.lh dspAdChoice = yuVar.getDspAdChoice();
            vpp vppVar = this.fkw;
            if (vppVar.cd() || (vppVar.pd() && vppVar.le())) {
                osn.ouw((View) dspAdChoice, 0);
                com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(dspAdChoice.getContext(), 14.0f, true), dspAdChoice, vppVar);
            }
        }
        if (!this.fkw.pd()) {
            pno pnoVar = this.ex;
            vpp vppVar2 = this.fkw;
            pnoVar.f12249lh = yuVar.getHostAppIcon();
            pnoVar.yu = yuVar.getHostAppName();
            View userInfo = yuVar.getUserInfo();
            if (yuVar instanceof com.bytedance.sdk.openadsdk.component.bly.yu) {
                zih zihVar = pnoVar.f12249lh;
                if (zihVar != null && (layoutParams2 = zihVar.getLayoutParams()) != null) {
                    if (vppVar2.jqy() == 1) {
                        int iOuw = osn.ouw(pnoVar.f12249lh.getContext(), 40.0f);
                        layoutParams2.width = iOuw;
                        layoutParams2.height = iOuw;
                    } else {
                        int iOuw2 = osn.ouw(pnoVar.f12249lh.getContext(), 30.0f);
                        layoutParams2.width = iOuw2;
                        layoutParams2.height = iOuw2;
                    }
                    pnoVar.f12249lh.setLayoutParams(layoutParams2);
                }
                if (pnoVar.yu != null) {
                    if (vppVar2.jqy() == 1) {
                        pnoVar.yu.setTextSize(30.0f);
                    } else {
                        pnoVar.yu.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (vppVar2.jqy() == 1) {
                        layoutParams.height = osn.ouw(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = osn.ouw(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.bly.pno.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/bly/pno$1;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view);
                        safedk_pno$1_onClick_1c2f8f50fd7694f1036310fd88926746(view);
                    }

                    public void safedk_pno$1_onClick_1c2f8f50fd7694f1036310fd88926746(View p10) {
                    }

                    public AnonymousClass1() {
                    }
                });
            }
        }
        this.ryl = yuVar.getTopDisLike();
        this.mwh = yuVar.getTopSkip();
        this.f12285jg = yuVar.getTopCountDown();
        if (yuVar instanceof com.bytedance.sdk.openadsdk.component.bly.fkw) {
            ((com.bytedance.sdk.openadsdk.component.bly.fkw) yuVar).setRenderListener(new com.bytedance.sdk.openadsdk.component.bly.fkw.ouw() { // from class: com.bytedance.sdk.openadsdk.component.lh.1
                @Override // com.bytedance.sdk.openadsdk.component.bly.fkw.ouw
                public final void ouw() {
                    lh.this.pno.ra();
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x019c  */
    public void vt() {
        Window window;
        boolean z10;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        if (this.fkw.pd()) {
            this.pno.fkw();
        } else {
            pno pnoVar = this.ex;
            String strPno = bly.ouw().pno();
            if (TextUtils.isEmpty(strPno)) {
                pnoVar.yu.setVisibility(8);
            } else {
                pnoVar.yu.setText(strPno);
            }
            boolean z11 = true;
            if (!pno.ouw) {
                try {
                    int iBly = bly.ouw().bly();
                    if (iBly != 0) {
                        pno.vt = com.bytedance.sdk.openadsdk.core.zih.ouw().getResources().getDrawable(iBly);
                    }
                } catch (Throwable unused) {
                }
                pno.ouw = true;
            }
            try {
                Drawable drawable = pno.vt;
                if (drawable == null) {
                    pnoVar.f12249lh.setVisibility(8);
                } else {
                    pnoVar.f12249lh.setImageDrawable(drawable);
                    if (pnoVar.yu.getVisibility() == 8) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pnoVar.f12249lh.getLayoutParams();
                        marginLayoutParams.setMargins(0, 0, 0, 0);
                        pnoVar.f12249lh.setLayoutParams(marginLayoutParams);
                    }
                }
            } catch (Throwable unused2) {
                pnoVar.f12249lh.setVisibility(8);
            }
            this.zih.setText(this.fkw.vpp());
            if (this.fkw.ra()) {
                if (this.qbp != null) {
                    com.bytedance.sdk.openadsdk.core.model.le leVar = this.fkw.wp;
                    if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
                        this.qbp.setText(this.fkw.wp.vt);
                    } else if (TextUtils.isEmpty(this.fkw.f12883vh)) {
                        this.qbp.setVisibility(8);
                    } else {
                        this.qbp.setText(this.fkw.f12883vh);
                    }
                }
                if (this.zin != null) {
                    if (TextUtils.isEmpty(this.fkw.fqk)) {
                        this.zin.setVisibility(8);
                    } else {
                        this.zin.setText(this.fkw.fqk);
                    }
                }
                if (this.f12293th != null && (zihVar = this.fkw.fak) != null && !TextUtils.isEmpty(zihVar.ouw)) {
                    com.bytedance.sdk.openadsdk.th.vt.ouw();
                    vpp vppVar = this.fkw;
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = vppVar.fak;
                    com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar2.ouw, zihVar2.vt, zihVar2.f12895lh, this.f12293th, vppVar);
                }
                this.pno.fkw();
            } else {
                if (this.f12287le) {
                    ouw(0);
                    vt(8);
                    if (ouw(this.f12284cf)) {
                        this.pno.fkw();
                    } else {
                        this.pno.le();
                    }
                    le.ouw(this.fkw, new ouw(this.yu, this), 25);
                } else {
                    ouw(8);
                    vt(0);
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = this.fkw.f12877tc.get(0);
                    com.bytedance.sdk.openadsdk.utils.zih.ouw(new com.bytedance.sdk.openadsdk.th.ouw(zihVar3.ouw, zihVar3.f12894le), zihVar3.vt, zihVar3.f12895lh, new vt(this), com.bytedance.sdk.openadsdk.component.ra.ouw.vt(TextUtils.isEmpty(zihVar3.f12894le) ? com.bytedance.sdk.component.utils.fkw.ouw(zihVar3.ouw) : zihVar3.f12894le).getParent(), 25);
                    this.pno.fkw();
                }
                if (this.f12292tc == null) {
                    z10 = false;
                } else {
                    if (TextUtils.isEmpty(this.fkw.f12883vh)) {
                        com.bytedance.sdk.openadsdk.core.model.le leVar2 = this.fkw.wp;
                        if (leVar2 != null) {
                            this.f12292tc.setText(leVar2.vt);
                        } else {
                            z10 = false;
                        }
                    } else {
                        this.f12292tc.setText(this.fkw.f12883vh);
                    }
                    z10 = true;
                }
                if (this.ksc != null) {
                    com.bytedance.sdk.openadsdk.th.vt.ouw();
                    vpp vppVar2 = this.fkw;
                    com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar2.fak, this.ksc, vppVar2);
                }
                rn rnVar = this.jae;
                if (rnVar != null) {
                    osn.ouw((TextView) null, rnVar, this.fkw);
                    com.bytedance.sdk.openadsdk.core.model.le leVar3 = this.fkw.wp;
                    if (leVar3 == null || leVar3.fkw < 0.0d) {
                        this.jae.setVisibility(8);
                        z11 = z10;
                    }
                } else {
                    z11 = z10;
                }
                View view = this.f12289od;
                if (view != null) {
                    view.setVisibility(z11 ? 0 : 8);
                }
            }
        }
        Activity activity = this.yu;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    public int yu() {
        return -1;
    }

    public static class vt implements com.bytedance.sdk.openadsdk.utils.zih.ouw {
        private final WeakReference<lh> ouw;

        @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
        public final void ouw() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
        public final void vt() {
        }

        public vt(lh lhVar) {
            this.ouw = new WeakReference<>(lhVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
        public final void ouw(com.bytedance.sdk.openadsdk.th.ouw.vt vtVar) {
            lh lhVar;
            if (vtVar.vt() && (lhVar = this.ouw.get()) != null) {
                lhVar.ouw(vtVar);
                if (vtVar.f13355lh != null) {
                    lh.ouw(lhVar, vtVar.vt);
                }
            }
        }
    }

    public final void le() {
        this.ryl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lh.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/lh$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_lh$4_onClick_adc5464035554421269738f99b0f7c38(view);
            }

            public void safedk_lh$4_onClick_adc5464035554421269738f99b0f7c38(View p10) {
                com.bytedance.sdk.openadsdk.component.ouw ouwVar = lh.this.pno;
                if (ouwVar != null) {
                    ouwVar.lh();
                }
            }
        });
        this.mwh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lh.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/lh$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_lh$5_onClick_f6f8629e7775225b7cf960818029d0b4(view);
            }

            public void safedk_lh$5_onClick_f6f8629e7775225b7cf960818029d0b4(View p10) {
                com.bytedance.sdk.openadsdk.component.ouw ouwVar = lh.this.pno;
                if (ouwVar != null) {
                    ouwVar.vt();
                }
            }
        });
    }

    public void lh() {
        com.bytedance.sdk.openadsdk.component.pno.vt vtVar;
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar = this.f12291rn;
        if (lhVar == null || (vtVar = lhVar.vt) == null) {
            return;
        }
        lhVar.ouw = null;
        vtVar.mwh();
        lhVar.vt = null;
    }

    public lh(Activity activity, vpp vppVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.ouw ouwVar, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2) {
        this.yu = activity;
        this.fkw = vppVar;
        this.f12290ra = frameLayout;
        this.tlj = i10;
        this.f12287le = z10;
        this.pno = ouwVar;
        this.bly = vppVar.fqk();
        this.f12286ko = ouwVar2;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void ouw() {
        this.f12288lh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lh.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/lh$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_lh$2_onClick_4adc093c9831b8984035027db45504ad(view);
            }

            public void safedk_lh$2_onClick_4adc093c9831b8984035027db45504ad(View p10) {
                try {
                    lh lhVar = lh.this;
                    TTWebsiteActivity.ouw(lhVar.yu, lhVar.fkw, "open_ad");
                } catch (Throwable th2) {
                    qbp.lh("AppOpenAdNativeManager", th2.getMessage());
                }
            }
        });
        le();
        if (this.fkw.pd()) {
            return;
        }
        vpp vppVar = this.fkw;
        Activity activity = this.yu;
        com.bytedance.sdk.openadsdk.component.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.component.ouw.ouw(activity.getApplicationContext(), vppVar, "open_ad", this.f12286ko);
        ouwVar.ouw(activity.findViewById(R.id.content));
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(activity.getApplicationContext(), vppVar, ouwVar);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(ouwVar, vppVar);
        ouwVar.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.lh.3
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i10) {
                lh.this.pno.ra();
            }
        });
        ouwVar.ouw(this.f12291rn);
        if (this.fkw.mwh() == 1) {
            this.ouw.setOnClickListener(ouwVar);
            this.ouw.setOnTouchListener(ouwVar);
        }
        this.zih.setOnClickListener(ouwVar);
        this.zih.setOnTouchListener(ouwVar);
    }

    public final boolean ouw(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar = new com.bytedance.sdk.openadsdk.component.pno.lh(this.yu);
        this.f12291rn = lhVar;
        return lhVar.ouw(frameLayout, this.pno, this.fkw);
    }

    private void ouw(int i10) {
        osn.ouw((View) this.f12284cf, i10);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.th.ouw.vt vtVar) {
        ImageView imageView = this.vt;
        if (imageView == null) {
            return;
        }
        Bitmap bitmap = vtVar.f13355lh;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        Drawable drawable = vtVar.ouw;
        if (drawable != null) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                ((AnimatedImageDrawable) drawable).start();
            }
            this.vt.setImageDrawable(drawable);
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.zih> list = this.fkw.f12877tc;
        if (list == null || list.get(0) == null) {
            return;
        }
        this.fkw.f12877tc.get(0);
        Drawable drawableOuw = com.bytedance.sdk.openadsdk.utils.zih.ouw(vtVar.ouw());
        this.vt.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.vt.setImageDrawable(drawableOuw);
    }

    public final void ouw(float f10, float f11) {
        this.jqy = f10;
        this.vpp = f11;
    }

    public void ouw(int i10, boolean z10) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar;
        if (this.mwh == null || (pnoVar = this.f12285jg) == null) {
            return;
        }
        if (z10) {
            if (pnoVar.getVisibility() != 8) {
                this.f12285jg.setVisibility(8);
            }
            if (this.mwh.getVisibility() != 0) {
                this.mwh.setVisibility(0);
                return;
            }
            return;
        }
        this.f12285jg.setText(i10 + "s");
        if (this.f12285jg.getVisibility() != 0) {
            this.f12285jg.setVisibility(0);
        }
    }

    public static /* synthetic */ void ouw(lh lhVar, Object obj) {
        try {
            if (obj instanceof Bitmap) {
                lhVar.f12294vm.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.zih.ouw().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            qbp.yu("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    private void vt(int i10) {
        osn.ouw((View) this.vt, i10);
    }
}
