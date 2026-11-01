package qm;

import kj.p;
import pm.g;
import rm.v;

/* JADX INFO: compiled from: LoginAuthenticator.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements pm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f66625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pm.f f66626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66627c;

    public lj.e f(lj.a aVar, lj.c cVar) {
        lj.e eVarP = aVar.p(false);
        if (this.f66627c && eVarP != null && eVarP.getAttribute("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated") != Boolean.TRUE) {
            synchronized (this) {
                eVarP = vm.c.y0(aVar, eVarP, true);
            }
        }
        return eVarP;
    }

    public g d() {
        return this.f66625a;
    }

    public v e(String str, Object obj, p pVar) {
        v vVarC = this.f66625a.c(str, obj);
        if (vVarC == null) {
            return null;
        }
        f((lj.a) pVar, null);
        return vVarC;
    }

    @Override // pm.a
    public void c(pm.a.InterfaceC0617a interfaceC0617a) {
        g gVarU = interfaceC0617a.U();
        this.f66625a = gVarU;
        if (gVarU != null) {
            pm.f fVarE = interfaceC0617a.e();
            this.f66626b = fVarE;
            if (fVarE != null) {
                this.f66627c = interfaceC0617a.D();
                return;
            }
            throw new IllegalStateException("No IdentityService for " + this + " in " + interfaceC0617a);
        }
        throw new IllegalStateException("No LoginService for " + this + " in " + interfaceC0617a);
    }
}
