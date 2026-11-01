package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import g5.k0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Entry[] f19260b;

    public interface Entry extends Parcelable {
        @Nullable
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        @Nullable
        default Format getWrappedMetadataFormat() {
            return null;
        }
    }

    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f19260b = entryArr;
    }

    public Metadata a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) k0.p0(this.f19260b, entryArr));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Metadata b(@Nullable Metadata metadata) {
        return metadata == null ? this : a(metadata.f19260b);
    }

    public Entry c(int i10) {
        return this.f19260b[i10];
    }

    public int d() {
        return this.f19260b.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19260b, ((Metadata) obj).f19260b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19260b);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f19260b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19260b.length);
        for (Entry entry : this.f19260b) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        Entry[] entryArr = new Entry[list.size()];
        this.f19260b = entryArr;
        list.toArray(entryArr);
    }

    public Metadata(Parcel parcel) {
        this.f19260b = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f19260b;
            if (i10 >= entryArr.length) {
                return;
            }
            entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i10++;
        }
    }
}
