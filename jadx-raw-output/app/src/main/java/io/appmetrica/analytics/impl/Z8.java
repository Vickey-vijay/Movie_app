package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class Z8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Z8[] f56274c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56276b;

    public static Z8[] b() {
        if (f56274c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56274c == null) {
                    f56274c = new Z8[0];
                }
            }
        }
        return f56274c;
    }

    public final Z8 a() {
        this.f56275a = "";
        this.f56276b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f56275a);
        codedOutputByteBufferNano.writeString(2, this.f56276b);
        super.writeTo(codedOutputByteBufferNano);
    }

    public Z8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f56276b) + CodedOutputByteBufferNano.computeStringSize(1, this.f56275a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56275a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56276b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z8().mergeFrom(codedInputByteBufferNano);
    }

    public static Z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z8) MessageNano.mergeFrom(new Z8(), bArr);
    }
}
