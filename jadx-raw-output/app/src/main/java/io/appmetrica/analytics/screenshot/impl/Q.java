package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class Q extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Q[] f58390d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N f58391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P f58392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O f58393c;

    public static Q[] b() {
        if (f58390d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f58390d == null) {
                    f58390d = new Q[0];
                }
            }
        }
        return f58390d;
    }

    public final Q a() {
        this.f58391a = null;
        this.f58392b = null;
        this.f58393c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N n10 = this.f58391a;
        if (n10 != null) {
            codedOutputByteBufferNano.writeMessage(1, n10);
        }
        P p10 = this.f58392b;
        if (p10 != null) {
            codedOutputByteBufferNano.writeMessage(2, p10);
        }
        O o10 = this.f58393c;
        if (o10 != null) {
            codedOutputByteBufferNano.writeMessage(3, o10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Q() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        N n10 = this.f58391a;
        if (n10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n10);
        }
        P p10 = this.f58392b;
        if (p10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p10);
        }
        O o10 = this.f58393c;
        if (o10 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, o10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f58391a == null) {
                    this.f58391a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f58391a);
            } else if (tag == 18) {
                if (this.f58392b == null) {
                    this.f58392b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f58392b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f58393c == null) {
                    this.f58393c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f58393c);
            }
        }
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }
}
