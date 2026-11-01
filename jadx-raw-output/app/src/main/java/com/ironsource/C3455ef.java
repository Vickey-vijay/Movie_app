package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3455ef implements Kb<Ye, C3722u> {
    @Override // com.ironsource.Kb
    public C3722u a(Ye ye2) {
        W7 w7E;
        String strC;
        String strG;
        String strI;
        String strH;
        ck.p.j(ye2, "input");
        EnumC3473ff enumC3473ffB = ye2.b();
        O oA = ye2.a();
        String str = (oA == null || (strH = oA.h()) == null) ? "0" : strH;
        O oA2 = ye2.a();
        String str2 = (oA2 == null || (strI = oA2.i()) == null) ? "0" : strI;
        O oA3 = ye2.a();
        String str3 = (oA3 == null || (strG = oA3.g()) == null) ? "0" : strG;
        O oA4 = ye2.a();
        if (oA4 == null || (w7E = oA4.e()) == null) {
            w7E = W7.UnknownProvider;
        }
        W7 w10 = w7E;
        O oA5 = ye2.a();
        if (oA5 == null || (strC = oA5.c()) == null) {
            strC = "0";
        }
        return new C3722u(enumC3473ffB, str, str2, str3, w10, strC);
    }
}
