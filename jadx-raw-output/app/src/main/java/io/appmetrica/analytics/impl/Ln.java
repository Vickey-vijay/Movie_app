package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* JADX INFO: loaded from: classes6.dex */
public final class Ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F3 f55530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eo f55531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f55532c;

    public Ln(Toggle toggle) {
        F3 f10 = new F3(C4418oa.k().y());
        this.f55530a = f10;
        Eo eo2 = new Eo();
        this.f55531b = eo2;
        Toggle[] toggleArr = new Toggle[3];
        toggleArr[0] = f10;
        toggleArr[1] = eo2;
        toggleArr[2] = toggle == null ? new wo() : toggle;
        this.f55532c = new ConjunctiveCompositeThreadSafeToggle(nj.s.n(toggleArr), "loc-def");
    }
}
