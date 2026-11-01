package com.ironsource;

import com.ironsource.AbstractC3659q3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class N4<Smash extends AbstractC3659q3<?>> extends Lg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(int i10, boolean z10, List<? extends Smash> list) {
        super(i10, z10, list);
        ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
    }

    @Override // com.ironsource.Lg
    public void c(Smash smash) {
        ck.p.j(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
