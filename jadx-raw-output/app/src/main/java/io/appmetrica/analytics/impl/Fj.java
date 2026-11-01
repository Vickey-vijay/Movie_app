package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class Fj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uj f55241a;

    public Fj(Uj uj2) {
        this.f55241a = uj2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        Tj tjA = ((C4191fd) this.f55241a).a();
        if (tjA != null) {
            sa2.reportEvent(tjA.f55929a, tjA.f55930b);
        }
    }
}
