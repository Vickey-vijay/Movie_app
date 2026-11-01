package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4504rm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4504rm[] f57614b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f57615a;

    public static C4504rm[] b() {
        if (f57614b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57614b == null) {
                    f57614b = new C4504rm[0];
                }
            }
        }
        return f57614b;
    }

    public final C4504rm a() {
        this.f57615a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f57615a;
        if (j10 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4504rm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4504rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f57615a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f57615a;
        if (j10 != 864000000) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        return iComputeSerializedSize;
    }

    public static C4504rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4504rm) MessageNano.mergeFrom(new C4504rm(), bArr);
    }

    public static C4504rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4504rm().mergeFrom(codedInputByteBufferNano);
    }
}
