package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public class o5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f8645g;

    public interface a {
        void a(v.a aVar);
    }

    public o5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f8645g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8645g.a(this.f7705a.A().f());
    }
}
