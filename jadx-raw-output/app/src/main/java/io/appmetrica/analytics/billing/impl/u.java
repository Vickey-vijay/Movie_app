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
public final class u extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile u[] f54468c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f54469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f54470b;

    public static u[] b() {
        if (f54468c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54468c == null) {
                    f54468c = new u[0];
                }
            }
        }
        return f54468c;
    }

    public final u a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f54469a = bArr;
        this.f54470b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f54469a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f54469a);
        }
        if (!Arrays.equals(this.f54470b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f54470b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public u() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f54469a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f54469a);
        }
        if (!Arrays.equals(this.f54470b, bArr2)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f54470b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f54469a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f54470b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static u b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new u().mergeFrom(codedInputByteBufferNano);
    }

    public static u a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (u) MessageNano.mergeFrom(new u(), bArr);
    }
}
