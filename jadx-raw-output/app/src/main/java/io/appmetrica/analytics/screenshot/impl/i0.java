package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f58432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58433c;

    public i0(boolean z10, List list, long j10) {
        this.f58431a = z10;
        this.f58432b = list;
        this.f58433c = j10;
    }

    public final long a() {
        return this.f58433c;
    }

    public final boolean b() {
        return this.f58431a;
    }

    public final List c() {
        return this.f58432b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f58431a + ", mediaStoreColumnNames=" + this.f58432b + ", detectWindowSeconds=" + this.f58433c + ')';
    }

    public i0(C4721p c4721p) {
        this(c4721p.b(), c4721p.c(), c4721p.a());
    }
}
