package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4315k8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4315k8[] f57082b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4264i8 f57083a;

    public static C4315k8[] b() {
        if (f57082b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57082b == null) {
                    f57082b = new C4315k8[0];
                }
            }
        }
        return f57082b;
    }

    public final C4315k8 a() {
        this.f57083a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4264i8 c4264i8 = this.f57083a;
        if (c4264i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4264i8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4315k8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4315k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f57083a == null) {
                    this.f57083a = new C4264i8();
                }
                codedInputByteBufferNano.readMessage(this.f57083a);
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4264i8 c4264i8 = this.f57083a;
        if (c4264i8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c4264i8);
        }
        return iComputeSerializedSize;
    }

    public static C4315k8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4315k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4315k8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4315k8) MessageNano.mergeFrom(new C4315k8(), bArr);
    }
}
