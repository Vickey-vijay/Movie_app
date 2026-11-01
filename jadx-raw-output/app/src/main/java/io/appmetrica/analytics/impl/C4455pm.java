package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4455pm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4455pm[] f57525b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f57526a;

    public static C4455pm[] b() {
        if (f57525b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57525b == null) {
                    f57525b = new C4455pm[0];
                }
            }
        }
        return f57525b;
    }

    public final C4455pm a() {
        this.f57526a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f57526a;
        if (j10 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4455pm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4455pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57526a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f57526a;
        if (j10 != 10000) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        return iComputeSerializedSize;
    }

    public static C4455pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4455pm) MessageNano.mergeFrom(new C4455pm(), bArr);
    }

    public static C4455pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4455pm().mergeFrom(codedInputByteBufferNano);
    }
}
