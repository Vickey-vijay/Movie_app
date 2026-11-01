package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f19300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f19302f;

    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(String str, @Nullable String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f19299c = str;
        this.f19300d = str2;
        this.f19301e = i10;
        this.f19302f = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f19301e == apicFrame.f19301e && k0.c(this.f19299c, apicFrame.f19299c) && k0.c(this.f19300d, apicFrame.f19300d) && Arrays.equals(this.f19302f, apicFrame.f19302f);
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f19301e) * 31;
        String str = this.f19299c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19300d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19302f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f19322b + ": mimeType=" + this.f19299c + ", description=" + this.f19300d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19299c);
        parcel.writeString(this.f19300d);
        parcel.writeInt(this.f19301e);
        parcel.writeByteArray(this.f19302f);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f19299c = (String) k0.i(parcel.readString());
        this.f19300d = parcel.readString();
        this.f19301e = parcel.readInt();
        this.f19302f = (byte[]) k0.i(parcel.createByteArray());
    }
}
