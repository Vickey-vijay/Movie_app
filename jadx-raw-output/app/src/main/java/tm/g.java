package tm;

import java.io.IOException;
import javax.servlet.ServletException;
import rm.i;
import rm.n;
import rm.p;

/* JADX INFO: compiled from: HandlerWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f72462p;

    public i A0() {
        return this.f72462p;
    }

    @Override // rm.j
    public i[] P() {
        i iVar = this.f72462p;
        return iVar == null ? new i[0] : new i[]{iVar};
    }

    @Override // tm.a, ym.b, ym.a
    public void d0() throws Exception {
        i iVar = this.f72462p;
        if (iVar != null) {
            iVar.start();
        }
        super.d0();
    }

    @Override // tm.a, ym.b, ym.a
    public void e0() throws Exception {
        i iVar = this.f72462p;
        if (iVar != null) {
            iVar.stop();
        }
        super.e0();
    }

    public void v(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        if (this.f72462p == null || !isStarted()) {
            return;
        }
        this.f72462p.v(str, nVar, aVar, cVar);
    }

    @Override // tm.b
    public Object x0(Object obj, Class cls) {
        return y0(this.f72462p, obj, cls);
    }

    public void B0(i iVar) {
        if (!isStarted()) {
            i iVar2 = this.f72462p;
            this.f72462p = iVar;
            if (iVar != null) {
                iVar.f(b());
            }
            if (b() != null) {
                b().E0().update(this, iVar2, iVar, "handler");
                return;
            }
            return;
        }
        throw new IllegalStateException("STARTED");
    }

    @Override // tm.a, ym.b, ym.d
    public void destroy() {
        if (isStopped()) {
            i iVarA0 = A0();
            if (iVarA0 != null) {
                B0(null);
                iVarA0.destroy();
            }
            super.destroy();
            return;
        }
        throw new IllegalStateException("!STOPPED");
    }

    @Override // tm.a, rm.i
    public void f(p pVar) {
        p pVarB = b();
        if (pVar == pVarB) {
            return;
        }
        if (!isStarted()) {
            super.f(pVar);
            i iVarA0 = A0();
            if (iVarA0 != null) {
                iVarA0.f(pVar);
            }
            if (pVar != null && pVar != pVarB) {
                pVar.E0().update(this, (Object) null, this.f72462p, "handler");
                return;
            }
            return;
        }
        throw new IllegalStateException("STARTED");
    }
}
