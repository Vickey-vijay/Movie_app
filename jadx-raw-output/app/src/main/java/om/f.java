package om;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import mm.j;
import mm.k;

/* JADX INFO: compiled from: SslConnection.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends mm.b implements om.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f65434u = new om.c(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ThreadLocal<b> f65435v = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zm.c f65436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SSLEngine f65437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SSLSession f65438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public om.a f65439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f65440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f65441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f65442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f65443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f65444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f65445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mm.c f65446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f65447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f65448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f65449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f65451t;

    /* JADX INFO: compiled from: SslConnection.java */
    public class c implements mm.c {
        @Override // mm.k
        public boolean f() {
            return false;
        }

        public c() {
        }

        @Override // mm.c
        public void a() {
            f.this.f65446o.a();
        }

        @Override // mm.k
        public int c() {
            return f.this.f65446o.c();
        }

        @Override // mm.k
        public void close() throws IOException {
            f.this.f65436e.i("{} ssl endp.close", f.this.f65438g);
            f.this.f64595c.close();
        }

        @Override // mm.k
        public int d() {
            return f.this.f65446o.d();
        }

        @Override // mm.k
        public String e() {
            return f.this.f65446o.e();
        }

        @Override // mm.k
        public void flush() throws IOException {
            f.this.G(null, null);
        }

        @Override // mm.k
        public String g() {
            return f.this.f65446o.g();
        }

        @Override // mm.i
        public j getConnection() {
            return f.this.f65439h;
        }

        @Override // mm.k
        public boolean h(long j10) throws IOException {
            return f.this.f64595c.h(j10);
        }

        @Override // mm.k
        public int i(mm.d dVar, mm.d dVar2, mm.d dVar3) throws IOException {
            if (dVar != null && dVar.hasContent()) {
                return u(dVar);
            }
            if (dVar2 != null && dVar2.hasContent()) {
                return u(dVar2);
            }
            if (dVar3 == null || !dVar3.hasContent()) {
                return 0;
            }
            return u(dVar3);
        }

        @Override // mm.k
        public boolean isOpen() {
            return f.this.f64595c.isOpen();
        }

        @Override // mm.k
        public void j() throws IOException {
            f.this.f65436e.i("{} ssl endp.ishut!", f.this.f65438g);
        }

        @Override // mm.k
        public void l() throws IOException {
            synchronized (f.this) {
                try {
                    f.this.f65436e.i("{} ssl endp.oshut {}", f.this.f65438g, this);
                    f.this.f65450s = true;
                    f.this.f65437f.closeOutbound();
                } catch (Exception e10) {
                    throw new IOException(e10);
                }
            }
            flush();
        }

        @Override // mm.c
        public boolean m() {
            return f.this.f65451t.getAndSet(false);
        }

        @Override // mm.c
        public void n(en.e.a aVar, long j10) {
            f.this.f65446o.n(aVar, j10);
        }

        @Override // mm.i
        public void o(j jVar) {
            f.this.f65439h = (om.a) jVar;
        }

        @Override // mm.k
        public int p() {
            return f.this.f65446o.p();
        }

        @Override // mm.k
        public void q(int i10) throws IOException {
            f.this.f65446o.q(i10);
        }

        @Override // mm.k
        public String r() {
            return f.this.f65446o.r();
        }

        @Override // mm.k
        public boolean s() {
            boolean z10;
            synchronized (f.this) {
                z10 = f.this.f65450s || !isOpen() || f.this.f65437f.isOutboundDone();
            }
            return z10;
        }

        public String toString() {
            d dVar = f.this.f65443l;
            d dVar2 = f.this.f65445n;
            d dVar3 = f.this.f65444m;
            return String.format("SSL %s i/o/u=%d/%d/%d ishut=%b oshut=%b {%s}", f.this.f65437f.getHandshakeStatus(), Integer.valueOf(dVar == null ? -1 : dVar.length()), Integer.valueOf(dVar2 == null ? -1 : dVar2.length()), Integer.valueOf(dVar3 != null ? dVar3.length() : -1), Boolean.valueOf(f.this.f65449r), Boolean.valueOf(f.this.f65450s), f.this.f65439h);
        }

        @Override // mm.c
        public void v() {
            f.this.f65446o.v();
        }

        @Override // mm.c
        public void w(en.e.a aVar) {
            f.this.f65446o.w(aVar);
        }

        @Override // mm.k
        public boolean x() {
            boolean z10;
            synchronized (f.this) {
                z10 = f.this.f64595c.x() && (f.this.f65444m == null || !f.this.f65444m.hasContent()) && (f.this.f65443l == null || !f.this.f65443l.hasContent());
            }
            return z10;
        }

        @Override // mm.k
        public boolean k(long j10) throws IOException {
            long j11;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j10 > 0) {
                j11 = j10 + jCurrentTimeMillis;
            } else {
                j11 = Long.MAX_VALUE;
            }
            while (jCurrentTimeMillis < j11 && !f.this.G(null, null)) {
                f.this.f64595c.k(j11 - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (jCurrentTimeMillis < j11) {
                return true;
            }
            return false;
        }

        @Override // mm.k
        public int u(mm.d dVar) throws IOException {
            int length = dVar.length();
            f.this.G(null, dVar);
            return length - dVar.length();
        }

        @Override // mm.k
        public int y(mm.d dVar) throws IOException {
            int length = dVar.length();
            f.this.G(dVar, null);
            int length2 = dVar.length() - length;
            if (length2 == 0 && x()) {
                return -1;
            }
            return length2;
        }
    }

    public f(SSLEngine sSLEngine, k kVar) {
        this(sSLEngine, kVar, System.currentTimeMillis());
    }

    public final void B() {
        synchronized (this) {
            int i10 = this.f65441j;
            this.f65441j = i10 + 1;
            if (i10 == 0 && this.f65442k == null) {
                ThreadLocal<b> threadLocal = f65435v;
                b bVar = threadLocal.get();
                this.f65442k = bVar;
                if (bVar == null) {
                    this.f65442k = new b(this.f65438g.getPacketBufferSize() * 2, this.f65438g.getApplicationBufferSize() * 2);
                }
                b bVar2 = this.f65442k;
                this.f65443l = bVar2.f65454a;
                this.f65445n = bVar2.f65455b;
                this.f65444m = bVar2.f65456c;
                threadLocal.set(null);
            }
        }
    }

    public final void H() {
        synchronized (this) {
            int i10 = this.f65441j - 1;
            this.f65441j = i10;
            if (i10 == 0 && this.f65442k != null && this.f65443l.length() == 0 && this.f65445n.length() == 0 && this.f65444m.length() == 0) {
                this.f65443l = null;
                this.f65445n = null;
                this.f65444m = null;
                f65435v.set(this.f65442k);
                this.f65442k = null;
            }
        }
    }

    public final synchronized boolean I(mm.d dVar) throws IOException {
        SSLEngineResult sSLEngineResultUnwrap;
        int iPosition;
        int iPosition2;
        if (!this.f65443l.hasContent()) {
            return false;
        }
        ByteBuffer byteBufferD = D(dVar);
        synchronized (byteBufferD) {
            ByteBuffer byteBufferZ = this.f65443l.Z();
            synchronized (byteBufferZ) {
                try {
                    try {
                        try {
                            try {
                                byteBufferD.position(dVar.T());
                                byteBufferD.limit(dVar.e0());
                                int iPosition3 = byteBufferD.position();
                                byteBufferZ.position(this.f65443l.getIndex());
                                byteBufferZ.limit(this.f65443l.T());
                                int iPosition4 = byteBufferZ.position();
                                sSLEngineResultUnwrap = this.f65437f.unwrap(byteBufferZ, byteBufferD);
                                if (this.f65436e.f()) {
                                    this.f65436e.i("{} unwrap {} {} consumed={} produced={}", this.f65438g, sSLEngineResultUnwrap.getStatus(), sSLEngineResultUnwrap.getHandshakeStatus(), Integer.valueOf(sSLEngineResultUnwrap.bytesConsumed()), Integer.valueOf(sSLEngineResultUnwrap.bytesProduced()));
                                }
                                iPosition = byteBufferZ.position() - iPosition4;
                                this.f65443l.skip(iPosition);
                                this.f65443l.b0();
                                iPosition2 = byteBufferD.position() - iPosition3;
                                dVar.W(dVar.T() + iPosition2);
                                byteBufferZ.position(0);
                                byteBufferZ.limit(byteBufferZ.capacity());
                                byteBufferD.position(0);
                                byteBufferD.limit(byteBufferD.capacity());
                            } catch (Exception e10) {
                                throw new IOException(e10);
                            }
                        } catch (SSLException e11) {
                            this.f65436e.d(String.valueOf(this.f64595c), e11);
                            this.f64595c.close();
                            throw e11;
                        }
                    } catch (IOException e12) {
                        throw e12;
                    }
                } catch (Throwable th2) {
                    byteBufferZ.position(0);
                    byteBufferZ.limit(byteBufferZ.capacity());
                    byteBufferD.position(0);
                    byteBufferD.limit(byteBufferD.capacity());
                    throw th2;
                }
            }
        }
        int i10 = a.f65453b[sSLEngineResultUnwrap.getStatus().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        this.f65436e.i("{} wrap default {}", this.f65438g, sSLEngineResultUnwrap);
                        throw new IOException(sSLEngineResultUnwrap.toString());
                    }
                    this.f65436e.i("unwrap CLOSE {} {}", this, sSLEngineResultUnwrap);
                    if (sSLEngineResultUnwrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                        this.f64595c.close();
                    }
                } else if (sSLEngineResultUnwrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    this.f65448q = true;
                }
            } else if (this.f65436e.f()) {
                this.f65436e.i("{} unwrap {} {}->{}", this.f65438g, sSLEngineResultUnwrap.getStatus(), this.f65443l.O(), dVar.O());
            }
        } else if (this.f64595c.x()) {
            this.f65443l.clear();
        }
        return iPosition > 0 || iPosition2 > 0;
    }

    public final synchronized boolean J(mm.d dVar) throws IOException {
        SSLEngineResult sSLEngineResultWrap;
        int iPosition;
        int iPosition2;
        ByteBuffer byteBufferD = D(dVar);
        synchronized (byteBufferD) {
            this.f65445n.b0();
            ByteBuffer byteBufferZ = this.f65445n.Z();
            synchronized (byteBufferZ) {
                try {
                    try {
                        try {
                            try {
                                byteBufferD.position(dVar.getIndex());
                                byteBufferD.limit(dVar.T());
                                int iPosition3 = byteBufferD.position();
                                byteBufferZ.position(this.f65445n.T());
                                byteBufferZ.limit(byteBufferZ.capacity());
                                int iPosition4 = byteBufferZ.position();
                                sSLEngineResultWrap = this.f65437f.wrap(byteBufferD, byteBufferZ);
                                if (this.f65436e.f()) {
                                    this.f65436e.i("{} wrap {} {} consumed={} produced={}", this.f65438g, sSLEngineResultWrap.getStatus(), sSLEngineResultWrap.getHandshakeStatus(), Integer.valueOf(sSLEngineResultWrap.bytesConsumed()), Integer.valueOf(sSLEngineResultWrap.bytesProduced()));
                                }
                                iPosition = byteBufferD.position() - iPosition3;
                                dVar.skip(iPosition);
                                iPosition2 = byteBufferZ.position() - iPosition4;
                                d dVar2 = this.f65445n;
                                dVar2.W(dVar2.T() + iPosition2);
                                byteBufferZ.position(0);
                                byteBufferZ.limit(byteBufferZ.capacity());
                                byteBufferD.position(0);
                                byteBufferD.limit(byteBufferD.capacity());
                            } catch (Exception e10) {
                                throw new IOException(e10);
                            }
                        } catch (SSLException e11) {
                            this.f65436e.d(String.valueOf(this.f64595c), e11);
                            this.f64595c.close();
                            throw e11;
                        }
                    } catch (IOException e12) {
                        throw e12;
                    }
                } catch (Throwable th2) {
                    byteBufferZ.position(0);
                    byteBufferZ.limit(byteBufferZ.capacity());
                    byteBufferD.position(0);
                    byteBufferD.limit(byteBufferD.capacity());
                    throw th2;
                }
            }
        }
        int i10 = a.f65453b[sSLEngineResultWrap.getStatus().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException();
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    this.f65436e.i("{} wrap default {}", this.f65438g, sSLEngineResultWrap);
                    throw new IOException(sSLEngineResultWrap.toString());
                }
                this.f65436e.i("wrap CLOSE {} {}", this, sSLEngineResultWrap);
                if (sSLEngineResultWrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    this.f64595c.close();
                }
            } else if (sSLEngineResultWrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.f65448q = true;
            }
        }
        return iPosition > 0 || iPosition2 > 0;
    }

    @Override // mm.j
    public boolean b() {
        return false;
    }

    @Override // om.a
    public void c() throws IOException {
    }

    @Override // mm.j
    public boolean p() {
        return false;
    }

    @Override // mm.b
    public String toString() {
        return String.format("%s %s", super.toString(), this.f65440i);
    }

    /* JADX INFO: compiled from: SslConnection.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f65453b;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            f65453b = iArr;
            try {
                iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65453b[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65453b[SSLEngineResult.Status.OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65453b[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            f65452a = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65452a[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65452a[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65452a[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f65452a[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: SslConnection.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f65454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f65455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f65456c;

        public b(int i10, int i11) {
            this.f65454a = new om.c(i10);
            this.f65455b = new om.c(i10);
            this.f65456c = new om.c(i11);
        }
    }

    public f(SSLEngine sSLEngine, k kVar, long j10) {
        super(kVar, j10);
        this.f65436e = zm.b.b("org.eclipse.jetty.io.nio.ssl");
        this.f65447p = true;
        this.f65451t = new AtomicBoolean();
        this.f65437f = sSLEngine;
        this.f65438g = sSLEngine.getSession();
        this.f65446o = (mm.c) kVar;
        this.f65440i = F();
    }

    public final void C() {
        try {
            this.f65437f.closeInbound();
        } catch (SSLException e10) {
            this.f65436e.a(e10);
        }
    }

    public mm.c E() {
        return this.f65440i;
    }

    public c F() {
        return new c();
    }

    public final synchronized boolean G(mm.d dVar, mm.d dVar2) throws IOException {
        int iY;
        boolean z10;
        int iU;
        mm.d dVar3 = dVar;
        mm.d dVar4 = dVar2;
        synchronized (this) {
            boolean z11 = false;
            try {
                try {
                    B();
                    if (dVar3 == null) {
                        this.f65444m.b0();
                        dVar3 = this.f65444m;
                    } else {
                        if (dVar.e0() < this.f65438g.getApplicationBufferSize()) {
                            boolean zG = G(null, dVar4);
                            d dVar5 = this.f65444m;
                            if (dVar5 == null || !dVar5.hasContent()) {
                                H();
                                return zG;
                            }
                            d dVar6 = this.f65444m;
                            dVar6.skip(dVar3.S(dVar6));
                            H();
                            return true;
                        }
                        d dVar7 = this.f65444m;
                        if (dVar7 != null && dVar7.hasContent()) {
                            d dVar8 = this.f65444m;
                            dVar8.skip(dVar3.S(dVar8));
                            H();
                            return true;
                        }
                    }
                    if (dVar4 == null) {
                        dVar4 = f65434u;
                    }
                    boolean z12 = false;
                    boolean z13 = true;
                    while (z13) {
                        try {
                            if (this.f65443l.L() > 0) {
                                iY = this.f64595c.y(this.f65443l);
                                z10 = iY > 0;
                            } else {
                                iY = 0;
                                z10 = false;
                            }
                            try {
                                try {
                                    if (this.f65445n.hasContent()) {
                                        iU = this.f64595c.u(this.f65445n);
                                        if (iU > 0) {
                                            z10 = true;
                                        }
                                    } else {
                                        iU = 0;
                                    }
                                    try {
                                        this.f65436e.i("{} {} {} filled={}/{} flushed={}/{}", this.f65438g, this, this.f65437f.getHandshakeStatus(), Integer.valueOf(iY), Integer.valueOf(this.f65443l.length()), Integer.valueOf(iU), Integer.valueOf(this.f65445n.length()));
                                        int i10 = a.f65452a[this.f65437f.getHandshakeStatus().ordinal()];
                                        if (i10 == 1) {
                                            throw new IllegalStateException();
                                        }
                                        if (i10 != 2) {
                                            if (i10 == 3) {
                                                while (true) {
                                                    Runnable delegatedTask = this.f65437f.getDelegatedTask();
                                                    if (delegatedTask == null) {
                                                        break;
                                                    }
                                                    delegatedTask.run();
                                                    z10 = true;
                                                }
                                            } else if (i10 != 4) {
                                                if (i10 == 5) {
                                                    if (this.f65448q && !this.f65447p) {
                                                        this.f64595c.close();
                                                    } else if (!this.f65443l.hasContent() && iY == -1) {
                                                        this.f64595c.j();
                                                    } else if (I(dVar3)) {
                                                    }
                                                }
                                            } else if (this.f65448q && !this.f65447p) {
                                                this.f64595c.close();
                                            } else if (J(dVar4)) {
                                            }
                                        } else {
                                            if (dVar3.L() > 0 && this.f65443l.hasContent() && I(dVar3)) {
                                                z10 = true;
                                            }
                                            z13 = (dVar4.hasContent() && this.f65445n.L() > 0 && J(dVar4)) ? true : z10;
                                        }
                                        if (this.f64595c.isOpen() && this.f64595c.x() && !this.f65443l.hasContent()) {
                                            C();
                                        }
                                        if (this.f64595c.isOpen() && this.f65437f.isOutboundDone() && !this.f65445n.hasContent()) {
                                            this.f64595c.l();
                                        }
                                        z12 |= z13;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z11 = z12;
                                        H();
                                        if (z11) {
                                            this.f65451t.set(true);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    this.f64595c.close();
                                    throw e;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                this.f65436e.i("{} {} {} filled={}/{} flushed={}/{}", this.f65438g, this, this.f65437f.getHandshakeStatus(), Integer.valueOf(iY), Integer.valueOf(this.f65443l.length()), 0, Integer.valueOf(this.f65445n.length()));
                                throw th;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            iY = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            iY = 0;
                            this.f65436e.i("{} {} {} filled={}/{} flushed={}/{}", this.f65438g, this, this.f65437f.getHandshakeStatus(), Integer.valueOf(iY), Integer.valueOf(this.f65443l.length()), 0, Integer.valueOf(this.f65445n.length()));
                            throw th;
                        }
                    }
                    d dVar9 = this.f65444m;
                    if (dVar3 == dVar9 && dVar9.hasContent() && !this.f65439h.b()) {
                        this.f65446o.a();
                    }
                    H();
                    if (z12) {
                        this.f65451t.set(true);
                    }
                    return z12;
                } catch (Throwable th5) {
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    @Override // mm.b, mm.j
    public void a(long j10) {
        try {
            this.f65436e.i("onIdleExpired {}ms on {}", Long.valueOf(j10), this);
            if (this.f64595c.s()) {
                this.f65440i.close();
            } else {
                this.f65440i.l();
            }
        } catch (IOException e10) {
            this.f65436e.e(e10);
            super.a(j10);
        }
    }

    @Override // mm.j
    public j e() throws IOException {
        try {
            B();
            boolean zG = true;
            while (zG) {
                zG = this.f65437f.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING ? G(null, null) : false;
                om.a aVar = (om.a) this.f65439h.e();
                if (aVar != this.f65439h && aVar != null) {
                    this.f65439h = aVar;
                    zG = true;
                }
                this.f65436e.i("{} handle {} progress={}", this.f65438g, this, Boolean.valueOf(zG));
            }
            return this;
        } finally {
            H();
            if (!this.f65449r && this.f65440i.x() && this.f65440i.isOpen()) {
                this.f65449r = true;
                try {
                    this.f65439h.c();
                } catch (Throwable th2) {
                    this.f65436e.c("onInputShutdown failed", th2);
                    try {
                        this.f65440i.close();
                    } catch (IOException e10) {
                        this.f65436e.h(e10);
                    }
                }
            }
        }
    }

    @Override // mm.j
    public void onClose() {
        j connection = this.f65440i.getConnection();
        if (connection == null || connection == this) {
            return;
        }
        connection.onClose();
    }

    public final ByteBuffer D(mm.d dVar) {
        if (dVar.buffer() instanceof d) {
            return ((d) dVar.buffer()).Z();
        }
        return ByteBuffer.wrap(dVar.V());
    }
}
