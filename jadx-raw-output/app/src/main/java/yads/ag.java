package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ag extends v21 {
    public static final Parcelable.Creator<ag> CREATOR = new zf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f75502f;

    public ag(Parcel parcel) {
        super("APIC");
        this.f75499c = (String) ib3.a((Object) parcel.readString());
        this.f75500d = parcel.readString();
        this.f75501e = parcel.readInt();
        this.f75502f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ag.class != obj.getClass()) {
            return false;
        }
        ag agVar = (ag) obj;
        return this.f75501e == agVar.f75501e && ib3.a(this.f75499c, agVar.f75499c) && ib3.a(this.f75500d, agVar.f75500d) && Arrays.equals(this.f75502f, agVar.f75502f);
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        byte[] bArr = this.f75502f;
        int i10 = this.f75501e;
        if (im1Var.f78707j == null || ib3.a((Object) Integer.valueOf(i10), (Object) 3) || !ib3.a((Object) im1Var.f78708k, (Object) 3)) {
            im1Var.f78707j = (byte[]) bArr.clone();
            im1Var.f78708k = Integer.valueOf(i10);
        }
    }

    public final int hashCode() {
        int i10 = (this.f75501e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f75499c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f75500d;
        return Arrays.hashCode(this.f75502f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f83729b + ": mimeType=" + this.f75499c + ", description=" + this.f75500d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f75499c);
        parcel.writeString(this.f75500d);
        parcel.writeInt(this.f75501e);
        parcel.writeByteArray(this.f75502f);
    }

    public ag(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f75499c = str;
        this.f75500d = str2;
        this.f75501e = i10;
        this.f75502f = bArr;
    }
}
