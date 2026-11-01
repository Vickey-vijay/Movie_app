package com.liulishuo.filedownloader.message;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class LargeMessageSnapshot extends MessageSnapshot {

    public static class CompletedSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f31871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f31872e;

        public CompletedSnapshot(int i10, boolean z10, long j10) {
            super(i10);
            this.f31871d = z10;
            this.f31872e = j10;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // s7.b
        public byte getStatus() {
            return (byte) -3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long i() {
            return this.f31872e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean p() {
            return this.f31871d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f31871d ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f31872e);
        }

        public CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f31871d = parcel.readByte() != 0;
            this.f31872e = parcel.readLong();
        }
    }

    public static class ConnectedMessageSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f31873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f31874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f31875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f31876g;

        public ConnectedMessageSnapshot(int i10, boolean z10, long j10, String str, String str2) {
            super(i10);
            this.f31873d = z10;
            this.f31874e = j10;
            this.f31875f = str;
            this.f31876g = str2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // s7.b
        public byte getStatus() {
            return (byte) 2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String e() {
            return this.f31875f;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String f() {
            return this.f31876g;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long i() {
            return this.f31874e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean o() {
            return this.f31873d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f31873d ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f31874e);
            parcel.writeString(this.f31875f);
            parcel.writeString(this.f31876g);
        }

        public ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31873d = parcel.readByte() != 0;
            this.f31874e = parcel.readLong();
            this.f31875f = parcel.readString();
            this.f31876g = parcel.readString();
        }
    }

    public static class ErrorMessageSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f31877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Throwable f31878e;

        public ErrorMessageSnapshot(int i10, long j10, Throwable th2) {
            super(i10);
            this.f31877d = j10;
            this.f31878e = th2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // s7.b
        public byte getStatus() {
            return (byte) -1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long h() {
            return this.f31877d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public Throwable m() {
            return this.f31878e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeLong(this.f31877d);
            parcel.writeSerializable(this.f31878e);
        }

        public ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31877d = parcel.readLong();
            this.f31878e = (Throwable) parcel.readSerializable();
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.PendingMessageSnapshot, s7.b
        public byte getStatus() {
            return (byte) -2;
        }
    }

    public static class PendingMessageSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f31879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f31880e;

        public PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.g(), pendingMessageSnapshot.h(), pendingMessageSnapshot.i());
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // s7.b
        public byte getStatus() {
            return (byte) 1;
        }

        public PendingMessageSnapshot(int i10, long j10, long j11) {
            super(i10);
            this.f31879d = j10;
            this.f31880e = j11;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long h() {
            return this.f31879d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long i() {
            return this.f31880e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeLong(this.f31879d);
            parcel.writeLong(this.f31880e);
        }

        public PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31879d = parcel.readLong();
            this.f31880e = parcel.readLong();
        }
    }

    public static class ProgressMessageSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f31881d;

        public ProgressMessageSnapshot(int i10, long j10) {
            super(i10);
            this.f31881d = j10;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // s7.b
        public byte getStatus() {
            return (byte) 3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long h() {
            return this.f31881d;
        }

        public ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31881d = parcel.readLong();
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeLong(this.f31881d);
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31882f;

        public RetryMessageSnapshot(int i10, long j10, Throwable th2, int i11) {
            super(i10, j10, th2);
            this.f31882f = i11;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, s7.b
        public byte getStatus() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int j() {
            return this.f31882f;
        }

        public RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31882f = parcel.readInt();
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f31882f);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.b {
        public WarnMessageSnapshot(int i10, long j10, long j11) {
            super(i10, j10, j11);
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.PendingMessageSnapshot, s7.b
        public byte getStatus() {
            return (byte) -4;
        }

        public WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot.b
        public MessageSnapshot c() {
            return new PendingMessageSnapshot(this);
        }
    }

    public LargeMessageSnapshot(int i10) {
        super(i10);
        this.f31884c = true;
    }

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements s7.a {
        public CompletedFlowDirectlySnapshot(int i10, boolean z10, long j10) {
            super(i10, z10, j10);
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements s7.a {
        public WarnFlowDirectlySnapshot(int i10, long j10, long j11) {
            super(i10, j10, j11);
        }
    }

    public LargeMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public int k() {
        if (h() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) h();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public int l() {
        if (i() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) i();
    }
}
