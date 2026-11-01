package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu0 f75733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj f75734b;

    public /* synthetic */ b51() {
        this(new nu0(), new kj());
    }

    public final Set a(List list) {
        Object next;
        List listK;
        m0 m0Var;
        List listK2;
        gi0 gi0Var;
        List list2;
        Object next2;
        this.f75734b.getClass();
        Set setS0 = nj.b0.S0(kj.a(list));
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ck.p.e(((oi) next).f81048a, "feedback"));
        oi oiVar = (oi) next;
        this.f75733a.getClass();
        if ((oiVar != null ? oiVar.f81050c : null) instanceof qu0) {
            List listO = nj.s.o(((qu0) oiVar.f81050c).f81972a);
            if1 if1Var = oiVar.f81051d;
            if (if1Var == null || (list2 = if1Var.f78621a) == null) {
                m0Var = null;
            } else {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!ck.p.e(((m0) next2).a(), "divkit_adtune"));
                m0Var = (m0) next2;
            }
            rh0 rh0Var = m0Var instanceof rh0 ? (rh0) m0Var : null;
            if (rh0Var == null || (gi0Var = rh0Var.f82269b) == null || (listK2 = gi0Var.f77810d) == null) {
                listK2 = nj.s.k();
            }
            listK = nj.b0.y0(listO, listK2);
        } else {
            listK = nj.s.k();
        }
        setS0.addAll(listK);
        return setS0;
    }

    public b51(nu0 nu0Var, kj kjVar) {
        this.f75733a = nu0Var;
        this.f75734b = kjVar;
    }
}
