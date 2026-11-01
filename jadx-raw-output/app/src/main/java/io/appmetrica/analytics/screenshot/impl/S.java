package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class S extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile S[] f58394c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f58395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f58396b;

    public static S[] b() {
        if (f58394c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f58394c == null) {
                    f58394c = new S[0];
                }
            }
        }
        return f58394c;
    }

    public final S a() {
        this.f58395a = true;
        this.f58396b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f58395a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        Q q10 = this.f58396b;
        if (q10 != null) {
            codedOutputByteBufferNano.writeMessage(2, q10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public S() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f58395a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        Q q10 = this.f58396b;
        if (q10 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, q10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f58395a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f58396b == null) {
                    this.f58396b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f58396b);
            }
        }
    }

    public static S b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S().mergeFrom(codedInputByteBufferNano);
    }

    public static S a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S) MessageNano.mergeFrom(new S(), bArr);
    }
}
