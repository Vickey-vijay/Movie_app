package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends o {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f17478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o[] f17479f;

    public h(String str, boolean z10, boolean z11, String[] strArr, o[] oVarArr) {
        super("CTOC");
        this.f17475b = str;
        this.f17476c = z10;
        this.f17477d = z11;
        this.f17478e = strArr;
        this.f17479f = oVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17476c == hVar.f17476c && this.f17477d == hVar.f17477d && z.a(this.f17475b, hVar.f17475b) && Arrays.equals(this.f17478e, hVar.f17478e) && Arrays.equals(this.f17479f, hVar.f17479f);
    }

    public final int hashCode() {
        int i10 = ((((this.f17476c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f17477d ? 1 : 0)) * 31;
        String str = this.f17475b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17475b);
        parcel.writeByte(this.f17476c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f17477d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f17478e);
        parcel.writeInt(this.f17479f.length);
        int i11 = 0;
        while (true) {
            o[] oVarArr = this.f17479f;
            if (i11 >= oVarArr.length) {
                return;
            }
            parcel.writeParcelable(oVarArr[i11], 0);
            i11++;
        }
    }

    public h(Parcel parcel) {
        super("CTOC");
        this.f17475b = parcel.readString();
        this.f17476c = parcel.readByte() != 0;
        this.f17477d = parcel.readByte() != 0;
        this.f17478e = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f17479f = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17479f[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
