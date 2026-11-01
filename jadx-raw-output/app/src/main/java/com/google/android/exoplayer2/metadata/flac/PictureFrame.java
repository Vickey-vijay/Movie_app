package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f19287i;

    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f19280b = i10;
        this.f19281c = str;
        this.f19282d = str2;
        this.f19283e = i11;
        this.f19284f = i12;
        this.f19285g = i13;
        this.f19286h = i14;
        this.f19287i = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f19280b == pictureFrame.f19280b && this.f19281c.equals(pictureFrame.f19281c) && this.f19282d.equals(pictureFrame.f19282d) && this.f19283e == pictureFrame.f19283e && this.f19284f == pictureFrame.f19284f && this.f19285g == pictureFrame.f19285g && this.f19286h == pictureFrame.f19286h && Arrays.equals(this.f19287i, pictureFrame.f19287i);
    }

    public int hashCode() {
        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f19280b) * 31) + this.f19281c.hashCode()) * 31) + this.f19282d.hashCode()) * 31) + this.f19283e) * 31) + this.f19284f) * 31) + this.f19285g) * 31) + this.f19286h) * 31) + Arrays.hashCode(this.f19287i);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f19281c + ", description=" + this.f19282d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19280b);
        parcel.writeString(this.f19281c);
        parcel.writeString(this.f19282d);
        parcel.writeInt(this.f19283e);
        parcel.writeInt(this.f19284f);
        parcel.writeInt(this.f19285g);
        parcel.writeInt(this.f19286h);
        parcel.writeByteArray(this.f19287i);
    }

    public PictureFrame(Parcel parcel) {
        this.f19280b = parcel.readInt();
        this.f19281c = (String) k0.i(parcel.readString());
        this.f19282d = (String) k0.i(parcel.readString());
        this.f19283e = parcel.readInt();
        this.f19284f = parcel.readInt();
        this.f19285g = parcel.readInt();
        this.f19286h = parcel.readInt();
        this.f19287i = (byte[]) k0.i(parcel.createByteArray());
    }
}
