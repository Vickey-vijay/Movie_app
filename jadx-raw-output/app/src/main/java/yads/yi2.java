package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class yi2 extends j23 {
    public static final Parcelable.Creator<yi2> CREATOR = new xi2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f85001d;

    public yi2(long j10, byte[] bArr, long j11) {
        this.f84999b = j11;
        this.f85000c = j10;
        this.f85001d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f84999b);
        parcel.writeLong(this.f85000c);
        parcel.writeByteArray(this.f85001d);
    }

    public yi2(Parcel parcel) {
        this.f84999b = parcel.readLong();
        this.f85000c = parcel.readLong();
        this.f85001d = (byte[]) ib3.a((Object) parcel.createByteArray());
    }
}
