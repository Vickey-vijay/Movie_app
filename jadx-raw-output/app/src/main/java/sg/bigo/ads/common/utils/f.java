package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static long a(long j10, int i10) {
        char c10;
        if (i10 == 2) {
            c10 = '\n';
        } else if (i10 == 3) {
            c10 = 20;
        } else {
            if (i10 != 4) {
                return j10;
            }
            c10 = 30;
        }
        return j10 >> c10;
    }

    public static long a(String str, int i10) {
        File file = new File(str);
        if (file.exists()) {
            return a(file.length(), i10);
        }
        return 0L;
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        return file.delete();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean a(String str) throws Throwable {
        FileInputStream fileInputStream;
        Exception e10;
        File file = new File(str);
        boolean z10 = false;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    fileInputStream.read(bArr);
                    String str2 = new String(bArr);
                    if (str2.contains("ftyp") && str2.contains("moov")) {
                        sg.bigo.ads.common.t.a.a(0, 3, "FileUtils", "contains ftyp moov");
                        z10 = true;
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    sg.bigo.ads.common.t.a.a(0, "FileUtils", "read file " + file.getPath() + " failed" + e10.getMessage());
                    if (fileInputStream != null) {
                    }
                    return z10;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
        try {
            fileInputStream.close();
        } catch (IOException unused2) {
        }
        return z10;
    }

    public static boolean a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str, str2);
        boolean z10 = false;
        try {
            boolean zMkdirs = !file.exists() ? file.mkdirs() : true;
            if (file2.exists()) {
                return zMkdirs;
            }
            if (zMkdirs && file2.createNewFile()) {
                z10 = true;
            }
            return z10;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void b(@NonNull File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else {
                        a(file2);
                    }
                }
            }
        }
        a(file);
    }

    public static boolean b(String str) {
        if (q.a((CharSequence) str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean b(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    public static String c(String str) {
        return str + ".tmp";
    }

    public static void c(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    public static boolean c(File file) {
        boolean z10 = false;
        try {
            File parentFile = file.getParentFile();
            boolean zMkdirs = !parentFile.exists() ? parentFile.mkdirs() : true;
            if (file.exists()) {
                return zMkdirs;
            }
            if (zMkdirs && file.createNewFile()) {
                z10 = true;
            }
            return z10;
        } catch (IOException unused) {
            return false;
        }
    }

    public static String d(String str) {
        return str + ".tmp";
    }
}
