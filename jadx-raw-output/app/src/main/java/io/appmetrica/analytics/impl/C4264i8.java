package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4264i8 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4264i8[] f56953f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f56954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f56955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4366m8 f56956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4289j8[] f56957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56958e;

    public static C4264i8[] b() {
        if (f56953f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56953f == null) {
                    f56953f = new C4264i8[0];
                }
            }
        }
        return f56953f;
    }

    public final C4264i8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f56954a = bArr;
        this.f56955b = bArr;
        this.f56956c = null;
        this.f56957d = C4289j8.b();
        this.f56958e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f56954a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f56954a);
        }
        if (!Arrays.equals(this.f56955b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f56955b);
        }
        C4366m8 c4366m8 = this.f56956c;
        if (c4366m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4366m8);
        }
        C4289j8[] c4289j8Arr = this.f56957d;
        if (c4289j8Arr != null && c4289j8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4289j8[] c4289j8Arr2 = this.f56957d;
                if (i10 >= c4289j8Arr2.length) {
                    break;
                }
                C4289j8 c4289j8 = c4289j8Arr2[i10];
                if (c4289j8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c4289j8);
                }
                i10++;
            }
        }
        int i11 = this.f56958e;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4264i8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f56954a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f56954a);
        }
        if (!Arrays.equals(this.f56955b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f56955b);
        }
        C4366m8 c4366m8 = this.f56956c;
        if (c4366m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4366m8);
        }
        C4289j8[] c4289j8Arr = this.f56957d;
        if (c4289j8Arr != null && c4289j8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4289j8[] c4289j8Arr2 = this.f56957d;
                if (i10 >= c4289j8Arr2.length) {
                    break;
                }
                C4289j8 c4289j8 = c4289j8Arr2[i10];
                if (c4289j8 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4289j8);
                }
                i10++;
            }
        }
        int i11 = this.f56958e;
        if (i11 != 0) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i11);
        }
        return iComputeSerializedSize;
    }

    public static C4264i8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4264i8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4264i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56954a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f56955b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f56956c == null) {
                    this.f56956c = new C4366m8();
                }
                codedInputByteBufferNano.readMessage(this.f56956c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C4289j8[] c4289j8Arr = this.f56957d;
                int length = c4289j8Arr == null ? 0 : c4289j8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4289j8[] c4289j8Arr2 = new C4289j8[i10];
                if (length != 0) {
                    System.arraycopy(c4289j8Arr, 0, c4289j8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4289j8 c4289j8 = new C4289j8();
                    c4289j8Arr2[length] = c4289j8;
                    codedInputByteBufferNano.readMessage(c4289j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4289j8 c4289j9 = new C4289j8();
                c4289j8Arr2[length] = c4289j9;
                codedInputByteBufferNano.readMessage(c4289j9);
                this.f56957d = c4289j8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56958e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C4264i8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4264i8) MessageNano.mergeFrom(new C4264i8(), bArr);
    }
}
