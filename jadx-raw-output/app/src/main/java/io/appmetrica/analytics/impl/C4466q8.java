package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4466q8 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C4466q8[] f57553d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f57555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4490r8 f57556c;

    public static C4466q8[] b() {
        if (f57553d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57553d == null) {
                    f57553d = new C4466q8[0];
                }
            }
        }
        return f57553d;
    }

    public final C4466q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f57554a = bArr;
        this.f57555b = bArr;
        this.f57556c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f57554a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f57554a);
        }
        if (!Arrays.equals(this.f57555b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f57555b);
        }
        C4490r8 c4490r8 = this.f57556c;
        if (c4490r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4490r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4466q8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f57554a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f57554a);
        }
        if (!Arrays.equals(this.f57555b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f57555b);
        }
        C4490r8 c4490r8 = this.f57556c;
        if (c4490r8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c4490r8);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4466q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57554a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f57555b = codedInputByteBufferNano.readBytes();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f57556c == null) {
                    this.f57556c = new C4490r8();
                }
                codedInputByteBufferNano.readMessage(this.f57556c);
            }
        }
    }

    public static C4466q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4466q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4466q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4466q8) MessageNano.mergeFrom(new C4466q8(), bArr);
    }
}
