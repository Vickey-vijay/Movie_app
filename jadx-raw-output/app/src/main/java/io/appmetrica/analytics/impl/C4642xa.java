package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4642xa implements HostRetryInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4064af f57928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ud f57929b;

    public final Ud a() {
        return this.f57929b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f57928a.a(this.f57929b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f57928a.a(this.f57929b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j10) {
        this.f57928a.b(this.f57929b, j10).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i10) {
        this.f57928a.b(this.f57929b, i10).b();
    }

    public C4642xa(C4064af c4064af, Ud ud2) {
        this.f57928a = c4064af;
        this.f57929b = ud2;
    }
}
