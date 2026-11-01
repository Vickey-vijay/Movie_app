package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4635x3 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4635x3[] f57910b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4610w3[] f57911a;

    public static C4635x3[] b() {
        if (f57910b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57910b == null) {
                    f57910b = new C4635x3[0];
                }
            }
        }
        return f57910b;
    }

    public final C4635x3 a() {
        this.f57911a = C4610w3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4610w3[] c4610w3Arr = this.f57911a;
        if (c4610w3Arr != null && c4610w3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4610w3[] c4610w3Arr2 = this.f57911a;
                if (i10 >= c4610w3Arr2.length) {
                    break;
                }
                C4610w3 c4610w3 = c4610w3Arr2[i10];
                if (c4610w3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4610w3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4635x3() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4635x3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C4610w3[] c4610w3Arr = this.f57911a;
                int length = c4610w3Arr == null ? 0 : c4610w3Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4610w3[] c4610w3Arr2 = new C4610w3[i10];
                if (length != 0) {
                    System.arraycopy(c4610w3Arr, 0, c4610w3Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4610w3 c4610w3 = new C4610w3();
                    c4610w3Arr2[length] = c4610w3;
                    codedInputByteBufferNano.readMessage(c4610w3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4610w3 c4610w4 = new C4610w3();
                c4610w3Arr2[length] = c4610w4;
                codedInputByteBufferNano.readMessage(c4610w4);
                this.f57911a = c4610w3Arr2;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4610w3[] c4610w3Arr = this.f57911a;
        if (c4610w3Arr != null && c4610w3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4610w3[] c4610w3Arr2 = this.f57911a;
                if (i10 >= c4610w3Arr2.length) {
                    break;
                }
                C4610w3 c4610w3 = c4610w3Arr2[i10];
                if (c4610w3 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4610w3);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    public static C4635x3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4635x3().mergeFrom(codedInputByteBufferNano);
    }

    public static C4635x3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4635x3) MessageNano.mergeFrom(new C4635x3(), bArr);
    }
}
