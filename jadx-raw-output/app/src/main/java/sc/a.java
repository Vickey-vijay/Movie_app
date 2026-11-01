package sc;

import android.content.Context;
import android.widget.RelativeLayout;
import oc.f;
import oc.h;
import oc.j;
import oc.k;
import oc.l;
import uc.e;
import uc.g;

/* JADX INFO: compiled from: ScarAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tc.a f67209e;

    /* JADX INFO: renamed from: sc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScarAdapter.java */
    public class RunnableC0642a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f67210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qc.c f67211c;

        /* JADX INFO: renamed from: sc.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0643a implements qc.b {
            public C0643a() {
            }

            @Override // qc.b
            public void onAdLoaded() {
                a.this.f65161b.put(RunnableC0642a.this.f67211c.c(), RunnableC0642a.this.f67210b);
            }
        }

        public RunnableC0642a(e eVar, qc.c cVar) {
            this.f67210b = eVar;
            this.f67211c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f67210b.a(new C0643a());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f67214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qc.c f67215c;

        /* JADX INFO: renamed from: sc.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0644a implements qc.b {
            public C0644a() {
            }

            @Override // qc.b
            public void onAdLoaded() {
                a.this.f65161b.put(b.this.f67215c.c(), b.this.f67214b);
            }
        }

        public b(g gVar, qc.c cVar) {
            this.f67214b = gVar;
            this.f67215c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f67214b.a(new C0644a());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ uc.c f67218b;

        public c(uc.c cVar) {
            this.f67218b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f67218b.a(null);
        }
    }

    @Override // oc.e
    public void f(Context context, RelativeLayout relativeLayout, qc.c cVar, int i10, int i11, f fVar) {
        k.a(new c(new uc.c(context, relativeLayout, this.f67209e, cVar, i10, i11, this.f65163d, fVar)));
    }

    @Override // oc.e
    public void e(Context context, qc.c cVar, oc.g gVar) {
        k.a(new RunnableC0642a(new e(context, this.f67209e, cVar, this.f65163d, gVar), cVar));
    }

    @Override // oc.e
    public void g(Context context, qc.c cVar, h hVar) {
        k.a(new b(new g(context, this.f67209e, cVar, this.f65163d, hVar), cVar));
    }

    public a(oc.c<l> cVar, String str) {
        super(cVar);
        tc.a aVar = new tc.a(new pc.a(str));
        this.f67209e = aVar;
        this.f65160a = new vc.b(aVar);
    }
}
