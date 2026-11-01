package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qq2 implements Parcelable {
    public static final Parcelable.Creator<qq2> CREATOR = new oq2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rv f81938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yx2 f81939d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq2)) {
            return false;
        }
        qq2 qq2Var = (qq2) obj;
        return this.f81937b == qq2Var.f81937b && ck.p.e(this.f81938c, qq2Var.f81938c) && ck.p.e(this.f81939d, qq2Var.f81939d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f81937b) * 31;
        rv rvVar = this.f81938c;
        int iHashCode2 = (iHashCode + (rvVar == null ? 0 : rvVar.hashCode())) * 31;
        yx2 yx2Var = this.f81939d;
        return iHashCode2 + (yx2Var != null ? yx2Var.f85142b.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.f81937b + ", clientSideReward=" + this.f81938c + ", serverSideReward=" + this.f81939d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f81937b ? 1 : 0);
        rv rvVar = this.f81938c;
        if (rvVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(rvVar.f82437b);
            parcel.writeString(rvVar.f82438c);
        }
        yx2 yx2Var = this.f81939d;
        if (yx2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yx2Var.f85142b);
        }
    }

    public qq2(boolean z10, rv rvVar, yx2 yx2Var) {
        this.f81937b = z10;
        this.f81938c = rvVar;
        this.f81939d = yx2Var;
    }
}
