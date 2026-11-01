package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class Dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55151a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dm) && this.f55151a == ((Dm) obj).f55151a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55151a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f55151a + ')';
    }

    public Dm(int i10) {
        this.f55151a = i10;
    }
}
