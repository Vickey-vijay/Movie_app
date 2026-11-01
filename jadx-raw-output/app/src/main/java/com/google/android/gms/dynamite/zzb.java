package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzb {

    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static ClassLoader zza;

    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static Thread zzb;

    /* JADX WARN: Code duplicated, block: B:49:0x00b2 A[Catch: all -> 0x00ea, PHI: r2
  0x00b2: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:44:0x00ab, B:57:0x00e1, B:12:0x0023, B:48:0x00b1, B:49:0x00b2, B:60:0x00e5, B:61:0x00e6, B:13:0x0024, B:15:0x0031, B:21:0x0046, B:22:0x004d, B:24:0x0058, B:30:0x006d, B:31:0x0074, B:41:0x0087, B:42:0x00a9, B:18:0x0040, B:50:0x00b3, B:56:0x00e0, B:55:0x00be), top: B:70:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public static synchronized ClassLoader zza() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (zza == null) {
            Thread thread2 = zzb;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = zzb.getContextClassLoader();
                    } catch (SecurityException e11) {
                        String message = e11.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                zza = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            int iActiveGroupCount = threadGroup2.activeGroupCount();
                            ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                            threadGroup2.enumerate(threadGroupArr);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= iActiveGroupCount) {
                                    threadGroup = null;
                                    break;
                                }
                                threadGroup = threadGroupArr[i11];
                                if ("dynamiteLoader".equals(threadGroup.getName())) {
                                    break;
                                }
                                i11++;
                            }
                            if (threadGroup == null) {
                                threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                            }
                            int iActiveCount = threadGroup.activeCount();
                            Thread[] threadArr = new Thread[iActiveCount];
                            threadGroup.enumerate(threadArr);
                            while (true) {
                                if (i10 >= iActiveCount) {
                                    thread = null;
                                    break;
                                }
                                thread = threadArr[i10];
                                if ("GmsDynamite".equals(thread.getName())) {
                                    break;
                                }
                                i10++;
                            }
                            if (thread == null) {
                                try {
                                    zza zzaVar = new zza(threadGroup, "GmsDynamite");
                                    try {
                                        zzaVar.setContextClassLoader(null);
                                        zzaVar.start();
                                        thread = zzaVar;
                                    } catch (SecurityException e12) {
                                        e10 = e12;
                                        thread = zzaVar;
                                        String message2 = e10.getMessage();
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 39);
                                        sb3.append("Failed to enumerate thread/threadgroup ");
                                        sb3.append(message2);
                                        Log.w("DynamiteLoaderV2CL", sb3.toString());
                                    }
                                } catch (SecurityException e13) {
                                    e10 = e13;
                                }
                            }
                        } catch (SecurityException e14) {
                            e10 = e14;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                zzb = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = zzb.getContextClassLoader();
                    }
                }
                zza = contextClassLoader;
            }
        }
        return zza;
    }
}
