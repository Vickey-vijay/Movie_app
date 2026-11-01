package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Id3Frame[] f19309h;

    public class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f19304c = str;
        this.f19305d = i10;
        this.f19306e = i11;
        this.f19307f = j10;
        this.f19308g = j11;
        this.f19309h = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f19305d == chapterFrame.f19305d && this.f19306e == chapterFrame.f19306e && this.f19307f == chapterFrame.f19307f && this.f19308g == chapterFrame.f19308g && k0.c(this.f19304c, chapterFrame.f19304c) && Arrays.equals(this.f19309h, chapterFrame.f19309h);
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f19305d) * 31) + this.f19306e) * 31) + ((int) this.f19307f)) * 31) + ((int) this.f19308g)) * 31;
        String str = this.f19304c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19304c);
        parcel.writeInt(this.f19305d);
        parcel.writeInt(this.f19306e);
        parcel.writeLong(this.f19307f);
        parcel.writeLong(this.f19308g);
        parcel.writeInt(this.f19309h.length);
        for (Id3Frame id3Frame : this.f19309h) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f19304c = (String) k0.i(parcel.readString());
        this.f19305d = parcel.readInt();
        this.f19306e = parcel.readInt();
        this.f19307f = parcel.readLong();
        this.f19308g = parcel.readLong();
        int i10 = parcel.readInt();
        this.f19309h = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19309h[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
