package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4187f9 extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static volatile C4187f9[] T = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f56727t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f56728u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f56729v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f56730w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f56731x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f56732y = 13;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f56733z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f56734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f56737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f56738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4058a9 f56739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C4161e9 f56740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f56741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f56742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f56743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f56745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f56746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f56747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f56748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f56749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f56750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f56751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C4136d9[] f56752s;

    public static C4187f9[] b() {
        if (T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (T == null) {
                    T = new C4187f9[0];
                }
            }
        }
        return T;
    }

    public final C4187f9 a() {
        this.f56734a = 0L;
        this.f56735b = 0L;
        this.f56736c = 0;
        this.f56737d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f56738e = bArr;
        this.f56739f = null;
        this.f56740g = null;
        this.f56741h = "";
        this.f56742i = 0;
        this.f56743j = 0;
        this.f56744k = -1;
        this.f56745l = bArr;
        this.f56746m = -1;
        this.f56747n = 0L;
        this.f56748o = 0L;
        this.f56749p = 0;
        this.f56750q = false;
        this.f56751r = 1L;
        this.f56752s = C4136d9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f56734a);
        codedOutputByteBufferNano.writeUInt64(2, this.f56735b);
        codedOutputByteBufferNano.writeUInt32(3, this.f56736c);
        if (!this.f56737d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f56737d);
        }
        byte[] bArr = this.f56738e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f56738e);
        }
        C4058a9 c4058a9 = this.f56739f;
        if (c4058a9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4058a9);
        }
        C4161e9 c4161e9 = this.f56740g;
        if (c4161e9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c4161e9);
        }
        if (!this.f56741h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f56741h);
        }
        int i10 = this.f56742i;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i10);
        }
        int i11 = this.f56743j;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i11);
        }
        int i12 = this.f56744k;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i12);
        }
        if (!Arrays.equals(this.f56745l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f56745l);
        }
        int i13 = this.f56746m;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i13);
        }
        long j10 = this.f56747n;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j10);
        }
        long j11 = this.f56748o;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j11);
        }
        int i14 = this.f56749p;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i14);
        }
        boolean z10 = this.f56750q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(23, z10);
        }
        long j12 = this.f56751r;
        if (j12 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j12);
        }
        C4136d9[] c4136d9Arr = this.f56752s;
        if (c4136d9Arr != null && c4136d9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C4136d9[] c4136d9Arr2 = this.f56752s;
                if (i15 >= c4136d9Arr2.length) {
                    break;
                }
                C4136d9 c4136d9 = c4136d9Arr2[i15];
                if (c4136d9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c4136d9);
                }
                i15++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4187f9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f56736c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f56735b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f56734a) + super.computeSerializedSize();
        if (!this.f56737d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f56737d);
        }
        byte[] bArr = this.f56738e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f56738e);
        }
        C4058a9 c4058a9 = this.f56739f;
        if (c4058a9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c4058a9);
        }
        C4161e9 c4161e9 = this.f56740g;
        if (c4161e9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c4161e9);
        }
        if (!this.f56741h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f56741h);
        }
        int i10 = this.f56742i;
        if (i10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i10);
        }
        int i11 = this.f56743j;
        if (i11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i11);
        }
        int i12 = this.f56744k;
        if (i12 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i12);
        }
        if (!Arrays.equals(this.f56745l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f56745l);
        }
        int i13 = this.f56746m;
        if (i13 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i13);
        }
        long j10 = this.f56747n;
        if (j10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j10);
        }
        long j11 = this.f56748o;
        if (j11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j11);
        }
        int i14 = this.f56749p;
        if (i14 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i14);
        }
        boolean z10 = this.f56750q;
        if (z10) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z10);
        }
        long j12 = this.f56751r;
        if (j12 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j12);
        }
        C4136d9[] c4136d9Arr = this.f56752s;
        if (c4136d9Arr != null && c4136d9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C4136d9[] c4136d9Arr2 = this.f56752s;
                if (i15 >= c4136d9Arr2.length) {
                    break;
                }
                C4136d9 c4136d9 = c4136d9Arr2[i15];
                if (c4136d9 != null) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(25, c4136d9);
                }
                i15++;
            }
        }
        return iComputeUInt32Size;
    }

    public static C4187f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4187f9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4187f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f56734a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f56735b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f56736c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f56737d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f56738e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f56739f == null) {
                        this.f56739f = new C4058a9();
                    }
                    codedInputByteBufferNano.readMessage(this.f56739f);
                    break;
                case 58:
                    if (this.f56740g == null) {
                        this.f56740g = new C4161e9();
                    }
                    codedInputByteBufferNano.readMessage(this.f56740g);
                    break;
                case 66:
                    this.f56741h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f56742i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f56743j = int32;
                    }
                    break;
                case 104:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == -1 || int33 == 0 || int33 == 1) {
                        this.f56744k = int33;
                    }
                    break;
                case 114:
                    this.f56745l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int34 = codedInputByteBufferNano.readInt32();
                    if (int34 == -1 || int34 == 0 || int34 == 1) {
                        this.f56746m = int34;
                    }
                    break;
                case 128:
                    this.f56747n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f56748o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int35 = codedInputByteBufferNano.readInt32();
                    if (int35 == 0 || int35 == 1 || int35 == 2) {
                        this.f56749p = int35;
                    }
                    break;
                case 184:
                    this.f56750q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f56751r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C4136d9[] c4136d9Arr = this.f56752s;
                    int length = c4136d9Arr == null ? 0 : c4136d9Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C4136d9[] c4136d9Arr2 = new C4136d9[i10];
                    if (length != 0) {
                        System.arraycopy(c4136d9Arr, 0, c4136d9Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C4136d9 c4136d9 = new C4136d9();
                        c4136d9Arr2[length] = c4136d9;
                        codedInputByteBufferNano.readMessage(c4136d9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4136d9 c4136d10 = new C4136d9();
                    c4136d9Arr2[length] = c4136d10;
                    codedInputByteBufferNano.readMessage(c4136d10);
                    this.f56752s = c4136d9Arr2;
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

    public static C4187f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4187f9) MessageNano.mergeFrom(new C4187f9(), bArr);
    }
}
