package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class Li extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Li[] f55522d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f55523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ki f55524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ji f55525c;

    public static Li[] b() {
        if (f55522d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55522d == null) {
                    f55522d = new Li[0];
                }
            }
        }
        return f55522d;
    }

    public final Li a() {
        this.f55523a = false;
        this.f55524b = null;
        this.f55525c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f55523a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        Ki ki2 = this.f55524b;
        if (ki2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ki2);
        }
        Ji ji2 = this.f55525c;
        if (ji2 != null) {
            codedOutputByteBufferNano.writeMessage(3, ji2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Li() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f55523a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        Ki ki2 = this.f55524b;
        if (ki2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ki2);
        }
        Ji ji2 = this.f55525c;
        if (ji2 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, ji2);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Li mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f55523a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f55524b == null) {
                    this.f55524b = new Ki();
                }
                codedInputByteBufferNano.readMessage(this.f55524b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f55525c == null) {
                    this.f55525c = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f55525c);
            }
        }
    }

    public static Li b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Li().mergeFrom(codedInputByteBufferNano);
    }

    public static Li a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Li) MessageNano.mergeFrom(new Li(), bArr);
    }
}
