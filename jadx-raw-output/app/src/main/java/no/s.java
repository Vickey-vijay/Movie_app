package no;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.logging.Logger;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: StreamServerImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public class s implements po.l<r> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f64926d = Logger.getLogger(po.l.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f64927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpServer f64928c;

    /* JADX INFO: compiled from: StreamServerImpl.java */
    public class a implements HttpHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mo.a f64929a;

        public a(mo.a aVar) {
            this.f64929a = aVar;
        }
    }

    @Override // po.l
    public synchronized void d0(InetAddress inetAddress, mo.a aVar) throws InitializationException {
        try {
            HttpServer httpServerCreate = HttpServer.create(new InetSocketAddress(inetAddress, this.f64927b.a()), this.f64927b.b());
            this.f64928c = httpServerCreate;
            httpServerCreate.createContext("/", new a(aVar));
            f64926d.info("Created server (for receiving TCP streams) on: " + this.f64928c.getAddress());
        } catch (Exception e10) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e10.toString(), e10);
        }
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        f64926d.fine("Starting StreamServer...");
        this.f64928c.start();
    }

    @Override // po.l
    public synchronized void stop() {
        f64926d.fine("Stopping StreamServer...");
        HttpServer httpServer = this.f64928c;
        if (httpServer != null) {
            httpServer.stop(1);
        }
    }

    @Override // po.l
    public synchronized int t() {
        return this.f64928c.getAddress().getPort();
    }

    public s(r rVar) {
        this.f64927b = rVar;
    }
}
