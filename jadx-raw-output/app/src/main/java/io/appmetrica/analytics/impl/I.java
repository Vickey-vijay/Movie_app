package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;

/* JADX INFO: loaded from: classes9.dex */
public final class I implements Savable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f55332a;

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f55332a.f55367a.a(false));
    }

    public I(J j10) {
        this.f55332a = j10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z10) {
        this.f55332a.f55367a.e(z10);
    }
}
