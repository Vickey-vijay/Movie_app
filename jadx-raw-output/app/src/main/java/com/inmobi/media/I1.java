package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class I1 implements fk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.a f22834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f22836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f22837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22838e;

    public /* synthetic */ I1(Integer num, bk.a aVar, int i10) {
        this(num, aVar, (i10 & 4) == 0, false);
    }

    public I1(Object obj, bk.a aVar, boolean z10, boolean z11) {
        ck.p.j(aVar, "refreshLogic");
        this.f22834a = aVar;
        this.f22835b = z10;
        this.f22836c = obj;
        this.f22837d = new AtomicBoolean(false);
        if (z11) {
            a();
        }
    }

    public final void a() {
        if (this.f22837d.compareAndSet(false, true)) {
            this.f22838e = true;
            nk.j.d(A9.f22351c, null, null, new H1(this, null), 3, null);
        }
    }

    public final Object getValue(Object obj, jk.k kVar) {
        ck.p.j(kVar, "property");
        if (this.f22835b || !this.f22838e) {
            a();
        }
        return this.f22836c;
    }
}
