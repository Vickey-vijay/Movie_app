package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends o {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17482d;

    public j(String str, String str2, String str3) {
        super("COMM");
        this.f17480b = str;
        this.f17481c = str2;
        this.f17482d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return z.a(this.f17481c, jVar.f17481c) && z.a(this.f17480b, jVar.f17480b) && z.a(this.f17482d, jVar.f17482d);
    }

    public final int hashCode() {
        String str = this.f17480b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f17481c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17482d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17492a);
        parcel.writeString(this.f17480b);
        parcel.writeString(this.f17482d);
    }

    public j(Parcel parcel) {
        super("COMM");
        this.f17480b = parcel.readString();
        this.f17481c = parcel.readString();
        this.f17482d = parcel.readString();
    }
}
