package f0;

import android.util.Log;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f52810a;

    public static void a(String str) {
        if (f52810a) {
            Log.d("VideoCache", str);
        }
    }

    public static void b(String str) {
        if (f52810a) {
            Log.e("VideoCache", str);
        }
    }

    public static void c(String str) {
        if (f52810a) {
            Log.i("VideoCache", str);
        }
    }

    public static void d(String str) {
        if (f52810a) {
            Log.w("VideoCache", str);
        }
    }
}
