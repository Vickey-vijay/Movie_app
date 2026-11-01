package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2965jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f24631b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2965jl)) {
            return false;
        }
        C2965jl c2965jl = (C2965jl) obj;
        return this.f24630a == c2965jl.f24630a && ck.p.e(this.f24631b, c2965jl.f24631b);
    }

    public C2965jl(int i10, Config config) {
        ck.p.j(config, "config");
        this.f24630a = i10;
        this.f24631b = config;
    }

    public final int hashCode() {
        return this.f24631b.hashCode() + (Integer.hashCode(this.f24630a) * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.f24630a + ", config=" + this.f24631b + ")";
    }
}
