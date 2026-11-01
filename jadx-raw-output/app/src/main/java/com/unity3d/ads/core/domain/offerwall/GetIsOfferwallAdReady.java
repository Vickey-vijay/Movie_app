package com.unity3d.ads.core.domain.offerwall;

import ck.p;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import rj.c;

/* JADX INFO: compiled from: GetIsOfferwallAdReady.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GetIsOfferwallAdReady {
    private final OfferwallManager offerwallManager;

    public GetIsOfferwallAdReady(OfferwallManager offerwallManager) {
        p.j(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, c<? super Boolean> cVar) {
        return this.offerwallManager.isAdReady(str, cVar);
    }
}
