package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4114cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56513b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4114cd)) {
            return false;
        }
        C4114cd c4114cd = (C4114cd) obj;
        return ck.p.e(this.f56512a, c4114cd.f56512a) && this.f56513b == c4114cd.f56513b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f56512a.hashCode() * 31;
        boolean z10 = this.f56513b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f56512a + ", loaded=" + this.f56513b + ')';
    }

    public C4114cd(String str, boolean z10) {
        this.f56512a = str;
        this.f56513b = z10;
    }
}
