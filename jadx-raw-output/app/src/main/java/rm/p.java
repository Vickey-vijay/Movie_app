package rm;

import java.io.IOException;
import javax.servlet.ServletException;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;

/* JADX INFO: compiled from: Server.java */
/* JADX INFO: loaded from: classes2.dex */
public class p extends tm.g implements xm.b {
    public static final zm.c C = zm.b.a(p.class);
    public static final String D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public en.d f66944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f[] f66945t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s f66946u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f66950y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ym.c f66942q = new ym.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xm.c f66943r = new xm.c();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f66947v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f66948w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f66949x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f66951z = false;
    public boolean A = false;
    public boolean B = false;

    /* JADX INFO: compiled from: Server.java */
    public interface a extends i {
        void u(boolean z10);
    }

    static {
        if (p.class.getPackage() == null || !"Eclipse.org - Jetty".equals(p.class.getPackage().getImplementationVendor()) || p.class.getPackage().getImplementationVersion() == null) {
            D = System.getProperty("jetty.version", "8.y.z-SNAPSHOT");
        } else {
            D = p.class.getPackage().getImplementationVersion();
        }
    }

    public static String K0() {
        return D;
    }

    public f[] D0() {
        return this.f66945t;
    }

    public ym.c E0() {
        return this.f66942q;
    }

    public boolean F0() {
        return this.f66948w;
    }

    public boolean G0() {
        return this.f66947v;
    }

    public s H0() {
        return this.f66946u;
    }

    public boolean I0() {
        return this.f66950y;
    }

    public en.d J0() {
        return this.f66944s;
    }

    public boolean N0() {
        return this.f66951z;
    }

    public boolean O0() {
        return this.A;
    }

    public boolean P0() {
        return this.B;
    }

    public void R0(f[] fVarArr) {
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.f(this);
            }
        }
        this.f66942q.update((Object) this, (Object[]) this.f66945t, (Object[]) fVarArr, "connector");
        this.f66945t = fVarArr;
    }

    public void S0(int i10) {
        this.f66949x = i10;
    }

    public void T0(s sVar) {
        s sVar2 = this.f66946u;
        if (sVar2 != null) {
            w0(sVar2);
        }
        this.f66942q.update((Object) this, (Object) this.f66946u, (Object) sVar, "sessionIdManager", false);
        this.f66946u = sVar;
        if (sVar != null) {
            m0(sVar);
        }
    }

    public void U0(en.d dVar) {
        en.d dVar2 = this.f66944s;
        if (dVar2 != null) {
            w0(dVar2);
        }
        this.f66942q.update((Object) this, (Object) this.f66944s, (Object) dVar, "threadpool", false);
        this.f66944s = dVar;
        if (dVar != null) {
            m0(dVar);
        }
    }

    @Override // xm.b
    public void a(String str, Object obj) {
        this.f66943r.a(str, obj);
    }

    @Override // xm.b
    public Object getAttribute(String str) {
        return this.f66943r.getAttribute(str);
    }

    @Override // xm.b
    public void removeAttribute(String str) {
        this.f66943r.removeAttribute(str);
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // xm.b
    public void y() {
        this.f66943r.y();
    }

    public p() {
        f(this);
    }

    public void C0(f fVar) {
        R0((f[]) LazyList.addToArray(D0(), fVar, f.class));
    }

    public void L0(b bVar) throws ServletException, IOException {
        String strL = bVar.w().l();
        n nVarW = bVar.w();
        o oVarB = bVar.B();
        zm.c cVar = C;
        if (cVar.f()) {
            cVar.i("REQUEST " + strL + " on " + bVar, new Object[0]);
            v(strL, nVarW, nVarW, oVarB);
            cVar.i("RESPONSE " + strL + "  " + bVar.B().w() + " handled=" + nVarW.X(), new Object[0]);
            return;
        }
        v(strL, nVarW, nVarW, oVarB);
    }

    public void M0(b bVar) throws ServletException, IOException {
        c cVarY = bVar.w().y();
        c.a aVarJ = cVarY.j();
        n nVarW = bVar.w();
        String strG = aVarJ.g();
        if (strG != null) {
            lm.n nVar = new lm.n(xm.q.a(aVarJ.h().f(), strG));
            nVarW.F0(nVar);
            nVarW.v0(null);
            nVarW.p0(nVarW.v());
            if (nVar.k() != null) {
                nVarW.Z(nVar.k());
            }
        }
        String strL = nVarW.l();
        lj.a aVar = (lj.a) cVarY.l();
        lj.c cVar = (lj.c) cVarY.getResponse();
        zm.c cVar2 = C;
        if (cVar2.f()) {
            cVar2.i("REQUEST " + strL + " on " + bVar, new Object[0]);
            v(strL, nVarW, aVar, cVar);
            cVar2.i("RESPONSE " + strL + "  " + bVar.B().w(), new Object[0]);
            return;
        }
        v(strL, nVarW, aVar, cVar);
    }

    public void Q0(f fVar) {
        R0((f[]) LazyList.removeFromArray(D0(), fVar));
    }

    @Override // tm.g, tm.a, ym.b, ym.a
    public void d0() throws Exception {
        int i10 = 0;
        if (I0()) {
            en.c.e(this);
        }
        u.q().r();
        zm.c cVar = C;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("jetty-");
        String str = D;
        sb2.append(str);
        cVar.k(sb2.toString(), new Object[0]);
        org.eclipse.jetty.http.b.I(str);
        MultiException multiException = new MultiException();
        if (this.f66944s == null) {
            U0(new en.b());
        }
        try {
            super.d0();
        } catch (Throwable th2) {
            multiException.add(th2);
        }
        if (this.f66945t != null && multiException.size() == 0) {
            while (true) {
                f[] fVarArr = this.f66945t;
                if (i10 >= fVarArr.length) {
                    break;
                }
                try {
                    fVarArr[i10].start();
                } catch (Throwable th3) {
                    multiException.add(th3);
                }
                i10++;
            }
        }
        if (N0()) {
            r0();
        }
        multiException.ifExceptionThrow();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // tm.g, tm.a, ym.b, ym.a
    public void e0() throws Exception {
        if (O0()) {
            r0();
        }
        MultiException multiException = new MultiException();
        if (this.f66949x > 0) {
            f[] fVarArr = this.f66945t;
            if (fVarArr != null) {
                int length = fVarArr.length;
                while (true) {
                    int i10 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    C.k("Graceful shutdown {}", this.f66945t[i10]);
                    try {
                        this.f66945t[i10].close();
                    } catch (Throwable th2) {
                        multiException.add(th2);
                    }
                    length = i10;
                }
            }
            for (i iVar : V(a.class)) {
                a aVar = (a) iVar;
                C.k("Graceful shutdown {}", aVar);
                aVar.u(true);
            }
            Thread.sleep(this.f66949x);
        }
        f[] fVarArr2 = this.f66945t;
        try {
            if (fVarArr2 != null) {
                int length2 = fVarArr2.length;
                while (true) {
                    int i11 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    try {
                        this.f66945t[i11].stop();
                    } catch (Throwable th3) {
                        multiException.add(th3);
                    }
                    length2 = i11;
                }
                super.e0();
                multiException.ifExceptionThrow();
                if (I0()) {
                    en.c.a(this);
                }
            }
            super.e0();
        } catch (Throwable th4) {
            multiException.add(th4);
        }
        multiException.ifExceptionThrow();
        if (I0()) {
            en.c.a(this);
        }
    }

    @Override // ym.b
    public boolean m0(Object obj) {
        if (super.m0(obj)) {
            this.f66942q.b(obj);
            return true;
        }
        return false;
    }

    @Override // ym.b
    public boolean w0(Object obj) {
        if (super.w0(obj)) {
            this.f66942q.d(obj);
            return true;
        }
        return false;
    }

    @Override // tm.b, ym.b, ym.e
    public void z(Appendable appendable, String str) throws IOException {
        s0(appendable);
        ym.b.p0(appendable, str, xm.p.a(P()), u0(), xm.p.a(this.f66945t));
    }
}
