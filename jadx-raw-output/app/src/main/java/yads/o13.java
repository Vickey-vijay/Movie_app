package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f80897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm f80898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g13 f80899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f80900g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o13)) {
            return false;
        }
        o13 o13Var = (o13) obj;
        return ck.p.e(this.f80894a, o13Var.f80894a) && ck.p.e(this.f80895b, o13Var.f80895b) && ck.p.e(this.f80896c, o13Var.f80896c) && ck.p.e(this.f80897d, o13Var.f80897d) && ck.p.e(this.f80898e, o13Var.f80898e) && ck.p.e(this.f80899f, o13Var.f80899f) && ck.p.e(this.f80900g, o13Var.f80900g);
    }

    public final int hashCode() {
        String str = this.f80894a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f80895b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80896c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f80897d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dm dmVar = this.f80898e;
        int iHashCode5 = (iHashCode4 + (dmVar == null ? 0 : dmVar.hashCode())) * 31;
        g13 g13Var = this.f80899f;
        int iHashCode6 = (iHashCode5 + (g13Var == null ? 0 : g13Var.hashCode())) * 31;
        List list = this.f80900g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCenterSettings(colorWizButton=" + this.f80894a + ", colorWizButtonText=" + this.f80895b + ", colorWizBack=" + this.f80896c + ", colorWizBackRight=" + this.f80897d + ", backgroundColors=" + this.f80898e + ", smartCenter=" + this.f80899f + ", smartCenters=" + this.f80900g + ")";
    }

    public o13(String str, String str2, String str3, String str4, dm dmVar, g13 g13Var, ArrayList arrayList) {
        this.f80894a = str;
        this.f80895b = str2;
        this.f80896c = str3;
        this.f80897d = str4;
        this.f80898e = dmVar;
        this.f80899f = g13Var;
        this.f80900g = arrayList;
    }
}
