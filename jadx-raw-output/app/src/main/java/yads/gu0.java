package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gu0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77939b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu0)) {
            return false;
        }
        gu0 gu0Var = (gu0) obj;
        return ck.p.e(this.f77938a, gu0Var.f77938a) && ck.p.e(this.f77939b, gu0Var.f77939b);
    }

    @Override // yads.m0
    public final String a() {
        return this.f77938a;
    }

    public final int hashCode() {
        return this.f77939b.hashCode() + (this.f77938a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackAction(actionType=" + this.f77938a + ", items=" + this.f77939b + ")";
    }

    public gu0(String str, ArrayList arrayList) {
        this.f77938a = str;
        this.f77939b = arrayList;
    }
}
