package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class js1 {
    public static long a() {
        Runtime runtime = Runtime.getRuntime();
        return Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }
}
