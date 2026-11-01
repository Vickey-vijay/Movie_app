package com.applovin.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class n0 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f8496h;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f7705a.t().a(n0.this.f8495g, n0.this.f8496h.f(), i10, jSONObject, null, true);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f7705a.t().a(n0.this.f8495g, n0.this.f8496h.f(), i10, jSONObject, str2, false);
        }
    }

    public n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f8495g = str;
        this.f8496h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7705a.q0().a(new a(this.f8496h, this.f7705a, d()));
    }
}
