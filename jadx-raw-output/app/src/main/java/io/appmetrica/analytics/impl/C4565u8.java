package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4565u8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4565u8[] f57759b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4490r8 f57760a;

    public static C4565u8[] b() {
        if (f57759b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57759b == null) {
                    f57759b = new C4565u8[0];
                }
            }
        }
        return f57759b;
    }

    public final C4565u8 a() {
        this.f57760a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4490r8 c4490r8 = this.f57760a;
        if (c4490r8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4490r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4565u8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4565u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f57760a == null) {
                    this.f57760a = new C4490r8();
                }
                codedInputByteBufferNano.readMessage(this.f57760a);
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4490r8 c4490r8 = this.f57760a;
        if (c4490r8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c4490r8);
        }
        return iComputeSerializedSize;
    }

    public static C4565u8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4565u8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4565u8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4565u8) MessageNano.mergeFrom(new C4565u8(), bArr);
    }
}
