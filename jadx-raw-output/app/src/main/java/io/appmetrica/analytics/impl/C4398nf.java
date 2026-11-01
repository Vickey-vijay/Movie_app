package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4398nf extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C4398nf[] f57345d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f57347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57348c;

    public static C4398nf[] b() {
        if (f57345d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57345d == null) {
                    f57345d = new C4398nf[0];
                }
            }
        }
        return f57345d;
    }

    public final C4398nf a() {
        this.f57346a = "";
        this.f57347b = "";
        this.f57348c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f57346a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f57346a);
        }
        if (!this.f57347b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f57347b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f57348c);
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4398nf() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f57346a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f57346a);
        }
        if (!this.f57347b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f57347b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f57348c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4398nf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57346a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f57347b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f57348c = int32;
                }
            }
        }
    }

    public static C4398nf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4398nf().mergeFrom(codedInputByteBufferNano);
    }

    public static C4398nf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4398nf) MessageNano.mergeFrom(new C4398nf(), bArr);
    }
}
