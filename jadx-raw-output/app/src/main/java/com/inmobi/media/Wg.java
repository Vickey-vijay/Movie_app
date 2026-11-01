package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23748a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23749b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wg)) {
            return false;
        }
        Wg wg2 = (Wg) obj;
        return this.f23748a == wg2.f23748a && this.f23749b == wg2.f23749b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23749b) + (Integer.hashCode(this.f23748a) * 31);
    }

    public final String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.f23748a + ", noOfSubscriptions=" + this.f23749b + ")";
    }
}
