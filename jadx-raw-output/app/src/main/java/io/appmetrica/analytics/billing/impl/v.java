package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile v[] f54471e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f54472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f54473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f54475d;

    public static v[] b() {
        if (f54471e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54471e == null) {
                    f54471e = new v[0];
                }
            }
        }
        return f54471e;
    }

    public final v a() {
        this.f54472a = 0L;
        this.f54473b = null;
        this.f54474c = 0;
        this.f54475d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f54472a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        w wVar = this.f54473b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i10 = this.f54474c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i10);
        }
        if (!Arrays.equals(this.f54475d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f54475d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public v() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f54472a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        w wVar = this.f54473b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i10 = this.f54474c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f54475d, WireFormatNano.EMPTY_BYTES)) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f54475d);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f54472a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f54473b == null) {
                    this.f54473b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f54473b);
            } else if (tag == 24) {
                this.f54474c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f54475d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }
}
