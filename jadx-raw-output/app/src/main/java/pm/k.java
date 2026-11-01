package pm;

import java.io.IOException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.DispatcherType;
import javax.servlet.http.HttpSessionEvent;
import org.eclipse.jetty.security.ServerAuthException;
import rm.n;
import rm.o;
import rm.v;

/* JADX INFO: compiled from: SecurityHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class k extends tm.g implements pm.a.InterfaceC0617a {
    public static final zm.c A = zm.b.a(k.class);
    public static Principal B = new b();
    public static Principal C = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public pm.a f66224r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f66226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f66227u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f66229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f66230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f66231y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f66223q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public pm.a.b f66225s = new pm.d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, String> f66228v = new HashMap();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f66232z = true;

    /* JADX INFO: compiled from: SecurityHandler.java */
    public class a implements lj.j {
        @Override // lj.j
        public void e(HttpSessionEvent httpSessionEvent) {
        }

        public a() {
        }

        @Override // lj.j
        public void q(HttpSessionEvent httpSessionEvent) {
            n nVarW;
            rm.b bVarO = rm.b.o();
            if (bVarO != null && (nVarW = bVarO.w()) != null && nVarW.c()) {
                httpSessionEvent.getSession().a("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated", Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: compiled from: SecurityHandler.java */
    public static class b implements Principal {
        @Override // java.security.Principal
        public String getName() {
            return null;
        }

        @Override // java.security.Principal
        public String toString() {
            return "No User";
        }
    }

    public abstract boolean D0(String str, n nVar, o oVar, Object obj) throws IOException;

    public abstract boolean E0(String str, n nVar, o oVar, Object obj, v vVar) throws IOException;

    public abstract boolean K0(n nVar, o oVar, Object obj);

    public abstract Object M0(String str, n nVar);

    /* JADX INFO: compiled from: SecurityHandler.java */
    public static class c implements Principal {
        @Override // java.security.Principal
        public String getName() {
            return "Nobody";
        }

        @Override // java.security.Principal
        public String toString() {
            return getName();
        }
    }

    /* JADX INFO: compiled from: SecurityHandler.java */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66234a;

        static {
            int[] iArr = new int[DispatcherType.values().length];
            f66234a = iArr;
            try {
                iArr[DispatcherType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66234a[DispatcherType.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66234a[DispatcherType.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean C0(n nVar) {
        int i10 = d.f66234a[nVar.F().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 != 3 || !this.f66223q || nVar.getAttribute("org.eclipse.jetty.server.welcome") == null) {
            return false;
        }
        nVar.c0("org.eclipse.jetty.server.welcome");
        return true;
    }

    @Override // pm.a.InterfaceC0617a
    public boolean D() {
        return this.f66232z;
    }

    public pm.a H0() {
        return this.f66224r;
    }

    public String J0() {
        return this.f66226t;
    }

    public void L0(rm.d.h hVar) {
        A.i("logout {}", hVar);
        g gVarU = U();
        if (gVarU != null) {
            gVarU.a(hVar.getUserIdentity());
        }
        f fVarE = e();
        if (fVarE != null) {
            fVarE.b(null);
        }
    }

    @Override // pm.a.InterfaceC0617a
    public g U() {
        return this.f66229w;
    }

    @Override // pm.a.InterfaceC0617a
    public f e() {
        return this.f66231y;
    }

    @Override // pm.a.InterfaceC0617a
    public String getAuthMethod() {
        return this.f66227u;
    }

    @Override // pm.a.InterfaceC0617a
    public String getInitParameter(String str) {
        return this.f66228v.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v7, types: [pm.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pm.f] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    @Override // tm.g, rm.i
    public void v(String str, n nVar, lj.a aVar, lj.c cVar) throws Throwable {
        lj.c cVar2;
        ?? r10;
        ?? r11;
        rm.d.h hVar;
        Object obj;
        lj.a aVarH = aVar;
        lj.c cVarT = cVar;
        o oVarM = nVar.M();
        rm.i iVarA0 = A0();
        if (iVarA0 == null) {
            return;
        }
        pm.a aVar2 = this.f66224r;
        if (!C0(nVar)) {
            iVarA0.v(str, nVar, aVarH, cVarT);
            return;
        }
        Object objM0 = M0(str, nVar);
        if (!D0(str, nVar, oVarM, objM0)) {
            if (nVar.X()) {
                return;
            }
            cVarT.o(403);
            nVar.m0(true);
            return;
        }
        boolean zK0 = K0(nVar, oVarM, objM0);
        if (zK0 && aVar2 == null) {
            A.g("No authenticator for: " + objM0, new Object[0]);
            if (nVar.X()) {
                return;
            }
            cVarT.o(403);
            nVar.m0(true);
            return;
        }
        ?? r12 = 0;
        ?? r13 = 0;
         = 0;
        ?? r14 = 0;
        try {
            try {
                rm.d dVarB = nVar.B();
                if (dVarB == null || dVarB == rm.d.I8) {
                    dVarB = aVar2 == null ? rm.d.H8 : aVar2.b(aVarH, cVarT, zK0);
                }
                if (dVarB instanceof rm.d.i) {
                    aVarH = ((rm.d.i) dVarB).h();
                    cVarT = ((rm.d.i) dVarB).t();
                }
                lj.a aVar3 = aVarH;
                cVar2 = cVarT;
                try {
                    if (dVarB instanceof rm.d.g) {
                        nVar.m0(true);
                    } else {
                        ?? C2 = dVarB instanceof rm.d.h;
                        try {
                            if (C2 != 0) {
                                rm.d.h hVar2 = (rm.d.h) dVarB;
                                nVar.g0(dVarB);
                                f fVar = this.f66231y;
                                Object objC = fVar != null ? fVar.c(hVar2.getUserIdentity()) : null;
                                if (zK0) {
                                    try {
                                        hVar = hVar2;
                                        Object obj2 = objC;
                                        try {
                                            if (!E0(str, nVar, oVarM, objM0, hVar2.getUserIdentity())) {
                                                cVar2.m(403, "!role");
                                                nVar.m0(true);
                                                f fVar2 = this.f66231y;
                                                if (fVar2 != null) {
                                                    fVar2.b(obj2);
                                                    return;
                                                }
                                                return;
                                            }
                                            obj = obj2;
                                        } catch (ServerAuthException e10) {
                                            e = e10;
                                            C2 = obj2;
                                            r14 = C2;
                                            cVar2.m(500, e.getMessage());
                                            f fVar3 = this.f66231y;
                                            r11 = fVar3;
                                            r10 = r14;
                                            if (fVar3 == null) {
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            C2 = obj2;
                                            r12 = C2;
                                            ?? r15 = this.f66231y;
                                            if (r15 != 0) {
                                                r15.b(r12);
                                            }
                                            throw th;
                                        }
                                    } catch (ServerAuthException e11) {
                                        e = e11;
                                        C2 = objC;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        C2 = objC;
                                    }
                                } else {
                                    hVar = hVar2;
                                    obj = objC;
                                }
                                iVarA0.v(str, nVar, aVar3, cVar2);
                                C2 = obj;
                                if (aVar2 != null) {
                                    aVar2.a(aVar3, cVar2, zK0, hVar);
                                    C2 = obj;
                                }
                            } else if (dVarB instanceof rm.d.f) {
                                qm.c cVar3 = (qm.c) dVarB;
                                nVar.g0(dVarB);
                                try {
                                    iVarA0.v(str, nVar, aVar3, cVar2);
                                    C2 = cVar3.c();
                                    if (aVar2 != null) {
                                        rm.d dVarB2 = nVar.B();
                                        if (dVarB2 instanceof rm.d.h) {
                                            aVar2.a(aVar3, cVar2, zK0, (rm.d.h) dVarB2);
                                            C2 = C2;
                                        } else {
                                            aVar2.a(aVar3, cVar2, zK0, null);
                                            C2 = C2;
                                        }
                                    }
                                    r13 = C2;
                                } catch (Throwable th4) {
                                    cVar3.c();
                                    throw th4;
                                }
                            } else {
                                nVar.g0(dVarB);
                                f fVar4 = this.f66231y;
                                Object objC2 = fVar4 != null ? fVar4.c(null) : null;
                                iVarA0.v(str, nVar, aVar3, cVar2);
                                C2 = objC2;
                                if (aVar2 != null) {
                                    aVar2.a(aVar3, cVar2, zK0, null);
                                    C2 = objC2;
                                }
                            }
                            r13 = C2;
                        } catch (ServerAuthException e12) {
                            e = e12;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    f fVar5 = this.f66231y;
                    r11 = fVar5;
                    r10 = r13;
                    if (fVar5 == null) {
                        return;
                    }
                } catch (ServerAuthException e13) {
                    e = e13;
                }
            } catch (ServerAuthException e14) {
                e = e14;
                cVar2 = cVarT;
            }
            r11.b(r10);
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static k I0() {
        tm.c.d dVarV0 = tm.c.V0();
        if (dVarV0 == null) {
            return null;
        }
        return (k) dVarV0.b().z0(k.class);
    }

    public f F0() {
        return (f) b().t0(f.class);
    }

    public g G0() {
        List<g> listV0 = b().v0(g.class);
        String strJ0 = J0();
        if (strJ0 != null) {
            for (g gVar : listV0) {
                if (gVar.getName() != null && gVar.getName().equals(strJ0)) {
                    return gVar;
                }
            }
            return null;
        }
        if (listV0.size() == 1) {
            return (g) listV0.get(0);
        }
        return null;
    }

    public String N0(String str, String str2) {
        if (!isRunning()) {
            return this.f66228v.put(str, str2);
        }
        throw new IllegalStateException("running");
    }

    @Override // tm.g, tm.a, ym.b, ym.a
    public void d0() throws Exception {
        pm.a.b bVar;
        tm.c.d dVarV0 = tm.c.V0();
        if (dVarV0 != null) {
            Enumeration enumerationE = dVarV0.e();
            while (enumerationE != null && enumerationE.hasMoreElements()) {
                String str = (String) enumerationE.nextElement();
                if (str.startsWith("org.eclipse.jetty.security.") && getInitParameter(str) == null) {
                    N0(str, dVarV0.c(str));
                }
            }
            dVarV0.b().N0(new a());
        }
        if (this.f66229w == null) {
            g gVarG0 = G0();
            this.f66229w = gVarG0;
            if (gVarG0 != null) {
                this.f66230x = true;
            }
        }
        if (this.f66231y == null) {
            g gVar = this.f66229w;
            if (gVar != null) {
                this.f66231y = gVar.e();
            }
            if (this.f66231y == null) {
                this.f66231y = F0();
            }
            if (this.f66231y == null && this.f66226t != null) {
                this.f66231y = new e();
            }
        }
        g gVar2 = this.f66229w;
        if (gVar2 != null) {
            if (gVar2.e() == null) {
                this.f66229w.d(this.f66231y);
            } else if (this.f66229w.e() != this.f66231y) {
                throw new IllegalStateException("LoginService has different IdentityService to " + this);
            }
        }
        if (!this.f66230x) {
            g gVar3 = this.f66229w;
            if (gVar3 instanceof ym.f) {
                ((ym.f) gVar3).start();
            }
        }
        if (this.f66224r == null && (bVar = this.f66225s) != null && this.f66231y != null) {
            pm.a aVarA = bVar.a(b(), tm.c.V0(), this, this.f66231y, this.f66229w);
            this.f66224r = aVarA;
            if (aVarA != null) {
                this.f66227u = aVarA.getAuthMethod();
            }
        }
        pm.a aVar = this.f66224r;
        if (aVar == null) {
            if (this.f66226t != null) {
                A.g("No ServerAuthentication for " + this, new Object[0]);
                throw new IllegalStateException("No ServerAuthentication");
            }
        } else {
            aVar.c(this);
            pm.a aVar2 = this.f66224r;
            if (aVar2 instanceof ym.f) {
                ((ym.f) aVar2).start();
            }
        }
        super.d0();
    }

    @Override // tm.g, tm.a, ym.b, ym.a
    public void e0() throws Exception {
        super.e0();
        if (!this.f66230x) {
            g gVar = this.f66229w;
            if (gVar instanceof ym.f) {
                ((ym.f) gVar).stop();
            }
        }
    }
}
