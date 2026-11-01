package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes8.dex */
public class xm3 implements ss1 {
    public static final Parcelable.Creator<xm3> CREATOR = new vm3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84641c;

    public xm3(Parcel parcel) {
        this.f84640b = (String) ib3.a((Object) parcel.readString());
        this.f84641c = (String) ib3.a((Object) parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xm3 xm3Var = (xm3) obj;
        return this.f84640b.equals(xm3Var.f84640b) && this.f84641c.equals(xm3Var.f84641c);
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        String str = this.f84640b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                im1Var.f78700c = this.f84641c;
                break;
            case "TITLE":
                im1Var.f78698a = this.f84641c;
                break;
            case "DESCRIPTION":
                im1Var.f78704g = this.f84641c;
                break;
            case "ALBUMARTIST":
                im1Var.f78701d = this.f84641c;
                break;
            case "ARTIST":
                im1Var.f78699b = this.f84641c;
                break;
        }
    }

    public final int hashCode() {
        return this.f84641c.hashCode() + k4.a(this.f84640b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public final String toString() {
        return "VC: " + this.f84640b + "=" + this.f84641c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f84640b);
        parcel.writeString(this.f84641c);
    }

    public xm3(String str, String str2) {
        this.f84640b = str;
        this.f84641c = str2;
    }
}
