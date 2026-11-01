package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.zin;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    private static boolean ouw = true;
    private static final AtomicBoolean vt = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:107:? A[Catch: all -> 0x018e, SYNTHETIC, TryCatch #8 {all -> 0x018e, blocks: (B:11:0x0019, B:13:0x001f, B:15:0x0026, B:19:0x003d, B:38:0x0099, B:34:0x0081, B:67:0x0120, B:66:0x010d, B:61:0x00f3, B:54:0x00d7, B:49:0x00bd, B:18:0x0033, B:69:0x0122, B:70:0x0126, B:72:0x012c, B:73:0x0144, B:31:0x007c, B:63:0x0108, B:58:0x00ee, B:51:0x00d2, B:35:0x0094, B:46:0x00b8), top: B:93:0x0019, inners: #0, #3, #10, #11, #12, #14 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.RandomAccessFile] */
    public static void ouw(Context context) {
        if (context != null && ouw && vt.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    FileChannel fileChannel = null;
                    FileLock fileLockTryLock = null;
                    fileChannel = null;
                    fileChannel = null;
                    fileChannel = null;
                    if (!zin.ouw(context)) {
                        String strOuw = zin.ouw();
                        try {
                            if (TextUtils.isEmpty(strOuw)) {
                                strOuw = context.getPackageName() + Process.myPid();
                            }
                            WebView.setDataDirectorySuffix(strOuw);
                            return;
                        } catch (IllegalStateException unused) {
                            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                            declaredMethod2.setAccessible(true);
                            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
                            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
                            field.setAccessible(true);
                            if (TextUtils.isEmpty((String) field.get(cls))) {
                                field.set(cls, strOuw);
                                return;
                            }
                            return;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                    String strVt = vt();
                    File file = new File(context.getDir(TextUtils.isEmpty(strVt) ? C3426d4.i.K : "webview_".concat(String.valueOf(strVt)), 0).getPath(), "webview_data.lock");
                    ko.lh("TTAD.TTMultiInitHelper", file.getAbsolutePath());
                    RandomAccessFile randomAccessFileExists = file.exists();
                    try {
                        if (randomAccessFileExists == 0) {
                            return;
                        }
                        try {
                            randomAccessFileExists = new RandomAccessFile(file, "rw");
                            try {
                                FileChannel channel = randomAccessFileExists.getChannel();
                                if (channel != null) {
                                    try {
                                        fileLockTryLock = channel.tryLock();
                                    } catch (Exception unused3) {
                                        fileChannel = channel;
                                        ouw(file);
                                        if (fileChannel != null) {
                                            try {
                                                fileChannel.close();
                                            } catch (Throwable th2) {
                                                ko.vt("checkWebViewDataLock try close exclusiveFileChannel : " + th2.getMessage());
                                            }
                                        }
                                        if (randomAccessFileExists != 0) {
                                            try {
                                                randomAccessFileExists.close();
                                                return;
                                            } catch (Throwable th3) {
                                                ko.vt("checkWebViewDataLock try close accessFile : " + th3.getMessage());
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileChannel = channel;
                                        if (fileChannel != null) {
                                            try {
                                                fileChannel.close();
                                            } catch (Throwable th5) {
                                                ko.vt("checkWebViewDataLock try close exclusiveFileChannel : " + th5.getMessage());
                                            }
                                        }
                                        if (randomAccessFileExists != 0) {
                                            throw th;
                                        }
                                        try {
                                            randomAccessFileExists.close();
                                            throw th;
                                        } catch (Throwable th6) {
                                            ko.vt("checkWebViewDataLock try close accessFile : " + th6.getMessage());
                                            throw th;
                                        }
                                    }
                                }
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                } else {
                                    ouw(file);
                                }
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th7) {
                                        ko.vt("checkWebViewDataLock try close exclusiveFileChannel : " + th7.getMessage());
                                    }
                                }
                                try {
                                    randomAccessFileExists.close();
                                    return;
                                } catch (Throwable th8) {
                                    ko.vt("checkWebViewDataLock try close accessFile : " + th8.getMessage());
                                    return;
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Exception unused5) {
                            randomAccessFileExists = 0;
                        } catch (Throwable th9) {
                            th = th9;
                            randomAccessFileExists = 0;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (randomAccessFileExists != 0) {
                        throw th;
                    }
                    randomAccessFileExists.close();
                    throw th;
                }
            } catch (Throwable th11) {
                qbp.yu(th11.getMessage(), new Object[0]);
            }
        }
    }

    private static String vt() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void ouw() {
        ouw = false;
    }

    private static void ouw(File file) {
        ouw(file, file.exists() ? file.delete() : false);
    }

    private static void ouw(File file, boolean z10) {
        if (!z10 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e10) {
            qbp.lh("TTAD.TTMultiInitHelper", e10.getMessage());
        }
    }
}
