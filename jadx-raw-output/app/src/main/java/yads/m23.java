package yads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes11.dex */
public final class m23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f80050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f80051c;

    public static m23 a(Parcel parcel) {
        return new m23(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public m23(int i10, long j10, long j11) {
        this.f80049a = i10;
        this.f80050b = j10;
        this.f80051c = j11;
    }
}
