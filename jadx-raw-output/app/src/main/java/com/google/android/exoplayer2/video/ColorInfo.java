package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f20209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20210f;

    public class a implements Parcelable.Creator<ColorInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ColorInfo[] newArray(int i10) {
            return new ColorInfo[i10];
        }
    }

    public ColorInfo(int i10, int i11, int i12, @Nullable byte[] bArr) {
        this.f20206b = i10;
        this.f20207c = i11;
        this.f20208d = i12;
        this.f20209e = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.f20206b == colorInfo.f20206b && this.f20207c == colorInfo.f20207c && this.f20208d == colorInfo.f20208d && Arrays.equals(this.f20209e, colorInfo.f20209e);
    }

    public int hashCode() {
        if (this.f20210f == 0) {
            this.f20210f = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20206b) * 31) + this.f20207c) * 31) + this.f20208d) * 31) + Arrays.hashCode(this.f20209e);
        }
        return this.f20210f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f20206b);
        sb2.append(", ");
        sb2.append(this.f20207c);
        sb2.append(", ");
        sb2.append(this.f20208d);
        sb2.append(", ");
        sb2.append(this.f20209e != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20206b);
        parcel.writeInt(this.f20207c);
        parcel.writeInt(this.f20208d);
        k0.O0(parcel, this.f20209e != null);
        byte[] bArr = this.f20209e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f20206b = parcel.readInt();
        this.f20207c = parcel.readInt();
        this.f20208d = parcel.readInt();
        this.f20209e = k0.u0(parcel) ? parcel.createByteArray() : null;
    }
}
