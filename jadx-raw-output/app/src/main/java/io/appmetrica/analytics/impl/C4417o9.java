package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4417o9 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4417o9[] f57401b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57402a;

    public static C4417o9[] b() {
        if (f57401b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57401b == null) {
                    f57401b = new C4417o9[0];
                }
            }
        }
        return f57401b;
    }

    public final C4417o9 a() {
        this.f57402a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f57402a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f57402a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4417o9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4417o9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f57402a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f57402a, WireFormatNano.EMPTY_BYTES)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f57402a);
        }
        return iComputeSerializedSize;
    }

    public static C4417o9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4417o9) MessageNano.mergeFrom(new C4417o9(), bArr);
    }

    public static C4417o9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4417o9().mergeFrom(codedInputByteBufferNano);
    }
}
