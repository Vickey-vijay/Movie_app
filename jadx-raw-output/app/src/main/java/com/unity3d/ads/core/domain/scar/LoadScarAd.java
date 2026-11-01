package com.unity3d.ads.core.domain.scar;

import ck.p;
import com.unity3d.ads.core.data.manager.ScarManager;
import mj.r;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: LoadScarAd.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class LoadScarAd {
    private final ScarManager scarManager;

    public LoadScarAd(ScarManager scarManager) {
        p.j(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, int i10, c<? super r> cVar) {
        if (p.e(str, "banner")) {
            return r.f64562a;
        }
        Object objLoadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i10, cVar);
        return objLoadAd == a.f() ? objLoadAd : r.f64562a;
    }
}
