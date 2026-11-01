package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4579um extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4579um[] f57776c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f57777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f57778b;

    public static C4579um[] b() {
        if (f57776c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57776c == null) {
                    f57776c = new C4579um[0];
                }
            }
        }
        return f57776c;
    }

    public final C4579um a() {
        this.f57777a = 86400L;
        this.f57778b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f57777a);
        codedOutputByteBufferNano.writeInt64(2, this.f57778b);
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4579um() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f57778b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f57777a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4579um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f57777a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57778b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C4579um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4579um().mergeFrom(codedInputByteBufferNano);
    }

    public static C4579um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4579um) MessageNano.mergeFrom(new C4579um(), bArr);
    }
}
