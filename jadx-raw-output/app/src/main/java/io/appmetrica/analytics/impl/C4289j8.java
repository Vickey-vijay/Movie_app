package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4289j8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4289j8[] f57005c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4186f8 f57007b;

    public static C4289j8[] b() {
        if (f57005c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57005c == null) {
                    f57005c = new C4289j8[0];
                }
            }
        }
        return f57005c;
    }

    public final C4289j8 a() {
        this.f57006a = 0;
        this.f57007b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f57006a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        C4186f8 c4186f8 = this.f57007b;
        if (c4186f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4186f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4289j8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f57006a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        C4186f8 c4186f8 = this.f57007b;
        if (c4186f8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4186f8);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4289j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f57006a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f57007b == null) {
                    this.f57007b = new C4186f8();
                }
                codedInputByteBufferNano.readMessage(this.f57007b);
            }
        }
    }

    public static C4289j8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4289j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4289j8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4289j8) MessageNano.mergeFrom(new C4289j8(), bArr);
    }
}
