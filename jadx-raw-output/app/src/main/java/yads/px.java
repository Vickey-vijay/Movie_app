package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes10.dex */
public final class px extends v21 {
    public static final Parcelable.Creator<px> CREATOR = new ox();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f81640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f81641e;

    public px(Parcel parcel) {
        super("COMM");
        this.f81639c = (String) ib3.a((Object) parcel.readString());
        this.f81640d = (String) ib3.a((Object) parcel.readString());
        this.f81641e = (String) ib3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || px.class != obj.getClass()) {
            return false;
        }
        px pxVar = (px) obj;
        return ib3.a(this.f81640d, pxVar.f81640d) && ib3.a(this.f81639c, pxVar.f81639c) && ib3.a(this.f81641e, pxVar.f81641e);
    }

    public final int hashCode() {
        String str = this.f81639c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f81640d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f81641e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f83729b + ": language=" + this.f81639c + ", description=" + this.f81640d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f83729b);
        parcel.writeString(this.f81639c);
        parcel.writeString(this.f81641e);
    }

    public px(String str, String str2, String str3) {
        super("COMM");
        this.f81639c = str;
        this.f81640d = str2;
        this.f81641e = str3;
    }
}
