package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f22865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22867d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ie)) {
            return false;
        }
        Ie ie2 = (Ie) obj;
        return this.f22864a == ie2.f22864a && ck.p.e(this.f22865b, ie2.f22865b) && this.f22866c == ie2.f22866c && ck.p.e(this.f22867d, ie2.f22867d);
    }

    public Ie(long j10, Map map, int i10, String str) {
        ck.p.j(map, "headers");
        this.f22864a = j10;
        this.f22865b = map;
        this.f22866c = i10;
        this.f22867d = str;
    }

    public final int hashCode() {
        int iA = AbstractC2862fi.a(this.f22866c, (this.f22865b.hashCode() + (Long.hashCode(this.f22864a) * 31)) * 31, 31);
        String str = this.f22867d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkMetaData(timeTaken=" + this.f22864a + ", headers=" + this.f22865b + ", contentLength=" + this.f22866c + ", contentType=" + this.f22867d + ")";
    }
}
