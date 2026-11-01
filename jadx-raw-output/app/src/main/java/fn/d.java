package fn;

import co.g;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: UpnpServiceImpl.java */
/* JADX INFO: loaded from: classes10.dex */
@Alternative
public class d implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f52999f = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f53000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.b f53001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zn.a f53002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final co.c f53003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mo.a f53004e;

    /* JADX INFO: compiled from: UpnpServiceImpl.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.f52999f.info(">>> Shutting down UPnP service...");
            d.this.k();
            d.this.l();
            d.this.j();
            d.f52999f.info("<<< UPnP service shutdown completed");
        }
    }

    public d() {
        this(new fn.a(), new g[0]);
    }

    @Override // fn.b
    public synchronized void shutdown() {
        i(false);
    }

    public d(c cVar, g... gVarArr) {
        this.f53000a = cVar;
        f52999f.info(">>> Starting UPnP service...");
        f52999f.info("Using configuration: " + getConfiguration().getClass().getName());
        zn.a aVarF = f();
        this.f53002c = aVarF;
        this.f53003d = g(aVarF);
        for (g gVar : gVarArr) {
            this.f53003d.w(gVar);
        }
        mo.a aVarH = h(this.f53002c, this.f53003d);
        this.f53004e = aVarH;
        try {
            aVarH.enable();
            this.f53001b = e(this.f53002c, this.f53003d);
            f52999f.info("<<< UPnP service started successfully");
        } catch (RouterException e10) {
            throw new RuntimeException("Enabling network router failed: " + e10, e10);
        }
    }

    @Override // fn.b
    public zn.a a() {
        return this.f53002c;
    }

    @Override // fn.b
    public ln.b b() {
        return this.f53001b;
    }

    @Override // fn.b
    public mo.a c() {
        return this.f53004e;
    }

    public ln.b e(zn.a aVar, co.c cVar) {
        return new ln.c(getConfiguration(), aVar, cVar);
    }

    public zn.a f() {
        return new zn.b(this);
    }

    public co.c g(zn.a aVar) {
        return new co.d(this);
    }

    @Override // fn.b
    public c getConfiguration() {
        return this.f53000a;
    }

    @Override // fn.b
    public co.c getRegistry() {
        return this.f53003d;
    }

    public mo.a h(zn.a aVar, co.c cVar) {
        return new mo.b(getConfiguration(), aVar);
    }

    public void i(boolean z10) {
        a aVar = new a();
        if (z10) {
            new Thread(aVar).start();
        } else {
            aVar.run();
        }
    }

    public void j() {
        getConfiguration().shutdown();
    }

    public void k() {
        getRegistry().shutdown();
    }

    public void l() {
        try {
            c().shutdown();
        } catch (RouterException e10) {
            Throwable thA = so.a.a(e10);
            if (thA instanceof InterruptedException) {
                f52999f.log(Level.INFO, "Router shutdown was interrupted: " + e10, thA);
                return;
            }
            f52999f.log(Level.SEVERE, "Router error on shutdown: " + e10, thA);
        }
    }
}
