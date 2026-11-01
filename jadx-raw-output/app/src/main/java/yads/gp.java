package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class gp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new hp[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        gs1 gs1VarCreateFromParcel;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            arrayList.add(gb.CREATOR.createFromParcel(parcel));
        }
        if (parcel.readInt() == 0) {
            gs1VarCreateFromParcel = null;
        } else {
            gs1VarCreateFromParcel = gs1.CREATOR.createFromParcel(parcel);
        }
        return new hp(arrayList, gs1VarCreateFromParcel);
    }
}
