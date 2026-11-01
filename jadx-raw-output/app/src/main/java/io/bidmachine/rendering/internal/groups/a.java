package io.bidmachine.rendering.internal.groups;

import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lk.a0;
import lk.x;
import mj.r;
import nj.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f60405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f60406b;

    public a(List list) {
        p.j(list, "initial");
        this.f60405a = list;
        this.f60406b = new HashSet(list);
    }

    private final void b(String str) {
        if (this.f60406b.contains(str)) {
            return;
        }
        this.f60406b.add(str);
    }

    private final void c(String str) {
        if (x.R(str, C3426d4.j.f28584c, false, 2, null)) {
            String strSubstring = str.substring(1);
            p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            b(strSubstring);
        } else if (x.R(str, "!", false, 2, null)) {
            String strSubstring2 = str.substring(1);
            p.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            e(strSubstring2);
        }
    }

    private final void e(String str) {
        if (p.e(str, "default")) {
            return;
        }
        this.f60406b.remove(str);
    }

    @Override // io.bidmachine.rendering.internal.groups.b
    public boolean a(List list) {
        boolean z10;
        p.j(list, "stateGroups");
        synchronized (this.f60406b) {
            if (list.isEmpty()) {
                z10 = true;
            } else {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (d((String) it.next())) {
                                z10 = true;
                            }
                        }
                    }
                }
                z10 = false;
            }
        }
        return z10;
    }

    public boolean d(String str) {
        boolean z10;
        p.j(str, "stateGroup");
        synchronized (this.f60406b) {
            z10 = p.e(str, "default") || this.f60406b.contains(str);
        }
        return z10;
    }

    @Override // io.bidmachine.rendering.internal.groups.b
    public void a(String str) {
        p.j(str, "stateGroups");
        synchronized (this.f60406b) {
            List listN0 = a0.N0(str, new String[]{Z7.f27998r}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(t.v(listN0, 10));
            Iterator it = listN0.iterator();
            while (it.hasNext()) {
                arrayList.add(a0.k1((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!a0.n0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c((String) it2.next());
            }
            r rVar = r.f64562a;
        }
    }
}
