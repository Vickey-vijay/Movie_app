package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35081c;

    public class a implements Parcelable.Creator<BatchReportMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f35081c = str;
        this.f35079a = str2;
        this.f35080b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f35079a;
    }

    public long getTimestamp() {
        return this.f35080b;
    }

    public String getUuid() {
        return this.f35081c;
    }

    public void setReportMessage(String str) {
        this.f35079a = str;
    }

    public void setTimestamp(long j10) {
        this.f35080b = j10;
    }

    public void setUuid(String str) {
        this.f35081c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f35081c);
        parcel.writeString(this.f35079a);
        parcel.writeLong(this.f35080b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.f35081c = parcel.readString();
        this.f35079a = parcel.readString();
        this.f35080b = parcel.readLong();
    }
}
