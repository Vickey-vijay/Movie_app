package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.ryl;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.jae;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ra extends ouw {
    private static String ex;
    private static String jqy;
    private static String ksc;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private static String f12116tc;
    private static String vpp;
    private int jae;

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean d_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String e_() {
        return "rewarded_video";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x007c  */
    public void yib() {
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        this.bly.ex.zih();
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.ouw(this.bly.ex.fkw());
        ouwVar.vt(this.bly.ex.ko());
        ouwVar.vt = this.bly.ex.pno();
        ouwVar.tlj = 3;
        ouwVar.ryl = this.bly.ex.jg();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = this.bly.ex;
        ouwVar.f13478le = koVar.f12352jg;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(koVar.lh(), ouwVar, this.bly.ex.zin);
        jae.ouw(this.bly.f12378le);
        this.bly.ex.ouw("skip", false);
        if (this.bly.f12379lh) {
            fkw();
            if (th.ouw(this.bly.vt) && !this.bly.f12384rn.get()) {
                lso();
            }
        } else {
            lso();
        }
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.bly.vt.sd();
        if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
            long jFkw = this.bly.ex.fkw();
            yuVar.fkw(jFkw);
            yuVar.yu(jFkw);
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.bly.vt, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void b_() {
        vt vtVar = this.f12109ra;
        if (vtVar != null && vtVar.vpp) {
            super.b_();
            return;
        }
        final View viewTlj = this.bly.ey.tlj();
        if (viewTlj != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.ra.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/ra$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_ra$1_onClick_3f17a61493a760cd02e473c041e89efe(view);
                }

                public void safedk_ra$1_onClick_3f17a61493a760cd02e473c041e89efe(View p10) {
                    if (ra.this.bly.bs.cf() && ra.this.bly.tlj.get()) {
                        boolean z10 = ra.this.bly.fak.fkw.get();
                        ra.this.bly.bs.yu(z10);
                        ra.this.bly.ey.le(8);
                        ra.this.bly.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(ra.this.bly.vt)) {
                            return;
                        }
                        if (vpp.lh(ra.this.bly.vt) && z10) {
                            return;
                        }
                    }
                    ra.this.bly.bs.ryl();
                    ra.this.bly.fak.fkw();
                    ra.this.bly.f12371cd.lh();
                    if (od.yu(ra.this.bly.vt)) {
                        ra.this.ouw(true, true, (Runnable) null);
                    } else {
                        ra.this.lso();
                    }
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.bly.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.ra.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                ra raVar = ra.this;
                raVar.ouw(od.lh(raVar.bly.vt), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                ra.this.ouw(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                ra.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
                ra raVar = ra.this;
                raVar.vt(raVar.bly);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw
    public final FrameLayout bly() {
        ryl rylVar;
        tlj tljVar;
        if (this.f12108le.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
            if (ouwVar == null || (tljVar = ouwVar.jae) == null) {
                return null;
            }
            return tljVar.ouw();
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        if (ouwVar2 == null || (rylVar = ouwVar2.ey) == null) {
            return null;
        }
        return rylVar.le();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void f_() {
        this.bly.f12382pd.ouw(((ouw) this).vt);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean g_() {
        return this.bly.f12373cj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw
    public final void vt() {
        this.bly.uoy.ouw(null, TTAdDislikeToast.getSkipText());
        this.bly.uoy.fkw(true);
    }

    public ra(vt vtVar, vpp vppVar, int i10, int i11, boolean z10) {
        super(vtVar, vppVar, i10, i11, z10);
        this.jae = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void rrs() {
        super.rrs();
        this.fkw = false;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.jae.fkw = false;
        ouwVar.ex.tc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void vm() {
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, vt.fkw fkwVar) {
        vt vtVar;
        super.ouw(activity, fkwVar);
        if (com.bytedance.sdk.component.utils.vt.ouw(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.f12107ko = intent.getStringExtra("media_extra");
        this.f12106jg = intent.getStringExtra("user_id");
        try {
            if (f12116tc == null) {
                f12116tc = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_reward_msg");
                vpp = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_msgPlayable");
                ex = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_negtiveBtnBtnText");
                ksc = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnText");
                jqy = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.RewardAdScene", th2.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null || (vtVar = this.f12109ra) == null) {
            return;
        }
        ouwVar.ycd = vtVar.f12123le;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(String str) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2;
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = ((ouw) this).vt;
        if (vtVar != null && vtVar.yu() != null) {
            ((ouw) this).vt.yu().ouw(this.bly.f12373cj);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        boolean z10 = !ouwVar.f12373cj;
        ouwVar.f12373cj = z10;
        tlj tljVar = ouwVar.jae;
        if (tljVar != null && (yuVar2 = tljVar.ouw) != null) {
            yuVar2.setSoundMute(z10);
        }
        com.bytedance.sdk.component.utils.ko.ouw("TTAD.RewardAdScene", "rewarded_video", "will set is Mute " + this.bly.f12373cj + " mLastVolume=" + this.bly.fvf.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        ouwVar2.ex.ouw(ouwVar2.f12373cj, str);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
        ouwVar3.bs.lh(ouwVar3.f12373cj);
        vpp vppVar = this.bly.vt;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.bly;
        if (ouwVar4.f12373cj) {
            yuVar.ra(ouwVar4.ex.fkw());
        } else {
            yuVar.pno(ouwVar4.ex.fkw());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ouw(final boolean z10, boolean z11, final Runnable runnable) {
        if (!z11 && this.f12109ra.yu.getBoolean("user_has_give_up_reward", false) && runnable != null) {
            return false;
        }
        zih.yu();
        if (!cf.le(String.valueOf(this.bly.f12378le))) {
            if (runnable == null) {
                if (z10) {
                    lso();
                    return false;
                }
                yib();
            }
            return false;
        }
        if (this.f12109ra.yu.getBoolean("reward_verify", false)) {
            if (runnable == null) {
                if (z10) {
                    lso();
                    return false;
                }
                yib();
            }
            return false;
        }
        this.bly.qbp.set(true);
        this.bly.ex.ryl();
        if (z10) {
            this.bly.ksc.yu();
        }
        final com.bytedance.sdk.openadsdk.core.widget.vt vtVar = new com.bytedance.sdk.openadsdk.core.widget.vt(ux());
        ((ouw) this).vt.mwh = vtVar;
        if (z10) {
            vtVar.ouw = vpp;
            vtVar.vt = jqy;
            vtVar.f13159lh = ex;
        } else {
            vtVar.ouw = f12116tc;
            vtVar.vt = ksc;
            vtVar.f13159lh = ex;
        }
        vtVar.yu = new com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt() { // from class: com.bytedance.sdk.openadsdk.activity.ra.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt
            public final void ouw() {
                ra.this.bly.ex.cf();
                if (z10) {
                    ra.this.bly.ksc.ouw(1000);
                }
                vtVar.dismiss();
                ra.this.bly.qbp.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt
            public final void vt() {
                vtVar.dismiss();
                ra.this.f12109ra.yu.putBoolean("user_has_give_up_reward", true);
                ra.this.bly.qbp.set(false);
                ra.this.bly.ksc.fkw();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z10) {
                    ra.this.yib();
                } else {
                    ra.this.bly.f12371cd.lh();
                    ra.this.lso();
                }
            }
        };
        vtVar.show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.bly.f12374gh != null && this.f12109ra.tlj.mwh() == null) {
            vt vtVar = this.f12109ra;
            if (vtVar != null && vtVar.vpp) {
                com.bytedance.sdk.openadsdk.common.zih zihVar = this.zin;
                if (zihVar != null && zihVar.ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ra.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ra.super.ouw(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ra.5
                @Override // java.lang.Runnable
                public final void run() {
                    ra.super.ouw(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.ouw(str, jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        if (ouwVar.f12379lh) {
            fkw();
            if (th.ouw(ouwVar.vt) && !ouwVar.f12384rn.get()) {
                lso();
            }
        } else {
            lso();
        }
        com.bytedance.sdk.openadsdk.common.ouw.vt(ouwVar);
    }
}
