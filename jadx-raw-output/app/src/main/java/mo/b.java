package mo;

import fn.c;
import java.net.BindException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import mn.h;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.fourthline.cling.transport.RouterException;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.NoNetworkException;
import po.f;
import po.g;
import po.j;
import po.l;
import po.m;

/* JADX INFO: compiled from: RouterImpl.java */
/* JADX INFO: loaded from: classes10.dex */
@ApplicationScoped
public class b implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Logger f64651l = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f64652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zn.a f64653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f64654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ReentrantReadWriteLock f64655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Lock f64656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Lock f64657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f64658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f64659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<NetworkInterface, f> f64660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<InetAddress, po.c> f64661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<InetAddress, l> f64662k;

    public int h() {
        return 6000;
    }

    @Override // mo.a
    public zn.a a() {
        return this.f64653b;
    }

    @Override // mo.a
    public void b(org.fourthline.cling.model.message.a aVar) throws RouterException {
        j(this.f64656e);
        try {
            if (this.f64654c) {
                Iterator<po.c> it = this.f64661j.values().iterator();
                while (it.hasNext()) {
                    it.next().b(aVar);
                }
            } else {
                f64651l.fine("Router disabled, not sending datagram: " + aVar);
            }
        } finally {
            n(this.f64656e);
        }
    }

    @Override // mo.a
    public org.fourthline.cling.model.message.c c(org.fourthline.cling.model.message.b bVar) throws RouterException {
        j(this.f64656e);
        try {
            if (!this.f64654c) {
                f64651l.fine("Router disabled, not sending stream request: " + bVar);
            } else {
                if (this.f64659h != null) {
                    f64651l.fine("Sending via TCP unicast stream: " + bVar);
                    try {
                        org.fourthline.cling.model.message.c cVarA = this.f64659h.a(bVar);
                        n(this.f64656e);
                        return cVarA;
                    } catch (InterruptedException e10) {
                        throw new RouterException("Sending stream request was interrupted", e10);
                    }
                }
                f64651l.fine("No StreamClient available, not sending: " + bVar);
            }
            n(this.f64656e);
            return null;
        } catch (Throwable th2) {
            n(this.f64656e);
            throw th2;
        }
    }

    @Override // mo.a
    public List<h> d(InetAddress inetAddress) throws RouterException {
        l lVar;
        j(this.f64656e);
        try {
            if (!this.f64654c || this.f64662k.size() <= 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (inetAddress == null || (lVar = this.f64662k.get(inetAddress)) == null) {
                for (Map.Entry<InetAddress, l> entry : this.f64662k.entrySet()) {
                    arrayList.add(new h(entry.getKey(), entry.getValue().t(), this.f64658g.h(entry.getKey())));
                }
            } else {
                arrayList.add(new h(inetAddress, lVar.t(), this.f64658g.h(inetAddress)));
            }
            return arrayList;
        } finally {
            n(this.f64656e);
        }
    }

    @Override // mo.a
    public void e(m mVar) {
        if (!this.f64654c) {
            f64651l.fine("Router disabled, ignoring incoming: " + mVar);
            return;
        }
        f64651l.fine("Received synchronous stream: " + mVar);
        getConfiguration().h().execute(mVar);
    }

    @Override // mo.a
    public boolean enable() throws RouterException {
        boolean z10;
        j(this.f64657f);
        try {
            if (this.f64654c) {
                z10 = false;
            } else {
                try {
                    f64651l.fine("Starting networking services...");
                    g gVarD = getConfiguration().d();
                    this.f64658g = gVarD;
                    m(gVarD.f());
                    l(this.f64658g.a());
                    if (!this.f64658g.c()) {
                        throw new NoNetworkException("No usable network interface and/or addresses available, check the log for errors.");
                    }
                    this.f64659h = getConfiguration().b();
                    z10 = true;
                    this.f64654c = true;
                } catch (InitializationException e10) {
                    i(e10);
                    z10 = false;
                }
            }
            n(this.f64657f);
            return z10;
        } catch (Throwable th2) {
            n(this.f64657f);
            throw th2;
        }
    }

    @Override // mo.a
    public void f(pn.b bVar) {
        if (!this.f64654c) {
            f64651l.fine("Router disabled, ignoring incoming message: " + bVar);
            return;
        }
        try {
            zn.c cVarE = a().e(bVar);
            if (cVarE == null) {
                if (f64651l.isLoggable(Level.FINEST)) {
                    f64651l.finest("No protocol, ignoring received message: " + bVar);
                    return;
                }
                return;
            }
            if (f64651l.isLoggable(Level.FINE)) {
                f64651l.fine("Received asynchronous message: " + bVar);
            }
            getConfiguration().f().execute(cVarE);
        } catch (ProtocolCreationException e10) {
            f64651l.warning("Handling received datagram failed - " + so.a.a(e10).toString());
        }
    }

    public boolean g() throws RouterException {
        j(this.f64657f);
        try {
            if (!this.f64654c) {
                return false;
            }
            f64651l.fine("Disabling network services...");
            if (this.f64659h != null) {
                f64651l.fine("Stopping stream client connection management/pool");
                this.f64659h.stop();
                this.f64659h = null;
            }
            for (Map.Entry<InetAddress, l> entry : this.f64662k.entrySet()) {
                f64651l.fine("Stopping stream server on address: " + entry.getKey());
                entry.getValue().stop();
            }
            this.f64662k.clear();
            for (Map.Entry<NetworkInterface, f> entry2 : this.f64660i.entrySet()) {
                f64651l.fine("Stopping multicast receiver on interface: " + entry2.getKey().getDisplayName());
                entry2.getValue().stop();
            }
            this.f64660i.clear();
            for (Map.Entry<InetAddress, po.c> entry3 : this.f64661j.entrySet()) {
                f64651l.fine("Stopping datagram I/O on address: " + entry3.getKey());
                entry3.getValue().stop();
            }
            this.f64661j.clear();
            this.f64658g = null;
            this.f64654c = false;
            return true;
        } finally {
            n(this.f64657f);
        }
    }

    @Override // mo.a
    public c getConfiguration() {
        return this.f64652a;
    }

    public void i(InitializationException initializationException) throws InitializationException {
        if (initializationException instanceof NoNetworkException) {
            f64651l.info("Unable to initialize network router, no network found.");
            return;
        }
        f64651l.severe("Unable to initialize network router: " + initializationException);
        f64651l.severe("Cause: " + so.a.a(initializationException));
    }

    public void k(Lock lock, int i10) throws RouterException {
        try {
            f64651l.finest("Trying to obtain lock with timeout milliseconds '" + i10 + "': " + lock.getClass().getSimpleName());
            if (lock.tryLock(i10, TimeUnit.MILLISECONDS)) {
                f64651l.finest("Acquired router lock: " + lock.getClass().getSimpleName());
                return;
            }
            throw new RouterException("Router wasn't available exclusively after waiting " + i10 + "ms, lock failed: " + lock.getClass().getSimpleName());
        } catch (InterruptedException e10) {
            throw new RouterException("Interruption while waiting for exclusive access: " + lock.getClass().getSimpleName(), e10);
        }
    }

    public void n(Lock lock) {
        f64651l.finest("Releasing router lock: " + lock.getClass().getSimpleName());
        lock.unlock();
    }

    public b(c cVar, zn.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.f64655d = reentrantReadWriteLock;
        this.f64656e = reentrantReadWriteLock.readLock();
        this.f64657f = this.f64655d.writeLock();
        this.f64660i = new HashMap();
        this.f64661j = new HashMap();
        this.f64662k = new HashMap();
        f64651l.info("Creating Router: " + getClass().getName());
        this.f64652a = cVar;
        this.f64653b = aVar;
    }

    public void j(Lock lock) throws RouterException {
        k(lock, h());
    }

    public void l(Iterator<InetAddress> it) throws InitializationException {
        while (it.hasNext()) {
            InetAddress next = it.next();
            l lVarJ = getConfiguration().j(this.f64658g);
            if (lVarJ == null) {
                f64651l.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (f64651l.isLoggable(Level.FINE)) {
                        f64651l.fine("Init stream server on address: " + next);
                    }
                    lVarJ.d0(next, this);
                    this.f64662k.put(next, lVarJ);
                } catch (InitializationException e10) {
                    Throwable thA = so.a.a(e10);
                    if (thA instanceof BindException) {
                        f64651l.warning("Failed to init StreamServer: " + thA);
                        Logger logger = f64651l;
                        Level level = Level.FINE;
                        if (logger.isLoggable(level)) {
                            f64651l.log(level, "Initialization exception root cause", thA);
                        }
                        f64651l.warning("Removing unusable address: " + next);
                        it.remove();
                    } else {
                        throw e10;
                    }
                }
            }
            po.c cVarW = getConfiguration().w(this.f64658g);
            if (cVarW == null) {
                f64651l.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (f64651l.isLoggable(Level.FINE)) {
                        f64651l.fine("Init datagram I/O on address: " + next);
                    }
                    cVarW.A(next, this, getConfiguration().o());
                    this.f64661j.put(next, cVarW);
                } catch (InitializationException e11) {
                    throw e11;
                }
            }
        }
        for (Map.Entry<InetAddress, l> entry : this.f64662k.entrySet()) {
            if (f64651l.isLoggable(Level.FINE)) {
                f64651l.fine("Starting stream server on address: " + entry.getKey());
            }
            getConfiguration().u().execute(entry.getValue());
        }
        for (Map.Entry<InetAddress, po.c> entry2 : this.f64661j.entrySet()) {
            if (f64651l.isLoggable(Level.FINE)) {
                f64651l.fine("Starting datagram I/O on address: " + entry2.getKey());
            }
            getConfiguration().s().execute(entry2.getValue());
        }
    }

    public void m(Iterator<NetworkInterface> it) throws InitializationException {
        while (it.hasNext()) {
            NetworkInterface next = it.next();
            f fVarI = getConfiguration().i(this.f64658g);
            if (fVarI == null) {
                f64651l.info("Configuration did not create a MulticastReceiver for: " + next);
            } else {
                try {
                    if (f64651l.isLoggable(Level.FINE)) {
                        f64651l.fine("Init multicast receiver on interface: " + next.getDisplayName());
                    }
                    fVarI.E(next, this, this.f64658g, getConfiguration().o());
                    this.f64660i.put(next, fVarI);
                } catch (InitializationException e10) {
                    throw e10;
                }
            }
        }
        for (Map.Entry<NetworkInterface, f> entry : this.f64660i.entrySet()) {
            if (f64651l.isLoggable(Level.FINE)) {
                f64651l.fine("Starting multicast receiver on interface: " + entry.getKey().getDisplayName());
            }
            getConfiguration().n().execute(entry.getValue());
        }
    }

    @Override // mo.a
    public void shutdown() throws RouterException {
        g();
    }
}
