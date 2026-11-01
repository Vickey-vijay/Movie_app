package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import g5.k0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f19374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<StreamKey> f19375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f19376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f19377g;

    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i10) {
            return new DownloadRequest[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f19372b.equals(downloadRequest.f19372b) && this.f19373c.equals(downloadRequest.f19373c) && this.f19374d.equals(downloadRequest.f19374d) && this.f19375e.equals(downloadRequest.f19375e) && k0.c(this.f19376f, downloadRequest.f19376f) && Arrays.equals(this.f19377g, downloadRequest.f19377g);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f19373c.hashCode() * 31) + this.f19372b.hashCode()) * 31) + this.f19373c.hashCode()) * 31) + this.f19374d.hashCode()) * 31) + this.f19375e.hashCode()) * 31;
        String str = this.f19376f;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19377g);
    }

    public String toString() {
        return this.f19373c + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f19372b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19372b);
        parcel.writeString(this.f19373c);
        parcel.writeString(this.f19374d.toString());
        parcel.writeInt(this.f19375e.size());
        for (int i11 = 0; i11 < this.f19375e.size(); i11++) {
            parcel.writeParcelable(this.f19375e.get(i11), 0);
        }
        parcel.writeString(this.f19376f);
        parcel.writeByteArray(this.f19377g);
    }

    public DownloadRequest(Parcel parcel) {
        this.f19372b = (String) k0.i(parcel.readString());
        this.f19373c = (String) k0.i(parcel.readString());
        this.f19374d = Uri.parse((String) k0.i(parcel.readString()));
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f19375e = Collections.unmodifiableList(arrayList);
        this.f19376f = parcel.readString();
        this.f19377g = (byte[]) k0.i(parcel.createByteArray());
    }
}
