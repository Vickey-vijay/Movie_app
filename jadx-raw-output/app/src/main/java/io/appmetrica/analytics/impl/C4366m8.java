package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4366m8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4366m8[] f57265c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4341l8[] f57266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57267b;

    public static C4366m8[] b() {
        if (f57265c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57265c == null) {
                    f57265c = new C4366m8[0];
                }
            }
        }
        return f57265c;
    }

    public final C4366m8 a() {
        this.f57266a = C4341l8.b();
        this.f57267b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4341l8[] c4341l8Arr = this.f57266a;
        if (c4341l8Arr != null && c4341l8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4341l8[] c4341l8Arr2 = this.f57266a;
                if (i10 >= c4341l8Arr2.length) {
                    break;
                }
                C4341l8 c4341l8 = c4341l8Arr2[i10];
                if (c4341l8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4341l8);
                }
                i10++;
            }
        }
        int i11 = this.f57267b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4366m8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4341l8[] c4341l8Arr = this.f57266a;
        if (c4341l8Arr != null && c4341l8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4341l8[] c4341l8Arr2 = this.f57266a;
                if (i10 >= c4341l8Arr2.length) {
                    break;
                }
                C4341l8 c4341l8 = c4341l8Arr2[i10];
                if (c4341l8 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4341l8);
                }
                i10++;
            }
        }
        int i11 = this.f57267b;
        if (i11 != 0) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i11);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4366m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4341l8[] c4341l8Arr = this.f57266a;
                int length = c4341l8Arr == null ? 0 : c4341l8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4341l8[] c4341l8Arr2 = new C4341l8[i10];
                if (length != 0) {
                    System.arraycopy(c4341l8Arr, 0, c4341l8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4341l8 c4341l8 = new C4341l8();
                    c4341l8Arr2[length] = c4341l8;
                    codedInputByteBufferNano.readMessage(c4341l8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4341l8 c4341l9 = new C4341l8();
                c4341l8Arr2[length] = c4341l9;
                codedInputByteBufferNano.readMessage(c4341l9);
                this.f57266a = c4341l8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57267b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C4366m8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4366m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4366m8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4366m8) MessageNano.mergeFrom(new C4366m8(), bArr);
    }
}
