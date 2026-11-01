package sg.bigo.ads.controller.landing;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.b.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements sg.bigo.ads.a.a.c, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70962c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f70965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sg.bigo.ads.api.core.b f70966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.ad.c<?, ?> f70967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.controller.landing.a f70968i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f70971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f70972m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f70964e = "ChromeTabStatSession";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f70969j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f70970k = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f70963d = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<h.a> f70973n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f70974o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f70975p = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f70976q = false;

    public static class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f70977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f70978b;

        private a(int i10, long j10) {
            this.f70977a = i10;
            this.f70978b = System.currentTimeMillis() - j10;
        }

        public /* synthetic */ a(int i10, long j10, byte b10) {
            this(i10, j10);
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final int a() {
            return this.f70977a;
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final long b() {
            return this.f70978b;
        }
    }

    public b(String str, @Nullable sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.ad.c<?, ?> cVar, @Nullable sg.bigo.ads.controller.landing.a aVar) {
        long jCurrentTimeMillis;
        this.f70965f = str;
        this.f70966g = bVar;
        this.f70967h = cVar;
        this.f70968i = aVar;
        if (cVar != null) {
            this.f70971l = cVar.s();
            jCurrentTimeMillis = cVar.t();
        } else {
            this.f70971l = 0;
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f70972m = jCurrentTimeMillis;
    }

    private void a(int i10) {
        a aVar = new a(i10, this.f70972m, (byte) 0);
        this.f70973n.add(0, aVar);
        sg.bigo.ads.core.d.b.a(this, aVar, this.f70966g, this.f70967h, (String) null);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs shown: " + this.f70965f);
        a(1);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page started: " + this.f70965f);
        this.f70963d = SystemClock.elapsedRealtime();
        this.f70969j = this.f70969j + 1;
        if (this.f70974o.compareAndSet(true, false)) {
            a(4);
        }
    }

    @Override // sg.bigo.ads.a.a.c
    public final void c() {
        this.f70970k = true;
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page aborted: " + this.f70965f);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page failed: " + this.f70965f);
        if (this.f70976q) {
            return;
        }
        a(6);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page finished: " + this.f70965f);
        this.f70976q = true;
        if (this.f70975p.compareAndSet(true, false)) {
            a(5);
        }
    }

    @Override // sg.bigo.ads.a.a.c
    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs hidden: " + this.f70965f);
        sg.bigo.ads.core.d.b.a(this, this.f70973n.isEmpty() ? null : this.f70973n.get(0), System.currentTimeMillis() - this.f70972m, this.f70969j, this.f70966g, this.f70967h, (String) null);
    }

    @Override // sg.bigo.ads.api.b.h
    public final int h() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final String i() {
        return this.f70965f;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int j() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int k() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int l() {
        return this.f70976q ? 100 : 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final boolean m() {
        sg.bigo.ads.controller.landing.a aVar = this.f70968i;
        return aVar != null && aVar.f70941d;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int n() {
        return this.f70971l;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int o() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b.h
    @Nullable
    public final Map<String, String> p() {
        if (!this.f70970k && TextUtils.isEmpty(this.f70960a) && TextUtils.isEmpty(this.f70962c) && TextUtils.isEmpty(this.f70961b)) {
            return null;
        }
        HashMap map = new HashMap();
        if (this.f70970k) {
            map.put("tab_aborted", "1");
        }
        if (!TextUtils.isEmpty(this.f70960a)) {
            map.put("chrome_pkg", this.f70960a);
        }
        if (!TextUtils.isEmpty(this.f70962c)) {
            map.put("is_chrome_def", TextUtils.equals(this.f70960a, this.f70962c) ? "1" : "0");
        }
        if (!TextUtils.isEmpty(this.f70961b)) {
            map.put("chrome_ver", this.f70961b);
        }
        return map;
    }
}
