package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4468qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f57557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57558b;

    public C4468qa() {
        this(false);
    }

    public C4468qa(boolean z10) {
        this.f57557a = new HashMap();
        this.f57558b = z10;
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f57557a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f57557a.toString();
    }
}
