package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4610w3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4610w3[] f57858c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f57860b;

    public static C4610w3[] b() {
        if (f57858c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57858c == null) {
                    f57858c = new C4610w3[0];
                }
            }
        }
        return f57858c;
    }

    public final C4610w3 a() {
        this.f57859a = "";
        this.f57860b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f57859a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f57859a);
        }
        if (!this.f57860b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f57860b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4610w3() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f57859a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f57859a);
        }
        if (!this.f57860b.equals("")) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f57860b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4610w3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57859a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57860b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C4610w3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4610w3().mergeFrom(codedInputByteBufferNano);
    }

    public static C4610w3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4610w3) MessageNano.mergeFrom(new C4610w3(), bArr);
    }
}
