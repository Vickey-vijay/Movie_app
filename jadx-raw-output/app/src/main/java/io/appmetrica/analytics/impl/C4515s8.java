package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4515s8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4515s8[] f57654c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4416o8 f57655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4490r8 f57656b;

    public static C4515s8[] b() {
        if (f57654c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57654c == null) {
                    f57654c = new C4515s8[0];
                }
            }
        }
        return f57654c;
    }

    public final C4515s8 a() {
        this.f57655a = null;
        this.f57656b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4416o8 c4416o8 = this.f57655a;
        if (c4416o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4416o8);
        }
        C4490r8 c4490r8 = this.f57656b;
        if (c4490r8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4490r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4515s8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4416o8 c4416o8 = this.f57655a;
        if (c4416o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4416o8);
        }
        C4490r8 c4490r8 = this.f57656b;
        if (c4490r8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4490r8);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4515s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f57655a == null) {
                    this.f57655a = new C4416o8();
                }
                codedInputByteBufferNano.readMessage(this.f57655a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f57656b == null) {
                    this.f57656b = new C4490r8();
                }
                codedInputByteBufferNano.readMessage(this.f57656b);
            }
        }
    }

    public static C4515s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4515s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4515s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4515s8) MessageNano.mergeFrom(new C4515s8(), bArr);
    }
}
