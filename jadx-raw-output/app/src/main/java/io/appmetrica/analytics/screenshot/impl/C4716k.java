package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4716k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f58438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58439c;

    public C4716k(boolean z10, List list, long j10) {
        this.f58437a = z10;
        this.f58438b = list;
        this.f58439c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(C4716k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C4716k c4716k = (C4716k) obj;
        return this.f58437a == c4716k.f58437a && ck.p.e(this.f58438b, c4716k.f58438b) && this.f58439c == c4716k.f58439c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58439c) + ((this.f58438b.hashCode() + (Boolean.hashCode(this.f58437a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f58437a + ", mediaStoreColumnNames=" + this.f58438b + ", detectWindowSeconds=" + this.f58439c + ')';
    }

    public C4716k(B b10) {
        this(b10.b(), b10.c(), b10.a());
    }
}
