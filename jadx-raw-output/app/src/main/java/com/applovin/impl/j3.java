package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: loaded from: classes4.dex */
public class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f7756b;

    public boolean a(Object obj) {
        return obj instanceof j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        if (!j3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = j3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = j3Var.a();
        return maxAdFormatA != null ? maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 == null;
    }

    public MaxAdFormat a() {
        return this.f7756b;
    }

    public String b() {
        return this.f7755a;
    }

    public String toString() {
        return this.f7755a + "-" + this.f7756b.getLabel();
    }

    public j3(String str, MaxAdFormat maxAdFormat) {
        this.f7755a = str;
        this.f7756b = maxAdFormat;
    }

    public static j3 a(String str) {
        String[] strArrSplit = str.split("-");
        return new j3(strArrSplit[0], MaxAdFormat.formatFromString(strArrSplit[1]));
    }

    public int hashCode() {
        int iHashCode;
        String strB = b();
        int iHashCode2 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        MaxAdFormat maxAdFormatA = a();
        int i10 = (iHashCode + 59) * 59;
        if (maxAdFormatA != null) {
            iHashCode2 = maxAdFormatA.hashCode();
        }
        return i10 + iHashCode2;
    }
}
