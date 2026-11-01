package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ae1 implements Parcelable {
    public static final Parcelable.Creator<ae1> CREATOR = new zd1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f75491d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae1)) {
            return false;
        }
        ae1 ae1Var = (ae1) obj;
        return ck.p.e(this.f75489b, ae1Var.f75489b) && ck.p.e(this.f75490c, ae1Var.f75490c) && this.f75491d == ae1Var.f75491d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75491d) + k4.a(this.f75490c, this.f75489b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "JavaScriptResource(apiFramework=" + this.f75489b + ", url=" + this.f75490c + ", browserOptional=" + this.f75491d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f75489b);
        parcel.writeString(this.f75490c);
        parcel.writeInt(this.f75491d ? 1 : 0);
    }

    public ae1(String str, String str2, boolean z10) {
        this.f75489b = str;
        this.f75490c = str2;
        this.f75491d = z10;
    }
}
