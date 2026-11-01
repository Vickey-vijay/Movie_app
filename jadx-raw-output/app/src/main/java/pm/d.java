package pm;

import org.eclipse.jetty.security.authentication.DigestAuthenticator;
import org.eclipse.jetty.util.security.Constraint;
import rm.p;

/* JADX INFO: compiled from: DefaultAuthenticatorFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public class d implements a.b {
    @Override // pm.a.b
    public a a(p pVar, kj.k kVar, a.InterfaceC0617a interfaceC0617a, f fVar, g gVar) {
        a aVar;
        String authMethod = interfaceC0617a.getAuthMethod();
        if (authMethod != null && !Constraint.__BASIC_AUTH.equalsIgnoreCase(authMethod)) {
            if (Constraint.__DIGEST_AUTH.equalsIgnoreCase(authMethod)) {
                aVar = new DigestAuthenticator();
            } else if (Constraint.__FORM_AUTH.equalsIgnoreCase(authMethod)) {
                aVar = new qm.d();
            } else if (Constraint.__SPNEGO_AUTH.equalsIgnoreCase(authMethod)) {
                aVar = new qm.f();
            } else if (Constraint.__NEGOTIATE_AUTH.equalsIgnoreCase(authMethod)) {
                aVar = new qm.f(Constraint.__NEGOTIATE_AUTH);
            } else {
                aVar = null;
            }
        } else {
            aVar = new qm.a();
        }
        if (Constraint.__CERT_AUTH.equalsIgnoreCase(authMethod) || Constraint.__CERT_AUTH2.equalsIgnoreCase(authMethod)) {
            return new qm.b();
        }
        return aVar;
    }
}
