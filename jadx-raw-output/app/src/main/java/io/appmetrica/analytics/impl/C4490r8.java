package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4490r8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4490r8[] f57593e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4212g8 f57595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f57596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4366m8 f57597d;

    public static C4490r8[] b() {
        if (f57593e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57593e == null) {
                    f57593e = new C4490r8[0];
                }
            }
        }
        return f57593e;
    }

    public final C4490r8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f57594a = bArr;
        this.f57595b = null;
        this.f57596c = bArr;
        this.f57597d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f57594a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f57594a);
        }
        C4212g8 c4212g8 = this.f57595b;
        if (c4212g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4212g8);
        }
        if (!Arrays.equals(this.f57596c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f57596c);
        }
        C4366m8 c4366m8 = this.f57597d;
        if (c4366m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4366m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4490r8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f57594a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f57594a);
        }
        C4212g8 c4212g8 = this.f57595b;
        if (c4212g8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4212g8);
        }
        if (!Arrays.equals(this.f57596c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f57596c);
        }
        C4366m8 c4366m8 = this.f57597d;
        if (c4366m8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c4366m8);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4490r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57594a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f57595b == null) {
                    this.f57595b = new C4212g8();
                }
                codedInputByteBufferNano.readMessage(this.f57595b);
            } else if (tag == 26) {
                this.f57596c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f57597d == null) {
                    this.f57597d = new C4366m8();
                }
                codedInputByteBufferNano.readMessage(this.f57597d);
            }
        }
    }

    public static C4490r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4490r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4490r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4490r8) MessageNano.mergeFrom(new C4490r8(), bArr);
    }
}
