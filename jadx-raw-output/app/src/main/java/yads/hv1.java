package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class hv1 implements ss1 {
    public static final Parcelable.Creator<hv1> CREATOR = new gv1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f78397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f78398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f78399f;

    public hv1(long j10, long j11, long j12, long j13, long j14) {
        this.f78395b = j10;
        this.f78396c = j11;
        this.f78397d = j12;
        this.f78398e = j13;
        this.f78399f = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hv1.class != obj.getClass()) {
            return false;
        }
        hv1 hv1Var = (hv1) obj;
        return this.f78395b == hv1Var.f78395b && this.f78396c == hv1Var.f78396c && this.f78397d == hv1Var.f78397d && this.f78398e == hv1Var.f78398e && this.f78399f == hv1Var.f78399f;
    }

    public final int hashCode() {
        long j10 = this.f78395b;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        long j11 = this.f78396c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f78397d;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f78398e;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f78399f;
        return i13 + ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f78395b + ", photoSize=" + this.f78396c + ", photoPresentationTimestampUs=" + this.f78397d + ", videoStartPosition=" + this.f78398e + ", videoSize=" + this.f78399f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f78395b);
        parcel.writeLong(this.f78396c);
        parcel.writeLong(this.f78397d);
        parcel.writeLong(this.f78398e);
        parcel.writeLong(this.f78399f);
    }

    public hv1(Parcel parcel) {
        this.f78395b = parcel.readLong();
        this.f78396c = parcel.readLong();
        this.f78397d = parcel.readLong();
        this.f78398e = parcel.readLong();
        this.f78399f = parcel.readLong();
    }
}
