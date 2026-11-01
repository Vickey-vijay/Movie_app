package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class dc implements np0 {
    public dc(int i10) {
        this((Object) null);
    }

    public dc(Object obj) {
    }

    public final op0[] a(mp0[] mp0VarArr, im imVar) {
        op0 ecVar;
        sm2 sm2VarA = ec.a(mp0VarArr);
        op0[] op0VarArr = new op0[mp0VarArr.length];
        for (int i10 = 0; i10 < mp0VarArr.length; i10++) {
            mp0 mp0Var = mp0VarArr[i10];
            if (mp0Var != null) {
                int[] iArr = mp0Var.f80314b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        ecVar = new qv0(iArr[0], mp0Var.f80315c, mp0Var.f80313a);
                    } else {
                        long j10 = 25000;
                        ecVar = new ec(mp0Var.f80313a, iArr, mp0Var.f80315c, imVar, 10000, j10, j10, 1279, 719, 0.7f, 0.75f, (p51) sm2VarA.get(i10), xv.f84701a);
                    }
                    op0VarArr[i10] = ecVar;
                }
            }
        }
        return op0VarArr;
    }
}
