package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class Y1 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Y1[] f56195d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X1[] f56196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W1 f56197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f56198c;

    public static Y1[] b() {
        if (f56195d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56195d == null) {
                    f56195d = new Y1[0];
                }
            }
        }
        return f56195d;
    }

    public final Y1 a() {
        this.f56196a = X1.b();
        this.f56197b = null;
        this.f56198c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        X1[] x1Arr = this.f56196a;
        int i10 = 0;
        if (x1Arr != null && x1Arr.length > 0) {
            int i11 = 0;
            while (true) {
                X1[] x1Arr2 = this.f56196a;
                if (i11 >= x1Arr2.length) {
                    break;
                }
                X1 x10 = x1Arr2[i11];
                if (x10 != null) {
                    codedOutputByteBufferNano.writeMessage(1, x10);
                }
                i11++;
            }
        }
        W1 w10 = this.f56197b;
        if (w10 != null) {
            codedOutputByteBufferNano.writeMessage(2, w10);
        }
        String[] strArr = this.f56198c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f56198c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Y1() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        X1[] x1Arr = this.f56196a;
        int i10 = 0;
        if (x1Arr != null && x1Arr.length > 0) {
            int i11 = 0;
            while (true) {
                X1[] x1Arr2 = this.f56196a;
                if (i11 >= x1Arr2.length) {
                    break;
                }
                X1 x10 = x1Arr2[i11];
                if (x10 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, x10);
                }
                i11++;
            }
        }
        W1 w10 = this.f56197b;
        if (w10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, w10);
        }
        String[] strArr = this.f56198c;
        if (strArr != null && strArr.length > 0) {
            int iComputeStringSizeNoTag = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f56198c;
                if (i10 < strArr2.length) {
                    String str = strArr2[i10];
                    if (str != null) {
                        i12++;
                        iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
                    }
                    i10++;
                } else {
                    return iComputeSerializedSize + iComputeStringSizeNoTag + i12;
                }
            }
        } else {
            return iComputeSerializedSize;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                X1[] x1Arr = this.f56196a;
                int length = x1Arr == null ? 0 : x1Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                X1[] x1Arr2 = new X1[i10];
                if (length != 0) {
                    System.arraycopy(x1Arr, 0, x1Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    X1 x10 = new X1();
                    x1Arr2[length] = x10;
                    codedInputByteBufferNano.readMessage(x10);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                X1 x11 = new X1();
                x1Arr2[length] = x11;
                codedInputByteBufferNano.readMessage(x11);
                this.f56196a = x1Arr2;
            } else if (tag == 18) {
                if (this.f56197b == null) {
                    this.f56197b = new W1();
                }
                codedInputByteBufferNano.readMessage(this.f56197b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f56198c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i11];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f56198c = strArr2;
            }
        }
    }

    public static Y1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y1().mergeFrom(codedInputByteBufferNano);
    }

    public static Y1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y1) MessageNano.mergeFrom(new Y1(), bArr);
    }
}
