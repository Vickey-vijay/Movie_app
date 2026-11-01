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
public final class Ni extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f55640l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f55641m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55642n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f55643o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f55644p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile Ni[] f55645q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f55647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f55648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f55649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ii f55650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f55651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Mi f55655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Li f55656k;

    public static Ni[] b() {
        if (f55645q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55645q == null) {
                    f55645q = new Ni[0];
                }
            }
        }
        return f55645q;
    }

    public final Ni a() {
        this.f55646a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f55647b = bArr;
        this.f55648c = bArr;
        this.f55649d = bArr;
        this.f55650e = null;
        this.f55651f = 0L;
        this.f55652g = false;
        this.f55653h = 0;
        this.f55654i = 1;
        this.f55655j = null;
        this.f55656k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f55646a;
        if (i10 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f55647b);
        byte[] bArr = this.f55648c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f55648c);
        }
        if (!Arrays.equals(this.f55649d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f55649d);
        }
        Ii ii2 = this.f55650e;
        if (ii2 != null) {
            codedOutputByteBufferNano.writeMessage(6, ii2);
        }
        long j10 = this.f55651f;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j10);
        }
        boolean z10 = this.f55652g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(8, z10);
        }
        int i11 = this.f55653h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f55654i;
        if (i12 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        Mi mi2 = this.f55655j;
        if (mi2 != null) {
            codedOutputByteBufferNano.writeMessage(11, mi2);
        }
        Li li2 = this.f55656k;
        if (li2 != null) {
            codedOutputByteBufferNano.writeMessage(12, li2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Ni() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f55646a;
        if (i10 != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f55647b) + iComputeSerializedSize;
        byte[] bArr = this.f55648c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f55648c);
        }
        if (!Arrays.equals(this.f55649d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f55649d);
        }
        Ii ii2 = this.f55650e;
        if (ii2 != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, ii2);
        }
        long j10 = this.f55651f;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j10);
        }
        boolean z10 = this.f55652g;
        if (z10) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z10);
        }
        int i11 = this.f55653h;
        if (i11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f55654i;
        if (i12 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        Mi mi2 = this.f55655j;
        if (mi2 != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, mi2);
        }
        Li li2 = this.f55656k;
        if (li2 != null) {
            return iComputeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, li2);
        }
        return iComputeBytesSize;
    }

    public static Ni b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ni().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f55646a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f55647b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f55648c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f55649d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f55650e == null) {
                        this.f55650e = new Ii();
                    }
                    codedInputByteBufferNano.readMessage(this.f55650e);
                    break;
                case 56:
                    this.f55651f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f55652g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f55653h = int32;
                    }
                    break;
                case 80:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == 1 || int33 == 2) {
                        this.f55654i = int33;
                    }
                    break;
                case 90:
                    if (this.f55655j == null) {
                        this.f55655j = new Mi();
                    }
                    codedInputByteBufferNano.readMessage(this.f55655j);
                    break;
                case 98:
                    if (this.f55656k == null) {
                        this.f55656k = new Li();
                    }
                    codedInputByteBufferNano.readMessage(this.f55656k);
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

    public static Ni a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ni) MessageNano.mergeFrom(new Ni(), bArr);
    }
}
