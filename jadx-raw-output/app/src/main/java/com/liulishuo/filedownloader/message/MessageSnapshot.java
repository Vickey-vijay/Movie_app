package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MessageSnapshot implements s7.b, Parcelable {
    public static final Parcelable.Creator<MessageSnapshot> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31884c;

    public static class NoFieldException extends IllegalStateException {
        public NoFieldException(String str, MessageSnapshot messageSnapshot) {
            super(f.o("There isn't a field for '%s' in this message %d %d %s", str, Integer.valueOf(messageSnapshot.g()), Byte.valueOf(messageSnapshot.getStatus()), messageSnapshot.getClass().getName()));
        }
    }

    public static class StartedMessageSnapshot extends MessageSnapshot {
        public StartedMessageSnapshot(int i10) {
            super(i10);
        }

        @Override // s7.b
        public byte getStatus() {
            return (byte) 6;
        }

        public StartedMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    public class a implements Parcelable.Creator<MessageSnapshot> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageSnapshot[] newArray(int i10) {
            return new MessageSnapshot[i10];
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0094  */
        /* JADX WARN: Code duplicated, block: B:48:0x0097  */
        /* JADX WARN: Instruction removed from duplicated block: B:48:0x0097, please report this as an issue */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageSnapshot createFromParcel(Parcel parcel) {
            boolean z10;
            MessageSnapshot warnMessageSnapshot;
            MessageSnapshot messageSnapshot;
            if (parcel.readByte() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte b10 = parcel.readByte();
            if (b10 != -4) {
                if (b10 != -3) {
                    if (b10 != -1) {
                        if (b10 != 1) {
                            if (b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 != 5) {
                                        if (b10 != 6) {
                                            messageSnapshot = null;
                                        } else {
                                            warnMessageSnapshot = new StartedMessageSnapshot(parcel);
                                        }
                                        if (messageSnapshot != null) {
                                            messageSnapshot.f31884c = z10;
                                            return messageSnapshot;
                                        }
                                        throw new IllegalStateException("Can't restore the snapshot because unknown status: " + ((int) b10));
                                    }
                                    if (z10) {
                                        warnMessageSnapshot = new LargeMessageSnapshot.RetryMessageSnapshot(parcel);
                                    } else {
                                        warnMessageSnapshot = new SmallMessageSnapshot.RetryMessageSnapshot(parcel);
                                    }
                                } else if (z10) {
                                    warnMessageSnapshot = new LargeMessageSnapshot.ProgressMessageSnapshot(parcel);
                                } else {
                                    warnMessageSnapshot = new SmallMessageSnapshot.ProgressMessageSnapshot(parcel);
                                }
                            } else if (z10) {
                                warnMessageSnapshot = new LargeMessageSnapshot.ConnectedMessageSnapshot(parcel);
                            } else {
                                warnMessageSnapshot = new SmallMessageSnapshot.ConnectedMessageSnapshot(parcel);
                            }
                        } else if (z10) {
                            warnMessageSnapshot = new LargeMessageSnapshot.PendingMessageSnapshot(parcel);
                        } else {
                            warnMessageSnapshot = new SmallMessageSnapshot.PendingMessageSnapshot(parcel);
                        }
                    } else if (z10) {
                        warnMessageSnapshot = new LargeMessageSnapshot.ErrorMessageSnapshot(parcel);
                    } else {
                        warnMessageSnapshot = new SmallMessageSnapshot.ErrorMessageSnapshot(parcel);
                    }
                } else if (z10) {
                    warnMessageSnapshot = new LargeMessageSnapshot.CompletedSnapshot(parcel);
                } else {
                    warnMessageSnapshot = new SmallMessageSnapshot.CompletedSnapshot(parcel);
                }
            } else if (z10) {
                warnMessageSnapshot = new LargeMessageSnapshot.WarnMessageSnapshot(parcel);
            } else {
                warnMessageSnapshot = new SmallMessageSnapshot.WarnMessageSnapshot(parcel);
            }
            messageSnapshot = warnMessageSnapshot;
            if (messageSnapshot != null) {
                messageSnapshot.f31884c = z10;
                return messageSnapshot;
            }
            throw new IllegalStateException("Can't restore the snapshot because unknown status: " + ((int) b10));
        }
    }

    public interface b {
        MessageSnapshot c();
    }

    public MessageSnapshot(int i10) {
        this.f31883b = i10;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        throw new NoFieldException("getEtag", this);
    }

    public String f() {
        throw new NoFieldException("getFileName", this);
    }

    public int g() {
        return this.f31883b;
    }

    public long h() {
        throw new NoFieldException("getLargeSofarBytes", this);
    }

    public long i() {
        throw new NoFieldException("getLargeTotalBytes", this);
    }

    public int j() {
        throw new NoFieldException("getRetryingTimes", this);
    }

    public int k() {
        throw new NoFieldException("getSmallSofarBytes", this);
    }

    public int l() {
        throw new NoFieldException("getSmallTotalBytes", this);
    }

    public Throwable m() {
        throw new NoFieldException("getThrowable", this);
    }

    public boolean n() {
        return this.f31884c;
    }

    public boolean o() {
        throw new NoFieldException("isResuming", this);
    }

    public boolean p() {
        throw new NoFieldException("isReusedDownloadedFile", this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f31884c ? (byte) 1 : (byte) 0);
        parcel.writeByte(getStatus());
        parcel.writeInt(this.f31883b);
    }

    public MessageSnapshot(Parcel parcel) {
        this.f31883b = parcel.readInt();
    }
}
