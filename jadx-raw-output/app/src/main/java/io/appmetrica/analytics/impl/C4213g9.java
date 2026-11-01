package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4213g9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f56799d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56800e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f56801f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4213g9[] f56802g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4290j9 f56803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56805c;

    public static C4213g9[] b() {
        if (f56802g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56802g == null) {
                    f56802g = new C4213g9[0];
                }
            }
        }
        return f56802g;
    }

    public final C4213g9 a() {
        this.f56803a = null;
        this.f56804b = "";
        this.f56805c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4290j9 c4290j9 = this.f56803a;
        if (c4290j9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4290j9);
        }
        codedOutputByteBufferNano.writeString(2, this.f56804b);
        int i10 = this.f56805c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4213g9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4290j9 c4290j9 = this.f56803a;
        if (c4290j9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4290j9);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f56804b) + iComputeSerializedSize;
        int i10 = this.f56805c;
        if (i10 != 0) {
            return iComputeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i10);
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4213g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f56803a == null) {
                    this.f56803a = new C4290j9();
                }
                codedInputByteBufferNano.readMessage(this.f56803a);
            } else if (tag == 18) {
                this.f56804b = codedInputByteBufferNano.readString();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f56805c = int32;
                }
            }
        }
    }

    public static C4213g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4213g9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4213g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4213g9) MessageNano.mergeFrom(new C4213g9(), bArr);
    }
}
