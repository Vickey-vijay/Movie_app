package tv.cjump.jni;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class DanDeviceUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ARCH f72503a = ARCH.Unknown;

    public enum ARCH {
        Unknown,
        ARM,
        X86,
        MIPS,
        ARM64
    }

    public static String c() {
        try {
            Field declaredField = Build.class.getDeclaredField("CPU_ABI2");
            if (declaredField == null) {
                return null;
            }
            Object obj = declaredField.get(null);
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static synchronized ARCH a() {
        byte[] bArr = new byte[20];
        File file = new File(Environment.getRootDirectory(), "lib/libc.so");
        if (file.canRead()) {
            ?? r10 = 0;
            RandomAccessFile randomAccessFile = null;
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "r");
                    try {
                        randomAccessFile3.readFully(bArr);
                        ?? r11 = 8;
                        r11 = 8;
                        r11 = 8;
                        r11 = 8;
                        int i10 = bArr[18] | (bArr[19] << 8);
                        if (i10 == 3) {
                            f72503a = ARCH.X86;
                        } else if (i10 == 8) {
                            f72503a = ARCH.MIPS;
                        } else if (i10 == 40) {
                            f72503a = ARCH.ARM;
                        } else if (i10 != 183) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("libc.so is unknown arch: ");
                            sb2.append(Integer.toHexString(i10));
                            Log.e("NativeBitmapFactory", sb2.toString());
                            r11 = sb2;
                        } else {
                            f72503a = ARCH.ARM64;
                        }
                        try {
                            randomAccessFile3.close();
                            r10 = r11;
                        } catch (IOException e10) {
                            e = e10;
                            e.printStackTrace();
                        }
                    } catch (FileNotFoundException e11) {
                        e = e11;
                        randomAccessFile = randomAccessFile3;
                        e.printStackTrace();
                        r10 = randomAccessFile;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                                r10 = randomAccessFile;
                            } catch (IOException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e13) {
                        e = e13;
                        randomAccessFile2 = randomAccessFile3;
                        e.printStackTrace();
                        r10 = randomAccessFile2;
                        if (randomAccessFile2 != null) {
                            try {
                                randomAccessFile2.close();
                                r10 = randomAccessFile2;
                            } catch (IOException e14) {
                                e = e14;
                                e.printStackTrace();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = randomAccessFile3;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException e16) {
                e = e16;
            } catch (IOException e17) {
                e = e17;
            }
        }
        return f72503a;
    }

    public static String b() {
        return Build.CPU_ABI;
    }

    public static boolean d() {
        return Build.MANUFACTURER.equalsIgnoreCase("MagicBox") && Build.PRODUCT.equalsIgnoreCase("MagicBox");
    }

    public static boolean e() {
        return Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") && Build.PRODUCT.equalsIgnoreCase("dredd");
    }

    public static boolean f() {
        if (!e() && !d()) {
            return false;
        }
        return true;
    }

    public static boolean g() {
        ARCH archA = a();
        if ((i("armeabi-v7a") || i("armeabi")) && ARCH.ARM.equals(archA)) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        ARCH archA = a();
        if (!i("x86") && !ARCH.X86.equals(archA)) {
            return false;
        }
        return true;
    }

    public static boolean i(String str) {
        String strB = b();
        if (!TextUtils.isEmpty(strB) && strB.equalsIgnoreCase(str)) {
            return true;
        }
        if (!TextUtils.isEmpty(c()) && strB.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }
}
