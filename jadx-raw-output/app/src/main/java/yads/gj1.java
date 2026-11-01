package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class gj1 implements ss1 {
    public static final Parcelable.Creator<gj1> CREATOR = new fj1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f77825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77827e;

    public gj1(int i10, int i11, String str, byte[] bArr) {
        this.f77824b = str;
        this.f77825c = bArr;
        this.f77826d = i10;
        this.f77827e = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gj1.class != obj.getClass()) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        return this.f77824b.equals(gj1Var.f77824b) && Arrays.equals(this.f77825c, gj1Var.f77825c) && this.f77826d == gj1Var.f77826d && this.f77827e == gj1Var.f77827e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f77825c) + k4.a(this.f77824b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.f77826d) * 31) + this.f77827e;
    }

    public final String toString() {
        return "mdta: key=" + this.f77824b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f77824b);
        parcel.writeByteArray(this.f77825c);
        parcel.writeInt(this.f77826d);
        parcel.writeInt(this.f77827e);
    }

    public gj1(Parcel parcel) {
        this.f77824b = (String) ib3.a((Object) parcel.readString());
        this.f77825c = (byte[]) ib3.a((Object) parcel.createByteArray());
        this.f77826d = parcel.readInt();
        this.f77827e = parcel.readInt();
    }
}
