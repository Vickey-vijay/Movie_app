package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll1 f80702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq f80703b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nl1(Context context) {
        ll1 ll1VarA = new nm2(context).a();
        this(ll1VarA, new jq(ll1VarA));
    }

    public final kl1 a(List list) {
        double d10;
        double dAbs;
        Iterator it = list.iterator();
        double d11 = -1.0d;
        kl1 kl1Var = null;
        while (it.hasNext()) {
            kl1 kl1Var2 = (kl1) it.next();
            if (ck.p.e("video/mp4", kl1Var2.f79460d)) {
                d10 = 1.5d;
            } else {
                d10 = 1.0d;
            }
            jq jqVar = this.f80703b;
            jqVar.getClass();
            int i10 = kl1Var2.f79465i;
            if (i10 == 0) {
                int i11 = kl1Var2.f79464h * kl1Var2.f79463g;
                ll1 ll1Var = jqVar.f79147a;
                i10 = (int) ((i11 / (ll1Var.f79841a * ll1Var.f79842b)) * ll1Var.f79843c);
            }
            int i12 = this.f80702a.f79843c;
            int iMax = (int) Math.max(0.0d, i10);
            if (iMax < 100) {
                dAbs = 10.0d;
            } else {
                dAbs = ((double) ((int) Math.abs(i12 - iMax))) / ((double) i12);
            }
            double d12 = d10 / (dAbs + 1.0d);
            if (d12 > d11) {
                kl1Var = kl1Var2;
                d11 = d12;
            }
        }
        return kl1Var;
    }

    public nl1(ll1 ll1Var, jq jqVar) {
        this.f80702a = ll1Var;
        this.f80703b = jqVar;
    }
}
