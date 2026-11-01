package y0;

/* JADX INFO: compiled from: XLog.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f75191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f75192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l1.b f75193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f75194d;

    public static void a() {
        if (!f75194d) {
            throw new IllegalStateException("Do you forget to initialize XLog?");
        }
    }

    public static void g(a aVar, l1.b... bVarArr) {
        if (f75194d) {
            j1.b.b().d("XLog is already initialized, do not initialize again");
        }
        f75194d = true;
        if (aVar == null) {
            throw new IllegalArgumentException("Please specify a LogConfiguration");
        }
        f75192b = aVar;
        l1.c cVar = new l1.c(bVarArr);
        f75193c = cVar;
        f75191a = new d(f75192b, cVar);
    }

    public static void b(String str) {
        a();
        f75191a.a(str);
    }

    public static void c(String str) {
        a();
        f75191a.b(str);
    }

    public static void d(String str, Throwable th2) {
        a();
        f75191a.c(str, th2);
    }

    public static void e(String str, Object... objArr) {
        a();
        f75191a.d(str, objArr);
    }

    public static void f(String str) {
        a();
        f75191a.f(str);
    }

    public static void h(String str) {
        a();
        f75191a.k(str);
    }
}
