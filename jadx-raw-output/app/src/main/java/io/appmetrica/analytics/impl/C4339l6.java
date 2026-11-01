package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4339l6 implements Ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f57175a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(Throwable th2, V v10) {
        Iterator it = this.f57175a.iterator();
        while (it.hasNext()) {
            ((Ga) it.next()).a(th2, v10);
        }
    }

    public final void a(Ga... gaArr) {
        nj.x.D(this.f57175a, gaArr);
    }

    public final void a(List<? extends Ga> list) {
        this.f57175a.addAll(list);
    }

    public final void a() {
        this.f57175a.clear();
    }
}
