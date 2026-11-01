package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4058a9 extends MessageNano {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f56331j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f56332k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f56333l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile C4058a9[] f56334m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f56335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f56336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f56337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f56343i;

    public static C4058a9[] b() {
        if (f56334m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56334m == null) {
                    f56334m = new C4058a9[0];
                }
            }
        }
        return f56334m;
    }

    public final C4058a9 a() {
        this.f56335a = 0.0d;
        this.f56336b = 0.0d;
        this.f56337c = 0L;
        this.f56338d = 0;
        this.f56339e = 0;
        this.f56340f = 0;
        this.f56341g = 0;
        this.f56342h = 0;
        this.f56343i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f56335a);
        codedOutputByteBufferNano.writeDouble(2, this.f56336b);
        long j10 = this.f56337c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j10);
        }
        int i10 = this.f56338d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i10);
        }
        int i11 = this.f56339e;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i11);
        }
        int i12 = this.f56340f;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i12);
        }
        int i13 = this.f56341g;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        int i14 = this.f56342h;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i14);
        }
        if (!this.f56343i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f56343i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4058a9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f56336b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f56335a) + super.computeSerializedSize();
        long j10 = this.f56337c;
        if (j10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j10);
        }
        int i10 = this.f56338d;
        if (i10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i10);
        }
        int i11 = this.f56339e;
        if (i11 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i11);
        }
        int i12 = this.f56340f;
        if (i12 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i12);
        }
        int i13 = this.f56341g;
        if (i13 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        int i14 = this.f56342h;
        if (i14 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i14);
        }
        if (!this.f56343i.equals("")) {
            return iComputeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f56343i);
        }
        return iComputeDoubleSize;
    }

    public static C4058a9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4058a9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4058a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 9) {
                this.f56335a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f56336b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f56337c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f56338d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f56339e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f56340f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f56341g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f56342h = int32;
                }
            } else if (tag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56343i = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C4058a9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4058a9) MessageNano.mergeFrom(new C4058a9(), bArr);
    }
}
