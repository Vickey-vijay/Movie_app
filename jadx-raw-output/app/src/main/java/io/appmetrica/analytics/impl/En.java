package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public final class En {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dn f55207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiFunction f55208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Df f55209c;

    public En() {
        this(new Bn(), new C4368ma(), C4105c4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map mapC;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Cn());
        try {
            mapC = this.f55207a.c();
        } catch (SecurityException unused) {
            mapC = null;
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C4655xn) this.f55208b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public En(Dn dn2, C4368ma c4368ma, C4513s6 c4513s6) {
        this.f55207a = dn2;
        this.f55208b = c4368ma;
        this.f55209c = c4513s6;
    }
}
