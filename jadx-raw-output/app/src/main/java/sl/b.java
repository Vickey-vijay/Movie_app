package sl;

/* JADX INFO: compiled from: AppStatusManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f71998b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71999a = 0;

    public static b b() {
        if (f71998b == null) {
            synchronized (b.class) {
                if (f71998b == null) {
                    f71998b = new b();
                }
            }
        }
        return f71998b;
    }

    public int a() {
        return this.f71999a;
    }

    public void c(int i10) {
        this.f71999a = i10;
    }
}
