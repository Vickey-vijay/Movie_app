package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54901c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54902d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile o[] f54903e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f54904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f54905b;

    public static o[] b() {
        if (f54903e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54903e == null) {
                    f54903e = new o[0];
                }
            }
        }
        return f54903e;
    }

    public final o a() {
        this.f54904a = false;
        this.f54905b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f54904a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        n nVar = this.f54905b;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(2, nVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public o() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f54904a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        n nVar = this.f54905b;
        if (nVar != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, nVar);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f54904a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f54905b == null) {
                    this.f54905b = new n();
                }
                codedInputByteBufferNano.readMessage(this.f54905b);
            }
        }
    }

    public static o b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new o().mergeFrom(codedInputByteBufferNano);
    }

    public static o a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (o) MessageNano.mergeFrom(new o(), bArr);
    }
}
