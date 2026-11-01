package qm;

import java.io.IOException;
import kj.p;
import kj.t;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.security.Constraint;
import pm.l;
import rm.v;

/* JADX INFO: compiled from: BasicAuthenticator.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends e {
    @Override // pm.a
    public boolean a(p pVar, t tVar, boolean z10, rm.d.h hVar) throws ServerAuthException {
        return true;
    }

    @Override // pm.a
    public String getAuthMethod() {
        return Constraint.__BASIC_AUTH;
    }

    @Override // pm.a
    public rm.d b(p pVar, t tVar, boolean z10) throws ServerAuthException {
        int iIndexOf;
        String strA;
        int iIndexOf2;
        v vVarE;
        lj.a aVar = (lj.a) pVar;
        lj.c cVar = (lj.c) tVar;
        String strM = aVar.m("Authorization");
        try {
            if (!z10) {
                return new c(this);
            }
            if (strM != null && (iIndexOf = strM.indexOf(32)) > 0 && "basic".equalsIgnoreCase(strM.substring(0, iIndexOf)) && (iIndexOf2 = (strA = xm.d.a(strM.substring(iIndexOf + 1), "ISO-8859-1")).indexOf(58)) > 0 && (vVarE = e(strA.substring(0, iIndexOf2), strA.substring(iIndexOf2 + 1), aVar)) != null) {
                return new l(getAuthMethod(), vVarE);
            }
            if (c.d(cVar)) {
                return rm.d.H8;
            }
            cVar.j("WWW-Authenticate", "basic realm=\"" + this.f66625a.getName() + '\"');
            cVar.o(401);
            return rm.d.J8;
        } catch (IOException e10) {
            throw new ServerAuthException(e10);
        }
    }
}
