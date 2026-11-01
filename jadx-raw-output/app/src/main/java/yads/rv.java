package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class rv implements Parcelable {
    public static final Parcelable.Creator<rv> CREATOR = new qv();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82438c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return this.f82437b == rvVar.f82437b && ck.p.e(this.f82438c, rvVar.f82438c);
    }

    public final int hashCode() {
        return this.f82438c.hashCode() + (Integer.hashCode(this.f82437b) * 31);
    }

    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.f82437b + ", rewardType=" + this.f82438c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f82437b);
        parcel.writeString(this.f82438c);
    }

    public rv(int i10, String str) {
        this.f82437b = i10;
        this.f82438c = str;
    }
}
