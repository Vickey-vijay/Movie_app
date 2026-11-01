package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class gb implements Parcelable {
    public static final Parcelable.Creator<gb> CREATOR = new fb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f77718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77719d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return ck.p.e(this.f77717b, gbVar.f77717b) && ck.p.e(this.f77718c, gbVar.f77718c) && ck.p.e(this.f77719d, gbVar.f77719d);
    }

    public final int hashCode() {
        return this.f77719d.hashCode() + eb.a(this.f77718c, this.f77717b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnitIdBiddingSettings(adUnitId=" + this.f77717b + ", mediationNetworks=" + this.f77718c + ", rawData=" + this.f77719d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f77717b);
        List list = this.f77718c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((qq1) it.next()).writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f77719d);
    }

    public gb(String str, String str2, ArrayList arrayList) {
        this.f77717b = str;
        this.f77718c = arrayList;
        this.f77719d = str2;
    }
}
