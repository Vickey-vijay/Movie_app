package o8;

import android.os.Build;

/* JADX INFO: compiled from: SdkVersionUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class l {
    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return false;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT == 24;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
