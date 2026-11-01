package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.C4088bd;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4088bd implements ModuleServiceLifecycleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1 f56421a;

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f56421a.b(new J1() { // from class: af.a0
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                C4088bd.a(moduleServiceLifecycleObserver, intent);
            }
        });
        this.f56421a.a(new J1() { // from class: af.b0
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                C4088bd.b(moduleServiceLifecycleObserver, intent);
            }
        });
    }

    public C4088bd(K1 k10) {
        this.f56421a = k10;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }
}
