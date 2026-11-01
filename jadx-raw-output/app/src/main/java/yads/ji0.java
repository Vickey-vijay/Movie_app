package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class ji0 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f79050a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji0) && ck.p.e(this.f79050a, ((ji0) obj).f79050a);
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        String str = this.f79050a.f83819k;
        eg0[] eg0VarArr = eg0.f77061b;
        return ck.p.e("divkit", str);
    }

    public final int hashCode() {
        return this.f79050a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.f79050a + ")";
    }

    public ji0(v9 v9Var) {
        this.f79050a = v9Var;
    }
}
