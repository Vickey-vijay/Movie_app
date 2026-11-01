package io.appmetrica.analytics.impl;

import androidx.work.WorkRequest;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4629wm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4629wm[] f57897b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f57898a;

    public static C4629wm[] b() {
        if (f57897b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57897b == null) {
                    f57897b = new C4629wm[0];
                }
            }
        }
        return f57897b;
    }

    public final C4629wm a() {
        this.f57898a = WorkRequest.MAX_BACKOFF_MILLIS;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f57898a);
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4629wm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4629wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f57898a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f57898a) + super.computeSerializedSize();
    }

    public static C4629wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4629wm) MessageNano.mergeFrom(new C4629wm(), bArr);
    }

    public static C4629wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4629wm().mergeFrom(codedInputByteBufferNano);
    }
}
