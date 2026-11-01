package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4316k9 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f57084g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f57085h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f57086i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile C4316k9[] f57087j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4239h9[] f57088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4110c9 f57089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z8[] f57090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4265i9[] f57091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f57092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[][] f57093f;

    public static C4316k9[] b() {
        if (f57087j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57087j == null) {
                    f57087j = new C4316k9[0];
                }
            }
        }
        return f57087j;
    }

    public final C4316k9 a() {
        this.f57088a = C4239h9.b();
        this.f57089b = null;
        this.f57090c = Z8.b();
        this.f57091d = C4265i9.b();
        this.f57092e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f57093f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4239h9[] c4239h9Arr = this.f57088a;
        int i10 = 0;
        if (c4239h9Arr != null && c4239h9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4239h9[] c4239h9Arr2 = this.f57088a;
                if (i11 >= c4239h9Arr2.length) {
                    break;
                }
                C4239h9 c4239h9 = c4239h9Arr2[i11];
                if (c4239h9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4239h9);
                }
                i11++;
            }
        }
        C4110c9 c4110c9 = this.f57089b;
        if (c4110c9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4110c9);
        }
        Z8[] z8Arr = this.f57090c;
        if (z8Arr != null && z8Arr.length > 0) {
            int i12 = 0;
            while (true) {
                Z8[] z8Arr2 = this.f57090c;
                if (i12 >= z8Arr2.length) {
                    break;
                }
                Z8 z10 = z8Arr2[i12];
                if (z10 != null) {
                    codedOutputByteBufferNano.writeMessage(7, z10);
                }
                i12++;
            }
        }
        C4265i9[] c4265i9Arr = this.f57091d;
        if (c4265i9Arr != null && c4265i9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4265i9[] c4265i9Arr2 = this.f57091d;
                if (i13 >= c4265i9Arr2.length) {
                    break;
                }
                C4265i9 c4265i9 = c4265i9Arr2[i13];
                if (c4265i9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c4265i9);
                }
                i13++;
            }
        }
        String[] strArr = this.f57092e;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr2 = this.f57092e;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i14++;
            }
        }
        byte[][] bArr = this.f57093f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f57093f;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4316k9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4239h9[] c4239h9Arr = this.f57088a;
        int i10 = 0;
        if (c4239h9Arr != null && c4239h9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4239h9[] c4239h9Arr2 = this.f57088a;
                if (i11 >= c4239h9Arr2.length) {
                    break;
                }
                C4239h9 c4239h9 = c4239h9Arr2[i11];
                if (c4239h9 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4239h9);
                }
                i11++;
            }
        }
        C4110c9 c4110c9 = this.f57089b;
        if (c4110c9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4110c9);
        }
        Z8[] z8Arr = this.f57090c;
        if (z8Arr != null && z8Arr.length > 0) {
            int i12 = 0;
            while (true) {
                Z8[] z8Arr2 = this.f57090c;
                if (i12 >= z8Arr2.length) {
                    break;
                }
                Z8 z10 = z8Arr2[i12];
                if (z10 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, z10) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        C4265i9[] c4265i9Arr = this.f57091d;
        if (c4265i9Arr != null && c4265i9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4265i9[] c4265i9Arr2 = this.f57091d;
                if (i13 >= c4265i9Arr2.length) {
                    break;
                }
                C4265i9 c4265i9 = c4265i9Arr2[i13];
                if (c4265i9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c4265i9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        String[] strArr = this.f57092e;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            int iComputeStringSizeNoTag = 0;
            int i15 = 0;
            while (true) {
                String[] strArr2 = this.f57092e;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    i15++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i14++;
            }
            iComputeSerializedSize = iComputeSerializedSize + iComputeStringSizeNoTag + i15;
        }
        byte[][] bArr = this.f57093f;
        if (bArr != null && bArr.length > 0) {
            int iComputeBytesSizeNoTag = 0;
            int i16 = 0;
            while (true) {
                byte[][] bArr2 = this.f57093f;
                if (i10 < bArr2.length) {
                    byte[] bArr3 = bArr2[i10];
                    if (bArr3 != null) {
                        i16++;
                        iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
                    }
                    i10++;
                } else {
                    return iComputeSerializedSize + iComputeBytesSizeNoTag + i16;
                }
            }
        } else {
            return iComputeSerializedSize;
        }
    }

    public static C4316k9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4316k9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4316k9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4239h9[] c4239h9Arr = this.f57088a;
                int length = c4239h9Arr == null ? 0 : c4239h9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4239h9[] c4239h9Arr2 = new C4239h9[i10];
                if (length != 0) {
                    System.arraycopy(c4239h9Arr, 0, c4239h9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4239h9 c4239h9 = new C4239h9();
                    c4239h9Arr2[length] = c4239h9;
                    codedInputByteBufferNano.readMessage(c4239h9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4239h9 c4239h10 = new C4239h9();
                c4239h9Arr2[length] = c4239h10;
                codedInputByteBufferNano.readMessage(c4239h10);
                this.f57088a = c4239h9Arr2;
            } else if (tag == 34) {
                if (this.f57089b == null) {
                    this.f57089b = new C4110c9();
                }
                codedInputByteBufferNano.readMessage(this.f57089b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                Z8[] z8Arr = this.f57090c;
                int length2 = z8Arr == null ? 0 : z8Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                Z8[] z8Arr2 = new Z8[i11];
                if (length2 != 0) {
                    System.arraycopy(z8Arr, 0, z8Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    Z8 z10 = new Z8();
                    z8Arr2[length2] = z10;
                    codedInputByteBufferNano.readMessage(z10);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                Z8 z11 = new Z8();
                z8Arr2[length2] = z11;
                codedInputByteBufferNano.readMessage(z11);
                this.f57090c = z8Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C4265i9[] c4265i9Arr = this.f57091d;
                int length3 = c4265i9Arr == null ? 0 : c4265i9Arr.length;
                int i12 = repeatedFieldArrayLength3 + length3;
                C4265i9[] c4265i9Arr2 = new C4265i9[i12];
                if (length3 != 0) {
                    System.arraycopy(c4265i9Arr, 0, c4265i9Arr2, 0, length3);
                }
                while (length3 < i12 - 1) {
                    C4265i9 c4265i9 = new C4265i9();
                    c4265i9Arr2[length3] = c4265i9;
                    codedInputByteBufferNano.readMessage(c4265i9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C4265i9 c4265i10 = new C4265i9();
                c4265i9Arr2[length3] = c4265i10;
                codedInputByteBufferNano.readMessage(c4265i10);
                this.f57091d = c4265i9Arr2;
            } else if (tag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f57092e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i13 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i13];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i13 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f57092e = strArr2;
            } else if (tag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f57093f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i14 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i14][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i14 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f57093f = bArr2;
            }
        }
    }

    public static C4316k9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4316k9) MessageNano.mergeFrom(new C4316k9(), bArr);
    }
}
