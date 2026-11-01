package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* JADX INFO: loaded from: classes2.dex */
public final class Cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cf f55095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f55096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0 f55097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H0 f55098d;

    public Cd(Cf cf2) {
        this.f55095a = cf2;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f55096b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f55097c = new I0();
    }
}
