package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bs1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new cs1[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        int i10 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new cs1(string, linkedHashMap);
    }
}
