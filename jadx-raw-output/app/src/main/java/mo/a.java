package mo;

import java.net.InetAddress;
import java.util.List;
import mn.h;
import org.fourthline.cling.model.message.c;
import org.fourthline.cling.transport.RouterException;
import po.m;

/* JADX INFO: compiled from: Router.java */
/* JADX INFO: loaded from: classes10.dex */
public interface a {
    zn.a a();

    void b(org.fourthline.cling.model.message.a aVar) throws RouterException;

    c c(org.fourthline.cling.model.message.b bVar) throws RouterException;

    List<h> d(InetAddress inetAddress) throws RouterException;

    void e(m mVar);

    boolean enable() throws RouterException;

    void f(pn.b bVar);

    fn.c getConfiguration();

    void shutdown() throws RouterException;
}
