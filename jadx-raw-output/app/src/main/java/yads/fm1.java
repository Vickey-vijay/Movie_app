package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import yads.fm1;
import yads.xq;

/* JADX INFO: loaded from: classes9.dex */
public final class fm1 implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wq f77442h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final am1 f77444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yl1 f77445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jm1 f77446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ul1 f77447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cm1 f77448g;

    public static fm1 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        yl1 yl1Var = bundle2 == null ? yl1.f85037g : (yl1) yl1.f85038h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        jm1 jm1Var = bundle3 == null ? jm1.H : (jm1) jm1.I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        ul1 ul1Var = bundle4 == null ? ul1.f83532h : (ul1) tl1.f83078g.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new fm1(string, ul1Var, null, yl1Var, jm1Var, bundle5 == null ? cm1.f76322d : (cm1) cm1.f76323e.fromBundle(bundle5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm1)) {
            return false;
        }
        fm1 fm1Var = (fm1) obj;
        return ib3.a(this.f77443b, fm1Var.f77443b) && this.f77447f.equals(fm1Var.f77447f) && ib3.a(this.f77444c, fm1Var.f77444c) && ib3.a(this.f77445d, fm1Var.f77445d) && ib3.a(this.f77446e, fm1Var.f77446e) && ib3.a(this.f77448g, fm1Var.f77448g);
    }

    public final int hashCode() {
        int iHashCode = this.f77443b.hashCode() * 31;
        am1 am1Var = this.f77444c;
        return this.f77448g.hashCode() + ((this.f77446e.hashCode() + ((this.f77447f.hashCode() + ((this.f77445d.hashCode() + ((iHashCode + (am1Var != null ? am1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    static {
        p51.g();
        Collections.emptyList();
        sm2 sm2Var = sm2.f82697f;
        cm1 cm1Var = cm1.f76322d;
        jm1 jm1Var = jm1.H;
        f77442h = new wq() { // from class: cp.z1
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return fm1.a(bundle);
            }
        };
    }

    public fm1(String str, ul1 ul1Var, am1 am1Var, yl1 yl1Var, jm1 jm1Var, cm1 cm1Var) {
        this.f77443b = str;
        this.f77444c = am1Var;
        this.f77445d = yl1Var;
        this.f77446e = jm1Var;
        this.f77447f = ul1Var;
        this.f77448g = cm1Var;
    }

    public static fm1 a(String str) {
        am1 am1Var;
        sl1 sl1Var = new sl1();
        vl1 vl1Var = new vl1();
        List listEmptyList = Collections.emptyList();
        sm2 sm2Var = sm2.f82697f;
        cm1 cm1Var = cm1.f76322d;
        Uri uri = str == null ? null : Uri.parse(str);
        if (vl1Var.f83946b != null && vl1Var.f83945a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            am1Var = new am1(uri, null, vl1Var.f83945a != null ? new wl1(vl1Var) : null, listEmptyList, null, sm2Var, null);
        } else {
            am1Var = null;
        }
        return new fm1("", new ul1(sl1Var), am1Var, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1Var);
    }
}
