package com.fyber.inneractive.sdk.network;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f16032p;

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public h1(f0 f0Var, String str) {
        super(f0Var, g0.f16028c.a(), null);
        this.f16032p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) {
        o0 o0Var = new o0();
        com.fyber.inneractive.sdk.click.c cVar = new com.fyber.inneractive.sdk.click.c();
        if (lVar != null) {
            ArrayList arrayList = lVar.f16044f;
            cVar.f14966a.clear();
            cVar.f14966a.addAll(arrayList);
            InputStream inputStream = lVar.f16041c;
            if (inputStream != null) {
                String string = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
                cVar.f14967b = string;
                o0Var.f16064b = string;
            }
        }
        o0Var.f16063a = cVar;
        return o0Var;
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
        return this.f16032p;
    }
}
