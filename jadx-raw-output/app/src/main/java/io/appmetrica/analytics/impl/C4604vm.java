package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4604vm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4604vm[] f57848b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57849a;

    public static C4604vm[] b() {
        if (f57848b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57848b == null) {
                    f57848b = new C4604vm[0];
                }
            }
        }
        return f57848b;
    }

    public final C4604vm a() {
        this.f57849a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f57849a;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4604vm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4604vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57849a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f57849a;
        if (i10 != 86400) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        return iComputeSerializedSize;
    }

    public static C4604vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4604vm) MessageNano.mergeFrom(new C4604vm(), bArr);
    }

    public static C4604vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4604vm().mergeFrom(codedInputByteBufferNano);
    }
}
