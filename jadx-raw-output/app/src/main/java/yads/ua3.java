package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes10.dex */
public final class ua3 extends v21 {
    public static final Parcelable.Creator<ua3> CREATOR = new ta3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f83406d;

    public ua3(Parcel parcel) {
        super((String) ib3.a((Object) parcel.readString()));
        this.f83405c = parcel.readString();
        this.f83406d = (String) ib3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ua3.class != obj.getClass()) {
            return false;
        }
        ua3 ua3Var = (ua3) obj;
        return this.f83729b.equals(ua3Var.f83729b) && ib3.a(this.f83405c, ua3Var.f83405c) && ib3.a(this.f83406d, ua3Var.f83406d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f83729b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f83405c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83406d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f83729b + ": url=" + this.f83406d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f83729b);
        parcel.writeString(this.f83405c);
        parcel.writeString(this.f83406d);
    }

    public ua3(String str, String str2, String str3) {
        super(str);
        this.f83405c = str2;
        this.f83406d = str3;
    }
}
