package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class TrackGroupArray implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrackGroup[] f19436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TrackGroupArray f19434e = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();

    public class a implements Parcelable.Creator<TrackGroupArray> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray[] newArray(int i10) {
            return new TrackGroupArray[i10];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f19436c = trackGroupArr;
        this.f19435b = trackGroupArr.length;
    }

    public int b(TrackGroup trackGroup) {
        for (int i10 = 0; i10 < this.f19435b; i10++) {
            if (this.f19436c[i10] == trackGroup) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.f19435b == trackGroupArray.f19435b && Arrays.equals(this.f19436c, trackGroupArray.f19436c);
    }

    public TrackGroup a(int i10) {
        return this.f19436c[i10];
    }

    public boolean c() {
        return this.f19435b == 0;
    }

    public int hashCode() {
        if (this.f19437d == 0) {
            this.f19437d = Arrays.hashCode(this.f19436c);
        }
        return this.f19437d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19435b);
        for (int i11 = 0; i11 < this.f19435b; i11++) {
            parcel.writeParcelable(this.f19436c[i11], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f19435b = i10;
        this.f19436c = new TrackGroup[i10];
        for (int i11 = 0; i11 < this.f19435b; i11++) {
            this.f19436c[i11] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
