package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rh0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi0 f82269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f82270c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh0)) {
            return false;
        }
        rh0 rh0Var = (rh0) obj;
        return ck.p.e(this.f82268a, rh0Var.f82268a) && ck.p.e(this.f82269b, rh0Var.f82269b) && ck.p.e(this.f82270c, rh0Var.f82270c);
    }

    @Override // yads.m0
    public final String a() {
        return this.f82268a;
    }

    public final int hashCode() {
        return this.f82270c.hashCode() + ((this.f82269b.hashCode() + (this.f82268a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DivKitAdtuneAction(actionType=" + this.f82268a + ", design=" + this.f82269b + ", trackingUrls=" + this.f82270c + ")";
    }

    public rh0(String str, gi0 gi0Var, ArrayList arrayList) {
        this.f82268a = str;
        this.f82269b = gi0Var;
        this.f82270c = arrayList;
    }
}
