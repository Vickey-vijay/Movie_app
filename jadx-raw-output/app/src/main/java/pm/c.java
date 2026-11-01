package pm;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.security.UserDataConstraint;
import org.eclipse.jetty.util.StringMap;
import rm.n;
import rm.o;
import rm.v;
import xm.p;

/* JADX INFO: compiled from: ConstraintSecurityHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public class c extends k {
    public final List<b> D = new CopyOnWriteArrayList();
    public final Set<String> E = new CopyOnWriteArraySet();
    public final PathMap F = new PathMap();
    public boolean G = true;

    @Override // pm.k
    public boolean D0(String str, n nVar, o oVar, Object obj) throws IOException {
        String str2;
        String str3;
        if (obj == null) {
            return true;
        }
        h hVar = (h) obj;
        if (hVar.g()) {
            return false;
        }
        UserDataConstraint userDataConstraintD = hVar.d();
        if (userDataConstraintD == null || userDataConstraintD == UserDataConstraint.None) {
            return true;
        }
        rm.f fVarN = rm.b.o().n();
        if (userDataConstraintD == UserDataConstraint.Integral) {
            if (fVarN.S(nVar)) {
                return true;
            }
            if (fVarN.l() > 0) {
                String strA0 = fVarN.a0();
                int iL = fVarN.l();
                if ("https".equalsIgnoreCase(strA0) && iL == 443) {
                    str3 = "https://" + nVar.s() + nVar.v();
                } else {
                    str3 = strA0 + "://" + nVar.s() + StringUtils.PROCESS_POSTFIX_DELIMITER + iL + nVar.v();
                }
                if (nVar.i() != null) {
                    str3 = str3 + "?" + nVar.i();
                }
                oVar.p(0);
                oVar.g(str3);
            } else {
                oVar.m(403, "!Integral");
            }
            nVar.m0(true);
            return false;
        }
        if (userDataConstraintD != UserDataConstraint.Confidential) {
            throw new IllegalArgumentException("Invalid dataConstraint value: " + userDataConstraintD);
        }
        if (fVarN.o(nVar)) {
            return true;
        }
        if (fVarN.T() > 0) {
            String strK = fVarN.k();
            int iT = fVarN.T();
            if ("https".equalsIgnoreCase(strK) && iT == 443) {
                str2 = "https://" + nVar.s() + nVar.v();
            } else {
                str2 = strK + "://" + nVar.s() + StringUtils.PROCESS_POSTFIX_DELIMITER + iT + nVar.v();
            }
            if (nVar.i() != null) {
                str2 = str2 + "?" + nVar.i();
            }
            oVar.p(0);
            oVar.g(str2);
        } else {
            oVar.m(403, "!Confidential");
        }
        nVar.m0(true);
        return false;
    }

    @Override // pm.k
    public boolean E0(String str, n nVar, o oVar, Object obj, v vVar) throws IOException {
        if (obj == null) {
            return true;
        }
        h hVar = (h) obj;
        if (!hVar.f()) {
            return true;
        }
        if (hVar.e() && nVar.A() != null) {
            return true;
        }
        Iterator<String> it = hVar.c().iterator();
        while (it.hasNext()) {
            if (vVar.a(it.next(), null)) {
                return true;
            }
        }
        return false;
    }

    @Override // pm.k
    public boolean K0(n nVar, o oVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return ((h) obj).f();
    }

    @Override // pm.k
    public Object M0(String str, n nVar) {
        Map map = (Map) this.F.match(str);
        if (map == null) {
            return null;
        }
        String method = nVar.getMethod();
        h hVar = (h) map.get(method);
        if (hVar != null) {
            return hVar;
        }
        ArrayList arrayList = new ArrayList();
        h hVar2 = (h) map.get(null);
        if (hVar2 != null) {
            arrayList.add(hVar2);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).contains(".omission")) {
                if (!(method + ".omission").equals(entry.getKey())) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        if (arrayList.size() == 1) {
            return (h) arrayList.get(0);
        }
        h hVar3 = new h();
        hVar3.k(UserDataConstraint.None);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hVar3.b((h) it.next());
        }
        return hVar3;
    }

    public void P0(b bVar) {
        Map<String, h> stringMap = (Map) this.F.get(bVar.d());
        if (stringMap == null) {
            stringMap = new StringMap();
            this.F.put(bVar.d(), stringMap);
        }
        h hVar = stringMap.get(null);
        if (hVar == null || !hVar.g()) {
            if (bVar.c() != null && bVar.c().length > 0) {
                Q0(bVar, stringMap);
                return;
            }
            String strB = bVar.b();
            h hVar2 = stringMap.get(strB);
            if (hVar2 == null) {
                hVar2 = new h();
                stringMap.put(strB, hVar2);
                if (hVar != null) {
                    hVar2.b(hVar);
                }
            }
            if (hVar2.g()) {
                return;
            }
            O0(hVar2, bVar);
            if (hVar2.g()) {
                if (strB == null) {
                    stringMap.clear();
                    stringMap.put(null, hVar2);
                    return;
                }
                return;
            }
            if (strB == null) {
                for (Map.Entry<String, h> entry : stringMap.entrySet()) {
                    if (entry.getKey() != null) {
                        entry.getValue().b(hVar2);
                    }
                }
            }
        }
    }

    @Override // pm.k, tm.g, tm.a, ym.b, ym.a
    public void d0() throws Exception {
        this.F.clear();
        List<b> list = this.D;
        if (list != null) {
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                P0(it.next());
            }
        }
        super.d0();
    }

    @Override // pm.k, tm.g, tm.a, ym.b, ym.a
    public void e0() throws Exception {
        this.F.clear();
        this.D.clear();
        this.E.clear();
        super.e0();
    }

    public void O0(h hVar, b bVar) {
        hVar.j(bVar.a().isForbidden());
        hVar.k(UserDataConstraint.get(bVar.a().getDataConstraint()));
        if (!hVar.g()) {
            hVar.i(bVar.a().getAuthenticate());
            if (hVar.f()) {
                if (bVar.a().isAnyRole()) {
                    if (this.G) {
                        Iterator<String> it = this.E.iterator();
                        while (it.hasNext()) {
                            hVar.a(it.next());
                        }
                        return;
                    }
                    hVar.h(true);
                    return;
                }
                for (String str : bVar.a().getRoles()) {
                    if (this.G && !this.E.contains(str)) {
                        throw new IllegalArgumentException("Attempt to use undeclared role: " + str + ", known roles: " + this.E);
                    }
                    hVar.a(str);
                }
            }
        }
    }

    public void Q0(b bVar, Map<String, h> map) {
        for (String str : bVar.c()) {
            h hVar = map.get(str + ".omission");
            if (hVar == null) {
                hVar = new h();
                map.put(str + ".omission", hVar);
            }
            O0(hVar, bVar);
        }
    }

    @Override // tm.b, ym.b, ym.e
    public void z(Appendable appendable, String str) throws IOException {
        s0(appendable);
        ym.b.p0(appendable, str, Collections.singleton(U()), Collections.singleton(e()), Collections.singleton(H0()), Collections.singleton(this.E), this.F.entrySet(), u0(), p.a(P()));
    }
}
