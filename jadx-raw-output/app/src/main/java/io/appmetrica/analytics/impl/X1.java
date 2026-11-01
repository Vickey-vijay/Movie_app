package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class X1 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile X1[] f56127c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56129b;

    public static X1[] b() {
        if (f56127c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56127c == null) {
                    f56127c = new X1[0];
                }
            }
        }
        return f56127c;
    }

    public final X1 a() {
        this.f56128a = "";
        this.f56129b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f56128a);
        codedOutputByteBufferNano.writeBool(2, this.f56129b);
        super.writeTo(codedOutputByteBufferNano);
    }

    public X1() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f56129b) + CodedOutputByteBufferNano.computeStringSize(1, this.f56128a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56128a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56129b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static X1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X1().mergeFrom(codedInputByteBufferNano);
    }

    public static X1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X1) MessageNano.mergeFrom(new X1(), bArr);
    }
}
