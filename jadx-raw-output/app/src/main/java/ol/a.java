package ol;

import kl.c;
import kl.e;
import kl.j;
import kl.k;
import kl.l;

/* JADX INFO: compiled from: IRenderer.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: ol.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IRenderer.java */
    public interface InterfaceC0600a {
        void a(c cVar);
    }

    /* JADX INFO: compiled from: IRenderer.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f65403a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f65405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f65406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f65407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f65408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f65409g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f65410h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f65411i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f65412j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f65413k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f65414l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f65415m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f65416n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f65417o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f65418p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f65419q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f65420r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f65421s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f65423u;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f65404b = new e();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public k f65422t = new ll.e(4);

        public int a(int i10, int i11) {
            if (i10 == 1) {
                int i12 = this.f65408f + i11;
                this.f65408f = i12;
                return i12;
            }
            if (i10 == 4) {
                int i13 = this.f65411i + i11;
                this.f65411i = i13;
                return i13;
            }
            if (i10 == 5) {
                int i14 = this.f65410h + i11;
                this.f65410h = i14;
                return i14;
            }
            if (i10 == 6) {
                int i15 = this.f65409g + i11;
                this.f65409g = i15;
                return i15;
            }
            if (i10 != 7) {
                return 0;
            }
            int i16 = this.f65412j + i11;
            this.f65412j = i16;
            return i16;
        }

        public int b(int i10) {
            int i11 = this.f65413k + i10;
            this.f65413k = i11;
            return i11;
        }

        public void c(c cVar) {
            if (this.f65423u) {
                return;
            }
            this.f65422t.a(cVar);
        }

        public void d() {
            this.f65414l = this.f65413k;
            this.f65413k = 0;
            this.f65412j = 0;
            this.f65411i = 0;
            this.f65410h = 0;
            this.f65409g = 0;
            this.f65408f = 0;
            this.f65415m = 0L;
            this.f65417o = 0L;
            this.f65416n = 0L;
            this.f65419q = 0L;
            this.f65418p = false;
            synchronized (this) {
                this.f65422t.clear();
            }
        }

        public void e(b bVar) {
            if (bVar == null) {
                return;
            }
            this.f65414l = bVar.f65414l;
            this.f65408f = bVar.f65408f;
            this.f65409g = bVar.f65409g;
            this.f65410h = bVar.f65410h;
            this.f65411i = bVar.f65411i;
            this.f65412j = bVar.f65412j;
            this.f65413k = bVar.f65413k;
            this.f65415m = bVar.f65415m;
            this.f65416n = bVar.f65416n;
            this.f65417o = bVar.f65417o;
            this.f65418p = bVar.f65418p;
            this.f65419q = bVar.f65419q;
            this.f65420r = bVar.f65420r;
            this.f65421s = bVar.f65421s;
        }
    }

    void a(InterfaceC0600a interfaceC0600a);

    void b(l lVar, k kVar, long j10, b bVar);

    void c(boolean z10);

    void clear();

    void d(boolean z10);

    void e();

    void f(j jVar);

    void release();
}
