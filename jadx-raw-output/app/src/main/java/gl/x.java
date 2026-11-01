package gl;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile x f53608c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f53609a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53610b = "OktMaxInterstitialCacheUtil";

    public static x a() {
        if (f53608c == null) {
            synchronized (x.class) {
                f53608c = new x();
            }
        }
        return f53608c;
    }
}
