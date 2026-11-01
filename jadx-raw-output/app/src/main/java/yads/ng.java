package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ng extends dz2 {
    @Override // yads.dz2
    public final ts1 a(ws1 ws1Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        ib2 ib2Var = new ib2(byteBuffer.limit(), byteBuffer.array());
        ib2Var.c(12);
        int iC = (ib2Var.c() + ib2Var.a(12)) - 4;
        ib2Var.c(44);
        ib2Var.d(ib2Var.a(12));
        ib2Var.c(16);
        ArrayList arrayList = new ArrayList();
        while (ib2Var.c() < iC) {
            ib2Var.c(48);
            int iA = ib2Var.a(8);
            ib2Var.c(4);
            int iC2 = ib2Var.c() + ib2Var.a(12);
            String strA = null;
            String strA2 = null;
            while (ib2Var.c() < iC2) {
                int iA2 = ib2Var.a(8);
                int iA3 = ib2Var.a(8);
                int iC3 = ib2Var.c() + iA3;
                if (iA2 == 2) {
                    int iA4 = ib2Var.a(16);
                    ib2Var.c(8);
                    if (iA4 == 3) {
                        while (ib2Var.c() < iC3) {
                            strA = ib2Var.a(ib2Var.a(8), bu.f75962a);
                            int iA5 = ib2Var.a(8);
                            for (int i10 = 0; i10 < iA5; i10++) {
                                ib2Var.d(ib2Var.a(8));
                            }
                        }
                    }
                } else if (iA2 == 21) {
                    strA2 = ib2Var.a(iA3, bu.f75962a);
                }
                ib2Var.b(iC3 * 8);
            }
            ib2Var.b(iC2 * 8);
            if (strA != null && strA2 != null) {
                arrayList.add(new mg(iA, strA.concat(strA2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ts1(arrayList);
    }
}
