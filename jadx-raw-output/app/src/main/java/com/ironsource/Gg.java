package com.ironsource;

import com.ironsource.AbstractC3659q3;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Gg<Smash extends AbstractC3659q3<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lg<Smash> f26681a;

    public Gg(Lg<Smash> lg2) {
        ck.p.j(lg2, "smashPicker");
        this.f26681a = lg2;
    }

    public final List<Smash> a() {
        return this.f26681a.c();
    }

    public final boolean b() {
        return this.f26681a.c().isEmpty() && this.f26681a.a().isEmpty();
    }

    public final boolean c() {
        return this.f26681a.d() == 0;
    }
}
