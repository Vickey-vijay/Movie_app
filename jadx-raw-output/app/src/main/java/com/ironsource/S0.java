package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class S0 extends com.ironsource.mediationsdk.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, K> f27568e;

    public final void a(yg ygVar) {
        ck.p.j(ygVar, "waterfallInstances");
        List<A> listB = ygVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(listB, 10)), 16));
        for (A a10 : listB) {
            Pair pairA = mj.h.a(a10.p(), a10.s());
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        a(linkedHashMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(List<? extends NetworkSettings> list, int i10) {
        super(list, i10);
        ck.p.j(list, Ne.f27190y0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pairA = mj.h.a(((NetworkSettings) it.next()).getProviderName(), new K(i10));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        this.f27568e = linkedHashMap;
    }

    @Override // com.ironsource.mediationsdk.h
    public String a(String str) {
        String strD;
        ck.p.j(str, "instanceName");
        K k10 = this.f27568e.get(str);
        return (k10 == null || (strD = k10.d()) == null) ? "" : strD;
    }

    private final void a(Map<String, I> map) {
        for (Map.Entry<String, K> entry : this.f27568e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }
}
