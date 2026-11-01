package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class P extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile P[] f58387c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f58388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f58389b;

    public static P[] b() {
        if (f58387c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f58387c == null) {
                    f58387c = new P[0];
                }
            }
        }
        return f58387c;
    }

    public final P a() {
        this.f58388a = true;
        this.f58389b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f58388a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        long j10 = this.f58389b;
        if (j10 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public P() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f58388a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        long j10 = this.f58389b;
        if (j10 != 1) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(2, j10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f58388a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f58389b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static P b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P().mergeFrom(codedInputByteBufferNano);
    }

    public static P a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P) MessageNano.mergeFrom(new P(), bArr);
    }
}
