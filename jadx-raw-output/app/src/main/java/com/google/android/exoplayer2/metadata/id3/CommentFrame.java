package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19317e;

    public class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i10) {
            return new CommentFrame[i10];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f19315c = str;
        this.f19316d = str2;
        this.f19317e = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return k0.c(this.f19316d, commentFrame.f19316d) && k0.c(this.f19315c, commentFrame.f19315c) && k0.c(this.f19317e, commentFrame.f19317e);
    }

    public int hashCode() {
        String str = this.f19315c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19316d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19317e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f19322b + ": language=" + this.f19315c + ", description=" + this.f19316d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19322b);
        parcel.writeString(this.f19315c);
        parcel.writeString(this.f19317e);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f19315c = (String) k0.i(parcel.readString());
        this.f19316d = (String) k0.i(parcel.readString());
        this.f19317e = (String) k0.i(parcel.readString());
    }
}
