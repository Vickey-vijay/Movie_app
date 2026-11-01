package ao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.transport.RouterException;
import rn.h;
import yn.s;

/* JADX INFO: compiled from: SendingNotification.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends zn.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f4688e = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public un.e f4689d;

    public int f() {
        return 150;
    }

    public int g() {
        return 3;
    }

    public abstract NotificationSubtype i();

    public List<rn.d> d(un.e eVar, mn.e eVar2) {
        ArrayList arrayList = new ArrayList();
        if (eVar.A()) {
            arrayList.add(new rn.f(eVar2, eVar, i()));
        }
        arrayList.add(new h(eVar2, eVar, i()));
        arrayList.add(new rn.e(eVar2, eVar, i()));
        return arrayList;
    }

    public List<rn.d> e(un.e eVar, mn.e eVar2) {
        ArrayList arrayList = new ArrayList();
        for (s sVar : eVar.k()) {
            arrayList.add(new rn.g(eVar2, eVar, i(), sVar));
        }
        return arrayList;
    }

    public un.e h() {
        return this.f4689d;
    }

    public void j(mn.e eVar) throws RouterException {
        f4688e.finer("Sending root device messages: " + h());
        Iterator<rn.d> it = d(h(), eVar).iterator();
        while (it.hasNext()) {
            c().c().b(it.next());
        }
        if (h().w()) {
            for (un.e eVar2 : h().i()) {
                f4688e.finer("Sending embedded device messages: " + eVar2);
                Iterator<rn.d> it2 = d(eVar2, eVar).iterator();
                while (it2.hasNext()) {
                    c().c().b(it2.next());
                }
            }
        }
        List<rn.d> listE = e(h(), eVar);
        if (listE.size() > 0) {
            f4688e.finer("Sending service type messages");
            Iterator<rn.d> it3 = listE.iterator();
            while (it3.hasNext()) {
                c().c().b(it3.next());
            }
        }
    }

    public d(fn.b bVar, un.e eVar) {
        super(bVar);
        this.f4689d = eVar;
    }

    @Override // zn.f
    public void a() throws RouterException {
        List<mn.h> listD = c().c().d(null);
        if (listD.size() == 0) {
            f4688e.fine("Aborting notifications, no active stream servers found (network disabled?)");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<mn.h> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(new mn.e(it.next(), c().getConfiguration().getNamespace().f(h())));
        }
        for (int i10 = 0; i10 < g(); i10++) {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    j((mn.e) it2.next());
                }
                f4688e.finer("Sleeping " + f() + " milliseconds");
                Thread.sleep((long) f());
            } catch (InterruptedException e10) {
                f4688e.warning("Advertisement thread was interrupted: " + e10);
            }
        }
    }
}
