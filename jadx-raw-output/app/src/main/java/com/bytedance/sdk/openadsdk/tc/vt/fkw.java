package com.bytedance.sdk.openadsdk.tc.vt;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class fkw {
    private static final Map<Integer, vt> ouw = new ConcurrentHashMap();

    public static void ouw(vt vtVar, int i10) {
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(i10);
    }

    public static void vt(Integer num) {
        ouw.remove(num);
    }

    public static class ouw {
        public int ouw;
        public int vt = -1;

        public ouw(int i10) {
            this.ouw = i10;
        }
    }

    public static vt ouw(Integer num) {
        return ouw.get(num);
    }

    public static Integer vt(vpp vppVar) {
        return Integer.valueOf((vppVar.ux() + vppVar.pv).hashCode());
    }

    public static void ouw(View view, vpp vppVar, ouw ouwVar) {
        vt pnoVar;
        if (view == null || vppVar == null || vppVar.vrp) {
            return;
        }
        String strOuw = uoy.ouw(vppVar);
        boolean z10 = (((("open_ad".equals(strOuw) || "fullscreen_interstitial_ad".equals(strOuw) || "rewarded_video".equals(strOuw)) && !od.vt(vppVar)) && vppVar.fvf != 5) && vppVar.fvf != 33) && vpp.fkw(vppVar) && vppVar.f12874sd != null;
        if (od.vt(vppVar) && ouwVar != null) {
            ouwVar.ouw = -1;
        }
        if (vppVar.pv == null) {
            pnoVar = null;
        } else {
            Integer numVt = vt(vppVar);
            Map<Integer, vt> map = ouw;
            if (map.containsKey(numVt)) {
                vt vtVar = map.get(numVt);
                if (vtVar != null) {
                    vtVar.ouw(view);
                }
                pnoVar = vtVar;
            } else {
                pnoVar = z10 ? new pno(numVt, view, vppVar, ouwVar) : new lh(numVt, view, vppVar, ouwVar);
                map.put(numVt, pnoVar);
            }
        }
        if (pnoVar != null) {
            pnoVar.ouw();
        }
    }

    public static void ouw(vpp vppVar, int i10) {
        if (vppVar == null || vppVar.pv == null) {
            return;
        }
        ouw(ouw.get(vt(vppVar)), i10);
    }

    public static void ouw(vpp vppVar) {
        if (vppVar == null || vppVar.pv == null) {
            return;
        }
        Integer numVt = vt(vppVar);
        Map<Integer, vt> map = ouw;
        vt vtVar = map.get(numVt);
        if (vtVar != null) {
            vtVar.pno();
        }
        vt(numVt);
        if (map.size() <= 0) {
            ra.ouw();
        }
    }
}
