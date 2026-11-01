package com.bytedance.sdk.openadsdk.core.mwh.fkw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.vt.ouw.ra;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.bly;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.cf;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ryl;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.tlj;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {
    public static final com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw ouw = new com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.ouw();

    private static boolean ouw(lh lhVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    public static void ouw(final lh lhVar, final com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw) {
        int i10;
        final AdSlot adSlot;
        vpp vppVar;
        boolean z10;
        if ((lhVar.lh() > 0 || lhVar.fkw()) && (i10 = lhVar.f10449rn) != -2) {
            if (i10 != 1) {
                lhVar.f10452vm = 6000;
                lhVar.f10451th = 6000;
                lhVar.qbp = 6000;
                boolean z11 = lhVar.ouw("material_meta") != null && (lhVar.ouw("material_meta") instanceof vpp);
                boolean z12 = lhVar.ouw("ad_slot") != null && (lhVar.ouw("ad_slot") instanceof AdSlot);
                if (z11 && z12) {
                    vpp vppVar2 = (vpp) lhVar.ouw("material_meta");
                    AdSlot adSlot2 = (AdSlot) lhVar.ouw("ad_slot");
                    if (ouw(lhVar)) {
                        long jYu = lhVar.fkw() ? lhVar.yu() : lhVar.lh();
                        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar2, (String) null, lhVar);
                        ouwVarOuw.f13484lh = new cf(lhVar.pno(), jYu);
                        com.bytedance.sdk.openadsdk.rn.lh.ouw("load_video_start", ouwVarOuw);
                    }
                    vppVar = vppVar2;
                    adSlot = adSlot2;
                } else {
                    adSlot = null;
                    vppVar = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final vpp vppVar3 = vppVar;
                final com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw2 = new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.1
                    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                    public final void ouw(lh lhVar2, int i11) {
                        com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw3 = interfaceC0059ouw;
                        if (interfaceC0059ouw3 != null) {
                            interfaceC0059ouw3.ouw(lhVar2, i11);
                        }
                        if (vppVar3 == null || adSlot == null) {
                            return;
                        }
                        ouw.ouw(lhVar, vppVar3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                    public final void vt(lh lhVar2, int i11) {
                        com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw3 = interfaceC0059ouw;
                        if (interfaceC0059ouw3 != null) {
                            interfaceC0059ouw3.ouw(lhVar2, i11);
                        }
                        vpp vppVar4 = vppVar3;
                        if (vppVar4 != null && adSlot != null) {
                            ouw.ouw(lhVar, vppVar4);
                        }
                        ko.vt("VideoPreloadUtils", "cancel: ", lhVar.bly());
                    }

                    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                    public final void ouw(lh lhVar2, int i11, String str) {
                        com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw3 = interfaceC0059ouw;
                        if (interfaceC0059ouw3 != null) {
                            interfaceC0059ouw3.ouw(lhVar2, i11, str);
                        }
                        if (vppVar3 == null || adSlot == null) {
                            return;
                        }
                        ouw.vt(lhVar, vppVar3, SystemClock.elapsedRealtime() - jElapsedRealtime, i11, str);
                    }
                };
                String strPno = lhVar.pno();
                if (!TextUtils.isEmpty(strPno)) {
                    if (strPno.regionMatches(true, 0, "ws:", 0, 3)) {
                        strPno = "http:" + strPno.substring(3);
                    } else if (strPno.regionMatches(true, 0, "wss:", 0, 4)) {
                        strPno = "https:" + strPno.substring(4);
                    }
                    z10 = ra.vt(strPno) != null;
                }
                if (z10) {
                    pno pnoVar = new pno("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ouw.ouw.ouw(zih.ouw(), lhVar, interfaceC0059ouw2);
                            } catch (Throwable th2) {
                                ko.yu("VideoPreloadUtils", th2.getMessage());
                            }
                        }
                    };
                    if (bs.le()) {
                        bs.vt(pnoVar);
                        return;
                    } else {
                        pnoVar.run();
                        return;
                    }
                }
                if (interfaceC0059ouw != null) {
                    interfaceC0059ouw.ouw(lhVar, 404, "unexpected url: " + lhVar.pno());
                }
                vt(lhVar, vppVar, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                return;
            }
        }
        if (interfaceC0059ouw != null) {
            interfaceC0059ouw.ouw(lhVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(lh lhVar, vpp vppVar, long j10, int i10, String str) {
        if (!ouw(lhVar)) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, lhVar);
        tlj tljVar = new tlj();
        tljVar.ouw = lhVar.pno();
        tljVar.vt = lhVar.lh();
        tljVar.f13488lh = j10;
        tljVar.yu = i10;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        tljVar.fkw = str;
        tljVar.f13487le = "";
        ouwVarOuw.f13484lh = tljVar;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(ouwVarOuw);
    }

    public static /* synthetic */ void ouw(lh lhVar, vpp vppVar, long j10) {
        if (ouw(lhVar)) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, lhVar);
            ryl rylVar = new ryl();
            rylVar.ouw = lhVar.pno();
            rylVar.vt = lhVar.lh();
            rylVar.f13486lh = j10;
            if (lhVar.zin == 1) {
                rylVar.yu = 1L;
            } else {
                rylVar.yu = 0L;
            }
            ouwVarOuw.f13484lh = rylVar;
            com.bytedance.sdk.openadsdk.rn.lh.ouw("load_video_success", ouwVarOuw);
        }
    }

    public static /* synthetic */ void ouw(lh lhVar, vpp vppVar) {
        if (ouw(lhVar)) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, lhVar);
            ouwVarOuw.f13484lh = new bly(lhVar.pno(), lhVar.lh());
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(ouwVarOuw);
        }
    }
}
