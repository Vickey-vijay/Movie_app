package co;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.registry.RegistrationException;
import yn.z;

/* JADX INFO: compiled from: LocalItems.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends f<un.e, on.b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Logger f6147g = Logger.getLogger(co.c.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<z, mn.c> f6148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Random f6150f;

    /* JADX INFO: compiled from: LocalItems.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f6151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ un.e f6152c;

        public a(g gVar, un.e eVar) {
            this.f6151b = gVar;
            this.f6152c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6151b.e(b.this.f6180a, this.f6152c);
        }
    }

    /* JADX INFO: renamed from: co.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalItems.java */
    public class RunnableC0025b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f6154b;

        public RunnableC0025b(e eVar) {
            this.f6154b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((on.b) this.f6154b.b()).L(CancelReason.DEVICE_WAS_REMOVED);
        }
    }

    /* JADX INFO: compiled from: LocalItems.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f6156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ un.e f6157c;

        public c(g gVar, un.e eVar) {
            this.f6156b = gVar;
            this.f6157c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6156b.h(b.this.f6180a, this.f6157c);
        }
    }

    /* JADX INFO: compiled from: LocalItems.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ un.e f6159b;

        public d(un.e eVar) {
            this.f6159b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.f6147g.finer("Sleeping some milliseconds to avoid flooding the network with ALIVE msgs");
                Thread.sleep(b.this.f6150f.nextInt(100));
            } catch (InterruptedException e10) {
                b.f6147g.severe("Background execution interrupted: " + e10.getMessage());
            }
            b.this.f6180a.J().d(this.f6159b).run();
        }
    }

    public void l(un.e eVar) throws RegistrationException {
        m(eVar, null);
    }

    public boolean t(un.e eVar) throws RegistrationException {
        return u(eVar, false);
    }

    @Override // co.f
    public Collection<un.e> b() {
        HashSet hashSet = new HashSet();
        Iterator<e<z, un.e>> it = f().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b());
        }
        return Collections.unmodifiableCollection(hashSet);
    }

    public void n(un.e eVar) {
        this.f6180a.H(new d(eVar));
    }

    public void o(un.e eVar, boolean z10) {
        ao.f fVarB = this.f6180a.J().b(eVar);
        if (z10) {
            this.f6180a.H(fVarB);
        } else {
            fVarB.run();
        }
    }

    public mn.c p(z zVar) {
        return this.f6148d.get(zVar);
    }

    public void w(z zVar, mn.c cVar) {
        if (cVar != null) {
            this.f6148d.put(zVar, cVar);
        } else {
            this.f6148d.remove(zVar);
        }
    }

    public void x() {
        f6147g.fine("Clearing all registered subscriptions to local devices during shutdown");
        h().clear();
        f6147g.fine("Removing all local devices from registry during shutdown");
        v(true);
    }

    public b(co.d dVar) {
        super(dVar);
        this.f6148d = new HashMap();
        this.f6149e = 0L;
        this.f6150f = new Random();
    }

    public void m(un.e eVar, mn.c cVar) throws RegistrationException {
        w(eVar.r().b(), cVar);
        if (this.f6180a.j(eVar.r().b(), false) != null) {
            f6147g.fine("Ignoring addition, device already registered: " + eVar);
            return;
        }
        f6147g.fine("Adding local device to registry: " + eVar);
        for (wn.c cVar2 : getResources(eVar)) {
            if (this.f6180a.d(cVar2.b()) == null) {
                this.f6180a.E(cVar2);
                f6147g.fine("Registered resource: " + cVar2);
            } else {
                throw new RegistrationException("URI namespace conflict with already registered resource: " + cVar2);
            }
        }
        f6147g.fine("Adding item to registry with expiration in seconds: " + eVar.r().a());
        e<z, un.e> eVar2 = new e<>(eVar.r().b(), eVar, eVar.r().a().intValue());
        f().add(eVar2);
        f6147g.fine("Registered local device: " + eVar2);
        if (r(eVar2.c())) {
            o(eVar, true);
        }
        if (q(eVar2.c())) {
            n(eVar);
        }
        Iterator<g> it = this.f6180a.getListeners().iterator();
        while (it.hasNext()) {
            this.f6180a.I().p().execute(new a(it.next(), eVar));
        }
    }

    public boolean q(z zVar) {
        if (p(zVar) != null && !p(zVar).a()) {
            return false;
        }
        return true;
    }

    public boolean r(z zVar) {
        if (p(zVar) != null && p(zVar).b()) {
            return true;
        }
        return false;
    }

    public void s() {
        if (f().isEmpty()) {
            return;
        }
        HashSet<e> hashSet = new HashSet();
        int iM = this.f6180a.I().m();
        if (iM > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f6149e > iM) {
                this.f6149e = jCurrentTimeMillis;
                for (e<z, un.e> eVar : f()) {
                    if (q(eVar.c())) {
                        f6147g.finer("Flooding advertisement of local item: " + eVar);
                        hashSet.add(eVar);
                    }
                }
            }
        } else {
            this.f6149e = 0L;
            for (e<z, un.e> eVar2 : f()) {
                if (q(eVar2.c()) && eVar2.a().e(true)) {
                    f6147g.finer("Local item has expired: " + eVar2);
                    hashSet.add(eVar2);
                }
            }
        }
        for (e eVar3 : hashSet) {
            f6147g.fine("Refreshing local device advertisement: " + eVar3.b());
            n((un.e) eVar3.b());
            eVar3.a().g();
        }
        HashSet<e> hashSet2 = new HashSet();
        for (e<String, on.b> eVar4 : h()) {
            if (eVar4.a().e(false)) {
                hashSet2.add(eVar4);
            }
        }
        for (e eVar5 : hashSet2) {
            f6147g.fine("Removing expired: " + eVar5);
            i((on.a) eVar5.b());
            ((on.b) eVar5.b()).L(CancelReason.EXPIRED);
        }
    }

    public boolean u(un.e eVar, boolean z10) throws RegistrationException {
        un.e eVarE = e(eVar.r().b(), true);
        if (eVarE == null) {
            return false;
        }
        f6147g.fine("Removing local device from registry: " + eVar);
        w(eVar.r().b(), null);
        f().remove(new e(eVar.r().b()));
        for (wn.c cVar : getResources(eVar)) {
            if (this.f6180a.M(cVar)) {
                f6147g.fine("Unregistered resource: " + cVar);
            }
        }
        Iterator<e<String, on.b>> it = h().iterator();
        while (it.hasNext()) {
            e<String, on.b> next = it.next();
            if (next.b().H().d().r().b().equals(eVarE.r().b())) {
                f6147g.fine("Removing incoming subscription: " + next.c());
                it.remove();
                if (!z10) {
                    this.f6180a.I().p().execute(new RunnableC0025b(next));
                }
            }
        }
        if (q(eVar.r().b())) {
            o(eVar, !z10);
        }
        if (!z10) {
            Iterator<g> it2 = this.f6180a.getListeners().iterator();
            while (it2.hasNext()) {
                this.f6180a.I().p().execute(new c(it2.next(), eVar));
            }
        }
        return true;
    }

    public void v(boolean z10) {
        for (un.e eVar : (un.e[]) b().toArray(new un.e[b().size()])) {
            u(eVar, z10);
        }
    }
}
