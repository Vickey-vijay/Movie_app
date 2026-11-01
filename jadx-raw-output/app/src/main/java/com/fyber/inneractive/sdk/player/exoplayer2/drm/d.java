package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Comparator, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f16440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16442c;

    public d(boolean z10, c... cVarArr) {
        cVarArr = z10 ? (c[]) cVarArr.clone() : cVarArr;
        Arrays.sort(cVarArr, this);
        for (int i10 = 1; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10 - 1].f16436b.equals(cVarArr[i10].f16436b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + cVarArr[i10].f16436b);
            }
        }
        this.f16440a = cVarArr;
        this.f16442c = cVarArr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.f16415b;
        if (uuid.equals(cVar.f16436b)) {
            return uuid.equals(cVar2.f16436b) ? 0 : 1;
        }
        return cVar.f16436b.compareTo(cVar2.f16436b);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f16440a, ((d) obj).f16440a);
    }

    public final int hashCode() {
        if (this.f16441b == 0) {
            this.f16441b = Arrays.hashCode(this.f16440a);
        }
        return this.f16441b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f16440a, 0);
    }

    public d(Parcel parcel) {
        c[] cVarArr = (c[]) parcel.createTypedArray(c.CREATOR);
        this.f16440a = cVarArr;
        this.f16442c = cVarArr.length;
    }
}
