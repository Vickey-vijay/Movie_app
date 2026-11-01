package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4290j9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4290j9[] f57008e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f57009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f57011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f57012d;

    public static C4290j9[] b() {
        if (f57008e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57008e == null) {
                    f57008e = new C4290j9[0];
                }
            }
        }
        return f57008e;
    }

    public final C4290j9 a() {
        this.f57009a = 0L;
        this.f57010b = 0;
        this.f57011c = 0L;
        this.f57012d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f57009a);
        codedOutputByteBufferNano.writeSInt32(2, this.f57010b);
        long j10 = this.f57011c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j10);
        }
        boolean z10 = this.f57012d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4290j9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f57010b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f57009a) + super.computeSerializedSize();
        long j10 = this.f57011c;
        if (j10 != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j10);
        }
        boolean z10 = this.f57012d;
        if (z10) {
            return iComputeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z10);
        }
        return iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4290j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f57009a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f57010b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f57011c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57012d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C4290j9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4290j9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4290j9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4290j9) MessageNano.mergeFrom(new C4290j9(), bArr);
    }
}
