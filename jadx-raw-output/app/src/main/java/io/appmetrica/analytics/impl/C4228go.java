package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4228go extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56860e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f56861f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f56862g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f56863h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C4228go[] f56864i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f56865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4254ho f56867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4279io f56868d;

    public static C4228go[] b() {
        if (f56864i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56864i == null) {
                    f56864i = new C4228go[0];
                }
            }
        }
        return f56864i;
    }

    public final C4228go a() {
        this.f56865a = WireFormatNano.EMPTY_BYTES;
        this.f56866b = 0;
        this.f56867c = null;
        this.f56868d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f56865a);
        codedOutputByteBufferNano.writeInt32(2, this.f56866b);
        C4254ho c4254ho = this.f56867c;
        if (c4254ho != null) {
            codedOutputByteBufferNano.writeMessage(3, c4254ho);
        }
        C4279io c4279io = this.f56868d;
        if (c4279io != null) {
            codedOutputByteBufferNano.writeMessage(4, c4279io);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4228go() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f56866b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f56865a) + super.computeSerializedSize();
        C4254ho c4254ho = this.f56867c;
        if (c4254ho != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c4254ho);
        }
        C4279io c4279io = this.f56868d;
        if (c4279io != null) {
            return iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c4279io);
        }
        return iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4228go mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56865a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f56866b = int32;
                }
            } else if (tag == 26) {
                if (this.f56867c == null) {
                    this.f56867c = new C4254ho();
                }
                codedInputByteBufferNano.readMessage(this.f56867c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f56868d == null) {
                    this.f56868d = new C4279io();
                }
                codedInputByteBufferNano.readMessage(this.f56868d);
            }
        }
    }

    public static C4228go b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4228go().mergeFrom(codedInputByteBufferNano);
    }

    public static C4228go a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4228go) MessageNano.mergeFrom(new C4228go(), bArr);
    }
}
