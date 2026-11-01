package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class fw extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ek f2108;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fk f2109;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fk f2110;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fw.class == obj.getClass()) {
            fw fwVar = (fw) obj;
            fk fkVar = this.f2110;
            if (fkVar == null ? fwVar.f2110 != null : !fkVar.equals(fwVar.f2110)) {
                return false;
            }
            fk fkVar2 = this.f2109;
            if (fkVar2 == null ? fwVar.f2109 != null : !fkVar2.equals(fwVar.f2109)) {
                return false;
            }
            ek ekVar = this.f2108;
            ek ekVar2 = fwVar.f2108;
            if (ekVar != null) {
                return ekVar.equals(ekVar2);
            }
            if (ekVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        fk fkVar = this.f2110;
        int iHashCode = (fkVar != null ? fkVar.hashCode() : 0) * 31;
        fk fkVar2 = this.f2109;
        int iHashCode2 = (iHashCode + (fkVar2 != null ? fkVar2.hashCode() : 0)) * 31;
        ek ekVar = this.f2108;
        return iHashCode2 + (ekVar != null ? ekVar.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo2187(du duVar, cq cqVar) {
        try {
            fk fkVar = this.f2110;
            if (fkVar != null) {
                return fkVar.mo2187(new du(duVar), cqVar);
            }
        } catch (Throwable th2) {
            if (this.f2109 != null) {
                HashMap map = new HashMap();
                ek ekVar = this.f2108;
                if (ekVar != null) {
                    map.put(dz.m2133(ekVar.m2163()), th2);
                }
                return this.f2109.mo2187(new du(map, duVar), cqVar);
            }
        }
        return new dr(null);
    }

    public fw(fk fkVar, fk fkVar2, ek ekVar) {
        this.f2110 = fkVar;
        this.f2109 = fkVar2;
        this.f2108 = ekVar;
    }
}
