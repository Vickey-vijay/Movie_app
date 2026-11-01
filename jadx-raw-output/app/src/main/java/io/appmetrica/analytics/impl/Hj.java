package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class Hj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f55314b;

    public Hj(String str, byte[] bArr) {
        this.f55313a = str;
        this.f55314b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.setSessionExtra(this.f55313a, this.f55314b);
    }
}
