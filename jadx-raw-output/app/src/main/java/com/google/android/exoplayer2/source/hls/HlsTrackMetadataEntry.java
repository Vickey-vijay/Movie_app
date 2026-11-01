package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f19580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f19581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<VariantInfo> f19582d;

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f19584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f19585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f19586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f19587f;

        public class a implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public VariantInfo[] newArray(int i10) {
                return new VariantInfo[i10];
            }
        }

        public VariantInfo(long j10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f19583b = j10;
            this.f19584c = str;
            this.f19585d = str2;
            this.f19586e = str3;
            this.f19587f = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f19583b == variantInfo.f19583b && TextUtils.equals(this.f19584c, variantInfo.f19584c) && TextUtils.equals(this.f19585d, variantInfo.f19585d) && TextUtils.equals(this.f19586e, variantInfo.f19586e) && TextUtils.equals(this.f19587f, variantInfo.f19587f);
        }

        public int hashCode() {
            long j10 = this.f19583b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            String str = this.f19584c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f19585d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f19586e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f19587f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f19583b);
            parcel.writeString(this.f19584c);
            parcel.writeString(this.f19585d);
            parcel.writeString(this.f19586e);
            parcel.writeString(this.f19587f);
        }

        public VariantInfo(Parcel parcel) {
            this.f19583b = parcel.readLong();
            this.f19584c = parcel.readString();
            this.f19585d = parcel.readString();
            this.f19586e = parcel.readString();
            this.f19587f = parcel.readString();
        }
    }

    public class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry[] newArray(int i10) {
            return new HlsTrackMetadataEntry[i10];
        }
    }

    public HlsTrackMetadataEntry(@Nullable String str, @Nullable String str2, List<VariantInfo> list) {
        this.f19580b = str;
        this.f19581c = str2;
        this.f19582d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f19580b, hlsTrackMetadataEntry.f19580b) && TextUtils.equals(this.f19581c, hlsTrackMetadataEntry.f19581c) && this.f19582d.equals(hlsTrackMetadataEntry.f19582d);
    }

    public int hashCode() {
        String str = this.f19580b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19581c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f19582d.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f19580b != null) {
            str = " [" + this.f19580b + ", " + this.f19581c + C3426d4.j.f28588e;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19580b);
        parcel.writeString(this.f19581c);
        int size = this.f19582d.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f19582d.get(i11), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f19580b = parcel.readString();
        this.f19581c = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f19582d = Collections.unmodifiableList(arrayList);
    }
}
