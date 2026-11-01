package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qr1 {
    public static final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sr1 sr1Var = (sr1) it.next();
            int iOrdinal = sr1Var.f82739b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    lc1.a(sr1Var.f82738a, new Object[0]);
                }
            } else {
                lc1.b(sr1Var.f82738a, new Object[0]);
            }
        }
    }
}
