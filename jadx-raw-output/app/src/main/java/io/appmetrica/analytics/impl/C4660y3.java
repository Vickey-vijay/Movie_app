package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4660y3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57989c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f57990d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57991e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f57992f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4660y3[] f57993g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4585v3 f57994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4585v3[] f57995b;

    public static C4660y3[] b() {
        if (f57993g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57993g == null) {
                    f57993g = new C4660y3[0];
                }
            }
        }
        return f57993g;
    }

    public final C4660y3 a() {
        this.f57994a = null;
        this.f57995b = C4585v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4585v3 c4585v3 = this.f57994a;
        if (c4585v3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4585v3);
        }
        C4585v3[] c4585v3Arr = this.f57995b;
        if (c4585v3Arr != null && c4585v3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4585v3[] c4585v3Arr2 = this.f57995b;
                if (i10 >= c4585v3Arr2.length) {
                    break;
                }
                C4585v3 c4585v4 = c4585v3Arr2[i10];
                if (c4585v4 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4585v4);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4660y3() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4585v3 c4585v3 = this.f57994a;
        if (c4585v3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4585v3);
        }
        C4585v3[] c4585v3Arr = this.f57995b;
        if (c4585v3Arr != null && c4585v3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4585v3[] c4585v3Arr2 = this.f57995b;
                if (i10 >= c4585v3Arr2.length) {
                    break;
                }
                C4585v3 c4585v4 = c4585v3Arr2[i10];
                if (c4585v4 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4585v4);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4660y3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f57994a == null) {
                    this.f57994a = new C4585v3();
                }
                codedInputByteBufferNano.readMessage(this.f57994a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4585v3[] c4585v3Arr = this.f57995b;
                int length = c4585v3Arr == null ? 0 : c4585v3Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4585v3[] c4585v3Arr2 = new C4585v3[i10];
                if (length != 0) {
                    System.arraycopy(c4585v3Arr, 0, c4585v3Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4585v3 c4585v3 = new C4585v3();
                    c4585v3Arr2[length] = c4585v3;
                    codedInputByteBufferNano.readMessage(c4585v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4585v3 c4585v4 = new C4585v3();
                c4585v3Arr2[length] = c4585v4;
                codedInputByteBufferNano.readMessage(c4585v4);
                this.f57995b = c4585v3Arr2;
            }
        }
    }

    public static C4660y3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4660y3().mergeFrom(codedInputByteBufferNano);
    }

    public static C4660y3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4660y3) MessageNano.mergeFrom(new C4660y3(), bArr);
    }
}
