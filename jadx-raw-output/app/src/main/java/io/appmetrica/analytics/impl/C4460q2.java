package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4460q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xe f57539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f57542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f57543e;

    public final void a(Map map) {
        long jCurrentTimeMillis = this.f57542d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < jCurrentTimeMillis - this.f57541c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }

    public C4460q2(R4 r10, Xe xe2) {
        this.f57539a = xe2;
        r10.b();
        this.f57540b = TimeUnit.MINUTES.toMillis(1L);
        this.f57541c = TimeUnit.DAYS.toMillis(7L);
        this.f57542d = new SystemTimeProvider();
        Map<String, Long> mapF = xe2.f();
        a(mapF);
        this.f57543e = mapF;
    }
}
