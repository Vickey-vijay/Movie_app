package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4469qb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f57559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f57560b;

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f57559a.get();
        J2 j10 = (J2) this.f57560b.get();
        if (handler == null || j10 == null) {
            return;
        }
        boolean z10 = !j10.f55378b.f();
        if (z10) {
            PublicLogger publicLogger = j10.f55379c;
            Set set = AbstractC4641x9.f57918a;
            EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
            N3 n10 = new N3("", "", 3, 0, publicLogger);
            C4650xi c4650xi = j10.f55384h;
            Gh gh2 = j10.f55378b;
            c4650xi.getClass();
            c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        }
        if (z10) {
            C4444pb.a(handler, j10, this);
        }
    }

    public RunnableC4469qb(Handler handler, J2 j10) {
        this.f57559a = new WeakReference(handler);
        this.f57560b = new WeakReference(j10);
    }
}
