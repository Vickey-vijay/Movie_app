package yads;

import android.net.Uri;
import android.os.Bundle;
import yads.cm1;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class cm1 implements xq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cm1 f76322d = new cm1(new bm1());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f76323e = new wq() { // from class: cp.q0
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return cm1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f76324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76325c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm1)) {
            return false;
        }
        cm1 cm1Var = (cm1) obj;
        return ib3.a(this.f76324b, cm1Var.f76324b) && ib3.a(this.f76325c, cm1Var.f76325c);
    }

    public static cm1 a(Bundle bundle) {
        bm1 bm1Var = new bm1();
        bm1Var.f75893a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
        bm1Var.f75894b = bundle.getString(Integer.toString(1, 36));
        bm1Var.f75895c = bundle.getBundle(Integer.toString(2, 36));
        return new cm1(bm1Var);
    }

    public final int hashCode() {
        Uri uri = this.f76324b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f76325c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public cm1(bm1 bm1Var) {
        this.f76324b = bm1Var.f75893a;
        this.f76325c = bm1Var.f75894b;
    }
}
