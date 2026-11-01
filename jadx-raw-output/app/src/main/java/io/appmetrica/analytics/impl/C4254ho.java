package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4254ho extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4254ho[] f56930c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56932b;

    public static C4254ho[] b() {
        if (f56930c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56930c == null) {
                    f56930c = new C4254ho[0];
                }
            }
        }
        return f56930c;
    }

    public final C4254ho a() {
        this.f56931a = false;
        this.f56932b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f56931a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        boolean z11 = this.f56932b;
        if (z11) {
            codedOutputByteBufferNano.writeBool(2, z11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4254ho() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f56931a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        boolean z11 = this.f56932b;
        if (z11) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z11);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4254ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f56931a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56932b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C4254ho b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4254ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C4254ho a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4254ho) MessageNano.mergeFrom(new C4254ho(), bArr);
    }
}
