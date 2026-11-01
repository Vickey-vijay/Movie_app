package ao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import mn.h;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.RouterException;
import rn.j;
import rn.k;
import rn.l;
import rn.m;
import rn.n;
import tn.c0;
import tn.t;
import tn.v;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: ReceivingSearch.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends zn.c<rn.b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f4684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f4685g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f4686e;

    public void j(j jVar) {
    }

    static {
        Logger logger = Logger.getLogger(b.class.getName());
        f4684f = logger;
        f4685g = logger.isLoggable(Level.FINE);
    }

    public b(fn.b bVar, pn.b<UpnpRequest> bVar2) {
        super(bVar, new rn.b(bVar2));
        this.f4686e = new Random();
    }

    public List<j> f(un.e eVar, h hVar) {
        ArrayList arrayList = new ArrayList();
        if (eVar.A()) {
            arrayList.add(new l(c(), h(hVar, eVar), eVar));
        }
        arrayList.add(new n(c(), h(hVar, eVar), eVar));
        arrayList.add(new k(c(), h(hVar, eVar), eVar));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j((j) it.next());
        }
        return arrayList;
    }

    public List<j> g(un.e eVar, h hVar) {
        ArrayList arrayList = new ArrayList();
        for (s sVar : eVar.k()) {
            m mVar = new m(c(), h(hVar, eVar), eVar, sVar);
            j(mVar);
            arrayList.add(mVar);
        }
        return arrayList;
    }

    public mn.e h(h hVar, un.e eVar) {
        return new mn.e(hVar, d().getConfiguration().getNamespace().f(eVar));
    }

    public void k(UpnpHeader upnpHeader, h hVar) throws RouterException {
        if (upnpHeader instanceof t) {
            l(hVar);
            return;
        }
        if (upnpHeader instanceof tn.s) {
            n(hVar);
            return;
        }
        if (upnpHeader instanceof c0) {
            p((z) upnpHeader.b(), hVar);
            return;
        }
        if (upnpHeader instanceof tn.e) {
            m((yn.j) upnpHeader.b(), hVar);
            return;
        }
        if (upnpHeader instanceof v) {
            o((s) upnpHeader.b(), hVar);
            return;
        }
        f4684f.warning("Non-implemented search request target: " + upnpHeader.getClass());
    }

    public void l(h hVar) throws RouterException {
        if (f4685g) {
            f4684f.fine("Responding to 'all' search with advertisement messages for all local devices");
        }
        for (un.e eVar : d().getRegistry().u()) {
            if (!i(eVar)) {
                if (f4685g) {
                    f4684f.finer("Sending root device messages: " + eVar);
                }
                Iterator<j> it = f(eVar, hVar).iterator();
                while (it.hasNext()) {
                    d().c().b(it.next());
                }
                if (eVar.w()) {
                    for (un.e eVar2 : eVar.i()) {
                        if (f4685g) {
                            f4684f.finer("Sending embedded device messages: " + eVar2);
                        }
                        Iterator<j> it2 = f(eVar2, hVar).iterator();
                        while (it2.hasNext()) {
                            d().c().b(it2.next());
                        }
                    }
                }
                List<j> listG = g(eVar, hVar);
                if (listG.size() > 0) {
                    if (f4685g) {
                        f4684f.finer("Sending service type messages");
                    }
                    Iterator<j> it3 = listG.iterator();
                    while (it3.hasNext()) {
                        d().c().b(it3.next());
                    }
                }
            }
        }
    }

    public void m(yn.j jVar, h hVar) throws RouterException {
        f4684f.fine("Responding to device type search: " + jVar);
        for (un.a aVar : d().getRegistry().y(jVar)) {
            if (aVar instanceof un.e) {
                un.e eVar = (un.e) aVar;
                if (!i(eVar)) {
                    f4684f.finer("Sending matching device type search result for: " + aVar);
                    k kVar = new k(c(), h(hVar, eVar), eVar);
                    j(kVar);
                    d().c().b(kVar);
                }
            }
        }
    }

    public void n(h hVar) throws RouterException {
        f4684f.fine("Responding to root device search with advertisement messages for all local root devices");
        for (un.e eVar : d().getRegistry().u()) {
            if (!i(eVar)) {
                l lVar = new l(c(), h(hVar, eVar), eVar);
                j(lVar);
                d().c().b(lVar);
            }
        }
    }

    public void o(s sVar, h hVar) throws RouterException {
        f4684f.fine("Responding to service type search: " + sVar);
        for (un.a aVar : d().getRegistry().n(sVar)) {
            if (aVar instanceof un.e) {
                un.e eVar = (un.e) aVar;
                if (!i(eVar)) {
                    f4684f.finer("Sending matching service type search result: " + aVar);
                    m mVar = new m(c(), h(hVar, eVar), eVar, sVar);
                    j(mVar);
                    d().c().b(mVar);
                }
            }
        }
    }

    @Override // zn.c
    public void a() throws RouterException {
        if (d().c() == null) {
            f4684f.fine("Router hasn't completed initialization, ignoring received search message");
            return;
        }
        if (!c().z()) {
            f4684f.fine("Invalid search request, no or invalid MAN ssdp:discover header: " + c());
            return;
        }
        UpnpHeader upnpHeaderY = c().y();
        if (upnpHeaderY == null) {
            f4684f.fine("Invalid search request, did not contain ST header: " + c());
            return;
        }
        List<h> listD = d().c().d(c().u());
        if (listD.size() == 0) {
            f4684f.fine("Aborting search response, no active stream servers found (network disabled?)");
            return;
        }
        Iterator<h> it = listD.iterator();
        while (it.hasNext()) {
            k(upnpHeaderY, it.next());
        }
    }

    @Override // zn.c
    public boolean e() throws InterruptedException {
        Integer numX = c().x();
        if (numX == null) {
            f4684f.fine("Invalid search request, did not contain MX header: " + c());
            return false;
        }
        if (numX.intValue() > 120 || numX.intValue() <= 0) {
            numX = tn.m.f72474c;
        }
        if (d().getRegistry().u().size() > 0) {
            int iNextInt = this.f4686e.nextInt(numX.intValue() * 1000);
            f4684f.fine("Sleeping " + iNextInt + " milliseconds to avoid flooding with search responses");
            Thread.sleep((long) iNextInt);
            return true;
        }
        return true;
    }

    public boolean i(un.e eVar) {
        mn.c cVarD = d().getRegistry().D(eVar.r().b());
        if (cVarD != null && !cVarD.a()) {
            return true;
        }
        return false;
    }

    public void p(z zVar, h hVar) throws RouterException {
        un.a aVarJ = d().getRegistry().j(zVar, false);
        if (aVarJ != null && (aVarJ instanceof un.e)) {
            un.e eVar = (un.e) aVarJ;
            if (i(eVar)) {
                return;
            }
            f4684f.fine("Responding to UDN device search: " + zVar);
            n nVar = new n(c(), h(hVar, eVar), eVar);
            j(nVar);
            d().c().b(nVar);
        }
    }
}
