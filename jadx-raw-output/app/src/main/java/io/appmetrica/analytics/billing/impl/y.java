package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f54488f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f54489g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f54490h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile y[] f54491i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f54492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f54493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f54495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54496e;

    public static y[] b() {
        if (f54491i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54491i == null) {
                    f54491i = new y[0];
                }
            }
        }
        return f54491i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f54492a = bArr;
        this.f54493b = 0L;
        this.f54494c = 0;
        this.f54495d = bArr;
        this.f54496e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f54492a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f54492a);
        }
        long j10 = this.f54493b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f54494c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f54495d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f54495d);
        }
        long j11 = this.f54496e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public y() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f54492a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f54492a);
        }
        long j10 = this.f54493b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f54494c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f54495d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f54495d);
        }
        long j11 = this.f54496e;
        if (j11 != 0) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j11);
        }
        return iComputeSerializedSize;
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f54492a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f54493b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f54494c = int32;
                }
            } else if (tag == 34) {
                this.f54495d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f54496e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
