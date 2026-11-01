package sm;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import mm.d;
import mm.i;
import mm.j;
import mm.k;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.io.EofException;
import rm.e;
import rm.n;
import zm.b;
import zm.c;

/* JADX INFO: compiled from: SocketConnector.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends rm.a {
    public static final c W = b.a(a.class);
    public ServerSocket T;
    public volatile int V = -1;
    public final Set<k> U = new HashSet();

    /* JADX INFO: renamed from: sm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SocketConnector.java */
    public class RunnableC0746a extends nm.a implements Runnable, i {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile j f72005k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Socket f72006l;

        public RunnableC0746a(Socket socket) throws IOException {
            super(socket, a.this.J);
            this.f72005k = a.this.Y0(this);
            this.f72006l = socket;
        }

        public void a() throws IOException {
            if (a.this.R0() == null || !a.this.R0().Z(this)) {
                a.W.g("dispatch failed for {}", this.f72005k);
                close();
            }
        }

        @Override // nm.a, nm.b, mm.k
        public void close() throws IOException {
            if (this.f72005k instanceof rm.b) {
                ((rm.b) this.f72005k).w().y().c();
            }
            super.close();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        try {
                            a.this.E0(this.f72005k);
                            synchronized (a.this.U) {
                                a.this.U.add(this);
                            }
                            while (a.this.isStarted() && !C()) {
                                if (this.f72005k.p() && a.this.J()) {
                                    q(a.this.O0());
                                }
                                this.f72005k = this.f72005k.e();
                            }
                            a.this.D0(this.f72005k);
                            synchronized (a.this.U) {
                                a.this.U.remove(this);
                            }
                            if (this.f72006l.isClosed()) {
                                return;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int iD = d();
                            this.f72006l.setSoTimeout(d());
                            while (this.f72006l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis < iD) {
                            }
                            if (this.f72006l.isClosed()) {
                                return;
                            }
                            this.f72006l.close();
                        } catch (IOException e10) {
                            a.W.h(e10);
                        }
                    } catch (SocketException e11) {
                        a.W.d("EOF", e11);
                        try {
                            close();
                        } catch (IOException e12) {
                            a.W.h(e12);
                        }
                        a.this.D0(this.f72005k);
                        synchronized (a.this.U) {
                            a.this.U.remove(this);
                            if (this.f72006l.isClosed()) {
                                return;
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            int iD2 = d();
                            this.f72006l.setSoTimeout(d());
                            while (this.f72006l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis2 < iD2) {
                            }
                            if (this.f72006l.isClosed()) {
                                return;
                            }
                            this.f72006l.close();
                        }
                    } catch (HttpException e13) {
                        a.W.d("BAD", e13);
                        try {
                            close();
                        } catch (IOException e14) {
                            a.W.h(e14);
                        }
                        a.this.D0(this.f72005k);
                        synchronized (a.this.U) {
                            a.this.U.remove(this);
                            if (this.f72006l.isClosed()) {
                                return;
                            }
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            int iD3 = d();
                            this.f72006l.setSoTimeout(d());
                            while (this.f72006l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis3 < iD3) {
                            }
                            if (this.f72006l.isClosed()) {
                                return;
                            }
                            this.f72006l.close();
                        }
                    }
                } catch (EofException e15) {
                    a.W.d("EOF", e15);
                    try {
                        close();
                    } catch (IOException e16) {
                        a.W.h(e16);
                    }
                    a.this.D0(this.f72005k);
                    synchronized (a.this.U) {
                        a.this.U.remove(this);
                        if (this.f72006l.isClosed()) {
                            return;
                        }
                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                        int iD4 = d();
                        this.f72006l.setSoTimeout(d());
                        while (this.f72006l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis4 < iD4) {
                        }
                        if (this.f72006l.isClosed()) {
                            return;
                        }
                        this.f72006l.close();
                    }
                } catch (Exception e17) {
                    a.W.c("handle failed?", e17);
                    try {
                        close();
                    } catch (IOException e18) {
                        a.W.h(e18);
                    }
                    a.this.D0(this.f72005k);
                    synchronized (a.this.U) {
                        a.this.U.remove(this);
                        if (this.f72006l.isClosed()) {
                            return;
                        }
                        long jCurrentTimeMillis5 = System.currentTimeMillis();
                        int iD5 = d();
                        this.f72006l.setSoTimeout(d());
                        while (this.f72006l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis5 < iD5) {
                        }
                        if (this.f72006l.isClosed()) {
                            return;
                        }
                        this.f72006l.close();
                    }
                }
            } catch (Throwable th2) {
                a.this.D0(this.f72005k);
                synchronized (a.this.U) {
                    a.this.U.remove(this);
                    try {
                        if (!this.f72006l.isClosed()) {
                            long jCurrentTimeMillis6 = System.currentTimeMillis();
                            int iD6 = d();
                            this.f72006l.setSoTimeout(d());
                            while (this.f72006l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis6 < iD6) {
                            }
                            if (!this.f72006l.isClosed()) {
                                this.f72006l.close();
                            }
                        }
                    } catch (IOException e19) {
                        a.W.h(e19);
                    }
                    throw th2;
                }
            }
        }

        @Override // nm.b, mm.k
        public int y(d dVar) throws IOException {
            int iY = super.y(dVar);
            if (iY < 0) {
                if (!x()) {
                    j();
                }
                if (s()) {
                    close();
                }
            }
            return iY;
        }
    }

    @Override // rm.a, rm.f
    public void j(k kVar, n nVar) throws IOException {
        ((RunnableC0746a) kVar).q(J() ? this.K : this.J);
        super.j(kVar, nVar);
    }

    public j Y0(k kVar) {
        return new e(this, kVar, b());
    }

    public ServerSocket Z0(String str, int i10, int i11) throws IOException {
        return str == null ? new ServerSocket(i10, i11) : new ServerSocket(i10, i11, InetAddress.getByName(str));
    }

    @Override // rm.f
    public int c() {
        return this.V;
    }

    @Override // rm.f
    public void close() throws IOException {
        ServerSocket serverSocket = this.T;
        if (serverSocket != null) {
            serverSocket.close();
        }
        this.T = null;
        this.V = -2;
    }

    @Override // rm.a, ym.b, ym.a
    public void d0() throws Exception {
        this.U.clear();
        super.d0();
    }

    @Override // rm.f
    public Object getConnection() {
        return this.T;
    }

    @Override // rm.f
    public void open() throws IOException {
        ServerSocket serverSocket = this.T;
        if (serverSocket == null || serverSocket.isClosed()) {
            this.T = Z0(L(), P0(), F0());
        }
        this.T.setReuseAddress(Q0());
        this.V = this.T.getLocalPort();
        if (this.V > 0) {
            return;
        }
        throw new IllegalStateException("port not allocated for " + this);
    }

    @Override // rm.a
    public void x0(int i10) throws InterruptedException, IOException {
        Socket socketAccept = this.T.accept();
        C0(socketAccept);
        new RunnableC0746a(socketAccept).a();
    }

    @Override // rm.a, ym.b, ym.a
    public void e0() throws Exception {
        super.e0();
        HashSet hashSet = new HashSet();
        synchronized (this.U) {
            hashSet.addAll(this.U);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((RunnableC0746a) ((k) it.next())).close();
        }
    }

    @Override // ym.b, ym.e
    public void z(Appendable appendable, String str) throws IOException {
        super.z(appendable, str);
        HashSet hashSet = new HashSet();
        synchronized (this.U) {
            hashSet.addAll(this.U);
        }
        ym.b.p0(appendable, str, hashSet);
    }
}
