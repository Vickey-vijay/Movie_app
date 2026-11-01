package t;

import java.util.Iterator;

/* JADX INFO: compiled from: PlayComponent.java */
/* JADX INFO: loaded from: classes8.dex */
public class d implements q.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f72080a;

    @Override // q.c
    public void a(int i10) {
        c cVarB = this.f72080a.B();
        if (cVarB == null || cVarB.e() == null) {
            return;
        }
        this.f72080a.g0(cVarB.e().get(i10));
    }

    @Override // q.c
    public void b() {
        a aVar = this.f72080a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // q.c
    public void c() {
        this.f72080a.i0();
    }

    @Override // q.c
    public void d() {
        a aVar = this.f72080a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // q.c
    public void f() {
        this.f72080a.f0(true);
    }

    @Override // q.c
    public void g(boolean z10) {
        if (!(z10 && this.f72080a.D() != null)) {
            Iterator<q.d> it = this.f72080a.E().iterator();
            while (it.hasNext()) {
                it.next().onDestroy();
            }
        } else {
            a aVarB = e.a().b();
            if (aVarB == null || !this.f72080a.toString().equals(aVarB.toString())) {
                return;
            }
            aVarB.T();
        }
    }

    public d(a aVar) {
        this.f72080a = aVar;
    }

    @Override // q.c
    public void e() {
        e.a().e(true);
        this.f72080a.P();
    }
}
