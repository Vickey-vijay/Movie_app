package sg.bigo.ads.common.utils;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f70038a;

    public static void a(String str) {
        if (f70038a) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(boolean z10) {
        f70038a = z10;
    }

    public static boolean a() {
        return false;
    }

    public static boolean b() {
        return f70038a;
    }

    public static void c() {
    }
}
