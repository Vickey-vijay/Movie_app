package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import mj.r;
import qk.c;

/* JADX INFO: compiled from: Show.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface Show {
    c<ShowEvent> invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions);

    Object terminate(AdObject adObject, rj.c<? super r> cVar);
}
