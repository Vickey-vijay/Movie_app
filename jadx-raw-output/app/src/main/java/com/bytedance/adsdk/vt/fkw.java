package com.bytedance.adsdk.vt;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class fkw {
    private static com.bytedance.adsdk.vt.yu.le bly = null;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private static volatile com.bytedance.adsdk.vt.yu.pno f11092cf = null;
    private static String[] fkw = null;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static long[] f11093le = null;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static boolean f11094lh = true;
    public static boolean ouw = false;
    private static int pno = 0;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static int f11095ra = 0;
    private static volatile com.bytedance.adsdk.vt.yu.ra ryl = null;
    private static com.bytedance.adsdk.vt.yu.fkw tlj = null;
    private static boolean vt = false;
    private static boolean yu = true;

    public static void ouw(String str) {
        if (vt) {
            int i10 = f11095ra;
            if (i10 == 20) {
                pno++;
                return;
            }
            fkw[i10] = str;
            f11093le[i10] = System.nanoTime();
            Trace.beginSection(str);
            f11095ra++;
        }
    }

    public static float vt(String str) {
        int i10 = pno;
        if (i10 > 0) {
            pno = i10 - 1;
            return 0.0f;
        }
        if (!vt) {
            return 0.0f;
        }
        int i11 = f11095ra - 1;
        f11095ra = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(fkw[i11])) {
            Trace.endSection();
            return (System.nanoTime() - f11093le[f11095ra]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + fkw[f11095ra] + ".");
    }

    public static com.bytedance.adsdk.vt.yu.pno ouw(Context context) {
        com.bytedance.adsdk.vt.yu.pno pnoVar;
        com.bytedance.adsdk.vt.yu.pno pnoVar2 = f11092cf;
        if (pnoVar2 != null) {
            return pnoVar2;
        }
        synchronized (com.bytedance.adsdk.vt.yu.pno.class) {
            pnoVar = f11092cf;
            if (pnoVar == null) {
                com.bytedance.adsdk.vt.yu.ra raVarVt = vt(context);
                com.bytedance.adsdk.vt.yu.le vtVar = bly;
                if (vtVar == null) {
                    vtVar = new com.bytedance.adsdk.vt.yu.vt();
                }
                pnoVar = new com.bytedance.adsdk.vt.yu.pno(raVarVt, vtVar);
                f11092cf = pnoVar;
            }
        }
        return pnoVar;
    }

    private static com.bytedance.adsdk.vt.yu.ra vt(Context context) {
        com.bytedance.adsdk.vt.yu.ra raVar;
        if (!f11094lh) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.vt.yu.ra raVar2 = ryl;
        if (raVar2 != null) {
            return raVar2;
        }
        synchronized (com.bytedance.adsdk.vt.yu.ra.class) {
            raVar = ryl;
            if (raVar == null) {
                com.bytedance.adsdk.vt.yu.fkw fkwVar = tlj;
                if (fkwVar == null) {
                    fkwVar = new com.bytedance.adsdk.vt.yu.fkw() { // from class: com.bytedance.adsdk.vt.fkw.1
                        @Override // com.bytedance.adsdk.vt.yu.fkw
                        public final File ouw() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                raVar = new com.bytedance.adsdk.vt.yu.ra(fkwVar);
                ryl = raVar;
            }
        }
        return raVar;
    }

    public static boolean ouw() {
        return yu;
    }
}
