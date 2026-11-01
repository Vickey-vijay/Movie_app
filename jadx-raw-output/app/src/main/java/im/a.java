package im;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import lm.k;
import lm.o;
import mm.m;
import org.eclipse.jetty.client.HttpDestination;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: AbstractHttpConnection.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends mm.b implements ym.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final zm.c f54228p = zm.b.a(a.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HttpDestination f54229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public org.eclipse.jetty.http.b f54230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f54231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f54232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mm.d f54234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f54235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile i f54236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f54237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final en.e.a f54238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AtomicBoolean f54239o;

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class b extends en.e.a {
        public b() {
        }

        @Override // en.e.a
        public void f() {
            if (a.this.f54239o.compareAndSet(true, false)) {
                a aVar = a.this;
                aVar.f54229e.t(aVar);
            }
        }
    }

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class c extends k.a {
        public c() {
        }

        @Override // lm.k.a
        public void f(mm.d dVar, mm.d dVar2, mm.d dVar3) throws IOException {
        }

        @Override // lm.k.a
        public void a(mm.d dVar) throws IOException {
            i iVar = a.this.f54236l;
            if (iVar != null) {
                iVar.k().g(dVar);
            }
        }

        @Override // lm.k.a
        public void b() {
            i iVar = a.this.f54236l;
            if (iVar == null || iVar.w() || !iVar.Y(9)) {
                return;
            }
            iVar.k().f(new EofException("early EOF"));
        }

        @Override // lm.k.a
        public void c() throws IOException {
            i iVar = a.this.f54236l;
            if (iVar != null) {
                iVar.Y(6);
                if ("CONNECT".equalsIgnoreCase(iVar.l())) {
                    a.this.f54231g.r(true);
                }
            }
        }

        @Override // lm.k.a
        public void d(long j10) throws IOException {
            i iVar = a.this.f54236l;
            if (iVar != null) {
                iVar.Y(7);
            }
        }

        @Override // lm.k.a
        public void e(mm.d dVar, mm.d dVar2) throws IOException {
            i iVar = a.this.f54236l;
            if (iVar != null) {
                if (lm.i.f63776d.f(dVar) == 1) {
                    a.this.f54234j = lm.h.f63761d.h(dVar2);
                }
                iVar.k().e(dVar, dVar2);
            }
        }

        @Override // lm.k.a
        public void g(mm.d dVar, int i10, mm.d dVar2) throws IOException {
            i iVar = a.this.f54236l;
            if (iVar == null) {
                a.f54228p.g("No exchange for response", new Object[0]);
                a.this.f64595c.close();
                return;
            }
            if (i10 == 100 || i10 == 102) {
                iVar.N(a.this.new d(iVar));
            } else if (i10 == 200 && "CONNECT".equalsIgnoreCase(iVar.l())) {
                a.this.f54231g.l(true);
            }
            a.this.f54232h = o.f63864d.equals(dVar);
            a.this.f54233i = i10;
            iVar.k().d(dVar, i10, dVar2);
            iVar.Y(5);
        }
    }

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f54242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f54243b;

        @Override // im.g
        public void d(mm.d dVar, int i10, mm.d dVar2) throws IOException {
        }

        @Override // im.g
        public void g(mm.d dVar) throws IOException {
        }

        @Override // im.g
        public void i() throws IOException {
        }

        @Override // im.g
        public void onRequestComplete() throws IOException {
        }

        public d(i iVar) {
            this.f54242a = iVar;
            this.f54243b = iVar.k();
        }

        @Override // im.g
        public void a(Throwable th2) {
            this.f54242a.N(this.f54243b);
            this.f54243b.a(th2);
        }

        @Override // im.g
        public void b() {
            this.f54242a.N(this.f54243b);
            this.f54243b.b();
        }

        @Override // im.g
        public void c() throws IOException {
            this.f54243b.c();
        }

        @Override // im.g
        public void e(mm.d dVar, mm.d dVar2) throws IOException {
            this.f54243b.e(dVar, dVar2);
        }

        @Override // im.g
        public void f(Throwable th2) {
            this.f54242a.N(this.f54243b);
            this.f54243b.f(th2);
        }

        @Override // im.g
        public void h() {
            this.f54242a.N(this.f54243b);
            this.f54243b.h();
        }

        @Override // im.g
        public void j() throws IOException {
            this.f54242a.N(this.f54243b);
            this.f54242a.Y(4);
            a.this.f54231g.reset();
        }
    }

    @Override // mm.j
    public boolean b() {
        return false;
    }

    public boolean k() {
        synchronized (this) {
            if (!this.f54239o.compareAndSet(true, false)) {
                return false;
            }
            this.f54229e.h().z0(this.f54238n);
            return true;
        }
    }

    public void m() throws IOException {
        synchronized (this) {
            this.f54233i = 0;
            if (this.f54236l.s() != 2) {
                throw new IllegalStateException();
            }
            this.f54236l.Y(3);
            this.f54230f.setVersion(this.f54236l.v());
            String strL = this.f54236l.l();
            String strQ = this.f54236l.q();
            if (this.f54229e.m()) {
                if (!"CONNECT".equals(strL) && strQ.startsWith("/")) {
                    boolean zN = this.f54229e.n();
                    String strA = this.f54229e.f().a();
                    int iB = this.f54229e.f().b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(zN ? "https" : "http");
                    sb2.append("://");
                    sb2.append(strA);
                    if ((!zN || iB != 443) && (zN || iB != 80)) {
                        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        sb2.append(iB);
                    }
                    sb2.append(strQ);
                    strQ = sb2.toString();
                }
                jm.a aVarK = this.f54229e.k();
                if (aVarK != null) {
                    aVarK.a(this.f54236l);
                }
            }
            this.f54230f.n(strL, strQ);
            this.f54231g.l("HEAD".equalsIgnoreCase(strL));
            org.eclipse.jetty.http.a aVarP = this.f54236l.p();
            if (this.f54236l.v() >= 11) {
                mm.d dVar = lm.i.f63778e;
                if (!aVarP.j(dVar)) {
                    aVarP.e(dVar, this.f54229e.g());
                }
            }
            mm.d dVarM = this.f54236l.m();
            if (dVarM != null) {
                aVarP.G("Content-Length", dVarM.length());
                this.f54230f.A(aVarP, false);
                this.f54230f.t(new m(dVarM), true);
                this.f54236l.Y(4);
            } else if (this.f54236l.o() != null) {
                this.f54230f.A(aVarP, false);
            } else {
                aVarP.I("Content-Length");
                this.f54230f.A(aVarP, true);
                this.f54236l.Y(4);
            }
        }
    }

    public void n(i iVar) {
        synchronized (this) {
            if (this.f54236l == iVar) {
                try {
                    this.f54229e.s(this, true);
                } catch (IOException e10) {
                    f54228p.h(e10);
                }
            }
        }
    }

    @Override // mm.j
    public void onClose() {
    }

    @Override // mm.j
    public boolean p() {
        boolean z10;
        synchronized (this) {
            z10 = this.f54236l == null;
        }
        return z10;
    }

    public void q() throws IOException {
        this.f54234j = null;
        this.f54231g.reset();
        this.f54230f.reset();
        this.f54232h = true;
    }

    public void t() {
        synchronized (this) {
            if (!this.f54239o.compareAndSet(false, true)) {
                throw new IllegalStateException();
            }
            this.f54229e.h().S0(this.f54238n);
        }
    }

    @Override // mm.b
    public String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = super.toString();
        HttpDestination httpDestination = this.f54229e;
        objArr[1] = httpDestination == null ? "?.?.?.?:??" : httpDestination.f();
        objArr[2] = this.f54230f;
        objArr[3] = this.f54231g;
        return String.format("%s %s g=%s p=%s", objArr);
    }

    @Override // ym.e
    public void z(Appendable appendable, String str) throws IOException {
        synchronized (this) {
            appendable.append(String.valueOf(this)).append("\n");
            ym.b.p0(appendable, str, Collections.singletonList(this.f64595c));
        }
    }

    public final void j() throws IOException {
        long jT = this.f54236l.t();
        if (jT <= 0) {
            jT = this.f54229e.h().K0();
        }
        long jD = this.f64595c.d();
        if (jT <= 0 || jT <= jD) {
            return;
        }
        this.f64595c.q(((int) jT) * 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0048, please report this as an issue */
    public void l() throws IOException {
        String string;
        String str;
        i iVar = this.f54236l;
        if (iVar != null && !iVar.w()) {
            switch (iVar.s()) {
                case 6:
                    if (!this.f64595c.x() || !this.f54231g.j(1)) {
                        string = iVar.toString();
                        if (this.f64595c.isOpen()) {
                            str = "closed: ";
                        } else if (this.f64595c.x()) {
                            str = "half closed: ";
                        } else {
                            str = "local close: ";
                        }
                        if (iVar.Y(9)) {
                            iVar.k().f(new EofException(str + string));
                        }
                    }
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    string = iVar.toString();
                    if (this.f64595c.isOpen()) {
                        str = "closed: ";
                    } else if (this.f64595c.x()) {
                        str = "half closed: ";
                    } else {
                        str = "local close: ";
                    }
                    if (iVar.Y(9)) {
                        iVar.k().f(new EofException(str + string));
                    }
                    break;
            }
        }
        if (this.f64595c.isOpen()) {
            this.f64595c.close();
            this.f54229e.s(this, true);
        }
    }

    public boolean o() {
        return this.f54235k;
    }

    public boolean r(i iVar) throws IOException {
        f54228p.i("Send {} on {}", iVar, this);
        synchronized (this) {
            if (this.f54236l != null) {
                if (this.f54237m == null) {
                    this.f54237m = iVar;
                    return true;
                }
                throw new IllegalStateException(this + " PIPELINED!!!  _exchange=" + this.f54236l);
            }
            this.f54236l = iVar;
            this.f54236l.d(this);
            if (this.f64595c.isOpen()) {
                this.f54236l.Y(2);
                j();
                return true;
            }
            this.f54236l.g();
            this.f54236l = null;
            return false;
        }
    }

    public void s(HttpDestination httpDestination) {
        this.f54229e = httpDestination;
    }

    public void u(boolean z10) {
        this.f54235k = z10;
    }

    public a(Buffers buffers, Buffers buffers2, mm.k kVar) {
        super(kVar);
        this.f54232h = true;
        this.f54238n = new b();
        this.f54239o = new AtomicBoolean(false);
        this.f54230f = new org.eclipse.jetty.http.b(buffers, kVar);
        this.f54231g = new k(buffers2, kVar, new c());
    }
}
