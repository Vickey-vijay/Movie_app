package no;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: DatagramIOImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class d implements po.c<c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Logger f64887g = Logger.getLogger(po.c.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f64888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mo.a f64889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public po.d f64890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InetSocketAddress f64891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MulticastSocket f64892f;

    @Override // po.c
    public synchronized void A(InetAddress inetAddress, mo.a aVar, po.d dVar) throws InitializationException {
        this.f64889c = aVar;
        this.f64890d = dVar;
        try {
            f64887g.info("Creating bound socket (for datagram input/output) on: " + inetAddress);
            this.f64891e = new InetSocketAddress(inetAddress, 0);
            MulticastSocket multicastSocket = new MulticastSocket(this.f64891e);
            this.f64892f = multicastSocket;
            multicastSocket.setTimeToLive(this.f64888b.b());
            this.f64892f.setReceiveBufferSize(262144);
        } catch (Exception e10) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e10);
        }
    }

    @Override // po.c
    public synchronized void b(org.fourthline.cling.model.message.a aVar) {
        Logger logger = f64887g;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            f64887g.fine("Sending message from address: " + this.f64891e);
        }
        DatagramPacket datagramPacketA = this.f64890d.a(aVar);
        if (f64887g.isLoggable(level)) {
            f64887g.fine("Sending UDP datagram packet to: " + aVar.u() + StringUtils.PROCESS_POSTFIX_DELIMITER + aVar.v());
        }
        c(datagramPacketA);
    }

    public synchronized void c(DatagramPacket datagramPacket) {
        try {
            if (f64887g.isLoggable(Level.FINE)) {
                f64887g.fine("Sending message from address: " + this.f64891e);
            }
            try {
                this.f64892f.send(datagramPacket);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (SocketException unused) {
                f64887g.fine("Socket closed, aborting datagram send to: " + datagramPacket.getAddress());
            } catch (Exception e11) {
                f64887g.log(Level.SEVERE, "Exception sending datagram to: " + datagramPacket.getAddress() + ": " + e11, (Throwable) e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // po.c
    public synchronized void stop() {
        MulticastSocket multicastSocket = this.f64892f;
        if (multicastSocket != null && !multicastSocket.isClosed()) {
            this.f64892f.close();
        }
    }

    public c a() {
        return this.f64888b;
    }

    @Override // java.lang.Runnable
    public void run() {
        f64887g.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.f64892f.getLocalAddress());
        while (true) {
            try {
                int iA = a().a();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[iA], iA);
                this.f64892f.receive(datagramPacket);
                f64887g.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + StringUtils.PROCESS_POSTFIX_DELIMITER + datagramPacket.getPort() + " on: " + this.f64891e);
                this.f64889c.f(this.f64890d.b(this.f64891e.getAddress(), datagramPacket));
            } catch (SocketException unused) {
                f64887g.fine("Socket closed");
                try {
                    if (this.f64892f.isClosed()) {
                        return;
                    }
                    f64887g.fine("Closing unicast socket");
                    this.f64892f.close();
                    return;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (UnsupportedDataException e11) {
                f64887g.info("Could not read datagram: " + e11.getMessage());
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
        }
    }

    public d(c cVar) {
        this.f64888b = cVar;
    }
}
