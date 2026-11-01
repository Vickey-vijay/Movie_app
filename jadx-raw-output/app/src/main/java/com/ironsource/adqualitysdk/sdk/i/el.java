package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public abstract class el extends eg {
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo2164(int i10);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo2165(Object obj, Object obj2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo2166(String str, String str2);

    public el(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        Object objM2089 = m2156().m2146(duVar, cqVar).m2089();
        Object objM20810 = m2157().m2146(duVar, cqVar).m2089();
        try {
            return new dr(Boolean.valueOf(mo2164(new BigDecimal(objM2089.toString()).compareTo(new BigDecimal(objM20810.toString())))));
        } catch (Exception unused) {
            if ((objM2089 instanceof String) && (objM20810 instanceof String)) {
                return new dr(Boolean.valueOf(mo2166((String) objM2089, (String) objM20810)));
            }
            return new dr(Boolean.valueOf(mo2165(objM2089, objM20810)));
        }
    }
}
