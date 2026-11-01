package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.uoy;
import com.bytedance.sdk.openadsdk.core.zih;

/* JADX INFO: loaded from: classes5.dex */
public final class ouw {
    public static void ouw(final vpp vppVar, final boolean z10, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                String strUx;
                vpp vppVar2 = vppVar;
                if (vppVar2 == null || vppVar2.f12887zn) {
                    return;
                }
                try {
                    Context contextOuw = zih.ouw();
                    AdSlot adSlot = vppVar.yiz;
                    if (adSlot != null) {
                        if (z11) {
                            ryl rylVarOuw = ryl.ouw(contextOuw);
                            String codeId = adSlot.getCodeId();
                            vpp vppVar3 = vppVar;
                            cf cfVarOuw = cf.ouw(rylVarOuw.ouw);
                            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new").ouw(codeId, vppVar3);
                            } else if (!TextUtils.isEmpty(codeId)) {
                                String strLh = cfVarOuw.vt.lh(codeId);
                                strUx = vppVar3 != null ? vppVar3.ux() : "";
                                if (TextUtils.isEmpty(strLh) || TextUtils.isEmpty(strUx) || strLh.equals(strUx)) {
                                    cfVarOuw.vt.pno(codeId);
                                }
                            }
                        } else {
                            fkw fkwVarOuw = fkw.ouw(contextOuw);
                            String codeId2 = adSlot.getCodeId();
                            vpp vppVar4 = vppVar;
                            yu yuVarOuw = yu.ouw(fkwVarOuw.ouw);
                            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video_new").ouw(codeId2, vppVar4);
                            } else if (!TextUtils.isEmpty(codeId2)) {
                                String strLh2 = yuVarOuw.vt.lh(codeId2);
                                strUx = vppVar4 != null ? vppVar4.ux() : "";
                                if (TextUtils.isEmpty(strLh2) || TextUtils.isEmpty(strUx) || strLh2.equals(strUx)) {
                                    yuVarOuw.vt.pno(codeId2);
                                }
                            }
                        }
                        if (z10) {
                            if (z11) {
                                ryl.ouw(contextOuw).ouw(adSlot);
                            } else {
                                fkw.ouw(contextOuw).ouw(adSlot);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean ouw(final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        int iPno = 0;
        if (ouwVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.vt vtVarHun = null;
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f12374gh;
        if (pnoVar != null && pnoVar.hun() != null && (vtVarHun = ouwVar.f12374gh.hun()) != null) {
            iPno = vtVarHun.tlj.pno();
        }
        boolean zOuw = uoy.ouw(ouwVar.jvy, ouwVar.vt, ouwVar.fkw, ouwVar.yu ? 7 : 5, iPno);
        if (zOuw) {
            if (ouwVar.vt != null) {
                od odVarOuw = od.ouw();
                vpp vppVar = ouwVar.vt;
                od.vt vtVar = new od.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.2
                    @Override // com.bytedance.sdk.openadsdk.core.od.vt
                    public final void ouw() {
                        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar;
                        if (ouwVar2 == null || (vtVar2 = ouwVar2.fqk) == null) {
                            return;
                        }
                        vtVar2.kn();
                    }
                };
                if (vppVar != null) {
                    String strVt = od.vt(vppVar);
                    if (!TextUtils.isEmpty(strVt)) {
                        odVarOuw.fkw.put(strVt, vtVar);
                    }
                }
            }
            if (vtVarHun != null) {
                com.bytedance.sdk.openadsdk.activity.lh lhVar = vtVarHun.tlj;
                if (lhVar instanceof com.bytedance.sdk.openadsdk.activity.yu) {
                    lhVar.zih();
                }
            }
        }
        return zOuw;
    }
}
