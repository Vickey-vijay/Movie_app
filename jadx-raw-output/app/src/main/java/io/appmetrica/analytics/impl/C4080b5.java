package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4080b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56407a;

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f56407a);
    }

    public C4080b5(String str) {
        this.f56407a = str;
    }
}
