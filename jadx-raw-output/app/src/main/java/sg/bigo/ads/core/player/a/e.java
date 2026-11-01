package sg.bigo.ads.core.player.a;

import android.os.SystemClock;
import com.ironsource.C3426d4;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes2.dex */
final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f71774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile sg.bigo.ads.common.h.a f71775c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f71779g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f71773a = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f71776d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f71777e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f71778f = new AtomicInteger(0);

    public e(String str) {
        this.f71779g = (String) m.a(str);
    }

    public final synchronized boolean a() {
        c cVar;
        if (this.f71774b == null) {
            String str = this.f71779g;
            HashMap map = new HashMap();
            for (String str2 : str.substring(str.indexOf("?") + 1).split(C3426d4.j.f28584c)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            this.f71775c = sg.bigo.ads.core.player.b.a().f71803g.a((String) map.get("path"), (String) map.get("name"));
            if (this.f71775c == null) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "downloadInfo = null");
                cVar = null;
            } else {
                cVar = new c(this.f71775c);
            }
        } else {
            cVar = this.f71774b;
        }
        this.f71774b = cVar;
        return this.f71774b != null;
    }

    public final synchronized void b() {
        if (this.f71773a.decrementAndGet() <= 0) {
            c cVar = this.f71774b;
            synchronized (cVar.f71794c) {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Shutdown proxy for ");
                cVar.f71795d = true;
                cVar.f71793b.b();
            }
            this.f71774b = null;
        }
    }
}
