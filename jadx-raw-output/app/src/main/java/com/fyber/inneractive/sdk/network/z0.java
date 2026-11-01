package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f16143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f16144q;

    public z0(f0 f0Var, String str) {
        super(f0Var, g0.f16028c.a(), null);
        this.f16144q = new AtomicInteger();
        this.f16143p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        try {
            o0 o0Var = new o0();
            o0Var.f16063a = String.valueOf(i10);
            InputStream inputStream = lVar.f16041c;
            if (inputStream != null) {
                o0Var.f16064b = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
            }
            return o0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse hit network request", e10, new Object[0]);
            throw new n0(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f16144q.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f16143p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f16144q.getAndIncrement() < 4;
    }

    public static void b(String str) {
        IAConfigManager.O.f15024s.a(new z0(new y0(str, System.currentTimeMillis()), str));
    }
}
