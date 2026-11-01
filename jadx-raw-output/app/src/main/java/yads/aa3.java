package yads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class aa3 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f75445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f75446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f75447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f75448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f75449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f75450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f75451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f75452m;

    public aa3(int i10) {
        super(true);
        this.f75444e = 8000;
        byte[] bArr = new byte[2000];
        this.f75445f = bArr;
        this.f75446g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // yads.p30
    public final void close() {
        this.f75447h = null;
        MulticastSocket multicastSocket = this.f75449j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f75450k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f75449j = null;
        }
        DatagramSocket datagramSocket = this.f75448i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f75448i = null;
        }
        this.f75450k = null;
        this.f75452m = 0;
        if (this.f75451l) {
            this.f75451l = false;
            d();
        }
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws z93 {
        Uri uri = u30Var.f83341a;
        this.f75447h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f75447h.getPort();
        e();
        try {
            this.f75450k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f75450k, port);
            if (this.f75450k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f75449j = multicastSocket;
                multicastSocket.joinGroup(this.f75450k);
                this.f75448i = this.f75449j;
            } else {
                this.f75448i = new DatagramSocket(inetSocketAddress);
            }
            this.f75448i.setSoTimeout(this.f75444e);
            this.f75451l = true;
            b(u30Var);
            return -1L;
        } catch (IOException e10) {
            throw new z93(e10, 2001);
        } catch (SecurityException e11) {
            throw new z93(e11, 2006);
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f75447h;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws z93 {
        if (i11 == 0) {
            return 0;
        }
        if (this.f75452m == 0) {
            try {
                DatagramSocket datagramSocket = this.f75448i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f75446g);
                int length = this.f75446g.getLength();
                this.f75452m = length;
                c(length);
            } catch (SocketTimeoutException e10) {
                throw new z93(e10, 2002);
            } catch (IOException e11) {
                throw new z93(e11, 2001);
            }
        }
        int length2 = this.f75446g.getLength();
        int i12 = this.f75452m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f75445f, length2 - i12, bArr, i10, iMin);
        this.f75452m -= iMin;
        return iMin;
    }
}
