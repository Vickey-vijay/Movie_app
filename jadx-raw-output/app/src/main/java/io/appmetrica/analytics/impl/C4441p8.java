package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4441p8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4441p8[] f57497b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57498a;

    public static C4441p8[] b() {
        if (f57497b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57497b == null) {
                    f57497b = new C4441p8[0];
                }
            }
        }
        return f57497b;
    }

    public final C4441p8 a() {
        this.f57498a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f57498a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f57498a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4441p8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4441p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f57498a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f57498a, WireFormatNano.EMPTY_BYTES)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f57498a);
        }
        return iComputeSerializedSize;
    }

    public static C4441p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4441p8) MessageNano.mergeFrom(new C4441p8(), bArr);
    }

    public static C4441p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4441p8().mergeFrom(codedInputByteBufferNano);
    }
}
