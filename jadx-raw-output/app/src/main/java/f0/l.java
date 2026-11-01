package f0;

import com.danikula.videocache.InterruptedProxyCacheException;
import com.danikula.videocache.ProxyCacheException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ProxyCache.java */
/* JADX INFO: loaded from: classes9.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f52811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.a f52812b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Thread f52816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f52817g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f52813c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f52814d = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f52818h = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f52815e = new AtomicInteger();

    /* JADX INFO: compiled from: ProxyCache.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.k();
        }
    }

    public void g(int i10) {
        throw null;
    }

    public final synchronized void l() throws ProxyCacheException {
        boolean z10 = (this.f52816f == null || this.f52816f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.f52817g && !this.f52812b.d() && !z10) {
            this.f52816f = new Thread(new b(), "Source reader for " + this.f52811a);
            this.f52816f.start();
        }
    }

    public final void b() throws ProxyCacheException {
        int i10 = this.f52815e.get();
        if (i10 < 1) {
            return;
        }
        this.f52815e.set(0);
        throw new ProxyCacheException("Error reading source " + i10 + " times");
    }

    public final void c() {
        try {
            this.f52811a.close();
        } catch (ProxyCacheException e10) {
            h(new ProxyCacheException("Error closing source " + this.f52811a, e10));
        }
    }

    public void f(long j10, long j11) {
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((j10 / j11) * 100.0f);
        boolean z10 = i10 != this.f52818h;
        if ((j11 >= 0) && z10) {
            g(i10);
        }
        this.f52818h = i10;
    }

    public final void h(Throwable th2) {
        if (th2 instanceof InterruptedProxyCacheException) {
            j.a("ProxyCache is interrupted");
        } else {
            j.b("ProxyCache error");
        }
    }

    public final void i() {
        this.f52818h = 100;
        g(this.f52818h);
    }

    public final void k() {
        long length = -1;
        long jAvailable = 0;
        try {
            jAvailable = this.f52812b.available();
            this.f52811a.a(jAvailable);
            length = this.f52811a.length();
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = this.f52811a.read(bArr);
                if (i10 == -1) {
                    n();
                    i();
                    break;
                }
                synchronized (this.f52814d) {
                    if (d()) {
                        c();
                        e(jAvailable, length);
                        return;
                    }
                    this.f52812b.e(bArr, i10);
                }
                jAvailable += (long) i10;
                e(jAvailable, length);
            }
        } catch (Throwable th2) {
            try {
                this.f52815e.incrementAndGet();
                h(th2);
            } finally {
                c();
                e(jAvailable, length);
            }
        }
    }

    public void m() {
        synchronized (this.f52814d) {
            j.a("Shutdown proxy for " + this.f52811a);
            try {
                this.f52817g = true;
                if (this.f52816f != null) {
                    this.f52816f.interrupt();
                }
                this.f52812b.close();
            } catch (ProxyCacheException e10) {
                h(e10);
            }
        }
    }

    public final void n() throws ProxyCacheException {
        synchronized (this.f52814d) {
            if (!d() && this.f52812b.available() == this.f52811a.length()) {
                this.f52812b.complete();
            }
        }
    }

    public final void o() throws ProxyCacheException {
        synchronized (this.f52813c) {
            try {
                try {
                    this.f52813c.wait(1000L);
                } catch (InterruptedException e10) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l(n nVar, f0.a aVar) {
        this.f52811a = (n) k.c(nVar);
        this.f52812b = (f0.a) k.c(aVar);
    }

    public final boolean d() {
        if (!Thread.currentThread().isInterrupted() && !this.f52817g) {
            return false;
        }
        return true;
    }

    public final void e(long j10, long j11) {
        f(j10, j11);
        synchronized (this.f52813c) {
            this.f52813c.notifyAll();
        }
    }

    public int j(byte[] bArr, long j10, int i10) throws ProxyCacheException {
        m.a(bArr, j10, i10);
        while (!this.f52812b.d() && this.f52812b.available() < ((long) i10) + j10 && !this.f52817g) {
            l();
            o();
            b();
        }
        int iF = this.f52812b.f(bArr, j10, i10);
        if (this.f52812b.d() && this.f52818h != 100) {
            this.f52818h = 100;
            g(100);
        }
        return iF;
    }
}
