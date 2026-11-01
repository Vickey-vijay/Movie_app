package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4062ad implements ModuleSelfReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rj f56353a = AbstractC4658y1.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56354b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th2) {
        Rj rj2 = this.f56353a;
        rj2.getClass();
        rj2.a(new C4477qj(str, th2));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        Rj rj2 = this.f56353a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f56354b).withName(str).build();
        rj2.getClass();
        rj2.a(new Gj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f56353a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        Rj rj2 = this.f56353a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f56354b).withName(str).withAttributes(map).build();
        rj2.getClass();
        rj2.a(new Gj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        Rj rj2 = this.f56353a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f56354b).withName(str).withValue(str2).build();
        rj2.getClass();
        rj2.a(new Gj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i10, String str, String str2) {
        Rj rj2 = this.f56353a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i10).withName(str).withValue(str2).build();
        rj2.getClass();
        rj2.a(new Gj(moduleEventBuild));
    }
}
