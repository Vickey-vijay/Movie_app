package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class Bb extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Bb[] f55015f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f55016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f55017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f55019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f55020e;

    public static Bb[] b() {
        if (f55015f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f55015f == null) {
                    f55015f = new Bb[0];
                }
            }
        }
        return f55015f;
    }

    public final Bb a() {
        this.f55016a = "";
        this.f55017b = "";
        this.f55018c = false;
        this.f55019d = "";
        this.f55020e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f55016a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f55016a);
        }
        if (!this.f55017b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f55017b);
        }
        boolean z10 = this.f55018c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(22, z10);
        }
        if (!this.f55019d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f55019d);
        }
        if (!this.f55020e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f55020e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public Bb() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f55016a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f55016a);
        }
        if (!this.f55017b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f55017b);
        }
        boolean z10 = this.f55018c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z10);
        }
        if (!this.f55019d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f55019d);
        }
        if (!this.f55020e.equals("")) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f55020e);
        }
        return iComputeSerializedSize;
    }

    public static Bb b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Bb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f55016a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f55017b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f55018c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f55019d = codedInputByteBufferNano.readString();
            } else if (tag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f55020e = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Bb a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Bb) MessageNano.mergeFrom(new Bb(), bArr);
    }
}
