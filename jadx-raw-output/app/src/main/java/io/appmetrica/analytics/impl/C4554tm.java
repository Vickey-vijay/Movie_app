package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4554tm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4554tm[] f57735c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f57737b;

    public static C4554tm[] b() {
        if (f57735c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57735c == null) {
                    f57735c = new C4554tm[0];
                }
            }
        }
        return f57735c;
    }

    public final C4554tm a() {
        this.f57736a = "";
        this.f57737b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f57736a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f57736a);
        }
        if (!Arrays.equals(this.f57737b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f57737b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4554tm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f57736a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f57736a);
        }
        if (!Arrays.equals(this.f57737b, WireFormatNano.EMPTY_BYTES)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f57737b);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4554tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57736a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57737b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C4554tm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4554tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4554tm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4554tm) MessageNano.mergeFrom(new C4554tm(), bArr);
    }
}
