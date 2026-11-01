package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile n[] f54898c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f54899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m[] f54900b;

    public static n[] b() {
        if (f54898c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f54898c == null) {
                    f54898c = new n[0];
                }
            }
        }
        return f54898c;
    }

    public final n a() {
        this.f54899a = 10000L;
        this.f54900b = m.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f54899a;
        if (j10 != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j10);
        }
        m[] mVarArr = this.f54900b;
        if (mVarArr != null && mVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                m[] mVarArr2 = this.f54900b;
                if (i10 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i10];
                if (mVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, mVar);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public n() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f54899a;
        if (j10 != 10000) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j10);
        }
        m[] mVarArr = this.f54900b;
        if (mVarArr != null && mVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                m[] mVarArr2 = this.f54900b;
                if (i10 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i10];
                if (mVar != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, mVar);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f54899a = codedInputByteBufferNano.readUInt64();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                m[] mVarArr = this.f54900b;
                int length = mVarArr == null ? 0 : mVarArr.length;
                int i10 = repeatedFieldArrayLength + length;
                m[] mVarArr2 = new m[i10];
                if (length != 0) {
                    System.arraycopy(mVarArr, 0, mVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    m mVar = new m();
                    mVarArr2[length] = mVar;
                    codedInputByteBufferNano.readMessage(mVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                m mVar2 = new m();
                mVarArr2[length] = mVar2;
                codedInputByteBufferNano.readMessage(mVar2);
                this.f54900b = mVarArr2;
            }
        }
    }

    public static n b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new n().mergeFrom(codedInputByteBufferNano);
    }

    public static n a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (n) MessageNano.mergeFrom(new n(), bArr);
    }
}
