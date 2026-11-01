package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76195c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return ck.p.e(this.f76193a, c7Var.f76193a) && this.f76194b == c7Var.f76194b && this.f76195c == c7Var.f76195c;
    }

    public final List a() {
        return this.f76193a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76195c) + nd3.a(this.f76194b, this.f76193a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdPod(items=" + this.f76193a + ", closableAdPosition=" + this.f76194b + ", rewardAdPosition=" + this.f76195c + ")";
    }

    public c7(List list, int i10, int i11) {
        this.f76193a = list;
        this.f76194b = i10;
        this.f76195c = i11;
    }
}
