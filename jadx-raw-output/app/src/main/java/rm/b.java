package rm;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import javax.servlet.DispatcherType;
import org.eclipse.jetty.continuation.ContinuationThrowable;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;
import org.eclipse.jetty.io.RuntimeIOException;

/* JADX INFO: compiled from: AbstractHttpConnection.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b extends mm.b {
    public static final zm.c C = zm.b.a(b.class);
    public static final ThreadLocal<b> D = new ThreadLocal<>();
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f66827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f66828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lm.n f66829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lm.q f66830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final org.eclipse.jetty.http.a f66831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f66832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile kj.m f66833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lm.c f66834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final org.eclipse.jetty.http.a f66835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f66836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile C0632b f66837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile c f66838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile PrintWriter f66839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f66840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f66841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f66842u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f66843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f66844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f66845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f66846y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f66847z;

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class a extends PrintWriter {
        public a(Writer writer) {
            super(writer);
        }

        @Override // java.io.PrintWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (((PrintWriter) this).lock) {
                try {
                    ((PrintWriter) this).out.close();
                } catch (IOException unused) {
                    setError();
                }
            }
        }
    }

    /* JADX INFO: renamed from: rm.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class C0632b extends l {
        public C0632b() {
            super(b.this);
        }

        @Override // rm.l, java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            if (!this.f66893d.a()) {
                b.this.i(false);
            }
            super.flush();
        }

        public void k(mm.d dVar) throws IOException {
            ((org.eclipse.jetty.http.b) this.f66893d).H(dVar);
        }

        @Override // kj.n
        public void b(String str) throws IOException {
            if (!isClosed()) {
                b.this.v(null).print(str);
                return;
            }
            throw new IOException("Closed");
        }

        @Override // rm.l, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (isClosed()) {
                return;
            }
            if (!b.this.J() && !this.f66893d.a()) {
                b.this.i(true);
            } else {
                b.this.m();
            }
            super.close();
        }

        public void j(Object obj) throws IOException {
            boolean z10;
            mm.d dVarA;
            if (!isClosed()) {
                if (!this.f66893d.l()) {
                    an.e eVar = null;
                    if (obj instanceof lm.f) {
                        lm.f fVar = (lm.f) obj;
                        mm.d contentType = fVar.getContentType();
                        if (contentType != null) {
                            org.eclipse.jetty.http.a aVar = b.this.f66835n;
                            mm.d dVar = lm.i.f63808z;
                            if (!aVar.j(dVar)) {
                                String strV = b.this.f66836o.v();
                                if (strV == null) {
                                    b.this.f66835n.e(dVar, contentType);
                                } else if (contentType instanceof mm.e.a) {
                                    mm.e.a aVarD = ((mm.e.a) contentType).d(strV);
                                    if (aVarD != null) {
                                        b.this.f66835n.D(dVar, aVarD);
                                    } else {
                                        b.this.f66835n.C(dVar, contentType + ";charset=" + xm.m.c(strV, ";= "));
                                    }
                                } else {
                                    b.this.f66835n.C(dVar, contentType + ";charset=" + xm.m.c(strV, ";= "));
                                }
                            }
                        }
                        if (fVar.c() > 0) {
                            b.this.f66835n.H(lm.i.f63788j, fVar.c());
                        }
                        mm.d lastModified = fVar.getLastModified();
                        long jD = fVar.getResource().d();
                        if (lastModified != null) {
                            b.this.f66835n.D(lm.i.B, lastModified);
                        } else if (fVar.getResource() != null && jD != -1) {
                            b.this.f66835n.F(lm.i.B, jD);
                        }
                        mm.d eTag = fVar.getETag();
                        if (eTag != null) {
                            b.this.f66835n.D(lm.i.Z, eTag);
                        }
                        f fVar2 = b.this.f66827f;
                        if ((fVar2 instanceof um.a) && ((um.a) fVar2).a()) {
                            f fVar3 = b.this.f66827f;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            dVarA = fVar.d();
                        } else {
                            dVarA = fVar.a();
                        }
                        if (dVarA == null) {
                            obj = fVar.b();
                        } else {
                            obj = dVarA;
                        }
                    } else if (obj instanceof an.e) {
                        eVar = (an.e) obj;
                        b.this.f66835n.F(lm.i.B, eVar.d());
                        obj = eVar.c();
                    }
                    if (obj instanceof mm.d) {
                        this.f66893d.t((mm.d) obj, true);
                        b.this.i(true);
                        return;
                    }
                    if (obj instanceof InputStream) {
                        InputStream inputStream = (InputStream) obj;
                        try {
                            int iK = this.f66893d.g().K(inputStream, this.f66893d.m());
                            while (iK >= 0 && !b.this.f64595c.s()) {
                                this.f66893d.d();
                                b.this.f66837p.flush();
                                iK = this.f66893d.g().K(inputStream, this.f66893d.m());
                            }
                            this.f66893d.d();
                            b.this.f66837p.flush();
                            if (eVar != null) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            if (eVar != null) {
                                eVar.i();
                            } else {
                                inputStream.close();
                            }
                        }
                    }
                    throw new IllegalArgumentException("unknown content type?");
                }
                throw new IllegalStateException("!empty");
            }
            throw new IOException("Closed");
        }
    }

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class c extends m {
        public c() {
            super(b.this.f66837p);
        }
    }

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class d extends lm.k.a {
        public d() {
        }

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        @Override // lm.k.a
        public void a(mm.d dVar) throws Throwable {
            b.this.k(dVar);
        }

        @Override // lm.k.a
        public void b() {
            b.this.l();
        }

        @Override // lm.k.a
        public void c() throws Throwable {
            b.this.F();
        }

        @Override // lm.k.a
        public void d(long j10) throws Throwable {
            b.this.L(j10);
        }

        @Override // lm.k.a
        public void e(mm.d dVar, mm.d dVar2) throws IOException {
            b.this.O(dVar, dVar2);
        }

        @Override // lm.k.a
        public void f(mm.d dVar, mm.d dVar2, mm.d dVar3) throws IOException {
            b.this.R(dVar, dVar2, dVar3);
        }

        @Override // lm.k.a
        public void g(mm.d dVar, int i10, mm.d dVar2) {
            if (b.C.f()) {
                b.C.i("Bad request!: " + dVar + Z7.f27998r + i10 + Z7.f27998r + dVar2, new Object[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0352 A[Catch: all -> 0x0375, TryCatch #7 {all -> 0x0375, blocks: (B:201:0x034a, B:203:0x0352, B:204:0x035b, B:206:0x036c, B:208:0x0372, B:209:0x0374), top: B:281:0x034a }] */
    /* JADX WARN: Code duplicated, block: B:206:0x036c A[Catch: all -> 0x0375, TryCatch #7 {all -> 0x0375, blocks: (B:201:0x034a, B:203:0x0352, B:204:0x035b, B:206:0x036c, B:208:0x0372, B:209:0x0374), top: B:281:0x034a }] */
    /* JADX WARN: Code duplicated, block: B:246:0x041a  */
    /* JADX WARN: Code duplicated, block: B:249:0x042b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0436  */
    /* JADX WARN: Code duplicated, block: B:253:0x0447  */
    /* JADX WARN: Code duplicated, block: B:256:0x0454 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:257:0x0456  */
    /* JADX WARN: Code duplicated, block: B:259:0x0468  */
    /* JADX WARN: Code duplicated, block: B:260:0x046e  */
    /* JADX WARN: Code duplicated, block: B:262:0x0476  */
    /* JADX WARN: Code duplicated, block: B:267:0x0492  */
    /* JADX WARN: Code duplicated, block: B:268:0x049a  */
    /* JADX WARN: Code duplicated, block: B:281:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:? A[ADDED_TO_REGION, Catch: all -> 0x0375, REMOVE, SYNTHETIC, TRY_LEAVE, TryCatch #7 {all -> 0x0375, blocks: (B:201:0x034a, B:203:0x0352, B:204:0x035b, B:206:0x036c, B:208:0x0372, B:209:0x0374), top: B:281:0x034a }] */
    /* JADX WARN: Code duplicated, block: B:319:? A[SYNTHETIC] */
    public void E() throws Throwable {
        Throwable th2;
        String str;
        Throwable th3;
        String name;
        Throwable th4;
        boolean z10;
        boolean zQ;
        HttpException httpException;
        ContinuationThrowable continuationThrowable;
        String strB;
        Throwable th5;
        String strF;
        String strA;
        boolean z11 = false;
        try {
            if (C.f()) {
                try {
                    name = Thread.currentThread().getName();
                    try {
                        Thread.currentThread().setName(name + " - " + this.f66829h);
                    } catch (Throwable th6) {
                        th2 = th6;
                        str = name;
                        th3 = null;
                        if (str != null) {
                            Thread.currentThread().setName(str);
                        }
                        if (this.f66832k.f66904a.u()) {
                            throw th2;
                        }
                        this.f66832k.f66904a.f(th3);
                        if (this.f66844w) {
                            C.i("100 continues not sent", new Object[0]);
                            this.f66844w = false;
                            if (!this.f66836o.a()) {
                                this.f66834m.r(false);
                            }
                        }
                        if (this.f64595c.isOpen()) {
                            this.f66836o.r();
                        } else if (z11) {
                            this.f64595c.l();
                            this.f66834m.r(false);
                            if (!this.f66834m.isComplete()) {
                                this.f66836o.r();
                            }
                        } else {
                            if (!this.f66836o.a()) {
                                this.f66836o.o(404);
                            }
                            this.f66836o.r();
                            if (this.f66834m.s()) {
                                this.f66827f.b0(this.f64595c);
                            }
                        }
                        this.f66832k.m0(true);
                        throw th2;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    str = null;
                    th3 = null;
                    if (str != null) {
                        Thread.currentThread().setName(str);
                    }
                    if (this.f66832k.f66904a.u()) {
                        throw th2;
                    }
                    this.f66832k.f66904a.f(th3);
                    if (this.f66844w) {
                        C.i("100 continues not sent", new Object[0]);
                        this.f66844w = false;
                        if (!this.f66836o.a()) {
                            this.f66834m.r(false);
                        }
                    }
                    if (this.f64595c.isOpen()) {
                        this.f66836o.r();
                    } else if (z11) {
                        this.f64595c.l();
                        this.f66834m.r(false);
                        if (!this.f66834m.isComplete()) {
                            this.f66836o.r();
                        }
                    } else {
                        if (!this.f66836o.a()) {
                            this.f66836o.o(404);
                        }
                        this.f66836o.r();
                        if (this.f66834m.s()) {
                            this.f66827f.b0(this.f64595c);
                        }
                    }
                    this.f66832k.m0(true);
                    throw th2;
                }
            } else {
                name = null;
            }
            try {
                p pVar = this.f66828g;
                boolean zQ2 = this.f66832k.f66904a.q();
                boolean z12 = this.f66832k.f66904a.n() && pVar != null && pVar.isRunning();
                z11 = false;
                th3 = null;
                while (z12) {
                    try {
                        this.f66832k.m0(false);
                        int i10 = 400;
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            this.f66829h.j();
                                            try {
                                                strF = this.f66829h.e();
                                            } catch (Exception e10) {
                                                zm.c cVar = C;
                                                cVar.g("Failed UTF-8 decode for request path, trying ISO-8859-1", new Object[0]);
                                                cVar.h(e10);
                                                strF = this.f66829h.f("ISO-8859-1");
                                            }
                                            strB = xm.q.b(strF);
                                            if (strB == null) {
                                                try {
                                                    if (!this.f66832k.getMethod().equals("CONNECT")) {
                                                        if (strF != null || this.f66829h.m() == null || this.f66829h.g() == null) {
                                                            throw new HttpException(400);
                                                        }
                                                        strB = "/";
                                                        this.f66832k.v0("");
                                                    }
                                                } catch (Throwable th8) {
                                                    th4 = th8;
                                                    try {
                                                        C.c(String.valueOf(this.f66829h), th4);
                                                        try {
                                                            this.f66832k.m0(true);
                                                            lm.c cVar2 = this.f66834m;
                                                            if (strB != null) {
                                                                i10 = 500;
                                                            }
                                                            cVar2.B(i10, null, null, true);
                                                            try {
                                                                if (this.f66832k.g()) {
                                                                    this.f66832k.y().h();
                                                                }
                                                                zQ = this.f66832k.f66904a.q();
                                                                z10 = (this.f66832k.f66904a.A() || !pVar.isRunning() || this.f66828g == null) ? false : true;
                                                                th3 = th4;
                                                                z11 = true;
                                                                z12 = z10;
                                                            } catch (Throwable th9) {
                                                                th2 = th9;
                                                                th3 = th4;
                                                                z11 = true;
                                                                str = name;
                                                                if (str != null) {
                                                                    Thread.currentThread().setName(str);
                                                                }
                                                                if (this.f66832k.f66904a.u()) {
                                                                    throw th2;
                                                                }
                                                                this.f66832k.f66904a.f(th3);
                                                                if (this.f66844w) {
                                                                    C.i("100 continues not sent", new Object[0]);
                                                                    this.f66844w = false;
                                                                    if (!this.f66836o.a()) {
                                                                        this.f66834m.r(false);
                                                                    }
                                                                }
                                                                if (this.f64595c.isOpen()) {
                                                                    this.f66836o.r();
                                                                } else if (z11) {
                                                                    this.f64595c.l();
                                                                    this.f66834m.r(false);
                                                                    if (!this.f66834m.isComplete()) {
                                                                        this.f66836o.r();
                                                                    }
                                                                } else {
                                                                    if (!this.f66836o.a()) {
                                                                        this.f66836o.o(404);
                                                                    }
                                                                    this.f66836o.r();
                                                                    if (this.f66834m.s()) {
                                                                        this.f66827f.b0(this.f64595c);
                                                                    }
                                                                }
                                                                this.f66832k.m0(true);
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th5 = th10;
                                                            z11 = true;
                                                            if (z11) {
                                                                try {
                                                                    if (this.f66832k.g()) {
                                                                        this.f66832k.y().h();
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th2 = th11;
                                                                    th3 = th4;
                                                                    str = name;
                                                                    if (str != null) {
                                                                        Thread.currentThread().setName(str);
                                                                    }
                                                                    if (this.f66832k.f66904a.u()) {
                                                                        throw th2;
                                                                    }
                                                                    this.f66832k.f66904a.f(th3);
                                                                    if (this.f66844w) {
                                                                        C.i("100 continues not sent", new Object[0]);
                                                                        this.f66844w = false;
                                                                        if (!this.f66836o.a()) {
                                                                            this.f66834m.r(false);
                                                                        }
                                                                    }
                                                                    if (this.f64595c.isOpen()) {
                                                                        this.f66836o.r();
                                                                    } else if (z11) {
                                                                        this.f64595c.l();
                                                                        this.f66834m.r(false);
                                                                        if (!this.f66834m.isComplete()) {
                                                                            this.f66836o.r();
                                                                        }
                                                                    } else {
                                                                        if (!this.f66836o.a()) {
                                                                            this.f66836o.o(404);
                                                                        }
                                                                        this.f66836o.r();
                                                                        if (this.f66834m.s()) {
                                                                            this.f66827f.b0(this.f64595c);
                                                                        }
                                                                    }
                                                                    this.f66832k.m0(true);
                                                                    throw th2;
                                                                }
                                                            }
                                                            this.f66832k.f66904a.q();
                                                            if (!this.f66832k.f66904a.A()) {
                                                                throw th5;
                                                            }
                                                            throw th5;
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th5 = th;
                                                        if (z11) {
                                                            if (this.f66832k.g()) {
                                                                this.f66832k.y().h();
                                                            }
                                                        }
                                                        this.f66832k.f66904a.q();
                                                        if (!this.f66832k.f66904a.A()) {
                                                            throw th5;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                            }
                                            this.f66832k.p0(strB);
                                            if (this.f66837p != null) {
                                                this.f66837p.h();
                                            }
                                            if (this.f66832k.f66904a.s()) {
                                                this.f66832k.l0(DispatcherType.REQUEST);
                                                this.f66827f.j(this.f64595c, this.f66832k);
                                                pVar.L0(this);
                                            } else {
                                                if (!this.f66832k.f66904a.r() || zQ2) {
                                                    this.f66832k.l0(DispatcherType.ASYNC);
                                                } else {
                                                    Throwable th13 = (Throwable) this.f66832k.getAttribute("javax.servlet.error.exception");
                                                    try {
                                                        this.f66836o.C(500, th13 == null ? "Async Timeout" : "Async Exception");
                                                        this.f66832k.a("javax.servlet.error.status_code", new Integer(500));
                                                        this.f66832k.a("javax.servlet.error.message", this.f66836o.u());
                                                        this.f66832k.l0(DispatcherType.ERROR);
                                                        ym.d dVarX0 = this.f66832k.f66904a.k().X0();
                                                        if ((dVarX0 instanceof tm.e.a) && (strA = ((tm.e.a) dVarX0).a((lj.a) this.f66832k.f66904a.l())) != null) {
                                                            this.f66832k.f66904a.j().i(strA);
                                                        }
                                                        th3 = th13;
                                                    } catch (ContinuationThrowable e11) {
                                                        continuationThrowable = e11;
                                                        th3 = th13;
                                                        C.h(continuationThrowable);
                                                        if (z11 && this.f66832k.g()) {
                                                            this.f66832k.y().h();
                                                        }
                                                        zQ = this.f66832k.f66904a.q();
                                                        z12 = (this.f66832k.f66904a.A() || !pVar.isRunning() || this.f66828g == null) ? false : true;
                                                        zQ2 = zQ;
                                                    } catch (HttpException e12) {
                                                        httpException = e12;
                                                        th3 = th13;
                                                        try {
                                                            C.a(httpException);
                                                            try {
                                                                this.f66832k.m0(true);
                                                                this.f66836o.m(httpException.getStatus(), httpException.getReason());
                                                                try {
                                                                    if (this.f66832k.g()) {
                                                                        this.f66832k.y().h();
                                                                    }
                                                                    zQ = this.f66832k.f66904a.q();
                                                                    z12 = (this.f66832k.f66904a.A() || !pVar.isRunning() || this.f66828g == null) ? false : true;
                                                                    z11 = true;
                                                                } catch (Throwable th14) {
                                                                    th2 = th14;
                                                                    z11 = true;
                                                                    str = name;
                                                                    if (str != null) {
                                                                        Thread.currentThread().setName(str);
                                                                    }
                                                                    if (this.f66832k.f66904a.u()) {
                                                                        throw th2;
                                                                    }
                                                                    this.f66832k.f66904a.f(th3);
                                                                    if (this.f66844w) {
                                                                        C.i("100 continues not sent", new Object[0]);
                                                                        this.f66844w = false;
                                                                        if (!this.f66836o.a()) {
                                                                            this.f66834m.r(false);
                                                                        }
                                                                    }
                                                                    if (this.f64595c.isOpen()) {
                                                                        this.f66836o.r();
                                                                    } else if (z11) {
                                                                        this.f64595c.l();
                                                                        this.f66834m.r(false);
                                                                        if (!this.f66834m.isComplete()) {
                                                                            this.f66836o.r();
                                                                        }
                                                                    } else {
                                                                        if (!this.f66836o.a()) {
                                                                            this.f66836o.o(404);
                                                                        }
                                                                        this.f66836o.r();
                                                                        if (this.f66834m.s()) {
                                                                            this.f66827f.b0(this.f64595c);
                                                                        }
                                                                    }
                                                                    this.f66832k.m0(true);
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th15) {
                                                                th5 = th15;
                                                                z11 = true;
                                                                th4 = th3;
                                                                if (z11) {
                                                                    if (this.f66832k.g()) {
                                                                        this.f66832k.y().h();
                                                                    }
                                                                }
                                                                this.f66832k.f66904a.q();
                                                                if (!this.f66832k.f66904a.A() || !pVar.isRunning()) {
                                                                    throw th5;
                                                                }
                                                                p pVar2 = this.f66828g;
                                                                throw th5;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th5 = th16;
                                                        }
                                                    }
                                                }
                                                pVar.M0(this);
                                            }
                                            if (z11 && this.f66832k.g()) {
                                                this.f66832k.y().h();
                                            }
                                            zQ = this.f66832k.f66904a.q();
                                            z12 = (this.f66832k.f66904a.A() || !pVar.isRunning() || this.f66828g == null) ? false : true;
                                        } catch (ContinuationThrowable e13) {
                                            continuationThrowable = e13;
                                        }
                                    } catch (Throwable th17) {
                                        th4 = th17;
                                        strB = null;
                                    }
                                } catch (ContinuationThrowable e14) {
                                    continuationThrowable = e14;
                                }
                            } catch (HttpException e15) {
                                httpException = e15;
                            }
                        } catch (EofException e16) {
                            C.a(e16);
                            this.f66832k.m0(true);
                            if (!this.f66836o.a()) {
                                this.f66834m.B(500, null, null, true);
                            }
                            if (this.f66832k.g()) {
                                this.f66832k.y().h();
                            }
                            boolean zQ3 = this.f66832k.f66904a.q();
                            z12 = (this.f66832k.f66904a.A() || !pVar.isRunning() || this.f66828g == null) ? false : true;
                            th3 = e16;
                            zQ = zQ3;
                            z11 = true;
                        } catch (RuntimeIOException e17) {
                            try {
                                C.a(e17);
                                try {
                                    this.f66832k.m0(true);
                                    try {
                                        if (this.f66832k.g()) {
                                            this.f66832k.y().h();
                                        }
                                        boolean zQ4 = this.f66832k.f66904a.q();
                                        z10 = (this.f66832k.f66904a.A() || !pVar.isRunning() || this.f66828g == null) ? false : true;
                                        th3 = e17;
                                        zQ = zQ4;
                                        z11 = true;
                                        z12 = z10;
                                    } catch (Throwable th18) {
                                        th3 = e17;
                                        z11 = true;
                                        str = name;
                                        th2 = th18;
                                        if (str != null) {
                                            Thread.currentThread().setName(str);
                                        }
                                        if (this.f66832k.f66904a.u()) {
                                            throw th2;
                                        }
                                        this.f66832k.f66904a.f(th3);
                                        if (this.f66844w) {
                                            C.i("100 continues not sent", new Object[0]);
                                            this.f66844w = false;
                                            if (!this.f66836o.a()) {
                                                this.f66834m.r(false);
                                            }
                                        }
                                        if (this.f64595c.isOpen()) {
                                            this.f66836o.r();
                                        } else if (z11) {
                                            this.f64595c.l();
                                            this.f66834m.r(false);
                                            if (!this.f66834m.isComplete()) {
                                                this.f66836o.r();
                                            }
                                        } else {
                                            if (!this.f66836o.a() && !this.f66832k.X()) {
                                                this.f66836o.o(404);
                                            }
                                            this.f66836o.r();
                                            if (this.f66834m.s()) {
                                                this.f66827f.b0(this.f64595c);
                                            }
                                        }
                                        this.f66832k.m0(true);
                                        throw th2;
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                    th4 = e17;
                                    z11 = true;
                                    th5 = th;
                                    if (z11) {
                                        if (this.f66832k.g()) {
                                            this.f66832k.y().h();
                                        }
                                    }
                                    this.f66832k.f66904a.q();
                                    if (!this.f66832k.f66904a.A()) {
                                        throw th5;
                                    }
                                    throw th5;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                th4 = e17;
                            }
                        }
                        zQ2 = zQ;
                    } catch (Throwable th21) {
                        th2 = th21;
                    }
                }
                if (name != null) {
                    Thread.currentThread().setName(name);
                }
                if (this.f66832k.f66904a.u()) {
                    this.f66832k.f66904a.f(th3);
                    if (this.f66844w) {
                        C.i("100 continues not sent", new Object[0]);
                        this.f66844w = false;
                        if (!this.f66836o.a()) {
                            this.f66834m.r(false);
                        }
                    }
                    if (!this.f64595c.isOpen()) {
                        this.f66836o.r();
                    } else if (z11) {
                        this.f64595c.l();
                        this.f66834m.r(false);
                        if (!this.f66834m.isComplete()) {
                            this.f66836o.r();
                        }
                    } else {
                        if (!this.f66836o.a() && !this.f66832k.X()) {
                            this.f66836o.o(404);
                        }
                        this.f66836o.r();
                        if (this.f66834m.s()) {
                            this.f66827f.b0(this.f64595c);
                        }
                    }
                    this.f66832k.m0(true);
                }
            } catch (Throwable th22) {
                th2 = th22;
                z11 = false;
                str = name;
                th3 = null;
            }
        } catch (Throwable th23) {
            th2 = th23;
            z11 = false;
            str = null;
            th3 = null;
        }
    }

    public void l() {
        this.B = true;
    }

    public void m() throws IOException {
        try {
            i(false);
            this.f66834m.z();
        } catch (IOException e10) {
            if (!(e10 instanceof EofException)) {
                throw new EofException(e10);
            }
        }
    }

    @Override // mm.b
    public String toString() {
        return String.format("%s,g=%s,p=%s,r=%d", super.toString(), this.f66834m, this.f66830i, Integer.valueOf(this.f66826e));
    }

    public static void Q(b bVar) {
        D.set(bVar);
    }

    public static b o() {
        return D.get();
    }

    public boolean A() {
        return this.f66827f.q();
    }

    public o B() {
        return this.f66836o;
    }

    public org.eclipse.jetty.http.a C() {
        return this.f66835n;
    }

    public p D() {
        return this.f66828g;
    }

    public void F() throws Throwable {
        if (this.f64595c.s()) {
            this.f64595c.close();
            return;
        }
        this.f66826e++;
        this.f66834m.setVersion(this.f66841t);
        int i10 = this.f66841t;
        if (i10 == 10) {
            this.f66834m.v(this.f66846y);
            if (this.f66830i.s()) {
                this.f66835n.e(lm.i.f63790k, lm.h.f63766i);
                this.f66834m.r(true);
            } else if ("CONNECT".equals(this.f66832k.getMethod())) {
                this.f66834m.r(true);
                this.f66830i.r(true);
                lm.q qVar = this.f66830i;
                if (qVar instanceof lm.k) {
                    ((lm.k) qVar).m(0);
                }
            }
            if (this.f66828g.F0()) {
                this.f66834m.x(this.f66832k.U());
            }
        } else if (i10 == 11) {
            this.f66834m.v(this.f66846y);
            if (!this.f66830i.s()) {
                this.f66835n.e(lm.i.f63790k, lm.h.f63762e);
                this.f66834m.r(false);
            }
            if (this.f66828g.F0()) {
                this.f66834m.x(this.f66832k.U());
            }
            if (!this.f66847z) {
                C.i("!host {}", this);
                this.f66834m.u(400, null);
                this.f66835n.D(lm.i.f63790k, lm.h.f63762e);
                this.f66834m.A(this.f66835n, true);
                this.f66834m.complete();
                return;
            }
            if (this.f66843v) {
                C.i("!expectation {}", this);
                this.f66834m.u(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, null);
                this.f66835n.D(lm.i.f63790k, lm.h.f63762e);
                this.f66834m.A(this.f66835n, true);
                this.f66834m.complete();
                return;
            }
        }
        String str = this.f66842u;
        if (str != null) {
            this.f66832k.h0(str);
        }
        if ((((lm.k) this.f66830i).e() > 0 || ((lm.k) this.f66830i).h()) && !this.f66844w) {
            this.A = true;
        } else {
            E();
        }
    }

    public boolean G(n nVar) {
        f fVar = this.f66827f;
        return fVar != null && fVar.o(nVar);
    }

    public boolean H() {
        return this.B;
    }

    public boolean I() {
        return this.f66845x;
    }

    public boolean J() {
        return this.f66840s > 0;
    }

    public boolean K() {
        return this.f66834m.a();
    }

    public void L(long j10) throws Throwable {
        if (this.A) {
            this.A = false;
            E();
        }
    }

    public org.eclipse.jetty.http.b M(Buffers buffers, mm.k kVar) {
        return new org.eclipse.jetty.http.b(buffers, kVar);
    }

    public lm.k N(Buffers buffers, mm.k kVar, lm.k.a aVar) {
        return new lm.k(buffers, kVar, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    public void O(mm.d dVar, mm.d dVar2) throws IOException {
        int iF = lm.i.f63776d.f(dVar);
        if (iF == 16) {
            dVar2 = lm.p.f63867c.h(dVar2);
            this.f66842u = lm.p.a(dVar2);
        } else if (iF == 21) {
            dVar2 = lm.h.f63761d.h(dVar2);
        } else if (iF != 24) {
            if (iF == 27) {
                this.f66847z = true;
            } else if (iF == 40) {
                dVar2 = lm.h.f63761d.h(dVar2);
            }
        } else if (this.f66841t >= 11) {
            lm.h hVar = lm.h.f63761d;
            dVar2 = hVar.h(dVar2);
            int iF2 = hVar.f(dVar2);
            if (iF2 == 6) {
                this.f66844w = this.f66834m instanceof org.eclipse.jetty.http.b;
            } else if (iF2 != 7) {
                String[] strArrSplit = dVar2.toString().split(StringUtils.COMMA);
                for (int i10 = 0; strArrSplit != null && i10 < strArrSplit.length; i10++) {
                    mm.e.a aVarB = lm.h.f63761d.b(strArrSplit[i10].trim());
                    if (aVarB == null) {
                        this.f66843v = true;
                    } else {
                        int iE = aVarB.e();
                        if (iE == 6) {
                            this.f66844w = this.f66834m instanceof org.eclipse.jetty.http.b;
                        } else if (iE != 7) {
                            this.f66843v = true;
                        } else {
                            this.f66845x = this.f66834m instanceof org.eclipse.jetty.http.b;
                        }
                    }
                }
            } else {
                this.f66845x = this.f66834m instanceof org.eclipse.jetty.http.b;
            }
        }
        this.f66831j.e(dVar, dVar2);
    }

    public void P() {
        this.f66830i.reset();
        this.f66830i.q();
        this.f66831j.h();
        this.f66832k.b0();
        this.f66834m.reset();
        this.f66834m.q();
        this.f66835n.h();
        this.f66836o.y();
        this.f66829h.a();
        this.f66838q = null;
        this.B = false;
    }

    public void i(boolean z10) throws IOException {
        if (!this.f66834m.a()) {
            this.f66834m.u(this.f66836o.w(), this.f66836o.u());
            try {
                if (this.f66844w && this.f66836o.w() != 100) {
                    this.f66834m.r(false);
                }
                this.f66834m.A(this.f66835n, z10);
            } catch (RuntimeException e10) {
                C.g("header full: " + e10, new Object[0]);
                this.f66836o.z();
                this.f66834m.reset();
                this.f66834m.u(500, null);
                this.f66834m.A(this.f66835n, true);
                this.f66834m.complete();
                throw new HttpException(500);
            }
        }
        if (z10) {
            this.f66834m.complete();
        }
    }

    public void j() throws IOException {
        if (!this.f66834m.a()) {
            this.f66834m.u(this.f66836o.w(), this.f66836o.u());
            try {
                this.f66834m.A(this.f66835n, true);
            } catch (RuntimeException e10) {
                zm.c cVar = C;
                cVar.g("header full: " + e10, new Object[0]);
                cVar.a(e10);
                this.f66836o.z();
                this.f66834m.reset();
                this.f66834m.u(500, null);
                this.f66834m.A(this.f66835n, true);
                this.f66834m.complete();
                throw new HttpException(500);
            }
        }
        this.f66834m.complete();
    }

    public void k(mm.d dVar) throws Throwable {
        if (this.A) {
            this.A = false;
            E();
        }
    }

    public f n() {
        return this.f66827f;
    }

    @Override // mm.j
    public void onClose() {
        C.i("closed {}", this);
    }

    @Override // mm.j
    public boolean p() {
        return this.f66834m.p() && (this.f66830i.p() || this.A);
    }

    public lm.c q() {
        return this.f66834m;
    }

    public kj.m r() throws IOException {
        if (this.f66844w) {
            if (((lm.k) this.f66830i).f() == null || ((lm.k) this.f66830i).f().length() < 2) {
                if (this.f66834m.a()) {
                    throw new IllegalStateException("Committed before 100 Continues");
                }
                ((org.eclipse.jetty.http.b) this.f66834m).G(100);
            }
            this.f66844w = false;
        }
        if (this.f66833l == null) {
            this.f66833l = new k(this);
        }
        return this.f66833l;
    }

    public int s() {
        if (this.f66827f.J() && this.f64595c.d() == this.f66827f.d()) {
            return this.f66827f.R();
        }
        return this.f64595c.d() > 0 ? this.f64595c.d() : this.f66827f.d();
    }

    public kj.n t() {
        if (this.f66837p == null) {
            this.f66837p = new C0632b();
        }
        return this.f66837p;
    }

    public lm.q u() {
        return this.f66830i;
    }

    public n w() {
        return this.f66832k;
    }

    public org.eclipse.jetty.http.a x() {
        return this.f66831j;
    }

    public int y() {
        return this.f66826e;
    }

    public b(f fVar, mm.k kVar, p pVar) {
        lm.n bVar;
        super(kVar);
        this.f66841t = -2;
        this.f66843v = false;
        this.f66844w = false;
        this.f66845x = false;
        this.f66846y = false;
        this.f66847z = false;
        this.A = false;
        this.B = false;
        String str = xm.q.f75070b;
        if ("UTF-8".equals(str)) {
            bVar = new lm.n();
        } else {
            bVar = new lm.b(str);
        }
        this.f66829h = bVar;
        this.f66827f = fVar;
        lm.d dVar = (lm.d) fVar;
        this.f66830i = N(dVar.N(), kVar, new d(this, null));
        this.f66831j = new org.eclipse.jetty.http.a();
        this.f66835n = new org.eclipse.jetty.http.a();
        this.f66832k = new n(this);
        this.f66836o = new o(this);
        org.eclipse.jetty.http.b bVarM = M(dVar.W(), kVar);
        this.f66834m = bVarM;
        bVarM.w(pVar.G0());
        this.f66828g = pVar;
    }

    public void R(mm.d dVar, mm.d dVar2, mm.d dVar3) throws IOException {
        mm.d dVarK0 = dVar2.k0();
        this.f66847z = false;
        this.f66843v = false;
        this.f66844w = false;
        this.f66845x = false;
        this.A = false;
        this.f66842u = null;
        if (this.f66832k.T() == 0) {
            this.f66832k.E0(System.currentTimeMillis());
        }
        this.f66832k.n0(dVar.toString());
        try {
            this.f66846y = false;
            int iF = lm.j.f63809a.f(dVar);
            if (iF != 3) {
                if (iF != 8) {
                    this.f66829h.p(dVarK0.V(), dVarK0.getIndex(), dVarK0.length());
                } else {
                    this.f66829h.r(dVarK0.V(), dVarK0.getIndex(), dVarK0.length());
                }
            } else {
                this.f66846y = true;
                this.f66829h.p(dVarK0.V(), dVarK0.getIndex(), dVarK0.length());
            }
            this.f66832k.F0(this.f66829h);
            if (dVar3 == null) {
                this.f66832k.q0("");
                this.f66841t = 9;
                return;
            }
            mm.e eVar = lm.o.f63861a;
            mm.e.a aVarC = eVar.c(dVar3);
            if (aVarC != null) {
                int iF2 = eVar.f(aVarC);
                this.f66841t = iF2;
                if (iF2 <= 0) {
                    this.f66841t = 10;
                }
                this.f66832k.q0(aVarC.toString());
                return;
            }
            throw new HttpException(400, null);
        } catch (Exception e10) {
            C.a(e10);
            if (e10 instanceof HttpException) {
                throw ((HttpException) e10);
            }
            throw new HttpException(400, null, e10);
        }
    }

    public PrintWriter v(String str) {
        t();
        if (this.f66838q == null) {
            this.f66838q = new c();
            if (this.f66828g.P0()) {
                this.f66839r = new mm.l(this.f66838q);
            } else {
                this.f66839r = new a(this.f66838q);
            }
        }
        this.f66838q.e(str);
        return this.f66839r;
    }
}
