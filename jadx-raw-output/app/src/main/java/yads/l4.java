package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f79700d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.f79697a == l4Var.f79697a && ck.p.e(this.f79698b, l4Var.f79698b) && ck.p.e(this.f79699c, l4Var.f79699c) && ck.p.e(this.f79700d, l4Var.f79700d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f79699c, k4.a(this.f79698b, Integer.hashCode(this.f79697a) * 31, 31), 31);
        String str = this.f79700d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f79697a), this.f79698b, this.f79700d, this.f79699c}, 4));
        ck.p.i(str, "format(...)");
        return str;
    }

    public l4(int i10, String str, String str2, String str3) {
        this.f79697a = i10;
        this.f79698b = str;
        this.f79699c = str2;
        this.f79700d = str3;
    }
}
