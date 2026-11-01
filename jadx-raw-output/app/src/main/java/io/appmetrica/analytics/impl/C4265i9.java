package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4265i9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4265i9[] f56959e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f56962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56963d;

    public static C4265i9[] b() {
        if (f56959e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56959e == null) {
                    f56959e = new C4265i9[0];
                }
            }
        }
        return f56959e;
    }

    public final C4265i9 a() {
        this.f56960a = 0;
        this.f56961b = 0;
        this.f56962c = "";
        this.f56963d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f56960a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f56961b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i11);
        }
        if (!this.f56962c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f56962c);
        }
        boolean z10 = this.f56963d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4265i9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f56960a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f56961b;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i11);
        }
        if (!this.f56962c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f56962c);
        }
        boolean z10 = this.f56963d;
        if (z10) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4265i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f56960a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f56961b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f56962c = codedInputByteBufferNano.readString();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56963d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C4265i9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4265i9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4265i9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4265i9) MessageNano.mergeFrom(new C4265i9(), bArr);
    }
}
