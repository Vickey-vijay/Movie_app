package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4161e9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4161e9[] f56659c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56661b;

    public static C4161e9[] b() {
        if (f56659c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56659c == null) {
                    f56659c = new C4161e9[0];
                }
            }
        }
        return f56659c;
    }

    public final C4161e9 a() {
        this.f56660a = 2;
        this.f56661b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f56660a;
        if (i10 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!this.f56661b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f56661b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4161e9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f56660a;
        if (i10 != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!this.f56661b.equals("")) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f56661b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4161e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 24) {
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
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f56660a = int32;
                        break;
                }
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56661b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C4161e9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4161e9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4161e9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4161e9) MessageNano.mergeFrom(new C4161e9(), bArr);
    }
}
