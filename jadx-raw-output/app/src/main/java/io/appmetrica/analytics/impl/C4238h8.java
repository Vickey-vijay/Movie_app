package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4238h8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4238h8[] f56880c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f56881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56882b;

    public static C4238h8[] b() {
        if (f56880c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56880c == null) {
                    f56880c = new C4238h8[0];
                }
            }
        }
        return f56880c;
    }

    public final C4238h8 a() {
        this.f56881a = 0L;
        this.f56882b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f56881a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        int i10 = this.f56882b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4238h8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f56881a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        int i10 = this.f56882b;
        if (i10 != 0) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4238h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f56881a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56882b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static C4238h8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4238h8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4238h8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4238h8) MessageNano.mergeFrom(new C4238h8(), bArr);
    }
}
