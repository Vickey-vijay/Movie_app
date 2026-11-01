package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f15853a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f15854b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f15855c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f15856d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f15857e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f15858f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f15859g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f15860h = null;

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final HashMap j() {
        HashMap map = new HashMap();
        Long l10 = this.f15854b;
        if (l10 != null && this.f15853a != null) {
            map.put("sdk_init_network_req", Long.valueOf(l10.longValue() - this.f15853a.longValue()));
        }
        Long l11 = this.f15860h;
        if (l11 != null && this.f15854b != null) {
            map.put("sdk_got_response_from_markup_url", Long.valueOf(l11.longValue() - this.f15854b.longValue()));
        }
        Long l12 = this.f15856d;
        if (l12 != null && this.f15860h != null) {
            map.put("sdk_parsed_res", Long.valueOf(l12.longValue() - this.f15860h.longValue()));
        }
        Long l13 = this.f15855c;
        if (l13 != null && this.f15854b != null) {
            map.put("sdk_got_server_res", Long.valueOf(l13.longValue() - this.f15854b.longValue()));
        }
        Long l14 = this.f15856d;
        if (l14 != null && this.f15855c != null) {
            map.put("sdk_parsed_res", Long.valueOf(l14.longValue() - this.f15855c.longValue()));
        }
        Long l15 = this.f15857e;
        if (l15 != null && this.f15856d != null) {
            map.put("ad_loaded_result", Long.valueOf(l15.longValue() - this.f15856d.longValue()));
        }
        Long l16 = this.f15858f;
        if (l16 != null && this.f15857e != null) {
            map.put("publisher_notified", Long.valueOf(l16.longValue() - this.f15857e.longValue()));
        }
        Long l17 = this.f15859g;
        if (l17 != null && this.f15853a != null) {
            map.put("roundtrip", Long.valueOf(l17.longValue() - this.f15853a.longValue()));
        }
        return map;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricsCollectorData{");
        if (this.f15853a != null && this.f15854b != null) {
            sb2.append(" sdk_init_network_req=");
            sb2.append(this.f15854b.longValue() - this.f15853a.longValue());
        }
        if (this.f15860h != null && this.f15854b != null) {
            sb2.append(", sdk_got_response_from_markup_url=");
            sb2.append(this.f15860h.longValue() - this.f15854b.longValue());
        }
        if (this.f15855c != null && this.f15854b != null) {
            sb2.append(", sdk_got_server_res=");
            sb2.append(this.f15855c.longValue() - this.f15854b.longValue());
        }
        if (this.f15856d != null && this.f15855c != null) {
            sb2.append(", sdk_parsed_res=");
            sb2.append(this.f15856d.longValue() - this.f15855c.longValue());
        }
        if (this.f15857e != null && this.f15856d != null) {
            sb2.append(", ad_loaded_result=");
            sb2.append(this.f15857e.longValue() - this.f15856d.longValue());
        }
        if (this.f15858f != null && this.f15857e != null) {
            sb2.append(", publisher_notified=");
            sb2.append(this.f15858f.longValue() - this.f15857e.longValue());
        }
        if (this.f15859g != null && this.f15853a != null) {
            sb2.append(", roundtrip=");
            sb2.append(this.f15859g.longValue() - this.f15853a.longValue());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long b() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f15859g = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long c() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f15853a = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long d() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f15856d = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long e() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f15858f = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long f() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f15854b = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long g() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f15855c = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long h() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f15860h = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long i() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f15857e = lValueOf;
        return lValueOf;
    }
}
