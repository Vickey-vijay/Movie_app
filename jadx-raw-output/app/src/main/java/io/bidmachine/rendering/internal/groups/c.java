package io.bidmachine.rendering.internal.groups;

import ck.p;
import io.bidmachine.rendering.internal.event.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj.t;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f60407a;

    public c(b bVar) {
        p.j(bVar, "stateGroupController");
        this.f60407a = bVar;
    }

    @Override // io.bidmachine.rendering.internal.event.e
    public boolean a(List list) {
        p.j(list, "params");
        if (list.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return !this.f60407a.a(arrayList);
    }
}
