package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.jg;
import com.bytedance.sdk.openadsdk.common.zin;
import com.bytedance.sdk.openadsdk.component.reward.ouw.bly;
import com.bytedance.sdk.openadsdk.component.reward.ouw.cf;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.ouw.mwh;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ryl;
import com.bytedance.sdk.openadsdk.component.reward.ouw.tlj;
import com.bytedance.sdk.openadsdk.component.reward.ouw.zih;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.vm;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vt extends com.bytedance.sdk.openadsdk.component.reward.vt.ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f12488cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public LinearLayout f12489jg;
    public com.bytedance.sdk.openadsdk.core.widget.vt mwh;
    public com.bytedance.sdk.openadsdk.core.lh.fkw ryl;

    public interface ouw {
        void ouw(boolean z10);
    }

    public abstract boolean fkw();

    public abstract boolean le();

    public abstract void ouw(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.ouw
    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, jae jaeVar) {
        super.ouw(vtVar, jaeVar);
        if (this.ouw.vt.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            if (ouwVar.lvd) {
                ouwVar.bs.ouw(false);
            }
        }
    }

    public abstract void ra();

    public void ryl() {
    }

    public final void th() {
        vt(false);
    }

    public ouw yu() {
        return null;
    }

    public final View bly() {
        View viewCreatePAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this.ouw.jvy);
        lhVar.setId(rn.amr);
        View viewVt = com.bytedance.sdk.openadsdk.core.widget.le.vt(this.ouw.jvy);
        viewVt.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        layoutParams.topMargin = osn.ouw(this.ouw.jvy, 20.0f);
        layoutParams.rightMargin = osn.ouw(this.ouw.jvy, 16.0f);
        viewVt.setLayoutParams(layoutParams);
        viewVt.setContentDescription(vpp.ouw(this.ouw.jvy, "tt_ad_close_text"));
        viewVt.setVisibility(8);
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.ouw.f12374gh;
        if (pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(ouwVar.jvy, ouwVar.vt);
            viewCreatePAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, osn.ouw(this.ouw.jvy, 14.0f));
            layoutParams2.gravity = BadgeDrawable.BOTTOM_START;
            viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            viewCreatePAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(this.ouw.jvy);
        yuVar.setId(rn.f13422lk);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(osn.ouw(this.ouw.jvy, 32.0f), osn.ouw(this.ouw.jvy, 14.0f));
        layoutParams3.gravity = BadgeDrawable.BOTTOM_END;
        yuVar.setLayoutParams(layoutParams3);
        yuVar.setPadding(osn.ouw(this.ouw.jvy, 9.0f), 0, osn.ouw(this.ouw.jvy, 9.0f), 0);
        yuVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (viewCreatePAGLogoViewByMaterial != null) {
            lhVar.addView(viewCreatePAGLogoViewByMaterial);
        }
        lhVar.addView(yuVar);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
        if (!ouwVar2.vt.tpk || !ouwVar2.euf || ouwVar2.ouw != 1) {
            View lhVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.lh(this.ouw.jvy);
            lhVar2.setId(rn.uz);
            lhVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            lhVar.addView(lhVar2);
        }
        lhVar.addView(viewVt);
        return lhVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    public final void cf() {
        float fMin;
        float fMax;
        int iMax;
        int iMax2;
        int i10;
        jg jgVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        cf cfVar = ouwVar.f12381od;
        boolean z10 = ouwVar.yu;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 != 26) {
            if (i11 == 27) {
                try {
                    cfVar.vt();
                } catch (Throwable unused) {
                }
            } else {
                cfVar.vt();
            }
        }
        float fLh = cfVar.lh();
        float fYu = cfVar.yu();
        if (cfVar.ouw.ucs == 2) {
            fMin = Math.max(fLh, fYu);
            fMax = Math.min(fLh, fYu);
        } else {
            fMin = Math.min(fLh, fYu);
            fMax = Math.max(fLh, fYu);
        }
        Activity activity = cfVar.ouw.jvy;
        int iVt = osn.vt(activity, osn.ouw());
        if (cfVar.ouw.ucs != 2) {
            if (osn.lh(activity)) {
                fMax -= iVt;
            }
        } else if (osn.lh(activity)) {
            fMin -= iVt;
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = cfVar.ouw;
            ouwVar2.yib = (int) fMin;
            ouwVar2.yhj = (int) fMax;
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = cfVar.ouw;
            int i12 = 20;
            if (ouwVar3.ucs != 2) {
                float f10 = ouwVar3.f12389vh;
                if (f10 == 0.0f || f10 == 100.0f) {
                    iMax = 0;
                    iMax2 = 0;
                    i10 = 0;
                    i12 = 0;
                } else {
                    iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f10)) / 2.0f, 0.0f);
                    i10 = iMax2;
                    iMax = 20;
                }
            } else {
                float f11 = ouwVar3.f12389vh;
                if (f11 == 0.0f || f11 == 100.0f) {
                    iMax = 0;
                    iMax2 = 0;
                    i10 = 0;
                    i12 = 0;
                } else {
                    iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f11)) / 2.0f, 0.0f);
                    iMax2 = 20;
                    i10 = 20;
                    i12 = iMax;
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = cfVar.ouw;
            float f12 = i12;
            float f13 = iMax;
            ouwVar4.yib = (int) ((fMin - f12) - f13);
            float f14 = iMax2;
            float f15 = i10;
            ouwVar4.yhj = (int) ((fMax - f14) - f15);
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar4.f12374gh;
            if (pnoVar == null || pnoVar.tlj == 0) {
                activity.getWindow().getDecorView().setPadding(osn.ouw(activity, f12), osn.ouw(activity, f14), osn.ouw(activity, f13), osn.ouw(activity, f15));
            }
        }
        this.ouw.ey.vt();
        com.bytedance.sdk.openadsdk.component.reward.view.pno pnoVar2 = this.ouw.osn.ouw;
        if (!pnoVar2.f12461lh) {
            pnoVar2.f12461lh = true;
            RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) pnoVar2.ouw.rrs.findViewById(rn.f13441vi);
            pnoVar2.vt = rFEndCardBackUpLayout;
            if (rFEndCardBackUpLayout != null) {
                rFEndCardBackUpLayout.init(pnoVar2.ouw);
            }
            if (pnoVar2.ouw.vt.cd()) {
                pnoVar2.yu = new zih(pnoVar2.ouw);
            }
        }
        if (!this.ouw.vt.cd()) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.ouw;
            if (ouwVar5.f12383ra && TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.vpp.ouw(ouwVar5.hun, this.vt))) {
                LinearLayout linearLayout = (LinearLayout) this.ouw.rrs.findViewById(rn.mwh);
                this.f12489jg = linearLayout;
                osn.ouw((View) linearLayout, 8);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar6 = this.ouw;
                ouwVar6.f12380ng = new jg(ouwVar6.jvy, ouwVar6.vt, "landingpage_endcard");
                this.ouw.f12380ng.f12207lh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.vt.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/vt/vt$1;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view);
                        safedk_vt$1_onClick_f2bed0e03e951d333b1ee3d613f24b9e(view);
                    }

                    public void safedk_vt$1_onClick_f2bed0e03e951d333b1ee3d613f24b9e(View p10) {
                        View p11 = vt.this.ouw.ey.tlj();
                        p11.performClick();
                    }
                });
                this.f12489jg.addView(this.ouw.f12380ng.ouw, new LinearLayout.LayoutParams(-1, -1));
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar7 = this.ouw;
                ouwVar7.bs.f12407od = ouwVar7.f12380ng;
            }
            final com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = this.ouw.bs;
            if (!rnVar.f12415vm) {
                rnVar.f12415vm = true;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar8 = rnVar.uq;
                rnVar.vt = ouwVar8.ucs;
                rnVar.yu = ouwVar8.yib;
                rnVar.fkw = ouwVar8.yhj;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                rnVar.f12412th = rnVar.uq.jvy.findViewById(R.id.content);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar9 = rnVar.uq;
                boolean z11 = ouwVar9.f12383ra;
                rnVar.f12399cd = z11;
                if (!z11 || (jgVar = rnVar.f12407od) == null) {
                    com.bytedance.sdk.component.bly.le leVar = (com.bytedance.sdk.component.bly.le) ouwVar9.rrs.findViewById(rn.f13415jg);
                    rnVar.f12405le = leVar;
                    if (leVar == null || !com.bytedance.sdk.openadsdk.core.model.vpp.vt(rnVar.uq.vt)) {
                        osn.ouw((View) rnVar.f12405le, 8);
                    } else {
                        rnVar.f12405le.o_();
                    }
                } else {
                    rnVar.f12405le = jgVar.vt;
                }
                com.bytedance.sdk.component.bly.le leVar2 = rnVar.f12405le;
                if (leVar2 != null) {
                    leVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.1
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            com.bytedance.sdk.component.bly.le leVar3 = rn.this.f12405le;
                            if (leVar3 == null || leVar3.getViewTreeObserver() == null) {
                                return;
                            }
                            rn.this.f12405le.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            int measuredWidth = rn.this.f12405le.getMeasuredWidth();
                            int measuredHeight = rn.this.f12405le.getMeasuredHeight();
                            if (rn.this.f12405le.getVisibility() == 0) {
                                rn rnVar2 = rn.this;
                                if (rnVar2.f12409ra == null || rnVar2.uq.jvy.isFinishing()) {
                                    return;
                                }
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("width", measuredWidth);
                                    jSONObject.put("height", measuredHeight);
                                    rnVar2.f12409ra.ouw("resize", jSONObject);
                                } catch (Exception e10) {
                                    Log.e("TTAD.RFWVM", "", e10);
                                }
                            }
                        }
                    });
                }
                rnVar.f12401cj = SystemClock.elapsedRealtime() - jElapsedRealtime;
            }
            mwh mwhVar = this.ouw.fak;
            if (!mwhVar.f12369rn) {
                mwhVar.f12369rn = true;
                mwhVar.vt = (FrameLayout) mwhVar.ouw.rrs.findViewById(rn.f13419ko);
            }
        }
        bly blyVar = this.ouw.ksc.ouw;
        if (blyVar != null) {
            blyVar.ouw();
        }
        ryl rylVar = this.ouw.uoy;
        if (!rylVar.fkw) {
            rylVar.fkw = true;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar10 = rylVar.vt;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = ouwVar10.f12370an;
            if (lhVar != null) {
                rylVar.f12419lh = lhVar;
                rylVar.f12418le = true;
            } else {
                rylVar.f12419lh = (com.bytedance.sdk.openadsdk.component.reward.top.lh) ouwVar10.rrs.findViewById(rn.uz);
            }
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar2 = rylVar.f12419lh;
            if (lhVar2 != null) {
                lhVar2.ouw(rylVar.vt.vt);
                if (rylVar.vt.vt.cd()) {
                    rylVar.ouw(false);
                } else {
                    rylVar.ouw(rylVar.vt.vt.ksc());
                }
            }
        }
        if (od.le(this.ouw.vt)) {
            this.ouw.ey.yu();
            osn.ouw((View) this.ouw.bs.f12405le, 4);
        }
        if (th.yu(this.ouw.vt) || th.vt(this.ouw.vt) || th.ra(this.ouw.vt)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar11 = this.ouw;
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = ouwVar11.ey;
        int iOuw = osn.ouw(ouwVar11.hun, ouwVar11.yib);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar12 = this.ouw;
        rylVar2.ouw(iOuw, osn.ouw(ouwVar12.hun, ouwVar12.yhj));
        com.bytedance.sdk.openadsdk.component.reward.ouw.yu yuVar = this.ouw.f12386tc;
        if (!yuVar.yu) {
            yuVar.yu = true;
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh() && yuVar.ouw.f12868pd == 4) {
                yuVar.f12423lh = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(yuVar.fkw.hun, yuVar.vt);
            }
            if (yuVar.f12423lh == null) {
                yuVar.f12423lh = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(yuVar.fkw.jvy, yuVar.vt);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar13 = this.ouw;
        if (ouwVar13.fwd) {
            ouwVar13.ey.ouw(0);
        }
    }

    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (!ouwVar.f12383ra && ouwVar.vt()) {
            this.ouw.uoy.yu();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.euf && (ouwVar2.f12374gh instanceof com.bytedance.sdk.openadsdk.activity.ouw)) {
                return;
            }
            ouwVar2.ey.le(0);
        }
    }

    public final void jqy() {
        com.bytedance.sdk.openadsdk.core.lh.ra raVar;
        com.bytedance.sdk.component.bly.le leVar;
        lh();
        if (!this.ouw.vt.cd() && !this.ouw.jvy.isFinishing()) {
            this.ouw.bs.yu();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            String str = ouwVar.yu ? "reward_endcard" : "fullscreen_endcard";
            ouwVar.bs.ouw(str, ouwVar.fqk);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.odc) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar = ouwVar2.ksc;
                boolean z10 = ouwVar2.f12373cj;
                bly blyVar = pnoVar.ouw;
                if (blyVar != null) {
                    blyVar.vt(z10);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.ouw;
            final com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = ouwVar3.bs;
            final com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = ouwVar3.fqk;
            final com.bytedance.sdk.openadsdk.component.reward.ouw.rn.yu yuVar = new com.bytedance.sdk.openadsdk.component.reward.ouw.rn.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.5
                @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.rn.yu
                public final void ouw() {
                    if (rn.this.uq.jvy.isFinishing()) {
                        return;
                    }
                    rn.this.ryl.get();
                }

                @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.rn.yu
                public final void ouw(WebView webView, int i10) {
                    com.bytedance.sdk.openadsdk.common.jg jgVar;
                    try {
                        rn rnVar2 = rn.this;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = rnVar2.uq;
                        if (!ouwVar4.f12383ra || (jgVar = ouwVar4.f12380ng) == null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw ouwVar5 = rnVar2.wp;
                        zin zinVar = jgVar.yu;
                        if (zinVar != null) {
                            if (i10 == 100) {
                                zinVar.fkw.setVisibility(8);
                            } else {
                                zinVar.fkw.setVisibility(0);
                                zinVar.fkw.setProgress(i10);
                            }
                        }
                        com.bytedance.sdk.openadsdk.common.th thVar = jgVar.fkw;
                        if (thVar != null) {
                            thVar.ouw(webView, ouwVar5);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            final com.bytedance.sdk.openadsdk.core.model.vpp vppVar = rnVar.uq.vt;
            com.bytedance.sdk.component.bly.le leVar2 = rnVar.f12405le;
            if (leVar2 != null && leVar2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.yu.mwh mwhVar = new com.bytedance.sdk.openadsdk.yu.mwh(vppVar, rnVar.f12405le.getWebView(), new com.bytedance.sdk.openadsdk.yu.ryl() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.11
                    @Override // com.bytedance.sdk.openadsdk.yu.ryl
                    public final void ouw(int i10) {
                        if (TextUtils.isEmpty(rn.this.hun)) {
                            return;
                        }
                        rn rnVar2 = rn.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw.ouw(rnVar2.jvy, rnVar2.rrs, rn.this.f12413ub, rn.this.lso - rn.this.f12413ub, vppVar, "landingpage_endcard", i10);
                    }
                }, rnVar.fqk);
                mwhVar.jae = true;
                rnVar.tlj = mwhVar;
                rnVar.wp = mwhVar.ryl;
                mwhVar.ouw(rnVar.ra() ? "landingpage_endcard" : str);
                com.bytedance.sdk.openadsdk.yu.mwh mwhVar2 = rnVar.tlj;
                String str2 = rnVar.ouw;
                if (!TextUtils.isEmpty(str2)) {
                    mwhVar2.ey = str2;
                }
                rnVar.tlj.f13529cd = true;
                rnVar.f12405le.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.12
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                        com.bytedance.sdk.openadsdk.yu.mwh mwhVar3 = rn.this.tlj;
                        if (mwhVar3 != null) {
                            mwhVar3.ouw(i11);
                        }
                    }
                });
                if (rnVar.uq.ksc != null) {
                    rnVar.tlj.f13532jg = com.bytedance.sdk.openadsdk.component.reward.ouw.pno.ouw();
                }
                com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(vppVar, rnVar.f12405le, rnVar.uq.jvy);
                rnVar.f12403kn = fkwVarOuw;
                if (fkwVarOuw != null) {
                    if (rnVar.ra()) {
                        str = "landingpage_endcard";
                    }
                    fkwVarOuw.ouw(str);
                }
                if (rnVar.ra()) {
                    uoy.ouw(vppVar, rnVar.f12405le);
                }
                final Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
                final bs bsVar = rnVar.f12409ra;
                final String str3 = vppVar.pv;
                final com.bytedance.sdk.openadsdk.common.fkw fkwVar = rnVar.f12403kn;
                final com.bytedance.sdk.openadsdk.yu.mwh mwhVar3 = rnVar.tlj;
                final boolean zVm = vppVar.vm();
                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(contextOuw, bsVar, str3, fkwVar, mwhVar3, zVm) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView, String str4) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/rn$2;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                        CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str4);
                        safedk_rn$2_onPageFinished_e96151bc25c1a10c8f72e7b29adaf4f9(webView, str4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onReceivedError(WebView webView, int i10, String str4, String str5) {
                        super.onReceivedError(webView, i10, str4, str5);
                    }

                    public WebResourceResponse safedk_rn$2_shouldInterceptRequest_e6a4f15f3d8ba25fc32f84c0f1bb83d0(WebView p10, String p11) {
                        try {
                            if (TextUtils.isEmpty(rn.this.hun)) {
                                return super.shouldInterceptRequest(p10, p11);
                            }
                            rn.this.lso++;
                            com.bytedance.sdk.openadsdk.ra.vt.ouw();
                            rn rnVar2 = rn.this;
                            WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(rnVar2.ux, rnVar2.hun, p11);
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                                rn.this.f12413ub++;
                                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "GeckoLog: hit++");
                                return webResourceResponseModelOuw.getWebResourceResponse();
                            }
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                                rn.this.rrs++;
                            }
                            return super.shouldInterceptRequest(p10, p11);
                        } catch (Throwable th2) {
                            qbp.ouw("TTAD.RFWVM", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(p10, p11);
                        }
                    }

                    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    @TargetApi(21)
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/rn$2;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, webView, webResourceRequest, safedk_rn$2_shouldInterceptRequest_690c920ba9ad3556ea94ac1e9a539b54(webView, webResourceRequest));
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str4) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/rn$2;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponse(g.f44975u, webView, str4, safedk_rn$2_shouldInterceptRequest_e6a4f15f3d8ba25fc32f84c0f1bb83d0(webView, str4));
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    @TargetApi(23)
                    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                            Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                        }
                        if (webResourceRequest == null || webResourceRequest.getUrl() == null || !rn.ouw(rn.this, webResourceRequest.getUrl().toString())) {
                            if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                                webResourceError.getErrorCode();
                                String.valueOf(webResourceError.getDescription());
                                String.valueOf(webResourceRequest.getUrl());
                            }
                            if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                                rn.this.ryl.set(false);
                                rn rnVar2 = rn.this;
                                rnVar2.f12414vh = false;
                                rnVar2.ouw(webResourceError != null ? webResourceError.getErrorCode() : -1, rn.this.uq.fqk);
                            }
                            if (rn.this.f12410rn != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (webResourceError != null) {
                                        jSONObject.put("code", webResourceError.getErrorCode());
                                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                    }
                                    rn.this.f12410rn.ouw(jSONObject);
                                } catch (JSONException unused) {
                                }
                            }
                            if (webResourceError != null) {
                                rn.this.f12402jg = webResourceError.getErrorCode();
                                rn.this.f12404ko = String.valueOf(webResourceError.getDescription());
                            }
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onPageStarted(WebView webView, String str4, Bitmap bitmap) {
                        super.onPageStarted(webView, str4, bitmap);
                        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar3 = rn.this.f12410rn;
                        if (fkwVar3 != null) {
                            fkwVar3.fkw();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    @TargetApi(21)
                    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        webResourceRequest.isForMainFrame();
                        webResourceRequest.getUrl();
                        webResourceResponse.getStatusCode();
                        if (webResourceRequest.getUrl() != null) {
                            Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                        }
                        if (webResourceRequest.isForMainFrame()) {
                            rn.this.ryl.set(false);
                            rn rnVar2 = rn.this;
                            rnVar2.f12414vh = false;
                            rnVar2.f12402jg = webResourceResponse.getStatusCode();
                            rn rnVar3 = rn.this;
                            rnVar3.f12404ko = "onReceivedHttpError";
                            rnVar3.ouw(rnVar3.f12402jg, rnVar3.uq.fqk);
                        }
                        if (rn.this.f12410rn != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                                rn.this.f12410rn.ouw(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    public void safedk_rn$2_onPageFinished_e96151bc25c1a10c8f72e7b29adaf4f9(WebView p10, String p11) {
                        super.onPageFinished(p10, p11);
                        rn rnVar2 = rn.this;
                        rnVar2.f12414vh = false;
                        rnVar2.mwh = true;
                        rnVar2.ouw(100, rnVar2.uq.fqk);
                        if (rn.this.uq.bs.cf()) {
                            View viewTlj = rn.this.uq.ey.tlj();
                            if (viewTlj instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                                ((com.bytedance.sdk.openadsdk.core.le.yu) viewTlj).setImageResource(vpp.yu(rn.this.uq.hun, "tt_skip_btn"));
                            }
                        }
                        DeviceUtils.AudioInfoReceiver.ouw(rn.this);
                        rn.this.yhj = DeviceUtils.ra();
                        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar3 = rn.this.f12410rn;
                        if (fkwVar3 != null) {
                            fkwVar3.le();
                        }
                        yu yuVar2 = yuVar;
                        if (yuVar2 != null) {
                            yuVar2.ouw();
                        }
                    }

                    @TargetApi(21)
                    public WebResourceResponse safedk_rn$2_shouldInterceptRequest_690c920ba9ad3556ea94ac1e9a539b54(WebView p10, WebResourceRequest p11) {
                        try {
                            return shouldInterceptRequest(p10, p11.getUrl().toString());
                        } catch (Throwable th2) {
                            qbp.ouw("TTAD.RFWVM", "shouldInterceptRequest error1", th2);
                            return super.shouldInterceptRequest(p10, p11);
                        }
                    }
                };
                rnVar.f12408pd = fkwVar2;
                rnVar.f12405le.setWebViewClient(fkwVar2);
                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar3 = rnVar.f12408pd;
                fkwVar3.f13107ko = vppVar;
                fkwVar3.tlj = rnVar.f12406lh ? "rewarded_video" : "fullscreen_interstitial_ad";
                if (vppVar.vm() && (leVar = rnVar.f12405le) != null && leVar.getWebView() != null) {
                    rnVar.f12405le.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.3

                        /* JADX INFO: renamed from: lh, reason: collision with root package name */
                        private final int f12416lh = com.bytedance.sdk.openadsdk.core.zih.vt();

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/rn$3;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
                            return safedk_rn$3_onTouch_e6557c2e89febffeed3153b1e0472073(view, motionEvent);
                        }

                        public boolean safedk_rn$3_onTouch_e6557c2e89febffeed3153b1e0472073(View p10, MotionEvent p11) {
                            int i10;
                            com.bytedance.sdk.openadsdk.yu.mwh mwhVar4 = rn.this.tlj;
                            if (mwhVar4 != null) {
                                mwhVar4.ouw(p11);
                            }
                            com.bytedance.sdk.openadsdk.common.fkw fkwVar4 = rn.this.f12403kn;
                            if (fkwVar4 != null) {
                                fkwVar4.ouw(p11);
                            }
                            try {
                                int actionMasked = p11.getActionMasked();
                                int i11 = 3;
                                if (actionMasked == 0) {
                                    rn rnVar2 = rn.this;
                                    rnVar2.f12411tc = true;
                                    rnVar2.ex = new SparseArray<>();
                                    rn.this.zin = p11.getRawX();
                                    rn.this.vpp = p11.getRawY();
                                    rn.this.jqy = System.currentTimeMillis();
                                    try {
                                        long landingPageClickBegin = rn.this.f12405le.getLandingPageClickBegin();
                                        if (landingPageClickBegin > 0) {
                                            rn rnVar3 = rn.this;
                                            if (landingPageClickBegin < rnVar3.jqy) {
                                                rnVar3.jqy = landingPageClickBegin;
                                                rnVar3.f12405le.setLandingPageClickBegin(-1L);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                    rn rnVar4 = rn.this;
                                    rnVar4.ksc = -1.0f;
                                    rnVar4.jae = -1.0f;
                                    i10 = 0;
                                } else if (actionMasked == 1) {
                                    i10 = i11;
                                } else if (actionMasked != 2) {
                                    i10 = actionMasked == 3 ? 4 : -1;
                                } else {
                                    float rawX = p11.getRawX();
                                    float rawY = p11.getRawY();
                                    if (Math.abs(rawX - rn.this.zin) >= this.f12416lh || Math.abs(rawY - rn.this.vpp) >= this.f12416lh) {
                                        rn.this.f12411tc = false;
                                    }
                                    rn.this.ksc += Math.abs(p11.getX() - rn.this.zin);
                                    rn.this.jae += Math.abs(p11.getY() - rn.this.vpp);
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    rn rnVar5 = rn.this;
                                    i11 = (jCurrentTimeMillis - rnVar5.jqy <= 200 || (rnVar5.ksc <= 8.0f && rnVar5.jae <= 8.0f)) ? 2 : 1;
                                    if (rnVar5.f12399cd) {
                                        if (rawY - rnVar5.vpp > 8.0f) {
                                            com.bytedance.sdk.openadsdk.common.jg jgVar = rnVar5.f12407od;
                                            final zin zinVar = jgVar.yu;
                                            if (zinVar != null) {
                                                try {
                                                    final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zinVar.ouw.getLayoutParams();
                                                    if (!zinVar.f12240cf) {
                                                        int i12 = marginLayoutParams.topMargin;
                                                        int i13 = zinVar.tlj;
                                                        if (i12 == (-i13)) {
                                                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-i13, 0);
                                                            valueAnimatorOfInt.setDuration(300L);
                                                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.2
                                                                public final /* synthetic */ ViewGroup.MarginLayoutParams ouw;

                                                                public AnonymousClass2() {
                                                                    marginLayoutParams = marginLayoutParams;
                                                                }

                                                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                                    zin.this.ouw.setLayoutParams(marginLayoutParams);
                                                                }
                                                            });
                                                            valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.3
                                                                @Override // android.animation.Animator.AnimatorListener
                                                                public final void onAnimationCancel(Animator animator) {
                                                                }

                                                                @Override // android.animation.Animator.AnimatorListener
                                                                public final void onAnimationRepeat(Animator animator) {
                                                                }

                                                                public AnonymousClass3() {
                                                                }

                                                                @Override // android.animation.Animator.AnimatorListener
                                                                public final void onAnimationEnd(Animator animator) {
                                                                    zin.this.f12240cf = false;
                                                                }

                                                                @Override // android.animation.Animator.AnimatorListener
                                                                public final void onAnimationStart(Animator animator) {
                                                                    zin.this.f12240cf = true;
                                                                }
                                                            });
                                                            valueAnimatorOfInt.start();
                                                        }
                                                    }
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            com.bytedance.sdk.openadsdk.common.th thVar = jgVar.fkw;
                                            if (thVar != null) {
                                                thVar.ouw();
                                            }
                                        }
                                        rn rnVar6 = rn.this;
                                        if (rawY - rnVar6.vpp < -8.0f) {
                                            com.bytedance.sdk.openadsdk.common.jg jgVar2 = rnVar6.f12407od;
                                            final zin zinVar2 = jgVar2.yu;
                                            if (zinVar2 != null) {
                                                try {
                                                    final ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) zinVar2.ouw.getLayoutParams();
                                                    if (!zinVar2.f12240cf && marginLayoutParams2.topMargin == 0) {
                                                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, -zinVar2.tlj);
                                                        valueAnimatorOfInt2.setDuration(300L);
                                                        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.4
                                                            public final /* synthetic */ ViewGroup.MarginLayoutParams ouw;

                                                            public AnonymousClass4() {
                                                                marginLayoutParams = marginLayoutParams2;
                                                            }

                                                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                                marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                                zin.this.ouw.setLayoutParams(marginLayoutParams);
                                                            }
                                                        });
                                                        valueAnimatorOfInt2.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.5
                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationCancel(Animator animator) {
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationRepeat(Animator animator) {
                                                            }

                                                            public AnonymousClass5() {
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationEnd(Animator animator) {
                                                                zin.this.f12240cf = false;
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationStart(Animator animator) {
                                                                zin.this.f12240cf = true;
                                                            }
                                                        });
                                                        valueAnimatorOfInt2.start();
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            com.bytedance.sdk.openadsdk.common.th thVar2 = jgVar2.fkw;
                                            if (thVar2 != null) {
                                                thVar2.vt();
                                            }
                                        }
                                    }
                                    i10 = i11;
                                }
                                rn.this.ex.put(p11.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lh.lh.ouw(i10, p11.getSize(), p11.getPressure(), System.currentTimeMillis()));
                                if (p11.getAction() == 1 && th.le(rn.this.uq.vt)) {
                                    rn rnVar7 = rn.this;
                                    if (rnVar7.uq.fqk != null) {
                                        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.3.1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                rn.this.uq.fqk.wp();
                                            }
                                        };
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        if (jCurrentTimeMillis2 - rnVar7.fvf >= 100) {
                                            rnVar7.fvf = jCurrentTimeMillis2;
                                            runnable.run();
                                        }
                                    }
                                }
                                if (p11.getAction() == 1 && p10.getVisibility() == 0 && Float.valueOf(p10.getAlpha()).intValue() == 1 && ((!rn.this.f12400cf || th.tlj(vppVar)) && rn.this.f12411tc)) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("down_x", rn.this.zin);
                                    jSONObject.put("down_y", rn.this.vpp);
                                    jSONObject.put("down_time", rn.this.jqy);
                                    jSONObject.put("up_x", p11.getRawX());
                                    jSONObject.put("up_y", p11.getRawY());
                                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                                    try {
                                        long landingPageClickEnd = rn.this.f12405le.getLandingPageClickEnd();
                                        if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis3) {
                                            try {
                                                rn.this.f12405le.setLandingPageClickEnd(-1L);
                                            } catch (Exception unused4) {
                                            }
                                            jCurrentTimeMillis3 = landingPageClickEnd;
                                        }
                                    } catch (Exception unused5) {
                                    }
                                    jSONObject.put("up_time", jCurrentTimeMillis3);
                                    int[] iArr = new int[2];
                                    rn rnVar8 = rn.this;
                                    if (rnVar8.f12399cd) {
                                        rnVar8.qbp = rnVar8.uq.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.coz);
                                    } else {
                                        rnVar8.qbp = rnVar8.uq.rrs.findViewById(520093713);
                                    }
                                    View view = rn.this.qbp;
                                    if (view != null) {
                                        view.getLocationOnScreen(iArr);
                                        jSONObject.put("button_x", iArr[0]);
                                        jSONObject.put("button_y", iArr[1]);
                                        jSONObject.put("button_width", rn.this.qbp.getWidth());
                                        jSONObject.put("button_height", rn.this.qbp.getHeight());
                                    }
                                    View view2 = rn.this.f12412th;
                                    if (view2 != null) {
                                        int[] iArr2 = new int[2];
                                        view2.getLocationOnScreen(iArr2);
                                        jSONObject.put("ad_x", iArr2[0]);
                                        jSONObject.put("ad_y", iArr2[1]);
                                        jSONObject.put("width", rn.this.f12412th.getWidth());
                                        jSONObject.put("height", rn.this.f12412th.getHeight());
                                    }
                                    jSONObject.put("toolType", p11.getToolType(0));
                                    jSONObject.put("deviceId", p11.getDeviceId());
                                    jSONObject.put("source", p11.getSource());
                                    jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.cf.ouw(rn.this.ex, com.bytedance.sdk.openadsdk.core.bly.ouw().tlj ? 1 : 2));
                                    jSONObject.put("user_behavior_type", rn.this.f12411tc ? 1 : 2);
                                    jSONObject.put("click_scence", 2);
                                    rn rnVar9 = rn.this;
                                    com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar5 = rnVar9.f12408pd;
                                    if (fkwVar5 != null) {
                                        fkwVar5.f13106jg = jSONObject;
                                    }
                                    if (!rnVar9.f12400cf && !th.bly(vppVar)) {
                                        if (rn.this.f12406lh) {
                                            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, "rewarded_video", "click", jSONObject);
                                        } else {
                                            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, "fullscreen_interstitial_ad", "click", jSONObject);
                                        }
                                        rn.this.f12400cf = true;
                                    }
                                    return false;
                                }
                            } catch (Throwable th2) {
                                Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th2);
                            }
                            return false;
                        }
                    });
                }
                com.bytedance.sdk.component.bly.le leVar3 = rnVar.f12405le;
                if (leVar3 != null) {
                    final bs bsVar2 = rnVar.f12409ra;
                    final com.bytedance.sdk.openadsdk.yu.mwh mwhVar4 = rnVar.tlj;
                    final com.bytedance.sdk.openadsdk.common.fkw fkwVar4 = rnVar.f12403kn;
                    leVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(bsVar2, mwhVar4, fkwVar4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.4
                        @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                        public final void onProgressChanged(WebView webView, int i10) {
                            super.onProgressChanged(webView, i10);
                            yu yuVar2 = yuVar;
                            if (yuVar2 != null) {
                                yuVar2.ouw(webView, i10);
                            }
                        }
                    });
                }
                com.bytedance.sdk.component.bly.le leVar4 = rnVar.f12405le;
                if (leVar4 != null) {
                    com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(rnVar.uq.jvy);
                    lhVarOuw.vt = false;
                    lhVarOuw.ouw = false;
                    lhVarOuw.ouw(leVar4.getWebView());
                    leVar4.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar4.getWebView()));
                    leVar4.setMixedContentMode(0);
                }
                rnVar.f12405le.setLayerType(1, null);
                rnVar.f12405le.setBackgroundColor(-1);
                rnVar.f12405le.setDisplayZoomControls(false);
            }
            DownloadListener downloadListener = new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.6
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str4, String str5, String str6, String str7, long j10) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.yu yuVar2 = rn.this.uq.f12386tc;
                    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar = yuVar2.f12423lh;
                    if (lhVar != null) {
                        lhVar.ouw(yuVar2.ouw);
                    }
                    com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2 = vtVar;
                    if (vtVar2 != null) {
                        vtVar2.kn();
                    }
                }
            };
            com.bytedance.sdk.component.bly.le leVar5 = rnVar.f12405le;
            if (leVar5 != null) {
                leVar5.setDownloadListener(downloadListener);
            }
            this.ouw.bs.ouw();
        }
        final zih zihVar = this.ouw.osn.ouw.yu;
        if (zihVar != null) {
            DeviceUtils.AudioInfoReceiver.ouw(zihVar);
            zihVar.bly = DeviceUtils.ra();
            if (zihVar.vt.cu != null) {
                final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar4 = zihVar.vt.cu;
                final String str4 = "VAST_END_CARD";
                zihVar.f12424le = new com.bytedance.sdk.openadsdk.core.lh.ra(str4, ouwVar4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.1
                };
                com.bytedance.sdk.openadsdk.core.ryl.lh lhVar = zihVar.vt.cu.f13013lh;
                if (lhVar != null) {
                    String strFkw = lhVar.fkw();
                    if (TextUtils.isEmpty(strFkw)) {
                        com.bytedance.sdk.component.bly.le leVar6 = (com.bytedance.sdk.component.bly.le) zihVar.pno.rrs.findViewById(rn.bly);
                        zihVar.f12425lh = leVar6;
                        if (leVar6 != null) {
                            leVar6.o_();
                            com.bytedance.sdk.component.bly.le leVar7 = zihVar.f12425lh;
                            leVar7.setVerticalScrollBarEnabled(false);
                            leVar7.setHorizontalScrollBarEnabled(false);
                            leVar7.setMixedContentMode(0);
                            leVar7.setJavaScriptEnabled(true);
                            leVar7.setJavaScriptCanOpenWindowsAutomatically(true);
                            leVar7.setDomStorageEnabled(true);
                            leVar7.setDatabaseEnabled(true);
                            leVar7.setCacheMode(-1);
                            leVar7.setAllowFileAccess(false);
                            leVar7.setSupportZoom(true);
                            leVar7.setBuiltInZoomControls(true);
                            leVar7.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                            leVar7.setUseWideViewPort(true);
                            zihVar.f12425lh.setDisplayZoomControls(false);
                            zihVar.f12425lh.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.3
                                @Override // android.webkit.WebChromeClient
                                public final void onProgressChanged(WebView webView, int i10) {
                                    super.onProgressChanged(webView, i10);
                                    if (i10 == 100) {
                                        zih.this.ouw(Integer.MAX_VALUE, null);
                                    }
                                }
                            });
                            zihVar.f12425lh.setWebViewClient(new com.bytedance.sdk.component.bly.le.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.4
                                @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                                public void onLoadResource(WebView view, String url) {
                                    super.onLoadResource(view, url);
                                    CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
                                }

                                @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                                public final void onPageFinished(WebView webView, String str5) {
                                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/zih$4;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                                    CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str5);
                                    safedk_zih$4_onPageFinished_48d923944a2b0a0369c1c17cf884901d(webView, str5);
                                }

                                @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                                    return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                                }

                                @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                                public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                                    return CreativeInfoManager.onWebViewResponse(g.f44975u, view, url, super.shouldInterceptRequest(view, url));
                                }

                                @Override // android.webkit.WebViewClient
                                public final boolean shouldOverrideUrlLoading(WebView webView, String str5) {
                                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/zih$4;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                                    boolean zSafedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477 = safedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477(webView, str5);
                                    BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44975u, webView, str5, zSafedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477);
                                    return zSafedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477;
                                }

                                public boolean safedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477(WebView p10, String p11) {
                                    boolean z11;
                                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2;
                                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar5;
                                    com.bytedance.sdk.openadsdk.core.lh.ra raVar2;
                                    zih zihVar2 = zih.this;
                                    if (p11 == null || (vppVar2 = zihVar2.vt) == null || (ouwVar5 = vppVar2.cu) == null || (raVar2 = zihVar2.f12424le) == null) {
                                        z11 = false;
                                    } else {
                                        ouwVar5.ryl = p11;
                                        raVar2.onClick(zihVar2.f12425lh);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        return true;
                                    }
                                    return super.shouldOverrideUrlLoading(p10, p11);
                                }

                                @Override // android.webkit.WebViewClient
                                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                                    if (!webResourceRequest.isForMainFrame()) {
                                        return;
                                    }
                                    int statusCode = webResourceResponse.getStatusCode();
                                    String string = null;
                                    if (webResourceRequest.getUrl() != null) {
                                        string = webResourceRequest.getUrl().toString();
                                    }
                                    zih.this.ouw(statusCode, string);
                                }

                                public void safedk_zih$4_onPageFinished_48d923944a2b0a0369c1c17cf884901d(WebView p10, String p11) {
                                    super.onPageFinished(p10, p11);
                                    zih.this.ouw(Integer.MAX_VALUE, null);
                                }
                            });
                            String strYu = lhVar.yu();
                            if (strYu != null) {
                                zihVar.fkw = true;
                                if (strYu.startsWith("http")) {
                                    zihVar.f12425lh.a_(strYu);
                                } else {
                                    String strOuw = com.bytedance.sdk.openadsdk.core.ryl.fkw.ouw(strYu);
                                    String str5 = TextUtils.isEmpty(strOuw) ? strYu : strOuw;
                                    zihVar.f12425lh.setDefaultTextEncodingName("UTF -8");
                                    zihVar.f12425lh.ouw((String) null, str5, "text/html", "UTF-8", (String) null);
                                }
                            }
                        }
                    } else {
                        zihVar.fkw = true;
                        zihVar.yu = (ImageView) zihVar.pno.rrs.findViewById(rn.pno);
                        int iVt = lhVar.vt();
                        int iLh = lhVar.lh();
                        if (iVt != 0 && iLh != 0 && zihVar.yu != null) {
                            int iYu = osn.yu((Context) zihVar.ouw);
                            int iLe = osn.le(zihVar.ouw);
                            float f10 = iVt / iLh;
                            float f11 = iYu;
                            if (f10 <= f11 / iLe) {
                                iYu = (int) Math.ceil(f11 * f10);
                            } else {
                                iLe = (int) Math.ceil(f11 / f10);
                            }
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zihVar.yu.getLayoutParams();
                            layoutParams.width = iYu;
                            layoutParams.height = iLe;
                            layoutParams.gravity = 17;
                            zihVar.yu.setLayoutParams(layoutParams);
                            zihVar.yu.setOnClickListener(zihVar.f12424le);
                            zihVar.yu.setOnTouchListener(zihVar.f12424le);
                        }
                        com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(strFkw).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw()))).ouw(lhVar.vt()).vt(lhVar.lh()).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(zihVar.vt, strFkw, new zih.ouw(zihVar.yu, strFkw, zihVar, zihVar.f12426ra)));
                    }
                }
            }
        }
        if (th.yu(this.ouw.vt) || th.ra(this.ouw.vt)) {
            this.tlj.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.ouw;
        ouwVar5.ey.ouw(ouwVar5.f12389vh == 100.0f);
        final tlj tljVar = this.ouw.f12371cd;
        tljVar.f12420lh.ouw(tljVar.ouw.jvy.findViewById(R.id.content));
        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar2 = tljVar.ouw.f12386tc.f12423lh;
        if (lhVar2 != null) {
            tljVar.f12420lh.ouw(lhVar2);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar2 = tljVar.ouw.ksc;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar5 = tljVar.f12420lh;
        bly blyVar2 = pnoVar2.ouw;
        if (blyVar2 != null) {
            blyVar2.ouw(fkwVar5);
        }
        tljVar.f12420lh.ouw(new com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.tlj.3
            @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw
            public final long getVideoProgress() {
                return tlj.this.ouw.ex.fkw();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = tljVar.ouw.ey;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar6 = tljVar.f12420lh;
        rylVar.ouw(fkwVar6, fkwVar6, tljVar.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.fkw fkwVar7 = tljVar.ouw.osn;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar8 = tljVar.f12420lh;
        final com.bytedance.sdk.openadsdk.component.reward.view.pno pnoVar3 = fkwVar7.ouw;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = pnoVar3.vt;
        if (rFEndCardBackUpLayout != null) {
            osn.ouw(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.pno.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/pno$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_pno$1_onClick_b8c4009acdeb4f13941bab8c8091eeec(view);
                }

                public void safedk_pno$1_onClick_b8c4009acdeb4f13941bab8c8091eeec(View p10) {
                }
            }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
            zih zihVar2 = pnoVar3.yu;
            if (zihVar2 != null && (raVar = zihVar2.f12424le) != null) {
                raVar.vt = fkwVar8;
            }
        }
        this.ryl = tljVar.f12420lh;
        ra();
    }

    public final void ko() {
        jae jaeVar = this.tlj;
        if (jaeVar != null) {
            jaeVar.removeMessages(d.f44769a);
        }
    }

    public final void mwh() {
        com.bytedance.sdk.openadsdk.core.widget.vt vtVar = this.mwh;
        if (vtVar == null || !vtVar.isShowing()) {
            return;
        }
        this.mwh.dismiss();
    }

    public RFEndCardBackUpLayout pno() {
        return new RFEndCardBackUpLayout(this.ouw.hun);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    public final void qbp() {
        boolean z10;
        int iNg;
        ryl rylVar;
        boolean z11;
        vm vmVar;
        bly blyVar = this.ouw.ksc.ouw;
        boolean z12 = true;
        if (blyVar == null || (vmVar = blyVar.qbp) == null || vmVar.ouw || !vmVar.tlj()) {
            z10 = false;
        } else {
            vmVar.vt();
            z10 = true;
        }
        if (z10) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.rn(String.valueOf(this.ouw.f12378le)) == 1) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            if (od.lh(ouwVar.vt)) {
                iNg = ouwVar.vt.njr();
            } else {
                iNg = ouwVar.yu ? ouwVar.vt.ng() : ouwVar.vt.myk();
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = this.ouw.ey;
            if (rylVar2 != null && rylVar2.bly()) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar3 = ouwVar2.ey;
                if (rylVar3 == null || rylVar3.tlj() == null) {
                    return;
                }
                ouwVar2.ey.tlj().performClick();
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.ouw;
            if (iNg == -1) {
                z12 = false;
            } else {
                boolean z13 = !ouwVar3.tlj.get() || od.lh(ouwVar3.vt);
                ko koVar = ouwVar3.ex;
                boolean z14 = koVar != null && koVar.pno >= ((long) iNg) * 1000;
                com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar = ouwVar3.ksc;
                if (pnoVar == null) {
                    z11 = false;
                } else {
                    bly blyVar2 = pnoVar.ouw;
                    if (blyVar2 != null ? blyVar2.bly() : false) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (!z13 || (!z14 && !z11)) {
                    z12 = false;
                }
            }
            if (!z12 || (rylVar = this.ouw.uoy) == null) {
                return;
            }
            rylVar.lh();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    public final void rn() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2;
        int i10;
        if (this.ouw.f12374gh != null || (!od.vt(this.vt) && !od.lh(this.vt))) {
            if (this.ouw.tlj.get()) {
                ouwVar2 = this.ouw;
                if (!ouwVar2.f12383ra && ouwVar2.zin.getAndSet(false) && ((i10 = this.ouw.pno) >= 0 || i10 == -1)) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 700;
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.ouw;
                    messageObtain.arg1 = ouwVar3.pno;
                    ouwVar3.ux.sendMessage(messageObtain);
                }
            }
            ouwVar = this.ouw;
            if (ouwVar.bly > 0 && ouwVar.vpp.getAndSet(false)) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = TypedValues.Custom.TYPE_INT;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.ouw;
                messageObtain2.arg1 = ouwVar4.bly;
                ouwVar4.ux.sendMessage(messageObtain2);
            }
        } else if (od.pno(this.vt)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = this.ouw.bs;
            if (rnVar.yib && !rnVar.bs) {
                if (this.ouw.tlj.get()) {
                    ouwVar2 = this.ouw;
                    if (!ouwVar2.f12383ra) {
                        Message messageObtain3 = Message.obtain();
                        messageObtain3.what = 700;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.ouw;
                        messageObtain3.arg1 = ouwVar5.pno;
                        ouwVar5.ux.sendMessage(messageObtain3);
                    }
                }
                ouwVar = this.ouw;
                if (ouwVar.bly > 0) {
                    Message messageObtain4 = Message.obtain();
                    messageObtain4.what = TypedValues.Custom.TYPE_INT;
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar6 = this.ouw;
                    messageObtain4.arg1 = ouwVar6.bly;
                    ouwVar6.ux.sendMessage(messageObtain4);
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar7 = this.ouw;
        if (ouwVar7 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.jg jgVar = ouwVar7.f12385sd;
        if (jgVar != null) {
            jgVar.ouw();
        }
        this.ouw.kfa = SystemClock.elapsedRealtime();
    }

    public final View tlj() {
        com.bytedance.sdk.openadsdk.core.le.ra raVar;
        if (this.vt.zih() != 5) {
            raVar = new com.bytedance.sdk.openadsdk.core.le.ra(this.ouw.jvy);
            raVar.setId(rn.f13438uj);
        } else {
            raVar = null;
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFAdType", "getLoadingFrameView".concat(String.valueOf(raVar)));
        return raVar;
    }

    public final void vm() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = ouwVar.ey;
        if (rylVar != null) {
            rylVar.rn();
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFAdType", "onStop mIsMute=" + this.ouw.f12373cj + " mLast=" + this.ouw.fvf.vt + " mVolume=" + DeviceUtils.ra());
        this.ouw.bs.pno();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
        if (ouwVar2.f12373cj) {
            ouwVar2.jvy.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.mwh.bly blyVar = vt.this.ouw.fvf;
                    int iPno = blyVar.vt;
                    if (iPno <= 0 || blyVar.ouw == null) {
                        return;
                    }
                    int i10 = 0;
                    if (iPno == 0) {
                        iPno = DeviceUtils.pno() / 15;
                        i10 = 1;
                    } else if (iPno == -1) {
                        return;
                    }
                    com.bytedance.sdk.component.utils.ko.vt("VolumeChangeObserver", "not mute set volume to " + iPno + " mLastVolume=" + blyVar.vt);
                    blyVar.vt = -1;
                    try {
                        blyVar.ouw.setStreamVolume(3, iPno, i10);
                    } catch (Throwable unused) {
                    }
                    blyVar.f13268lh = true;
                }
            });
        }
    }

    public final void vt(boolean z10) {
        try {
            com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.ouw.jae;
            if (tljVar != null && !z10) {
                tljVar.vt();
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = this.ouw.ey;
            if (rylVar != null) {
                rylVar.jg();
            }
            this.ouw.ex.vm();
            if (!fkw()) {
                this.ouw.tlj.get();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = this.ouw.bs;
            if (rnVar != null) {
                rnVar.fkw();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar = this.ouw.ksc;
            if (pnoVar != null) {
                pnoVar.vt(com.bytedance.sdk.openadsdk.component.reward.ouw.pno.vt);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = this.ouw.ey;
            if (rylVar2 != null) {
                rylVar2.ryl();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.fkw fkwVar = this.ouw.osn;
            if (fkwVar != null) {
                fkwVar.ouw();
            }
            com.bytedance.sdk.openadsdk.utils.jg jgVar = this.ouw.f12385sd;
            if (jgVar != null) {
                jgVar.lh();
            }
        } catch (Throwable unused) {
        }
    }

    public final void zih() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar == null) {
            return;
        }
        try {
            ouwVar.pv = false;
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFAdType", "onPause mIsActivityShow=" + this.ouw.pv + " mIsMute=" + this.ouw.f12373cj);
            if (!this.ouw.f12372cf.get()) {
                this.ouw.ex.ra();
            }
            ko();
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = this.ouw.bs;
            com.bytedance.sdk.component.bly.le leVar = rnVar.f12405le;
            if (leVar != null) {
                leVar.pno();
            }
            if (rnVar.osn > 0) {
                rnVar.ey += SystemClock.elapsedRealtime() - rnVar.osn;
                rnVar.osn = 0L;
            }
            bs bsVar = rnVar.f12409ra;
            if (bsVar != null) {
                bsVar.f12592vm = false;
                com.bytedance.sdk.openadsdk.component.reward.ouw.rn.ouw(bsVar, false);
                rnVar.ouw(rnVar.f12409ra, true, false);
            }
            this.ouw.ksc.le();
            this.ouw.vpp.set(true);
            if (this.ouw.tlj.get()) {
                this.ouw.zin.set(true);
            }
            com.bytedance.sdk.openadsdk.utils.jg jgVar = this.ouw.f12385sd;
            if (jgVar != null) {
                jgVar.vt();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.kfa <= 0) {
                ouwVar2.kfa = SystemClock.elapsedRealtime();
            }
            ouwVar2.yw += SystemClock.elapsedRealtime() - ouwVar2.kfa;
        } catch (Throwable unused) {
        }
    }

    public final void zin() {
        this.ouw.uoy.vt();
        this.ouw.uoy.fkw(true);
    }

    public vt(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    public final void vpp() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        int i10;
        boolean z10;
        boolean z11 = true;
        boolean z12 = false;
        if (!le() && ((this instanceof ra) || (this instanceof pno))) {
            tlj tljVar = this.ouw.f12371cd;
            if (!tljVar.ouw.mwh.get()) {
                com.bytedance.sdk.openadsdk.activity.pno pnoVar = tljVar.ouw.f12374gh;
                if (pnoVar != null && (pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = tljVar.ouw;
                    if (!ouwVar.pv && !ouwVar.f12374gh.f12111th) {
                        return;
                    }
                }
                if (tljVar.ouw.mwh.compareAndSet(false, true)) {
                    JSONObject jSONObject = new JSONObject();
                    int iFkw = -1;
                    try {
                        if (tljVar.ouw.vt.lh()) {
                            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = tljVar.ouw;
                            if (ouwVar2.jae != null && ouwVar2.vt.rn() == 2) {
                                jSONObject.put("dynamic_show_type", tljVar.ouw.jae.fkw());
                                tljVar.ouw.jae.ouw(jSONObject);
                                iFkw = tljVar.ouw.jae.fkw();
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                        try {
                            View viewFindViewById = tljVar.ouw.jvy.findViewById(R.id.content);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("width", viewFindViewById.getWidth());
                            jSONObject2.put("height", viewFindViewById.getHeight());
                            jSONObject2.put("alpha", viewFindViewById.getAlpha());
                            jSONObject.put("root_view", jSONObject2.toString());
                            i10 = iFkw;
                            z10 = z11;
                        } catch (Throwable th2) {
                            z12 = z11;
                            th = th2;
                            qbp.ouw("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th);
                            i10 = iFkw;
                            z10 = z12;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    tljVar.ouw(jSONObject, tljVar.vt(), z10, i10, false);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.bly.ouw(this.fkw.ouw, false)) {
            this.tlj.removeMessages(d.f44769a);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.ouw;
            if (ouwVar3.euf) {
                com.bytedance.sdk.openadsdk.activity.pno pnoVar2 = ouwVar3.f12374gh;
                if (pnoVar2 instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                    ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar2).tc();
                } else {
                    ouw(com.bytedance.sdk.openadsdk.yu.vt.C0161vt.ouw);
                    ko koVar = this.fkw;
                    koVar.ouw(1 ^ (koVar.qbp() ? 1 : 0), 4);
                }
            } else {
                ouw(com.bytedance.sdk.openadsdk.yu.vt.C0161vt.ouw);
                ko koVar2 = this.fkw;
                koVar2.ouw(1 ^ (koVar2.qbp() ? 1 : 0), 4);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.ouw;
        if (ouwVar4 != null && (vppVar = ouwVar4.vt) != null && ouwVar4.f12385sd != null && vppVar.lso()) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.ouw;
            ouwVar5.f12385sd.ouw(ouwVar5.ex.rn());
        }
    }

    public void ouw(com.bytedance.sdk.openadsdk.component.reward.view.bly blyVar) {
        ouw(blyVar, this.ouw);
    }

    public final void ouw(boolean z10, boolean z11, boolean z12, int i10) {
        this.ouw.osn.ouw(z10, z11, z12, this, i10);
    }

    private void ouw(int i10) {
        this.fkw.tlj();
        ouw(false, true, false, i10);
        if (this.ouw.yu) {
            this.bly.jvy();
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x021a  */
    public final void ouw(Message message) {
        th thVar;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFAdType", "handleMsg: " + message.what);
        int i10 = message.what;
        if (i10 == 1) {
            zin();
            return;
        }
        if (i10 == 300) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            if (ouwVar.euf) {
                com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f12374gh;
                if (pnoVar instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                    ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar).tc();
                } else {
                    ouw(com.bytedance.sdk.openadsdk.yu.vt.C0161vt.vt);
                    ko koVar = this.ouw.ex;
                    koVar.ouw(!koVar.qbp() ? 1 : 0, 1 ^ (this.ouw.ex.qbp() ? 1 : 0));
                }
            } else {
                ouw(com.bytedance.sdk.openadsdk.yu.vt.C0161vt.vt);
                ko koVar2 = this.ouw.ex;
                koVar2.ouw(!koVar2.qbp() ? 1 : 0, 1 ^ (this.ouw.ex.qbp() ? 1 : 0));
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar2.vt, "play_video_time_out", ouwVar2.fkw, (String) null);
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.ouw.vt.sd();
            if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.GENERAL_LINEAR_AD_ERROR);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = this.ouw.ey;
            if (rylVar == null || (thVar = rylVar.f12468rn) == null) {
                return;
            }
            thVar.le();
            return;
        }
        if (i10 == 400) {
            this.ouw.ex.tlj();
            ouw(false, true, false, 3);
            return;
        }
        if (i10 == 500) {
            if (!od.fkw(this.ouw.vt)) {
                this.ouw.uoy.lh(false);
            }
            com.bytedance.sdk.component.bly.le leVar = this.ouw.bs.f12405le;
            if (leVar != null && leVar.getWebView() != null) {
                leVar.le();
                leVar.getWebView().resumeTimers();
            }
            com.bytedance.sdk.component.bly.le leVar2 = this.ouw.bs.f12405le;
            if (leVar2 != null) {
                osn.ouw((View) leVar2, 1.0f);
                this.ouw.ey.ouw(1.0f);
            }
            if (!this.ouw.vt.ey() && this.ouw.ex.ouw() && this.ouw.f12391vm.get()) {
                this.ouw.ex.tlj();
                return;
            }
            return;
        }
        if (i10 == 600) {
            jg();
            return;
        }
        if (i10 == 700) {
            int i11 = message.arg1;
            if (this.ouw.zin.get()) {
                return;
            }
            if (i11 > 0) {
                this.ouw.uoy.ouw();
                this.ouw.uoy.ouw((i11 / 1000) + "s");
                this.ouw.uoy.fkw(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = i11 - 1000;
                this.ouw.pno -= 1000;
                this.tlj.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            this.tlj.removeMessages(700);
            if (od.ra(this.vt) && this.ouw.bs.ryl.get()) {
                zin();
                return;
            } else {
                jg();
                return;
            }
        }
        if (i10 != 800) {
            if (i10 == 900 && !this.ouw.vpp.get()) {
                int i12 = message.arg1;
                double dZin = this.ouw.ex.zin();
                long j10 = (long) (1000.0d * dZin);
                long j11 = j10 - ((long) i12);
                Activity activity = this.ouw.jvy;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).vt(j11, j10);
                }
                if (i12 > 0) {
                    this.ouw.uoy.ouw();
                    this.ouw.uoy.ouw((i12 / 1000) + "s");
                    this.ouw.uoy.fkw(false);
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = TypedValues.Custom.TYPE_INT;
                    int i13 = i12 - 1000;
                    messageObtain2.arg1 = i13;
                    this.ouw.bly = i13;
                    this.tlj.sendMessageDelayed(messageObtain2, 1000L);
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.ouw;
                    if (ouwVar3.euf) {
                        com.bytedance.sdk.openadsdk.activity.pno pnoVar2 = ouwVar3.f12374gh;
                        if (!(pnoVar2 instanceof com.bytedance.sdk.openadsdk.activity.ouw) || dZin <= 0.0d) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar2).ouw((float) (1.0d - (((double) (i12 / 1000.0f)) / dZin)));
                        return;
                    }
                    return;
                }
                this.tlj.removeMessages(TypedValues.Custom.TYPE_INT);
                jg();
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.ouw;
                com.bytedance.sdk.openadsdk.activity.pno pnoVar3 = ouwVar4.f12374gh;
                if (ouwVar4.euf && (pnoVar3 instanceof com.bytedance.sdk.openadsdk.activity.ouw)) {
                    pnoVar3.hun().ouw(pnoVar3, new com.bytedance.sdk.openadsdk.activity.vt.fkw(5, this.ouw));
                    return;
                }
                return;
            }
            return;
        }
        if (!od.vt(this.ouw.vt)) {
            this.ouw.uoy.lh(false);
        }
        this.ouw.ey.ouw(1.0f);
        if (!this.ouw.vt.ey() && this.ouw.ex.ouw() && this.ouw.f12391vm.get()) {
            this.ouw.ex.tlj();
        }
    }

    public static void ouw(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        final com.bytedance.sdk.openadsdk.core.le.yu yuVar;
        Context context = frameLayout.getContext();
        if (ouwVar.lvd) {
            com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
            lhVar.setId(rn.tlj);
            frameLayout.addView(lhVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutOuw = ouw(context);
            String str = "";
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(ouwVar.vt)) {
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = ouwVar.vt.f12874sd;
                if (vtVar != null) {
                    str = vtVar.f10457le;
                }
            } else {
                List<com.bytedance.sdk.openadsdk.core.model.zih> list = ouwVar.vt.f12877tc;
                if (list != null && !list.isEmpty()) {
                    str = list.get(0).ouw;
                }
            }
            if (TextUtils.isEmpty(str)) {
                yuVar = null;
            } else {
                yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
                int i10 = rn.bu;
                yuVar.setId(i10);
                yuVar.setTag(i10, str);
                yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutOuw.addView(yuVar);
            }
            lhVar.addView(frameLayoutOuw);
            lhVar.addView(new com.bytedance.sdk.openadsdk.core.widget.cf(context), new FrameLayout.LayoutParams(-1, -1));
            View fkwVar = new com.bytedance.sdk.openadsdk.component.reward.view.fkw(context);
            fkwVar.setId(rn.ryl);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(fkwVar, layoutParams);
            fkwVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.vt.3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = ouwVar.rrs.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = ouwVar.rrs.findViewById(rn.f13422lk);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = ouwVar.rrs.findViewById(rn.elx);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = yuVar;
                    if (yuVar2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = yuVar2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            yuVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
            fkwVar2.setId(rn.mwh);
            fkwVar2.setOrientation(1);
            fkwVar2.setVisibility(8);
            frameLayout.addView(fkwVar2, new FrameLayout.LayoutParams(-1, -1));
        }
        if (ouwVar.lso) {
            View leVar = new com.bytedance.sdk.component.bly.le(context, true, com.bytedance.sdk.component.bly.le.lh.ENDCARD);
            leVar.setId(rn.f13415jg);
            leVar.setLayerType(2, null);
            leVar.setVisibility(4);
            if (!ouwVar.npr && th.le(ouwVar.vt)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = osn.ouw(ouwVar.hun, 58.0f);
                frameLayout.addView(leVar, layoutParams2);
            } else {
                frameLayout.addView(leVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(rn.f13419ko);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (od.vt(ouwVar.vt)) {
                View lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
                lhVar2.setId(rn.ybr);
                lhVar2.setVisibility(4);
                frameLayout.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public static FrameLayout ouw(Context context) {
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar.setId(rn.f13408cf);
        lhVar.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        lhVar.setLayoutParams(layoutParams);
        return lhVar;
    }
}
