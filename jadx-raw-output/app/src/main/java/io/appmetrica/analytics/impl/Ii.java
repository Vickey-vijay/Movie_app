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
public final class Ii extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Ii[] f55355c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f55356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f55357b;

    public static Ii[] b() {
        if (f55355c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55355c == null) {
                    f55355c = new Ii[0];
                }
            }
        }
        return f55355c;
    }

    public final Ii a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f55356a = bArr;
        this.f55357b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f55356a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f55356a);
        }
        if (!Arrays.equals(this.f55357b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f55357b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Ii() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f55356a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f55356a);
        }
        if (!Arrays.equals(this.f55357b, bArr2)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f55357b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f55356a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f55357b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Ii b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ii().mergeFrom(codedInputByteBufferNano);
    }

    public static Ii a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ii) MessageNano.mergeFrom(new Ii(), bArr);
    }
}
