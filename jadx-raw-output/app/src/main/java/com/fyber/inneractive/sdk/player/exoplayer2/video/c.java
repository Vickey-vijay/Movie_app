package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17912e;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f17908a = i10;
        this.f17909b = i11;
        this.f17910c = i12;
        this.f17911d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f17908a == cVar.f17908a && this.f17909b == cVar.f17909b && this.f17910c == cVar.f17910c && Arrays.equals(this.f17911d, cVar.f17911d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f17912e == 0) {
            this.f17912e = Arrays.hashCode(this.f17911d) + ((((((this.f17908a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f17909b) * 31) + this.f17910c) * 31);
        }
        return this.f17912e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f17908a);
        sb2.append(", ");
        sb2.append(this.f17909b);
        sb2.append(", ");
        sb2.append(this.f17910c);
        sb2.append(", ");
        sb2.append(this.f17911d != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17908a);
        parcel.writeInt(this.f17909b);
        parcel.writeInt(this.f17910c);
        parcel.writeInt(this.f17911d != null ? 1 : 0);
        byte[] bArr = this.f17911d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public c(Parcel parcel) {
        this.f17908a = parcel.readInt();
        this.f17909b = parcel.readInt();
        this.f17910c = parcel.readInt();
        this.f17911d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
