package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f15995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f15996q;

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String n() {
        return "application/x-protobuf; messageType=IgniteRequest";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return "https://init-mp.fyber.com/init";
    }

    public a1(com.fyber.inneractive.sdk.ignite.b bVar, byte[] bArr, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(bVar, g0.f16028c.a(), rVar);
        this.f15996q = new AtomicInteger();
        this.f15995p = bArr;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        try {
            o0 o0Var = new o0();
            InputStream inputStream = lVar.f16041c;
            if (inputStream != null) {
                String str = new String(com.fyber.inneractive.sdk.util.v.a(inputStream), "UTF-8");
                IgniteResponseOuterClass$IgniteResponse from = IgniteResponseOuterClass$IgniteResponse.parseFrom(str.getBytes());
                o0Var.f16064b = str;
                o0Var.f16063a = from;
            }
            return o0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse ignite network request", e10, new Object[0]);
            throw new n0(e10);
        } catch (Throwable th2) {
            IAlog.a("failed parse ignite network request", th2, new Object[0]);
            throw new n0("failed to parse ignite network request");
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        return this.f15995p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f15996q.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f15996q.getAndIncrement() < 4;
    }
}
