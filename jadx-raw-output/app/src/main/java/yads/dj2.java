package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class dj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76695e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2)) {
            return false;
        }
        dj2 dj2Var = (dj2) obj;
        return ib3.a(this.f76691a, dj2Var.f76691a) && ib3.a(this.f76692b, dj2Var.f76692b) && ib3.a(this.f76693c, dj2Var.f76693c) && ib3.a(this.f76694d, dj2Var.f76694d) && ib3.a(this.f76695e, dj2Var.f76695e);
    }

    public final int hashCode() {
        String str = this.f76691a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f76692b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76693c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f76694d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f76695e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public dj2(String str, String str2, String str3, String str4, String str5) {
        this.f76691a = str;
        this.f76692b = str2;
        this.f76693c = str3;
        this.f76694d = str4;
        this.f76695e = str5;
    }
}
