package com.ironsource;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<I> f26902b = new CopyOnWriteArrayList();

    public final void a(I i10) {
        if (b()) {
            return;
        }
        if (a()) {
            nj.x.J(this.f26902b);
        }
        if (i10 == null) {
            i10 = new I(C3656q0.a.NotPartOfWaterfall);
        }
        this.f26902b.add(i10);
    }

    private final boolean b() {
        return this.f26901a == 0;
    }

    private final boolean c() {
        return this.f26901a != -1;
    }

    public final String d() {
        List<I> list = this.f26902b;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((I) it.next()).b().ordinal()));
        }
        return nj.b0.p0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public K(int i10) {
        this.f26901a = i10;
    }

    private final boolean a() {
        return c() && this.f26902b.size() >= this.f26901a;
    }
}
