package com.unity3d.ads.core.domain.offerwall;

import ck.p;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import mj.r;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: LoadOfferwallAd.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        p.j(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, c<? super r> cVar) {
        Object objLoadAd = this.offerwallManager.loadAd(str, cVar);
        return objLoadAd == a.f() ? objLoadAd : r.f64562a;
    }
}
