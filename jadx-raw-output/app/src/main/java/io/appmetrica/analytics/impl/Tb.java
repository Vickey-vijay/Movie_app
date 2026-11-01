package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.Tb;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class Tb implements Qb, ToggleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55916a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f55917b = C4418oa.k().w().b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ln f55918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55919d;

    public final void a(Toggle toggle) {
        Ln ln2 = new Ln(toggle);
        this.f55918c = ln2;
        ln2.f55532c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Ln ln2 = this.f55918c;
        if (ln2 == null) {
            ck.p.B("togglesHolder");
            ln2 = null;
        }
        ln2.f55531b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z10) {
        this.f55917b.execute(new Runnable() { // from class: af.p
            @Override // java.lang.Runnable
            public final void run() {
                Tb.a(this.f3573b, z10);
            }
        });
    }

    public final void a(final LocationControllerObserver locationControllerObserver, final boolean z10) {
        this.f55917b.execute(new Runnable() { // from class: af.q
            @Override // java.lang.Runnable
            public final void run() {
                Tb.a(this.f3576b, locationControllerObserver, z10);
            }
        });
    }

    public static final void a(Tb tb2, LocationControllerObserver locationControllerObserver, boolean z10) {
        tb2.f55916a.add(locationControllerObserver);
        if (z10) {
            if (tb2.f55919d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Tb tb2, boolean z10) {
        if (tb2.f55919d != z10) {
            tb2.f55919d = z10;
            bk.l lVar = z10 ? Rb.f55818a : Sb.f55861a;
            Iterator it = tb2.f55916a.iterator();
            while (it.hasNext()) {
                lVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        Ln ln2 = this.f55918c;
        if (ln2 == null) {
            ck.p.B("togglesHolder");
            ln2 = null;
        }
        ln2.f55531b.a(obj);
    }

    public final void a(boolean z10) {
        Ln ln2 = this.f55918c;
        if (ln2 == null) {
            ck.p.B("togglesHolder");
            ln2 = null;
        }
        ln2.f55530a.a(z10);
    }
}
