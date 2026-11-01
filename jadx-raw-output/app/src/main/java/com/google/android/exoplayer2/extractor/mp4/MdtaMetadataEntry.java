package com.google.android.exoplayer2.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f19191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19193e;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f19190b.equals(mdtaMetadataEntry.f19190b) && Arrays.equals(this.f19191c, mdtaMetadataEntry.f19191c) && this.f19192d == mdtaMetadataEntry.f19192d && this.f19193e == mdtaMetadataEntry.f19193e;
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.f19190b = str;
        this.f19191c = bArr;
        this.f19192d = i10;
        this.f19193e = i11;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f19190b.hashCode()) * 31) + Arrays.hashCode(this.f19191c)) * 31) + this.f19192d) * 31) + this.f19193e;
    }

    public String toString() {
        return "mdta: key=" + this.f19190b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19190b);
        parcel.writeInt(this.f19191c.length);
        parcel.writeByteArray(this.f19191c);
        parcel.writeInt(this.f19192d);
        parcel.writeInt(this.f19193e);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.f19190b = (String) k0.i(parcel.readString());
        byte[] bArr = new byte[parcel.readInt()];
        this.f19191c = bArr;
        parcel.readByteArray(bArr);
        this.f19192d = parcel.readInt();
        this.f19193e = parcel.readInt();
    }
}
