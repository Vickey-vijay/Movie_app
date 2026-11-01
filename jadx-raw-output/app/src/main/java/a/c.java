package a;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f3399b;

    public static c i() {
        if (f3399b == null) {
            synchronized (c.class) {
                if (f3399b == null) {
                    f3399b = new c();
                }
            }
        }
        return f3399b;
    }
}
