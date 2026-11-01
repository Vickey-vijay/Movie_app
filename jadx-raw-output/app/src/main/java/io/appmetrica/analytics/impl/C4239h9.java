package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4239h9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f56883d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56884e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f56885f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f56886g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f56887h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f56888i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f56889j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f56890k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f56891l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f56892m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f56893n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f56894o = 11;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f56895p = 12;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile C4239h9[] f56896q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f56897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4213g9 f56898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4187f9[] f56899c;

    public static C4239h9[] b() {
        if (f56896q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56896q == null) {
                    f56896q = new C4239h9[0];
                }
            }
        }
        return f56896q;
    }

    public final C4239h9 a() {
        this.f56897a = 0L;
        this.f56898b = null;
        this.f56899c = C4187f9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f56897a);
        C4213g9 c4213g9 = this.f56898b;
        if (c4213g9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4213g9);
        }
        C4187f9[] c4187f9Arr = this.f56899c;
        if (c4187f9Arr != null && c4187f9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4187f9[] c4187f9Arr2 = this.f56899c;
                if (i10 >= c4187f9Arr2.length) {
                    break;
                }
                C4187f9 c4187f9 = c4187f9Arr2[i10];
                if (c4187f9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4187f9);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4239h9() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f56897a) + super.computeSerializedSize();
        C4213g9 c4213g9 = this.f56898b;
        if (c4213g9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c4213g9);
        }
        C4187f9[] c4187f9Arr = this.f56899c;
        if (c4187f9Arr != null && c4187f9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4187f9[] c4187f9Arr2 = this.f56899c;
                if (i10 >= c4187f9Arr2.length) {
                    break;
                }
                C4187f9 c4187f9 = c4187f9Arr2[i10];
                if (c4187f9 != null) {
                    iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(3, c4187f9);
                }
                i10++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4239h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f56897a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f56898b == null) {
                    this.f56898b = new C4213g9();
                }
                codedInputByteBufferNano.readMessage(this.f56898b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4187f9[] c4187f9Arr = this.f56899c;
                int length = c4187f9Arr == null ? 0 : c4187f9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4187f9[] c4187f9Arr2 = new C4187f9[i10];
                if (length != 0) {
                    System.arraycopy(c4187f9Arr, 0, c4187f9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4187f9 c4187f9 = new C4187f9();
                    c4187f9Arr2[length] = c4187f9;
                    codedInputByteBufferNano.readMessage(c4187f9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4187f9 c4187f10 = new C4187f9();
                c4187f9Arr2[length] = c4187f10;
                codedInputByteBufferNano.readMessage(c4187f10);
                this.f56899c = c4187f9Arr2;
            }
        }
    }

    public static C4239h9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4239h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4239h9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4239h9) MessageNano.mergeFrom(new C4239h9(), bArr);
    }
}
