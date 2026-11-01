package gl;

import com.applovin.mediation.MaxAd;
import com.yk.e.util.AdLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile v0 f53599b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f53600a = new ConcurrentHashMap();

    public final synchronized void b(String str, MaxAd maxAd) {
        try {
            this.f53600a.putIfAbsent(str, maxAd);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public static v0 a() {
        if (f53599b == null) {
            synchronized (f.class) {
                if (f53599b == null) {
                    f53599b = new v0();
                }
            }
        }
        return f53599b;
    }
}
