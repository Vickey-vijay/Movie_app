package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4506s extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f57618l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f57619m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57620n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f57621o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f57622p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f57623q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f57624r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f57625s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile C4506s[] f57626t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static byte[] f57627u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static volatile boolean f57628v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f57630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f57631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f57633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f57634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f57635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f57636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f57637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f57638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f57639k;

    public static C4506s[] b() {
        if (f57626t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57626t == null) {
                    f57626t = new C4506s[0];
                }
            }
        }
        return f57626t;
    }

    public final C4506s a() {
        this.f57629a = (byte[]) f57627u.clone();
        this.f57630b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f57631c = bArr;
        this.f57632d = 0;
        this.f57633e = bArr;
        this.f57634f = bArr;
        this.f57635g = bArr;
        this.f57636h = bArr;
        this.f57637i = bArr;
        this.f57638j = bArr;
        this.f57639k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f57629a, f57627u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f57629a);
        }
        r rVar = this.f57630b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f57631c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f57631c);
        }
        int i10 = this.f57632d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        if (!Arrays.equals(this.f57633e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f57633e);
        }
        if (!Arrays.equals(this.f57634f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f57634f);
        }
        if (!Arrays.equals(this.f57635g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f57635g);
        }
        if (!Arrays.equals(this.f57636h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f57636h);
        }
        if (!Arrays.equals(this.f57637i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f57637i);
        }
        if (!Arrays.equals(this.f57638j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f57638j);
        }
        if (!Arrays.equals(this.f57639k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f57639k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4506s() {
        if (!f57628v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f57628v) {
                    f57627u = InternalNano.bytesDefaultValue("manual");
                    f57628v = true;
                }
            }
        }
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f57629a, f57627u)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f57629a);
        }
        r rVar = this.f57630b;
        if (rVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f57631c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f57631c);
        }
        int i10 = this.f57632d;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        if (!Arrays.equals(this.f57633e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f57633e);
        }
        if (!Arrays.equals(this.f57634f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f57634f);
        }
        if (!Arrays.equals(this.f57635g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f57635g);
        }
        if (!Arrays.equals(this.f57636h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f57636h);
        }
        if (!Arrays.equals(this.f57637i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f57637i);
        }
        if (!Arrays.equals(this.f57638j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f57638j);
        }
        if (!Arrays.equals(this.f57639k, bArr2)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f57639k);
        }
        return iComputeSerializedSize;
    }

    public static C4506s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4506s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4506s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f57629a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f57630b == null) {
                        this.f57630b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f57630b);
                    break;
                case 26:
                    this.f57631c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f57632d = int32;
                            break;
                    }
                    break;
                case 42:
                    this.f57633e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f57634f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f57635g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f57636h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f57637i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f57638j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f57639k = codedInputByteBufferNano.readBytes();
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

    public static C4506s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4506s) MessageNano.mergeFrom(new C4506s(), bArr);
    }
}
