package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4212g8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4212g8[] f56797b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[][] f56798a;

    public static C4212g8[] b() {
        if (f56797b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56797b == null) {
                    f56797b = new C4212g8[0];
                }
            }
        }
        return f56797b;
    }

    public final C4212g8 a() {
        this.f56798a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f56798a;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            while (true) {
                byte[][] bArr2 = this.f56798a;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4212g8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4212g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f56798a;
                int length = bArr == null ? 0 : bArr.length;
                int i10 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i10][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i10 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f56798a = bArr2;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f56798a;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            int iComputeBytesSizeNoTag = 0;
            int i11 = 0;
            while (true) {
                byte[][] bArr2 = this.f56798a;
                if (i10 < bArr2.length) {
                    byte[] bArr3 = bArr2[i10];
                    if (bArr3 != null) {
                        i11++;
                        iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
                    }
                    i10++;
                } else {
                    return iComputeSerializedSize + iComputeBytesSizeNoTag + i11;
                }
            }
        } else {
            return iComputeSerializedSize;
        }
    }

    public static C4212g8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4212g8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4212g8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4212g8) MessageNano.mergeFrom(new C4212g8(), bArr);
    }
}
