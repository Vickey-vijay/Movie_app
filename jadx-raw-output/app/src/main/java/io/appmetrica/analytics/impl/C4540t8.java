package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4540t8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4540t8[] f57707c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4416o8 f57708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4466q8 f57709b;

    public static C4540t8[] b() {
        if (f57707c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57707c == null) {
                    f57707c = new C4540t8[0];
                }
            }
        }
        return f57707c;
    }

    public final C4540t8 a() {
        this.f57708a = null;
        this.f57709b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4416o8 c4416o8 = this.f57708a;
        if (c4416o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4416o8);
        }
        C4466q8 c4466q8 = this.f57709b;
        if (c4466q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4466q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4540t8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4416o8 c4416o8 = this.f57708a;
        if (c4416o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4416o8);
        }
        C4466q8 c4466q8 = this.f57709b;
        if (c4466q8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4466q8);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4540t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f57708a == null) {
                    this.f57708a = new C4416o8();
                }
                codedInputByteBufferNano.readMessage(this.f57708a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f57709b == null) {
                    this.f57709b = new C4466q8();
                }
                codedInputByteBufferNano.readMessage(this.f57709b);
            }
        }
    }

    public static C4540t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4540t8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4540t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4540t8) MessageNano.mergeFrom(new C4540t8(), bArr);
    }
}
