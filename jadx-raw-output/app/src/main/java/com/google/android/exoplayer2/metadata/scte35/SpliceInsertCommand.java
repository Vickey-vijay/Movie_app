package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import g5.g0;
import g5.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<b> f19347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f19349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f19352n;

    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19355c;

        public /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public b(int i10, long j10, long j11) {
            this.f19353a = i10;
            this.f19354b = j10;
            this.f19355c = j11;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f19353a);
            parcel.writeLong(this.f19354b);
            parcel.writeLong(this.f19355c);
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f19340b = j10;
        this.f19341c = z10;
        this.f19342d = z11;
        this.f19343e = z12;
        this.f19344f = z13;
        this.f19345g = j11;
        this.f19346h = j12;
        this.f19347i = Collections.unmodifiableList(list);
        this.f19348j = z14;
        this.f19349k = j13;
        this.f19350l = i10;
        this.f19351m = i11;
        this.f19352n = i12;
    }

    public static SpliceInsertCommand a(t tVar, long j10, g0 g0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int iE;
        int iY;
        int iY2;
        boolean z13;
        boolean z14;
        long jA;
        long jA2 = tVar.A();
        boolean z15 = (tVar.y() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            iE = 0;
            iY = 0;
            iY2 = 0;
            z13 = false;
        } else {
            int iY3 = tVar.y();
            boolean z16 = (iY3 & 128) != 0;
            boolean z17 = (iY3 & 64) != 0;
            boolean z18 = (iY3 & 32) != 0;
            boolean z19 = (iY3 & 16) != 0;
            long jB = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.b(tVar, j10);
            if (!z17) {
                int iY4 = tVar.y();
                ArrayList arrayList = new ArrayList(iY4);
                for (int i10 = 0; i10 < iY4; i10++) {
                    int iY5 = tVar.y();
                    long jB2 = !z19 ? TimeSignalCommand.b(tVar, j10) : -9223372036854775807L;
                    arrayList.add(new b(iY5, jB2, g0Var.b(jB2), null));
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jY = tVar.y();
                boolean z20 = (128 & jY) != 0;
                jA = ((((jY & 1) << 32) | tVar.A()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                jA = -9223372036854775807L;
            }
            iE = tVar.E();
            z13 = z17;
            iY = tVar.y();
            iY2 = tVar.y();
            list = listEmptyList;
            long j13 = jB;
            z12 = z14;
            j12 = jA;
            z11 = z19;
            z10 = z16;
            j11 = j13;
        }
        return new SpliceInsertCommand(jA2, z15, z10, z13, z11, j11, g0Var.b(j11), list, z12, j12, iE, iY, iY2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f19340b);
        parcel.writeByte(this.f19341c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19342d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19343e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19344f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f19345g);
        parcel.writeLong(this.f19346h);
        int size = this.f19347i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f19347i.get(i11).b(parcel);
        }
        parcel.writeByte(this.f19348j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f19349k);
        parcel.writeInt(this.f19350l);
        parcel.writeInt(this.f19351m);
        parcel.writeInt(this.f19352n);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f19340b = parcel.readLong();
        this.f19341c = parcel.readByte() == 1;
        this.f19342d = parcel.readByte() == 1;
        this.f19343e = parcel.readByte() == 1;
        this.f19344f = parcel.readByte() == 1;
        this.f19345g = parcel.readLong();
        this.f19346h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f19347i = Collections.unmodifiableList(arrayList);
        this.f19348j = parcel.readByte() == 1;
        this.f19349k = parcel.readLong();
        this.f19350l = parcel.readInt();
        this.f19351m = parcel.readInt();
        this.f19352n = parcel.readInt();
    }
}
