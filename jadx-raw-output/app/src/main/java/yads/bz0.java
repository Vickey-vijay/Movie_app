package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class bz0 extends v21 {
    public static final Parcelable.Creator<bz0> CREATOR = new az0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f76069f;

    public bz0(Parcel parcel) {
        super("GEOB");
        this.f76066c = (String) ib3.a((Object) parcel.readString());
        this.f76067d = (String) ib3.a((Object) parcel.readString());
        this.f76068e = (String) ib3.a((Object) parcel.readString());
        this.f76069f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bz0.class != obj.getClass()) {
            return false;
        }
        bz0 bz0Var = (bz0) obj;
        return ib3.a(this.f76066c, bz0Var.f76066c) && ib3.a(this.f76067d, bz0Var.f76067d) && ib3.a(this.f76068e, bz0Var.f76068e) && Arrays.equals(this.f76069f, bz0Var.f76069f);
    }

    public final int hashCode() {
        String str = this.f76066c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f76067d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76068e;
        return Arrays.hashCode(this.f76069f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f83729b + ": mimeType=" + this.f76066c + ", filename=" + this.f76067d + ", description=" + this.f76068e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76066c);
        parcel.writeString(this.f76067d);
        parcel.writeString(this.f76068e);
        parcel.writeByteArray(this.f76069f);
    }

    public bz0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f76066c = str;
        this.f76067d = str2;
        this.f76068e = str3;
        this.f76069f = bArr;
    }
}
