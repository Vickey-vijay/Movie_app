package no;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.DatagramPacket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: MulticastReceiverImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class i implements po.f<h> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Logger f64900i = Logger.getLogger(po.f.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f64901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mo.a f64902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public po.g f64903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public po.d f64904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NetworkInterface f64905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InetSocketAddress f64906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MulticastSocket f64907h;

    @Override // po.f
    public synchronized void E(NetworkInterface networkInterface, mo.a aVar, po.g gVar, po.d dVar) throws InitializationException {
        this.f64902c = aVar;
        this.f64903d = gVar;
        this.f64904e = dVar;
        this.f64905f = networkInterface;
        try {
            f64900i.info("Creating wildcard socket (for receiving multicast datagrams) on port: " + this.f64901b.c());
            this.f64906g = new InetSocketAddress(this.f64901b.a(), this.f64901b.c());
            MulticastSocket multicastSocket = new MulticastSocket(this.f64901b.c());
            this.f64907h = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.f64907h.setReceiveBufferSize(32768);
            f64900i.info("Joining multicast group: " + this.f64906g + " on network interface: " + this.f64905f.getDisplayName());
            this.f64907h.joinGroup(this.f64906g, this.f64905f);
        } catch (Exception e10) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e10);
        }
    }

    @Override // po.f
    public synchronized void stop() {
        MulticastSocket multicastSocket = this.f64907h;
        if (multicastSocket != null && !multicastSocket.isClosed()) {
            try {
                f64900i.fine("Leaving multicast group");
                this.f64907h.leaveGroup(this.f64906g, this.f64905f);
            } catch (Exception e10) {
                f64900i.fine("Could not leave multicast group: " + e10);
            }
            this.f64907h.close();
        }
    }

    public h a() {
        return this.f64901b;
    }

    @Override // java.lang.Runnable
    public void run() {
        f64900i.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.f64907h.getLocalAddress());
        while (true) {
            try {
                int iB = a().b();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[iB], iB);
                this.f64907h.receive(datagramPacket);
                InetAddress inetAddressB = this.f64903d.b(this.f64905f, this.f64906g.getAddress() instanceof Inet6Address, datagramPacket.getAddress());
                f64900i.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + StringUtils.PROCESS_POSTFIX_DELIMITER + datagramPacket.getPort() + " on local interface: " + this.f64905f.getDisplayName() + " and address: " + inetAddressB.getHostAddress());
                this.f64902c.f(this.f64904e.b(inetAddressB, datagramPacket));
            } catch (SocketException unused) {
                f64900i.fine("Socket closed");
                try {
                    if (this.f64907h.isClosed()) {
                        return;
                    }
                    f64900i.fine("Closing multicast socket");
                    this.f64907h.close();
                    return;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (UnsupportedDataException e11) {
                f64900i.info("Could not read datagram: " + e11.getMessage());
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
        }
    }

    public i(h hVar) {
        this.f64901b = hVar;
    }
}
