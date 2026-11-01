package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class Ki extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55472c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55473d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55474e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55475f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55476g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Ki[] f55477h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55479b;

    public static Ki[] b() {
        if (f55477h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55477h == null) {
                    f55477h = new Ki[0];
                }
            }
        }
        return f55477h;
    }

    public final Ki a() {
        this.f55478a = 0;
        this.f55479b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f55478a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f55479b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Ki() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f55478a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f55479b;
        if (i11 != 0) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i11);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ki mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f55478a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f55479b = int32;
                }
            }
        }
    }

    public static Ki b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ki().mergeFrom(codedInputByteBufferNano);
    }

    public static Ki a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ki) MessageNano.mergeFrom(new Ki(), bArr);
    }
}
