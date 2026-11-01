package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class ut extends v21 {
    public static final Parcelable.Creator<ut> CREATOR = new tt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f83597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f83598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f83599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v21[] f83600h;

    public ut(Parcel parcel) {
        super("CHAP");
        this.f83595c = (String) ib3.a((Object) parcel.readString());
        this.f83596d = parcel.readInt();
        this.f83597e = parcel.readInt();
        this.f83598f = parcel.readLong();
        this.f83599g = parcel.readLong();
        int i10 = parcel.readInt();
        this.f83600h = new v21[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f83600h[i11] = (v21) parcel.readParcelable(v21.class.getClassLoader());
        }
    }

    @Override // yads.v21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ut.class != obj.getClass()) {
            return false;
        }
        ut utVar = (ut) obj;
        return this.f83596d == utVar.f83596d && this.f83597e == utVar.f83597e && this.f83598f == utVar.f83598f && this.f83599g == utVar.f83599g && ib3.a(this.f83595c, utVar.f83595c) && Arrays.equals(this.f83600h, utVar.f83600h);
    }

    public final int hashCode() {
        int i10 = (((((((this.f83596d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f83597e) * 31) + ((int) this.f83598f)) * 31) + ((int) this.f83599g)) * 31;
        String str = this.f83595c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f83595c);
        parcel.writeInt(this.f83596d);
        parcel.writeInt(this.f83597e);
        parcel.writeLong(this.f83598f);
        parcel.writeLong(this.f83599g);
        parcel.writeInt(this.f83600h.length);
        for (v21 v21Var : this.f83600h) {
            parcel.writeParcelable(v21Var, 0);
        }
    }

    public ut(String str, int i10, int i11, long j10, long j11, v21[] v21VarArr) {
        super("CHAP");
        this.f83595c = str;
        this.f83596d = i10;
        this.f83597e = i11;
        this.f83598f = j10;
        this.f83599g = j11;
        this.f83600h = v21VarArr;
    }
}
