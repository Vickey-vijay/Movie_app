package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public final class Nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23253b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nj)) {
            return false;
        }
        Nj nj2 = (Nj) obj;
        return ck.p.e(this.f23252a, nj2.f23252a) && ck.p.e(this.f23253b, nj2.f23253b);
    }

    public Nj(String str, String str2) {
        ck.p.j(str, "tableName");
        ck.p.j(str2, "tableSchema");
        this.f23252a = str;
        this.f23253b = str2;
    }

    public final int hashCode() {
        return this.f23253b.hashCode() + (this.f23252a.hashCode() * 31);
    }

    public final String toString() {
        return "TableInfo(tableName=" + this.f23252a + ", tableSchema=" + this.f23253b + ")";
    }
}
