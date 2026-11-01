package oo;

import com.ironsource.Z7;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import org.eclipse.jetty.servlet.ServletHolder;
import po.i;
import rm.f;
import rm.p;

/* JADX INFO: compiled from: JettyServletContainer.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f65469b = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f65470c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f65471a;

    /* JADX INFO: renamed from: oo.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JettyServletContainer.java */
    public class C0601a extends en.a {
        @Override // en.a, ym.a
        public void e0() throws Exception {
        }

        public C0601a(ExecutorService executorService) {
            super(executorService);
        }
    }

    @Override // po.i
    public synchronized void a(ExecutorService executorService) {
        a aVar = f65470c;
        if (aVar.f65471a.J0() == null) {
            aVar.f65471a.U0(new C0601a(executorService));
        }
    }

    @Override // po.i
    public synchronized int b(String str, int i10) throws IOException {
        sm.a aVar;
        aVar = new sm.a();
        aVar.T0(str);
        aVar.U0(i10);
        aVar.open();
        this.f65471a.C0(aVar);
        if (this.f65471a.isStarted()) {
            try {
                aVar.start();
            } catch (Exception e10) {
                f65469b.severe("Couldn't start connector: " + aVar + Z7.f27998r + e10);
                throw new RuntimeException(e10);
            }
        }
        return aVar.c();
    }

    @Override // po.i
    public synchronized void c(String str, int i10) {
        try {
            f[] fVarArrD0 = this.f65471a.D0();
            for (f fVar : fVarArrD0) {
                if (fVar.L().equals(str) && fVar.c() == i10) {
                    if (fVar.isStarted() || fVar.I()) {
                        try {
                            fVar.stop();
                        } catch (Exception e10) {
                            f65469b.severe("Couldn't stop connector: " + fVar + Z7.f27998r + e10);
                            throw new RuntimeException(e10);
                        }
                    }
                    this.f65471a.Q0(fVar);
                    if (fVarArrD0.length != 1) {
                        break;
                    }
                    f65469b.info("No more connectors, stopping Jetty server");
                    g();
                    break;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // po.i
    public synchronized void d() {
        if (!this.f65471a.isStarted() && !this.f65471a.I()) {
            f65469b.info("Starting Jetty server... ");
            try {
                this.f65471a.start();
            } catch (Exception e10) {
                f65469b.severe("Couldn't start Jetty server: " + e10);
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // po.i
    public synchronized void e(String str, kj.i iVar) {
        if (this.f65471a.A0() != null) {
            return;
        }
        f65469b.info("Registering UPnP servlet under context path: " + str);
        org.eclipse.jetty.servlet.b bVar = new org.eclipse.jetty.servlet.b(0);
        if (str != null && str.length() > 0) {
            bVar.h1(str);
        }
        bVar.m1(new ServletHolder(iVar), "/*");
        this.f65471a.B0(bVar);
    }

    public synchronized void g() {
        if (!this.f65471a.isStopped() && !this.f65471a.s()) {
            f65469b.info("Stopping Jetty server...");
            try {
                try {
                    this.f65471a.stop();
                    f();
                } catch (Exception e10) {
                    f65469b.severe("Couldn't stop Jetty server: " + e10);
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                f();
                throw th2;
            }
        }
    }

    public void f() {
        p pVar = new p();
        this.f65471a = pVar;
        pVar.S0(1000);
    }

    public a() {
        f();
    }
}
