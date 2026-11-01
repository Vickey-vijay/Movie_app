package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class tc {
    private static String fkw = null;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static int f13444le = Integer.MAX_VALUE;
    public static boolean ouw;
    public static boolean vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final CharSequence f13445lh = "amigo";
    private static final CharSequence yu = "funtouch";

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f13446ra = new ConcurrentHashMap<>();

    private static boolean bly() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2) || !str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean lh() {
        if (!vt) {
            try {
                Class.forName("miui.os.Build");
                ouw = true;
                vt = true;
                return true;
            } catch (Exception unused) {
                vt = true;
            }
        }
        return ouw;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c A[PHI: r0
  0x006c: PHI (r0v28 java.lang.String) = (r0v13 java.lang.String), (r0v15 java.lang.String), (r0v29 java.lang.String) binds: [B:35:0x00cb, B:66:0x01b0, B:21:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public static String ouw() {
        String str;
        if (!TextUtils.isEmpty(fkw)) {
            return fkw;
        }
        String strOuw = com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_local_rom_info", 604800000L);
        fkw = strOuw;
        if (TextUtils.isEmpty(strOuw)) {
            String strRa = "";
            if (le()) {
                strRa = ra();
            } else if (lh()) {
                if (lh()) {
                    strRa = "miui_" + yu("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
                }
            } else if (vt()) {
                str = Build.DISPLAY;
                if (str != null && str.toLowerCase().contains("flyme")) {
                    strRa = str;
                }
            } else if (!pno()) {
                String strYu = yu("ro.build.version.emui");
                if (strYu == null || !strYu.toLowerCase().contains("emotionui")) {
                    str = "";
                } else {
                    str = strYu + "_" + Build.DISPLAY;
                }
                if (TextUtils.isEmpty(str)) {
                    String strYu2 = yu("ro.vivo.os.build.display.id");
                    boolean z10 = false;
                    if (!TextUtils.isEmpty(strYu2) && strYu2.toLowerCase().contains(yu)) {
                        strRa = yu("ro.vivo.os.build.display.id") + "_" + yu("ro.vivo.product.version");
                    } else {
                        str = Build.DISPLAY;
                        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(f13445lh)) {
                            strRa = str + "_" + yu("ro.gn.sv.version");
                        } else {
                            String str2 = Build.MANUFACTURER + Build.BRAND;
                            if (!TextUtils.isEmpty(str2)) {
                                String lowerCase = str2.toLowerCase();
                                if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                strRa = yu("ro.build.uiversion") + "_" + str;
                            } else {
                                if (!TextUtils.isEmpty(yu("ro.letv.release.version"))) {
                                    strRa = "eui_" + yu("ro.letv.release.version") + "_" + str;
                                }
                                if (TextUtils.isEmpty(strRa)) {
                                    strRa = str;
                                }
                            }
                        }
                    }
                } else {
                    strRa = str;
                }
            } else if (pno()) {
                strRa = "coloros_" + yu(uoy.fkw("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
            }
            fkw = strRa;
            com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_local_rom_info", strRa);
        }
        return fkw;
    }

    public static String yu() {
        return yu("ro.build.version.emui");
    }

    public static class ouw implements Callable<String> {
        private final String ouw;

        public ouw(String str) {
            this.ouw = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() throws Exception {
            String str = (String) tc.f13446ra.get(this.ouw);
            if (str != null) {
                return str;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strLh = tc.lh(this.ouw);
            com.bytedance.sdk.component.utils.ko.vt("RomUtils", "property:" + strLh + ", use time :" + (System.currentTimeMillis() - jCurrentTimeMillis));
            if (strLh != null) {
                tc.f13446ra.put(this.ouw, strLh);
            }
            return strLh;
        }
    }

    private static boolean le() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean pno() {
        if (f13444le == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strFkw = uoy.fkw("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strFkw)) {
                f13444le = 0;
            } else {
                f13444le = 1;
            }
        }
        return f13444le == 1;
    }

    public static boolean vt() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String yu(String str) {
        String str2;
        com.bytedance.sdk.component.utils.ko.ouw("RomUtils", "getSystemPropertyTask() called with: propName = [", str, C3426d4.j.f28588e);
        String str3 = f13446ra.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            if (TextUtils.isEmpty("")) {
                final com.bytedance.sdk.component.pno.ra raVar = new com.bytedance.sdk.component.pno.ra(new ouw(str));
                bs.vt(new com.bytedance.sdk.component.pno.pno("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.tc.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        raVar.run();
                    }
                });
                str2 = (String) raVar.get(1L, TimeUnit.SECONDS);
            } else {
                str2 = "";
            }
        } catch (Throwable unused) {
        }
        return str2 == null ? "" : str2;
    }

    private static String ra() {
        if (le()) {
            try {
                return "smartisan_".concat(String.valueOf(yu("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lh(String str) {
        BufferedReader bufferedReader;
        Throwable th2;
        String line = "";
        Process process = null;
        try {
            try {
                try {
                    Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                        try {
                            line = bufferedReader.readLine();
                            processExec.exitValue();
                            bufferedReader.close();
                        } catch (IllegalThreadStateException unused) {
                            process = processExec;
                            try {
                                process.destroy();
                            } catch (Throwable unused2) {
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return line;
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th2);
                                return line;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e10) {
                                        com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Exception while closing InputStream", e10);
                                    }
                                }
                            }
                        }
                    } catch (IllegalThreadStateException unused3) {
                        bufferedReader = null;
                    }
                } catch (IOException e11) {
                    com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Exception while closing InputStream", e11);
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            return line;
        } catch (Throwable th4) {
            bufferedReader = null;
            th2 = th4;
        }
    }

    public static boolean ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            str = yu("ro.build.version.emui");
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || bly();
    }
}
