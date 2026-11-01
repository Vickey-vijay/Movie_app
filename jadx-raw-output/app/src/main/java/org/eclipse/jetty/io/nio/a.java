package org.eclipse.jetty.io.nio;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import mm.d;
import mm.k;
import om.e;
import zm.c;

/* JADX INFO: compiled from: ChannelEndPoint.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f65619j = zm.b.a(a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteChannel f65620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer[] f65621c = new ByteBuffer[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Socket f65622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InetSocketAddress f65623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InetSocketAddress f65624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f65625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f65626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f65627i;

    public int b(d dVar, ByteBuffer byteBuffer, d dVar2, ByteBuffer byteBuffer2) throws IOException {
        int iWrite;
        synchronized (this) {
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.position(dVar.getIndex());
            byteBufferAsReadOnlyBuffer.limit(dVar.T());
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBuffer2.asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer2.position(dVar2.getIndex());
            byteBufferAsReadOnlyBuffer2.limit(dVar2.T());
            ByteBuffer[] byteBufferArr = this.f65621c;
            byteBufferArr[0] = byteBufferAsReadOnlyBuffer;
            byteBufferArr[1] = byteBufferAsReadOnlyBuffer2;
            iWrite = (int) ((GatheringByteChannel) this.f65620b).write(byteBufferArr);
            int length = dVar.length();
            if (iWrite > length) {
                dVar.clear();
                dVar2.skip(iWrite - length);
            } else if (iWrite > 0) {
                dVar.skip(iWrite);
            }
        }
        return iWrite;
    }

    @Override // mm.k
    public void flush() throws IOException {
    }

    @Override // mm.k
    public boolean h(long j10) throws IOException {
        return true;
    }

    @Override // mm.k
    public int i(d dVar, d dVar2, d dVar3) throws IOException {
        d dVarBuffer = dVar == null ? null : dVar.buffer();
        d dVarBuffer2 = dVar2 != null ? dVar2.buffer() : null;
        if ((this.f65620b instanceof GatheringByteChannel) && dVar != null && dVar.length() != 0 && (dVarBuffer instanceof om.d) && dVar2 != null && dVar2.length() != 0 && (dVarBuffer2 instanceof om.d)) {
            return b(dVar, ((om.d) dVarBuffer).Z(), dVar2, ((om.d) dVarBuffer2).Z());
        }
        int iU = (dVar == null || dVar.length() <= 0) ? 0 : u(dVar);
        if ((dVar == null || dVar.length() == 0) && dVar2 != null && dVar2.length() > 0) {
            iU += u(dVar2);
        }
        return ((dVar == null || dVar.length() == 0) && (dVar2 == null || dVar2.length() == 0) && dVar3 != null && dVar3.length() > 0) ? u(dVar3) + iU : iU;
    }

    @Override // mm.k
    public boolean k(long j10) throws IOException {
        return true;
    }

    public final void A() throws IOException {
        Socket socket;
        f65619j.i("oshut {}", this);
        this.f65627i = true;
        if (!this.f65620b.isOpen() || (socket = this.f65622d) == null) {
            return;
        }
        try {
            if (!socket.isOutputShutdown()) {
                this.f65622d.shutdownOutput();
            }
        } catch (SocketException e10) {
            c cVar = f65619j;
            cVar.i(e10.toString(), new Object[0]);
            cVar.h(e10);
        } finally {
            if (this.f65626h) {
                close();
            }
        }
    }

    @Override // mm.k
    public int c() {
        if (this.f65622d == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f65623e;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // mm.k
    public void close() throws IOException {
        f65619j.i("close {}", this);
        this.f65620b.close();
    }

    @Override // mm.k
    public int d() {
        return this.f65625g;
    }

    @Override // mm.k
    public String e() {
        InetSocketAddress inetSocketAddress;
        if (this.f65622d == null || (inetSocketAddress = this.f65624f) == null) {
            return null;
        }
        return inetSocketAddress.getAddress().getHostAddress();
    }

    @Override // mm.k
    public boolean f() {
        Closeable closeable = this.f65620b;
        return !(closeable instanceof SelectableChannel) || ((SelectableChannel) closeable).isBlocking();
    }

    @Override // mm.k
    public String g() {
        if (this.f65622d == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f65623e;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f65623e.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f65623e.getAddress().getHostAddress();
    }

    @Override // mm.k
    public boolean isOpen() {
        return this.f65620b.isOpen();
    }

    @Override // mm.k
    public int p() {
        if (this.f65622d == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f65624f;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // mm.k
    public void q(int i10) throws IOException {
        if (this.f65622d != null && i10 != this.f65625g) {
            this.f65622d.setSoTimeout(i10 > 0 ? i10 : 0);
        }
        this.f65625g = i10;
    }

    @Override // mm.k
    public String r() {
        if (this.f65622d == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f65623e;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f65623e.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f65623e.getAddress().getCanonicalHostName();
    }

    @Override // mm.k
    public boolean s() {
        Socket socket;
        return this.f65627i || !this.f65620b.isOpen() || ((socket = this.f65622d) != null && socket.isOutputShutdown());
    }

    public ByteChannel t() {
        return this.f65620b;
    }

    @Override // mm.k
    public boolean x() {
        Socket socket;
        return this.f65626h || !this.f65620b.isOpen() || ((socket = this.f65622d) != null && socket.isInputShutdown());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r3 >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (isOpen() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (x() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (s() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r5.f65620b.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r6 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        org.eclipse.jetty.io.nio.a.f65619j.d("Exception while filling", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r5.f65620b.isOpen() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r5.f65620b.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        org.eclipse.jetty.io.nio.a.f65619j.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        if (r2 <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return -1;
     */
    @Override // mm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int y(mm.d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r5.f65626h
            r1 = -1
            if (r0 == 0) goto L6
            return r1
        L6:
            mm.d r0 = r6.buffer()
            boolean r2 = r0 instanceof om.d
            if (r2 == 0) goto L82
            om.d r0 = (om.d) r0
            java.nio.ByteBuffer r0 = r0.Z()
            r2 = 0
            monitor-enter(r0)     // Catch: java.io.IOException -> L62
            int r3 = r6.T()     // Catch: java.lang.Throwable -> L53
            r0.position(r3)     // Catch: java.lang.Throwable -> L53
            java.nio.channels.ByteChannel r3 = r5.f65620b     // Catch: java.lang.Throwable -> L53
            int r3 = r3.read(r0)     // Catch: java.lang.Throwable -> L53
            int r4 = r0.position()     // Catch: java.lang.Throwable -> L50
            r6.W(r4)     // Catch: java.lang.Throwable -> L50
            r0.position(r2)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            if (r3 >= 0) goto L4e
            boolean r6 = r5.isOpen()     // Catch: java.io.IOException -> L4b
            if (r6 == 0) goto L4e
            boolean r6 = r5.x()     // Catch: java.io.IOException -> L4b
            if (r6 != 0) goto L3f
            r5.j()     // Catch: java.io.IOException -> L4b
        L3f:
            boolean r6 = r5.s()     // Catch: java.io.IOException -> L4b
            if (r6 == 0) goto L4e
            java.nio.channels.ByteChannel r6 = r5.f65620b     // Catch: java.io.IOException -> L4b
            r6.close()     // Catch: java.io.IOException -> L4b
            goto L4e
        L4b:
            r6 = move-exception
            r2 = r3
            goto L63
        L4e:
            r1 = r3
            goto L80
        L50:
            r6 = move-exception
            r2 = r3
            goto L60
        L53:
            r3 = move-exception
            int r4 = r0.position()     // Catch: java.lang.Throwable -> L5f
            r6.W(r4)     // Catch: java.lang.Throwable -> L5f
            r0.position(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L5f:
            r6 = move-exception
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r6     // Catch: java.io.IOException -> L62
        L62:
            r6 = move-exception
        L63:
            zm.c r0 = org.eclipse.jetty.io.nio.a.f65619j
            java.lang.String r3 = "Exception while filling"
            r0.d(r3, r6)
            java.nio.channels.ByteChannel r0 = r5.f65620b     // Catch: java.lang.Exception -> L78
            boolean r0 = r0.isOpen()     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L7e
            java.nio.channels.ByteChannel r0 = r5.f65620b     // Catch: java.lang.Exception -> L78
            r0.close()     // Catch: java.lang.Exception -> L78
            goto L7e
        L78:
            r0 = move-exception
            zm.c r3 = org.eclipse.jetty.io.nio.a.f65619j
            r3.h(r0)
        L7e:
            if (r2 > 0) goto L81
        L80:
            return r1
        L81:
            throw r6
        L82:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Not Implemented"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.io.nio.a.y(mm.d):int");
    }

    public final void z() throws IOException {
        Socket socket;
        f65619j.i("ishut {}", this);
        this.f65626h = true;
        if (!this.f65620b.isOpen() || (socket = this.f65622d) == null) {
            return;
        }
        try {
            if (!socket.isInputShutdown()) {
                this.f65622d.shutdownInput();
            }
        } catch (SocketException e10) {
            c cVar = f65619j;
            cVar.i(e10.toString(), new Object[0]);
            cVar.h(e10);
        } finally {
            if (this.f65627i) {
                close();
            }
        }
    }

    public a(ByteChannel byteChannel, int i10) throws IOException {
        Socket socket;
        this.f65620b = byteChannel;
        this.f65625g = i10;
        if (byteChannel instanceof SocketChannel) {
            socket = ((SocketChannel) byteChannel).socket();
        } else {
            socket = null;
        }
        this.f65622d = socket;
        if (socket != null) {
            this.f65623e = (InetSocketAddress) socket.getLocalSocketAddress();
            this.f65624f = (InetSocketAddress) socket.getRemoteSocketAddress();
            socket.setSoTimeout(this.f65625g);
        } else {
            this.f65624f = null;
            this.f65623e = null;
        }
    }

    @Override // mm.k
    public void j() throws IOException {
        z();
    }

    @Override // mm.k
    public void l() throws IOException {
        A();
    }

    @Override // mm.k
    public int u(d dVar) throws IOException {
        int iWrite;
        d dVarBuffer = dVar.buffer();
        if (dVarBuffer instanceof om.d) {
            ByteBuffer byteBufferAsReadOnlyBuffer = ((om.d) dVarBuffer).Z().asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.position(dVar.getIndex());
            byteBufferAsReadOnlyBuffer.limit(dVar.T());
            iWrite = this.f65620b.write(byteBufferAsReadOnlyBuffer);
            if (iWrite > 0) {
                dVar.skip(iWrite);
            }
        } else if (dVarBuffer instanceof e) {
            iWrite = ((e) dVarBuffer).d(this.f65620b, dVar.getIndex(), dVar.length());
            if (iWrite > 0) {
                dVar.skip(iWrite);
            }
        } else if (dVar.V() != null) {
            iWrite = this.f65620b.write(ByteBuffer.wrap(dVar.V(), dVar.getIndex(), dVar.length()));
            if (iWrite > 0) {
                dVar.skip(iWrite);
            }
        } else {
            throw new IOException("Not Implemented");
        }
        return iWrite;
    }
}
