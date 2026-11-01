package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4186f8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4186f8[] f56722e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4416o8 f56723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4466q8 f56724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4238h8 f56725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4391n8 f56726d;

    public static C4186f8[] b() {
        if (f56722e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56722e == null) {
                    f56722e = new C4186f8[0];
                }
            }
        }
        return f56722e;
    }

    public final C4186f8 a() {
        this.f56723a = null;
        this.f56724b = null;
        this.f56725c = null;
        this.f56726d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4416o8 c4416o8 = this.f56723a;
        if (c4416o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4416o8);
        }
        C4466q8 c4466q8 = this.f56724b;
        if (c4466q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4466q8);
        }
        C4238h8 c4238h8 = this.f56725c;
        if (c4238h8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4238h8);
        }
        C4391n8 c4391n8 = this.f56726d;
        if (c4391n8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4391n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4186f8() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4416o8 c4416o8 = this.f56723a;
        if (c4416o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4416o8);
        }
        C4466q8 c4466q8 = this.f56724b;
        if (c4466q8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4466q8);
        }
        C4238h8 c4238h8 = this.f56725c;
        if (c4238h8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4238h8);
        }
        C4391n8 c4391n8 = this.f56726d;
        if (c4391n8 != null) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c4391n8);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4186f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f56723a == null) {
                    this.f56723a = new C4416o8();
                }
                codedInputByteBufferNano.readMessage(this.f56723a);
            } else if (tag == 18) {
                if (this.f56724b == null) {
                    this.f56724b = new C4466q8();
                }
                codedInputByteBufferNano.readMessage(this.f56724b);
            } else if (tag == 26) {
                if (this.f56725c == null) {
                    this.f56725c = new C4238h8();
                }
                codedInputByteBufferNano.readMessage(this.f56725c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f56726d == null) {
                    this.f56726d = new C4391n8();
                }
                codedInputByteBufferNano.readMessage(this.f56726d);
            }
        }
    }

    public static C4186f8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4186f8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4186f8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4186f8) MessageNano.mergeFrom(new C4186f8(), bArr);
    }
}
