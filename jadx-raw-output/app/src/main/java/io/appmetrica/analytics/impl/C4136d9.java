package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4136d9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4136d9[] f56577c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f56578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f56579b;

    public static C4136d9[] b() {
        if (f56577c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56577c == null) {
                    f56577c = new C4136d9[0];
                }
            }
        }
        return f56577c;
    }

    public final C4136d9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f56578a = bArr;
        this.f56579b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f56578a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f56578a);
        }
        if (!Arrays.equals(this.f56579b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f56579b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4136d9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f56578a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f56578a);
        }
        if (!Arrays.equals(this.f56579b, bArr2)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f56579b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4136d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56578a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56579b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C4136d9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4136d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4136d9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4136d9) MessageNano.mergeFrom(new C4136d9(), bArr);
    }
}
