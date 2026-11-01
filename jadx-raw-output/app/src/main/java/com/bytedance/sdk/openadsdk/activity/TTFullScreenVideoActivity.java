package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.zih;
import com.bytedance.sdk.openadsdk.core.jae;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.tlj;
import com.ironsource.C3605n2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.ouw.lh.vt f12022vm;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f12023th;
    private com.bytedance.sdk.openadsdk.ouw.lh.vt zih;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ey() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || vpp.fkw(ouwVar.vt)) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = this.vt.vt.f12874sd;
        if (vtVar == null) {
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt();
            vtVar2.yu = 10.0d;
            this.vt.vt.f12874sd = vtVar2;
        } else if (vtVar.yu <= 0.0d) {
            vtVar.yu = 10.0d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean vpp() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final zih yu() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean zin() {
        return false;
    }

    private void ouw(final String str) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTFullScreenVideoActivity.this.ouw(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.vt.f12388ub, str);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.vt != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.vt.vt);
        }
        try {
            fvf();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout od() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12012lh;
        return (vtVar == null || !(vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.pno)) ? this.vt.ey.le() : ((com.bytedance.sdk.openadsdk.component.reward.vt.pno) vtVar).ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f12009cf) {
            f12022vm = this.zih;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void osn() {
        if (this.vt.vt.ex() != 100.0f) {
            this.f12023th = true;
        }
        pd();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void pno() {
        if (vpp.fkw(this.vt.vt)) {
            this.vt.uoy.ouw(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
            if (ouwVar.f12379lh) {
                this.vt.uoy.ouw(null, TTAdDislikeToast.getSkipText());
            } else {
                ouwVar.uoy.ouw(null, "X");
            }
        }
        this.vt.uoy.fkw(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void qbp() {
        final View viewTlj = this.vt.ey.tlj();
        if (viewTlj != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTFullScreenVideoActivity$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_TTFullScreenVideoActivity$3_onClick_2f865e131fb3fb8612e640b50ce81baa(view);
                }

                public void safedk_TTFullScreenVideoActivity$3_onClick_2f865e131fb3fb8612e640b50ce81baa(View p10) {
                    if (TTFullScreenVideoActivity.this.vt.bs.cf() && TTFullScreenVideoActivity.this.vt.tlj.get()) {
                        boolean z10 = TTFullScreenVideoActivity.this.vt.fak.fkw.get();
                        TTFullScreenVideoActivity.this.vt.bs.yu(z10);
                        TTFullScreenVideoActivity.this.vt.ey.le(8);
                        View view = viewTlj;
                        if (view instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                            ((com.bytedance.sdk.openadsdk.core.le.yu) view).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(TTFullScreenVideoActivity.this.vt.hun, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.vt.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(TTFullScreenVideoActivity.this.vt.vt)) {
                            return;
                        }
                        if (vpp.lh(TTFullScreenVideoActivity.this.vt.vt) && z10) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.vt.bs.ryl();
                    TTFullScreenVideoActivity.this.vt.fak.fkw();
                    TTFullScreenVideoActivity.this.vt.f12371cd.lh();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.vt.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                if (od.le(TTFullScreenVideoActivity.this.vt.vt) || (od.fkw(TTFullScreenVideoActivity.this.vt.vt) && TTFullScreenVideoActivity.this.vt.ksc.lh(com.bytedance.sdk.openadsdk.component.reward.ouw.pno.f12393lh))) {
                    if (od.pno(TTFullScreenVideoActivity.this.vt.vt)) {
                        TTFullScreenVideoActivity.this.vt.ksc.ra();
                        return;
                    }
                    View view = viewTlj;
                    if (view != null) {
                        view.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (th.ouw(TTFullScreenVideoActivity.this.vt.vt) && !TTFullScreenVideoActivity.this.vt.f12384rn.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                ko.ouw ouwVar = new ko.ouw();
                ouwVar.ouw(TTFullScreenVideoActivity.this.vt.ex.fkw());
                ouwVar.vt(TTFullScreenVideoActivity.this.vt.ex.ko());
                ouwVar.vt = TTFullScreenVideoActivity.this.vt.ex.pno();
                ouwVar.tlj = 3;
                ouwVar.ryl = TTFullScreenVideoActivity.this.vt.ex.jg();
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = TTFullScreenVideoActivity.this.vt.ex;
                ouwVar.f13478le = koVar.f12352jg;
                com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(koVar.lh(), ouwVar, TTFullScreenVideoActivity.this.vt.ex.zin);
                jae.ouw(TTFullScreenVideoActivity.this.vt.f12378le);
                TTFullScreenVideoActivity.this.vt.ex.ouw("skip", false);
                TTFullScreenVideoActivity.this.vt.uoy.yu(false);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = TTFullScreenVideoActivity.this.vt;
                if (!ouwVar2.f12379lh) {
                    TTFullScreenVideoActivity.this.finish();
                } else if (th.lh(ouwVar2.vt)) {
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2 = tTFullScreenVideoActivity.vt.jae.ouw;
                    if (yuVar2 == null || yuVar2.yu != 0) {
                        tTFullScreenVideoActivity.ouw(true, 4);
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                    }
                } else {
                    TTFullScreenVideoActivity.this.ouw(true, 4);
                }
                vpp vppVar = TTFullScreenVideoActivity.this.vt.vt;
                if (vppVar != null && (yuVarSd = vppVar.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.fkw(TTFullScreenVideoActivity.this.vt.ex.fkw());
                    yuVar.yu(TTFullScreenVideoActivity.this.vt.ex.fkw());
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(TTFullScreenVideoActivity.this.vt.vt, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
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
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.vt.f12382pd.ouw(tTFullScreenVideoActivity.f12012lh);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = tTFullScreenVideoActivity.vt;
                ouwVar.f12373cj = !ouwVar.f12373cj;
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = tTFullScreenVideoActivity.f12012lh;
                if (vtVar != null && vtVar.yu() != null) {
                    TTFullScreenVideoActivity.this.f12012lh.yu().ouw(TTFullScreenVideoActivity.this.vt.f12373cj);
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = TTFullScreenVideoActivity.this.vt;
                ouwVar2.ex.ouw(ouwVar2.f12373cj, str);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = TTFullScreenVideoActivity.this.vt;
                ouwVar3.bs.lh(ouwVar3.f12373cj);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = TTFullScreenVideoActivity.this.vt;
                ouwVar4.ksc.ouw(ouwVar4.f12373cj);
                vpp vppVar = TTFullScreenVideoActivity.this.vt.vt;
                if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = TTFullScreenVideoActivity.this.vt;
                if (ouwVar5.f12373cj) {
                    yuVar.ra(ouwVar5.ex.fkw());
                } else {
                    yuVar.pno(ouwVar5.ex.fkw());
                }
            }
        });
    }

    public final void vt(int i10) {
        int iMyk = this.vt.vt.myk();
        com.bytedance.sdk.openadsdk.core.zih.yu();
        if (!cf.fkw(String.valueOf(this.vt.f12378le)) || (!vpp.fkw(this.vt.vt) && !this.vt.f12379lh)) {
            if (i10 >= iMyk) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
                if (!ouwVar.xdk) {
                    ouwVar.ouw(true);
                }
                pno();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
        if (!ouwVar2.xdk) {
            ouwVar2.ouw(true);
        }
        if (i10 > iMyk) {
            pno();
        } else {
            lh(iMyk - i10);
            this.vt.uoy.fkw(false);
        }
    }

    private void fvf() {
        vpp vppVar;
        if (com.bytedance.sdk.openadsdk.vpp.ouw.ra() && isChangingConfigurations()) {
            qbp.ouw("BVA", "callback close is invoke by config change.");
            return;
        }
        if (!this.f12013ra) {
            this.f12013ra = true;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f12010ko;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
            if (ouwVar != null) {
                vppVar = ouwVar.vt;
            } else {
                vppVar = null;
            }
            if (vppVar != null && jElapsedRealtime > 0) {
                vppVar.vby = jElapsedRealtime;
            }
            if (vppVar != null) {
                vppVar.ybr = ouwVar.tlj.get() ? 1 : 0;
            }
            tlj.ouw(vppVar);
            qbp.ouw("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                ouw("onAdClose");
                return;
            }
            com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
            if (vtVar != null) {
                vtVar.vt();
            } else {
                tlj.ouw(vppVar, "close", false);
            }
        }
    }

    private void lh(int i10) {
        this.vt.uoy.ouw(null, String.format(com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), "tt_skip_ad_time_text"), Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pd() {
        qbp.ouw("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.onAdClicked();
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (!this.f12009cf) {
            f12022vm = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.jg();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar != null && (yuVar = ouwVar.jae.ouw) != null) {
            yuVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
                public final void ouw() {
                    TTFullScreenVideoActivity.this.pd();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void kn() {
        pd();
        this.vt.vt.pv();
        vpp vppVar = this.vt.vt;
        vppVar.mq = true;
        if (vpp.fkw(vppVar)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
            vpp vppVar2 = ouwVar.vt;
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar2, ouwVar.fkw, vppVar2.uq);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void mwh() {
        vpp vppVar;
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
            if (vtVar != null) {
                vtVar.ouw();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
                if (ouwVar != null) {
                    vppVar = ouwVar.vt;
                } else {
                    vppVar = null;
                }
                tlj.ouw(vppVar, C3605n2.f30216v, false);
            }
        }
        if (jqy()) {
            this.vt.jae.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fvf();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("recycleRes");
        }
        ouw(isFinishing(), isChangingConfigurations());
        this.zih = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        boolean zKo;
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return;
        }
        if (ouwVar.vt == null) {
            zKo = false;
        } else {
            com.bytedance.sdk.openadsdk.core.zih.yu();
            zKo = cf.ko(String.valueOf(this.vt.f12378le));
        }
        if (zKo) {
            vpp vppVar = this.vt.vt;
            boolean z10 = true;
            if (vppVar != null && vppVar.ex() != 100.0f) {
                z10 = false;
            }
            if (!z10) {
                if (this.f12023th) {
                    this.f12023th = false;
                    finish();
                } else if (this.vt.bs.zih()) {
                    finish();
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(@NonNull Intent intent) {
        super.ouw(intent);
        this.vt.zvq = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(Bundle bundle) {
        if (this.f12009cf) {
            super.ouw(bundle);
            this.zih = (com.bytedance.sdk.openadsdk.ouw.lh.vt) com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.f12008jg, com.bytedance.sdk.openadsdk.ouw.lh.vt.class);
            return;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            this.zih = com.bytedance.sdk.openadsdk.core.od.ouw().f12974lh;
        }
        if (this.zih != null || bundle == null) {
            return;
        }
        this.zih = f12022vm;
        f12022vm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ouw(long j10, long j11) {
        vt((int) (j10 / 1000));
        int i10 = this.f12011le;
        if (i10 >= 0) {
            this.vt.uoy.ouw(String.valueOf(i10), null);
        }
    }
}
