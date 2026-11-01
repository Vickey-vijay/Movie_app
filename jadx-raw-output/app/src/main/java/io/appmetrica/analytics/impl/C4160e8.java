package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4160e8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4160e8[] f56657b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4186f8 f56658a;

    public static C4160e8[] b() {
        if (f56657b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56657b == null) {
                    f56657b = new C4160e8[0];
                }
            }
        }
        return f56657b;
    }

    public final C4160e8 a() {
        this.f56658a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4186f8 c4186f8 = this.f56658a;
        if (c4186f8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4186f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4160e8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4160e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f56658a == null) {
                    this.f56658a = new C4186f8();
                }
                codedInputByteBufferNano.readMessage(this.f56658a);
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4186f8 c4186f8 = this.f56658a;
        if (c4186f8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c4186f8);
        }
        return iComputeSerializedSize;
    }

    public static C4160e8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4160e8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4160e8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4160e8) MessageNano.mergeFrom(new C4160e8(), bArr);
    }
}
