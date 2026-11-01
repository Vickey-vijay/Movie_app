package com.bytedance.sdk.openadsdk.yu.ouw;

import android.content.Context;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class vt {
    public static AtomicInteger ouw = new AtomicInteger(0);
    public static final AtomicBoolean vt = new AtomicBoolean(false);

    public static void ouw(Context context, boolean z10) {
        try {
            if (vt.compareAndSet(false, true)) {
                com.bytedance.sdk.component.le.ouw.ouw.C0092ouw c0092ouw = new com.bytedance.sdk.component.le.ouw.ouw.C0092ouw();
                c0092ouw.ouw = new ra();
                c0092ouw.f11792lh = com.bytedance.sdk.component.le.ouw.yu.vt.ouw.ouw();
                c0092ouw.yu = new com.bytedance.sdk.component.le.ouw.yu.vt.ouw(3);
                c0092ouw.vt = new com.bytedance.sdk.component.le.ouw.yu.vt.ouw(1);
                c0092ouw.f11791le = z10;
                c0092ouw.f11793ra = new pno();
                c0092ouw.pno = fkw.ouw;
                com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu = zih.yu();
                cfVarYu.ey();
                c0092ouw.f11790cf = cfVarYu.f13054cf;
                com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu2 = zih.yu();
                cfVarYu2.ey();
                c0092ouw.tlj = cfVarYu2.tlj;
                c0092ouw.ryl = zih.yu().pno.ouw("perf_con_adlog_expire_time", 0L);
                com.bytedance.sdk.component.le.ouw.ouw ouwVar = new com.bytedance.sdk.component.le.ouw.ouw((byte) 0);
                ouwVar.vt = c0092ouw.ouw;
                ouwVar.f11788lh = c0092ouw.vt;
                ouwVar.yu = c0092ouw.f11792lh;
                ouwVar.fkw = c0092ouw.yu;
                ouwVar.f11787le = c0092ouw.fkw;
                ouwVar.pno = c0092ouw.f11791le;
                ouwVar.bly = c0092ouw.f11793ra;
                ouwVar.ouw = c0092ouw.pno;
                ouwVar.tlj = c0092ouw.bly;
                ouwVar.ryl = c0092ouw.f11790cf;
                ouwVar.f11786cf = c0092ouw.tlj;
                ouwVar.mwh = c0092ouw.ryl;
                com.bytedance.sdk.component.le.ouw.vt.ouw(ouwVar, context);
                com.bytedance.sdk.component.le.ouw.vt.lh();
            }
        } catch (Throwable unused) {
            vt.set(false);
        }
    }

    public static void lh() {
        try {
            com.bytedance.sdk.component.le.ouw.vt.yu();
            com.bytedance.sdk.component.le.ouw.vt.fkw();
        } catch (Throwable th2) {
            qbp.lh("AdLogSwitchUtils", th2.getMessage());
        }
    }

    public static void vt() {
        com.bytedance.sdk.component.le.ouw.vt.lh();
    }

    public static void ouw(com.bytedance.sdk.openadsdk.yu.ouw ouwVar) {
        com.bytedance.sdk.component.le.ouw.yu.ouw.ouw ouwVar2 = new com.bytedance.sdk.component.le.ouw.yu.ouw.ouw(ouwVar.ouw, ouwVar);
        ouwVar2.vt = ouwVar.le() ? (byte) 1 : (byte) 2;
        ouwVar2.ouw = (byte) 0;
        if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
            ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh());
        }
        com.bytedance.sdk.component.le.ouw.vt.ouw(ouwVar2);
    }

    public static com.bytedance.sdk.openadsdk.rn.lh.lh ouw() {
        return bly.ouw;
    }

    public static void ouw(final List<String> list, final int i10, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("track") { // from class: com.bytedance.sdk.openadsdk.yu.ouw.vt.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
                    vt.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh());
                }
                com.bytedance.sdk.component.le.ouw.vt.ouw(ryl.ouw(zih.ouw()), list, i10, str);
            }
        });
    }

    public static void ouw(String str) {
        ouw(str, false);
    }

    public static void ouw(String str, boolean z10) {
        if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
            ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh());
        }
        com.bytedance.sdk.component.le.ouw.vt.ouw(str, z10);
    }
}
