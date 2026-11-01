package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@xk.f
public final class cs1 implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xk.b[] f76413d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f76415c;
    public static final as1 Companion = new as1();
    public static final Parcelable.Creator<cs1> CREATOR = new bs1();

    public /* synthetic */ cs1(int i10, String str, Map map) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, zr1.f85576a.getDescriptor());
        }
        this.f76414b = str;
        this.f76415c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        return ck.p.e(this.f76414b, cs1Var.f76414b) && ck.p.e(this.f76415c, cs1Var.f76415c);
    }

    static {
        bl.d2 d2Var = bl.d2.f5397a;
        f76413d = new xk.b[]{null, new bl.u0(d2Var, yk.a.t(d2Var))};
    }

    public cs1(String str, LinkedHashMap linkedHashMap) {
        this.f76414b = str;
        this.f76415c = linkedHashMap;
    }

    public final int hashCode() {
        return this.f76415c.hashCode() + (this.f76414b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.f76414b + ", networkData=" + this.f76415c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76414b);
        Map map = this.f76415c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
