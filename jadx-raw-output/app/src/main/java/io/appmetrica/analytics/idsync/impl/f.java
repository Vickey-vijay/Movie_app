package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f54874a;

    public f(h hVar) {
        this.f54874a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f54874a.f54881f && (idSyncConfig = this.f54874a.f54880e) != null) {
            this.f54874a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f54874a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f54879d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f54874a;
                IHandlerExecutor iHandlerExecutor = hVar2.f54878c;
                f fVar = hVar2.f54882g;
                if (fVar == null) {
                    ck.p.B("syncRunnable");
                    fVar = null;
                }
                iHandlerExecutor.executeDelayed(fVar, this.f54874a.f54877b);
            }
        }
    }
}
