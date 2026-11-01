package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class dr0 implements Parcelable {
    public static final Parcelable.Creator<dr0> CREATOR = new cr0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f76779c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0)) {
            return false;
        }
        dr0 dr0Var = (dr0) obj;
        return ck.p.e(this.f76778b, dr0Var.f76778b) && this.f76779c == dr0Var.f76779c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f76779c) + (this.f76778b.hashCode() * 31);
    }

    public final String toString() {
        return "FalseClick(url=" + this.f76778b + ", interval=" + this.f76779c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76778b);
        parcel.writeLong(this.f76779c);
    }

    public dr0(String str, long j10) {
        this.f76778b = str;
        this.f76779c = j10;
    }
}
