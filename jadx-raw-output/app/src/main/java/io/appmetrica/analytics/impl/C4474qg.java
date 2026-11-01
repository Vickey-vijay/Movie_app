package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4474qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oa f57569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4349lg f57570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ma f57571c;

    public final void a(@Nullable C4424og c4424og) {
        if (this.f57569a.a(c4424og)) {
            this.f57570b.a(c4424og);
            this.f57571c.a();
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final InterfaceC4349lg b() {
        return this.f57570b;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final Ma c() {
        return this.f57571c;
    }

    public C4474qg(Oa oa2, InterfaceC4349lg interfaceC4349lg, Ma ma2) {
        this.f57569a = oa2;
        this.f57570b = interfaceC4349lg;
        this.f57571c = ma2;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final Oa a() {
        return this.f57569a;
    }
}
