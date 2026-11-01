package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class T5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile T5[] f55906d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S5 f55907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f55908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55909c;

    public static T5[] b() {
        if (f55906d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55906d == null) {
                    f55906d = new T5[0];
                }
            }
        }
        return f55906d;
    }

    public final T5 a() {
        this.f55907a = null;
        this.f55908b = "";
        this.f55909c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        S5 s10 = this.f55907a;
        if (s10 != null) {
            codedOutputByteBufferNano.writeMessage(1, s10);
        }
        if (!this.f55908b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f55908b);
        }
        int i10 = this.f55909c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public T5() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        S5 s10 = this.f55907a;
        if (s10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, s10);
        }
        if (!this.f55908b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f55908b);
        }
        int i10 = this.f55909c;
        if (i10 != -1) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f55907a == null) {
                    this.f55907a = new S5();
                }
                codedInputByteBufferNano.readMessage(this.f55907a);
            } else if (tag == 18) {
                this.f55908b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f55909c = int32;
                }
            }
        }
    }

    public static T5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T5().mergeFrom(codedInputByteBufferNano);
    }

    public static T5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T5) MessageNano.mergeFrom(new T5(), bArr);
    }
}
