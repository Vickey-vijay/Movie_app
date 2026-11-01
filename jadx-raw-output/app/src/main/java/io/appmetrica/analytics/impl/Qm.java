package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f55811a;

    public static Rm a(Class cls) {
        return (Rm) Pm.f55759a.f55811a.get(cls);
    }

    public Qm() {
        HashMap map = new HashMap();
        this.f55811a = map;
        Km km2 = new Km();
        Lm lm2 = new Lm();
        Mm mm2 = new Mm();
        Nm nm2 = new Nm();
        map.put(C4329km.class, km2);
        map.put(U1.class, lm2);
        map.put(C4167ef.class, mm2);
        map.put(C4535t3.class, nm2);
    }
}
