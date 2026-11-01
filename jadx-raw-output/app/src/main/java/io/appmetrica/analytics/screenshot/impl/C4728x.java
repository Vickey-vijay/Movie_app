package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4728x implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f58466a;

    public final void a(String str) {
        this.f58466a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(nj.l0.g(mj.h.a("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }

    public C4728x(ClientContext clientContext) {
        this.f58466a = clientContext;
    }
}
