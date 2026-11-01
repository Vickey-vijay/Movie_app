package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4135d8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4135d8[] f56574c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f56575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4238h8 f56576b;

    public static C4135d8[] b() {
        if (f56574c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56574c == null) {
                    f56574c = new C4135d8[0];
                }
            }
        }
        return f56574c;
    }

    public final C4135d8 a() {
        this.f56575a = WireFormatNano.EMPTY_BYTES;
        this.f56576b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f56575a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f56575a);
        }
        C4238h8 c4238h8 = this.f56576b;
        if (c4238h8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4238h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4135d8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f56575a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f56575a);
        }
        C4238h8 c4238h8 = this.f56576b;
        if (c4238h8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4238h8);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4135d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56575a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f56576b == null) {
                    this.f56576b = new C4238h8();
                }
                codedInputByteBufferNano.readMessage(this.f56576b);
            }
        }
    }

    public static C4135d8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4135d8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4135d8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4135d8) MessageNano.mergeFrom(new C4135d8(), bArr);
    }
}
