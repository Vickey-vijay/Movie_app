package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4331ko implements InterfaceC4355lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f57157a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4355lm
    public final void a(C4226gm c4226gm) {
        this.f57157a.updateConfiguration(new UtilityServiceConfiguration(c4226gm.f56852v, c4226gm.f56851u));
    }

    public C4331ko(UtilityServiceProvider utilityServiceProvider) {
        this.f57157a = utilityServiceProvider;
    }
}
