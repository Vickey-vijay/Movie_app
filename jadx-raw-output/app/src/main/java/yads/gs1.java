package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@xk.f
public final class gs1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f77921c;
    public static final es1 Companion = new es1();
    public static final Parcelable.Creator<gs1> CREATOR = new fs1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xk.b[] f77919d = {null, new bl.f(ur1.f83586a)};

    public /* synthetic */ gs1(int i10, long j10, List list) {
        this.f77920b = (i10 & 1) == 0 ? 30000L : j10;
        if ((i10 & 2) == 0) {
            this.f77921c = nj.s.k();
        } else {
            this.f77921c = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs1)) {
            return false;
        }
        gs1 gs1Var = (gs1) obj;
        return this.f77920b == gs1Var.f77920b && ck.p.e(this.f77921c, gs1Var.f77921c);
    }

    public final int hashCode() {
        return this.f77921c.hashCode() + (Long.hashCode(this.f77920b) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.f77920b + ", mediationPrefetchAdUnits=" + this.f77921c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f77920b);
        List list = this.f77921c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((xr1) it.next()).writeToParcel(parcel, i10);
        }
    }

    public gs1(long j10, ArrayList arrayList) {
        this.f77920b = j10;
        this.f77921c = arrayList;
    }
}
