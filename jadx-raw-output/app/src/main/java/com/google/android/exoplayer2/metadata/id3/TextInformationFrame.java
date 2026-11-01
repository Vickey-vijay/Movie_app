package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f19333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19334d;

    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    }

    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f19333c = str2;
        this.f19334d = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return this.f19322b.equals(textInformationFrame.f19322b) && k0.c(this.f19333c, textInformationFrame.f19333c) && k0.c(this.f19334d, textInformationFrame.f19334d);
    }

    public int hashCode() {
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f19322b.hashCode()) * 31;
        String str = this.f19333c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19334d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f19322b + ": description=" + this.f19333c + ": value=" + this.f19334d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19322b);
        parcel.writeString(this.f19333c);
        parcel.writeString(this.f19334d);
    }

    public TextInformationFrame(Parcel parcel) {
        super((String) k0.i(parcel.readString()));
        this.f19333c = parcel.readString();
        this.f19334d = (String) k0.i(parcel.readString());
    }
}
