package yads;

import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class tr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr1 f83150a;

    public static void a(ArrayList arrayList, String str) {
        int iMax = Math.max(4, 44 - str.length());
        int i10 = iMax / 2;
        String strJ = lk.x.J("-", i10);
        String strJ2 = lk.x.J("-", (iMax % 2) + i10);
        String strJ3 = lk.x.J(Z7.f27998r, 1);
        arrayList.add(new sr1(strJ + strJ3 + str + strJ3 + strJ2, rr1.f82414b));
    }

    public tr1(cr1 cr1Var) {
        this.f83150a = cr1Var;
    }

    public static void a(ArrayList arrayList, List list, String str, boolean z10) {
        rr1 rr1Var;
        String str2;
        String str3;
        if (z10) {
            rr1Var = rr1.f82414b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            rr1Var = rr1.f82415c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ar1) it.next()).a());
        }
        arrayList.add(new sr1(nj.b0.p0(arrayList2, null, str2 + ": ", null, 0, null, null, 61, null), rr1Var));
        arrayList.add(new sr1(str + ": " + str3, rr1Var));
    }

    public static void a(ArrayList arrayList, String str, String str2) {
        if (str != null && !lk.a0.n0(str)) {
            arrayList.add(new sr1("SDK Version: " + str, rr1.f82414b));
        }
        if (str2 == null || lk.a0.n0(str2)) {
            return;
        }
        arrayList.add(new sr1("ADAPTERS Version: " + str2, rr1.f82414b));
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            br1 br1Var = (br1) it.next();
            a(arrayList2, br1Var.f75934a);
            String str = br1Var.f75936c;
            String str2 = ((ar1) nj.b0.f0(br1Var.f75937d)).f75609b;
            this.f83150a.getClass();
            boolean zA = cr1.a(br1Var);
            if (zA) {
                a(arrayList2, str, str2);
            }
            a(arrayList2, br1Var.f75937d, br1Var.f75934a, zA);
        }
        return arrayList2;
    }
}
