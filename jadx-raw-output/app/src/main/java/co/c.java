package co;

import java.net.URI;
import java.util.Collection;
import org.fourthline.cling.registry.RegistrationException;
import un.j;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: Registry.java */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    <T extends wn.c> T A(Class<T> cls, URI uri) throws IllegalArgumentException;

    boolean B(z zVar);

    boolean C(on.b bVar);

    mn.c D(z zVar);

    void a(g gVar);

    on.b b(String str);

    Collection<un.a> c();

    wn.c d(URI uri) throws IllegalArgumentException;

    void e(on.c cVar);

    un.i f(z zVar, boolean z10);

    boolean g(on.b bVar);

    Collection<g> getListeners();

    Collection<wn.c> getResources();

    <T extends wn.c> Collection<T> getResources(Class<T> cls);

    on.c h(String str);

    void i(on.c cVar);

    un.a j(z zVar, boolean z10);

    void k(un.i iVar) throws RegistrationException;

    void l(on.c cVar);

    boolean m(un.e eVar);

    Collection<un.a> n(s sVar);

    un.e o(z zVar, boolean z10);

    on.c p(String str);

    boolean q(un.i iVar);

    void r(on.c cVar);

    void s(un.e eVar) throws RegistrationException;

    void shutdown();

    void t(un.i iVar, Exception exc);

    Collection<un.e> u();

    boolean update(j jVar);

    boolean v(un.i iVar);

    void w(g gVar);

    void x(on.b bVar);

    Collection<un.a> y(yn.j jVar);

    void z(on.c cVar);
}
