package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class mg implements ss1 {
    public static final Parcelable.Creator<mg> CREATOR = new lg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80172c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Ait(controlCode=" + this.f80171b + ",url=" + this.f80172c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f80172c);
        parcel.writeInt(this.f80171b);
    }

    public mg(int i10, String str) {
        this.f80171b = i10;
        this.f80172c = str;
    }
}
