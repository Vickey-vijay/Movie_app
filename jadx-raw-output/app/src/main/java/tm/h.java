package tm;

import java.io.IOException;
import javax.servlet.ServletException;
import rm.i;
import rm.n;

/* JADX INFO: compiled from: ScopedHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ThreadLocal<h> f72463s = new ThreadLocal<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f72464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f72465r;

    public abstract void C0(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException;

    public abstract void D0(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException;

    public boolean E0() {
        return false;
    }

    @Override // tm.g, tm.a, ym.b, ym.a
    public void d0() throws Exception {
        try {
            ThreadLocal<h> threadLocal = f72463s;
            h hVar = threadLocal.get();
            this.f72464q = hVar;
            if (hVar == null) {
                threadLocal.set(this);
            }
            super.d0();
            this.f72465r = (h) z0(h.class);
            if (this.f72464q == null) {
            }
        } finally {
            if (this.f72464q == null) {
                f72463s.set(null);
            }
        }
    }

    public final void F0(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        h hVar = this.f72465r;
        if (hVar != null && hVar == this.f72462p) {
            hVar.C0(str, nVar, aVar, cVar);
            return;
        }
        i iVar = this.f72462p;
        if (iVar != null) {
            iVar.v(str, nVar, aVar, cVar);
        }
    }

    public final void G0(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        h hVar = this.f72465r;
        if (hVar != null) {
            hVar.D0(str, nVar, aVar, cVar);
            return;
        }
        h hVar2 = this.f72464q;
        if (hVar2 != null) {
            hVar2.C0(str, nVar, aVar, cVar);
        } else {
            C0(str, nVar, aVar, cVar);
        }
    }

    @Override // tm.g, rm.i
    public final void v(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        if (this.f72464q == null) {
            D0(str, nVar, aVar, cVar);
        } else {
            C0(str, nVar, aVar, cVar);
        }
    }
}
