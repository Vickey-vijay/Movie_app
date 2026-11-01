package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f6839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f6840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f6841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f6842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f6843f;

    public boolean a(Object obj) {
        return obj instanceof a3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        if (!a3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = a3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = a3Var.a();
        if (maxAdFormatA != null ? !maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 != null) {
            return false;
        }
        Map mapE = e();
        Map mapE2 = a3Var.e();
        if (mapE != null ? !mapE.equals(mapE2) : mapE2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = a3Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = a3Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        h hVarF = f();
        h hVarF2 = a3Var.f();
        return hVarF != null ? hVarF.equals(hVarF2) : hVarF2 == null;
    }

    public MaxAdFormat a() {
        return this.f6839b;
    }

    public String b() {
        return this.f6838a;
    }

    public Map c() {
        return this.f6842e;
    }

    public Map d() {
        return this.f6841d;
    }

    public Map e() {
        return this.f6840c;
    }

    public h f() {
        return this.f6843f;
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + b() + ", adFormat=" + a() + ")";
    }

    public a3(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, h hVar) {
        this.f6838a = str;
        this.f6839b = maxAdFormat;
        this.f6840c = map;
        this.f6841d = map2;
        this.f6842e = map3;
        this.f6843f = hVar;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        String strB = b();
        int iHashCode6 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        MaxAdFormat maxAdFormatA = a();
        int i10 = (iHashCode + 59) * 59;
        if (maxAdFormatA == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = maxAdFormatA.hashCode();
        }
        int i11 = i10 + iHashCode2;
        Map mapE = e();
        int i12 = i11 * 59;
        if (mapE == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = mapE.hashCode();
        }
        int i13 = i12 + iHashCode3;
        Map mapD = d();
        int i14 = i13 * 59;
        if (mapD == null) {
            iHashCode4 = 43;
        } else {
            iHashCode4 = mapD.hashCode();
        }
        int i15 = i14 + iHashCode4;
        Map mapC = c();
        int i16 = i15 * 59;
        if (mapC == null) {
            iHashCode5 = 43;
        } else {
            iHashCode5 = mapC.hashCode();
        }
        int i17 = i16 + iHashCode5;
        h hVarF = f();
        int i18 = i17 * 59;
        if (hVarF != null) {
            iHashCode6 = hVarF.hashCode();
        }
        return i18 + iHashCode6;
    }
}
