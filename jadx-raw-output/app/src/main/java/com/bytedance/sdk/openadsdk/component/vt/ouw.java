package com.bytedance.sdk.openadsdk.component.vt;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.ra;
import com.bytedance.sdk.openadsdk.core.model.lh;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.ouw.vt.pno;
import com.bytedance.sdk.openadsdk.utils.fak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ouw {
    private static volatile ouw vt;
    public final vpp ouw = zih.lh();

    public static ouw ouw() {
        if (vt == null) {
            synchronized (ouw.class) {
                if (vt == null) {
                    vt = new ouw();
                }
            }
        }
        return vt;
    }

    private ouw() {
    }

    public static /* synthetic */ void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, lh lhVar, Context context, AdSlot adSlot, ra raVar, fak fakVar) {
        pno lhVar2;
        vt vtVar;
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list != null && !list.isEmpty()) {
            List<com.bytedance.sdk.openadsdk.core.model.vpp> list2 = ouwVar.yu;
            ArrayList arrayList = new ArrayList(list2.size());
            Iterator<com.bytedance.sdk.openadsdk.core.model.vpp> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.vpp next = it.next();
                if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(next) || (next != null && next.tc())) {
                    if (next.rn() != 2) {
                        lhVar2 = new com.bytedance.sdk.openadsdk.ouw.vt.vt(context, next, adSlot);
                    } else if (next.f12874sd != null) {
                        lhVar2 = new com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt(context, next, adSlot);
                    } else {
                        lhVar2 = new com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh(context, next, adSlot);
                    }
                    if (raVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(lhVar2);
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(next) && (vtVar = next.f12874sd) != null && vtVar.f10459ra != null) {
                    int iFqk = next.fqk();
                    zih.yu();
                    if (cf.yu(String.valueOf(iFqk)) && zih.yu().od()) {
                        vt vtVar2 = next.f12874sd;
                        if (vtVar2 != null) {
                            vtVar2.f10460rn = 1;
                        }
                        vt vtVar3 = next.euf;
                        if (vtVar3 != null) {
                            vtVar3.f10460rn = 1;
                        }
                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(CacheDirFactory.getICacheDir(next.f12875sm).lh(), next);
                        vtVarOuw.ouw("material_meta", next);
                        vtVarOuw.ouw("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw) null);
                    }
                    IPBroadcastReceiver.vt(context, next);
                }
            }
            boolean z10 = raVar instanceof PAGNativeAdLoadListener;
            if (z10 && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw(list2.get(0), fakVar.lh());
                }
                if (z10) {
                    ((PAGNativeAdLoadListener) raVar).onAdLoaded(arrayList.get(0));
                }
                ArrayList<Integer> arrayList2 = lhVar.yu;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    return;
                }
                lhVar.f12783ra = 4;
                lh.ouw(lhVar);
                return;
            }
            raVar.onError(-4, com.bytedance.sdk.openadsdk.core.pno.ouw(-4));
            lhVar.vt = -4;
            lhVar.f12783ra = 4;
            lh.ouw(lhVar);
            return;
        }
        raVar.onError(-3, com.bytedance.sdk.openadsdk.core.pno.ouw(-3));
        lhVar.vt = -3;
        lhVar.f12783ra = 4;
        lh.ouw(lhVar);
    }
}
