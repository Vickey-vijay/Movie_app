package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import g5.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f19356b;

    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19358b;

        public /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public b(int i10, long j10) {
            this.f19357a = i10;
            this.f19358b = j10;
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f19357a);
            parcel.writeLong(this.f19358b);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f19364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f19365g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f19366h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f19367i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f19368j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f19369k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f19359a = j10;
            this.f19360b = z10;
            this.f19361c = z11;
            this.f19362d = z12;
            this.f19364f = Collections.unmodifiableList(list);
            this.f19363e = j11;
            this.f19365g = z13;
            this.f19366h = j12;
            this.f19367i = i10;
            this.f19368j = i11;
            this.f19369k = i12;
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f19359a);
            parcel.writeByte(this.f19360b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f19361c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f19362d ? (byte) 1 : (byte) 0);
            int size = this.f19364f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f19364f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f19363e);
            parcel.writeByte(this.f19365g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f19366h);
            parcel.writeInt(this.f19367i);
            parcel.writeInt(this.f19368j);
            parcel.writeInt(this.f19369k);
        }

        public static c e(t tVar) {
            boolean z10;
            ArrayList arrayList;
            boolean z11;
            long j10;
            boolean z12;
            long j11;
            int i10;
            int i11;
            int iY;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            long jA;
            boolean z17;
            long jA2;
            boolean z18;
            long jA3 = tVar.A();
            if ((tVar.y() & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z10) {
                int iY2 = tVar.y();
                if ((iY2 & 128) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((iY2 & 64) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((iY2 & 32) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z15) {
                    jA = tVar.A();
                } else {
                    jA = -9223372036854775807L;
                }
                if (!z15) {
                    int iY3 = tVar.y();
                    ArrayList arrayList3 = new ArrayList(iY3);
                    for (int i12 = 0; i12 < iY3; i12++) {
                        arrayList3.add(new b(tVar.y(), tVar.A(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long jY = tVar.y();
                    if ((128 & jY) != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    jA2 = ((((jY & 1) << 32) | tVar.A()) * 1000) / 90;
                    z17 = z18;
                } else {
                    z17 = false;
                    jA2 = -9223372036854775807L;
                }
                int iE = tVar.E();
                int iY4 = tVar.y();
                z13 = z15;
                iY = tVar.y();
                j11 = jA2;
                arrayList = arrayList2;
                long j12 = jA;
                i10 = iE;
                i11 = iY4;
                j10 = j12;
                boolean z19 = z14;
                z12 = z17;
                z11 = z19;
            } else {
                arrayList = arrayList2;
                z11 = false;
                j10 = -9223372036854775807L;
                z12 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iY = 0;
                z13 = false;
            }
            return new c(jA3, z10, z11, z13, arrayList, j10, z12, j11, i10, i11, iY);
        }

        public c(Parcel parcel) {
            this.f19359a = parcel.readLong();
            this.f19360b = parcel.readByte() == 1;
            this.f19361c = parcel.readByte() == 1;
            this.f19362d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f19364f = Collections.unmodifiableList(arrayList);
            this.f19363e = parcel.readLong();
            this.f19365g = parcel.readByte() == 1;
            this.f19366h = parcel.readLong();
            this.f19367i = parcel.readInt();
            this.f19368j = parcel.readInt();
            this.f19369k = parcel.readInt();
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<c> list) {
        this.f19356b = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f19356b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f19356b.get(i11).f(parcel);
        }
    }

    public static SpliceScheduleCommand a(t tVar) {
        int iY = tVar.y();
        ArrayList arrayList = new ArrayList(iY);
        for (int i10 = 0; i10 < iY; i10++) {
            arrayList.add(c.e(tVar));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f19356b = Collections.unmodifiableList(arrayList);
    }
}
