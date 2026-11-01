package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class W5 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f56064k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f56065l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile W5[] f56066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static byte[] f56067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile boolean f56068o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4107c6 f56069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S5 f56070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f56071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4055a6[] f56073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V5 f56075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f56076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f56077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public U5[] f56078j;

    public static W5[] b() {
        if (f56066m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56066m == null) {
                    f56066m = new W5[0];
                }
            }
        }
        return f56066m;
    }

    public final W5 a() {
        this.f56069a = null;
        this.f56070b = null;
        this.f56071c = "";
        this.f56072d = -1;
        this.f56073e = C4055a6.b();
        this.f56074f = 0;
        this.f56075g = null;
        this.f56076h = (byte[]) f56067n.clone();
        this.f56077i = WireFormatNano.EMPTY_BYTES;
        this.f56078j = U5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4107c6 c4107c6 = this.f56069a;
        if (c4107c6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4107c6);
        }
        S5 s10 = this.f56070b;
        if (s10 != null) {
            codedOutputByteBufferNano.writeMessage(2, s10);
        }
        if (!this.f56071c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f56071c);
        }
        int i10 = this.f56072d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        C4055a6[] c4055a6Arr = this.f56073e;
        int i11 = 0;
        if (c4055a6Arr != null && c4055a6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4055a6[] c4055a6Arr2 = this.f56073e;
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
        int i13 = this.f56074f;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i13);
        }
        V5 v10 = this.f56075g;
        if (v10 != null) {
            codedOutputByteBufferNano.writeMessage(7, v10);
        }
        if (!Arrays.equals(this.f56076h, f56067n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f56076h);
        }
        if (!Arrays.equals(this.f56077i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f56077i);
        }
        U5[] u5Arr = this.f56078j;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f56078j;
                if (i11 >= u5Arr2.length) {
                    break;
                }
                U5 u10 = u5Arr2[i11];
                if (u10 != null) {
                    codedOutputByteBufferNano.writeMessage(10, u10);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public W5() {
        if (!f56068o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f56068o) {
                    f56067n = InternalNano.bytesDefaultValue("JVM");
                    f56068o = true;
                }
            }
        }
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4107c6 c4107c6 = this.f56069a;
        if (c4107c6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4107c6);
        }
        S5 s10 = this.f56070b;
        if (s10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, s10);
        }
        if (!this.f56071c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f56071c);
        }
        int i10 = this.f56072d;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        C4055a6[] c4055a6Arr = this.f56073e;
        int i11 = 0;
        if (c4055a6Arr != null && c4055a6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4055a6[] c4055a6Arr2 = this.f56073e;
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
        int i13 = this.f56074f;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i13);
        }
        V5 v10 = this.f56075g;
        if (v10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, v10);
        }
        if (!Arrays.equals(this.f56076h, f56067n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f56076h);
        }
        if (!Arrays.equals(this.f56077i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f56077i);
        }
        U5[] u5Arr = this.f56078j;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f56078j;
                if (i11 >= u5Arr2.length) {
                    break;
                }
                U5 u10 = u5Arr2[i11];
                if (u10 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, u10);
                }
                i11++;
            }
        }
        return iComputeSerializedSize;
    }

    public static W5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f56069a == null) {
                        this.f56069a = new C4107c6();
                    }
                    codedInputByteBufferNano.readMessage(this.f56069a);
                    break;
                case 18:
                    if (this.f56070b == null) {
                        this.f56070b = new S5();
                    }
                    codedInputByteBufferNano.readMessage(this.f56070b);
                    break;
                case 26:
                    this.f56071c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f56072d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C4055a6[] c4055a6Arr = this.f56073e;
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
                    this.f56073e = c4055a6Arr2;
                    break;
                case 48:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == 0 || int33 == 1) {
                        this.f56074f = int33;
                    }
                    break;
                case 58:
                    if (this.f56075g == null) {
                        this.f56075g = new V5();
                    }
                    codedInputByteBufferNano.readMessage(this.f56075g);
                    break;
                case 66:
                    this.f56076h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f56077i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    U5[] u5Arr = this.f56078j;
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
                    this.f56078j = u5Arr2;
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

    public static W5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W5) MessageNano.mergeFrom(new W5(), bArr);
    }
}
