package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class Xa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ck.p.j(parcel, "parcel");
        ck.p.j(parcel, "parcel");
        long j10 = parcel.readLong();
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        String str6 = string6 == null ? "" : string6;
        boolean z10 = parcel.readByte() != 0;
        String string7 = parcel.readString();
        Za za2 = new Za(j10, str, str2, str3, str4, str5, str6, z10, string7 == null ? "" : string7);
        String string8 = parcel.readString();
        Ya ya2 = new Ya(za2, string8 == null ? "" : string8, parcel.readInt(), parcel.readLong());
        ya2.f23835e = parcel.readInt();
        ya2.f23836f = parcel.readString();
        return ya2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new Ya[i10];
    }
}
