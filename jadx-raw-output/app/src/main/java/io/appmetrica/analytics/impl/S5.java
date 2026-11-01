package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class S5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile S5[] f55850d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4081b6 f55851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4081b6[] f55852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f55853c;

    public static S5[] b() {
        if (f55850d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55850d == null) {
                    f55850d = new S5[0];
                }
            }
        }
        return f55850d;
    }

    public final S5 a() {
        this.f55851a = null;
        this.f55852b = C4081b6.b();
        this.f55853c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4081b6 c4081b6 = this.f55851a;
        if (c4081b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4081b6);
        }
        C4081b6[] c4081b6Arr = this.f55852b;
        if (c4081b6Arr != null && c4081b6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4081b6[] c4081b6Arr2 = this.f55852b;
                if (i10 >= c4081b6Arr2.length) {
                    break;
                }
                C4081b6 c4081b7 = c4081b6Arr2[i10];
                if (c4081b7 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4081b7);
                }
                i10++;
            }
        }
        if (!this.f55853c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f55853c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public S5() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4081b6 c4081b6 = this.f55851a;
        if (c4081b6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4081b6);
        }
        C4081b6[] c4081b6Arr = this.f55852b;
        if (c4081b6Arr != null && c4081b6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4081b6[] c4081b6Arr2 = this.f55852b;
                if (i10 >= c4081b6Arr2.length) {
                    break;
                }
                C4081b6 c4081b7 = c4081b6Arr2[i10];
                if (c4081b7 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4081b7);
                }
                i10++;
            }
        }
        if (!this.f55853c.equals("")) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f55853c);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f55851a == null) {
                    this.f55851a = new C4081b6();
                }
                codedInputByteBufferNano.readMessage(this.f55851a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4081b6[] c4081b6Arr = this.f55852b;
                int length = c4081b6Arr == null ? 0 : c4081b6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4081b6[] c4081b6Arr2 = new C4081b6[i10];
                if (length != 0) {
                    System.arraycopy(c4081b6Arr, 0, c4081b6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4081b6 c4081b6 = new C4081b6();
                    c4081b6Arr2[length] = c4081b6;
                    codedInputByteBufferNano.readMessage(c4081b6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4081b6 c4081b7 = new C4081b6();
                c4081b6Arr2[length] = c4081b7;
                codedInputByteBufferNano.readMessage(c4081b7);
                this.f55852b = c4081b6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f55853c = codedInputByteBufferNano.readString();
            }
        }
    }

    public static S5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S5().mergeFrom(codedInputByteBufferNano);
    }

    public static S5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S5) MessageNano.mergeFrom(new S5(), bArr);
    }
}
