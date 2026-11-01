package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f54497l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f54498m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f54499n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f54500o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f54501p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile z[] f54502q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f54504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f54505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f54506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f54507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f54508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f54512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f54513k;

    public static z[] b() {
        if (f54502q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54502q == null) {
                    f54502q = new z[0];
                }
            }
        }
        return f54502q;
    }

    public final z a() {
        this.f54503a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f54504b = bArr;
        this.f54505c = bArr;
        this.f54506d = bArr;
        this.f54507e = null;
        this.f54508f = 0L;
        this.f54509g = false;
        this.f54510h = 0;
        this.f54511i = 1;
        this.f54512j = null;
        this.f54513k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f54503a;
        if (i10 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f54504b);
        byte[] bArr = this.f54505c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f54505c);
        }
        if (!Arrays.equals(this.f54506d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f54506d);
        }
        u uVar = this.f54507e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j10 = this.f54508f;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j10);
        }
        boolean z10 = this.f54509g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(8, z10);
        }
        int i11 = this.f54510h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f54511i;
        if (i12 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        y yVar = this.f54512j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f54513k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public z() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f54503a;
        if (i10 != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f54504b) + iComputeSerializedSize;
        byte[] bArr = this.f54505c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f54505c);
        }
        if (!Arrays.equals(this.f54506d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f54506d);
        }
        u uVar = this.f54507e;
        if (uVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j10 = this.f54508f;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j10);
        }
        boolean z10 = this.f54509g;
        if (z10) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z10);
        }
        int i11 = this.f54510h;
        if (i11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f54511i;
        if (i12 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        y yVar = this.f54512j;
        if (yVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f54513k;
        if (xVar != null) {
            return iComputeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, xVar);
        }
        return iComputeBytesSize;
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f54503a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f54504b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f54505c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f54506d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f54507e == null) {
                        this.f54507e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f54507e);
                    break;
                case 56:
                    this.f54508f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f54509g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f54510h = int32;
                    }
                    break;
                case 80:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == 1 || int33 == 2) {
                        this.f54511i = int33;
                    }
                    break;
                case 90:
                    if (this.f54512j == null) {
                        this.f54512j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f54512j);
                    break;
                case 98:
                    if (this.f54513k == null) {
                        this.f54513k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f54513k);
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

    public static z a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }
}
