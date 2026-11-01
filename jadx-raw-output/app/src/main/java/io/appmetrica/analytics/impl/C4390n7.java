package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4390n7 extends MessageNano {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile C4390n7[] f57314s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f57316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f57317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f57318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4415o7 f57319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f57320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f57321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f57322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f57323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f57324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f57325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f57326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f57327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f57328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f57329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f57330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f57331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f57332r;

    public static C4390n7[] b() {
        if (f57314s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57314s == null) {
                    f57314s = new C4390n7[0];
                }
            }
        }
        return f57314s;
    }

    public final C4390n7 a() {
        this.f57315a = -1;
        this.f57316b = "";
        this.f57317c = "";
        this.f57318d = -1L;
        this.f57319e = null;
        this.f57320f = "";
        this.f57321g = "";
        this.f57322h = -1L;
        this.f57323i = -1;
        this.f57324j = -1;
        this.f57325k = "";
        this.f57326l = -1;
        this.f57327m = "";
        this.f57328n = -1;
        this.f57329o = -1;
        this.f57330p = -1;
        this.f57331q = -1;
        this.f57332r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f57315a;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!this.f57316b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f57316b);
        }
        if (!this.f57317c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f57317c);
        }
        long j10 = this.f57318d;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j10);
        }
        C4415o7 c4415o7 = this.f57319e;
        if (c4415o7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c4415o7);
        }
        if (!this.f57320f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f57320f);
        }
        if (!this.f57321g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f57321g);
        }
        long j11 = this.f57322h;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j11);
        }
        int i11 = this.f57323i;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f57324j;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        if (!this.f57325k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f57325k);
        }
        int i13 = this.f57326l;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i13);
        }
        if (!this.f57327m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f57327m);
        }
        int i14 = this.f57328n;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i14);
        }
        int i15 = this.f57329o;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i15);
        }
        int i16 = this.f57330p;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i16);
        }
        int i17 = this.f57331q;
        if (i17 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i17);
        }
        if (!Arrays.equals(this.f57332r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f57332r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4390n7() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f57315a;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (!this.f57316b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f57316b);
        }
        if (!this.f57317c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f57317c);
        }
        long j10 = this.f57318d;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j10);
        }
        C4415o7 c4415o7 = this.f57319e;
        if (c4415o7 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4415o7);
        }
        if (!this.f57320f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f57320f);
        }
        if (!this.f57321g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f57321g);
        }
        long j11 = this.f57322h;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j11);
        }
        int i11 = this.f57323i;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f57324j;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        if (!this.f57325k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f57325k);
        }
        int i13 = this.f57326l;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i13);
        }
        if (!this.f57327m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f57327m);
        }
        int i14 = this.f57328n;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i14);
        }
        int i15 = this.f57329o;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i15);
        }
        int i16 = this.f57330p;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i16);
        }
        int i17 = this.f57331q;
        if (i17 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i17);
        }
        if (!Arrays.equals(this.f57332r, WireFormatNano.EMPTY_BYTES)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f57332r);
        }
        return iComputeSerializedSize;
    }

    public static C4390n7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4390n7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4390n7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f57315a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f57316b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f57317c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f57318d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f57319e == null) {
                        this.f57319e = new C4415o7();
                    }
                    codedInputByteBufferNano.readMessage(this.f57319e);
                    break;
                case 50:
                    this.f57320f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f57321g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f57322h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f57323i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f57324j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f57325k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f57326l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f57327m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f57328n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f57329o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f57330p = int32;
                    }
                    break;
                case 136:
                    this.f57331q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f57332r = codedInputByteBufferNano.readBytes();
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

    public static C4390n7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4390n7) MessageNano.mergeFrom(new C4390n7(), bArr);
    }
}
