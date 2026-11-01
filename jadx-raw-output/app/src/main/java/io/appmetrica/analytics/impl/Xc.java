package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* JADX INFO: loaded from: classes7.dex */
public final class Xc implements ModuleEventServiceHandlerContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulePreferences f56142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModulePreferences f56143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModuleEventServiceHandlerReporter f56144c;

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f56144c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f56143b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getModulePreferences() {
        return this.f56142a;
    }

    public Xc(ModulePreferences modulePreferences, ModulePreferences modulePreferences2, ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f56142a = modulePreferences;
        this.f56143b = modulePreferences2;
        this.f56144c = moduleEventServiceHandlerReporter;
    }
}
