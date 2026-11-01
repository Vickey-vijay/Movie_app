package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19403d;

    public class a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f19401b = i10;
        this.f19402c = i11;
        this.f19403d = i12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f19401b == streamKey.f19401b && this.f19402c == streamKey.f19402c && this.f19403d == streamKey.f19403d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f19401b - streamKey.f19401b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f19402c - streamKey.f19402c;
        return i11 == 0 ? this.f19403d - streamKey.f19403d : i11;
    }

    public int hashCode() {
        return (((this.f19401b * 31) + this.f19402c) * 31) + this.f19403d;
    }

    public String toString() {
        return this.f19401b + "." + this.f19402c + "." + this.f19403d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19401b);
        parcel.writeInt(this.f19402c);
        parcel.writeInt(this.f19403d);
    }

    public StreamKey(Parcel parcel) {
        this.f19401b = parcel.readInt();
        this.f19402c = parcel.readInt();
        this.f19403d = parcel.readInt();
    }
}
