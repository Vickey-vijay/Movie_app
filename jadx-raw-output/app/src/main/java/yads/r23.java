package yads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes10.dex */
public final class r23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f82084b;

    public static r23 a(Parcel parcel) {
        return new r23(parcel.readInt(), parcel.readLong());
    }

    public r23(int i10, long j10) {
        this.f82083a = i10;
        this.f82084b = j10;
    }
}
