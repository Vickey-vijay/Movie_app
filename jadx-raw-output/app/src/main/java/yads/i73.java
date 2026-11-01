package yads;

import android.os.Bundle;
import java.util.ArrayList;
import yads.i73;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class i73 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i73 f78512e = new i73(new h73[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wq f78513f = new wq() { // from class: cp.q2
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return i73.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sm2 f78515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78516d;

    public final h73 a(int i10) {
        return (h73) this.f78515c.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i73.class != obj.getClass()) {
            return false;
        }
        i73 i73Var = (i73) obj;
        return this.f78514b == i73Var.f78514b && this.f78515c.equals(i73Var.f78515c);
    }

    public static i73 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return parcelableArrayList == null ? new i73(new h73[0]) : new i73((h73[]) yq.a(h73.f78086g, parcelableArrayList).toArray(new h73[0]));
    }

    public final int hashCode() {
        if (this.f78516d == 0) {
            this.f78516d = this.f78515c.hashCode();
        }
        return this.f78516d;
    }

    public i73(h73... h73VarArr) {
        this.f78515c = p51.b(h73VarArr);
        this.f78514b = h73VarArr.length;
        a();
    }

    public final void a() {
        int i10 = 0;
        while (i10 < this.f78515c.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f78515c.size(); i12++) {
                if (((h73) this.f78515c.get(i10)).equals(this.f78515c.get(i12))) {
                    ih1.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }
}
