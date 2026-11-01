package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4721p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f58455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58456c;

    public C4721p(boolean z10, List list, long j10) {
        this.f58454a = z10;
        this.f58455b = list;
        this.f58456c = j10;
    }

    public final long a() {
        return this.f58456c;
    }

    public final boolean b() {
        return this.f58454a;
    }

    public final List c() {
        return this.f58455b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f58454a + ", mediaStoreColumnNames='" + this.f58455b + "', detectWindowSeconds=" + this.f58456c + ')';
    }

    public C4721p() {
        this(new O().f58384a, nj.n.q0(new O().f58386c), new O().f58385b);
    }
}
