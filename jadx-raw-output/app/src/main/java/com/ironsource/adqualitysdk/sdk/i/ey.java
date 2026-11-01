package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes7.dex */
public final class ey extends ed {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ek f2013;

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        dr drVarM2146 = this.f2013.m2146(duVar, cqVar);
        duVar.m2109(this.f2013.m2163(), Integer.valueOf(drVarM2146.m2090().intValue() + 1));
        return drVarM2146;
    }

    public ey(ek ekVar, dm dmVar) {
        super(dmVar);
        this.f2013 = ekVar;
    }
}
