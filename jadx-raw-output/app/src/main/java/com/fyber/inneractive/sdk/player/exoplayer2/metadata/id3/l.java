package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends o {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f17486e;

    public l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f17483b = str;
        this.f17484c = str2;
        this.f17485d = str3;
        this.f17486e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return z.a(this.f17483b, lVar.f17483b) && z.a(this.f17484c, lVar.f17484c) && z.a(this.f17485d, lVar.f17485d) && Arrays.equals(this.f17486e, lVar.f17486e);
    }

    public final int hashCode() {
        String str = this.f17483b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f17484c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17485d;
        return Arrays.hashCode(this.f17486e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17483b);
        parcel.writeString(this.f17484c);
        parcel.writeString(this.f17485d);
        parcel.writeByteArray(this.f17486e);
    }

    public l(Parcel parcel) {
        super("GEOB");
        this.f17483b = parcel.readString();
        this.f17484c = parcel.readString();
        this.f17485d = parcel.readString();
        this.f17486e = parcel.createByteArray();
    }
}
