package pm;

import kj.t;
import org.eclipse.jetty.security.ServerAuthException;
import rm.p;

/* JADX INFO: compiled from: Authenticator.java */
/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: pm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Authenticator.java */
    public interface InterfaceC0617a {
        boolean D();

        g U();

        f e();

        String getAuthMethod();

        String getInitParameter(String str);
    }

    /* JADX INFO: compiled from: Authenticator.java */
    public interface b {
        a a(p pVar, kj.k kVar, InterfaceC0617a interfaceC0617a, f fVar, g gVar);
    }

    boolean a(kj.p pVar, t tVar, boolean z10, rm.d.h hVar) throws ServerAuthException;

    rm.d b(kj.p pVar, t tVar, boolean z10) throws ServerAuthException;

    void c(InterfaceC0617a interfaceC0617a);

    String getAuthMethod();
}
