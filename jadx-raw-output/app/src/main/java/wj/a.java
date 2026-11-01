package wj;

import ck.p;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes9.dex */
public class a extends vj.a {

    /* JADX INFO: renamed from: wj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    public static final class C0782a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0782a f74129a = new C0782a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f74130b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    num2 = num;
                }
            }
            f74130b = num2;
        }
    }

    @Override // vj.a
    public void a(Throwable th2, Throwable th3) {
        p.j(th2, "cause");
        p.j(th3, "exception");
        if (c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }

    public final boolean c(int i10) {
        Integer num = C0782a.f74130b;
        return num == null || num.intValue() >= i10;
    }
}
