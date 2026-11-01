package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2 f55262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4232h2 f55263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f55264c;

    public final synchronized void a() {
        Iterator it = this.f55264c.iterator();
        while (it.hasNext()) {
            ((InterfaceC4378mk) it.next()).onCreate();
        }
    }

    public Gb(P2 p10, C4232h2 c4232h2) {
        ArrayList arrayList = new ArrayList();
        this.f55264c = arrayList;
        this.f55262a = p10;
        arrayList.add(p10);
        this.f55263b = c4232h2;
        arrayList.add(c4232h2);
    }

    public final synchronized void a(C4393na c4393na) {
        this.f55264c.add(c4393na);
    }
}
