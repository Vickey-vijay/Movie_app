package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class Wh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f56119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56120b;

    public Wh(C4248hi c4248hi, ModuleEvent moduleEvent) {
        this.f56120b = c4248hi;
        this.f56119a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56120b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportEvent(this.f56119a);
    }
}
