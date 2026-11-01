package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class yx2 implements Parcelable {
    public static final Parcelable.Creator<yx2> CREATOR = new xx2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85142b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx2) && ck.p.e(this.f85142b, ((yx2) obj).f85142b);
    }

    public final int hashCode() {
        return this.f85142b.hashCode();
    }

    public final String toString() {
        return "ServerSideReward(rewardUrl=" + this.f85142b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f85142b);
    }

    public yx2(String str) {
        this.f85142b = str;
    }
}
