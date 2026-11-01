package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4373mf extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4373mf[] f57275f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f57277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f57279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f57280e;

    public static C4373mf[] b() {
        if (f57275f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57275f == null) {
                    f57275f = new C4373mf[0];
                }
            }
        }
        return f57275f;
    }

    public final C4373mf a() {
        this.f57276a = "";
        this.f57277b = "";
        this.f57278c = false;
        this.f57279d = false;
        this.f57280e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f57276a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f57276a);
        }
        if (!this.f57277b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f57277b);
        }
        boolean z10 = this.f57278c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(3, z10);
        }
        boolean z11 = this.f57279d;
        if (z11) {
            codedOutputByteBufferNano.writeBool(4, z11);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f57280e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4373mf() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f57276a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f57276a);
        }
        if (!this.f57277b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f57277b);
        }
        boolean z10 = this.f57278c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z10);
        }
        boolean z11 = this.f57279d;
        if (z11) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z11);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f57280e) + iComputeSerializedSize;
    }

    public static C4373mf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4373mf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4373mf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57276a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f57277b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f57278c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f57279d = codedInputByteBufferNano.readBool();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f57280e = int32;
                }
            }
        }
    }

    public static C4373mf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4373mf) MessageNano.mergeFrom(new C4373mf(), bArr);
    }
}
