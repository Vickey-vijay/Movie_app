package co;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.registry.RegistrationException;
import un.j;
import yn.z;

/* JADX INFO: compiled from: RemoteItems.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends f<un.i, on.c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f6187d = Logger.getLogger(co.c.class.getName());

    /* JADX INFO: compiled from: RemoteItems.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f6188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ un.i f6189c;

        public a(g gVar, un.i iVar) {
            this.f6188b = gVar;
            this.f6189c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6188b.a(i.this.f6180a, this.f6189c);
        }
    }

    /* JADX INFO: compiled from: RemoteItems.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f6191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f6192c;

        public b(g gVar, e eVar) {
            this.f6191b = gVar;
            this.f6192c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6191b.f(i.this.f6180a, (un.i) this.f6192c.b());
        }
    }

    /* JADX INFO: compiled from: RemoteItems.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f6194b;

        public c(e eVar) {
            this.f6194b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((on.c) this.f6194b.b()).L(CancelReason.DEVICE_WAS_REMOVED, null);
        }
    }

    /* JADX INFO: compiled from: RemoteItems.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f6196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ un.i f6197c;

        public d(g gVar, un.i iVar) {
            this.f6196b = gVar;
            this.f6197c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6196b.d(i.this.f6180a, this.f6197c);
        }
    }

    public boolean m(un.i iVar) {
        return n(iVar, false);
    }

    public void p(on.c cVar) {
        co.d dVar = this.f6180a;
        dVar.H(dVar.J().g(cVar));
    }

    public void q() {
        f6187d.fine("Cancelling all outgoing subscriptions to remote devices during shutdown");
        ArrayList arrayList = new ArrayList();
        Iterator<e<String, on.c>> it = h().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f6180a.J().h((on.c) it2.next()).run();
        }
        f6187d.fine("Removing all remote devices from registry during shutdown");
        o(true);
    }

    public boolean update(j jVar) {
        Iterator<un.e> it = this.f6180a.u().iterator();
        while (it.hasNext()) {
            if (it.next().e(jVar.b()) != null) {
                f6187d.fine("Ignoring update, a local device graph contains UDN");
                return true;
            }
        }
        un.i iVarE = e(jVar.b(), false);
        if (iVarE == null) {
            return false;
        }
        if (!iVarE.A()) {
            f6187d.fine("Updating root device of embedded: " + iVarE);
            iVarE = iVarE.t();
        }
        e<z, un.i> eVar = new e<>(iVarE.r().b(), iVarE, (this.f6180a.I().v() != null ? this.f6180a.I().v() : jVar.a()).intValue());
        f6187d.fine("Updating expiration of: " + iVarE);
        f().remove(eVar);
        f().add(eVar);
        f6187d.fine("Remote device updated, calling listeners: " + iVarE);
        Iterator<g> it2 = this.f6180a.getListeners().iterator();
        while (it2.hasNext()) {
            this.f6180a.I().p().execute(new b(it2.next(), eVar));
        }
        return true;
    }

    public i(co.d dVar) {
        super(dVar);
    }

    public void k(un.i iVar) {
        Integer numA;
        if (update(iVar.r())) {
            f6187d.fine("Ignoring addition, device already registered: " + iVar);
            return;
        }
        wn.c[] resources = getResources(iVar);
        for (wn.c cVar : resources) {
            f6187d.fine("Validating remote device resource; " + cVar);
            if (this.f6180a.d(cVar.b()) != null) {
                throw new RegistrationException("URI namespace conflict with already registered resource: " + cVar);
            }
        }
        for (wn.c cVar2 : resources) {
            this.f6180a.E(cVar2);
            f6187d.fine("Added remote device resource: " + cVar2);
        }
        z zVarB = iVar.r().b();
        if (this.f6180a.I().v() != null) {
            numA = this.f6180a.I().v();
        } else {
            numA = iVar.r().a();
        }
        e<z, un.i> eVar = new e<>(zVarB, iVar, numA.intValue());
        f6187d.fine("Adding hydrated remote device to registry with " + eVar.a().b() + " seconds expiration: " + iVar);
        f().add(eVar);
        if (f6187d.isLoggable(Level.FINEST)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n");
            sb2.append("-------------------------- START Registry Namespace -----------------------------------\n");
            Iterator<wn.c> it = this.f6180a.getResources().iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append("\n");
            }
            sb2.append("-------------------------- END Registry Namespace -----------------------------------");
            f6187d.finest(sb2.toString());
        }
        f6187d.fine("Completely hydrated remote device graph available, calling listeners: " + iVar);
        Iterator<g> it2 = this.f6180a.getListeners().iterator();
        while (it2.hasNext()) {
            this.f6180a.I().p().execute(new a(it2.next(), iVar));
        }
    }

    public void l() {
        if (f().isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        for (e<z, un.i> eVar : f()) {
            if (f6187d.isLoggable(Level.FINEST)) {
                f6187d.finest("Device '" + eVar.b() + "' expires in seconds: " + eVar.a().c());
            }
            if (eVar.a().e(false)) {
                map.put(eVar.c(), eVar.b());
            }
        }
        for (un.i iVar : map.values()) {
            if (f6187d.isLoggable(Level.FINE)) {
                f6187d.fine("Removing expired: " + iVar);
            }
            m(iVar);
        }
        HashSet<on.c> hashSet = new HashSet();
        for (e<String, on.c> eVar2 : h()) {
            if (eVar2.a().e(true)) {
                hashSet.add(eVar2.b());
            }
        }
        for (on.c cVar : hashSet) {
            if (f6187d.isLoggable(Level.FINEST)) {
                f6187d.fine("Renewing outgoing subscription: " + cVar);
            }
            p(cVar);
        }
    }

    public boolean n(un.i iVar, boolean z10) throws RegistrationException {
        un.i iVar2 = (un.i) e(iVar.r().b(), true);
        if (iVar2 == null) {
            return false;
        }
        f6187d.fine("Removing remote device from registry: " + iVar);
        for (wn.c cVar : getResources(iVar2)) {
            if (this.f6180a.M(cVar)) {
                f6187d.fine("Unregistered resource: " + cVar);
            }
        }
        Iterator it = h().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (((on.c) eVar.b()).H().d().r().b().equals(iVar2.r().b())) {
                f6187d.fine("Removing outgoing subscription: " + ((String) eVar.c()));
                it.remove();
                if (!z10) {
                    this.f6180a.I().p().execute(new c(eVar));
                }
            }
        }
        if (!z10) {
            Iterator<g> it2 = this.f6180a.getListeners().iterator();
            while (it2.hasNext()) {
                this.f6180a.I().p().execute(new d(it2.next(), iVar2));
            }
        }
        f().remove(new e(iVar2.r().b()));
        return true;
    }

    public void o(boolean z10) {
        for (un.i iVar : (un.i[]) b().toArray(new un.i[b().size()])) {
            n(iVar, z10);
        }
    }
}
