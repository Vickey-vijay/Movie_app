package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4423of extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57438c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f57439d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57440e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f57441f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4423of[] f57442g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4373mf f57443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4398nf[] f57444b;

    public static C4423of[] b() {
        if (f57442g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57442g == null) {
                    f57442g = new C4423of[0];
                }
            }
        }
        return f57442g;
    }

    public final C4423of a() {
        this.f57443a = null;
        this.f57444b = C4398nf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4373mf c4373mf = this.f57443a;
        if (c4373mf != null) {
            codedOutputByteBufferNano.writeMessage(1, c4373mf);
        }
        C4398nf[] c4398nfArr = this.f57444b;
        if (c4398nfArr != null && c4398nfArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4398nf[] c4398nfArr2 = this.f57444b;
                if (i10 >= c4398nfArr2.length) {
                    break;
                }
                C4398nf c4398nf = c4398nfArr2[i10];
                if (c4398nf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4398nf);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4423of() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4373mf c4373mf = this.f57443a;
        if (c4373mf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4373mf);
        }
        C4398nf[] c4398nfArr = this.f57444b;
        if (c4398nfArr != null && c4398nfArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4398nf[] c4398nfArr2 = this.f57444b;
                if (i10 >= c4398nfArr2.length) {
                    break;
                }
                C4398nf c4398nf = c4398nfArr2[i10];
                if (c4398nf != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4398nf);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4423of mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f57443a == null) {
                    this.f57443a = new C4373mf();
                }
                codedInputByteBufferNano.readMessage(this.f57443a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4398nf[] c4398nfArr = this.f57444b;
                int length = c4398nfArr == null ? 0 : c4398nfArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4398nf[] c4398nfArr2 = new C4398nf[i10];
                if (length != 0) {
                    System.arraycopy(c4398nfArr, 0, c4398nfArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4398nf c4398nf = new C4398nf();
                    c4398nfArr2[length] = c4398nf;
                    codedInputByteBufferNano.readMessage(c4398nf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4398nf c4398nf2 = new C4398nf();
                c4398nfArr2[length] = c4398nf2;
                codedInputByteBufferNano.readMessage(c4398nf2);
                this.f57444b = c4398nfArr2;
            }
        }
    }

    public static C4423of b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4423of().mergeFrom(codedInputByteBufferNano);
    }

    public static C4423of a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4423of) MessageNano.mergeFrom(new C4423of(), bArr);
    }
}
