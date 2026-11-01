package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4416o8 extends MessageNano {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C4416o8[] f57393h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f57395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4212g8 f57396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4366m8 f57397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4391n8 f57398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4391n8 f57399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C4441p8[] f57400g;

    public static C4416o8[] b() {
        if (f57393h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57393h == null) {
                    f57393h = new C4416o8[0];
                }
            }
        }
        return f57393h;
    }

    public final C4416o8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f57394a = bArr;
        this.f57395b = bArr;
        this.f57396c = null;
        this.f57397d = null;
        this.f57398e = null;
        this.f57399f = null;
        this.f57400g = C4441p8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f57394a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f57394a);
        }
        if (!Arrays.equals(this.f57395b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f57395b);
        }
        C4212g8 c4212g8 = this.f57396c;
        if (c4212g8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4212g8);
        }
        C4366m8 c4366m8 = this.f57397d;
        if (c4366m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4366m8);
        }
        C4391n8 c4391n8 = this.f57398e;
        if (c4391n8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c4391n8);
        }
        C4391n8 c4391n9 = this.f57399f;
        if (c4391n9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4391n9);
        }
        C4441p8[] c4441p8Arr = this.f57400g;
        if (c4441p8Arr != null && c4441p8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4441p8[] c4441p8Arr2 = this.f57400g;
                if (i10 >= c4441p8Arr2.length) {
                    break;
                }
                C4441p8 c4441p8 = c4441p8Arr2[i10];
                if (c4441p8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c4441p8);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4416o8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f57394a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f57394a);
        }
        if (!Arrays.equals(this.f57395b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f57395b);
        }
        C4212g8 c4212g8 = this.f57396c;
        if (c4212g8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4212g8);
        }
        C4366m8 c4366m8 = this.f57397d;
        if (c4366m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4366m8);
        }
        C4391n8 c4391n8 = this.f57398e;
        if (c4391n8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4391n8);
        }
        C4391n8 c4391n9 = this.f57399f;
        if (c4391n9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c4391n9);
        }
        C4441p8[] c4441p8Arr = this.f57400g;
        if (c4441p8Arr != null && c4441p8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4441p8[] c4441p8Arr2 = this.f57400g;
                if (i10 >= c4441p8Arr2.length) {
                    break;
                }
                C4441p8 c4441p8 = c4441p8Arr2[i10];
                if (c4441p8 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c4441p8);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    public static C4416o8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4416o8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4416o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57394a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f57395b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f57396c == null) {
                    this.f57396c = new C4212g8();
                }
                codedInputByteBufferNano.readMessage(this.f57396c);
            } else if (tag == 34) {
                if (this.f57397d == null) {
                    this.f57397d = new C4366m8();
                }
                codedInputByteBufferNano.readMessage(this.f57397d);
            } else if (tag == 42) {
                if (this.f57398e == null) {
                    this.f57398e = new C4391n8();
                }
                codedInputByteBufferNano.readMessage(this.f57398e);
            } else if (tag == 50) {
                if (this.f57399f == null) {
                    this.f57399f = new C4391n8();
                }
                codedInputByteBufferNano.readMessage(this.f57399f);
            } else if (tag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C4441p8[] c4441p8Arr = this.f57400g;
                int length = c4441p8Arr == null ? 0 : c4441p8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4441p8[] c4441p8Arr2 = new C4441p8[i10];
                if (length != 0) {
                    System.arraycopy(c4441p8Arr, 0, c4441p8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4441p8 c4441p8 = new C4441p8();
                    c4441p8Arr2[length] = c4441p8;
                    codedInputByteBufferNano.readMessage(c4441p8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4441p8 c4441p9 = new C4441p8();
                c4441p8Arr2[length] = c4441p9;
                codedInputByteBufferNano.readMessage(c4441p9);
                this.f57400g = c4441p8Arr2;
            }
        }
    }

    public static C4416o8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4416o8) MessageNano.mergeFrom(new C4416o8(), bArr);
    }
}
