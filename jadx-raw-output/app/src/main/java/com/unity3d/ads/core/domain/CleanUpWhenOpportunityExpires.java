package com.unity3d.ads.core.domain;

import bk.l;
import ck.p;
import com.unity3d.ads.core.data.model.AdObject;
import kotlinx.coroutines.d;
import kotlinx.coroutines.g;
import mj.r;
import nk.h0;
import nk.i0;
import nk.j;
import nk.j2;
import nk.l0;
import nk.t1;

/* JADX INFO: compiled from: CleanUpWhenOpportunityExpires.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CleanUpWhenOpportunityExpires {
    private final i0 coroutineExceptionHandler;
    private final l0 coroutineScope;

    public CleanUpWhenOpportunityExpires(h0 h0Var) {
        p.j(h0Var, "defaultDispatcher");
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(i0.F8);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = d.a(j2.b(null, 1, null).plus(h0Var).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(AdObject adObject) {
        p.j(adObject, "adObject");
        if (adObject.getAdPlayer() == null) {
            throw new IllegalArgumentException("AdObject does not have an adPlayer.".toString());
        }
        final g gVarD = j.d(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3, null);
        t1.j(adObject.getAdPlayer().getScope().getCoroutineContext()).F(new l<Throwable, r>() { // from class: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke.2
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                g.a.a(gVarD, null, 1, null);
            }
        });
    }
}
