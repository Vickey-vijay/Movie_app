package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class FileDownloadTaskAtom implements Parcelable {
    public static final Parcelable.Creator<FileDownloadTaskAtom> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31912d;

    public class a implements Parcelable.Creator<FileDownloadTaskAtom> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadTaskAtom createFromParcel(Parcel parcel) {
            return new FileDownloadTaskAtom(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadTaskAtom[] newArray(int i10) {
            return new FileDownloadTaskAtom[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31910b);
        parcel.writeString(this.f31911c);
        parcel.writeLong(this.f31912d);
    }

    public FileDownloadTaskAtom(Parcel parcel) {
        this.f31910b = parcel.readString();
        this.f31911c = parcel.readString();
        this.f31912d = parcel.readLong();
    }
}
