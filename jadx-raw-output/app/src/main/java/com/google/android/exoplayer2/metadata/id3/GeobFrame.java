package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f19321f;

    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19318c = str;
        this.f19319d = str2;
        this.f19320e = str3;
        this.f19321f = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return k0.c(this.f19318c, geobFrame.f19318c) && k0.c(this.f19319d, geobFrame.f19319d) && k0.c(this.f19320e, geobFrame.f19320e) && Arrays.equals(this.f19321f, geobFrame.f19321f);
    }

    public int hashCode() {
        String str = this.f19318c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19319d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19320e;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19321f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f19322b + ": mimeType=" + this.f19318c + ", filename=" + this.f19319d + ", description=" + this.f19320e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19318c);
        parcel.writeString(this.f19319d);
        parcel.writeString(this.f19320e);
        parcel.writeByteArray(this.f19321f);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f19318c = (String) k0.i(parcel.readString());
        this.f19319d = (String) k0.i(parcel.readString());
        this.f19320e = (String) k0.i(parcel.readString());
        this.f19321f = (byte[]) k0.i(parcel.createByteArray());
    }
}
