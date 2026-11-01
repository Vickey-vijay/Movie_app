package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qq1 implements Parcelable {
    public static final Parcelable.Creator<qq1> CREATOR = new nq1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f81931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f81932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f81933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f81934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j5 f81935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f81936h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq1)) {
            return false;
        }
        qq1 qq1Var = (qq1) obj;
        return ck.p.e(this.f81930b, qq1Var.f81930b) && ck.p.e(this.f81931c, qq1Var.f81931c) && ck.p.e(this.f81932d, qq1Var.f81932d) && ck.p.e(this.f81933e, qq1Var.f81933e) && ck.p.e(this.f81934f, qq1Var.f81934f) && ck.p.e(this.f81935g, qq1Var.f81935g) && ck.p.e(this.f81936h, qq1Var.f81936h);
    }

    public final Map d() {
        return this.f81931c;
    }

    public final int hashCode() {
        int iHashCode = (this.f81931c.hashCode() + (this.f81930b.hashCode() * 31)) * 31;
        List list = this.f81932d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f81933e;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f81934f;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        j5 j5Var = this.f81935g;
        int iHashCode5 = (iHashCode4 + (j5Var == null ? 0 : j5Var.f78915b.hashCode())) * 31;
        Map map = this.f81936h;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MediationNetwork(adapter=" + this.f81930b + ", networkData=" + this.f81931c + ", impressionTrackingUrls=" + this.f81932d + ", clickTrackingUrls=" + this.f81933e + ", adResponseTrackingUrls=" + this.f81934f + ", adImpressionData=" + this.f81935g + ", biddingInfo=" + this.f81936h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f81930b);
        Map map = this.f81931c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeStringList(this.f81932d);
        parcel.writeStringList(this.f81933e);
        parcel.writeStringList(this.f81934f);
        j5 j5Var = this.f81935g;
        if (j5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(j5Var.f78915b);
        }
        Map map2 = this.f81936h;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }

    public qq1(String str, Map map, List list, List list2, List list3, j5 j5Var, Map map2) {
        this.f81930b = str;
        this.f81931c = map;
        this.f81932d = list;
        this.f81933e = list2;
        this.f81934f = list3;
        this.f81935g = j5Var;
        this.f81936h = map2;
    }
}
