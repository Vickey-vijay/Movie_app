package f0;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static void a(Object... objArr) {
        for (Object obj : objArr) {
            obj.getClass();
        }
    }

    public static void b(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static <T> T c(T t10) {
        t10.getClass();
        return t10;
    }
}
