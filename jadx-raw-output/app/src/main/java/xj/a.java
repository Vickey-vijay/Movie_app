package xj;

import kotlin.random.Random;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes9.dex */
public class a extends wj.a {

    /* JADX INFO: renamed from: xj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    public static final class C0795a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0795a f74972a = new C0795a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f74973b;

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
            f74973b = num2;
        }
    }

    private final boolean c(int i10) {
        Integer num = C0795a.f74973b;
        return num == null || num.intValue() >= i10;
    }

    @Override // vj.a
    public Random b() {
        return c(34) ? new hk.a() : super.b();
    }
}
