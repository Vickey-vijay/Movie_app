package ic;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
