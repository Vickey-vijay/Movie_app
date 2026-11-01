package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile x[] f54484d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f54485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f54486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f54487c;

    public static x[] b() {
        if (f54484d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54484d == null) {
                    f54484d = new x[0];
                }
            }
        }
        return f54484d;
    }

    public final x a() {
        this.f54485a = false;
        this.f54486b = null;
        this.f54487c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f54485a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        w wVar = this.f54486b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f54487c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public x() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f54485a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        w wVar = this.f54486b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f54487c;
        if (vVar != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, vVar);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f54485a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f54486b == null) {
                    this.f54486b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f54486b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f54487c == null) {
                    this.f54487c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f54487c);
            }
        }
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
