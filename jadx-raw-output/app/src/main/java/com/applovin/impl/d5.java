package com.applovin.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d5 extends k3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a3 f7257k;

    public boolean A() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public b5.b t() {
        return b5.b.values()[a("signal_cache_level", ((Integer) this.f7799a.a(r3.Q7)).intValue())];
    }

    @Override // com.applovin.impl.k3
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + '}';
    }

    public a3 u() {
        return this.f7257k;
    }

    public long v() {
        return a("signal_expiration_ms", ((Long) this.f7799a.a(r3.P7)).longValue());
    }

    public boolean w() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean x() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("fail_collection_for_empty_signal", (Boolean) this.f7799a.a(r3.f8965x8)).booleanValue();
    }

    public boolean z() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }

    public d5(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var.e(), jSONObject, jSONObject2, kVar);
        this.f7257k = a3Var;
    }
}
