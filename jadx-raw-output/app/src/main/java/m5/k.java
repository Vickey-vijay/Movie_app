package m5;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f64132a = b();

    /* JADX INFO: compiled from: Platform.java */
    public static final class b implements j {
        public b() {
        }
    }

    public static j b() {
        return new b();
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }

    public static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }
}
