package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4701zj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f58056a;

    public C4701zj(boolean z10) {
        this.f58056a = z10;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.setDataSendingEnabled(this.f58056a);
    }
}
