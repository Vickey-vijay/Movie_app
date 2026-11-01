package o8;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: SpUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f65150a;

    public static SharedPreferences b(Context context) {
        if (f65150a == null) {
            f65150a = context.getSharedPreferences("PictureSpUtils", 0);
        }
        return f65150a;
    }

    public static boolean a(Context context, String str, boolean z10) {
        return b(context).getBoolean(str, z10);
    }

    public static void c(Context context, String str, boolean z10) {
        b(context).edit().putBoolean(str, z10).apply();
    }

    public static void d(Context context, String str, String str2) {
        b(context).edit().putString(str, str2).apply();
    }
}
