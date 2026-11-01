package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f55178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55179b;

    public Ec(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f55178a.put(obj, obj2);
    }

    public Ec(HashMap map, Object obj) {
        this.f55178a = map;
        this.f55179b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f55178a.get(obj);
        return obj2 == null ? this.f55179b : obj2;
    }
}
