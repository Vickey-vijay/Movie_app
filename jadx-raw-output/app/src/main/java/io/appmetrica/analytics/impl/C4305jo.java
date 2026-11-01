package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4305jo extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4305jo[] f57060b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4228go[] f57061a;

    public static C4305jo[] b() {
        if (f57060b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57060b == null) {
                    f57060b = new C4305jo[0];
                }
            }
        }
        return f57060b;
    }

    public final C4305jo a() {
        this.f57061a = C4228go.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4228go[] c4228goArr = this.f57061a;
        if (c4228goArr != null && c4228goArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4228go[] c4228goArr2 = this.f57061a;
                if (i10 >= c4228goArr2.length) {
                    break;
                }
                C4228go c4228go = c4228goArr2[i10];
                if (c4228go != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4228go);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4305jo() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4305jo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C4228go[] c4228goArr = this.f57061a;
                int length = c4228goArr == null ? 0 : c4228goArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4228go[] c4228goArr2 = new C4228go[i10];
                if (length != 0) {
                    System.arraycopy(c4228goArr, 0, c4228goArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4228go c4228go = new C4228go();
                    c4228goArr2[length] = c4228go;
                    codedInputByteBufferNano.readMessage(c4228go);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4228go c4228go2 = new C4228go();
                c4228goArr2[length] = c4228go2;
                codedInputByteBufferNano.readMessage(c4228go2);
                this.f57061a = c4228goArr2;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4228go[] c4228goArr = this.f57061a;
        if (c4228goArr != null && c4228goArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4228go[] c4228goArr2 = this.f57061a;
                if (i10 >= c4228goArr2.length) {
                    break;
                }
                C4228go c4228go = c4228goArr2[i10];
                if (c4228go != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4228go);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    public static C4305jo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4305jo().mergeFrom(codedInputByteBufferNano);
    }

    public static C4305jo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4305jo) MessageNano.mergeFrom(new C4305jo(), bArr);
    }
}
