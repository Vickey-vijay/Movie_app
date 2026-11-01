package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes10.dex */
public final class M implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f58380a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(J j10) {
        S s10 = new S();
        s10.f58395a = j10.f58375a;
        W w10 = j10.f58376b;
        s10.f58396b = w10 != null ? this.f58380a.fromModel(w10) : null;
        return s10;
    }

    public M(Y y10) {
        this.f58380a = y10;
    }

    public /* synthetic */ M(Y y10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new Y(null, null, null, 7, null) : y10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(S s10) {
        return new J(s10.f58395a, this.f58380a.toModel(s10.f58396b));
    }
}
