package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f19313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Id3Frame[] f19314g;

    public class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f19310c = str;
        this.f19311d = z10;
        this.f19312e = z11;
        this.f19313f = strArr;
        this.f19314g = id3FrameArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f19311d == chapterTocFrame.f19311d && this.f19312e == chapterTocFrame.f19312e && k0.c(this.f19310c, chapterTocFrame.f19310c) && Arrays.equals(this.f19313f, chapterTocFrame.f19313f) && Arrays.equals(this.f19314g, chapterTocFrame.f19314g);
    }

    public int hashCode() {
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f19311d ? 1 : 0)) * 31) + (this.f19312e ? 1 : 0)) * 31;
        String str = this.f19310c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19310c);
        parcel.writeByte(this.f19311d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19312e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f19313f);
        parcel.writeInt(this.f19314g.length);
        for (Id3Frame id3Frame : this.f19314g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f19310c = (String) k0.i(parcel.readString());
        this.f19311d = parcel.readByte() != 0;
        this.f19312e = parcel.readByte() != 0;
        this.f19313f = (String[]) k0.i(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f19314g = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19314g[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
