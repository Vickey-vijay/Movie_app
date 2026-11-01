package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class ksc {
    private static final Object ouw = new Object();
    private static final Map<ouw, Object> vt = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static AtomicBoolean f11919lh = new AtomicBoolean(false);
    private static volatile int yu = -1;
    private static volatile long fkw = 0;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static volatile int f11918le = 60000;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static th f11920ra = null;
    private static final AtomicBoolean pno = new AtomicBoolean(false);

    public interface ouw {
        void ouw(boolean z10, int i10);
    }

    public static class vt extends BroadcastReceiver {
        private vt() {
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            try {
                boolean z10 = false;
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (ksc.vt != null && ksc.vt.size() > 0) {
                    z10 = true;
                }
                ksc.vt(context, intent, z10, booleanExtra);
            } catch (Throwable unused) {
            }
        }
    }

    private static int lh(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        th thVar = f11920ra;
                        return (thVar == null || !thVar.ouw()) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(final Context context, final Intent intent, final boolean z10, final boolean z11) {
        if (!z10 && z11) {
            yu = 0;
        } else if (pno.compareAndSet(false, true)) {
            com.bytedance.sdk.component.pno.le.vt(new com.bytedance.sdk.component.pno.pno("getNetworkType") { // from class: com.bytedance.sdk.component.utils.ksc.1
                @Override // java.lang.Runnable
                public final void run() {
                    int unused = ksc.yu = z11 ? 0 : ksc.vt(context);
                    ksc.pno.set(false);
                    if (z10) {
                        ksc.ouw(ksc.yu, z11);
                    }
                }
            });
        }
    }

    public static int ouw(Context context, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (fkw + j10 <= jElapsedRealtime) {
            return vt(context);
        }
        if (yu == -1) {
            return vt(context);
        }
        if (jElapsedRealtime - fkw >= f11918le) {
            vt(context, null, false, false);
        }
        return yu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int vt(Context context) {
        yu = lh(context);
        fkw = SystemClock.elapsedRealtime();
        return yu;
    }

    public static void ouw(ouw ouwVar, Context context) {
        if (ouwVar == null) {
            return;
        }
        if (!f11919lh.get()) {
            try {
                context.registerReceiver(new vt((byte) 0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                f11919lh.set(true);
            } catch (Throwable unused) {
            }
        }
        vt.put(ouwVar, ouw);
    }

    public static void ouw(ouw ouwVar) {
        if (ouwVar == null) {
            return;
        }
        vt.remove(ouwVar);
    }

    public static /* synthetic */ void ouw(int i10, boolean z10) {
        Map<ouw, Object> map = vt;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (ouw ouwVar : map.keySet()) {
            if (ouwVar != null) {
                try {
                    ouwVar.ouw(!z10, i10);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
