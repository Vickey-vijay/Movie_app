package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dd3 extends v73 {
    public final ey2 C;
    public final ay2 D;
    public final ic3 E;

    public dd3(Context context, d4 d4Var, at1 at1Var, String str, qm3 qm3Var, ud3 ud3Var, mp3 mp3Var, ey2 ey2Var, ay2 ay2Var, ic3 ic3Var) {
        super(context, d4Var, 0, str, qm3Var, ud3Var, mp3Var, null, at1Var, 1664);
        this.C = ey2Var;
        this.D = ay2Var;
        this.E = ic3Var;
    }

    @Override // yads.v73
    public final vp2 a(e82 e82Var, int i10) {
        Map mapJ = e82Var.f76978c;
        if (mapJ == null) {
            mapJ = kotlin.collections.a.j();
        }
        this.D.a(mapJ);
        ec3 ec3VarA = this.E.a(e82Var);
        if (ec3VarA == null) {
            return new vp2(new lb2("Can't parse VAST response."));
        }
        List list = ec3VarA.f77028a.f85310b;
        return list.isEmpty() ? new vp2(new zl0()) : new vp2(list, null);
    }

    @Override // yads.v73, yads.po2
    public final Map d() {
        Map mapD = nj.l0.d();
        String strA = ((fy2) this.C).a();
        if (strA != null) {
            boolean z10 = ad1.f75480a;
        }
        mapD.putAll(super.d());
        return nj.l0.c(mapD);
    }
}
