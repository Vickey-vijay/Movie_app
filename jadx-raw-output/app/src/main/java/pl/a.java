package pl;

import kl.c;
import kl.e;
import kl.j;
import kl.k;
import kl.l;
import kl.m;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: DanmakuRenderer.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends ol.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f66162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DanmakuContext f66163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pl.b.g f66164c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pl.b f66166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f66167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ol.a.InterfaceC0600a f66168g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pl.b.g f66165d = new C0615a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f66169h = new b(this, null);

    /* JADX INFO: renamed from: pl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DanmakuRenderer.java */
    public class C0615a implements pl.b.g {
        public C0615a() {
        }

        @Override // pl.b.g
        public boolean a(c cVar, float f10, int i10, boolean z10) {
            if (cVar.f62903n != 0 || !a.this.f66163b.f64338y.c(cVar, i10, 0, a.this.f66162a, z10, a.this.f66163b)) {
                return false;
            }
            cVar.C(false);
            return true;
        }
    }

    /* JADX INFO: compiled from: DanmakuRenderer.java */
    public class b extends k.c<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f66171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l f66172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ol.a.b f66173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f66174d;

        public b() {
        }

        public /* synthetic */ b(a aVar, C0615a c0615a) {
            this();
        }

        @Override // kl.k.b
        public void b() {
            this.f66173c.f65407e = this.f66171a;
            super.b();
        }

        @Override // kl.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int a(c cVar) {
            this.f66171a = cVar;
            if (cVar.v()) {
                this.f66172b.i(cVar);
                return this.f66173c.f65403a ? 2 : 0;
            }
            if (!this.f66173c.f65403a && cVar.q()) {
                return 0;
            }
            if (!cVar.m()) {
                jl.b bVar = a.this.f66163b.f64338y;
                ol.a.b bVar2 = this.f66173c;
                bVar.b(cVar, bVar2.f65405c, bVar2.f65406d, bVar2.f65404b, false, a.this.f66163b);
            }
            if (cVar.b() >= this.f66174d && (cVar.f62903n != 0 || !cVar.n())) {
                if (cVar.o()) {
                    m<?> mVarE = cVar.e();
                    if (a.this.f66167f != null && (mVarE == null || mVarE.get() == null)) {
                        a.this.f66167f.a(cVar);
                    }
                    return 1;
                }
                if (cVar.getType() == 1) {
                    this.f66173c.f65405c++;
                }
                if (!cVar.p()) {
                    cVar.y(this.f66172b, false);
                }
                if (!cVar.t()) {
                    cVar.z(this.f66172b, false);
                }
                a.this.f66166e.c(cVar, this.f66172b, a.this.f66164c);
                if (!cVar.u() || (cVar.f62893d == null && cVar.d() > this.f66172b.getHeight())) {
                    return 0;
                }
                int iA = cVar.a(this.f66172b);
                if (iA == 1) {
                    this.f66173c.f65420r++;
                } else if (iA == 2) {
                    this.f66173c.f65421s++;
                    if (a.this.f66167f != null) {
                        a.this.f66167f.a(cVar);
                    }
                }
                this.f66173c.a(cVar.getType(), 1);
                this.f66173c.b(1);
                this.f66173c.c(cVar);
                if (a.this.f66168g != null && cVar.J != a.this.f66163b.f64337x.f62924d) {
                    cVar.J = a.this.f66163b.f64337x.f62924d;
                    a.this.f66168g.a(cVar);
                }
            }
            return 0;
        }
    }

    @Override // ol.a
    public void a(ol.a.InterfaceC0600a interfaceC0600a) {
        this.f66168g = interfaceC0600a;
    }

    @Override // ol.a
    public void b(l lVar, k kVar, long j10, ol.a.b bVar) {
        this.f66162a = bVar.f65404b;
        b bVar2 = this.f66169h;
        bVar2.f66172b = lVar;
        bVar2.f66173c = bVar;
        bVar2.f66174d = j10;
        kVar.c(bVar2);
    }

    @Override // ol.a
    public void c(boolean z10) {
        this.f66164c = z10 ? this.f66165d : null;
    }

    @Override // ol.a
    public void d(boolean z10) {
        pl.b bVar = this.f66166e;
        if (bVar != null) {
            bVar.a(z10);
        }
    }

    @Override // ol.a
    public void e() {
        this.f66166e.b();
    }

    @Override // ol.a
    public void f(j jVar) {
        this.f66167f = jVar;
    }

    @Override // ol.a
    public void release() {
        this.f66166e.d();
        this.f66163b.f64338y.a();
    }

    public a(DanmakuContext danmakuContext) {
        this.f66163b = danmakuContext;
        this.f66166e = new pl.b(danmakuContext.c());
    }

    @Override // ol.a
    public void clear() {
        e();
        this.f66163b.f64338y.a();
    }
}
