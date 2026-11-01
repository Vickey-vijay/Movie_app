package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* JADX INFO: loaded from: classes2.dex */
public final class F3 extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4064af f55218a;

    public F3(C4064af c4064af) {
        super(c4064af.e(), "[ClientApiTrackingStatusToggle]");
        this.f55218a = c4064af;
    }

    public final void a(boolean z10) {
        updateState(z10);
        this.f55218a.f(z10);
    }
}
