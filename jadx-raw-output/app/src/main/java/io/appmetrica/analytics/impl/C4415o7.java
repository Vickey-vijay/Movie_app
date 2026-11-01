package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4415o7 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile C4415o7[] f57382k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f57384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f57385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f57387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f57390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f57391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f57392j;

    public static C4415o7[] b() {
        if (f57382k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57382k == null) {
                    f57382k = new C4415o7[0];
                }
            }
        }
        return f57382k;
    }

    public final C4415o7 a() {
        this.f57383a = -1;
        this.f57384b = -1.0d;
        this.f57385c = -1.0d;
        this.f57386d = -1;
        this.f57387e = -1;
        this.f57388f = -1;
        this.f57389g = -1;
        this.f57390h = -1L;
        this.f57391i = "";
        this.f57392j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f57383a;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (Double.doubleToLongBits(this.f57384b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f57384b);
        }
        if (Double.doubleToLongBits(this.f57385c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f57385c);
        }
        int i11 = this.f57386d;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i11);
        }
        int i12 = this.f57387e;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i12);
        }
        int i13 = this.f57388f;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i13);
        }
        int i14 = this.f57389g;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i14);
        }
        long j10 = this.f57390h;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j10);
        }
        if (!this.f57391i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f57391i);
        }
        if (!this.f57392j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f57392j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4415o7() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f57383a;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (Double.doubleToLongBits(this.f57384b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f57384b);
        }
        if (Double.doubleToLongBits(this.f57385c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f57385c);
        }
        int i11 = this.f57386d;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i11);
        }
        int i12 = this.f57387e;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i12);
        }
        int i13 = this.f57388f;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i13);
        }
        int i14 = this.f57389g;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i14);
        }
        long j10 = this.f57390h;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j10);
        }
        if (!this.f57391i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f57391i);
        }
        if (!this.f57392j.equals("")) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f57392j);
        }
        return iComputeSerializedSize;
    }

    public static C4415o7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4415o7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4415o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f57383a = int32;
                    }
                    break;
                case 17:
                    this.f57384b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f57385c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f57386d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f57387e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f57388f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f57389g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f57390h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f57391i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f57392j = codedInputByteBufferNano.readString();
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

    public static C4415o7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4415o7) MessageNano.mergeFrom(new C4415o7(), bArr);
    }
}
