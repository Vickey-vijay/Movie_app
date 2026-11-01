package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n23 extends j23 {
    public static final Parcelable.Creator<n23> CREATOR = new l23();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f80534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f80537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f80538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f80539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f80540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f80541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f80542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f80543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f80544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f80545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f80546n;

    public n23(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f80534b = j10;
        this.f80535c = z10;
        this.f80536d = z11;
        this.f80537e = z12;
        this.f80538f = z13;
        this.f80539g = j11;
        this.f80540h = j12;
        this.f80541i = Collections.unmodifiableList(list);
        this.f80542j = z14;
        this.f80543k = j13;
        this.f80544l = i10;
        this.f80545m = i11;
        this.f80546n = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f80534b);
        parcel.writeByte(this.f80535c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f80536d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f80537e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f80538f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f80539g);
        parcel.writeLong(this.f80540h);
        int size = this.f80541i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            m23 m23Var = (m23) this.f80541i.get(i11);
            parcel.writeInt(m23Var.f80049a);
            parcel.writeLong(m23Var.f80050b);
            parcel.writeLong(m23Var.f80051c);
        }
        parcel.writeByte(this.f80542j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f80543k);
        parcel.writeInt(this.f80544l);
        parcel.writeInt(this.f80545m);
        parcel.writeInt(this.f80546n);
    }

    public n23(Parcel parcel) {
        this.f80534b = parcel.readLong();
        this.f80535c = parcel.readByte() == 1;
        this.f80536d = parcel.readByte() == 1;
        this.f80537e = parcel.readByte() == 1;
        this.f80538f = parcel.readByte() == 1;
        this.f80539g = parcel.readLong();
        this.f80540h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(m23.a(parcel));
        }
        this.f80541i = Collections.unmodifiableList(arrayList);
        this.f80542j = parcel.readByte() == 1;
        this.f80543k = parcel.readLong();
        this.f80544l = parcel.readInt();
        this.f80545m = parcel.readInt();
        this.f80546n = parcel.readInt();
    }
}
