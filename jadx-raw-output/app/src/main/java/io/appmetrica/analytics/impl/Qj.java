package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Qj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f55808b;

    public Qj(String str, Map map) {
        this.f55807a = str;
        this.f55808b = map;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportEvent(this.f55807a, this.f55808b);
    }
}
