package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
@xk.f
public final class j5 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78915b;
    public static final h5 Companion = new h5();
    public static final Parcelable.Creator<j5> CREATOR = new i5();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5) && ck.p.e(this.f78915b, ((j5) obj).f78915b);
    }

    public final int hashCode() {
        return this.f78915b.hashCode();
    }

    public final String toString() {
        return "AdImpressionData(rawData=" + this.f78915b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f78915b);
    }

    public j5(String str) {
        this.f78915b = str;
    }
}
