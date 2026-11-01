package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4341l8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4341l8[] f57177c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f57179b;

    public static C4341l8[] b() {
        if (f57177c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57177c == null) {
                    f57177c = new C4341l8[0];
                }
            }
        }
        return f57177c;
    }

    public final C4341l8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f57178a = bArr;
        this.f57179b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f57178a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f57178a);
        }
        if (!Arrays.equals(this.f57179b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f57179b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4341l8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f57178a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f57178a);
        }
        if (!Arrays.equals(this.f57179b, bArr2)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f57179b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4341l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57178a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57179b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C4341l8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4341l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4341l8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4341l8) MessageNano.mergeFrom(new C4341l8(), bArr);
    }
}
