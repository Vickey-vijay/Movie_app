package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends o {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f17467e;

    public b(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f17464b = str;
        this.f17465c = str2;
        this.f17466d = i10;
        this.f17467e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17466d == bVar.f17466d && z.a(this.f17464b, bVar.f17464b) && z.a(this.f17465c, bVar.f17465c) && Arrays.equals(this.f17467e, bVar.f17467e);
    }

    public final int hashCode() {
        int i10 = (this.f17466d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f17464b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17465c;
        return Arrays.hashCode(this.f17467e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17464b);
        parcel.writeString(this.f17465c);
        parcel.writeInt(this.f17466d);
        parcel.writeByteArray(this.f17467e);
    }

    public b(Parcel parcel) {
        super("APIC");
        this.f17464b = parcel.readString();
        this.f17465c = parcel.readString();
        this.f17466d = parcel.readInt();
        this.f17467e = parcel.createByteArray();
    }
}
