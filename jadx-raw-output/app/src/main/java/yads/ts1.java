package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ts1 implements Parcelable {
    public static final Parcelable.Creator<ts1> CREATOR = new rs1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss1[] f83163b;

    public ts1(Parcel parcel) {
        this.f83163b = new ss1[parcel.readInt()];
        int i10 = 0;
        while (true) {
            ss1[] ss1VarArr = this.f83163b;
            if (i10 >= ss1VarArr.length) {
                return;
            }
            ss1VarArr[i10] = (ss1) parcel.readParcelable(ss1.class.getClassLoader());
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ts1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f83163b, ((ts1) obj).f83163b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f83163b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f83163b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f83163b.length);
        for (ss1 ss1Var : this.f83163b) {
            parcel.writeParcelable(ss1Var, 0);
        }
    }

    public ts1(List list) {
        this.f83163b = (ss1[]) list.toArray(new ss1[0]);
    }

    public ts1(ss1... ss1VarArr) {
        this.f83163b = ss1VarArr;
    }
}
