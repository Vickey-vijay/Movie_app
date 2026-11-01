package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.inmobi.media.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3218u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ck.p.j(parcel, "source");
        return new C3243v0(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C3243v0[i10];
    }
}
