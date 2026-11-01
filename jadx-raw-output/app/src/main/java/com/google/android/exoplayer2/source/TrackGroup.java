package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format[] f19432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19433d;

    public class a implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroup[] newArray(int i10) {
            return new TrackGroup[i10];
        }
    }

    public TrackGroup(Format... formatArr) {
        g5.a.f(formatArr.length > 0);
        this.f19432c = formatArr;
        this.f19431b = formatArr.length;
    }

    public int b(Format format) {
        int i10 = 0;
        while (true) {
            Format[] formatArr = this.f19432c;
            if (i10 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.f19431b == trackGroup.f19431b && Arrays.equals(this.f19432c, trackGroup.f19432c);
    }

    public Format a(int i10) {
        return this.f19432c[i10];
    }

    public int hashCode() {
        if (this.f19433d == 0) {
            this.f19433d = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f19432c);
        }
        return this.f19433d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19431b);
        for (int i11 = 0; i11 < this.f19431b; i11++) {
            parcel.writeParcelable(this.f19432c[i11], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f19431b = i10;
        this.f19432c = new Format[i10];
        for (int i11 = 0; i11 < this.f19431b; i11++) {
            this.f19432c[i11] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
