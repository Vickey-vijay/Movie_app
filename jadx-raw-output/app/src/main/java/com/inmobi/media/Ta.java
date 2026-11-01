package com.inmobi.media;

/* JADX INFO: loaded from: classes8.dex */
public final class Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f23555b;

    public Ta(int i10) {
        this.f23554a = i10;
        this.f23555b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ta)) {
            return false;
        }
        Ta ta2 = (Ta) obj;
        return this.f23554a == ta2.f23554a && ck.p.e(this.f23555b, ta2.f23555b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f23554a) * 31;
        Integer num = this.f23555b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f23554a + ", errorCode=" + this.f23555b + ")";
    }

    public Ta(int i10, Integer num) {
        this.f23554a = i10;
        this.f23555b = num;
    }
}
