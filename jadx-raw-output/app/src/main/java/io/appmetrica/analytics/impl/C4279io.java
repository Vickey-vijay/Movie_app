package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4279io extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4279io[] f56980e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f56981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f56982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f56983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56984d;

    public static C4279io[] b() {
        if (f56980e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56980e == null) {
                    f56980e = new C4279io[0];
                }
            }
        }
        return f56980e;
    }

    public final C4279io a() {
        this.f56981a = WireFormatNano.EMPTY_BYTES;
        this.f56982b = 0.0d;
        this.f56983c = 0.0d;
        this.f56984d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f56981a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f56981a);
        }
        if (Double.doubleToLongBits(this.f56982b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f56982b);
        }
        if (Double.doubleToLongBits(this.f56983c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f56983c);
        }
        boolean z10 = this.f56984d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4279io() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f56981a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f56981a);
        }
        if (Double.doubleToLongBits(this.f56982b) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f56982b);
        }
        if (Double.doubleToLongBits(this.f56983c) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f56983c);
        }
        boolean z10 = this.f56984d;
        if (z10) {
            return iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z10);
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4279io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56981a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f56982b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f56983c = codedInputByteBufferNano.readDouble();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f56984d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C4279io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4279io().mergeFrom(codedInputByteBufferNano);
    }

    public static C4279io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4279io) MessageNano.mergeFrom(new C4279io(), bArr);
    }
}
