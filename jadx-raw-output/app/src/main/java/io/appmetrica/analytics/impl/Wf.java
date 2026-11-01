package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class Wf extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56110e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f56111f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f56112g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Wf[] f56113h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f56114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f56116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56117d;

    public static Wf[] b() {
        if (f56113h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56113h == null) {
                    f56113h = new Wf[0];
                }
            }
        }
        return f56113h;
    }

    public final Wf a() {
        this.f56114a = WireFormatNano.EMPTY_BYTES;
        this.f56115b = 0L;
        this.f56116c = 0L;
        this.f56117d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f56114a);
        long j10 = this.f56115b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f56116c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i10 = this.f56117d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Wf() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f56114a) + super.computeSerializedSize();
        long j10 = this.f56115b;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f56116c;
        if (j11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i10 = this.f56117d;
        if (i10 != 0) {
            return iComputeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        return iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Wf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56114a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f56115b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f56116c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f56117d = int32;
                }
            }
        }
    }

    public static Wf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Wf().mergeFrom(codedInputByteBufferNano);
    }

    public static Wf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Wf) MessageNano.mergeFrom(new Wf(), bArr);
    }
}
