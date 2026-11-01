package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f19296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f19297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f19298d;

    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    public IcyInfo(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.f19296b = bArr;
        this.f19297c = str;
        this.f19298d = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f19297c, this.f19298d, Integer.valueOf(this.f19296b.length));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19296b, ((IcyInfo) obj).f19296b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19296b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f19296b);
        parcel.writeString(this.f19297c);
        parcel.writeString(this.f19298d);
    }

    public IcyInfo(Parcel parcel) {
        this.f19296b = (byte[]) g5.a.e(parcel.createByteArray());
        this.f19297c = parcel.readString();
        this.f19298d = parcel.readString();
    }
}
