package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54476c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54477d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f54478e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f54479f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f54480g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile w[] f54481h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54483b;

    public static w[] b() {
        if (f54481h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54481h == null) {
                    f54481h = new w[0];
                }
            }
        }
        return f54481h;
    }

    public final w a() {
        this.f54482a = 0;
        this.f54483b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f54482a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f54483b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public w() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f54482a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f54483b;
        if (i11 != 0) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i11);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f54482a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f54483b = int32;
                }
            }
        }
    }

    public static w b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new w().mergeFrom(codedInputByteBufferNano);
    }

    public static w a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (w) MessageNano.mergeFrom(new w(), bArr);
    }
}
