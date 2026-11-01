package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import yads.l12;
import yads.ny1;

/* JADX INFO: loaded from: classes10.dex */
public final class ny1 implements l22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f80868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h22 f80869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f80870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l12 f80871d;

    public static final boolean a(ny1 ny1Var, l12 l12Var) {
        List list = ny1Var.f80868a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f81053f) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pi piVarA = l12Var.a((oi) it.next());
                if (piVarA != null && piVarA.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean b(ny1 ny1Var, l12 l12Var) {
        Object next;
        Iterator it = ny1Var.f80868a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oi oiVar = (oi) next;
            if (oiVar.f81053f && ck.p.e(oiVar.f81048a, "sponsored")) {
                break;
            }
        }
        oi oiVar2 = (oi) next;
        if (oiVar2 == null) {
            return true;
        }
        pi piVarA = l12Var.a(oiVar2);
        return piVarA != null && piVarA.d();
    }

    public static final boolean c(ny1 ny1Var, l12 l12Var) {
        Object next;
        oi oiVar;
        pi piVarA;
        List list = ny1Var.f80868a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f81053f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oiVar = (oi) next;
            piVarA = l12Var.a(oiVar);
            if (!(piVarA instanceof pi)) {
                piVarA = null;
            }
            if (piVarA == null) {
                break;
            }
        } while (piVarA.a(oiVar.f81050c));
        oi oiVar2 = (oi) next;
        ny1Var.f80870c = oiVar2 != null ? oiVar2.f81048a : null;
        return oiVar2 == null;
    }

    public static final boolean d(ny1 ny1Var, l12 l12Var) {
        Object next;
        pi piVarA;
        List list = ny1Var.f80868a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f81053f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            piVarA = l12Var.a((oi) next);
            if (piVarA == null) {
                break;
            }
        } while (piVarA.e());
        oi oiVar = (oi) next;
        ny1Var.f80870c = oiVar != null ? oiVar.f81048a : null;
        return oiVar == null;
    }

    public final kp2 e() {
        return new kp2(this.f80870c, a(new k22() { // from class: cp.b7
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.e(this.f51246a, l12Var);
            }
        }));
    }

    public ny1(List list, h22 h22Var) {
        this.f80868a = list;
        this.f80869b = h22Var;
    }

    public static final boolean e(ny1 ny1Var, l12 l12Var) {
        Object next;
        pi piVarA;
        List list = ny1Var.f80868a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f81053f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            piVarA = l12Var.a((oi) next);
            if (piVarA == null) {
                break;
            }
        } while (piVarA.b());
        oi oiVar = (oi) next;
        ny1Var.f80870c = oiVar != null ? oiVar.f81048a : null;
        return oiVar == null;
    }

    public final boolean b() {
        return !a(new k22() { // from class: cp.c7
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.b(this.f51263a, l12Var);
            }
        });
    }

    public final boolean a() {
        return !a(new k22() { // from class: cp.a7
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.a(this.f51230a, l12Var);
            }
        });
    }

    public final boolean a(k22 k22Var) {
        l12 l12Var = this.f80871d;
        if (l12Var == null) {
            return false;
        }
        this.f80869b.getClass();
        return k22Var.a(l12Var);
    }

    public final boolean d() {
        return !a(new k22() { // from class: cp.d7
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.d(this.f51284a, l12Var);
            }
        });
    }

    public final boolean c() {
        return !a(new k22() { // from class: cp.z6
            @Override // yads.k22
            public final boolean a(l12 l12Var) {
                return ny1.c(this.f51736a, l12Var);
            }
        });
    }

    public final tb3 a(boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (b() && !z10) {
            arrayList.add(sb3.f82587d);
        }
        List list = this.f80868a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            int i10 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((oi) it.next()).f81053f && (i10 = i10 + 1) < 0) {
                    nj.s.t();
                }
            }
            if (i10 >= 2 && a() && !z10) {
                arrayList.add(sb3.f82588e);
            }
        }
        if (c()) {
            arrayList.add(sb3.f82586c);
        }
        if (d() && !z10) {
            return new qb3(pb3.f81342f, this.f80870c, null);
        }
        return new rb3(arrayList);
    }
}
