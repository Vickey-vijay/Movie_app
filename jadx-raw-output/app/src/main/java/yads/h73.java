package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import yads.h73;
import yads.xq;

/* JADX INFO: loaded from: classes8.dex */
public final class h73 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f78086g = new wq() { // from class: cp.h2
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return h73.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mx0[] f78090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78091f;

    public h73(String str, mx0... mx0VarArr) {
        ni.a(mx0VarArr.length > 0);
        this.f78088c = str;
        this.f78090e = mx0VarArr;
        this.f78087b = mx0VarArr.length;
        int iD = ht1.d(mx0VarArr[0].f80429m);
        this.f78089d = iD == -1 ? ht1.d(mx0VarArr[0].f80428l) : iD;
        a();
    }

    public final mx0 a(int i10) {
        return this.f78090e[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h73.class != obj.getClass()) {
            return false;
        }
        h73 h73Var = (h73) obj;
        return this.f78088c.equals(h73Var.f78088c) && Arrays.equals(this.f78090e, h73Var.f78090e);
    }

    public final int a(mx0 mx0Var) {
        int i10 = 0;
        while (true) {
            mx0[] mx0VarArr = this.f78090e;
            if (i10 >= mx0VarArr.length) {
                return -1;
            }
            if (mx0Var == mx0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final int hashCode() {
        if (this.f78091f == 0) {
            this.f78091f = k4.a(this.f78088c, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + Arrays.hashCode(this.f78090e);
        }
        return this.f78091f;
    }

    public static h73 a(Bundle bundle) {
        sm2 sm2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m51 m51Var = p51.f81258c;
            sm2VarA = sm2.f82697f;
        } else {
            sm2VarA = yq.a(mx0.I, parcelableArrayList);
        }
        return new h73(bundle.getString(Integer.toString(1, 36), ""), (mx0[]) sm2VarA.toArray(new mx0[0]));
    }

    public h73(mx0... mx0VarArr) {
        this("", mx0VarArr);
    }

    public final void a() {
        String str = this.f78090e[0].f80420d;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i10 = this.f78090e[0].f80422f | 16384;
        int i11 = 1;
        while (true) {
            mx0[] mx0VarArr = this.f78090e;
            if (i11 >= mx0VarArr.length) {
                return;
            }
            String str2 = mx0VarArr[i11].f80420d;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                mx0[] mx0VarArr2 = this.f78090e;
                ih1.b("TrackGroup", ih1.a("", new IllegalStateException("Different languages combined in one TrackGroup: '" + mx0VarArr2[0].f80420d + "' (track 0) and '" + mx0VarArr2[i11].f80420d + "' (track " + i11 + ")")));
                return;
            }
            mx0[] mx0VarArr3 = this.f78090e;
            if (i10 != (mx0VarArr3[i11].f80422f | 16384)) {
                ih1.b("TrackGroup", ih1.a("", new IllegalStateException("Different role flags combined in one TrackGroup: '" + Integer.toBinaryString(mx0VarArr3[0].f80422f) + "' (track 0) and '" + Integer.toBinaryString(this.f78090e[i11].f80422f) + "' (track " + i11 + ")")));
                return;
            }
            i11++;
        }
    }
}
