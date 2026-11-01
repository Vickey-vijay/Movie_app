package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class kt1 extends v21 {
    public static final Parcelable.Creator<kt1> CREATOR = new jt1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f79562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f79563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f79564g;

    public kt1(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f79560c = i10;
        this.f79561d = i11;
        this.f79562e = i12;
        this.f79563f = iArr;
        this.f79564g = iArr2;
    }

    @Override // yads.v21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kt1.class != obj.getClass()) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return this.f79560c == kt1Var.f79560c && this.f79561d == kt1Var.f79561d && this.f79562e == kt1Var.f79562e && Arrays.equals(this.f79563f, kt1Var.f79563f) && Arrays.equals(this.f79564g, kt1Var.f79564g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f79564g) + ((Arrays.hashCode(this.f79563f) + ((((((this.f79560c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f79561d) * 31) + this.f79562e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f79560c);
        parcel.writeInt(this.f79561d);
        parcel.writeInt(this.f79562e);
        parcel.writeIntArray(this.f79563f);
        parcel.writeIntArray(this.f79564g);
    }

    public kt1(Parcel parcel) {
        super("MLLT");
        this.f79560c = parcel.readInt();
        this.f79561d = parcel.readInt();
        this.f79562e = parcel.readInt();
        this.f79563f = (int[]) ib3.a(parcel.createIntArray());
        this.f79564g = (int[]) ib3.a(parcel.createIntArray());
    }
}
