package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4510s3 implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f57645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T7 f57646b;

    public final C4510s3 a(Map<String, String> map, T7 t10) {
        return new C4510s3(map, t10);
    }

    public final Map<String, String> b() {
        return this.f57645a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4510s3)) {
            return false;
        }
        C4510s3 c4510s3 = (C4510s3) obj;
        return ck.p.e(this.f57645a, c4510s3.f57645a) && this.f57646b == c4510s3.f57646b;
    }

    public static C4510s3 a(C4510s3 c4510s3, Map map, T7 t10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = c4510s3.f57645a;
        }
        if ((i10 & 2) != 0) {
            t10 = c4510s3.f57646b;
        }
        c4510s3.getClass();
        return new C4510s3(map, t10);
    }

    public final T7 c() {
        return this.f57646b;
    }

    public final Map<String, String> d() {
        return this.f57645a;
    }

    public final int hashCode() {
        Map map = this.f57645a;
        return this.f57646b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f57645a + ", source=" + this.f57646b + ')';
    }

    public C4510s3(Map<String, String> map, T7 t10) {
        this.f57645a = map;
        this.f57646b = t10;
    }

    @Override // io.appmetrica.analytics.impl.U7
    public final T7 a() {
        return this.f57646b;
    }
}
