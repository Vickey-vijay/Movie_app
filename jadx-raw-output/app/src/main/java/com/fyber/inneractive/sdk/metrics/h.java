package com.fyber.inneractive.sdk.metrics;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15861a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15862b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f15861a.equals(((h) obj).f15861a);
    }

    public final int hashCode() {
        return this.f15861a.hashCode();
    }

    public h(String str) {
        this.f15862b = str;
    }
}
