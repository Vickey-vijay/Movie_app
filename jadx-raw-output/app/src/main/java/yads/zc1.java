package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class zc1 extends v21 {
    public static final Parcelable.Creator<zc1> CREATOR = new yc1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f85341e;

    public zc1(Parcel parcel) {
        super("----");
        this.f85339c = (String) ib3.a((Object) parcel.readString());
        this.f85340d = (String) ib3.a((Object) parcel.readString());
        this.f85341e = (String) ib3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zc1.class != obj.getClass()) {
            return false;
        }
        zc1 zc1Var = (zc1) obj;
        return ib3.a(this.f85340d, zc1Var.f85340d) && ib3.a(this.f85339c, zc1Var.f85339c) && ib3.a(this.f85341e, zc1Var.f85341e);
    }

    public final int hashCode() {
        String str = this.f85339c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f85340d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85341e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f83729b + ": domain=" + this.f85339c + ", description=" + this.f85340d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f83729b);
        parcel.writeString(this.f85339c);
        parcel.writeString(this.f85341e);
    }

    public zc1(String str, String str2, String str3) {
        super("----");
        this.f85339c = str;
        this.f85340d = str2;
        this.f85341e = str3;
    }
}
