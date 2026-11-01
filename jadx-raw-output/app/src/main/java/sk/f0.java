package sk;

/* JADX INFO: compiled from: SystemProps.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f71945a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f71945a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
