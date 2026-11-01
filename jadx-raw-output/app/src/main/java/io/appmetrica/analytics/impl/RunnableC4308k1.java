package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4308k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f57065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57066b;

    public RunnableC4308k1(C4558u1 c4558u1, AnrListener anrListener) {
        this.f57066b = c4558u1;
        this.f57065a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57066b).a(this.f57065a);
    }
}
