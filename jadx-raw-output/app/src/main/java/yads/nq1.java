package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class nq1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new qq1[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        j5 j5VarCreateFromParcel;
        String string = parcel.readString();
        int i10 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
        LinkedHashMap linkedHashMap2 = null;
        if (parcel.readInt() == 0) {
            j5VarCreateFromParcel = null;
        } else {
            j5VarCreateFromParcel = j5.CREATOR.createFromParcel(parcel);
        }
        j5 j5Var = j5VarCreateFromParcel;
        if (parcel.readInt() != 0) {
            int i12 = parcel.readInt();
            linkedHashMap2 = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
        }
        return new qq1(string, linkedHashMap, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, j5Var, linkedHashMap2);
    }
}
