package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.safedk.android.internal.partials.PangleFilesBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public class vt {
    private static ArrayMap<File, vt> mwh;
    public static ouw ouw;

    @GuardedBy("TTPropHelper.class")
    private static ArrayMap<String, File> ryl;
    private static boolean vt;

    @GuardedBy("mWriteLock")
    private long bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final File f11927cf;

    @GuardedBy("mLoadLock")
    private Properties fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private volatile boolean f11928le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Object f11929lh;

    @GuardedBy("this")
    private long pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    @GuardedBy("mLoadLock")
    private int f11930ra;
    private final File tlj;
    private final Object yu;

    public class lh implements SharedPreferences.Editor {
        private final Object vt = new Object();

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        @GuardedBy("mEditorLock")
        private final Map<String, Object> f11932lh = new HashMap();

        @GuardedBy("mEditorLock")
        private boolean yu = false;

        private lh ouw(String str, Set<String> set) {
            synchronized (this.vt) {
                this.f11932lh.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        public lh() {
        }

        private C0100vt vt() {
            Properties properties;
            byte b10;
            boolean z10;
            long j10;
            Object obj;
            synchronized (vt.this.f11929lh) {
                try {
                    if (vt.this.f11930ra > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(vt.this.fkw);
                        vt.this.fkw = properties2;
                    }
                    properties = vt.this.fkw;
                    vt.fkw(vt.this);
                    synchronized (this.vt) {
                        b10 = 0;
                        if (this.yu) {
                            if (properties.isEmpty()) {
                                z10 = false;
                            } else {
                                properties.clear();
                                z10 = true;
                            }
                            this.yu = false;
                        } else {
                            z10 = false;
                        }
                        for (Map.Entry<String, Object> entry : this.f11932lh.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value == this || value == null) {
                                if (properties.containsKey(key)) {
                                    properties.remove(key);
                                    z10 = true;
                                }
                            } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                properties.put(key, String.valueOf(value));
                                z10 = true;
                            }
                        }
                        this.f11932lh.clear();
                        if (z10) {
                            vt.le(vt.this);
                        }
                        j10 = vt.this.pno;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new C0100vt(j10, properties, b10);
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            long jCurrentTimeMillis = vt.vt ? System.currentTimeMillis() : 0L;
            C0100vt c0100vtVt = vt();
            vt.ouw(vt.this, c0100vtVt, true);
            try {
                c0100vtVt.f11933lh.await();
                return c0100vtVt.yu;
            } catch (InterruptedException unused) {
            } finally {
                if (vt.vt) {
                    Log.d("TTPropHelper", vt.this.tlj.getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + c0100vtVt.ouw + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            vt.ouw(vt.this, vt(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public final /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return ouw(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putInt(String str, int i10) {
            synchronized (this.vt) {
                this.f11932lh.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putLong(String str, long j10) {
            synchronized (this.vt) {
                this.f11932lh.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putFloat(String str, float f10) {
            synchronized (this.vt) {
                this.f11932lh.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putString(String str, String str2) {
            synchronized (this.vt) {
                this.f11932lh.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putBoolean(String str, boolean z10) {
            synchronized (this.vt) {
                this.f11932lh.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh remove(String str) {
            synchronized (this.vt) {
                this.f11932lh.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh clear() {
            synchronized (this.vt) {
                this.yu = true;
            }
            return this;
        }
    }

    public interface ouw {
        HandlerThread ouw(String str);

        ExecutorService ouw();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.vt$vt, reason: collision with other inner class name */
    public static class C0100vt {
        public boolean fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final CountDownLatch f11933lh;
        public final long ouw;
        public final Properties vt;

        @GuardedBy("mWritingToDiskLock")
        public volatile boolean yu;

        public /* synthetic */ C0100vt(long j10, Properties properties, byte b10) {
            this(j10, properties);
        }

        private C0100vt(long j10, Properties properties) {
            this.f11933lh = new CountDownLatch(1);
            this.yu = false;
            this.fkw = false;
            this.ouw = j10;
            this.vt = properties;
        }

        public final void ouw(boolean z10, boolean z11) {
            this.fkw = z10;
            this.yu = z11;
            this.f11933lh.countDown();
        }
    }

    public static /* synthetic */ int bly(vt vtVar) {
        int i10 = vtVar.f11930ra;
        vtVar.f11930ra = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int fkw(vt vtVar) {
        int i10 = vtVar.f11930ra;
        vtVar.f11930ra = i10 + 1;
        return i10;
    }

    public static /* synthetic */ long le(vt vtVar) {
        long j10 = vtVar.pno;
        vtVar.pno = 1 + j10;
        return j10;
    }

    private void yu() {
        while (!this.f11928le) {
            try {
                this.f11929lh.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final boolean vt(String str) {
        boolean zContainsKey;
        synchronized (this.f11929lh) {
            try {
                try {
                    yu();
                    zContainsKey = this.fkw.containsKey(str);
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    private vt(File file) {
        Object obj = new Object();
        this.f11929lh = obj;
        this.yu = new Object();
        this.fkw = new Properties();
        this.f11928le = false;
        this.f11930ra = 0;
        this.tlj = file;
        this.f11927cf = new File(file.getPath() + ".bak");
        synchronized (obj) {
            this.f11928le = false;
        }
        ouw ouwVar = ouw;
        if (ouwVar != null && ouwVar.ouw() != null) {
            ouw.ouw().execute(new Runnable() { // from class: com.bytedance.sdk.component.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    vt.this.ouw();
                }
            });
        } else {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.vt.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    vt.this.ouw();
                }
            }.start();
        }
    }

    public static void ouw(ouw ouwVar) {
        ouw = ouwVar;
    }

    @RequiresApi(api = 19)
    public static vt ouw(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (vt.class) {
            if (ryl == null) {
                ryl = new ArrayMap<>();
            }
            File file = ryl.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                ryl.put(str, file);
            }
            if (mwh == null) {
                mwh = new ArrayMap<>();
            }
            vt vtVar = mwh.get(file);
            if (vtVar != null) {
                return vtVar;
            }
            vt vtVar2 = new vt(file);
            mwh.put(file, vtVar2);
            return vtVar2;
        }
    }

    public final lh vt() {
        return new lh();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0122 A[Catch: all -> 0x0195, TryCatch #6 {all -> 0x0195, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011e, B:78:0x0122, B:80:0x0129, B:82:0x0132, B:84:0x013a, B:86:0x0146, B:96:0x0193, B:97:0x0194, B:75:0x011d, B:55:0x00e7, B:56:0x00ed, B:74:0x0116, B:94:0x0191, B:93:0x0188, B:70:0x0110, B:51:0x00e1, B:89:0x0182), top: B:117:0x0090, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0127  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132 A[Catch: all -> 0x0195, TryCatch #6 {all -> 0x0195, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011e, B:78:0x0122, B:80:0x0129, B:82:0x0132, B:84:0x013a, B:86:0x0146, B:96:0x0193, B:97:0x0194, B:75:0x011d, B:55:0x00e7, B:56:0x00ed, B:74:0x0116, B:94:0x0191, B:93:0x0188, B:70:0x0110, B:51:0x00e1, B:89:0x0182), top: B:117:0x0090, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:86:0x0146 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #6 {all -> 0x0195, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011e, B:78:0x0122, B:80:0x0129, B:82:0x0132, B:84:0x013a, B:86:0x0146, B:96:0x0193, B:97:0x0194, B:75:0x011d, B:55:0x00e7, B:56:0x00ed, B:74:0x0116, B:94:0x0191, B:93:0x0188, B:70:0x0110, B:51:0x00e1, B:89:0x0182), top: B:117:0x0090, inners: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0146, please report this as an issue */
    public static /* synthetic */ void vt(vt vtVar, C0100vt c0100vt, boolean z10) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        Throwable th2;
        long jCurrentTimeMillis3;
        String str;
        String message;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        boolean z11;
        long jCurrentTimeMillis6 = vt ? System.currentTimeMillis() : 0L;
        boolean zExists = vtVar.tlj.exists();
        if (vt) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jCurrentTimeMillis2 = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = 0;
            jCurrentTimeMillis2 = 0;
        }
        if (zExists) {
            if (vtVar.bly >= c0100vt.ouw) {
                z11 = false;
            } else if (z10) {
                z11 = true;
            } else {
                synchronized (vtVar.f11929lh) {
                    z11 = vtVar.pno == c0100vt.ouw;
                }
            }
            if (!z11) {
                c0100vt.ouw(false, true);
                return;
            }
            boolean zExists2 = vtVar.f11927cf.exists();
            if (vt) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            if (!zExists2) {
                if (!vtVar.tlj.renameTo(vtVar.f11927cf)) {
                    Log.e("TTPropHelper", "Couldn't rename file " + vtVar.tlj + " to backup file " + vtVar.f11927cf);
                    c0100vt.ouw(false, false);
                    return;
                }
            } else {
                vtVar.tlj.delete();
            }
        }
        try {
            synchronized (vtVar.yu) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(vtVar.tlj);
                        try {
                            try {
                                jCurrentTimeMillis3 = vt ? System.currentTimeMillis() : 0L;
                                try {
                                    c0100vt.vt.store(fileOutputStreamFileOutputStreamCtor, (String) null);
                                    if (vt) {
                                        Log.d("TTPropHelper", "save: " + c0100vt.vt);
                                        Log.d("TTPropHelper", "saveToLocal: save to" + vtVar.tlj.getAbsolutePath() + "success");
                                    }
                                    try {
                                        fileOutputStreamFileOutputStreamCtor.close();
                                    } catch (Throwable th3) {
                                        str = "TTPropHelper";
                                        message = th3.getMessage();
                                        Log.w(str, message);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                    Log.e("TTPropHelper", "saveToLocal: ", e);
                                    c0100vt.ouw(false, false);
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th4) {
                                            str = "TTPropHelper";
                                            message = th4.getMessage();
                                            Log.w(str, message);
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                        throw th2;
                                    } catch (Throwable th6) {
                                        Log.w("TTPropHelper", th6.getMessage());
                                        throw th2;
                                    }
                                }
                                throw th2;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                            jCurrentTimeMillis3 = 0;
                            Log.e("TTPropHelper", "saveToLocal: ", e);
                            c0100vt.ouw(false, false);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (vt) {
                                jCurrentTimeMillis4 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis4 = 0;
                            }
                            vtVar.f11927cf.delete();
                            if (vt) {
                                jCurrentTimeMillis5 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis5 = 0;
                            }
                            vtVar.bly = c0100vt.ouw;
                            c0100vt.ouw(true, true);
                            if (vt) {
                                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                }
            }
            if (vt) {
                jCurrentTimeMillis4 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis4 = 0;
            }
            vtVar.f11927cf.delete();
            if (vt) {
                jCurrentTimeMillis5 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis5 = 0;
            }
            vtVar.bly = c0100vt.ouw;
            c0100vt.ouw(true, true);
            if (vt) {
                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
            }
        } catch (Throwable th8) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th8);
            if (vtVar.tlj.exists() && !vtVar.tlj.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + vtVar.tlj);
            }
            c0100vt.ouw(false, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5 A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:48:0x00cf, B:50:0x00d5, B:51:0x00d7, B:52:0x00df), top: B:60:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7 A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:48:0x00cf, B:50:0x00d5, B:51:0x00d7, B:52:0x00df), top: B:60:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void ouw() {
        FileInputStream fileInputStream;
        Throwable th2;
        synchronized (this.f11929lh) {
            if (this.f11928le) {
                if (vt) {
                    Log.d("TTPropHelper", "reload: already loaded, ignore");
                }
                return;
            }
            if (this.f11927cf.exists()) {
                this.tlj.delete();
                this.f11927cf.renameTo(this.tlj);
            }
            if (vt) {
                Log.d("TTPropHelper", "reload: " + this.tlj.getAbsolutePath() + ", exist? " + this.tlj.exists());
            }
            Properties properties = null;
            if (this.tlj.exists()) {
                Properties properties2 = new Properties();
                try {
                    try {
                        fileInputStream = new FileInputStream(this.tlj);
                        try {
                            properties2.load(fileInputStream);
                            if (vt) {
                                Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.tlj.getAbsolutePath());
                            }
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                Log.e("TTPropHelper", "reload: ", th2);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                properties = properties2;
                                synchronized (this.f11929lh) {
                                    if (properties != null) {
                                        if (!properties.isEmpty()) {
                                            this.fkw = properties;
                                        }
                                        this.f11928le = true;
                                        this.f11929lh.notifyAll();
                                    }
                                    this.f11928le = true;
                                    this.f11929lh.notifyAll();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th5) {
                                        Log.w("TTPropHelper", th5.getMessage());
                                    }
                                }
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        fileInputStream = null;
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    Log.w("TTPropHelper", th7.getMessage());
                }
                properties = properties2;
            }
            synchronized (this.f11929lh) {
                if (properties != null) {
                    if (!properties.isEmpty()) {
                        this.fkw = properties;
                    }
                    this.f11928le = true;
                    this.f11929lh.notifyAll();
                } else {
                    this.f11928le = true;
                    this.f11929lh.notifyAll();
                }
                throw th;
            }
        }
    }

    public final String ouw(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.f11929lh) {
            yu();
            property = this.fkw.getProperty(str, str2);
        }
        return property;
    }

    public final int ouw(String str, int i10) {
        int i11;
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        synchronized (this.f11929lh) {
            try {
                try {
                    yu();
                    i11 = Integer.parseInt(this.fkw.getProperty(str, String.valueOf(i10)));
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    public final long ouw(String str, long j10) {
        long j11;
        if (TextUtils.isEmpty(str)) {
            return j10;
        }
        synchronized (this.f11929lh) {
            try {
                try {
                    yu();
                    j11 = Long.parseLong(this.fkw.getProperty(str, String.valueOf(j10)));
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    public final float ouw(String str) {
        float f10;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        synchronized (this.f11929lh) {
            try {
                try {
                    yu();
                    f10 = Float.parseFloat(this.fkw.getProperty(str, "0.0"));
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return 0.0f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10;
    }

    public final boolean ouw(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            return z10;
        }
        synchronized (this.f11929lh) {
            try {
                try {
                    yu();
                    z11 = Boolean.parseBoolean(this.fkw.getProperty(str, String.valueOf(z10)));
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static /* synthetic */ void ouw(vt vtVar, final C0100vt c0100vt, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.vt.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (vt.this.yu) {
                    try {
                        vt.vt(vt.this, c0100vt, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (vt.this.f11929lh) {
                    vt.bly(vt.this);
                }
            }
        };
        if (z10) {
            synchronized (vtVar.f11929lh) {
                z11 = vtVar.f11930ra == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.lh.ouw(runnable, !z10);
    }
}
