package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class v03 extends k12 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u22 f83721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dw2 f83722f;

    @Override // yads.k12
    public final tb3 a(int i10, Context context, boolean z10) {
        nt2 nt2VarA = this.f83722f.a(context);
        tb3 tb3VarA = (nt2VarA == null || nt2VarA.f80785p) ? super.a(i10, context, z10) : new rb3(nj.s.k());
        if (!(tb3VarA instanceof rb3)) {
            return tb3VarA;
        }
        List list = this.f83721e.f83332a;
        ArrayList<p32> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof p32) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            for (p32 p32Var : arrayList) {
                j52 j52Var = p32Var.f81218d;
                l72 l72Var = p32Var.f81219e;
                nt2 nt2VarA2 = this.f83722f.a(context);
                boolean z11 = nt2VarA2 != null ? nt2VarA2.f80785p : true;
                Iterator it = l72Var.f79721b.iterator();
                while (it.hasNext()) {
                    int i11 = z11 ? ((py2) it.next()).f81651c : i10;
                    if ((z10 ? ((k12) j52Var).a(i11, context, true) : ((k12) j52Var).a(i11, context, false)) instanceof qb3) {
                    }
                }
                return tb3VarA;
            }
        }
        return new qb3(pb3.f81340d, null, null);
    }

    public v03(u22 u22Var, ny1 ny1Var, dw2 dw2Var, v9 v9Var) {
        super(ny1Var, v9Var);
        this.f83721e = u22Var;
        this.f83722f = dw2Var;
    }
}
