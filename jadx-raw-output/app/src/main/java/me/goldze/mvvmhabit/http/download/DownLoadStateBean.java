package me.goldze.mvvmhabit.http.download;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class DownLoadStateBean implements Serializable, Parcelable {
    public static final Parcelable.Creator<DownLoadStateBean> CREATOR = new a();
    public long bytesLoaded;
    public String tag;
    public long total;

    public class a implements Parcelable.Creator<DownLoadStateBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownLoadStateBean createFromParcel(Parcel parcel) {
            return new DownLoadStateBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownLoadStateBean[] newArray(int i10) {
            return new DownLoadStateBean[i10];
        }
    }

    public DownLoadStateBean(long j10, long j11) {
        this.total = j10;
        this.bytesLoaded = j11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getBytesLoaded() {
        return this.bytesLoaded;
    }

    public String getTag() {
        return this.tag;
    }

    public long getTotal() {
        return this.total;
    }

    public void setBytesLoaded(long j10) {
        this.bytesLoaded = j10;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTotal(long j10) {
        this.total = j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.total);
        parcel.writeLong(this.bytesLoaded);
        parcel.writeString(this.tag);
    }

    public DownLoadStateBean(long j10, long j11, String str) {
        this.total = j10;
        this.bytesLoaded = j11;
        this.tag = str;
    }

    public DownLoadStateBean(Parcel parcel) {
        this.total = parcel.readLong();
        this.bytesLoaded = parcel.readLong();
        this.tag = parcel.readString();
    }
}
