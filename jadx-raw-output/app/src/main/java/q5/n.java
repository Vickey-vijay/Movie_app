package q5;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n {
    public static void a(Throwable th2) {
        m5.l.m(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
