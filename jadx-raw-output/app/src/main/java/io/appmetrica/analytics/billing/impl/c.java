package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile c[] f54434f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54439e;

    public static c[] b() {
        if (f54434f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54434f == null) {
                    f54434f = new c[0];
                }
            }
        }
        return f54434f;
    }

    public final c a() {
        this.f54435a = 1;
        this.f54436b = "";
        this.f54437c = "";
        this.f54438d = 0L;
        this.f54439e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f54435a);
        codedOutputByteBufferNano.writeString(2, this.f54436b);
        codedOutputByteBufferNano.writeString(3, this.f54437c);
        codedOutputByteBufferNano.writeUInt64(4, this.f54438d);
        codedOutputByteBufferNano.writeUInt64(5, this.f54439e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public c() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f54439e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f54438d) + CodedOutputByteBufferNano.computeStringSize(3, this.f54437c) + CodedOutputByteBufferNano.computeStringSize(2, this.f54436b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f54435a) + super.computeSerializedSize();
    }

    public static c b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new c().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f54435a = int32;
                }
            } else if (tag == 18) {
                this.f54436b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f54437c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f54438d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f54439e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static c a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (c) MessageNano.mergeFrom(new c(), bArr);
    }
}
