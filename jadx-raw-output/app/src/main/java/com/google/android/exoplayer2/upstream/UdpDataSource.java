package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import e5.h;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes2.dex */
public final class UdpDataSource extends e5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f20086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f20087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Uri f20088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public DatagramSocket f20089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public MulticastSocket f20090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public InetAddress f20091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public InetSocketAddress f20092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20094n;

    public UdpDataSource() {
        this(2000);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f20088h = null;
        MulticastSocket multicastSocket = this.f20090j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f20091k);
            } catch (IOException unused) {
            }
            this.f20090j = null;
        }
        DatagramSocket datagramSocket = this.f20089i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20089i = null;
        }
        this.f20091k = null;
        this.f20092l = null;
        this.f20094n = 0;
        if (this.f20093m) {
            this.f20093m = false;
            d();
        }
    }

    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws UdpDataSourceException {
        Uri uri = hVar.f52374a;
        this.f20088h = uri;
        String host = uri.getHost();
        int port = this.f20088h.getPort();
        e(hVar);
        try {
            this.f20091k = InetAddress.getByName(host);
            this.f20092l = new InetSocketAddress(this.f20091k, port);
            if (this.f20091k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f20092l);
                this.f20090j = multicastSocket;
                multicastSocket.joinGroup(this.f20091k);
                this.f20089i = this.f20090j;
            } else {
                this.f20089i = new DatagramSocket(this.f20092l);
            }
            try {
                this.f20089i.setSoTimeout(this.f20085e);
                this.f20093m = true;
                f(hVar);
                return -1L;
            } catch (SocketException e10) {
                throw new UdpDataSourceException(e10);
            }
        } catch (IOException e11) {
            throw new UdpDataSourceException(e11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f20088h;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f20094n == 0) {
            try {
                this.f20089i.receive(this.f20087g);
                int length = this.f20087g.getLength();
                this.f20094n = length;
                c(length);
            } catch (IOException e10) {
                throw new UdpDataSourceException(e10);
            }
        }
        int length2 = this.f20087g.getLength();
        int i12 = this.f20094n;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f20086f, length2 - i12, bArr, i10, iMin);
        this.f20094n -= iMin;
        return iMin;
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f20085e = i11;
        byte[] bArr = new byte[i10];
        this.f20086f = bArr;
        this.f20087g = new DatagramPacket(bArr, 0, i10);
    }
}
