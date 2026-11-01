package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class U5 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile U5[] f55964c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f55965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f55966b;

    public static U5[] b() {
        if (f55964c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55964c == null) {
                    f55964c = new U5[0];
                }
            }
        }
        return f55964c;
    }

    public final U5 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f55965a = bArr;
        this.f55966b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f55965a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f55965a);
        }
        if (!Arrays.equals(this.f55966b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f55966b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public U5() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f55965a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f55965a);
        }
        if (!Arrays.equals(this.f55966b, bArr2)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f55966b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f55965a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f55966b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static U5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new U5().mergeFrom(codedInputByteBufferNano);
    }

    public static U5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (U5) MessageNano.mergeFrom(new U5(), bArr);
    }
}
