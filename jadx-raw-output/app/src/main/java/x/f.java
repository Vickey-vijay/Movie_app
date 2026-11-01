package x;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: CastControlImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.a f74218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.c f74219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e.b f74220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f74221d;

    /* JADX INFO: compiled from: CastControlImpl.kt */
    public static final class a implements r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f74223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ un.a<?, ?, ?> f74224c;

        public a(o oVar, un.a<?, ?, ?> aVar) {
            this.f74223b = oVar;
            this.f74224c = aVar;
        }

        @Override // x.r
        public void a(String str) {
            if (f.this.d()) {
                return;
            }
            this.f74223b.a(this.f74224c);
        }

        @Override // x.r
        public void b(String str) {
            if (f.this.d()) {
                return;
            }
            this.f74223b.b(this.f74224c);
        }

        @Override // x.r
        public void c(String str) {
            if (f.this.d()) {
                return;
            }
            this.f74223b.a(this.f74224c);
        }

        @Override // x.r
        public void d(String str, ho.b<?> bVar) {
            ck.p.j(bVar, "event");
            if (f.this.d()) {
                return;
            }
            this.f74223b.c(bVar);
        }
    }

    /* JADX INFO: compiled from: CastControlImpl.kt */
    public static final class b implements r {
        @Override // x.r
        public void a(String str) {
            r.a.c(this, str);
        }

        @Override // x.r
        public void b(String str) {
            r.a.b(this, str);
        }

        @Override // x.r
        public void c(String str) {
            r.a.a(this, str);
        }

        @Override // x.r
        public void d(String str, ho.b<?> bVar) {
            r.a.d(this, str, bVar);
        }
    }

    /* JADX INFO: compiled from: CastControlImpl.kt */
    public static final class c implements r {
        @Override // x.r
        public void a(String str) {
            r.a.c(this, str);
        }

        @Override // x.r
        public void b(String str) {
            r.a.b(this, str);
        }

        @Override // x.r
        public void c(String str) {
            r.a.a(this, str);
        }

        @Override // x.r
        public void d(String str, ho.b<?> bVar) {
            r.a.d(this, str, bVar);
        }
    }

    public f(ln.b bVar, un.a<?, ?, ?> aVar, o oVar) {
        ck.p.j(bVar, "controlPoint");
        ck.p.j(aVar, C3426d4.i.G);
        ck.p.j(oVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        w.a aVar2 = w.a.f73245b;
        e.a aVar3 = new e.a(bVar, aVar.j(aVar2.l()));
        this.f74218a = aVar3;
        aVar3.q(new a(oVar, aVar), new fo.a());
        e.c cVar = new e.c(bVar, aVar.j(aVar2.n()));
        this.f74219b = cVar;
        cVar.q(new b(), new lo.i());
        e.b bVar2 = new e.b(bVar, aVar.j(aVar2.m()));
        this.f74220c = bVar2;
        bVar2.q(new c(), new fo.a());
    }

    @Override // x.b
    public void c(p<mj.r> pVar) {
        this.f74218a.c(pVar);
    }

    public final boolean d() {
        return this.f74221d;
    }

    public final void e(boolean z10) {
        this.f74221d = z10;
    }

    @Override // x.b
    public void a(String str, p<mj.r> pVar) {
        ck.p.j(str, "speed");
        this.f74218a.a(str, pVar);
    }

    @Override // x.b
    public void b(String str, String str2, p<mj.r> pVar) {
        ck.p.j(str, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        ck.p.j(str2, "title");
        this.f74218a.b(str, str2, pVar);
    }
}
