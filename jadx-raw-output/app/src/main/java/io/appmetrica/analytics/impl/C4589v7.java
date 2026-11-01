package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4589v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f57797a;

    public C4589v7() {
        HashMap map = new HashMap();
        this.f57797a = map;
        map.put("events", AbstractC4537t5.f57702a);
        map.put("sessions", AbstractC4587v5.f57792a);
        map.put("preferences", InterfaceC4562u5.f57754a);
        map.put("binary_data", AbstractC4512s5.f57648a);
    }
}
