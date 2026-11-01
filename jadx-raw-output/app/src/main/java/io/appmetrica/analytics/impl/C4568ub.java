package io.appmetrica.analytics.impl;

import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4568ub implements Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia f57761a;

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, String str2) {
        this.f57761a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, long j10) {
        this.f57761a.a(str, j10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b() {
        this.f57761a.b();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean getBoolean(String str, boolean z10) {
        return this.f57761a.getBoolean(str, z10);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final int getInt(String str, int i10) {
        return this.f57761a.getInt(str, i10);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final long getLong(String str, long j10) {
        return this.f57761a.getLong(str, j10);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final String getString(String str, String str2) {
        return this.f57761a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia remove(String str) {
        this.f57761a.remove(str);
        return this;
    }

    public C4568ub(Ia ia2) {
        this.f57761a = ia2;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(int i10, String str) {
        this.f57761a.a(i10, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, boolean z10) {
        this.f57761a.a(str, z10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, float f10) {
        this.f57761a.a(str, f10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean a(String str) {
        return this.f57761a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Set a() {
        return this.f57761a.a();
    }
}
