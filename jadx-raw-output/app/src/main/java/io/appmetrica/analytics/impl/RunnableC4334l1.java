package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4334l1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f57160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57161b;

    public RunnableC4334l1(C4558u1 c4558u1, ExternalAttribution externalAttribution) {
        this.f57161b = c4558u1;
        this.f57160a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57161b).a(this.f57160a);
    }
}
