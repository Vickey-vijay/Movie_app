package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class oq2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new qq2(parcel.readInt() != 0, parcel.readInt() == 0 ? null : rv.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? yx2.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new qq2[i10];
    }
}
