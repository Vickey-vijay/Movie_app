package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class v33 implements Comparable, Parcelable {
    public static final Parcelable.Creator<v33> CREATOR = new u33();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83735d;

    public v33(int i10, int i11, int i12) {
        this.f83733b = i10;
        this.f83734c = i11;
        this.f83735d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v33.class != obj.getClass()) {
            return false;
        }
        v33 v33Var = (v33) obj;
        return this.f83733b == v33Var.f83733b && this.f83734c == v33Var.f83734c && this.f83735d == v33Var.f83735d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v33 v33Var = (v33) obj;
        int i10 = this.f83733b - v33Var.f83733b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f83734c - v33Var.f83734c;
        return i11 == 0 ? this.f83735d - v33Var.f83735d : i11;
    }

    public final int hashCode() {
        return (((this.f83733b * 31) + this.f83734c) * 31) + this.f83735d;
    }

    public final String toString() {
        return this.f83733b + "." + this.f83734c + "." + this.f83735d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f83733b);
        parcel.writeInt(this.f83734c);
        parcel.writeInt(this.f83735d);
    }

    public v33(Parcel parcel) {
        this.f83733b = parcel.readInt();
        this.f83734c = parcel.readInt();
        this.f83735d = parcel.readInt();
    }
}
