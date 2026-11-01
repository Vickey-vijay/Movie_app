package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import g5.g0;
import g5.t;

/* JADX INFO: loaded from: classes8.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19371c;

    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    public TimeSignalCommand(long j10, long j11) {
        this.f19370b = j10;
        this.f19371c = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f19370b);
        parcel.writeLong(this.f19371c);
    }

    public static TimeSignalCommand a(t tVar, long j10, g0 g0Var) {
        long jB = b(tVar, j10);
        return new TimeSignalCommand(jB, g0Var.b(jB));
    }

    public static long b(t tVar, long j10) {
        long jY = tVar.y();
        if ((128 & jY) != 0) {
            return 8589934591L & ((((jY & 1) << 32) | tVar.A()) + j10);
        }
        return -9223372036854775807L;
    }
}
