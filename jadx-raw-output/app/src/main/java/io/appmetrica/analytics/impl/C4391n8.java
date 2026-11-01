package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4391n8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4391n8[] f57333c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4135d8 f57334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4135d8[] f57335b;

    public static C4391n8[] b() {
        if (f57333c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57333c == null) {
                    f57333c = new C4391n8[0];
                }
            }
        }
        return f57333c;
    }

    public final C4391n8 a() {
        this.f57334a = null;
        this.f57335b = C4135d8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4135d8 c4135d8 = this.f57334a;
        if (c4135d8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4135d8);
        }
        C4135d8[] c4135d8Arr = this.f57335b;
        if (c4135d8Arr != null && c4135d8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4135d8[] c4135d8Arr2 = this.f57335b;
                if (i10 >= c4135d8Arr2.length) {
                    break;
                }
                C4135d8 c4135d9 = c4135d8Arr2[i10];
                if (c4135d9 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4135d9);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4391n8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4135d8 c4135d8 = this.f57334a;
        if (c4135d8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4135d8);
        }
        C4135d8[] c4135d8Arr = this.f57335b;
        if (c4135d8Arr != null && c4135d8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4135d8[] c4135d8Arr2 = this.f57335b;
                if (i10 >= c4135d8Arr2.length) {
                    break;
                }
                C4135d8 c4135d9 = c4135d8Arr2[i10];
                if (c4135d9 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4135d9);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4391n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f57334a == null) {
                    this.f57334a = new C4135d8();
                }
                codedInputByteBufferNano.readMessage(this.f57334a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4135d8[] c4135d8Arr = this.f57335b;
                int length = c4135d8Arr == null ? 0 : c4135d8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4135d8[] c4135d8Arr2 = new C4135d8[i10];
                if (length != 0) {
                    System.arraycopy(c4135d8Arr, 0, c4135d8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4135d8 c4135d8 = new C4135d8();
                    c4135d8Arr2[length] = c4135d8;
                    codedInputByteBufferNano.readMessage(c4135d8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4135d8 c4135d9 = new C4135d8();
                c4135d8Arr2[length] = c4135d9;
                codedInputByteBufferNano.readMessage(c4135d9);
                this.f57335b = c4135d8Arr2;
            }
        }
    }

    public static C4391n8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4391n8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4391n8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4391n8) MessageNano.mergeFrom(new C4391n8(), bArr);
    }
}
