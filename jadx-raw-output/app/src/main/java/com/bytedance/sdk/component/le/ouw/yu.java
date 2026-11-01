package com.bytedance.sdk.component.le.ouw;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yu {
    public static final yu ouw = new yu();

    public static void ouw() {
        pno.vt().ouw(false);
    }

    public static void ouw(ouw ouwVar, Context context) {
        lh.ouw(context, "context == null");
        lh.ouw(ouwVar, "AdLogConfig == null");
        lh.ouw(ouwVar.bly, "AdLogDepend ==null");
    }

    public static void lh() {
        if (pno.vt().ouw != null) {
            try {
                Context context = pno.vt().ouw;
                le leVarOuw = com.bytedance.sdk.component.le.ouw.vt.vt.ouw.ouw();
                if (leVarOuw != null) {
                    leVarOuw.ouw(Uri.parse(com.bytedance.sdk.component.le.ouw.vt.vt.ouw.vt() + "adLogStop"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void vt() {
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        if (pno.vt().ouw != null) {
            try {
                Context context = pno.vt().ouw;
                le leVarOuw = com.bytedance.sdk.component.le.ouw.vt.vt.ouw.ouw();
                if (leVarOuw != null) {
                    Uri uri = Uri.parse(com.bytedance.sdk.component.le.ouw.vt.vt.ouw.vt() + "adLogStart");
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    leVarOuw.ouw(uri);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean yu() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public static boolean ouw(Context context, fkw fkwVar) {
        if (context == null || fkwVar == null) {
            return false;
        }
        return fkwVar.ra();
    }

    public final void ouw(final com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        final fkw fkwVar = pno.vt().bly;
        if (ouwVar == null || fkwVar == null || pno.vt().ouw == null || fkwVar.ouw() == null) {
            return;
        }
        if (pno.vt().pno) {
            boolean zOuw = ouw(pno.vt().ouw, fkwVar);
            "dispatchEvent mainProcess:".concat(String.valueOf(zOuw));
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            if (zOuw) {
                pno.vt();
                pno.ouw(ouwVar);
                return;
            }
            yu();
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            if (yu()) {
                fkwVar.ouw().execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw("dispatchEvent") { // from class: com.bytedance.sdk.component.le.ouw.yu.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.component.le.ouw.vt.vt.ouw.ouw(ouwVar);
                    }
                });
                return;
            } else {
                com.bytedance.sdk.component.le.ouw.vt.vt.ouw.ouw(ouwVar);
                return;
            }
        }
        pno.vt();
        pno.ouw(ouwVar);
    }

    public static void ouw(String str, List<String> list, boolean z10, int i10, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(com.bytedance.sdk.component.le.ouw.ouw.ouw.le.ouw(it.next()));
                sb2.append(StringUtils.COMMA);
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.le.ouw.ouw.ouw.le.ouw(sb2.toString())) + "&replace=" + String.valueOf(z10) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
            Context context = pno.vt().ouw;
            le leVarOuw = com.bytedance.sdk.component.le.ouw.vt.vt.ouw.ouw();
            if (leVarOuw != null) {
                leVarOuw.ouw(Uri.parse(com.bytedance.sdk.component.le.ouw.vt.vt.ouw.vt() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void ouw(String str, boolean z10) {
        fkw fkwVar = pno.vt().bly;
        try {
            Context context = pno.vt().ouw;
            le leVarOuw = com.bytedance.sdk.component.le.ouw.vt.vt.ouw.ouw();
            if (leVarOuw != null) {
                leVarOuw.ouw(Uri.parse(com.bytedance.sdk.component.le.ouw.vt.vt.ouw.vt() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z10));
            }
        } catch (Throwable unused) {
        }
    }
}
