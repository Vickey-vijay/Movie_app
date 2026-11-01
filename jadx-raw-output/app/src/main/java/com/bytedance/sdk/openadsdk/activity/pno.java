package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.common.ko;
import com.bytedance.sdk.openadsdk.common.zih;
import com.bytedance.sdk.openadsdk.component.reward.tlj;
import com.bytedance.sdk.openadsdk.core.jqy;
import com.bytedance.sdk.openadsdk.core.model.fvf;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.vm;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3605n2;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class pno implements com.bytedance.sdk.openadsdk.core.mwh.yu.vt {
    public com.bytedance.sdk.openadsdk.component.reward.ouw.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f12105cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public String f12106jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public String f12107ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public vpp f12108le;
    public boolean mwh;
    private boolean ouw;
    public boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final vt f12109ra;
    public boolean ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f12111th;
    public int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public IListenerManager f12112vm;
    private vm vt;
    public boolean zih;
    public zih zin;
    public final AtomicBoolean pno = new AtomicBoolean(false);

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f12110rn = false;

    private void ouw(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.pno.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    pno.this.vt(0).executeRewardVideoCallback(pno.this.ex(), str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    qbp.yu("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    public boolean c_() {
        return false;
    }

    public abstract boolean d_();

    public abstract String e_();

    public abstract String ex();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void ey() {
        lh(2);
    }

    public abstract void f_();

    public boolean fak() {
        return false;
    }

    public abstract boolean g_();

    public boolean jae() {
        return false;
    }

    public void jg() {
    }

    public abstract boolean jqy();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void jvy() {
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ksc();

    public void lh() {
    }

    public final void lh(final int i10) {
        if (this.f12109ra.yu.getBoolean("reward_verify", false)) {
            return;
        }
        vt vtVar = this.f12109ra;
        if (vtVar.f12126rn || vtVar.yu.getBoolean("user_has_give_up_reward", false)) {
            return;
        }
        this.f12109ra.yu.putBoolean("reward_verify", true);
        if (ksc() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc = ksc();
        com.bytedance.sdk.openadsdk.core.zih.yu();
        if (cf.cf(String.valueOf(ouwVarKsc.f12378le))) {
            vpp vppVar = ouwVarKsc.vt;
            ouw(true, vppVar.xdk, vppVar.mt, 0, "", i10);
        } else {
            com.bytedance.sdk.openadsdk.core.zih.lh().ouw(tc(), new com.bytedance.sdk.openadsdk.core.vpp.vt() { // from class: com.bytedance.sdk.openadsdk.activity.pno.7
                @Override // com.bytedance.sdk.openadsdk.core.vpp.vt
                public final void ouw(int i11, String str) {
                    pno.this.ouw(false, 0, "", i11, str, i10);
                }

                @Override // com.bytedance.sdk.openadsdk.core.vpp.vt
                public final void ouw(jqy.vt vtVar2) {
                    fvf fvfVar = vtVar2.f12697lh;
                    pno.this.ouw(vtVar2.vt, fvfVar.f12756lh, fvfVar.yu, 0, "", i10);
                }
            });
        }
    }

    public void mwh() {
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.bly ouw();

    public void ouw(Activity activity) {
    }

    public void ouw(Activity activity, Bundle bundle) {
    }

    public abstract void ouw(Activity activity, vt.fkw fkwVar);

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(Bundle bundle) {
    }

    public void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
    }

    public void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
    }

    public abstract void ouw(String str);

    public void ouw(Map<String, Object> map, float f10, float f11) {
    }

    public void rrs() {
    }

    public final void ub() {
        lh(0);
    }

    public boolean uoy() {
        return false;
    }

    public void uq() {
    }

    public abstract void vt(boolean z10);

    public final void vt(boolean z10, boolean z11, boolean z12, int i10) {
        this.f12109ra.ouw(this, z10, z11, z12, i10);
    }

    public void yu() {
    }

    public final void yu(boolean z10) {
        this.qbp = z10;
    }

    public void zin() {
    }

    private JSONObject tc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.f12107ko);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.f12106jg);
            jSONObject.put("trans_id", ex.ouw().replace("-", ""));
            if (ksc() != null) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc = ksc();
                jSONObject.put("duration", (int) ouwVarKsc.ex.rn());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, ouwVarKsc.vt.mt);
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, ouwVarKsc.vt.xdk);
                jSONObject.put("network", ksc.ouw(ouwVarKsc.hun, 60000L));
                JSONObject jSONObjectFak = ouwVarKsc.vt.fak();
                jSONObjectFak.put(Q6.V0, com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
                jSONObject.put("extra", jSONObjectFak);
                jSONObject.put("video_duration", ouwVarKsc.vt.f12874sd.yu);
                String strFkw = "unKnow";
                int i10 = ouwVarKsc.vt.f12884vi;
                if (i10 == 2) {
                    strFkw = uoy.lh();
                } else if (i10 == 1) {
                    strFkw = uoy.fkw();
                }
                jSONObject.put("user_agent", strFkw);
            }
            return jSONObject;
        } catch (Throwable th2) {
            qbp.ouw("Scene", "", th2);
            return null;
        }
    }

    public void b_() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        vt vtVar = this.f12109ra;
        boolean z10 = vtVar != null && vtVar.vpp;
        if (z10 && (ouwVar = this.bly) != null && !(ouwVar.f12374gh instanceof le)) {
            this.zin = new zih(ouwVar) { // from class: com.bytedance.sdk.openadsdk.activity.pno.1
                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final boolean ouw() {
                    return pno.this.f12109ra.yu.getBoolean("user_has_give_up_reward", false);
                }

                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final boolean lh() {
                    return pno.this.f12109ra.yu.getBoolean("reward_verify", false);
                }

                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final void vt() {
                    pno.this.f12109ra.yu.putBoolean("user_has_give_up_reward", true);
                }

                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final void yu() {
                    pno.this.lso();
                }

                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2) {
                    pno.this.ouw(ouwVar2);
                }
            };
        }
        if (z10) {
            zih zihVar = this.zin;
            ko.ouw ouwVar2 = new ko.ouw(this.bly, "BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.pno.2
                @Override // java.lang.Runnable
                public final void run() {
                    pno.this.lso();
                }
            }, new com.bytedance.sdk.openadsdk.common.ouw.vt() { // from class: com.bytedance.sdk.openadsdk.activity.pno.3
                @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                public final void ouw() {
                    pno pnoVar = pno.this;
                    if (pnoVar instanceof ouw) {
                        ((ouw) pnoVar).fkw();
                    } else if (pnoVar instanceof fkw) {
                        pnoVar.cf();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                public final void vt() {
                    pno.this.lso();
                }
            });
            ouwVar2.fkw = c_();
            ouwVar2.f12212le = zihVar;
            ouwVar2.f12214ra = new com.bytedance.sdk.openadsdk.common.ouw.InterfaceC0106ouw() { // from class: com.bytedance.sdk.openadsdk.activity.pno.4
                @Override // com.bytedance.sdk.openadsdk.common.ouw.InterfaceC0106ouw
                public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3) {
                    pno.this.vt(ouwVar3);
                }
            };
            com.bytedance.sdk.openadsdk.common.ouw.ouw(ouwVar2.ouw());
        }
    }

    public final void cj() {
        qbp.ouw("Scene", "tryPreloadVideo scene = " + this + ",index =" + this.tlj);
        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(this.f12108le.f12875sm).ouw(), this.f12108le);
        vtVarOuw.ouw("material_meta", this.f12108le);
        vtVarOuw.ouw("ad_slot", this.f12108le.yiz);
        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.activity.pno.8
            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10) {
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10, String str) {
            }
        });
    }

    public final boolean fqk() {
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            return vtVar.tlj.ouw(this, this.tlj);
        }
        return false;
    }

    public final vt hun() {
        return this.f12109ra;
    }

    public final void lso() {
        if (this.f12108le != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.f12108le);
        }
        this.f12109ra.vt();
    }

    public final void ouw(boolean z10, int i10, String str, int i11, String str2, int i12) {
        if (this.f12109ra.f12126rn) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onRewardVerify", z10, i10, str, i11, str2);
        } else {
            this.f12109ra.ouw(this, z10, i10, str, i11, str2);
        }
        tlj.ouw(this.f12108le, z10, i12);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final List<vpp> pv() {
        return this.f12109ra.tlj.ko();
    }

    public void qbp() {
        vm vmVar = this.vt;
        if (vmVar != null) {
            vmVar.bly();
            this.vt = null;
        }
        this.ouw = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void tlj() {
        if (this.pno.compareAndSet(false, true)) {
            qbp.ouw("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            vt vtVar = this.f12109ra;
            if (vtVar == null || vtVar.f12122ko) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                vt("onAdShow");
            } else {
                vt vtVar2 = this.f12109ra;
                if (!vtVar2.f12122ko) {
                    vtVar2.fkw();
                    com.bytedance.sdk.component.utils.ko.vt("BVA", "invokeOnShowCallback: " + vtVar2.f12125ra + ", " + vtVar2.pno);
                    com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = vtVar2.f12125ra;
                    if (ouwVar != null) {
                        ouwVar.ouw();
                    } else {
                        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar3 = vtVar2.pno;
                        if (vtVar3 != null) {
                            vtVar3.ouw();
                        } else {
                            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vtVar2.f12124lh, C3605n2.f30216v, true);
                        }
                    }
                    Runnable runnable = vtVar2.zih;
                    if (runnable != null) {
                        runnable.run();
                        vtVar2.zih = null;
                    }
                }
            }
            this.f12109ra.fkw();
        }
    }

    public final boolean ucs() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc;
        vm vmVar;
        if (this.zih || (ouwVarKsc = ksc()) == null || !ouwVarKsc.vt.euf() || (vmVar = this.vt) == null) {
            return false;
        }
        return vmVar.ouw(ouwVarKsc.jvy);
    }

    public final Activity ux() {
        return this.f12109ra.lh();
    }

    public final void vh() {
        if (this.zih || ksc() == null || ksc().rrs == null || !ksc().vt.euf()) {
            return;
        }
        vm vmVar = new vm(ksc(), new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.pno.9
            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void fkw() {
                pno.this.yu(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void le() {
                pno.this.yu(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void lh() {
                com.bytedance.sdk.component.utils.ko.vt("Scene", "onDialogShow: ");
                vt vtVar = pno.this.f12109ra;
                if (vtVar != null) {
                    vtVar.tlj.th();
                }
                pno.this.yu(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void ouw() {
                pno pnoVar = pno.this;
                pnoVar.lh(pnoVar.ksc());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void vt() {
                com.bytedance.sdk.component.utils.ko.vt("Scene", "onDialogHide: ");
                vt vtVar = pno.this.f12109ra;
                if (vtVar != null) {
                    vtVar.tlj.vm();
                }
                pno.this.yu(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final int yu() {
                vt vtVar = pno.this.f12109ra;
                if (vtVar != null) {
                    return vtVar.tlj.pno();
                }
                return 0;
            }
        });
        this.vt = vmVar;
        vmVar.ouw(ksc().rrs);
    }

    public final void vt(Activity activity, vt.fkw fkwVar) {
        if (this.ouw) {
            return;
        }
        this.ouw = true;
        ouw(activity, fkwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void wp() {
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            vtVar.vt(this);
        }
    }

    public final void yu(int i10) {
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            vtVar.ouw(i10);
        }
    }

    public pno(vt vtVar, vpp vppVar, int i10, int i11, boolean z10) {
        this.f12109ra = vtVar;
        this.f12108le = vppVar;
        this.tlj = i10;
        this.f12105cf = i11;
        this.zih = z10;
    }

    private void bly() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            vt("onAdVideoBarClick");
        } else {
            this.f12109ra.yu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void kn() {
        vpp vppVar;
        bly();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && (vppVar = ouwVar.vt) != null) {
            vppVar.pv();
            vpp vppVar2 = this.bly.vt;
            vppVar2.mq = true;
            if (vpp.fkw(vppVar2)) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
                vpp vppVar3 = ouwVar2.vt;
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar3, ouwVar2.fkw, vppVar3.uq);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void osn() {
        bly();
    }

    private void vt(final String str) {
        if (d_()) {
            ouw(str, false, 0, "", 0, "");
        } else {
            bs.fkw(new com.bytedance.sdk.component.pno.pno("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.pno.6
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        pno.this.vt(1).executeFullVideoCallback(pno.this.ex(), str);
                    } catch (Throwable th2) {
                        qbp.yu("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                    }
                }
            });
        }
    }

    public void ouw(vpp vppVar, int i10, int i11) {
        this.f12108le = vppVar;
        this.tlj = i10;
        this.f12105cf = i11;
    }

    public final IListenerManager vt(int i10) {
        if (this.f12112vm == null) {
            this.f12112vm = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(i10));
        }
        return this.f12112vm;
    }

    public final void vt(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        tlj tljVar;
        if (com.bytedance.sdk.openadsdk.vpp.ouw.ra() && activity != null && activity.isChangingConfigurations()) {
            qbp.ouw("BVA", "callback close is invoke by config change.");
            return;
        }
        vt vtVar = this.f12109ra;
        if (!vtVar.f12122ko) {
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vtVar.f12124lh);
        }
        if (d_() && (ouwVar = this.bly) != null && (tljVar = ouwVar.ycd) != null) {
            tljVar.lh();
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            vt("onAdClose");
            return;
        }
        vt vtVar2 = this.f12109ra;
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar2 = vtVar2.f12125ra;
        if (ouwVar2 != null) {
            ouwVar2.vt();
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar3 = vtVar2.pno;
        if (vtVar3 != null) {
            vtVar3.vt();
        } else {
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vtVar2.f12124lh, "close", true);
        }
    }

    public final void lh(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        if (fqk()) {
            return;
        }
        vt.fkw fkwVar = new vt.fkw(8, ouwVar);
        fkwVar.yu = ouwVar.f12373cj;
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            vtVar.vt(this, fkwVar);
        }
    }

    public final void vt(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        if (ouwVar == null) {
            com.bytedance.sdk.component.utils.ko.fkw("Scene", "onPlayableChangeNext: adContext is null");
            return;
        }
        try {
            int iPno = this.f12109ra.tlj.pno();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iPno, 0));
            com.bytedance.sdk.openadsdk.yu.lh.fkw(this.f12108le, ouwVar.fkw, jSONObject);
        } catch (Throwable unused) {
        }
        lh(ouwVar);
    }
}
