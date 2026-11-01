package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4084b9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4084b9[] f56417c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56419b;

    public static C4084b9[] b() {
        if (f56417c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56417c == null) {
                    f56417c = new C4084b9[0];
                }
            }
        }
        return f56417c;
    }

    public final C4084b9 a() {
        this.f56418a = "";
        this.f56419b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f56418a);
        codedOutputByteBufferNano.writeUInt64(2, this.f56419b);
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4084b9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f56419b) + CodedOutputByteBufferNano.computeStringSize(1, this.f56418a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4084b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56418a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56419b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static C4084b9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4084b9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4084b9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4084b9) MessageNano.mergeFrom(new C4084b9(), bArr);
    }
}
