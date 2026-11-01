package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends o {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17496c;

    public s(String str, String str2, String str3) {
        super(str);
        this.f17495b = str2;
        this.f17496c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f17492a.equals(sVar.f17492a) && z.a(this.f17495b, sVar.f17495b) && z.a(this.f17496c, sVar.f17496c);
    }

    public final int hashCode() {
        int iHashCode = (this.f17492a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f17495b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17496c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17492a);
        parcel.writeString(this.f17495b);
        parcel.writeString(this.f17496c);
    }

    public s(Parcel parcel) {
        super(parcel.readString());
        this.f17495b = parcel.readString();
        this.f17496c = parcel.readString();
    }
}
