package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends MessageNano {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f51163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f51164b;

    public final void a() {
        this.f51163a = "";
        this.f51164b = WireFormatNano.EMPTY_LONG_ARRAY;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f51163a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f51163a);
        }
        long[] jArr = this.f51164b;
        if (jArr != null && jArr.length > 0) {
            int i10 = 0;
            while (true) {
                long[] jArr2 = this.f51164b;
                if (i10 >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt64(2, jArr2[i10]);
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public k() {
        a();
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f51163a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f51163a);
        }
        long[] jArr = this.f51164b;
        if (jArr != null && jArr.length > 0) {
            int i10 = 0;
            int iComputeInt64SizeNoTag = 0;
            while (true) {
                long[] jArr2 = this.f51164b;
                if (i10 < jArr2.length) {
                    iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeInt64SizeNoTag(jArr2[i10]);
                    i10++;
                } else {
                    return iComputeSerializedSize + iComputeInt64SizeNoTag + jArr2.length;
                }
            }
        } else {
            return iComputeSerializedSize;
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int length;
        int length2;
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (tag != 16) {
                    if (tag != 18) {
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                            break;
                        }
                    } else {
                        int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position = codedInputByteBufferNano.getPosition();
                        int i10 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt64();
                            i10++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position);
                        long[] jArr = this.f51164b;
                        if (jArr == null) {
                            length = 0;
                        } else {
                            length = jArr.length;
                        }
                        int i11 = i10 + length;
                        long[] jArr2 = new long[i11];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i11) {
                            jArr2[length] = codedInputByteBufferNano.readInt64();
                            length++;
                        }
                        this.f51164b = jArr2;
                        codedInputByteBufferNano.popLimit(iPushLimit);
                    }
                } else {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                    long[] jArr3 = this.f51164b;
                    if (jArr3 == null) {
                        length2 = 0;
                    } else {
                        length2 = jArr3.length;
                    }
                    int i12 = repeatedFieldArrayLength + length2;
                    long[] jArr4 = new long[i12];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i12 - 1) {
                        jArr4[length2] = codedInputByteBufferNano.readInt64();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    jArr4[length2] = codedInputByteBufferNano.readInt64();
                    this.f51164b = jArr4;
                }
            } else {
                this.f51163a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }
}
