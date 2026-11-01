package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f19329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f19330g;

    public class a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f19326c = i10;
        this.f19327d = i11;
        this.f19328e = i12;
        this.f19329f = iArr;
        this.f19330g = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f19326c == mlltFrame.f19326c && this.f19327d == mlltFrame.f19327d && this.f19328e == mlltFrame.f19328e && Arrays.equals(this.f19329f, mlltFrame.f19329f) && Arrays.equals(this.f19330g, mlltFrame.f19330g);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f19326c) * 31) + this.f19327d) * 31) + this.f19328e) * 31) + Arrays.hashCode(this.f19329f)) * 31) + Arrays.hashCode(this.f19330g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19326c);
        parcel.writeInt(this.f19327d);
        parcel.writeInt(this.f19328e);
        parcel.writeIntArray(this.f19329f);
        parcel.writeIntArray(this.f19330g);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f19326c = parcel.readInt();
        this.f19327d = parcel.readInt();
        this.f19328e = parcel.readInt();
        this.f19329f = (int[]) k0.i(parcel.createIntArray());
        this.f19330g = (int[]) k0.i(parcel.createIntArray());
    }
}
