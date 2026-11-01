package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class r21 implements ss1 {
    public static final Parcelable.Creator<r21> CREATOR = new q21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f82079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f82081d;

    public r21(Parcel parcel) {
        this.f82079b = (byte[]) ni.a(parcel.createByteArray());
        this.f82080c = parcel.readString();
        this.f82081d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        String str = this.f82080c;
        if (str != null) {
            im1Var.f78698a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r21.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f82079b, ((r21) obj).f82079b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f82079b);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f82080c + "\", url=\"" + this.f82081d + "\", rawMetadata.length=\"" + this.f82079b.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f82079b);
        parcel.writeString(this.f82080c);
        parcel.writeString(this.f82081d);
    }

    public r21(byte[] bArr, String str, String str2) {
        this.f82079b = bArr;
        this.f82080c = str;
        this.f82081d = str2;
    }
}
