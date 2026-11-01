package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes10.dex */
public final class K implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f58377a;

    /* JADX WARN: Multi-variable type inference failed */
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(J j10) {
        return MessageNano.toByteArray(this.f58377a.fromModel(j10));
    }

    public K(M m10) {
        this.f58377a = m10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(byte[] bArr) {
        S s10;
        try {
            s10 = (S) MessageNano.mergeFrom(new S(), bArr);
        } catch (Throwable unused) {
            s10 = new S();
        }
        return this.f58377a.toModel(s10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f58377a.fromModel((J) obj));
    }

    public /* synthetic */ K(M m10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new M(null, 1, null) : m10);
    }
}
