package org.eclipse.jetty.io.nio;

import en.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Locale;
import mm.c;
import mm.d;
import mm.i;
import mm.j;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: loaded from: classes7.dex */
public class SelectChannelEndPoint extends org.eclipse.jetty.io.nio.a implements c, i {
    public static final zm.c B = zm.b.b("org.eclipse.jetty.io.nio");
    public boolean A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f65600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final org.eclipse.jetty.io.nio.b.d f65601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final org.eclipse.jetty.io.nio.b f65602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SelectionKey f65603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f65604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f65605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile om.a f65606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f65607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f65609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f65610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f65611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f65612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile long f65613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f65614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f65615z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SelectChannelEndPoint.this.E();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f65617b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                SelectChannelEndPoint.this.H(this.f65617b);
            } finally {
                SelectChannelEndPoint.this.J(true);
            }
        }

        public b(long j10) {
            this.f65617b = j10;
        }
    }

    public void C() {
        synchronized (this) {
            if (!t().isOpen()) {
                SelectionKey selectionKey = this.f65603n;
                if (selectionKey != null && selectionKey.isValid()) {
                    this.f65603n.cancel();
                }
                if (this.f65612w) {
                    this.f65612w = false;
                    this.f65601l.g(this);
                }
                this.f65603n = null;
            } else if (this.f65605p > 0) {
                SelectionKey selectionKey2 = this.f65603n;
                if (selectionKey2 != null && selectionKey2.isValid()) {
                    this.f65603n.interestOps(this.f65605p);
                } else if (((SelectableChannel) t()).isRegistered()) {
                    L();
                } else {
                    try {
                        this.f65603n = ((SelectableChannel) t()).register(this.f65601l.l(), this.f65605p, this);
                    } catch (Exception e10) {
                        B.h(e10);
                        SelectionKey selectionKey3 = this.f65603n;
                        if (selectionKey3 != null && selectionKey3.isValid()) {
                            this.f65603n.cancel();
                        }
                        if (this.f65612w) {
                            this.f65601l.g(this);
                        }
                        this.f65612w = false;
                        this.f65603n = null;
                    }
                }
            } else {
                SelectionKey selectionKey4 = this.f65603n;
                if (selectionKey4 == null || !selectionKey4.isValid()) {
                    this.f65603n = null;
                } else {
                    this.f65603n.interestOps(0);
                }
            }
        }
    }

    public void H(long j10) {
        try {
            synchronized (this) {
                this.f65608s = true;
            }
            this.f65606q.a(j10);
            synchronized (this) {
                this.f65608s = false;
                if (this.f65607r == -1) {
                    a();
                }
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.f65608s = false;
                if (this.f65607r == -1) {
                    a();
                }
                throw th2;
            }
        }
    }

    public void I() {
        synchronized (this) {
            SelectionKey selectionKey = this.f65603n;
            if (selectionKey != null && selectionKey.isValid()) {
                boolean z10 = this.f65610u;
                if (!z10 && !this.f65611v) {
                    if ((this.f65603n.readyOps() & 4) == 4 && (this.f65603n.interestOps() & 4) == 4) {
                        int iInterestOps = this.f65603n.interestOps() & (-5);
                        this.f65605p = iInterestOps;
                        this.f65603n.interestOps(iInterestOps);
                        this.f65609t = true;
                    }
                    if (this.f65607r >= 1) {
                        this.f65603n.interestOps(0);
                    } else {
                        a();
                        if (this.f65607r >= 1 && !this.f65601l.j().A0()) {
                            this.f65603n.interestOps(0);
                        }
                    }
                    return;
                }
                if (z10 && this.f65603n.isReadable()) {
                    this.f65610u = false;
                }
                if (this.f65611v && this.f65603n.isWritable()) {
                    this.f65611v = false;
                }
                notifyAll();
                this.f65603n.interestOps(0);
                if (this.f65607r < 1) {
                    L();
                }
                return;
            }
            this.f65610u = false;
            this.f65611v = false;
            notifyAll();
        }
    }

    public boolean K() {
        synchronized (this) {
            if (this.f65607r == 2) {
                this.f65607r = 1;
                return false;
            }
            this.f65607r = 0;
            L();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x006e  */
    public final void L() {
        boolean z10;
        synchronized (this) {
            int iInterestOps = -1;
            if (t().isOpen()) {
                this.f65605p = ((this.f65622d.isInputShutdown() || !(this.f65610u || (this.f65607r < 1 && !this.f65606q.b()))) ? 0 : 1) | ((this.f65622d.isOutputShutdown() || !(this.f65611v || (this.f65607r < 1 && !this.f65609t))) ? 0 : 4);
                try {
                    SelectionKey selectionKey = this.f65603n;
                    if (selectionKey != null && selectionKey.isValid()) {
                        iInterestOps = this.f65603n.interestOps();
                    }
                } catch (Exception e10) {
                    this.f65603n = null;
                    B.h(e10);
                }
                if (this.f65605p != iInterestOps) {
                }
            } else {
                z10 = this.f65605p != iInterestOps;
            }
            throw th;
        }
        if (z10) {
            this.f65601l.c(this);
            this.f65601l.p();
        }
    }

    @Override // mm.c
    public void a() {
        synchronized (this) {
            if (this.f65607r <= 0) {
                if (this.f65608s) {
                    this.f65607r = -1;
                } else {
                    this.f65607r = 1;
                    if (!this.f65602m.Z(this.f65604o)) {
                        this.f65607r = -1;
                        B.g("Dispatched Failed! " + this + " to " + this.f65602m, new Object[0]);
                        L();
                    }
                }
            }
        }
    }

    @Override // org.eclipse.jetty.io.nio.a, mm.k
    public boolean h(long j10) throws IOException {
        org.eclipse.jetty.io.nio.b.d dVar;
        synchronized (this) {
            if (s()) {
                throw new EofException();
            }
            long jK = this.f65601l.k();
            long j11 = jK + j10;
            boolean zF = F();
            J(true);
            try {
                this.f65611v = true;
                while (this.f65611v && !s()) {
                    try {
                        try {
                            L();
                            wait(j10 > 0 ? j11 - jK : 10000L);
                            dVar = this.f65601l;
                        } catch (InterruptedException e10) {
                            B.e(e10);
                            if (this.f65615z) {
                                throw new InterruptedIOException(e10) { // from class: org.eclipse.jetty.io.nio.SelectChannelEndPoint.4
                                    public final /* synthetic */ InterruptedException val$e;

                                    {
                                        this.val$e = e10;
                                        initCause(e10);
                                    }
                                };
                            }
                            dVar = this.f65601l;
                        }
                        jK = dVar.k();
                        if (this.f65611v && j10 > 0 && jK >= j11) {
                            this.f65611v = false;
                            J(zF);
                            return false;
                        }
                    } catch (Throwable th2) {
                        this.f65601l.k();
                        throw th2;
                    }
                }
                this.f65611v = false;
                J(zF);
                return true;
            } catch (Throwable th3) {
                this.f65611v = false;
                J(zF);
                throw th3;
            }
        }
    }

    @Override // org.eclipse.jetty.io.nio.a, mm.k
    public boolean k(long j10) throws IOException {
        org.eclipse.jetty.io.nio.b.d dVar;
        synchronized (this) {
            if (x()) {
                throw new EofException();
            }
            long jK = this.f65601l.k();
            long j11 = jK + j10;
            boolean zF = F();
            J(true);
            try {
                this.f65610u = true;
                while (!x() && this.f65610u) {
                    try {
                        try {
                            L();
                            wait(j10 > 0 ? j11 - jK : 10000L);
                            dVar = this.f65601l;
                        } catch (InterruptedException e10) {
                            B.e(e10);
                            if (this.f65615z) {
                                throw new InterruptedIOException(e10) { // from class: org.eclipse.jetty.io.nio.SelectChannelEndPoint.3
                                    public final /* synthetic */ InterruptedException val$e;

                                    {
                                        this.val$e = e10;
                                        initCause(e10);
                                    }
                                };
                            }
                            dVar = this.f65601l;
                        }
                        jK = dVar.k();
                        if (this.f65610u && j10 > 0 && jK >= j11) {
                            this.f65610u = false;
                            J(zF);
                            return false;
                        }
                    } catch (Throwable th2) {
                        this.f65601l.k();
                        throw th2;
                    }
                }
                this.f65610u = false;
                J(zF);
                return true;
            } catch (Throwable th3) {
                this.f65610u = false;
                J(zF);
                throw th3;
            }
        }
    }

    @Override // mm.c
    public boolean m() {
        return false;
    }

    @Override // mm.c
    public void v() {
        synchronized (this) {
            int i10 = this.f65607r;
            if (i10 == -1 || i10 == 0) {
                a();
            } else if (i10 == 1 || i10 == 2) {
                this.f65607r = 2;
            }
        }
    }

    public org.eclipse.jetty.io.nio.b.d D() {
        return this.f65601l;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:164:0x01b5 A[LOOP:2: B:162:0x01b2->B:164:0x01b5, LOOP_END] */
    public void E() {
        boolean zK;
        boolean z10 = true;
        while (z10) {
            while (true) {
                try {
                    try {
                        try {
                            om.a aVar = (om.a) this.f65606q.e();
                            if (aVar == this.f65606q) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    if (z10) {
                                        zK = K();
                                        while (!zK) {
                                            B.g("SCEP.run() finally DISPATCHED", new Object[0]);
                                            zK = K();
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            B.i("{} replaced {}", aVar, this.f65606q);
                            om.a aVar2 = this.f65606q;
                            this.f65606q = aVar;
                            this.f65602m.x0(this, aVar2);
                        } catch (IOException e10) {
                            B.g(e10.toString(), new Object[0]);
                            try {
                                close();
                            } catch (IOException e11) {
                                B.h(e11);
                            }
                            if (!this.A && x() && isOpen()) {
                                this.A = true;
                                try {
                                    this.f65606q.c();
                                } catch (Throwable th3) {
                                    try {
                                        B.c("onInputShutdown failed", th3);
                                        try {
                                            close();
                                        } catch (IOException e12) {
                                            B.h(e12);
                                        }
                                    } catch (Throwable th4) {
                                        L();
                                        throw th4;
                                    }
                                }
                                L();
                            }
                        }
                    } catch (ClosedChannelException e13) {
                        B.h(e13);
                        if (!this.A && x() && isOpen()) {
                            this.A = true;
                            try {
                                this.f65606q.c();
                            } catch (Throwable th5) {
                                try {
                                    B.c("onInputShutdown failed", th5);
                                    try {
                                        close();
                                    } catch (IOException e14) {
                                        B.h(e14);
                                    }
                                } catch (Throwable th6) {
                                    L();
                                    throw th6;
                                }
                            }
                            L();
                        }
                    }
                } catch (EofException e15) {
                    B.d("EOF", e15);
                    try {
                        close();
                    } catch (IOException e16) {
                        B.h(e16);
                    }
                    if (!this.A && x() && isOpen()) {
                        this.A = true;
                        try {
                            this.f65606q.c();
                        } catch (Throwable th7) {
                            try {
                                B.c("onInputShutdown failed", th7);
                                try {
                                    close();
                                } catch (IOException e17) {
                                    B.h(e17);
                                }
                            } catch (Throwable th8) {
                                L();
                                throw th8;
                            }
                        }
                        L();
                    }
                } catch (Throwable th9) {
                    try {
                        B.c("handle failed", th9);
                        try {
                            close();
                        } catch (IOException e18) {
                            B.h(e18);
                        }
                        if (!this.A && x() && isOpen()) {
                            this.A = true;
                            try {
                                this.f65606q.c();
                            } catch (Throwable th10) {
                                try {
                                    B.c("onInputShutdown failed", th10);
                                    try {
                                        close();
                                    } catch (IOException e19) {
                                        B.h(e19);
                                    }
                                } catch (Throwable th11) {
                                    L();
                                    throw th11;
                                }
                            }
                            L();
                        }
                    } catch (Throwable th12) {
                        if (!this.A && x() && isOpen()) {
                            this.A = true;
                            try {
                                this.f65606q.c();
                            } catch (Throwable th13) {
                                try {
                                    B.c("onInputShutdown failed", th13);
                                    try {
                                        close();
                                    } catch (IOException e20) {
                                        B.h(e20);
                                    }
                                } catch (Throwable th14) {
                                    L();
                                    throw th14;
                                }
                            }
                            L();
                        }
                        if (!K()) {
                        }
                        throw th12;
                    }
                }
                if (z10) {
                    zK = K();
                    while (!zK) {
                        B.g("SCEP.run() finally DISPATCHED", new Object[0]);
                        zK = K();
                    }
                }
                throw th2;
            }
            if (!this.A && x() && isOpen()) {
                this.A = true;
                try {
                    this.f65606q.c();
                } catch (Throwable th15) {
                    try {
                        B.c("onInputShutdown failed", th15);
                        try {
                            close();
                        } catch (IOException e21) {
                            B.h(e21);
                        }
                    } catch (Throwable th16) {
                        L();
                        throw th16;
                    }
                }
                L();
            }
            z10 = !K();
        }
        if (z10) {
            boolean zK2 = K();
            while (!zK2) {
                B.g("SCEP.run() finally DISPATCHED", new Object[0]);
                zK2 = K();
            }
        }
    }

    public boolean F() {
        return this.f65614y;
    }

    public void J(boolean z10) {
        if (!z10) {
            this.f65614y = false;
        } else {
            this.f65613x = System.currentTimeMillis();
            this.f65614y = true;
        }
    }

    @Override // org.eclipse.jetty.io.nio.a, mm.k
    public void close() throws IOException {
        if (this.f65600k) {
            try {
                SelectionKey selectionKey = this.f65603n;
                if (selectionKey != null) {
                    selectionKey.cancel();
                }
            } catch (Throwable th2) {
                B.h(th2);
            }
        }
        try {
            try {
                super.close();
            } finally {
                L();
            }
        } catch (IOException e10) {
            B.h(e10);
        }
    }

    @Override // mm.i
    public j getConnection() {
        return this.f65606q;
    }

    @Override // mm.i
    public void o(j jVar) {
        om.a aVar = this.f65606q;
        this.f65606q = (om.a) jVar;
        if (aVar == null || aVar == this.f65606q) {
            return;
        }
        this.f65602m.x0(this, aVar);
    }

    @Override // org.eclipse.jetty.io.nio.a, mm.k
    public void q(int i10) throws IOException {
        this.f65625g = i10;
    }

    public String toString() {
        SelectionKey selectionKey = this.f65603n;
        String str = "";
        if (selectionKey == null) {
            str = "-";
        } else if (selectionKey.isValid()) {
            if (selectionKey.isReadable()) {
                str = "r";
            }
            if (selectionKey.isWritable()) {
                str = str + "w";
            }
        } else {
            str = "!";
        }
        return String.format("SCEP@%x{l(%s)<->r(%s),s=%d,open=%b,ishut=%b,oshut=%b,rb=%b,wb=%b,w=%b,i=%d%s}-{%s}", Integer.valueOf(hashCode()), this.f65622d.getRemoteSocketAddress(), this.f65622d.getLocalSocketAddress(), Integer.valueOf(this.f65607r), Boolean.valueOf(isOpen()), Boolean.valueOf(x()), Boolean.valueOf(s()), Boolean.valueOf(this.f65610u), Boolean.valueOf(this.f65611v), Boolean.valueOf(this.f65609t), Integer.valueOf(this.f65605p), str, this.f65606q);
    }

    public SelectChannelEndPoint(SocketChannel socketChannel, org.eclipse.jetty.io.nio.b.d dVar, SelectionKey selectionKey, int i10) throws IOException {
        super(socketChannel, i10);
        this.f65600k = System.getProperty("os.name").toLowerCase(Locale.ENGLISH).contains("win");
        this.f65604o = new a();
        this.f65609t = true;
        this.f65602m = dVar.j();
        this.f65601l = dVar;
        this.f65607r = 0;
        this.f65608s = false;
        this.f65612w = true;
        this.f65603n = selectionKey;
        J(true);
    }

    public void B(long j10) {
        if (F() && this.f65625g > 0) {
            long j11 = j10 - this.f65613x;
            if (j11 > this.f65625g) {
                J(false);
                this.f65602m.Z(new b(j11));
            }
        }
    }

    public void G() {
        this.f65613x = System.currentTimeMillis();
    }

    @Override // org.eclipse.jetty.io.nio.a, mm.k
    public int i(d dVar, d dVar2, d dVar3) throws IOException {
        int i10 = super.i(dVar, dVar2, dVar3);
        if (i10 == 0 && ((dVar != null && dVar.hasContent()) || ((dVar2 != null && dVar2.hasContent()) || (dVar3 != null && dVar3.hasContent())))) {
            synchronized (this) {
                this.f65609t = false;
                if (this.f65607r < 1) {
                    L();
                }
            }
        } else if (i10 > 0) {
            this.f65609t = true;
            G();
        }
        return i10;
    }

    @Override // mm.c
    public void n(e.a aVar, long j10) {
        D().n(aVar, j10);
    }

    @Override // org.eclipse.jetty.io.nio.a, mm.k
    public int u(d dVar) throws IOException {
        int iU = super.u(dVar);
        if (iU == 0 && dVar != null && dVar.hasContent()) {
            synchronized (this) {
                this.f65609t = false;
                if (this.f65607r < 1) {
                    L();
                }
            }
        } else if (iU > 0) {
            this.f65609t = true;
            G();
        }
        return iU;
    }

    @Override // mm.c
    public void w(e.a aVar) {
        D().e(aVar);
    }

    @Override // org.eclipse.jetty.io.nio.a, mm.k
    public int y(d dVar) throws Throwable {
        int iY = super.y(dVar);
        if (iY > 0) {
            G();
        }
        return iY;
    }
}
