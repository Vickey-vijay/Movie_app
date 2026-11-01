package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19289c;

    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f19288b = str;
        this.f19289c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f19288b.equals(vorbisComment.f19288b) && this.f19289c.equals(vorbisComment.f19289c);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f19288b.hashCode()) * 31) + this.f19289c.hashCode();
    }

    public String toString() {
        return "VC: " + this.f19288b + "=" + this.f19289c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19288b);
        parcel.writeString(this.f19289c);
    }

    public VorbisComment(Parcel parcel) {
        this.f19288b = (String) k0.i(parcel.readString());
        this.f19289c = (String) k0.i(parcel.readString());
    }
}
