package g5;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53122a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f53123b = true;

    public static void b(String str, String str2) {
        if (f53122a == 0) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f53122a <= 3) {
            Log.e(str, str2);
        }
    }

    @Nullable
    public static String e(@Nullable Throwable th2) {
        if (th2 == null) {
            return null;
        }
        if (g(th2)) {
            return "UnknownHostException (no network)";
        }
        return !f53123b ? th2.getMessage() : Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }

    public static void f(String str, String str2) {
        if (f53122a <= 1) {
            Log.i(str, str2);
        }
    }

    public static boolean g(@Nullable Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        if (f53122a <= 2) {
            Log.w(str, str2);
        }
    }

    public static String a(String str, @Nullable Throwable th2) {
        String strE = e(th2);
        if (!TextUtils.isEmpty(strE)) {
            return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    public static void d(String str, String str2, @Nullable Throwable th2) {
        c(str, a(str2, th2));
    }

    public static void i(String str, String str2, @Nullable Throwable th2) {
        h(str, a(str2, th2));
    }
}
