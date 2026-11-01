package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes.dex */
public final class Pj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55745b;

    public Pj(String str, String str2) {
        this.f55744a = str;
        this.f55745b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportEvent(this.f55744a, this.f55745b);
    }
}
