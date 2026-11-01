package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4529sm extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4529sm[] f57687g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f57688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f57691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f57692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57693f;

    public static C4529sm[] b() {
        if (f57687g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57687g == null) {
                    f57687g = new C4529sm[0];
                }
            }
        }
        return f57687g;
    }

    public final C4529sm a() {
        this.f57688a = false;
        this.f57689b = false;
        this.f57690c = false;
        this.f57691d = false;
        this.f57692e = false;
        this.f57693f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f57688a);
        codedOutputByteBufferNano.writeBool(2, this.f57689b);
        codedOutputByteBufferNano.writeBool(3, this.f57690c);
        codedOutputByteBufferNano.writeBool(4, this.f57691d);
        boolean z10 = this.f57692e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i10 = this.f57693f;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4529sm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f57691d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f57690c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f57689b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f57688a) + super.computeSerializedSize();
        boolean z10 = this.f57692e;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i10 = this.f57693f;
        if (i10 != -1) {
            return iComputeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i10);
        }
        return iComputeBoolSize;
    }

    public static C4529sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4529sm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4529sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f57688a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f57689b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f57690c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f57691d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f57692e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f57693f = int32;
                }
            }
        }
    }

    public static C4529sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4529sm) MessageNano.mergeFrom(new C4529sm(), bArr);
    }
}
