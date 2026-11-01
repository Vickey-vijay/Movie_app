package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4440p7 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C4440p7[] f57493d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f57494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f57495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57496c;

    public static C4440p7[] b() {
        if (f57493d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57493d == null) {
                    f57493d = new C4440p7[0];
                }
            }
        }
        return f57493d;
    }

    public final C4440p7 a() {
        this.f57494a = -1L;
        this.f57495b = -1L;
        this.f57496c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f57494a;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        long j11 = this.f57495b;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j11);
        }
        int i10 = this.f57496c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4440p7() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f57494a;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        long j11 = this.f57495b;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j11);
        }
        int i10 = this.f57496c;
        if (i10 != -1) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4440p7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f57494a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f57495b = codedInputByteBufferNano.readInt64();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f57496c = int32;
                }
            }
        }
    }

    public static C4440p7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4440p7().mergeFrom(codedInputByteBufferNano);
    }

    public static C4440p7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4440p7) MessageNano.mergeFrom(new C4440p7(), bArr);
    }
}
