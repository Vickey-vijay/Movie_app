package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class t23 extends j23 {
    public static final Parcelable.Creator<t23> CREATOR = new q23();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f82871b;

    public t23(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(s23.a(parcel));
        }
        this.f82871b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.f82871b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            s23 s23Var = (s23) this.f82871b.get(i11);
            parcel.writeLong(s23Var.f82501a);
            parcel.writeByte(s23Var.f82502b ? (byte) 1 : (byte) 0);
            parcel.writeByte(s23Var.f82503c ? (byte) 1 : (byte) 0);
            parcel.writeByte(s23Var.f82504d ? (byte) 1 : (byte) 0);
            int size2 = s23Var.f82506f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                r23 r23Var = (r23) s23Var.f82506f.get(i12);
                parcel.writeInt(r23Var.f82083a);
                parcel.writeLong(r23Var.f82084b);
            }
            parcel.writeLong(s23Var.f82505e);
            parcel.writeByte(s23Var.f82507g ? (byte) 1 : (byte) 0);
            parcel.writeLong(s23Var.f82508h);
            parcel.writeInt(s23Var.f82509i);
            parcel.writeInt(s23Var.f82510j);
            parcel.writeInt(s23Var.f82511k);
        }
    }

    public t23(ArrayList arrayList) {
        this.f82871b = Collections.unmodifiableList(arrayList);
    }
}
