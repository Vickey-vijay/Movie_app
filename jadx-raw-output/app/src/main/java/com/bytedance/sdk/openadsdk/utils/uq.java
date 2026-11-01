package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class uq implements Thread.UncaughtExceptionHandler {
    public static volatile boolean ouw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f13454lh;
    private final Thread.UncaughtExceptionHandler vt = Thread.getDefaultUncaughtExceptionHandler();

    public static uq ouw() {
        return new uq();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0185 A[EXC_TOP_SPLITTER, PHI: r3
  0x0185: PHI (r3v4 java.io.FileOutputStream) = (r3v3 java.io.FileOutputStream), (r3v8 java.io.FileOutputStream) binds: [B:75:0x0197, B:65:0x0183] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa A[ADDED_TO_REGION] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        boolean zContains;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        boolean z10;
        int i10;
        boolean z11 = true;
        ouw = true;
        com.bytedance.sdk.component.pno.bly.yu = true;
        com.bytedance.sdk.component.pno.lh.yu.f11897lh = true;
        int i11 = 0;
        com.bytedance.sdk.component.pno.le.ouw(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            zContains = string != null ? string.contains(AdSlot.class.getPackage().getName()) : false;
        } catch (Throwable unused) {
        }
        if (zContains) {
            FileInputStream fileInputStream = null;
            fileOutputStream = null;
            FileOutputStream fileOutputStream = null;
            FileInputStream fileInputStream2 = null;
            fileInputStream = null;
            try {
                if (TextUtils.isEmpty(this.f13454lh)) {
                    vt();
                }
                if (!TextUtils.isEmpty(this.f13454lh)) {
                    File file = new File(this.f13454lh, "tt_crash_count.properties");
                    if (file.exists() && file.isFile() && file.canRead()) {
                        Properties properties = new Properties();
                        FileInputStream fileInputStream3 = new FileInputStream(file);
                        try {
                            properties.load(fileInputStream3);
                            String property = properties.getProperty("crash_count", "0");
                            String property2 = properties.getProperty("crash_last_time", "0");
                            int iIntValue = Integer.valueOf(property).intValue();
                            if (System.currentTimeMillis() - Long.valueOf(property2).longValue() < 300000) {
                                i10 = iIntValue + 1;
                                z10 = false;
                            } else {
                                z10 = true;
                                i10 = 1;
                            }
                            if (i10 < 3) {
                                z11 = false;
                            }
                            if (!z11) {
                                i11 = i10;
                            }
                            com.bytedance.sdk.component.utils.ko.fkw("TTCrashHandler", "==" + i11 + ", " + z11 + ", " + z10);
                            if (z11) {
                                try {
                                    file.delete();
                                } catch (Throwable unused2) {
                                }
                            } else {
                                properties.setProperty("crash_count", String.valueOf(i11));
                                if (z10) {
                                    properties.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                                }
                                fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file);
                                try {
                                    properties.store(fileOutputStreamFileOutputStreamCtor, "tt_crash_info");
                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileInputStream = fileInputStream3;
                                    com.bytedance.sdk.component.utils.qbp.ouw("TTCrashHandler", "crash count error", th);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    if (fileOutputStreamFileOutputStreamCtor != null) {
                                    }
                                    uncaughtExceptionHandler = this.vt;
                                    if (uncaughtExceptionHandler != null) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            if (z11) {
                                try {
                                    com.bytedance.sdk.openadsdk.component.ra.ouw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw());
                                } catch (Throwable unused3) {
                                }
                                try {
                                    com.bytedance.sdk.openadsdk.component.reward.ryl.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw()).ouw();
                                } catch (Throwable unused4) {
                                }
                                try {
                                    com.bytedance.sdk.openadsdk.component.reward.fkw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw()).ouw();
                                } catch (Throwable unused5) {
                                }
                                try {
                                    com.bytedance.sdk.openadsdk.core.settings.cf cfVarVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt();
                                    com.bytedance.sdk.openadsdk.core.settings.lh.vt();
                                    cfVarVt.pno.vt();
                                    cfVarVt.f13057ra.vt();
                                    Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
                                    File file2 = new File(new File(contextOuw.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
                                    if (file2.exists() && file2.isFile()) {
                                        contextOuw.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                                    }
                                } catch (Throwable unused6) {
                                }
                                try {
                                    com.bytedance.sdk.component.adexpress.ouw.vt.vt.vt();
                                } catch (Throwable unused7) {
                                }
                            }
                            fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                            fileInputStream2 = fileInputStream3;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStreamFileOutputStreamCtor != null) {
                                fileOutputStreamFileOutputStreamCtor.close();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStreamFileOutputStreamCtor = null;
                        }
                    } else {
                        Properties properties2 = new Properties();
                        properties2.setProperty("crash_count", "1");
                        properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                        fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file);
                        try {
                            properties2.store(fileOutputStreamFileOutputStreamCtor, "tt_crash_info");
                            com.bytedance.sdk.component.utils.ko.fkw("TTCrashHandler", "==first");
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (Throwable unused8) {
                                }
                            }
                            if (fileOutputStreamFileOutputStreamCtor != null) {
                                try {
                                    fileOutputStreamFileOutputStreamCtor.close();
                                } catch (Throwable unused9) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                com.bytedance.sdk.component.utils.qbp.ouw("TTCrashHandler", "crash count error", th);
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable unused10) {
                                    }
                                }
                                if (fileOutputStreamFileOutputStreamCtor != null) {
                                }
                                uncaughtExceptionHandler = this.vt;
                                if (uncaughtExceptionHandler != null) {
                                    return;
                                } else {
                                    return;
                                }
                            } catch (Throwable th6) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable unused11) {
                                    }
                                }
                                if (fileOutputStreamFileOutputStreamCtor == null) {
                                    throw th6;
                                }
                                try {
                                    fileOutputStreamFileOutputStreamCtor.close();
                                    throw th6;
                                } catch (Throwable unused12) {
                                    throw th6;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                fileOutputStreamFileOutputStreamCtor = null;
            }
        }
        uncaughtExceptionHandler = this.vt;
        if (uncaughtExceptionHandler != null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }

    private uq() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        vt();
    }

    private void vt() {
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        if (contextOuw == null) {
            return;
        }
        try {
            File file = new File(contextOuw.getFilesDir(), "TTCache");
            file.mkdirs();
            this.f13454lh = file.getPath();
        } catch (Throwable unused) {
        }
    }
}
