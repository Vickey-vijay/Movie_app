package nm;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import zm.c;

/* JADX INFO: compiled from: SocketEndPoint.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f64856j = zm.b.a(a.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Socket f64857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InetSocketAddress f64858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InetSocketAddress f64859i;

    public a(Socket socket) throws IOException {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f64857g = socket;
        this.f64858h = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f64859i = (InetSocketAddress) socket.getRemoteSocketAddress();
        super.q(socket.getSoTimeout());
    }

    public void D() throws IOException {
        if (this.f64857g.isClosed()) {
            return;
        }
        if (!this.f64857g.isInputShutdown()) {
            this.f64857g.shutdownInput();
        }
        if (this.f64857g.isOutputShutdown()) {
            this.f64857g.close();
        }
    }

    public final void F() throws IOException {
        if (this.f64857g.isClosed()) {
            return;
        }
        if (!this.f64857g.isOutputShutdown()) {
            this.f64857g.shutdownOutput();
        }
        if (this.f64857g.isInputShutdown()) {
            this.f64857g.close();
        }
    }

    @Override // nm.b, mm.k
    public int c() {
        InetSocketAddress inetSocketAddress = this.f64858h;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // nm.b, mm.k
    public void close() throws IOException {
        this.f64857g.close();
        this.f64860b = null;
        this.f64861c = null;
    }

    @Override // nm.b, mm.k
    public String e() {
        InetAddress address;
        InetSocketAddress inetSocketAddress = this.f64859i;
        if (inetSocketAddress == null || (address = inetSocketAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    @Override // nm.b, mm.k
    public String g() {
        InetSocketAddress inetSocketAddress = this.f64858h;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f64858h.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f64858h.getAddress().getHostAddress();
    }

    @Override // nm.b, mm.k
    public void j() throws IOException {
        if (this.f64857g instanceof SSLSocket) {
            super.j();
        } else {
            D();
        }
    }

    @Override // nm.b, mm.k
    public void l() throws IOException {
        if (this.f64857g instanceof SSLSocket) {
            super.l();
        } else {
            F();
        }
    }

    @Override // nm.b, mm.k
    public String r() {
        InetSocketAddress inetSocketAddress = this.f64858h;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f64858h.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f64858h.getAddress().getCanonicalHostName();
    }

    @Override // nm.b, mm.k
    public boolean s() {
        Socket socket = this.f64857g;
        if (socket instanceof SSLSocket) {
            return super.s();
        }
        return socket.isClosed() || this.f64857g.isOutputShutdown();
    }

    public String toString() {
        return this.f64858h + " <--> " + this.f64859i;
    }

    @Override // nm.b, mm.k
    public boolean x() {
        Socket socket = this.f64857g;
        if (socket instanceof SSLSocket) {
            return super.x();
        }
        return socket.isClosed() || this.f64857g.isInputShutdown();
    }

    @Override // nm.b
    public void B() throws IOException {
        try {
            if (!x()) {
                j();
            }
        } catch (IOException e10) {
            f64856j.h(e10);
            this.f64857g.close();
        }
    }

    @Override // nm.b, mm.k
    public boolean isOpen() {
        Socket socket;
        if (super.isOpen() && (socket = this.f64857g) != null && !socket.isClosed()) {
            return true;
        }
        return false;
    }

    @Override // nm.b, mm.k
    public void q(int i10) throws IOException {
        int i11;
        if (i10 != d()) {
            Socket socket = this.f64857g;
            if (i10 > 0) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            socket.setSoTimeout(i11);
        }
        super.q(i10);
    }

    public a(Socket socket, int i10) throws IOException {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f64857g = socket;
        this.f64858h = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f64859i = (InetSocketAddress) socket.getRemoteSocketAddress();
        socket.setSoTimeout(i10 > 0 ? i10 : 0);
        super.q(i10);
    }
}
