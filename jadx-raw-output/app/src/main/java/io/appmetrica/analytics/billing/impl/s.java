package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile s[] f54462c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54464b;

    public static s[] b() {
        if (f54462c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54462c == null) {
                    f54462c = new s[0];
                }
            }
        }
        return f54462c;
    }

    public final s a() {
        this.f54463a = 86400;
        this.f54464b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f54463a;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        int i11 = this.f54464b;
        if (i11 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public s() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f54463a;
        if (i10 != 86400) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        int i11 = this.f54464b;
        if (i11 != 86400) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i11);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f54463a = codedInputByteBufferNano.readInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f54464b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new s().mergeFrom(codedInputByteBufferNano);
    }

    public static s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (s) MessageNano.mergeFrom(new s(), bArr);
    }
}
