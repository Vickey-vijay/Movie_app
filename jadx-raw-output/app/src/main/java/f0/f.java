package f0;

import android.content.Context;
import android.net.Uri;
import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: HttpProxyCacheServer.java */
/* JADX INFO: loaded from: classes9.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f52778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, g> f52779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ServerSocket f52780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f52781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Thread f52782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0.c f52783g;

    /* JADX INFO: compiled from: HttpProxyCacheServer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f52784a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i0.b f52787d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g0.a f52786c = new g0.g(536870912);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g0.c f52785b = new g0.f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h0.b f52788e = new h0.a();

        public final f0.c b() {
            return new f0.c(this.f52784a, this.f52785b, this.f52786c, this.f52787d, this.f52788e);
        }

        public b c(long j10) {
            this.f52786c = new g0.g(j10);
            return this;
        }

        public b(Context context) {
            this.f52787d = i0.c.a(context);
            this.f52784a = p.d(context);
        }

        public f a() {
            return new f(b());
        }
    }

    /* JADX INFO: compiled from: HttpProxyCacheServer.java */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Socket f52789b;

        public c(Socket socket) {
            this.f52789b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.o(this.f52789b);
        }
    }

    /* JADX INFO: compiled from: HttpProxyCacheServer.java */
    public final class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountDownLatch f52791b;

        public d(CountDownLatch countDownLatch) {
            this.f52791b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52791b.countDown();
            f.this.r();
        }
    }

    public String k(String str) {
        return l(str, true);
    }

    public f(f0.c cVar) {
        this.f52777a = new Object();
        this.f52778b = Executors.newFixedThreadPool(8);
        this.f52779c = new ConcurrentHashMap();
        this.f52783g = (f0.c) k.c(cVar);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f52780d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f52781e = localPort;
            i.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new d(countDownLatch));
            this.f52782f = thread;
            thread.start();
            countDownLatch.await();
        } catch (IOException | InterruptedException e10) {
            this.f52778b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e10);
        }
    }

    public final String c(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.f52781e), m.f(str));
    }

    public File g(String str) {
        f0.c cVar = this.f52783g;
        return new File(cVar.f52764a, cVar.f52765b.a(str));
    }

    public File h() {
        return this.f52783g.f52764a;
    }

    public final g i(String str) throws ProxyCacheException {
        g gVar;
        synchronized (this.f52777a) {
            gVar = this.f52779c.get(str);
            if (gVar == null) {
                gVar = new g(str, this.f52783g);
                this.f52779c.put(str, gVar);
            }
        }
        return gVar;
    }

    public final int j() {
        int iB;
        synchronized (this.f52777a) {
            iB = 0;
            Iterator<g> it = this.f52779c.values().iterator();
            while (it.hasNext()) {
                iB += it.next().b();
            }
        }
        return iB;
    }

    public String l(String str, boolean z10) {
        if (!z10 || !g(str).exists()) {
            return c(str);
        }
        File fileG = g(str);
        q(fileG);
        return Uri.fromFile(fileG).toString();
    }

    public File m(String str) {
        return new File(this.f52783g.f52764a, this.f52783g.f52765b.a(str) + ".download");
    }

    public final void n(Throwable th2) {
        j.b("HttpProxyCacheServer error");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [f0.f] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void o(Socket socket) {
        ?? sb2;
        ?? J = "Opened connections: ";
        try {
            try {
                f0.d dVarC = f0.d.c(socket.getInputStream());
                j.a("Request to cache proxy:" + dVarC);
                i(m.e(dVarC.f52771a)).d(dVarC, socket);
                p(socket);
                sb2 = new StringBuilder();
            } catch (ProxyCacheException e10) {
                e = e10;
                n(new ProxyCacheException("Error processing request", e));
                p(socket);
                sb2 = new StringBuilder();
            } catch (SocketException unused) {
                j.a("Closing socket… Socket is closed by client.");
                p(socket);
                sb2 = new StringBuilder();
            } catch (IOException e11) {
                e = e11;
                n(new ProxyCacheException("Error processing request", e));
                p(socket);
                sb2 = new StringBuilder();
            }
            sb2.append("Opened connections: ");
            J = j();
            sb2.append(J);
            socket = sb2.toString();
            j.a(socket);
        } catch (Throwable th2) {
            p(socket);
            ?? sb3 = new StringBuilder();
            sb3.append(J);
            sb3.append(j());
            j.a(sb3.toString());
            throw th2;
        }
    }

    public final void q(File file) {
        try {
            this.f52783g.f52766c.a(file);
        } catch (IOException unused) {
            j.b("Error touching file " + file);
        }
    }

    public final void d(Socket socket) {
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (IOException e10) {
            n(new ProxyCacheException("Error closing socket", e10));
        }
    }

    public final void e(Socket socket) {
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (SocketException unused) {
            j.a("Releasing input stream… Socket is closed by client.");
        } catch (IOException e10) {
            n(new ProxyCacheException("Error closing socket input stream", e10));
        }
    }

    public final void f(Socket socket) {
        try {
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException unused) {
            j.d("Failed to close socket on proxy side: {}. It seems client have already closed connection.");
        }
    }

    public final void p(Socket socket) {
        e(socket);
        f(socket);
        d(socket);
    }

    public final void r() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket socketAccept = this.f52780d.accept();
                j.a("Accept new socket " + socketAccept);
                this.f52778b.submit(new c(socketAccept));
            } catch (IOException e10) {
                n(new ProxyCacheException("Error during waiting connection", e10));
                return;
            }
        }
    }
}
