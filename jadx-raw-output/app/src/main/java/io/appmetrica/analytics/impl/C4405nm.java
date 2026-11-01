package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4405nm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4405nm[] f57366c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4380mm f57368b;

    public static C4405nm[] b() {
        if (f57366c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57366c == null) {
                    f57366c = new C4405nm[0];
                }
            }
        }
        return f57366c;
    }

    public final C4405nm a() {
        this.f57367a = "";
        this.f57368b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f57367a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f57367a);
        }
        C4380mm c4380mm = this.f57368b;
        if (c4380mm != null) {
            codedOutputByteBufferNano.writeMessage(2, c4380mm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4405nm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f57367a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f57367a);
        }
        C4380mm c4380mm = this.f57368b;
        if (c4380mm != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4380mm);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4405nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57367a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f57368b == null) {
                    this.f57368b = new C4380mm();
                }
                codedInputByteBufferNano.readMessage(this.f57368b);
            }
        }
    }

    public static C4405nm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4405nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4405nm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4405nm) MessageNano.mergeFrom(new C4405nm(), bArr);
    }
}
