package com.liulishuo.filedownloader.message;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class SmallMessageSnapshot extends MessageSnapshot {

    public static class CompletedSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f31885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31886e;

        public CompletedSnapshot(int i10, boolean z10, int i11) {
            super(i10);
            this.f31885d = z10;
            this.f31886e = i11;
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
        public int l() {
            return this.f31886e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean p() {
            return this.f31885d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f31885d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f31886e);
        }

        public CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f31885d = parcel.readByte() != 0;
            this.f31886e = parcel.readInt();
        }
    }

    public static class ConnectedMessageSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f31887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31888e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f31889f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f31890g;

        public ConnectedMessageSnapshot(int i10, boolean z10, int i11, String str, String str2) {
            super(i10);
            this.f31887d = z10;
            this.f31888e = i11;
            this.f31889f = str;
            this.f31890g = str2;
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
            return this.f31889f;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String f() {
            return this.f31890g;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int l() {
            return this.f31888e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean o() {
            return this.f31887d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f31887d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f31888e);
            parcel.writeString(this.f31889f);
            parcel.writeString(this.f31890g);
        }

        public ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31887d = parcel.readByte() != 0;
            this.f31888e = parcel.readInt();
            this.f31889f = parcel.readString();
            this.f31890g = parcel.readString();
        }
    }

    public static class ErrorMessageSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f31891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Throwable f31892e;

        public ErrorMessageSnapshot(int i10, int i11, Throwable th2) {
            super(i10);
            this.f31891d = i11;
            this.f31892e = th2;
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
        public int k() {
            return this.f31891d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public Throwable m() {
            return this.f31892e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f31891d);
            parcel.writeSerializable(this.f31892e);
        }

        public ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31891d = parcel.readInt();
            this.f31892e = (Throwable) parcel.readSerializable();
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, s7.b
        public byte getStatus() {
            return (byte) -2;
        }
    }

    public static class PendingMessageSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f31893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31894e;

        public PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.g(), pendingMessageSnapshot.k(), pendingMessageSnapshot.l());
        }

        @Override // s7.b
        public byte getStatus() {
            return (byte) 1;
        }

        public PendingMessageSnapshot(int i10, int i11, int i12) {
            super(i10);
            this.f31893d = i11;
            this.f31894e = i12;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int k() {
            return this.f31893d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int l() {
            return this.f31894e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f31893d);
            parcel.writeInt(this.f31894e);
        }

        public PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31893d = parcel.readInt();
            this.f31894e = parcel.readInt();
        }
    }

    public static class ProgressMessageSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f31895d;

        public ProgressMessageSnapshot(int i10, int i11) {
            super(i10);
            this.f31895d = i11;
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
        public int k() {
            return this.f31895d;
        }

        public ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31895d = parcel.readInt();
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f31895d);
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31896f;

        public RetryMessageSnapshot(int i10, int i11, Throwable th2, int i12) {
            super(i10, i11, th2);
            this.f31896f = i12;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, s7.b
        public byte getStatus() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int j() {
            return this.f31896f;
        }

        public RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f31896f = parcel.readInt();
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f31896f);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.b {
        public WarnMessageSnapshot(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, s7.b
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

    public SmallMessageSnapshot(int i10) {
        super(i10);
        this.f31884c = false;
    }

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements s7.a {
        public CompletedFlowDirectlySnapshot(int i10, boolean z10, int i11) {
            super(i10, z10, i11);
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements s7.a {
        public WarnFlowDirectlySnapshot(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }
    }

    public SmallMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public long h() {
        return k();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public long i() {
        return l();
    }
}
