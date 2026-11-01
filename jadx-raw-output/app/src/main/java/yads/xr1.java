package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@xk.f
public final class xr1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f84679c;
    public static final vr1 Companion = new vr1();
    public static final Parcelable.Creator<xr1> CREATOR = new wr1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xk.b[] f84677d = {null, new bl.f(zr1.f85576a)};

    public /* synthetic */ xr1(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, ur1.f83586a.getDescriptor());
        }
        this.f84678b = str;
        this.f84679c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr1)) {
            return false;
        }
        xr1 xr1Var = (xr1) obj;
        return ck.p.e(this.f84678b, xr1Var.f84678b) && ck.p.e(this.f84679c, xr1Var.f84679c);
    }

    public xr1(String str, ArrayList arrayList) {
        this.f84678b = str;
        this.f84679c = arrayList;
    }

    public final int hashCode() {
        return this.f84679c.hashCode() + (this.f84678b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.f84678b + ", networks=" + this.f84679c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f84678b);
        List list = this.f84679c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((cs1) it.next()).writeToParcel(parcel, i10);
        }
    }
}
