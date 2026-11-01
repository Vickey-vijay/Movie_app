package org.fourthline.cling.transport.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import kj.c;
import kj.i;
import org.fourthline.cling.transport.spi.InitializationException;
import po.l;

/* JADX INFO: loaded from: classes5.dex */
public class AsyncServletStreamServerImpl implements l<no.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f65824f = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final no.a f65825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f65827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f65828e = 0;

    public class a implements pn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public lj.a f65833a;

        public a(lj.a aVar) {
            this.f65833a = aVar;
        }

        public lj.a b() {
            return this.f65833a;
        }

        @Override // pn.a
        public InetAddress a() {
            try {
                return InetAddress.getByName(b().e());
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // po.l
    public synchronized void d0(InetAddress inetAddress, mo.a aVar) throws InitializationException {
        try {
            Logger logger = f65824f;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                logger.fine("Setting executor service on servlet container adapter");
            }
            e().c().a(aVar.getConfiguration().u());
            if (logger.isLoggable(level)) {
                logger.fine("Adding connector: " + inetAddress + StringUtils.PROCESS_POSTFIX_DELIMITER + e().b());
            }
            this.f65827d = inetAddress.getHostAddress();
            this.f65826c = e().c().b(this.f65827d, e().b());
            e().c().e(aVar.getConfiguration().getNamespace().b().getPath(), d(aVar));
        } catch (Exception e10) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e10.toString(), e10);
        }
    }

    @Override // po.l
    public synchronized void stop() {
        e().c().c(this.f65827d, this.f65826c);
    }

    @Override // po.l
    public synchronized int t() {
        return this.f65826c;
    }

    public static /* synthetic */ int a(AsyncServletStreamServerImpl asyncServletStreamServerImpl) {
        int i10 = asyncServletStreamServerImpl.f65828e;
        asyncServletStreamServerImpl.f65828e = i10 + 1;
        return i10;
    }

    public i d(final mo.a aVar) {
        return new HttpServlet() { // from class: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl.1

            /* JADX INFO: renamed from: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl$1$a */
            public class a implements c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f65829b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f65830c;

                public a(long j10, int i10) {
                    this.f65829b = j10;
                    this.f65830c = i10;
                }

                @Override // kj.c
                public void f(kj.b bVar) throws IOException {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f65829b;
                    if (AsyncServletStreamServerImpl.f65824f.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f65824f.fine(String.format("AsyncListener.onError(): id: %3d, duration: %,4d, response: %s", Integer.valueOf(this.f65830c), Long.valueOf(jCurrentTimeMillis), bVar.b()));
                    }
                }

                @Override // kj.c
                public void l(kj.b bVar) throws IOException {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f65829b;
                    if (AsyncServletStreamServerImpl.f65824f.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f65824f.fine(String.format("AsyncListener.onTimeout(): id: %3d, duration: %,4d, request: %s", Integer.valueOf(this.f65830c), Long.valueOf(jCurrentTimeMillis), bVar.a()));
                    }
                }

                @Override // kj.c
                public void w(kj.b bVar) throws IOException {
                    if (AsyncServletStreamServerImpl.f65824f.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f65824f.fine(String.format("AsyncListener.onStartAsync(): id: %3d, request: %s", Integer.valueOf(this.f65830c), bVar.a()));
                    }
                }

                @Override // kj.c
                public void z(kj.b bVar) throws IOException {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f65829b;
                    if (AsyncServletStreamServerImpl.f65824f.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f65824f.fine(String.format("AsyncListener.onComplete(): id: %3d, duration: %,4d, response: %s", Integer.valueOf(this.f65830c), Long.valueOf(jCurrentTimeMillis), bVar.b()));
                    }
                }
            }

            /* JADX INFO: renamed from: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl$1$b */
            public class b extends no.b {
                public b(zn.a aVar, kj.a aVar2, lj.a aVar3) {
                    super(aVar, aVar2, aVar3);
                }

                @Override // no.b
                public pn.a K() {
                    return AsyncServletStreamServerImpl.this.new a(L());
                }
            }

            @Override // javax.servlet.http.HttpServlet
            public void service(lj.a aVar2, lj.c cVar) throws ServletException, IOException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iA = AsyncServletStreamServerImpl.a(AsyncServletStreamServerImpl.this);
                if (AsyncServletStreamServerImpl.f65824f.isLoggable(Level.FINE)) {
                    AsyncServletStreamServerImpl.f65824f.fine(String.format("HttpServlet.service(): id: %3d, request URI: %s", Integer.valueOf(iA), aVar2.v()));
                }
                kj.a aVarQ = aVar2.q();
                aVarQ.b(AsyncServletStreamServerImpl.this.e().a() * 1000);
                aVarQ.a(new a(jCurrentTimeMillis, iA));
                aVar.e(new b(aVar.a(), aVarQ, aVar2));
            }
        };
    }

    public no.a e() {
        return this.f65825b;
    }

    public AsyncServletStreamServerImpl(no.a aVar) {
        this.f65825b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e().c().d();
    }
}
