package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class B9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55005c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55006d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55007e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55008f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55009g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55010h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f55011i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile B9[] f55012j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f55014b;

    public static B9[] b() {
        if (f55012j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55012j == null) {
                    f55012j = new B9[0];
                }
            }
        }
        return f55012j;
    }

    public final B9 a() {
        this.f55013a = 0;
        this.f55014b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f55013a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!Arrays.equals(this.f55014b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f55014b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public B9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f55013a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (!Arrays.equals(this.f55014b, WireFormatNano.EMPTY_BYTES)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f55014b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f55013a = int32;
                        break;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f55014b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    public static B9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}
