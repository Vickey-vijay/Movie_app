package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4134d7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4108c7 f56573a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4134d7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C4159e7 c4159e7) {
        return MessageNano.toByteArray(this.f56573a.fromModel(c4159e7));
    }

    public C4134d7(C4108c7 c4108c7) {
        this.f56573a = c4108c7;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f56573a.fromModel((C4159e7) obj));
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4159e7 toModel(byte[] bArr) {
        C4390n7 c4390n7;
        if (bArr != null) {
            try {
                c4390n7 = (C4390n7) MessageNano.mergeFrom(new C4390n7(), bArr);
                if (c4390n7 == null) {
                    c4390n7 = new C4390n7();
                }
            } catch (InvalidProtocolBufferNanoException unused) {
                c4390n7 = new C4390n7();
            }
        } else {
            c4390n7 = new C4390n7();
        }
        return this.f56573a.toModel(c4390n7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4134d7(C4108c7 c4108c7, int i10, ck.i iVar) {
        if ((i10 & 1) != 0) {
            c4108c7 = new C4108c7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(c4108c7);
    }
}
