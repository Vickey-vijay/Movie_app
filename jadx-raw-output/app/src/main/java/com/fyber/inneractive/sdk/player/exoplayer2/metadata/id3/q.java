package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends o {
    public static final Parcelable.Creator<q> CREATOR = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f17494c;

    public q(String str, byte[] bArr) {
        super("PRIV");
        this.f17493b = str;
        this.f17494c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return z.a(this.f17493b, qVar.f17493b) && Arrays.equals(this.f17494c, qVar.f17494c);
    }

    public final int hashCode() {
        String str = this.f17493b;
        return Arrays.hashCode(this.f17494c) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17493b);
        parcel.writeByteArray(this.f17494c);
    }

    public q(Parcel parcel) {
        super("PRIV");
        this.f17493b = parcel.readString();
        this.f17494c = parcel.createByteArray();
    }
}
