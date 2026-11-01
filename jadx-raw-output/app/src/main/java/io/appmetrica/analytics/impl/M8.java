package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class M8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile M8[] f55565b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L8[] f55566a;

    public static M8[] b() {
        if (f55565b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55565b == null) {
                    f55565b = new M8[0];
                }
            }
        }
        return f55565b;
    }

    public final M8 a() {
        this.f55566a = L8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        L8[] l8Arr = this.f55566a;
        if (l8Arr != null && l8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                L8[] l8Arr2 = this.f55566a;
                if (i10 >= l8Arr2.length) {
                    break;
                }
                L8 l10 = l8Arr2[i10];
                if (l10 != null) {
                    codedOutputByteBufferNano.writeMessage(1, l10);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public M8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                L8[] l8Arr = this.f55566a;
                int length = l8Arr == null ? 0 : l8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                L8[] l8Arr2 = new L8[i10];
                if (length != 0) {
                    System.arraycopy(l8Arr, 0, l8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    L8 l10 = new L8();
                    l8Arr2[length] = l10;
                    codedInputByteBufferNano.readMessage(l10);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                L8 l11 = new L8();
                l8Arr2[length] = l11;
                codedInputByteBufferNano.readMessage(l11);
                this.f55566a = l8Arr2;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        L8[] l8Arr = this.f55566a;
        if (l8Arr != null && l8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                L8[] l8Arr2 = this.f55566a;
                if (i10 >= l8Arr2.length) {
                    break;
                }
                L8 l10 = l8Arr2[i10];
                if (l10 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, l10);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    public static M8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M8().mergeFrom(codedInputByteBufferNano);
    }

    public static M8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (M8) MessageNano.mergeFrom(new M8(), bArr);
    }
}
