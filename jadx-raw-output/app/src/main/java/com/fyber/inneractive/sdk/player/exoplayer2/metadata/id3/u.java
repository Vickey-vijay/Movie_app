package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends o {
    public static final Parcelable.Creator<u> CREATOR = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17498c;

    public u(String str, String str2, String str3) {
        super(str);
        this.f17497b = str2;
        this.f17498c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f17492a.equals(uVar.f17492a) && z.a(this.f17497b, uVar.f17497b) && z.a(this.f17498c, uVar.f17498c);
    }

    public final int hashCode() {
        int iHashCode = (this.f17492a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f17497b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17498c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17492a);
        parcel.writeString(this.f17497b);
        parcel.writeString(this.f17498c);
    }

    public u(Parcel parcel) {
        super(parcel.readString());
        this.f17497b = parcel.readString();
        this.f17498c = parcel.readString();
    }
}
