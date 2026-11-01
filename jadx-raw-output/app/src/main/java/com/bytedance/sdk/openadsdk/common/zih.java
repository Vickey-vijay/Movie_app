package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zih {
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f12236le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12237lh;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f12238ra;
    public String vt;
    public String yu;

    public abstract boolean lh();

    public abstract void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar);

    public abstract boolean ouw();

    public abstract void vt();

    public abstract void yu();

    private boolean le() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12238ra;
        return !ouwVar.euf && ouwVar.tlj.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pno() {
        if (!od.pno(this.f12238ra.vt)) {
            return false;
        }
        this.f12238ra.ksc.ra();
        return true;
    }

    public final void fkw() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12238ra;
        if (ouwVar == null) {
            com.bytedance.sdk.component.utils.qbp.yu("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f12374gh;
        if (pnoVar == null || !(pnoVar instanceof com.bytedance.sdk.openadsdk.activity.fkw)) {
            ouwVar.ex.zih();
            ouw.ouw(this.f12238ra);
            ouw(this.f12238ra);
        } else {
            if (((com.bytedance.sdk.openadsdk.activity.fkw) pnoVar).bly()) {
                return;
            }
            yu();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    public final boolean ouw(final boolean z10, boolean z11, final Runnable runnable) {
        boolean zPno;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12238ra;
        if (!(ouwVar.f12374gh instanceof com.bytedance.sdk.openadsdk.activity.fkw)) {
            if (z11 || !ouw()) {
                zPno = false;
            } else if (this.f12238ra.euf) {
                if (runnable == null) {
                    fkw();
                }
                zPno = true;
            } else if (le()) {
                zPno = pno();
            } else {
                zPno = false;
            }
            if (zPno) {
                return false;
            }
            if (!ra()) {
                if ((z11 || !le() || !pno()) && runnable == null) {
                    if (z10) {
                        yu();
                        return true;
                    }
                    fkw();
                }
                return false;
            }
            if (lh()) {
                if ((!le() || !pno()) && runnable == null) {
                    if (z10) {
                        yu();
                    } else {
                        fkw();
                    }
                }
                return false;
            }
            vpp vppVar = this.f12238ra.vt;
            if (!vppVar.tpk && od.pno(vppVar) && this.f12238ra.bs.f12405le.getVisibility() == 0) {
                this.f12238ra.ksc.ra();
                return false;
            }
        } else {
            if (!ouwVar.yu || lh() || (this.f12238ra.f12374gh.hun() != null && this.f12238ra.f12374gh.hun().f12126rn)) {
                return false;
            }
            if (!z11 && ouw()) {
                return false;
            }
            if (!ra()) {
                if (!z11) {
                    return false;
                }
                if (runnable == null && z10) {
                    yu();
                    return true;
                }
            }
        }
        this.f12238ra.ex.ryl();
        if (z10) {
            this.f12238ra.ksc.yu();
        }
        this.f12238ra.qbp.set(true);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f12238ra;
        if (ouwVar2 == null || ouwVar2.jvy.isFinishing() || this.f12238ra.jvy.isDestroyed()) {
            com.bytedance.sdk.component.utils.qbp.lh("RewardTipDialogHelper", "adContext or activity is null");
        } else {
            final com.bytedance.sdk.openadsdk.core.widget.vt vtVar = new com.bytedance.sdk.openadsdk.core.widget.vt(this.f12238ra.jvy);
            com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2 = this.f12238ra.coz;
            if (vtVar2 == null) {
                com.bytedance.sdk.component.utils.qbp.lh("RewardTipDialogHelper", "adContext or  adType == null");
            } else {
                vtVar2.mwh = vtVar;
                if (z10) {
                    vtVar.ouw = this.f12237lh;
                    vtVar.vt = this.fkw;
                    vtVar.f13159lh = this.f12236le;
                } else {
                    vtVar.ouw = this.vt;
                    vtVar.vt = this.yu;
                    vtVar.f13159lh = this.f12236le;
                }
                vtVar.yu = new com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt() { // from class: com.bytedance.sdk.openadsdk.common.zih.1
                    @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt
                    public final void ouw() {
                        zih.ouw(zih.this, z10);
                        vtVar.dismiss();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0139vt
                    public final void vt() {
                        vtVar.dismiss();
                        zih.this.vt();
                        zih.this.f12238ra.qbp.set(false);
                        zih.this.f12238ra.ksc.fkw();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                            return;
                        }
                        if (!z10) {
                            zih.this.fkw();
                            return;
                        }
                        zih zihVar = zih.this;
                        if (zihVar.f12238ra.euf || !zihVar.pno()) {
                            zih.this.f12238ra.f12371cd.lh();
                            zih.this.yu();
                        }
                    }
                };
                vtVar.show();
            }
        }
        return true;
    }

    public zih(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.f12238ra = ouwVar;
        if (this.vt == null) {
            try {
                this.vt = com.bytedance.sdk.component.utils.vpp.ouw(ouwVar.hun, "tt_reward_msg");
                this.f12237lh = com.bytedance.sdk.component.utils.vpp.ouw(ouwVar.hun, "tt_msgPlayable");
                this.f12236le = com.bytedance.sdk.component.utils.vpp.ouw(ouwVar.hun, "tt_negtiveBtnBtnText");
                this.yu = com.bytedance.sdk.component.utils.vpp.ouw(ouwVar.hun, "tt_postiveBtnText");
                this.fkw = com.bytedance.sdk.component.utils.vpp.ouw(ouwVar.hun, "tt_postiveBtnTextPlayable");
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("RewardTipDialogHelper", "init res text failed：" + th2.getMessage());
            }
        }
    }

    private boolean ra() {
        com.bytedance.sdk.openadsdk.core.zih.yu();
        return com.bytedance.sdk.openadsdk.core.settings.cf.le(String.valueOf(this.f12238ra.f12378le));
    }

    public static /* synthetic */ void ouw(zih zihVar, boolean z10) {
        zihVar.f12238ra.ex.cf();
        if (z10) {
            zihVar.f12238ra.ksc.ouw(1000);
        }
        zihVar.f12238ra.qbp.set(false);
    }
}
