package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f54876a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f54878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f54879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f54880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f54881f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54877b = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f54882g = new f(this);

    public final synchronized void b(IdSyncConfig idSyncConfig) {
        if (!ck.p.e(this.f54880e, idSyncConfig)) {
            this.f54880e = idSyncConfig;
            if (a(idSyncConfig) && !this.f54881f) {
                this.f54876a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f54878c, new g(this));
                this.f54881f = true;
            } else if (!a(idSyncConfig) && this.f54881f) {
                this.f54881f = false;
                IHandlerExecutor iHandlerExecutor = this.f54878c;
                f fVar = this.f54882g;
                if (fVar == null) {
                    ck.p.B("syncRunnable");
                    fVar = null;
                }
                iHandlerExecutor.remove(fVar);
            }
        }
    }

    public h(ServiceContext serviceContext) {
        this.f54876a = serviceContext;
        this.f54878c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f54879d = new p(serviceContext, new B(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")));
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        if (idSyncConfig.getEnabled() && (!idSyncConfig.getRequests().isEmpty())) {
            return true;
        }
        return false;
    }
}
