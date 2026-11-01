package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.common.zih;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class fkw extends pno implements jae.ouw {
    private static String ex;
    private static String fkw;
    private static String jqy;
    private static String vpp;
    private static String yu;
    private boolean bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f12093cd;
    private boolean fak;
    private int fvf;
    private vt.fkw jae;
    private int ksc;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    @Nullable
    public com.bytedance.sdk.openadsdk.component.reward.vt.vt f12094lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f12095od;
    public boolean ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private JSONObject f12096pd;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private Bundle f12097tc;
    private long uq;
    public final jae vt;

    public fkw(vt vtVar, vpp vppVar, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        super(vtVar, vppVar, i10, i11, z11);
        jae jaeVar = new jae(Looper.getMainLooper(), this);
        this.vt = jaeVar;
        boolean z13 = false;
        this.ksc = 0;
        this.fak = true;
        this.f12110rn = z10;
        this.mwh = vtVar.ouw();
        this.bs = z10 && od.lh(vppVar);
        this.ouw = z12;
        this.bs = this.f12110rn && od.lh(vppVar);
        Bundle bundle = this.f12097tc;
        Activity activityUx = ux();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(activityUx, jaeVar, vppVar, this, 2, this.f12109ra.zin);
        this.bly = ouwVar;
        ouwVar.odc = this.f12110rn;
        boolean z14 = this.ouw;
        ouwVar.npr = z14;
        if (ouwVar.euf && !z14) {
            z13 = true;
        }
        ouwVar.f12392xn = z13;
        vt vtVar2 = this.f12109ra;
        ouwVar.euf = vtVar2.bly;
        ouwVar.njr = this.mwh;
        ouwVar.mq = vtVar2.f12120cf;
        if (!z14) {
            ouwVar.f12370an = vtVar2.tlj.ryl();
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        ouwVar2.f12374gh = this;
        ouwVar2.fvf = this.f12109ra.fkw;
        com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(this.bly, activityUx.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVarOuw = com.bytedance.sdk.openadsdk.component.reward.vt.le.ouw(this.bly);
        this.f12094lh = vtVarOuw;
        this.bly.coz = vtVarOuw;
        ko.vt("TTAD.EndCardScene", "init: mAdType = " + this.f12094lh);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void bs() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ko() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void lh(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final boolean ouw(long j10, boolean z10) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final View rn() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ryl() {
    }

    private void fvf() {
        if (this.f12095od) {
            return;
        }
        this.f12095od = true;
        if (this.mwh) {
            this.f12109ra.ouw(this.bly.rrs, fqk());
        } else {
            this.f12109ra.ouw(this.bly.rrs);
        }
        this.f12094lh.jqy();
    }

    private void pd() {
        if (this.f12093cd) {
            return;
        }
        this.f12093cd = true;
        if (!this.ouw) {
            this.bly.f12370an = this.f12109ra.tlj.ryl();
        }
        this.bly.rrs.ouw(this.f12094lh);
        this.f12094lh.ouw(this, this.vt);
        this.f12094lh.cf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yib() {
        vt.fkw fkwVar = new vt.fkw(7, this.bly);
        fkwVar.yu = this.bly.f12373cj;
        this.f12109ra.vt(this, fkwVar);
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/fkw$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_fkw$1_onClick_16552ef0ea01508b24ccb660934f0e90(view);
                }

                public void safedk_fkw$1_onClick_16552ef0ea01508b24ccb660934f0e90(View p10) {
                    if (fkw.this.bly.bs.cf()) {
                        boolean z10 = fkw.this.bly.fak.fkw.get();
                        fkw.this.bly.bs.yu(z10);
                        fkw.this.bly.ey.le(8);
                        View view = viewTlj;
                        if (view instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                            ((com.bytedance.sdk.openadsdk.core.le.yu) view).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(fkw.this.bly.hun, "tt_close_btn"));
                        }
                        fkw.this.bly.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(fkw.this.bly.vt)) {
                            return;
                        }
                        if (vpp.lh(fkw.this.bly.vt) && z10) {
                            return;
                        }
                    }
                    fkw.this.bly.bs.ryl();
                    fkw.this.bly.fak.fkw();
                    fkw.this.bly.f12371cd.lh();
                    if (od.yu(fkw.this.bly.vt) && fkw.this.ouw(true, true, (Runnable) null)) {
                        return;
                    }
                    fkw.this.lso();
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.bly.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                fkw fkwVar = fkw.this;
                if (fkwVar.ouw(od.lh(fkwVar.bly.vt), false, (Runnable) null) || fkw.this.bly()) {
                    return;
                }
                if (!od.fkw(fkw.this.bly.vt)) {
                    if (!th.ouw(fkw.this.bly.vt) || fkw.this.bly.f12384rn.get()) {
                        fkw.this.lso();
                        return;
                    } else {
                        fkw.this.lso();
                        return;
                    }
                }
                if (od.pno(fkw.this.bly.vt)) {
                    fkw.this.bly.ksc.ra();
                    return;
                }
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                } else {
                    fkw.this.lso();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                fkw.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
                fkw fkwVar = fkw.this;
                fkwVar.vt(fkwVar.bly);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                fkw.this.ouw(str);
            }
        });
    }

    public final boolean bly() {
        vt vtVar;
        if (this.ouw || (vtVar = this.f12109ra) == null || !vtVar.tlj.yu()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), this.f12108le, this.bly.fkw, "skip", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.3
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() {
                    if (fkw.this.f12096pd != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", fkw.this.bly.ouw);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject vt() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", fkw.this.uq);
                        jSONObject.put("percent", fkw.this.fvf);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
        this.f12109ra.ouw(this, true, false, false, 4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void cf() {
        if (this.f12109ra == null) {
            return;
        }
        this.bly.osn.ouw(this.jae.ouw.getBoolean("isSkip", false), this.jae.ouw.getBoolean("force", false), this.jae.ouw.getBoolean("isFromLandingPage", false), this.f12094lh, this.jae.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean d_() {
        return this.bly.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String e_() {
        return this.bly.fkw;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String ex() {
        return this.bly.f12388ub;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void f_() {
        this.bly.f12382pd.ouw(this.f12094lh);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean g_() {
        return this.bly.f12373cj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean jqy() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        return ouwVar != null && ouwVar.ex.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ksc() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void le() {
        qbp.ouw("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.tlj + ",scene = " + this);
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            vtVar.ouw(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void lh() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        boolean z10;
        super.lh();
        if (this.bly == null || (vtVar = this.f12094lh) == null) {
            return;
        }
        vtVar.rn();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.pv = true;
        if (ouwVar.tlj.get() && this.bly.f12383ra) {
            z10 = false;
        } else {
            z10 = this.f12108le.lh() ? this.bly.tlj.get() : true;
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            ouwVar2.uoy.ouw(ouwVar2.vt.ksc());
        }
        this.bly.ey.ko();
        this.bly.bs.tlj();
        this.bly.ksc.lh();
        if (this.f12094lh.vt()) {
            this.bly.ex.ouw(this.f12094lh);
            this.bly.ex.ouw(this, this.ksc != 0);
        }
        this.ksc++;
        tlj tljVar = this.bly.jae;
        if (tljVar != null) {
            tljVar.lh();
        }
        this.bly.f12381od.ouw(this.vt);
    }

    public final boolean od() {
        return this.bly.bs.vm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ra() {
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            vtVar.vt(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void vt(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.tlj tljVar;
        long j10 = this.fak ? this.bly.myk : 0L;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && (tljVar = ouwVar.f12371cd) != null) {
            tljVar.vt(z10);
            this.bly.f12371cd.lh(z10);
            if (z10 && j10 > 0) {
                this.bly.myk = j10;
            }
        }
        if (z10) {
            this.fak = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void yu() {
        super.yu();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12094lh;
        if (vtVar == null) {
            return;
        }
        vtVar.vm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void zih() {
        if (this.bly.f12375jg.getAndSet(true)) {
            return;
        }
        this.bly.f12371cd.ouw();
    }

    private void yhj() {
        try {
            pd();
        } catch (Throwable th2) {
            ko.lh("TTAD.EndCardScene", "onCreate: ", th2);
            lso();
        }
        fvf();
        if (th.le(this.f12108le) && !this.ouw) {
            vh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void jg() {
        super.jg();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12094lh;
        if (vtVar == null) {
            return;
        }
        vtVar.zih();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void mwh() {
        super.mwh();
        if (this.bly != null && !com.bytedance.sdk.component.utils.vt.ouw(ux())) {
            this.bly.bs.rn();
            com.bytedance.sdk.openadsdk.utils.yu.ouw(ux(), this.bly.vt);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, Bundle bundle) {
        this.f12097tc = bundle;
        super.ouw(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void qbp() {
        super.qbp();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12094lh;
        if (vtVar == null) {
            return;
        }
        vtVar.th();
    }

    public final void tc() {
        if (fqk()) {
            return;
        }
        vt.fkw fkwVar = new vt.fkw(8, this.bly);
        fkwVar.yu = this.bly.f12373cj;
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            vtVar.ouw(this, fkwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void vm() {
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void zin() {
        super.zin();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12094lh;
        if (vtVar != null) {
            vtVar.qbp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final com.bytedance.sdk.openadsdk.component.reward.view.bly ouw() {
        return this.bly.rrs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.StringBuilder] */
    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, vt.fkw fkwVar) {
        vt vtVar;
        vt vtVar2;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        this.jae = fkwVar;
        Intent intent = activity.getIntent();
        this.f12107ko = intent.getStringExtra("media_extra");
        this.f12106jg = intent.getStringExtra("user_id");
        try {
            if (jqy == null) {
                jqy = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_reward_msg");
                yu = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_msgPlayable");
                vpp = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_negtiveBtnBtnText");
                ex = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnText");
                fkw = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.EndCardScene", th2.getMessage());
        }
        if (fkwVar != null && (ouwVar = fkwVar.f12134lh) != null) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            ouwVar2.myk = ouwVar.myk;
            ouwVar2.f12373cj = ouwVar.f12373cj;
            if ((this.mwh || this.f12110rn) && !fqk()) {
                this.bly.ryl.set(ouwVar.ryl.get());
            }
            if (!this.bs) {
                this.bly.mwh.set(ouwVar.mwh.get());
                this.bly.f12375jg.set(ouwVar.f12375jg.get());
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
            ouwVar3.ex.zin = ouwVar.ex.zin;
            if (this.mwh && !fqk() && ouwVar3 != null) {
                try {
                    this.uq = ouwVar.ex.pno;
                    if (this.f12108le.ryl()) {
                        this.uq = ouwVar.ouw();
                    }
                    this.fvf = ouwVar.ex.mwh();
                    vpp vppVar = this.f12108le;
                    long jPno = ouwVar.ex.pno();
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = ouwVar.ex.f12357ra;
                    this.f12096pd = uoy.ouw(vppVar, jPno, lhVar != null ? lhVar.zin() : null);
                } catch (Throwable th3) {
                    ko.lh("TTAD.EndCardScene", "saveLastAdScenePlayDuration: ", th3);
                }
            }
        }
        if (this.mwh || this.f12110rn) {
            try {
                pd();
            } catch (Throwable th4) {
                ko.lh("TTAD.EndCardScene", "onCreate: ", th4);
                lso();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.bly;
        if (ouwVar4 != null && (vtVar2 = this.f12109ra) != null) {
            ouwVar4.ycd = vtVar2.f12123le;
        }
        fvf();
        b_();
        cf();
        if (!this.ouw || (vtVar = this.f12109ra) == null || vtVar.f12124lh == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.bly;
        ?? r10 = ouwVar5 != null ? ouwVar5.tlj.get() : -1;
        this.f12109ra.f12124lh.ybr = r10;
        ko.vt("TTAD.EndCardScene", "showEndCard: isAggregateEndCard =" + this.ouw + " hasShowEnd =" + r10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(String str) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12094lh;
        if (vtVar != null && vtVar.yu() != null) {
            this.f12094lh.yu().ouw(this.bly.f12373cj);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.f12373cj = !ouwVar.f12373cj;
        ko.ouw("TTAD.EndCardScene", "rewarded_video", "will set is Mute " + this.bly.f12373cj + " mLastVolume=" + this.bly.fvf.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        ouwVar2.ex.ouw(ouwVar2.f12373cj, str);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
        ouwVar3.bs.lh(ouwVar3.f12373cj);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.bly;
        ouwVar4.ksc.ouw(ouwVar4.f12373cj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity) {
        super.ouw(activity);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return;
        }
        ouwVar.f12381od.ouw();
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12094lh;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.f12109ra == null || fqk()) {
            return;
        }
        vt vtVar = this.f12109ra;
        if (vtVar != null && vtVar.tlj.mwh() == null) {
            if (this.f12109ra.vpp) {
                zih zihVar = this.zin;
                if (zihVar != null && zihVar.ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        fkw.this.yib();
                    }
                })) {
                    return;
                }
            } else if (ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.5
                @Override // java.lang.Runnable
                public final void run() {
                    fkw.this.yib();
                }
            })) {
                return;
            }
        }
        yib();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z10) {
        if (!z10 || this.bly.euf) {
            return;
        }
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        super.ouw(pnoVar, pnoVar2, fkwVar);
        qbp.ouw("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.tlj + ",scene = " + this + ",newScene = " + pnoVar2 + ",oldScene = " + pnoVar + ",isPlayable = " + this.f12110rn);
        boolean z10 = this.tlj == pnoVar2.tlj + 1;
        if (pnoVar != null && (ouwVar = this.bly) != null) {
            ouwVar.f12373cj = fkwVar.yu;
        }
        if (z10) {
            qbp.ouw("TTAD.EndCardScene", "preload index =" + this.tlj + ",new index =" + pnoVar2.tlj + ",isPlayableProxy = " + this.f12110rn);
            yhj();
        }
        if (pnoVar == null && this.ouw) {
            qbp.ouw("TTAD.EndCardScene", "preload agg-endcard =" + this.tlj + ",new index =" + pnoVar2.tlj + ",isPlayableProxy = " + this.f12110rn);
            yhj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ouw(final boolean z10, boolean z11, final Runnable runnable) {
        if (this.bly.yu && !this.f12109ra.yu.getBoolean("reward_verify", false)) {
            vt vtVar = this.f12109ra;
            if (!vtVar.f12126rn) {
                if (!z11 && vtVar.yu.getBoolean("user_has_give_up_reward", false)) {
                    return false;
                }
                com.bytedance.sdk.openadsdk.core.zih.yu();
                if (!cf.le(String.valueOf(this.bly.f12378le))) {
                    if (!z11) {
                        return false;
                    }
                    if (runnable == null && z10) {
                        lso();
                        return true;
                    }
                }
                this.bly.qbp.set(true);
                if (z10) {
                    this.bly.ksc.yu();
                }
                final com.bytedance.sdk.openadsdk.core.widget.vt vtVar2 = new com.bytedance.sdk.openadsdk.core.widget.vt(this.bly.jvy);
                this.f12094lh.mwh = vtVar2;
                if (z10) {
                    vtVar2.ouw = yu;
                    vtVar2.vt = fkw;
                    vtVar2.f13159lh = vpp;
                } else {
                    vtVar2.ouw = jqy;
                    vtVar2.vt = ex;
                    vtVar2.f13159lh = vpp;
                }
                vtVar2.yu = new com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.6
                    @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt
                    public final void ouw() {
                        if (z10) {
                            fkw.this.bly.ksc.ouw(1000);
                        }
                        vtVar2.dismiss();
                        fkw.this.bly.qbp.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt
                    public final void vt() {
                        vtVar2.dismiss();
                        fkw.this.f12109ra.yu.putBoolean("user_has_give_up_reward", true);
                        fkw.this.bly.qbp.set(false);
                        fkw.this.bly.ksc.fkw();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        } else if (!z10) {
                            fkw.this.bly();
                        } else {
                            fkw.this.bly.f12371cd.lh();
                            fkw.this.lso();
                        }
                    }
                };
                vtVar2.show();
                return true;
            }
        }
        return false;
    }
}
