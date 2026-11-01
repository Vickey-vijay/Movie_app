package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4590v8 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f57798g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f57799h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f57800i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f57801j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f57802k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f57803l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f57804m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57805n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile C4590v8[] f57806o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4565u8 f57808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4515s8 f57809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4540t8 f57810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4160e8 f57811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4315k8 f57812f;

    public static C4590v8[] b() {
        if (f57806o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57806o == null) {
                    f57806o = new C4590v8[0];
                }
            }
        }
        return f57806o;
    }

    public final C4590v8 a() {
        this.f57807a = 0;
        this.f57808b = null;
        this.f57809c = null;
        this.f57810d = null;
        this.f57811e = null;
        this.f57812f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f57807a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        C4565u8 c4565u8 = this.f57808b;
        if (c4565u8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4565u8);
        }
        C4515s8 c4515s8 = this.f57809c;
        if (c4515s8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4515s8);
        }
        C4540t8 c4540t8 = this.f57810d;
        if (c4540t8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4540t8);
        }
        C4160e8 c4160e8 = this.f57811e;
        if (c4160e8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c4160e8);
        }
        C4315k8 c4315k8 = this.f57812f;
        if (c4315k8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4315k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4590v8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f57807a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        C4565u8 c4565u8 = this.f57808b;
        if (c4565u8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4565u8);
        }
        C4515s8 c4515s8 = this.f57809c;
        if (c4515s8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4515s8);
        }
        C4540t8 c4540t8 = this.f57810d;
        if (c4540t8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4540t8);
        }
        C4160e8 c4160e8 = this.f57811e;
        if (c4160e8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4160e8);
        }
        C4315k8 c4315k8 = this.f57812f;
        if (c4315k8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, c4315k8);
        }
        return iComputeSerializedSize;
    }

    public static C4590v8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4590v8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4590v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        this.f57807a = int32;
                        break;
                }
            } else if (tag == 18) {
                if (this.f57808b == null) {
                    this.f57808b = new C4565u8();
                }
                codedInputByteBufferNano.readMessage(this.f57808b);
            } else if (tag == 26) {
                if (this.f57809c == null) {
                    this.f57809c = new C4515s8();
                }
                codedInputByteBufferNano.readMessage(this.f57809c);
            } else if (tag == 34) {
                if (this.f57810d == null) {
                    this.f57810d = new C4540t8();
                }
                codedInputByteBufferNano.readMessage(this.f57810d);
            } else if (tag == 42) {
                if (this.f57811e == null) {
                    this.f57811e = new C4160e8();
                }
                codedInputByteBufferNano.readMessage(this.f57811e);
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f57812f == null) {
                    this.f57812f = new C4315k8();
                }
                codedInputByteBufferNano.readMessage(this.f57812f);
            }
        }
    }

    public static C4590v8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4590v8) MessageNano.mergeFrom(new C4590v8(), bArr);
    }
}
