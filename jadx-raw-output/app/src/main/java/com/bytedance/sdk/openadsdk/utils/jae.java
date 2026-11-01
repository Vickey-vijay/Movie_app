package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class jae {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static String f13387lh = null;
    private static String ouw = null;
    private static String vt = null;
    private static volatile boolean yu = true;

    public static class ouw extends com.bytedance.sdk.component.pno.pno {
        public static AtomicBoolean ouw = new AtomicBoolean(false);
        private static final AtomicLong vt = new AtomicLong(0);

        private ouw(String str) {
            super(str, 5);
        }

        public static void ouw() {
            if (ouw.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = vt;
            if (jCurrentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            bs.vt((com.bytedance.sdk.component.pno.pno) new ouw("UpdateSimStatusTask"));
        }

        @Override // java.lang.Runnable
        public final void run() {
            ouw.set(true);
            jae.yu();
            ouw.set(false);
        }
    }

    public static String vt() {
        try {
            ouw.ouw();
            if (!yu) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                sb2.append(yu ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.qbp.lh("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.zih.ouw().getResources().getConfiguration();
            int i10 = configuration.mcc;
            String strValueOf = i10 != 0 ? String.valueOf(i10) : vt;
            com.bytedance.sdk.component.utils.qbp.lh("MCC", "config=" + configuration.mcc + ",sMCC=" + vt);
            return strValueOf;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("SimUtils", th2.getMessage());
            return null;
        }
    }

    public static String lh() {
        ouw.ouw();
        return f13387lh;
    }

    public static String ouw() {
        ouw.ouw();
        return ouw;
    }

    public static /* synthetic */ void yu() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        String str;
        if (com.bytedance.sdk.openadsdk.core.zih.ouw() != null) {
            yu = true;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService("phone");
                try {
                    int simState = telephonyManager.getSimState();
                    if (simState == 0 || simState == 1) {
                        yu = false;
                    }
                    if (yu) {
                        str = "Have SIM card";
                    } else {
                        str = "No SIM card";
                    }
                    com.bytedance.sdk.component.utils.ko.fkw("MCC", str);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("SimUtils", th2.getMessage());
                }
                String str2 = null;
                try {
                    simOperatorName = telephonyManager.getSimOperatorName();
                } catch (Throwable unused) {
                    simOperatorName = null;
                }
                try {
                    simOperator = telephonyManager.getNetworkOperator();
                } catch (Throwable unused2) {
                    simOperator = null;
                }
                if (simOperator == null || simOperator.length() < 5) {
                    try {
                        simOperator = telephonyManager.getSimOperator();
                    } catch (Throwable unused3) {
                    }
                }
                if (!TextUtils.isEmpty(simOperator) && simOperator.length() > 4) {
                    String strSubstring2 = simOperator.substring(0, 3);
                    strSubstring = simOperator.substring(3);
                    str2 = strSubstring2;
                } else {
                    strSubstring = null;
                }
                if (!TextUtils.isEmpty(simOperatorName)) {
                    ouw = simOperatorName;
                }
                if (!TextUtils.isEmpty(str2)) {
                    vt = str2;
                }
                if (!TextUtils.isEmpty(strSubstring)) {
                    f13387lh = strSubstring;
                }
            } catch (Throwable unused4) {
            }
        }
    }
}
