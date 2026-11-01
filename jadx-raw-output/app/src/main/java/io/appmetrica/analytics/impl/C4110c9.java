package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4110c9 extends MessageNano {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile C4110c9[] f56469n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f56472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f56474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f56475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f56478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f56479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C4084b9[] f56481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f56482m;

    public static C4110c9[] b() {
        if (f56469n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56469n == null) {
                    f56469n = new C4110c9[0];
                }
            }
        }
        return f56469n;
    }

    public final C4110c9 a() {
        this.f56470a = "";
        this.f56471b = "";
        this.f56472c = "";
        this.f56473d = 0;
        this.f56474e = "";
        this.f56475f = "";
        this.f56476g = false;
        this.f56477h = 0;
        this.f56478i = "";
        this.f56479j = "";
        this.f56480k = 0;
        this.f56481l = C4084b9.b();
        this.f56482m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f56470a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f56470a);
        }
        if (!this.f56471b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f56471b);
        }
        if (!this.f56472c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f56472c);
        }
        int i10 = this.f56473d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        if (!this.f56474e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f56474e);
        }
        if (!this.f56475f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f56475f);
        }
        boolean z10 = this.f56476g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        int i11 = this.f56477h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i11);
        }
        if (!this.f56478i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f56478i);
        }
        if (!this.f56479j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f56479j);
        }
        int i12 = this.f56480k;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i12);
        }
        C4084b9[] c4084b9Arr = this.f56481l;
        if (c4084b9Arr != null && c4084b9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4084b9[] c4084b9Arr2 = this.f56481l;
                if (i13 >= c4084b9Arr2.length) {
                    break;
                }
                C4084b9 c4084b9 = c4084b9Arr2[i13];
                if (c4084b9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c4084b9);
                }
                i13++;
            }
        }
        if (!this.f56482m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f56482m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4110c9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f56470a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f56470a);
        }
        if (!this.f56471b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f56471b);
        }
        if (!this.f56472c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f56472c);
        }
        int i10 = this.f56473d;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        if (!this.f56474e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f56474e);
        }
        if (!this.f56475f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f56475f);
        }
        boolean z10 = this.f56476g;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        int i11 = this.f56477h;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i11);
        }
        if (!this.f56478i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f56478i);
        }
        if (!this.f56479j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f56479j);
        }
        int i12 = this.f56480k;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i12);
        }
        C4084b9[] c4084b9Arr = this.f56481l;
        if (c4084b9Arr != null && c4084b9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4084b9[] c4084b9Arr2 = this.f56481l;
                if (i13 >= c4084b9Arr2.length) {
                    break;
                }
                C4084b9 c4084b9 = c4084b9Arr2[i13];
                if (c4084b9 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(23, c4084b9);
                }
                i13++;
            }
        }
        if (!this.f56482m.equals("")) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f56482m);
        }
        return iComputeSerializedSize;
    }

    public static C4110c9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4110c9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4110c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f56470a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f56471b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f56472c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f56473d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f56474e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f56475f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f56476g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f56477h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f56478i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f56479j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f56480k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C4084b9[] c4084b9Arr = this.f56481l;
                    int length = c4084b9Arr == null ? 0 : c4084b9Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C4084b9[] c4084b9Arr2 = new C4084b9[i10];
                    if (length != 0) {
                        System.arraycopy(c4084b9Arr, 0, c4084b9Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C4084b9 c4084b9 = new C4084b9();
                        c4084b9Arr2[length] = c4084b9;
                        codedInputByteBufferNano.readMessage(c4084b9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4084b9 c4084b10 = new C4084b9();
                    c4084b9Arr2[length] = c4084b10;
                    codedInputByteBufferNano.readMessage(c4084b10);
                    this.f56481l = c4084b9Arr2;
                    break;
                case 194:
                    this.f56482m = codedInputByteBufferNano.readString();
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

    public static C4110c9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4110c9) MessageNano.mergeFrom(new C4110c9(), bArr);
    }
}
