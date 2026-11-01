package com.bytedance.sdk.component.le.ouw;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class pno {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.le.ouw.fkw.ouw f11810jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private static pno f11811ko;
    public volatile fkw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public volatile Map<Integer, com.bytedance.sdk.component.le.ouw.vt.lh> f11812cf;
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw f11813le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw f11814lh;
    public long mwh;
    public volatile Context ouw;
    public volatile boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public volatile com.bytedance.sdk.component.le.ouw.ouw.fkw f11815ra;
    public final AtomicBoolean ryl = new AtomicBoolean(false);
    public volatile com.bytedance.sdk.component.le.ouw.vt.lh tlj;
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw vt;
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw yu;

    public final void ouw(boolean z10) {
        this.ryl.set(z10);
    }

    public static void lh() {
        final com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        yuVar.vt();
        fkw fkwVar = vt().bly;
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        final com.bytedance.sdk.component.le.ouw.vt.lh.lh lhVar = yuVar.vt;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (lhVar != null) {
                lhVar.lh(2);
                return;
            }
            return;
        }
        fkw fkwVar2 = vt().bly;
        if (fkwVar2 == null) {
            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
            return;
        }
        Executor executorOuw = fkwVar2.ouw();
        if (executorOuw == null) {
            executorOuw = fkwVar2.vt();
        }
        if (executorOuw != null) {
            final String str = "flush";
            executorOuw.execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw(str) { // from class: com.bytedance.sdk.component.le.ouw.vt.yu.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.le.ouw.vt.lh.lh lhVar2 = lhVar;
                    if (lhVar2 != null) {
                        lhVar2.lh(2);
                    }
                }
            });
        }
    }

    public static com.bytedance.sdk.component.le.ouw.fkw.ouw ouw() {
        if (f11810jg == null) {
            synchronized (pno.class) {
                if (f11810jg == null) {
                    f11810jg = new com.bytedance.sdk.component.le.ouw.fkw.vt();
                }
            }
        }
        return f11810jg;
    }

    public static synchronized pno vt() {
        if (f11811ko == null) {
            f11811ko = new pno();
        }
        return f11811ko;
    }

    public static void yu() {
        com.bytedance.sdk.component.le.ouw.vt.yu.ouw.ouw();
    }

    public final long fkw() {
        return this.mwh * 24 * 60 * 60 * 1000;
    }

    private pno() {
    }

    public static void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        if (ouwVar == null) {
            return;
        }
        ouwVar.ouw(System.currentTimeMillis());
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        ouwVar.yu();
        yuVar.vt();
        fkw fkwVar = vt().bly;
        com.bytedance.sdk.component.le.ouw.vt.lh.lh lhVar = yuVar.vt;
        if (lhVar != null) {
            boolean z10 = ouwVar.fkw() == 4;
            ouwVar.yu();
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            if (z10) {
                if (lhVar.yu != null) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(ouwVar);
                    lhVar.ouw((List<com.bytedance.sdk.component.le.ouw.yu.ouw>) arrayList, true);
                    return;
                }
                com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                return;
            }
            lhVar.f11822lh.add(ouwVar);
            lhVar.yu(2);
        }
    }

    public static void ouw(String str, boolean z10) {
        com.bytedance.sdk.component.le.ouw.le.ouw.ouw().ouw(str, z10);
    }

    public static void ouw(String str, List<String> list, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.le.ouw.le.ouw.ouw().ouw(str, list, true, map, i10, str2);
    }
}
