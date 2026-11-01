package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes10.dex */
public final class r13 implements ss1 {
    public static final Parcelable.Creator<r13> CREATOR = new q13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f82077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82078c;

    public r13(int i10, float f10) {
        this.f82077b = f10;
        this.f82078c = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r13.class != obj.getClass()) {
            return false;
        }
        r13 r13Var = (r13) obj;
        return this.f82077b == r13Var.f82077b && this.f82078c == r13Var.f82078c;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f82077b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f82078c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f82077b + ", svcTemporalLayerCount=" + this.f82078c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f82077b);
        parcel.writeInt(this.f82078c);
    }

    public r13(Parcel parcel) {
        this.f82077b = parcel.readFloat();
        this.f82078c = parcel.readInt();
    }
}
