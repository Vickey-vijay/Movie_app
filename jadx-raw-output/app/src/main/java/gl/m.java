package gl;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile m f53535b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f53536a = new ConcurrentHashMap();

    public static m a() {
        if (f53535b == null) {
            synchronized (m.class) {
                if (f53535b == null) {
                    f53535b = new m();
                }
            }
        }
        return f53535b;
    }
}
