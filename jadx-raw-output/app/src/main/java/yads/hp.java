package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class hp implements Parcelable {
    public static final Parcelable.Creator<hp> CREATOR = new gp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gs1 f78295c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return ck.p.e(this.f78294b, hpVar.f78294b) && ck.p.e(this.f78295c, hpVar.f78295c);
    }

    public final int hashCode() {
        int iHashCode = this.f78294b.hashCode() * 31;
        gs1 gs1Var = this.f78295c;
        return iHashCode + (gs1Var == null ? 0 : gs1Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.f78294b + ", mediationPrefetchSettings=" + this.f78295c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f78294b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gb) it.next()).writeToParcel(parcel, i10);
        }
        gs1 gs1Var = this.f78295c;
        if (gs1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gs1Var.writeToParcel(parcel, i10);
        }
    }

    public hp(ArrayList arrayList, gs1 gs1Var) {
        this.f78294b = arrayList;
        this.f78295c = gs1Var;
    }
}
