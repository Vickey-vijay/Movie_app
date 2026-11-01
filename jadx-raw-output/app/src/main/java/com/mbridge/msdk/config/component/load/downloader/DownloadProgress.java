package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33242c;

    public class a implements Parcelable.Creator<DownloadProgress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    }

    public DownloadProgress(long j10, long j11, int i10) {
        this.f33240a = j10;
        this.f33242c = j11;
        this.f33241b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f33240a;
    }

    public int getCurrentDownloadRate() {
        return this.f33241b;
    }

    public long getTotal() {
        return this.f33242c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f33240a);
        parcel.writeLong(this.f33242c);
        parcel.writeInt(this.f33241b);
    }

    public DownloadProgress(Parcel parcel) {
        this.f33240a = parcel.readLong();
        this.f33242c = parcel.readLong();
        this.f33241b = parcel.readInt();
    }
}
