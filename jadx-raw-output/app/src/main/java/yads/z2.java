package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class z2 implements Parcelable {
    public static final Parcelable.Creator<z2> CREATOR = new y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85179d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f85177b);
        parcel.writeString(this.f85178c);
        parcel.writeString(this.f85179d);
    }

    public z2(String str, String str2, String str3) {
        this.f85177b = str;
        this.f85178c = str2;
        this.f85179d = str3;
    }
}
