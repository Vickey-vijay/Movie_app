package yads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f82501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f82503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f82504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f82505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f82506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f82507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f82508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f82509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f82510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f82511k;

    public s23(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f82501a = j10;
        this.f82502b = z10;
        this.f82503c = z11;
        this.f82504d = z12;
        this.f82506f = Collections.unmodifiableList(arrayList);
        this.f82505e = j11;
        this.f82507g = z13;
        this.f82508h = j12;
        this.f82509i = i10;
        this.f82510j = i11;
        this.f82511k = i12;
    }

    public static s23 a(Parcel parcel) {
        return new s23(parcel);
    }

    public s23(Parcel parcel) {
        this.f82501a = parcel.readLong();
        this.f82502b = parcel.readByte() == 1;
        this.f82503c = parcel.readByte() == 1;
        this.f82504d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(r23.a(parcel));
        }
        this.f82506f = Collections.unmodifiableList(arrayList);
        this.f82505e = parcel.readLong();
        this.f82507g = parcel.readByte() == 1;
        this.f82508h = parcel.readLong();
        this.f82509i = parcel.readInt();
        this.f82510j = parcel.readInt();
        this.f82511k = parcel.readInt();
    }
}
