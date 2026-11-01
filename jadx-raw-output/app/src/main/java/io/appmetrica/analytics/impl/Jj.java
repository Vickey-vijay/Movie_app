package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Jj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f55438a;

    public Jj(Map map) {
        this.f55438a = map;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportAnr(this.f55438a);
    }
}
