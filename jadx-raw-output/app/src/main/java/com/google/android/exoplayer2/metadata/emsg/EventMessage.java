package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f19278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Format f19272h = Format.s(null, "application/id3", Long.MAX_VALUE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Format f19273i = Format.s(null, "application/x-scte35", Long.MAX_VALUE);
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f19274b = str;
        this.f19275c = str2;
        this.f19276d = j10;
        this.f19277e = j11;
        this.f19278f = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f19276d == eventMessage.f19276d && this.f19277e == eventMessage.f19277e && k0.c(this.f19274b, eventMessage.f19274b) && k0.c(this.f19275c, eventMessage.f19275c) && Arrays.equals(this.f19278f, eventMessage.f19278f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public Format getWrappedMetadataFormat() {
        String str = this.f19274b;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f19273i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f19272h;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f19279g == 0) {
            String str = this.f19274b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f19275c;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f19276d;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f19277e;
            this.f19279g = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f19278f);
        }
        return this.f19279g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f19274b + ", id=" + this.f19277e + ", durationMs=" + this.f19276d + ", value=" + this.f19275c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19274b);
        parcel.writeString(this.f19275c);
        parcel.writeLong(this.f19276d);
        parcel.writeLong(this.f19277e);
        parcel.writeByteArray(this.f19278f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f19278f;
        }
        return null;
    }

    public EventMessage(Parcel parcel) {
        this.f19274b = (String) k0.i(parcel.readString());
        this.f19275c = (String) k0.i(parcel.readString());
        this.f19276d = parcel.readLong();
        this.f19277e = parcel.readLong();
        this.f19278f = (byte[]) k0.i(parcel.createByteArray());
    }
}
