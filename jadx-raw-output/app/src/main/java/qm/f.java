package qm;

import java.io.IOException;
import kj.p;
import kj.t;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.security.Constraint;
import pm.l;
import rm.v;

/* JADX INFO: compiled from: SpnegoAuthenticator.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zm.c f66628e = zm.b.a(f.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f66629d;

    public f() {
        this.f66629d = Constraint.__SPNEGO_AUTH;
    }

    @Override // pm.a
    public boolean a(p pVar, t tVar, boolean z10, rm.d.h hVar) throws ServerAuthException {
        return true;
    }

    @Override // pm.a
    public rm.d b(p pVar, t tVar, boolean z10) throws ServerAuthException {
        v vVarE;
        lj.c cVar = (lj.c) tVar;
        String strM = ((lj.a) pVar).m("Authorization");
        if (!z10) {
            return new c(this);
        }
        if (strM != null) {
            return (!strM.startsWith("Negotiate") || (vVarE = e(null, strM.substring(10), pVar)) == null) ? rm.d.H8 : new l(getAuthMethod(), vVarE);
        }
        try {
            if (c.d(cVar)) {
                return rm.d.H8;
            }
            f66628e.i("SpengoAuthenticator: sending challenge", new Object[0]);
            cVar.j("WWW-Authenticate", "Negotiate");
            cVar.o(401);
            return rm.d.J8;
        } catch (IOException e10) {
            throw new ServerAuthException(e10);
        }
    }

    @Override // pm.a
    public String getAuthMethod() {
        return this.f66629d;
    }

    public f(String str) {
        this.f66629d = str;
    }
}
