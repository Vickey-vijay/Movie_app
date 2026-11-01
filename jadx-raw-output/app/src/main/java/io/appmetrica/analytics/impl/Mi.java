package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Mi extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55583f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55584g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55585h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Mi[] f55586i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f55587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f55588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f55590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f55591e;

    public static Mi[] b() {
        if (f55586i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55586i == null) {
                    f55586i = new Mi[0];
                }
            }
        }
        return f55586i;
    }

    public final Mi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f55587a = bArr;
        this.f55588b = 0L;
        this.f55589c = 0;
        this.f55590d = bArr;
        this.f55591e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f55587a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f55587a);
        }
        long j10 = this.f55588b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f55589c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f55590d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f55590d);
        }
        long j11 = this.f55591e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Mi() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f55587a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f55587a);
        }
        long j10 = this.f55588b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f55589c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f55590d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f55590d);
        }
        long j11 = this.f55591e;
        if (j11 != 0) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j11);
        }
        return iComputeSerializedSize;
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f55587a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f55588b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f55589c = int32;
                }
            } else if (tag == 34) {
                this.f55590d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f55591e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static Mi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }
}
