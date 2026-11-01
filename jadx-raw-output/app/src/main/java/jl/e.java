package jl;

import android.graphics.Canvas;
import kl.k;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: DrawTask.java */
/* JADX INFO: loaded from: classes7.dex */
public class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DanmakuContext f61907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl.a f61908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f61909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nl.a f61910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h.a f61911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ol.a f61912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kl.e f61913g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f61915i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f61919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f61920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f61921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f61922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kl.c f61923q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f61925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f61926t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f61914h = new ll.e(4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f61916j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ol.a.b f61917k = new ol.a.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ll.e f61924r = new ll.e(4);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DanmakuContext.a f61927u = new a();

    /* JADX INFO: compiled from: DrawTask.java */
    public class a implements DanmakuContext.a {
        public a() {
        }

        @Override // master.flame.danmaku.danmaku.model.android.DanmakuContext.a
        public boolean a(DanmakuContext danmakuContext, DanmakuContext.DanmakuConfigTag danmakuConfigTag, Object... objArr) {
            return e.this.q(danmakuContext, danmakuConfigTag, objArr);
        }
    }

    /* JADX INFO: compiled from: DrawTask.java */
    public class b implements ol.a.InterfaceC0600a {
        public b() {
        }

        @Override // ol.a.InterfaceC0600a
        public void a(kl.c cVar) {
            h.a aVar = e.this.f61911e;
            if (aVar != null) {
                aVar.a(cVar);
            }
        }
    }

    /* JADX INFO: compiled from: DrawTask.java */
    public class c extends k.c<kl.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f61930a = ql.b.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f61931b;

        public c(int i10) {
            this.f61931b = i10;
        }

        @Override // kl.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int a(kl.c cVar) {
            boolean zV = cVar.v();
            if (ql.b.b() - this.f61930a > this.f61931b || !zV) {
                return 1;
            }
            e.this.f61909c.g(cVar);
            e.this.r(cVar);
            return 2;
        }
    }

    /* JADX INFO: compiled from: DrawTask.java */
    public class d extends k.c<kl.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f61933a;

        public d(k kVar) {
            this.f61933a = kVar;
        }

        @Override // kl.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int a(kl.c cVar) {
            if (cVar.u() && !cVar.r()) {
                this.f61933a.a(cVar);
                return 0;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: jl.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawTask.java */
    public class C0556e implements nl.a.InterfaceC0594a {
        public C0556e() {
        }
    }

    @Override // jl.h
    public synchronized void a(kl.c cVar) {
        boolean zA;
        h.a aVar;
        boolean zA2;
        if (this.f61909c == null) {
            return;
        }
        if (cVar.f62914y) {
            this.f61924r.a(cVar);
            s(10);
        }
        cVar.f62907r = this.f61909c.size();
        boolean z10 = true;
        if (this.f61919m <= cVar.b() && cVar.b() <= this.f61920n) {
            synchronized (this.f61914h) {
                zA2 = this.f61914h.a(cVar);
            }
            z10 = zA2;
        } else if (cVar.f62914y) {
            z10 = false;
        }
        synchronized (this.f61909c) {
            zA = this.f61909c.a(cVar);
        }
        if (!z10 || !zA) {
            this.f61920n = 0L;
            this.f61919m = 0L;
        }
        if (zA && (aVar = this.f61911e) != null) {
            aVar.c(cVar);
        }
        kl.c cVar2 = this.f61923q;
        if (cVar2 == null || (cVar2 != null && cVar.b() > this.f61923q.b())) {
            this.f61923q = cVar;
        }
    }

    @Override // jl.h
    public void d() {
        this.f61926t = true;
    }

    @Override // jl.h
    public synchronized ol.a.b g(kl.a aVar) {
        return l(aVar, this.f61913g);
    }

    @Override // jl.h
    public void h() {
        this.f61915i = true;
    }

    @Override // jl.h
    public void j() {
        this.f61922p = true;
    }

    public boolean n(DanmakuContext danmakuContext, DanmakuContext.DanmakuConfigTag danmakuConfigTag, Object[] objArr) {
        Boolean bool;
        if (danmakuConfigTag == null || DanmakuContext.DanmakuConfigTag.MAXIMUM_NUMS_IN_SCREEN.equals(danmakuConfigTag)) {
            return true;
        }
        if (DanmakuContext.DanmakuConfigTag.DUPLICATE_MERGING_ENABLED.equals(danmakuConfigTag)) {
            Boolean bool2 = (Boolean) objArr[0];
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    this.f61907a.f64338y.e("1017_Filter");
                    return true;
                }
                this.f61907a.f64338y.h("1017_Filter");
                return true;
            }
        } else if (DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE.equals(danmakuConfigTag) || DanmakuContext.DanmakuConfigTag.SCROLL_SPEED_FACTOR.equals(danmakuConfigTag) || DanmakuContext.DanmakuConfigTag.DANMAKU_MARGIN.equals(danmakuConfigTag)) {
            h();
        } else {
            if (DanmakuContext.DanmakuConfigTag.MAXIMUN_LINES.equals(danmakuConfigTag) || DanmakuContext.DanmakuConfigTag.OVERLAPPING_ENABLE.equals(danmakuConfigTag)) {
                ol.a aVar = this.f61912f;
                if (aVar == null) {
                    return true;
                }
                aVar.c(this.f61907a.g() || this.f61907a.f());
                return true;
            }
            if (DanmakuContext.DanmakuConfigTag.ALIGN_BOTTOM.equals(danmakuConfigTag) && (bool = (Boolean) objArr[0]) != null) {
                ol.a aVar2 = this.f61912f;
                if (aVar2 == null) {
                    return true;
                }
                aVar2.d(bool.booleanValue());
                return true;
            }
        }
        return false;
    }

    public void r(kl.c cVar) {
    }

    public synchronized void s(int i10) {
        k kVar = this.f61909c;
        if (kVar != null && !kVar.isEmpty() && !this.f61924r.isEmpty()) {
            this.f61924r.c(new c(i10));
        }
    }

    @Override // jl.h
    public void b(nl.a aVar) {
        this.f61910d = aVar;
        this.f61918l = false;
    }

    @Override // jl.h
    public k c(long j10) {
        k kVarE;
        long j11 = this.f61907a.f64339z.f63689f;
        long j12 = (j10 - j11) - 100;
        long j13 = j10 + j11;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 >= 3) {
                kVarE = null;
                break;
            }
            try {
                kVarE = this.f61909c.e(j12, j13);
                break;
            } catch (Exception unused) {
                i10 = i11;
            }
        }
        ll.e eVar = new ll.e();
        if (kVarE != null && !kVarE.isEmpty()) {
            kVarE.c(new d(eVar));
        }
        return eVar;
    }

    @Override // jl.h
    public void f() {
        this.f61920n = 0L;
        this.f61919m = 0L;
        this.f61922p = false;
    }

    @Override // jl.h
    public void i() {
        this.f61907a.r();
        ol.a aVar = this.f61912f;
        if (aVar != null) {
            aVar.release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    public ol.a.b l(kl.a aVar, kl.e eVar) {
        k kVarB;
        long j10;
        k kVar;
        if (this.f61915i) {
            this.f61912f.e();
            this.f61915i = false;
        }
        if (this.f61909c == null) {
            return null;
        }
        jl.d.a((Canvas) aVar.u());
        if (this.f61922p && !this.f61926t) {
            return this.f61917k;
        }
        this.f61926t = false;
        ol.a.b bVar = this.f61917k;
        long j11 = eVar.f62916a;
        long j12 = this.f61907a.f64339z.f63689f;
        long j13 = (j11 - j12) - 100;
        long j14 = j12 + j11;
        k kVar2 = this.f61914h;
        long j15 = this.f61919m;
        if (j15 <= j13) {
            j10 = this.f61920n;
            if (j11 > j10) {
                kVarB = this.f61909c.b(j13, j14);
                if (kVarB != null) {
                    this.f61914h = kVarB;
                }
                this.f61919m = j13;
                this.f61920n = j14;
                j10 = j14;
                j15 = j13;
                kVar = kVarB;
            } else {
                kVar = kVar2;
            }
        } else {
            kVarB = this.f61909c.b(j13, j14);
            if (kVarB != null) {
                this.f61914h = kVarB;
            }
            this.f61919m = j13;
            this.f61920n = j14;
            j10 = j14;
            j15 = j13;
            kVar = kVarB;
        }
        k kVar3 = this.f61925s;
        k(bVar, kVar3, kVar);
        if (kVar3 != null && !kVar3.isEmpty()) {
            ol.a.b bVar2 = this.f61917k;
            bVar2.f65403a = true;
            this.f61912f.b(aVar, kVar3, 0L, bVar2);
        }
        this.f61917k.f65403a = false;
        if (kVar == null || kVar.isEmpty()) {
            bVar.f65418p = true;
            bVar.f65416n = j15;
            bVar.f65417o = j10;
            return bVar;
        }
        this.f61912f.b(this.f61908b, kVar, this.f61916j, bVar);
        m(bVar);
        if (bVar.f65418p) {
            kl.c cVar = this.f61923q;
            if (cVar != null && cVar.v()) {
                this.f61923q = null;
                h.a aVar2 = this.f61911e;
                if (aVar2 != null) {
                    aVar2.d();
                }
            }
            if (bVar.f65416n == -1) {
                bVar.f65416n = j15;
            }
            if (bVar.f65417o == -1) {
                bVar.f65417o = j10;
            }
        }
        return bVar;
    }

    public final void m(ol.a.b bVar) {
        boolean z10 = bVar.f65413k == 0;
        bVar.f65418p = z10;
        if (z10) {
            bVar.f65416n = -1L;
        }
        kl.c cVar = bVar.f65407e;
        bVar.f65407e = null;
        bVar.f65417o = cVar != null ? cVar.b() : -1L;
        bVar.f65415m = bVar.f65404b.update(ql.b.b());
    }

    public void o(kl.e eVar) {
        this.f61913g = eVar;
    }

    @Override // jl.h
    public void onPlayStateChanged(int i10) {
        this.f61921o = i10;
    }

    public void p(nl.a aVar) {
        this.f61909c = aVar.h(this.f61907a).i(this.f61908b).k(this.f61913g).j(new C0556e()).a();
        this.f61907a.f64337x.a();
        k kVar = this.f61909c;
        if (kVar != null) {
            this.f61923q = kVar.last();
        }
    }

    @Override // jl.h
    public void prepare() {
        nl.a aVar = this.f61910d;
        if (aVar == null) {
            return;
        }
        p(aVar);
        this.f61920n = 0L;
        this.f61919m = 0L;
        h.a aVar2 = this.f61911e;
        if (aVar2 != null) {
            aVar2.b();
            this.f61918l = true;
        }
    }

    @Override // jl.h
    public void start() {
        this.f61907a.j(this.f61927u);
    }

    public void t() {
        if (this.f61914h != null) {
            this.f61914h = new ll.e();
        }
        ol.a aVar = this.f61912f;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public e(kl.e eVar, DanmakuContext danmakuContext, h.a aVar) {
        boolean z10;
        if (danmakuContext != null) {
            this.f61907a = danmakuContext;
            this.f61908b = danmakuContext.b();
            this.f61911e = aVar;
            pl.a aVar2 = new pl.a(danmakuContext);
            this.f61912f = aVar2;
            aVar2.a(new b());
            if (!danmakuContext.g() && !danmakuContext.f()) {
                z10 = false;
            } else {
                z10 = true;
            }
            aVar2.c(z10);
            o(eVar);
            Boolean boolValueOf = Boolean.valueOf(danmakuContext.e());
            if (boolValueOf != null) {
                if (boolValueOf.booleanValue()) {
                    danmakuContext.f64338y.e("1017_Filter");
                    return;
                } else {
                    danmakuContext.f64338y.h("1017_Filter");
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("context is null");
    }

    @Override // jl.h
    public void e(long j10) {
        t();
        this.f61907a.f64337x.g();
        this.f61907a.f64337x.c();
        this.f61916j = j10;
    }

    public final void k(ol.a.b bVar, k kVar, k kVar2) {
        int size;
        bVar.d();
        bVar.f65404b.update(ql.b.b());
        int size2 = 0;
        bVar.f65405c = 0;
        if (kVar != null) {
            size = kVar.size();
        } else {
            size = 0;
        }
        if (kVar2 != null) {
            size2 = kVar2.size();
        }
        bVar.f65406d = size + size2;
    }

    public boolean q(DanmakuContext danmakuContext, DanmakuContext.DanmakuConfigTag danmakuConfigTag, Object... objArr) {
        boolean zN = n(danmakuContext, danmakuConfigTag, objArr);
        h.a aVar = this.f61911e;
        if (aVar != null) {
            aVar.e();
        }
        return zN;
    }

    @Override // jl.h
    public void seek(long j10) {
        kl.c cVarLast;
        t();
        this.f61907a.f64337x.g();
        this.f61907a.f64337x.c();
        this.f61907a.f64337x.f();
        this.f61907a.f64337x.e();
        this.f61925s = new ll.e(4);
        if (j10 < 1000) {
            j10 = 0;
        }
        this.f61916j = j10;
        this.f61917k.d();
        this.f61917k.f65417o = this.f61916j;
        this.f61920n = 0L;
        this.f61919m = 0L;
        k kVar = this.f61909c;
        if (kVar != null && (cVarLast = kVar.last()) != null && !cVarLast.v()) {
            this.f61923q = cVarLast;
        }
    }
}
