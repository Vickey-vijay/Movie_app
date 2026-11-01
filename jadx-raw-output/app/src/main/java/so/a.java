package so;

/* JADX INFO: compiled from: Exceptions.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public static Throwable a(Throwable th2) throws IllegalArgumentException {
        if (th2 == null) {
            throw new IllegalArgumentException("Cannot unwrap null throwable");
        }
        Throwable th3 = th2;
        while (th2 != null) {
            th3 = th2;
            th2 = th2.getCause();
        }
        return th3;
    }
}
