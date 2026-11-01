package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ad2 implements ss1 {
    public static final Parcelable.Creator<ad2> CREATOR = new zc2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f75485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f75486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f75487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f75488i;

    public ad2(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f75481b = i10;
        this.f75482c = str;
        this.f75483d = str2;
        this.f75484e = i11;
        this.f75485f = i12;
        this.f75486g = i13;
        this.f75487h = i14;
        this.f75488i = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ad2.class != obj.getClass()) {
            return false;
        }
        ad2 ad2Var = (ad2) obj;
        return this.f75481b == ad2Var.f75481b && this.f75482c.equals(ad2Var.f75482c) && this.f75483d.equals(ad2Var.f75483d) && this.f75484e == ad2Var.f75484e && this.f75485f == ad2Var.f75485f && this.f75486g == ad2Var.f75486g && this.f75487h == ad2Var.f75487h && Arrays.equals(this.f75488i, ad2Var.f75488i);
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        byte[] bArr = this.f75488i;
        int i10 = this.f75481b;
        if (im1Var.f78707j == null || ib3.a((Object) Integer.valueOf(i10), (Object) 3) || !ib3.a((Object) im1Var.f78708k, (Object) 3)) {
            im1Var.f78707j = (byte[]) bArr.clone();
            im1Var.f78708k = Integer.valueOf(i10);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f75488i) + ((((((((k4.a(this.f75483d, k4.a(this.f75482c, (this.f75481b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31), 31) + this.f75484e) * 31) + this.f75485f) * 31) + this.f75486g) * 31) + this.f75487h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f75482c + ", description=" + this.f75483d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f75481b);
        parcel.writeString(this.f75482c);
        parcel.writeString(this.f75483d);
        parcel.writeInt(this.f75484e);
        parcel.writeInt(this.f75485f);
        parcel.writeInt(this.f75486g);
        parcel.writeInt(this.f75487h);
        parcel.writeByteArray(this.f75488i);
    }

    public ad2(Parcel parcel) {
        this.f75481b = parcel.readInt();
        this.f75482c = (String) ib3.a((Object) parcel.readString());
        this.f75483d = (String) ib3.a((Object) parcel.readString());
        this.f75484e = parcel.readInt();
        this.f75485f = parcel.readInt();
        this.f75486g = parcel.readInt();
        this.f75487h = parcel.readInt();
        this.f75488i = (byte[]) ib3.a((Object) parcel.createByteArray());
    }
}
