package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends o {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f17468b;

    public d(String str, byte[] bArr) {
        super(str);
        this.f17468b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17492a.equals(dVar.f17492a) && Arrays.equals(this.f17468b, dVar.f17468b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17468b) + ((this.f17492a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17492a);
        parcel.writeByteArray(this.f17468b);
    }

    public d(Parcel parcel) {
        super(parcel.readString());
        this.f17468b = parcel.createByteArray();
    }
}
