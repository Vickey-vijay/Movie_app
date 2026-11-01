package sg.bigo.ads.controller.a.b;

import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.b f70454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f70455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.d f70456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f70457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.common.n.e f70458f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicInteger f70459g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AtomicBoolean f70460h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f70453a = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f70461i = new Runnable() { // from class: sg.bigo.ads.controller.a.b.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.f70454b != null) {
                if (cVar.f70458f == null) {
                    cVar.f70458f = cVar.a();
                }
                sg.bigo.ads.common.n.e eVar = c.this.f70458f;
                if (!(eVar != null && eVar.f69791a.get() == 0)) {
                    c.this.d();
                    return;
                }
                Pair<String, Integer> pairA = c.a(c.this);
                if (pairA == null || TextUtils.isEmpty((CharSequence) pairA.first)) {
                    return;
                }
                c.this.a(pairA);
                c.this.f70454b.f70407a.a(0L);
                if (1 == ((Integer) pairA.second).intValue() % i.f69318a.y()) {
                    c.this.a((String) pairA.first, ((Integer) pairA.second).intValue(), "0");
                }
            }
        }
    };

    public c(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        this.f70454b = bVar;
        this.f70455c = gVar;
        this.f70456d = dVar;
        this.f70457e = hVar;
    }

    public static /* synthetic */ Pair a(c cVar) {
        sg.bigo.ads.controller.a.b bVar = cVar.f70454b;
        if (bVar == null || bVar.f70407a == null) {
            return null;
        }
        return cVar.b().a(i.f69318a);
    }

    public static boolean a(int i10) {
        return i10 == 702 || i10 == 701 || i10 == 700;
    }

    public abstract sg.bigo.ads.common.n.e a();

    public abstract void a(Pair<String, Integer> pair);

    public final void a(Pair<String, Integer> pair, boolean z10) {
        if (this.f70454b == null || this.f70455c == null || this.f70456d == null || pair == null) {
            return;
        }
        boolean zA = b().a((String) pair.first, this.f70455c.v(), this.f70456d.s(), i.f69318a, z10);
        this.f70454b.f70407a.a(0L);
        if (zA) {
            a((String) pair.first, ((Integer) pair.second).intValue(), "1");
        }
    }

    public final void a(String str, int i10, String str2) {
        String str3;
        if (this instanceof b) {
            str3 = "1";
        } else {
            str3 = this instanceof a ? "2" : "0";
        }
        HashMap map = new HashMap();
        map.put("type", str3);
        map.put("host", str);
        map.put("retry_times", String.valueOf(i.f69318a.y()));
        map.put("retry_interval", String.valueOf(i.f69318a.z()));
        map.put("next_retry_interval", String.valueOf(i.f69318a.A()));
        map.put("cur_retry_time", String.valueOf(i10));
        map.put(CommonUrlParts.UUID, this.f70455c.X());
        map.put("action", str2);
        sg.bigo.ads.core.d.b.d(map);
    }

    public abstract sg.bigo.ads.controller.a.a.b b();

    public final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRound = Math.round((i.f69318a.z() / 2.0f) * 60000.0f);
        long jAbs = Math.abs(jCurrentTimeMillis - this.f70453a);
        if (this.f70453a == 0 || jAbs > iRound) {
            this.f70453a = jCurrentTimeMillis;
            this.f70459g.set(0);
            d();
        }
    }

    public final void d() {
        if (this.f70459g.getAndAdd(1) >= 3 || this.f70460h.get()) {
            return;
        }
        sg.bigo.ads.common.n.d.a(this.f70461i);
        sg.bigo.ads.common.n.d.a(1, this.f70461i, 5000L);
    }
}
