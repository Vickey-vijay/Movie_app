package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class jk0 implements Parcelable {
    public static final Parcelable.Creator<jk0> CREATOR = new ik0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f79077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f79078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f79079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f79080f;

    public jk0(Parcel parcel) {
        this.f79077c = new UUID(parcel.readLong(), parcel.readLong());
        this.f79078d = parcel.readString();
        this.f79079e = (String) ib3.a((Object) parcel.readString());
        this.f79080f = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean a(UUID uuid) {
        return jr.f79149a.equals(this.f79077c) || uuid.equals(this.f79077c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jk0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        jk0 jk0Var = (jk0) obj;
        return ib3.a(this.f79078d, jk0Var.f79078d) && ib3.a(this.f79079e, jk0Var.f79079e) && ib3.a(this.f79077c, jk0Var.f79077c) && Arrays.equals(this.f79080f, jk0Var.f79080f);
    }

    public final int hashCode() {
        if (this.f79076b == 0) {
            int iHashCode = this.f79077c.hashCode() * 31;
            String str = this.f79078d;
            this.f79076b = Arrays.hashCode(this.f79080f) + k4.a(this.f79079e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.f79076b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f79077c.getMostSignificantBits());
        parcel.writeLong(this.f79077c.getLeastSignificantBits());
        parcel.writeString(this.f79078d);
        parcel.writeString(this.f79079e);
        parcel.writeByteArray(this.f79080f);
    }

    public jk0(UUID uuid, String str, String str2, byte[] bArr) {
        this.f79077c = (UUID) ni.a(uuid);
        this.f79078d = str;
        this.f79079e = (String) ni.a((Object) str2);
        this.f79080f = bArr;
    }
}
