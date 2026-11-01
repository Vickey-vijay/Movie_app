package tm;

import java.io.IOException;
import rm.i;
import rm.p;

/* JADX INFO: compiled from: AbstractHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends ym.b implements i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final zm.c f72433o = zm.b.a(a.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f72434n;

    @Override // rm.i
    public p b() {
        return this.f72434n;
    }

    @Override // ym.b, ym.a
    public void d0() throws Exception {
        f72433o.i("starting {}", this);
        super.d0();
    }

    @Override // ym.b, ym.a
    public void e0() throws Exception {
        f72433o.i("stopping {}", this);
        super.e0();
    }

    public void f(p pVar) {
        p pVar2 = this.f72434n;
        if (pVar2 != null && pVar2 != pVar) {
            pVar2.E0().d(this);
        }
        this.f72434n = pVar;
        if (pVar == null || pVar == pVar2) {
            return;
        }
        pVar.E0().b(this);
    }

    @Override // ym.b, ym.d
    public void destroy() {
        if (isStopped()) {
            super.destroy();
            p pVar = this.f72434n;
            if (pVar != null) {
                pVar.E0().d(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("!STOPPED");
    }

    @Override // ym.b
    public void s0(Appendable appendable) throws IOException {
        appendable.append(toString()).append(" - ").append(f0()).append('\n');
    }
}
