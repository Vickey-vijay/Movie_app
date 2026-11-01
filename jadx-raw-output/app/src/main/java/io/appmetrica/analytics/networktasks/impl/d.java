package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f58244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58245b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f58245b.equals(((d) obj).f58245b);
    }

    public final int hashCode() {
        return this.f58245b.hashCode();
    }

    public d(NetworkTask networkTask) {
        this.f58244a = networkTask;
        this.f58245b = networkTask.description();
    }
}
