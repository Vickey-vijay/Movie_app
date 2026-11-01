package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rj2 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f82291b;

    public static List a(je3 je3Var) {
        b20 b20Var = je3Var.f79013a;
        long j10 = b20Var.f75707i;
        List list = b20Var.f75702d;
        ArrayList<x73> arrayList = new ArrayList();
        for (Object obj : list) {
            if (ck.p.e("progress", ((x73) obj).f84470a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (x73 x73Var : arrayList) {
            xc3 xc3Var = x73Var.f84472c;
            qj2 qj2Var = null;
            if (xc3Var != null) {
                wc3 wc3Var = wc3.f84168b;
                wc3 wc3Var2 = xc3Var.f84530b;
                Long lValueOf = wc3Var == wc3Var2 ? Long.valueOf((long) xc3Var.f84531c) : wc3.f84169c == wc3Var2 ? Long.valueOf((long) ((xc3Var.f84531c / 100) * j10)) : null;
                if (lValueOf != null) {
                    qj2Var = new qj2(x73Var.f84471b, lValueOf.longValue());
                }
            }
            if (qj2Var != null) {
                arrayList2.add(qj2Var);
            }
        }
        return nj.b0.R0(arrayList2);
    }

    public rj2(Context context, je3 je3Var) {
        this.f82290a = context.getApplicationContext();
        this.f82291b = a(je3Var);
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        Iterator it = this.f82291b.iterator();
        while (it.hasNext()) {
            qj2 qj2Var = (qj2) it.next();
            if (qj2Var.f81872b <= j11) {
                di3 di3VarA = di3.f76682c.a(this.f82290a);
                di3VarA.f76685b.a(new bd2(di3VarA.f76684a, qj2Var.f81871a, new om3()));
                it.remove();
            }
        }
    }
}
