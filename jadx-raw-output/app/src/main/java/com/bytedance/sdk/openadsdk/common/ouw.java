package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.jae;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class ouw {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0106ouw {
        void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar);
    }

    public interface vt {
        void ouw();

        void vt();
    }

    public static void ouw(ko koVar) {
        vt(koVar);
        koVar.ouw.uoy.ouw(lh(koVar));
    }

    public static void vt(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        if (ouwVar == null) {
            return;
        }
        vpp vppVar = ouwVar.vt;
        if (vppVar != null && (yuVarSd = vppVar.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
            long jFkw = ouwVar.ex.fkw();
            yuVar.fkw(jFkw);
            yuVar.yu(jFkw);
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouwVar.vt, 5);
    }

    private static com.bytedance.sdk.openadsdk.component.reward.top.vt lh(final ko koVar) {
        final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = koVar.ouw;
        final String str = koVar.vt;
        final vt vtVar = koVar.yu;
        final zih zihVar = koVar.f12209le;
        final boolean z10 = koVar.fkw;
        return new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.common.ouw.2
            /* JADX WARN: Code duplicated, block: B:30:0x008a A[RETURN] */
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                com.bytedance.sdk.component.utils.qbp.ouw(str, "onClickSkip: ");
                boolean z11 = false;
                if (ouw.ouw(zihVar, ouwVar, false, str)) {
                    return;
                }
                if (z10) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar;
                    String str2 = str;
                    vt vtVar2 = vtVar;
                    if (ouwVar2.f12374gh instanceof com.bytedance.sdk.openadsdk.activity.fkw) {
                        vtVar2.vt();
                    } else {
                        boolean zPno = od.pno(ouwVar2.vt);
                        boolean zLe = od.le(ouwVar2.vt);
                        boolean zFkw = od.fkw(ouwVar2.vt);
                        if (!zLe && (!zFkw || !ouwVar2.ksc.lh(com.bytedance.sdk.openadsdk.component.reward.ouw.pno.f12393lh))) {
                            if (!com.bytedance.sdk.openadsdk.core.model.th.ouw(ouwVar2.vt) || ouwVar2.f12384rn.get()) {
                                ouwVar2.uoy.yu(false);
                            } else {
                                com.bytedance.sdk.component.utils.ko.vt(str2, "onClickSkip: finish self");
                                vtVar2.vt();
                            }
                            if (z11) {
                                return;
                            }
                        } else if (zPno) {
                            ouwVar2.ksc.ra();
                        } else {
                            View viewTlj = ouwVar2.ey.tlj();
                            if (viewTlj != null) {
                                viewTlj.performClick();
                            } else {
                                vtVar2.vt();
                                com.bytedance.sdk.component.utils.qbp.ouw(str2, "onClickSkip: closeButton is null");
                            }
                        }
                    }
                    z11 = true;
                    if (z11) {
                        return;
                    }
                }
                ouw.ouw(ouwVar);
                ouw.ouw(ouwVar, vtVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar;
                View viewTlj;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar;
                if (ouwVar2 == null || (rylVar = ouwVar2.ey) == null || (viewTlj = rylVar.tlj()) == null) {
                    return;
                }
                viewTlj.performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                com.bytedance.sdk.openadsdk.component.reward.ouw.lh lhVar;
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar;
                if (ouwVar2 == null || (lhVar = ouwVar2.f12382pd) == null || (vtVar2 = ouwVar2.coz) == null) {
                    return;
                }
                lhVar.ouw(vtVar2);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
                InterfaceC0106ouw interfaceC0106ouw;
                ko koVar2 = koVar;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = koVar2.ouw;
                if (ouwVar2 == null || (interfaceC0106ouw = koVar2.f12211ra) == null) {
                    return;
                }
                interfaceC0106ouw.ouw(ouwVar2);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str2) {
                vpp vppVar;
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
                com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar;
                com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar;
                if (ouwVar2 == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2 = ouwVar2.coz;
                if (ouwVar2 != null && vtVar2 != null) {
                    ouwVar2.f12373cj = !ouwVar2.f12373cj;
                    if (vtVar2 != null && vtVar2.yu() != null) {
                        vtVar2.yu().ouw(ouwVar2.f12373cj);
                    }
                    boolean z11 = !(ouwVar2.f12374gh instanceof com.bytedance.sdk.openadsdk.activity.fkw);
                    if (ouwVar2.euf && z11 && (tljVar = ouwVar2.jae) != null && (yuVar = tljVar.ouw) != null) {
                        yuVar.setSoundMute(ouwVar2.f12373cj);
                    }
                    ouwVar2.ex.ouw(ouwVar2.f12373cj, str2);
                    ouwVar2.bs.lh(ouwVar2.f12373cj);
                    ouwVar2.ksc.ouw(ouwVar2.f12373cj);
                    if (!z11 || (vppVar = ouwVar2.vt) == null || (yuVarSd = vppVar.sd()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.ryl.yu yuVar2 = yuVarSd.ouw;
                    long jFkw = ouwVar2.ex.fkw();
                    if (ouwVar2.f12373cj) {
                        yuVar2.ra(jFkw);
                        return;
                    } else {
                        yuVar2.pno(jFkw);
                        return;
                    }
                }
                com.bytedance.sdk.component.utils.qbp.lh("handleSoundClickCommonLogic adContext is null", new Object[0]);
            }
        };
    }

    public static boolean ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, View view) {
        if (!ouwVar.bs.cf() || (!ouwVar.euf && !ouwVar.tlj.get())) {
            return false;
        }
        boolean z10 = ouwVar.fak.fkw.get();
        ouwVar.bs.yu(z10);
        ouwVar.ey.le(8);
        if (view instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.le.yu) view).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(ouwVar.hun, "tt_close_btn"));
        }
        ouwVar.ux.sendEmptyMessageDelayed(600, 5000L);
        return !vpp.lh(ouwVar.vt) || z10;
    }

    private static void vt(final ko koVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar;
        final View viewTlj;
        final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = koVar.ouw;
        if (ouwVar == null || (rylVar = ouwVar.ey) == null || (viewTlj = rylVar.tlj()) == null) {
            return;
        }
        final String str = koVar.vt;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ouw.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/ouw$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_ouw$1_onClick_8118eb6a0d740d920b327176faed6cdb(view);
            }

            public void safedk_ouw$1_onClick_8118eb6a0d740d920b327176faed6cdb(View p10) {
                com.bytedance.sdk.component.utils.ko.vt(str, "onClick: Close Button");
                if (ouw.ouw(ouwVar, viewTlj)) {
                    return;
                }
                ouwVar.bs.ryl();
                ouwVar.fak.fkw();
                ouwVar.f12371cd.lh();
                zih zihVar = koVar.f12209le;
                if (zihVar == null || !od.yu(ouwVar.vt)) {
                    koVar.f12210lh.run();
                    return;
                }
                boolean zOuw = ouw.ouw(zihVar, ouwVar, true, str);
                if (!(ouwVar.f12374gh instanceof com.bytedance.sdk.openadsdk.activity.fkw) || zOuw) {
                    return;
                }
                koVar.f12210lh.run();
            }
        };
        viewTlj.setOnClickListener(onClickListener);
        viewTlj.setTag(viewTlj.getId(), onClickListener);
    }

    public static void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        if (ouwVar == null) {
            com.bytedance.sdk.component.utils.qbp.lh("reportSkipCommonEvent adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw();
        ouwVar2.ouw(ouwVar.ex.fkw());
        ouwVar2.vt(ouwVar.ex.ko());
        ouwVar2.vt = ouwVar.ex.pno();
        ouwVar2.tlj = 3;
        ouwVar2.ryl = ouwVar.ex.jg();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = ouwVar.ex;
        ouwVar2.f13478le = koVar.f12352jg;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(koVar.lh(), ouwVar2, ouwVar.ex.zin);
        jae.ouw(ouwVar.f12378le);
        ouwVar.ex.ouw("skip", false);
    }

    public static void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, vt vtVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (ouwVar.f12379lh && (!com.bytedance.sdk.openadsdk.core.model.th.lh(ouwVar.vt) || (yuVar = ouwVar.jae.ouw) == null || yuVar.yu != 0)) {
            vtVar.ouw();
        } else {
            vtVar.vt();
        }
        vt(ouwVar);
    }

    public static /* synthetic */ boolean ouw(zih zihVar, com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, boolean z10, String str) {
        if (zihVar == null) {
            return false;
        }
        boolean zOuw = zihVar.ouw(od.lh(ouwVar.vt), z10, null);
        if (zOuw) {
            return true;
        }
        boolean z11 = ouwVar.f12374gh instanceof com.bytedance.sdk.openadsdk.activity.fkw;
        com.bytedance.sdk.component.utils.qbp.ouw(str, "handleTipDialogLogic: isEndCardScene=%s, dialogResult=%s", Boolean.valueOf(z11), Boolean.valueOf(zOuw));
        if (z11) {
            return ((com.bytedance.sdk.openadsdk.activity.fkw) ouwVar.f12374gh).bly();
        }
        return true;
    }
}
