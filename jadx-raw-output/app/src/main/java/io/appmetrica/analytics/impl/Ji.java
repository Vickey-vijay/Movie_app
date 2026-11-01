package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class Ji extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Ji[] f55433e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f55434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ki f55435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f55437d;

    public static Ji[] b() {
        if (f55433e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55433e == null) {
                    f55433e = new Ji[0];
                }
            }
        }
        return f55433e;
    }

    public final Ji a() {
        this.f55434a = 0L;
        this.f55435b = null;
        this.f55436c = 0;
        this.f55437d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f55434a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        Ki ki2 = this.f55435b;
        if (ki2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ki2);
        }
        int i10 = this.f55436c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i10);
        }
        if (!Arrays.equals(this.f55437d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f55437d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Ji() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f55434a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        Ki ki2 = this.f55435b;
        if (ki2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ki2);
        }
        int i10 = this.f55436c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f55437d, WireFormatNano.EMPTY_BYTES)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f55437d);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ji mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f55434a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f55435b == null) {
                    this.f55435b = new Ki();
                }
                codedInputByteBufferNano.readMessage(this.f55435b);
            } else if (tag == 24) {
                this.f55436c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f55437d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Ji b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ji().mergeFrom(codedInputByteBufferNano);
    }

    public static Ji a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ji) MessageNano.mergeFrom(new Ji(), bArr);
    }
}
