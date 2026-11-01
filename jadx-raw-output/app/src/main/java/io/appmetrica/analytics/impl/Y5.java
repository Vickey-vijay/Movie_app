package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class Y5 extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f56221l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f56222m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile Y5[] f56223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static byte[] f56224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile boolean f56225p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4107c6 f56226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S5 f56227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f56228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4055a6[] f56230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f56231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X5 f56233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f56234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f56235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public U5[] f56236k;

    public static Y5[] b() {
        if (f56223n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56223n == null) {
                    f56223n = new Y5[0];
                }
            }
        }
        return f56223n;
    }

    public final Y5 a() {
        this.f56226a = null;
        this.f56227b = null;
        this.f56228c = "";
        this.f56229d = -1;
        this.f56230e = C4055a6.b();
        this.f56231f = "";
        this.f56232g = 0;
        this.f56233h = null;
        this.f56234i = (byte[]) f56224o.clone();
        this.f56235j = WireFormatNano.EMPTY_BYTES;
        this.f56236k = U5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4107c6 c4107c6 = this.f56226a;
        if (c4107c6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4107c6);
        }
        S5 s10 = this.f56227b;
        if (s10 != null) {
            codedOutputByteBufferNano.writeMessage(2, s10);
        }
        if (!this.f56228c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f56228c);
        }
        int i10 = this.f56229d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        C4055a6[] c4055a6Arr = this.f56230e;
        int i11 = 0;
        if (c4055a6Arr != null && c4055a6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4055a6[] c4055a6Arr2 = this.f56230e;
                if (i12 >= c4055a6Arr2.length) {
                    break;
                }
                C4055a6 c4055a6 = c4055a6Arr2[i12];
                if (c4055a6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4055a6);
                }
                i12++;
            }
        }
        if (!this.f56231f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f56231f);
        }
        int i13 = this.f56232g;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        X5 x10 = this.f56233h;
        if (x10 != null) {
            codedOutputByteBufferNano.writeMessage(8, x10);
        }
        if (!Arrays.equals(this.f56234i, f56224o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f56234i);
        }
        if (!Arrays.equals(this.f56235j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f56235j);
        }
        U5[] u5Arr = this.f56236k;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f56236k;
                if (i11 >= u5Arr2.length) {
                    break;
                }
                U5 u10 = u5Arr2[i11];
                if (u10 != null) {
                    codedOutputByteBufferNano.writeMessage(11, u10);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Y5() {
        if (!f56225p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f56225p) {
                    f56224o = InternalNano.bytesDefaultValue("JVM");
                    f56225p = true;
                }
            }
        }
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4107c6 c4107c6 = this.f56226a;
        if (c4107c6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4107c6);
        }
        S5 s10 = this.f56227b;
        if (s10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, s10);
        }
        if (!this.f56228c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f56228c);
        }
        int i10 = this.f56229d;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        C4055a6[] c4055a6Arr = this.f56230e;
        int i11 = 0;
        if (c4055a6Arr != null && c4055a6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4055a6[] c4055a6Arr2 = this.f56230e;
                if (i12 >= c4055a6Arr2.length) {
                    break;
                }
                C4055a6 c4055a6 = c4055a6Arr2[i12];
                if (c4055a6 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4055a6);
                }
                i12++;
            }
        }
        if (!this.f56231f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f56231f);
        }
        int i13 = this.f56232g;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        X5 x10 = this.f56233h;
        if (x10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, x10);
        }
        if (!Arrays.equals(this.f56234i, f56224o)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f56234i);
        }
        if (!Arrays.equals(this.f56235j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f56235j);
        }
        U5[] u5Arr = this.f56236k;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f56236k;
                if (i11 >= u5Arr2.length) {
                    break;
                }
                U5 u10 = u5Arr2[i11];
                if (u10 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, u10);
                }
                i11++;
            }
        }
        return iComputeSerializedSize;
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f56226a == null) {
                        this.f56226a = new C4107c6();
                    }
                    codedInputByteBufferNano.readMessage(this.f56226a);
                    break;
                case 18:
                    if (this.f56227b == null) {
                        this.f56227b = new S5();
                    }
                    codedInputByteBufferNano.readMessage(this.f56227b);
                    break;
                case 26:
                    this.f56228c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f56229d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C4055a6[] c4055a6Arr = this.f56230e;
                    int length = c4055a6Arr == null ? 0 : c4055a6Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C4055a6[] c4055a6Arr2 = new C4055a6[i10];
                    if (length != 0) {
                        System.arraycopy(c4055a6Arr, 0, c4055a6Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C4055a6 c4055a6 = new C4055a6();
                        c4055a6Arr2[length] = c4055a6;
                        codedInputByteBufferNano.readMessage(c4055a6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4055a6 c4055a7 = new C4055a6();
                    c4055a6Arr2[length] = c4055a7;
                    codedInputByteBufferNano.readMessage(c4055a7);
                    this.f56230e = c4055a6Arr2;
                    break;
                case 50:
                    this.f56231f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == 0 || int33 == 1) {
                        this.f56232g = int33;
                    }
                    break;
                case 66:
                    if (this.f56233h == null) {
                        this.f56233h = new X5();
                    }
                    codedInputByteBufferNano.readMessage(this.f56233h);
                    break;
                case 74:
                    this.f56234i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f56235j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    U5[] u5Arr = this.f56236k;
                    int length2 = u5Arr == null ? 0 : u5Arr.length;
                    int i11 = repeatedFieldArrayLength2 + length2;
                    U5[] u5Arr2 = new U5[i11];
                    if (length2 != 0) {
                        System.arraycopy(u5Arr, 0, u5Arr2, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        U5 u10 = new U5();
                        u5Arr2[length2] = u10;
                        codedInputByteBufferNano.readMessage(u10);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    U5 u11 = new U5();
                    u5Arr2[length2] = u11;
                    codedInputByteBufferNano.readMessage(u11);
                    this.f56236k = u5Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    public static Y5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }
}
