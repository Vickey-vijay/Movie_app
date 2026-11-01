package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import mj.r;
import rj.c;

/* JADX INFO: compiled from: OfferwallManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface OfferwallManager {
    Object getVersion(c<? super String> cVar);

    Object isAdReady(String str, c<? super Boolean> cVar);

    Object isConnected(c<? super Boolean> cVar);

    Object loadAd(String str, c<? super r> cVar);

    qk.c<OfferwallEventData> showAd(String str);
}
