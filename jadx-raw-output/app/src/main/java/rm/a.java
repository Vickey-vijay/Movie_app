package rm;

import com.ironsource.C3426d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: AbstractConnector.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends ym.b implements lm.d, f {
    public static final zm.c S = zm.b.a(a.class);
    public boolean A;
    public String B;
    public String G;
    public String H;
    public transient Thread[] M;
    public final lm.e R;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f66811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f66812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public en.d f66813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f66814q;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f66823z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f66815r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f66816s = "https";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f66817t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f66818u = "https";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f66819v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f66820w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f66821x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f66822y = 0;
    public String C = "X-Forwarded-Host";
    public String D = "X-Forwarded-Server";
    public String E = "X-Forwarded-For";
    public String F = "X-Forwarded-Proto";
    public boolean I = true;
    public int J = C3426d4.b.f28433c;
    public int K = -1;
    public int L = -1;
    public final AtomicLong N = new AtomicLong(-1);
    public final dn.a O = new dn.a();
    public final dn.b P = new dn.b();
    public final dn.b Q = new dn.b();

    /* JADX INFO: renamed from: rm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractConnector.java */
    public class RunnableC0631a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f66824b;

        public RunnableC0631a(int i10) {
            this.f66824b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread threadCurrentThread = Thread.currentThread();
            synchronized (a.this) {
                if (a.this.M == null) {
                    return;
                }
                a.this.M[this.f66824b] = threadCurrentThread;
                String name = a.this.M[this.f66824b].getName();
                threadCurrentThread.setName(name + " Acceptor" + this.f66824b + Z7.f27998r + a.this);
                int priority = threadCurrentThread.getPriority();
                try {
                    threadCurrentThread.setPriority(priority - a.this.f66822y);
                    while (a.this.isRunning() && a.this.getConnection() != null) {
                        try {
                            try {
                                a.this.x0(this.f66824b);
                            } catch (IOException e10) {
                                a.S.h(e10);
                            } catch (Throwable th2) {
                                a.S.e(th2);
                            }
                        } catch (InterruptedException e11) {
                            a.S.h(e11);
                        } catch (EofException e12) {
                            a.S.h(e12);
                        }
                    }
                    threadCurrentThread.setPriority(priority);
                    threadCurrentThread.setName(name);
                    synchronized (a.this) {
                        if (a.this.M != null) {
                            a.this.M[this.f66824b] = null;
                        }
                    }
                } catch (Throwable th3) {
                    threadCurrentThread.setPriority(priority);
                    threadCurrentThread.setName(name);
                    synchronized (a.this) {
                        if (a.this.M != null) {
                            a.this.M[this.f66824b] = null;
                        }
                        throw th3;
                    }
                }
            }
        }
    }

    public void C0(Socket socket) throws IOException {
        try {
            socket.setTcpNoDelay(true);
            int i10 = this.L;
            if (i10 >= 0) {
                socket.setSoLinger(true, i10 / 1000);
            } else {
                socket.setSoLinger(false, 0);
            }
        } catch (Exception e10) {
            S.h(e10);
        }
    }

    public String N0(org.eclipse.jetty.http.a aVar, String str) {
        String strW;
        if (str == null || (strW = aVar.w(str)) == null) {
            return null;
        }
        int iIndexOf = strW.indexOf(44);
        return iIndexOf == -1 ? strW : strW.substring(0, iIndexOf);
    }

    @Override // rm.f
    public boolean S(n nVar) {
        return false;
    }

    @Override // rm.f
    public void b0(mm.k kVar) throws IOException {
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = getClass().getSimpleName();
        objArr[1] = L() == null ? "0.0.0.0" : L();
        objArr[2] = Integer.valueOf(c() <= 0 ? P0() : c());
        return String.format("%s@%s:%d", objArr);
    }

    public abstract void x0(int i10) throws InterruptedException, IOException;

    public void E0(mm.j jVar) {
        if (this.N.get() == -1) {
            return;
        }
        this.O.c();
    }

    public int F0() {
        return this.f66820w;
    }

    public int G0() {
        return this.f66821x;
    }

    public String H0() {
        return this.G;
    }

    public String I0() {
        return this.E;
    }

    @Override // rm.f
    public boolean J() {
        en.d dVar = this.f66813p;
        return dVar != null ? dVar.G() : this.f66812o.J0().G();
    }

    public String J0() {
        return this.C;
    }

    public String K0() {
        return this.F;
    }

    @Override // rm.f
    public String L() {
        return this.f66814q;
    }

    public String L0() {
        return this.D;
    }

    public String M0() {
        return this.H;
    }

    @Override // lm.d
    public Buffers N() {
        return this.R.N();
    }

    public int O0() {
        return this.K;
    }

    public int P0() {
        return this.f66815r;
    }

    public boolean Q0() {
        return this.I;
    }

    public en.d R0() {
        return this.f66813p;
    }

    public boolean S0() {
        return this.A;
    }

    @Override // rm.f
    public int T() {
        return this.f66819v;
    }

    public void T0(String str) {
        this.f66814q = str;
    }

    public void U0(int i10) {
        this.f66815r = i10;
    }

    @Override // lm.d
    public Buffers W() {
        return this.R.W();
    }

    @Override // rm.f
    public String a0() {
        return this.f66816s;
    }

    @Override // rm.f
    public p b() {
        return this.f66812o;
    }

    @Override // rm.f
    public int d() {
        return this.J;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ym.b, ym.a
    public void d0() throws Exception {
        if (this.f66812o == null) {
            throw new IllegalStateException("No server");
        }
        open();
        if (this.f66813p == null) {
            en.d dVarJ0 = this.f66812o.J0();
            this.f66813p = dVarJ0;
            n0(dVarJ0, false);
        }
        super.d0();
        synchronized (this) {
            this.M = new Thread[G0()];
            for (int i10 = 0; i10 < this.M.length; i10++) {
                if (!this.f66813p.Z(new RunnableC0631a(i10))) {
                    throw new IllegalStateException("!accepting");
                }
            }
            if (this.f66813p.G()) {
                S.g("insufficient threads configured for {}", this);
            }
        }
        S.k("Started {}", this);
    }

    @Override // rm.f
    public void f(p pVar) {
        this.f66812o = pVar;
    }

    @Override // rm.f
    public String getName() {
        if (this.f66811n == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(L() == null ? "0.0.0.0" : L());
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(c() <= 0 ? P0() : c());
            this.f66811n = sb2.toString();
        }
        return this.f66811n;
    }

    @Override // rm.f
    public String k() {
        return this.f66818u;
    }

    @Override // rm.f
    public int l() {
        return this.f66817t;
    }

    @Override // rm.f
    public boolean o(n nVar) {
        return this.A && nVar.O().equalsIgnoreCase("https");
    }

    @Override // rm.f
    public boolean q() {
        return this.f66823z;
    }

    public a() {
        lm.e eVar = new lm.e();
        this.R = eVar;
        m0(eVar);
    }

    public void B0(mm.k kVar, n nVar) throws IOException {
        String strW;
        String strW2;
        org.eclipse.jetty.http.a aVarX = nVar.D().x();
        if (H0() != null && (strW2 = aVarX.w(H0())) != null) {
            nVar.a("javax.servlet.request.cipher_suite", strW2);
        }
        if (M0() != null && (strW = aVarX.w(M0())) != null) {
            nVar.a("javax.servlet.request.ssl_session_id", strW);
            nVar.y0("https");
        }
        String strN0 = N0(aVarX, J0());
        String strN1 = N0(aVarX, L0());
        String strN2 = N0(aVarX, I0());
        String strN3 = N0(aVarX, K0());
        String str = this.B;
        InetAddress byName = null;
        if (str != null) {
            aVarX.C(lm.i.f63778e, str);
            nVar.z0(null);
            nVar.A0(-1);
            nVar.s();
        } else if (strN0 != null) {
            aVarX.C(lm.i.f63778e, strN0);
            nVar.z0(null);
            nVar.A0(-1);
            nVar.s();
        } else if (strN1 != null) {
            nVar.z0(strN1);
        }
        if (strN2 != null) {
            nVar.t0(strN2);
            if (this.f66823z) {
                try {
                    byName = InetAddress.getByName(strN2);
                } catch (UnknownHostException e10) {
                    S.h(e10);
                }
            }
            if (byName != null) {
                strN2 = byName.getHostName();
            }
            nVar.u0(strN2);
        }
        if (strN3 != null) {
            nVar.y0(strN3);
        }
    }

    public void D0(mm.j jVar) {
        int iY;
        jVar.onClose();
        if (this.N.get() == -1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - jVar.d();
        if (jVar instanceof b) {
            iY = ((b) jVar).y();
        } else {
            iY = 0;
        }
        this.P.a(iY);
        this.O.b();
        this.Q.a(jCurrentTimeMillis);
    }

    @Override // rm.f
    @Deprecated
    public final int R() {
        return O0();
    }

    @Override // ym.b, ym.a
    public void e0() throws Exception {
        Thread[] threadArr;
        try {
            close();
        } catch (IOException e10) {
            S.e(e10);
        }
        super.e0();
        synchronized (this) {
            threadArr = this.M;
            this.M = null;
        }
        if (threadArr != null) {
            for (Thread thread : threadArr) {
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
    }

    @Override // rm.f
    public void j(mm.k kVar, n nVar) throws IOException {
        if (S0()) {
            B0(kVar, nVar);
        }
    }
}
