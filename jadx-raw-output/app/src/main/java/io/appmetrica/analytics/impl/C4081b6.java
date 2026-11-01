package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4081b6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4081b6[] f56408g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f56411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f56412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4055a6[] f56414f;

    public static C4081b6[] b() {
        if (f56408g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56408g == null) {
                    f56408g = new C4081b6[0];
                }
            }
        }
        return f56408g;
    }

    public final C4081b6 a() {
        this.f56409a = "";
        this.f56410b = 0;
        this.f56411c = 0L;
        this.f56412d = "";
        this.f56413e = 0;
        this.f56414f = C4055a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f56409a);
        codedOutputByteBufferNano.writeSInt32(2, this.f56410b);
        codedOutputByteBufferNano.writeSInt64(3, this.f56411c);
        if (!this.f56412d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f56412d);
        }
        int i10 = this.f56413e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        C4055a6[] c4055a6Arr = this.f56414f;
        if (c4055a6Arr != null && c4055a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4055a6[] c4055a6Arr2 = this.f56414f;
                if (i11 >= c4055a6Arr2.length) {
                    break;
                }
                C4055a6 c4055a6 = c4055a6Arr2[i11];
                if (c4055a6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c4055a6);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4081b6() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f56411c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f56410b) + CodedOutputByteBufferNano.computeStringSize(1, this.f56409a) + super.computeSerializedSize();
        if (!this.f56412d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f56412d);
        }
        int i10 = this.f56413e;
        if (i10 != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        C4055a6[] c4055a6Arr = this.f56414f;
        if (c4055a6Arr != null && c4055a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4055a6[] c4055a6Arr2 = this.f56414f;
                if (i11 >= c4055a6Arr2.length) {
                    break;
                }
                C4055a6 c4055a6 = c4055a6Arr2[i11];
                if (c4055a6 != null) {
                    iComputeSInt64Size += CodedOutputByteBufferNano.computeMessageSize(6, c4055a6);
                }
                i11++;
            }
        }
        return iComputeSInt64Size;
    }

    public static C4081b6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4081b6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4081b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56409a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f56410b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f56411c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f56412d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f56413e = codedInputByteBufferNano.readUInt32();
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C4055a6[] c4055a6Arr = this.f56414f;
                int length = c4055a6Arr == null ? 0 : c4055a6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4055a6[] c4055a6Arr2 = new C4055a6[i10];
                if (length != 0) {
                    System.arraycopy(c4055a6Arr, 0, c4055a6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4055a6 c4055a6 = new C4055a6();
                    c4055a6Arr2[length] = c4055a6;
                    codedInputByteBufferNano.readMessage(c4055a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4055a6 c4055a7 = new C4055a6();
                c4055a6Arr2[length] = c4055a7;
                codedInputByteBufferNano.readMessage(c4055a7);
                this.f56414f = c4055a6Arr2;
            }
        }
    }

    public static C4081b6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4081b6) MessageNano.mergeFrom(new C4081b6(), bArr);
    }
}
