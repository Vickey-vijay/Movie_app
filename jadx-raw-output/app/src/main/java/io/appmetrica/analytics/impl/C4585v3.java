package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4585v3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4585v3[] f57786c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4635x3 f57787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57788b;

    public static C4585v3[] b() {
        if (f57786c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57786c == null) {
                    f57786c = new C4585v3[0];
                }
            }
        }
        return f57786c;
    }

    public final C4585v3 a() {
        this.f57787a = null;
        this.f57788b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4635x3 c4635x3 = this.f57787a;
        if (c4635x3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4635x3);
        }
        int i10 = this.f57788b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4585v3() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4635x3 c4635x3 = this.f57787a;
        if (c4635x3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4635x3);
        }
        int i10 = this.f57788b;
        if (i10 != 0) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4585v3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f57787a == null) {
                    this.f57787a = new C4635x3();
                }
                codedInputByteBufferNano.readMessage(this.f57787a);
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f57788b = int32;
                }
            }
        }
    }

    public static C4585v3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4585v3().mergeFrom(codedInputByteBufferNano);
    }

    public static C4585v3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4585v3) MessageNano.mergeFrom(new C4585v3(), bArr);
    }
}
