package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4430om extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4430om[] f57456b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4405nm[] f57457a;

    public static C4430om[] b() {
        if (f57456b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57456b == null) {
                    f57456b = new C4430om[0];
                }
            }
        }
        return f57456b;
    }

    public final C4430om a() {
        this.f57457a = C4405nm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4405nm[] c4405nmArr = this.f57457a;
        if (c4405nmArr != null && c4405nmArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4405nm[] c4405nmArr2 = this.f57457a;
                if (i10 >= c4405nmArr2.length) {
                    break;
                }
                C4405nm c4405nm = c4405nmArr2[i10];
                if (c4405nm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4405nm);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4430om() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4430om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4405nm[] c4405nmArr = this.f57457a;
                int length = c4405nmArr == null ? 0 : c4405nmArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4405nm[] c4405nmArr2 = new C4405nm[i10];
                if (length != 0) {
                    System.arraycopy(c4405nmArr, 0, c4405nmArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4405nm c4405nm = new C4405nm();
                    c4405nmArr2[length] = c4405nm;
                    codedInputByteBufferNano.readMessage(c4405nm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4405nm c4405nm2 = new C4405nm();
                c4405nmArr2[length] = c4405nm2;
                codedInputByteBufferNano.readMessage(c4405nm2);
                this.f57457a = c4405nmArr2;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4405nm[] c4405nmArr = this.f57457a;
        if (c4405nmArr != null && c4405nmArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4405nm[] c4405nmArr2 = this.f57457a;
                if (i10 >= c4405nmArr2.length) {
                    break;
                }
                C4405nm c4405nm = c4405nmArr2[i10];
                if (c4405nm != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4405nm);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    public static C4430om b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4430om().mergeFrom(codedInputByteBufferNano);
    }

    public static C4430om a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4430om) MessageNano.mergeFrom(new C4430om(), bArr);
    }
}
