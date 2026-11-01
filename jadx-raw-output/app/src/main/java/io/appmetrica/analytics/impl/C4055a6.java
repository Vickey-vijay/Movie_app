package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4055a6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4055a6[] f56321g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f56325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56327f;

    public static C4055a6[] b() {
        if (f56321g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56321g == null) {
                    f56321g = new C4055a6[0];
                }
            }
        }
        return f56321g;
    }

    public final C4055a6 a() {
        this.f56322a = "";
        this.f56323b = "";
        this.f56324c = -1;
        this.f56325d = "";
        this.f56326e = false;
        this.f56327f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f56322a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f56322a);
        }
        if (!this.f56323b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f56323b);
        }
        int i10 = this.f56324c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i10);
        }
        if (!this.f56325d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f56325d);
        }
        boolean z10 = this.f56326e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i11 = this.f56327f;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4055a6() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f56322a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f56322a);
        }
        if (!this.f56323b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f56323b);
        }
        int i10 = this.f56324c;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i10);
        }
        if (!this.f56325d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f56325d);
        }
        boolean z10 = this.f56326e;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i11 = this.f56327f;
        if (i11 != -1) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i11);
        }
        return iComputeSerializedSize;
    }

    public static C4055a6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4055a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4055a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56322a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f56323b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f56324c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f56325d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f56326e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56327f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    public static C4055a6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4055a6) MessageNano.mergeFrom(new C4055a6(), bArr);
    }
}
