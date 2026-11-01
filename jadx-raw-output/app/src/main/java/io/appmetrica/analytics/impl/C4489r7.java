package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4489r7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4465q7 f57592a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4489r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C4514s7 c4514s7) {
        return MessageNano.toByteArray(this.f57592a.fromModel(c4514s7));
    }

    public C4489r7(C4465q7 c4465q7) {
        this.f57592a = c4465q7;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f57592a.fromModel((C4514s7) obj));
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4514s7 toModel(byte[] bArr) {
        C4440p7 c4440p7;
        if (bArr != null) {
            try {
                c4440p7 = (C4440p7) MessageNano.mergeFrom(new C4440p7(), bArr);
                if (c4440p7 == null) {
                    c4440p7 = new C4440p7();
                }
            } catch (InvalidProtocolBufferNanoException unused) {
                c4440p7 = new C4440p7();
            }
        } else {
            c4440p7 = new C4440p7();
        }
        return this.f57592a.toModel(c4440p7);
    }

    public /* synthetic */ C4489r7(C4465q7 c4465q7, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new C4465q7(null, 1, null) : c4465q7);
    }
}
