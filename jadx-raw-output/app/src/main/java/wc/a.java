package wc;

import android.content.Context;
import android.widget.RelativeLayout;
import oc.f;
import oc.h;
import oc.j;
import oc.k;
import oc.l;
import yc.e;
import yc.g;

/* JADX INFO: compiled from: ScarAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xc.a f74028e;

    /* JADX INFO: renamed from: wc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScarAdapter.java */
    public class RunnableC0779a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f74029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qc.c f74030c;

        /* JADX INFO: renamed from: wc.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0780a implements qc.b {
            public C0780a() {
            }

            @Override // qc.b
            public void onAdLoaded() {
                a.this.f65161b.put(RunnableC0779a.this.f74030c.c(), RunnableC0779a.this.f74029b);
            }
        }

        public RunnableC0779a(e eVar, qc.c cVar) {
            this.f74029b = eVar;
            this.f74030c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f74029b.a(new C0780a());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f74033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qc.c f74034c;

        /* JADX INFO: renamed from: wc.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0781a implements qc.b {
            public C0781a() {
            }

            @Override // qc.b
            public void onAdLoaded() {
                a.this.f65161b.put(b.this.f74034c.c(), b.this.f74033b);
            }
        }

        public b(g gVar, qc.c cVar) {
            this.f74033b = gVar;
            this.f74034c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f74033b.a(new C0781a());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yc.c f74037b;

        public c(yc.c cVar) {
            this.f74037b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f74037b.a(null);
        }
    }

    @Override // oc.e
    public void f(Context context, RelativeLayout relativeLayout, qc.c cVar, int i10, int i11, f fVar) {
        k.a(new c(new yc.c(context, relativeLayout, this.f74028e, cVar, i10, i11, this.f65163d, fVar)));
    }

    @Override // oc.e
    public void e(Context context, qc.c cVar, oc.g gVar) {
        k.a(new RunnableC0779a(new e(context, this.f74028e, cVar, this.f65163d, gVar), cVar));
    }

    @Override // oc.e
    public void g(Context context, qc.c cVar, h hVar) {
        k.a(new b(new g(context, this.f74028e, cVar, this.f65163d, hVar), cVar));
    }

    public a(oc.c<l> cVar, String str) {
        super(cVar);
        xc.a aVar = new xc.a(new pc.a(str));
        this.f74028e = aVar;
        this.f65160a = new zc.b(aVar);
    }
}
