package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4380mm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4380mm[] f57291b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57292a;

    public static C4380mm[] b() {
        if (f57291b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57291b == null) {
                    f57291b = new C4380mm[0];
                }
            }
        }
        return f57291b;
    }

    public final C4380mm a() {
        this.f57292a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f57292a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f57292a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4380mm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4380mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57292a = codedInputByteBufferNano.readString();
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f57292a.equals("")) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f57292a);
        }
        return iComputeSerializedSize;
    }

    public static C4380mm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4380mm) MessageNano.mergeFrom(new C4380mm(), bArr);
    }

    public static C4380mm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4380mm().mergeFrom(codedInputByteBufferNano);
    }
}
