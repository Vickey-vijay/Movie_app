package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import g5.k0;
import g5.t;

/* JADX INFO: loaded from: classes11.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f19339d;

    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f19337b = j11;
        this.f19338c = j10;
        this.f19339d = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f19337b);
        parcel.writeLong(this.f19338c);
        parcel.writeByteArray(this.f19339d);
    }

    public static PrivateCommand a(t tVar, int i10, long j10) {
        long jA = tVar.A();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        return new PrivateCommand(jA, bArr, j10);
    }

    public PrivateCommand(Parcel parcel) {
        this.f19337b = parcel.readLong();
        this.f19338c = parcel.readLong();
        this.f19339d = (byte[]) k0.i(parcel.createByteArray());
    }
}
