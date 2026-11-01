package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class AlbumWindowStyle implements Parcelable {
    public static final Parcelable.Creator<AlbumWindowStyle> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32335e;

    public class a implements Parcelable.Creator<AlbumWindowStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlbumWindowStyle createFromParcel(Parcel parcel) {
            return new AlbumWindowStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AlbumWindowStyle[] newArray(int i10) {
            return new AlbumWindowStyle[i10];
        }
    }

    public AlbumWindowStyle() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AlbumWindowStyle(Parcel parcel) {
        this.f32332b = parcel.readInt();
        this.f32333c = parcel.readInt();
        this.f32334d = parcel.readInt();
        this.f32335e = parcel.readInt();
    }

    public int c() {
        return this.f32332b;
    }

    public int d() {
        return this.f32333c;
    }

    public int e() {
        return this.f32335e;
    }

    public int f() {
        return this.f32334d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32332b);
        parcel.writeInt(this.f32333c);
        parcel.writeInt(this.f32334d);
        parcel.writeInt(this.f32335e);
    }
}
