package io.appmetrica.analytics.billing.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4044a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54432b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4044a)) {
            return false;
        }
        C4044a c4044a = (C4044a) obj;
        return ck.p.e(this.f54431a, c4044a.f54431a) && this.f54432b == c4044a.f54432b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f54431a.hashCode() * 31;
        boolean z10 = this.f54432b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f54431a + ", firstInappCheckOccurred=" + this.f54432b + ')';
    }

    public C4044a(List list, boolean z10) {
        this.f54431a = list;
        this.f54432b = z10;
    }
}
