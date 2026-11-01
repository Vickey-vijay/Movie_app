package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class kz2 implements c92 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f79631c = nj.s.n(qy2.f82038b, qy2.f82039c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f79632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79633b;

    @Override // yads.c92
    public final void a(qy2 qy2Var, qb3 qb3Var) {
        c92 c92Var = (c92) this.f79632a.get(qy2Var);
        if (c92Var != null) {
            c92Var.a(qy2Var, qb3Var);
        }
    }

    @Override // yads.c92
    public final void a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            qy2 qy2Var = ((h92) obj).f78125a.f76212d;
            Object arrayList = linkedHashMap.get(qy2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(qy2Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : nj.k0.b(linkedHashMap, jz2.f79252b).entrySet()) {
            qy2 qy2Var2 = (qy2) entry.getKey();
            List list2 = (List) entry.getValue();
            c92 c92Var = (c92) this.f79632a.get(qy2Var2);
            if (c92Var != null) {
                c92Var.a(list2);
            }
        }
    }

    @Override // yads.c92
    public final void invalidate() {
        Iterator it = this.f79632a.values().iterator();
        while (it.hasNext()) {
            ((c92) it.next()).invalidate();
        }
    }

    public kz2(e83 e83Var, e83 e83Var2) {
        this.f79632a = kotlin.collections.a.m(mj.h.a(qy2.f82038b, e83Var), mj.h.a(qy2.f82039c, e83Var2));
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, List list, rb3 rb3Var) {
        if (!this.f79633b) {
            this.f79633b = true;
            List listZ0 = nj.b0.z0(list, qy2Var);
            for (qy2 qy2Var2 : nj.b0.v0(f79631c, nj.b0.T0(listZ0))) {
                a(qy2Var2, rb3Var);
                a(qy2Var2, listZ0, rb3Var);
            }
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((qy2) it.next()) == qy2Var) {
                    return;
                }
            }
        }
        c92 c92Var = (c92) this.f79632a.get(qy2Var);
        if (c92Var != null) {
            c92Var.a(qy2Var, list, rb3Var);
        }
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, rb3 rb3Var) {
        c92 c92Var = (c92) this.f79632a.get(qy2Var);
        if (c92Var != null) {
            c92Var.a(qy2Var, rb3Var);
        }
    }

    @Override // yads.c92
    public final void a(v9 v9Var) {
        Iterator it = this.f79632a.values().iterator();
        while (it.hasNext()) {
            ((c92) it.next()).a(v9Var);
        }
    }
}
