package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;

/* JADX INFO: loaded from: classes10.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19325e;

    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f19323c = str;
        this.f19324d = str2;
        this.f19325e = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return k0.c(this.f19324d, internalFrame.f19324d) && k0.c(this.f19323c, internalFrame.f19323c) && k0.c(this.f19325e, internalFrame.f19325e);
    }

    public int hashCode() {
        String str = this.f19323c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19324d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19325e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f19322b + ": domain=" + this.f19323c + ", description=" + this.f19324d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19322b);
        parcel.writeString(this.f19323c);
        parcel.writeString(this.f19325e);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.f19323c = (String) k0.i(parcel.readString());
        this.f19324d = (String) k0.i(parcel.readString());
        this.f19325e = (String) k0.i(parcel.readString());
    }
}
