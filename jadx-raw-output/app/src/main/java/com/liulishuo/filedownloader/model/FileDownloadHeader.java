package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FileDownloadHeader implements Parcelable {
    public static final Parcelable.Creator<FileDownloadHeader> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, List<String>> f31897b;

    public class a implements Parcelable.Creator<FileDownloadHeader> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadHeader createFromParcel(Parcel parcel) {
            return new FileDownloadHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadHeader[] newArray(int i10) {
            return new FileDownloadHeader[i10];
        }
    }

    public FileDownloadHeader() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FileDownloadHeader(Parcel parcel) {
        this.f31897b = parcel.readHashMap(String.class.getClassLoader());
    }

    public HashMap<String, List<String>> c() {
        return this.f31897b;
    }

    public String toString() {
        return this.f31897b.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeMap(this.f31897b);
    }
}
