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
public final class Mk extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Mk[] f55592c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f55593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f55594b;

    public static Mk[] b() {
        if (f55592c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55592c == null) {
                    f55592c = new Mk[0];
                }
            }
        }
        return f55592c;
    }

    public final Mk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f55593a = bArr;
        this.f55594b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f55593a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f55593a);
        }
        if (!Arrays.equals(this.f55594b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f55594b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Mk() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f55593a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f55593a);
        }
        if (!Arrays.equals(this.f55594b, bArr2)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f55594b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f55593a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f55594b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Mk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mk().mergeFrom(codedInputByteBufferNano);
    }

    public static Mk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mk) MessageNano.mergeFrom(new Mk(), bArr);
    }
}
