package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3023m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f24802b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3023m4) && ck.p.e(this.f24802b.getType(), ((C3023m4) obj).f24802b.getType());
    }

    public C3023m4(String str, Config config) {
        ck.p.j(str, "url");
        ck.p.j(config, "availableConfig");
        this.f24801a = str;
        this.f24802b = config;
    }

    public final int hashCode() {
        return this.f24802b.getType().hashCode();
    }
}
