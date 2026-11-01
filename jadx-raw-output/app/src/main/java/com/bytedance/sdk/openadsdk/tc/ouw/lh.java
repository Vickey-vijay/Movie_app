package com.bytedance.sdk.openadsdk.tc.ouw;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes8.dex */
public final class lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static String f13343lh = "engaged_view";
    public static boolean ouw = false;
    public static int vt = 6;

    public static void ouw(vpp vppVar) {
        vt vtVarLh = lh(vppVar);
        if (vtVarLh != null && vtVarLh.yu.get() == 0) {
            vtVarLh.ouw = vtVarLh.vt.xdk() * 1000;
            vtVarLh.yu.set(1);
            vtVarLh.fkw = SystemClock.elapsedRealtime();
            Handler handlerOuw = ouw.ouw();
            if (handlerOuw != null) {
                handlerOuw.postDelayed(vtVarLh.f13346ra, vtVarLh.ouw);
            }
        }
    }

    private static vt lh(vpp vppVar) {
        if (vppVar == null || !vppVar.mt()) {
            return null;
        }
        return vppVar.f12876sn;
    }

    public static void vt(vpp vppVar) {
        vt vtVarLh = lh(vppVar);
        if (vtVarLh == null) {
            return;
        }
        vtVarLh.ouw();
    }

    public static void ouw(vpp vppVar, int i10) {
        vt vtVarLh = lh(vppVar);
        if (vtVarLh == null || vtVarLh.vt()) {
            return;
        }
        vtVarLh.ouw(i10);
    }

    public static void ouw(vpp vppVar, boolean z10) {
        vt vtVarLh = lh(vppVar);
        if (vtVarLh == null || vtVarLh.vt()) {
            return;
        }
        vtVarLh.f13345lh.set(z10);
        vtVarLh.ouw(z10 ? 4 : 8);
    }
}
