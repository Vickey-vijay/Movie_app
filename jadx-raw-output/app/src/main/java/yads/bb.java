package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bb {
    public static String a(ab abVar) {
        ArrayList arrayList = new ArrayList();
        if (!lk.a0.n0(abVar.a())) {
            arrayList.add(abVar.a());
        }
        if (!lk.a0.n0(abVar.b())) {
            arrayList.add("erid: " + abVar.b());
        }
        return nj.b0.p0(arrayList, " · ", null, null, 0, null, null, 62, null);
    }
}
