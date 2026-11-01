package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3123q4 extends AbstractC3098p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f25139b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3123q4)) {
            return false;
        }
        C3123q4 c3123q4 = (C3123q4) obj;
        return this.f25138a == c3123q4.f25138a && ck.p.e(this.f25139b, c3123q4.f25139b);
    }

    public C3123q4(int i10, Config config) {
        ck.p.j(config, "config");
        this.f25138a = i10;
        this.f25139b = config;
    }

    public final int hashCode() {
        return this.f25139b.hashCode() + (Integer.hashCode(this.f25138a) * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.f25138a + ", config=" + this.f25139b + ")";
    }
}
