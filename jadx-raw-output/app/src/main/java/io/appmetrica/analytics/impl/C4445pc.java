package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4445pc implements InterfaceC4349lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4470qc f57504a;

    public C4445pc(C4470qc c4470qc) {
        this.f57504a = c4470qc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4349lg
    public final void a(@Nullable C4424og c4424og) {
        if (c4424og == null) {
            return;
        }
        Q5 q10 = new Q5("", "", 0);
        q10.setValueBytes(c4424og.a());
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q10.f55776d = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        this.f57504a.a(q10);
    }
}
