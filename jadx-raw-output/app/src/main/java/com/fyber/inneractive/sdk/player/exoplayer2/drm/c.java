package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f16436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16439e;

    public c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f16436b = uuid;
        this.f16437c = str;
        bArr.getClass();
        this.f16438d = bArr;
        this.f16439e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return this.f16437c.equals(cVar.f16437c) && z.a(this.f16436b, cVar.f16436b) && Arrays.equals(this.f16438d, cVar.f16438d);
    }

    public final int hashCode() {
        if (this.f16435a == 0) {
            this.f16435a = Arrays.hashCode(this.f16438d) + ((this.f16437c.hashCode() + (this.f16436b.hashCode() * 31)) * 31);
        }
        return this.f16435a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16436b.getMostSignificantBits());
        parcel.writeLong(this.f16436b.getLeastSignificantBits());
        parcel.writeString(this.f16437c);
        parcel.writeByteArray(this.f16438d);
        parcel.writeByte(this.f16439e ? (byte) 1 : (byte) 0);
    }

    public c(Parcel parcel) {
        this.f16436b = new UUID(parcel.readLong(), parcel.readLong());
        this.f16437c = parcel.readString();
        this.f16438d = parcel.createByteArray();
        this.f16439e = parcel.readByte() != 0;
    }
}
