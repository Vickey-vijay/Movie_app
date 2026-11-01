package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2808df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f24240a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2808df) && ck.p.e(this.f24240a, ((C2808df) obj).f24240a);
    }

    public C2808df(Map map) {
        ck.p.j(map, "requestParams");
        this.f24240a = map;
    }

    public final int hashCode() {
        return this.f24240a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f24240a + ")";
    }
}
