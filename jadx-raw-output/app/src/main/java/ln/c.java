package ln;

import java.util.concurrent.Future;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.m;
import tn.t;

/* JADX INFO: compiled from: ControlPointImpl.java */
/* JADX INFO: loaded from: classes7.dex */
@ApplicationScoped
public class c implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f63893d = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fn.c f63894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zn.a f63895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public co.c f63896c;

    public c() {
    }

    public c(fn.c cVar, zn.a aVar, co.c cVar2) {
        f63893d.fine("Creating ControlPoint: " + getClass().getName());
        this.f63894a = cVar;
        this.f63895b = aVar;
        this.f63896c = cVar2;
    }

    @Override // ln.b
    public zn.a a() {
        return this.f63895b;
    }

    @Override // ln.b
    public void b() {
        g(new t(), m.f72474c.intValue());
    }

    @Override // ln.b
    public Future c(a aVar) {
        f63893d.fine("Invoking action in background: " + aVar);
        aVar.g(this);
        return f().h().submit(aVar);
    }

    @Override // ln.b
    public void d(d dVar) {
        f63893d.fine("Invoking subscription in background: " + dVar);
        dVar.n(this);
        f().h().execute(dVar);
    }

    @Override // ln.b
    public void e(UpnpHeader upnpHeader) {
        g(upnpHeader, m.f72474c.intValue());
    }

    public fn.c f() {
        return this.f63894a;
    }

    public void g(UpnpHeader upnpHeader, int i10) {
        f63893d.fine("Sending asynchronous search for: " + upnpHeader.a());
        f().f().execute(a().f(upnpHeader, i10));
    }

    @Override // ln.b
    public co.c getRegistry() {
        return this.f63896c;
    }
}
