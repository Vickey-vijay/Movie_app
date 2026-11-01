package co;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import un.j;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: RegistryImpl.java */
/* JADX INFO: loaded from: classes5.dex */
@ApplicationScoped
public class d implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Logger f6161i = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fn.b f6162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f6163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<on.c> f6164c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<g> f6165d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<e<URI, wn.c>> f6166e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Runnable> f6167f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f6168g = new i(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final co.b f6169h = new co.b(this);

    /* JADX INFO: compiled from: RegistryImpl.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f6170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ un.i f6171c;

        public a(g gVar, un.i iVar) {
            this.f6170b = gVar;
            this.f6171c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6170b.g(d.this, this.f6171c);
        }
    }

    /* JADX INFO: compiled from: RegistryImpl.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f6173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ un.i f6174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Exception f6175d;

        public b(g gVar, un.i iVar, Exception exc) {
            this.f6173b = gVar;
            this.f6174c = iVar;
            this.f6175d = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6173b.i(d.this, this.f6174c, this.f6175d);
        }
    }

    @Override // co.c
    public synchronized <T extends wn.c> T A(Class<T> cls, URI uri) throws IllegalArgumentException {
        T t10 = (T) d(uri);
        if (t10 == null || !cls.isAssignableFrom(t10.getClass())) {
            return null;
        }
        return t10;
    }

    @Override // co.c
    public synchronized boolean B(z zVar) {
        un.a aVarJ = j(zVar, true);
        if (aVarJ != null && (aVarJ instanceof un.e)) {
            return m((un.e) aVarJ);
        }
        if (aVarJ == null || !(aVarJ instanceof un.i)) {
            return false;
        }
        return q((un.i) aVarJ);
    }

    @Override // co.c
    public synchronized boolean C(on.b bVar) {
        return this.f6169h.j(bVar);
    }

    @Override // co.c
    public synchronized mn.c D(z zVar) {
        return this.f6169h.p(zVar);
    }

    public synchronized void E(wn.c cVar) {
        F(cVar, 0);
    }

    public synchronized void F(wn.c cVar, int i10) {
        e<URI, wn.c> eVar = new e<>(cVar.b(), cVar, i10);
        this.f6166e.remove(eVar);
        this.f6166e.add(eVar);
    }

    public synchronized void H(Runnable runnable) {
        this.f6167f.add(runnable);
    }

    public synchronized void L() {
        if (f6161i.isLoggable(Level.FINEST)) {
            f6161i.finest("Maintaining registry...");
        }
        Iterator<e<URI, wn.c>> it = this.f6166e.iterator();
        while (it.hasNext()) {
            e<URI, wn.c> next = it.next();
            if (next.a().d()) {
                if (f6161i.isLoggable(Level.FINER)) {
                    f6161i.finer("Removing expired resource: " + next);
                }
                it.remove();
            }
        }
        for (e<URI, wn.c> eVar : this.f6166e) {
            eVar.b().c(this.f6167f, eVar.a());
        }
        this.f6168g.l();
        this.f6169h.s();
        N(true);
    }

    public synchronized boolean M(wn.c cVar) {
        return this.f6166e.remove(new e(cVar.b()));
    }

    public synchronized void N(boolean z10) {
        if (f6161i.isLoggable(Level.FINEST)) {
            f6161i.finest("Executing pending operations: " + this.f6167f.size());
        }
        for (Runnable runnable : this.f6167f) {
            if (z10) {
                I().f().execute(runnable);
            } else {
                runnable.run();
            }
        }
        if (this.f6167f.size() > 0) {
            this.f6167f.clear();
        }
    }

    @Override // co.c
    public synchronized void a(g gVar) {
        this.f6165d.remove(gVar);
    }

    @Override // co.c
    public synchronized on.b b(String str) {
        return this.f6169h.g(str);
    }

    @Override // co.c
    public synchronized Collection<un.a> c() {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f6169h.b());
        hashSet.addAll(this.f6168g.b());
        return Collections.unmodifiableCollection(hashSet);
    }

    @Override // co.c
    public synchronized wn.c d(URI uri) throws IllegalArgumentException {
        if (uri.isAbsolute()) {
            throw new IllegalArgumentException("Resource URI can not be absolute, only path and query:" + uri);
        }
        Iterator<e<URI, wn.c>> it = this.f6166e.iterator();
        while (it.hasNext()) {
            wn.c cVarB = it.next().b();
            if (cVarB.d(uri)) {
                return cVarB;
            }
        }
        if (uri.getPath().endsWith("/")) {
            URI uriCreate = URI.create(uri.toString().substring(0, uri.toString().length() - 1));
            Iterator<e<URI, wn.c>> it2 = this.f6166e.iterator();
            while (it2.hasNext()) {
                wn.c cVarB2 = it2.next().b();
                if (cVarB2.d(uriCreate)) {
                    return cVarB2;
                }
            }
        }
        return null;
    }

    @Override // co.c
    public synchronized un.i f(z zVar, boolean z10) {
        return this.f6168g.e(zVar, z10);
    }

    @Override // co.c
    public synchronized boolean g(on.b bVar) {
        return this.f6169h.i(bVar);
    }

    @Override // co.c
    public synchronized Collection<g> getListeners() {
        return Collections.unmodifiableCollection(this.f6165d);
    }

    @Override // co.c
    public synchronized Collection<wn.c> getResources() {
        HashSet hashSet;
        hashSet = new HashSet();
        Iterator<e<URI, wn.c>> it = this.f6166e.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b());
        }
        return hashSet;
    }

    @Override // co.c
    public synchronized void i(on.c cVar) {
        this.f6168g.a(cVar);
    }

    @Override // co.c
    public synchronized un.a j(z zVar, boolean z10) {
        un.e eVarE = this.f6169h.e(zVar, z10);
        if (eVarE != null) {
            return eVarE;
        }
        un.i iVarE = this.f6168g.e(zVar, z10);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    @Override // co.c
    public synchronized void k(un.i iVar) {
        this.f6168g.k(iVar);
    }

    @Override // co.c
    public synchronized boolean m(un.e eVar) {
        return this.f6169h.t(eVar);
    }

    @Override // co.c
    public synchronized Collection<un.a> n(s sVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f6169h.d(sVar));
        hashSet.addAll(this.f6168g.d(sVar));
        return Collections.unmodifiableCollection(hashSet);
    }

    @Override // co.c
    public synchronized un.e o(z zVar, boolean z10) {
        return this.f6169h.e(zVar, z10);
    }

    @Override // co.c
    public synchronized on.c p(String str) {
        return this.f6168g.g(str);
    }

    @Override // co.c
    public synchronized boolean q(un.i iVar) {
        return this.f6168g.m(iVar);
    }

    @Override // co.c
    public synchronized void r(on.c cVar) {
        this.f6168g.j(cVar);
    }

    @Override // co.c
    public synchronized void s(un.e eVar) {
        this.f6169h.l(eVar);
    }

    @Override // co.c
    public synchronized void shutdown() {
        f6161i.fine("Shutting down registry...");
        h hVar = this.f6163b;
        if (hVar != null) {
            hVar.stop();
        }
        f6161i.finest("Executing final pending operations on shutdown: " + this.f6167f.size());
        N(false);
        Iterator<g> it = this.f6165d.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
        Set<e<URI, wn.c>> set = this.f6166e;
        for (e eVar : (e[]) set.toArray(new e[set.size()])) {
            ((wn.c) eVar.b()).e();
        }
        this.f6168g.q();
        this.f6169h.x();
        Iterator<g> it2 = this.f6165d.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    @Override // co.c
    public synchronized void t(un.i iVar, Exception exc) {
        Iterator<g> it = getListeners().iterator();
        while (it.hasNext()) {
            I().p().execute(new b(it.next(), iVar, exc));
        }
    }

    @Override // co.c
    public synchronized Collection<un.e> u() {
        return Collections.unmodifiableCollection(this.f6169h.b());
    }

    @Override // co.c
    public synchronized boolean update(j jVar) {
        return this.f6168g.update(jVar);
    }

    @Override // co.c
    public synchronized boolean v(un.i iVar) {
        if (K().getRegistry().f(iVar.r().b(), true) == null) {
            Iterator<g> it = getListeners().iterator();
            while (it.hasNext()) {
                I().p().execute(new a(it.next(), iVar));
            }
            return true;
        }
        f6161i.finer("Not notifying listeners, already registered: " + iVar);
        return false;
    }

    @Override // co.c
    public synchronized void w(g gVar) {
        this.f6165d.add(gVar);
    }

    @Override // co.c
    public synchronized void x(on.b bVar) {
        this.f6169h.a(bVar);
    }

    @Override // co.c
    public synchronized Collection<un.a> y(yn.j jVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f6169h.c(jVar));
        hashSet.addAll(this.f6168g.c(jVar));
        return Collections.unmodifiableCollection(hashSet);
    }

    @Override // co.c
    public synchronized void z(on.c cVar) {
        this.f6168g.i(cVar);
    }

    public h G() {
        return new h(this, I().a());
    }

    public fn.b K() {
        return this.f6162a;
    }

    @Override // co.c
    public void e(on.c cVar) {
        synchronized (this.f6164c) {
            if (this.f6164c.remove(cVar)) {
                this.f6164c.notifyAll();
            }
        }
    }

    @Override // co.c
    public on.c h(String str) {
        on.c cVarP;
        synchronized (this.f6164c) {
            cVarP = p(str);
            while (cVarP == null && !this.f6164c.isEmpty()) {
                try {
                    f6161i.finest("Subscription not found, waiting for pending subscription procedure to terminate.");
                    this.f6164c.wait();
                } catch (InterruptedException unused) {
                }
                cVarP = p(str);
            }
        }
        return cVarP;
    }

    @Override // co.c
    public void l(on.c cVar) {
        synchronized (this.f6164c) {
            this.f6164c.add(cVar);
        }
    }

    public d(fn.b bVar) {
        f6161i.fine("Creating Registry: " + getClass().getName());
        this.f6162a = bVar;
        f6161i.fine("Starting registry background maintenance...");
        h hVarG = G();
        this.f6163b = hVarG;
        if (hVarG != null) {
            I().g().execute(this.f6163b);
        }
    }

    public fn.c I() {
        return K().getConfiguration();
    }

    public zn.a J() {
        return K().a();
    }

    @Override // co.c
    public synchronized <T extends wn.c> Collection<T> getResources(Class<T> cls) {
        HashSet hashSet;
        hashSet = new HashSet();
        for (e<URI, wn.c> eVar : this.f6166e) {
            if (cls.isAssignableFrom(eVar.b().getClass())) {
                hashSet.add(eVar.b());
            }
        }
        return hashSet;
    }
}
